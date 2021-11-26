package blue.umbrella.book.Ui.Fragments

import android.app.ProgressDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import blue.umbrella.book.Adapter.MainListAdapter
import blue.umbrella.book.Adapter.TrendingAdapter
import blue.umbrella.book.Network.Config
import blue.umbrella.book.Network.Model.Trending
import blue.umbrella.book.Network.Response
import blue.umbrella.book.databinding.FragmentHomeBinding
import retrofit2.Call
import retrofit2.Callback

class HomeFragment : Fragment() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<TrendingAdapter.TrendingVH>? = null
    private lateinit var binding: FragmentHomeBinding
    private lateinit var rvTopAdapter : TrendingAdapter
    private lateinit var rvMainAdapter : MainListAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvTopAdapter = TrendingAdapter()
        rvMainAdapter = MainListAdapter()

        val progressDialog = ProgressDialog(context)
        progressDialog.setTitle("Loading")
        progressDialog.setMessage("Getting Data")
        progressDialog.setCanceledOnTouchOutside(false)
        progressDialog.show()

        binding.run {

            //trending

            rvTop.apply {
                layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
                setHasFixedSize(true)
                adapter = rvTopAdapter
            }
            val call = Config.getManga().getTrending()
            call.enqueue(object : Callback<Trending>{

                override fun onResponse(call: Call<Trending>, response: retrofit2.Response<Trending>) {

                    progressDialog.dismiss()

                    response.body()?.data?.let {
                        rvTopAdapter.addData(it)
                    }
                }

                override fun onFailure(call: Call<Trending>, t: Throwable) {

                    progressDialog.dismiss()

                    Toast.makeText(context, t.message.toString(), Toast.LENGTH_LONG).show()
                }
            })

            //main List

            listRv.apply {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = rvMainAdapter
            }
            val mainCall = Config.getManga().getManga()
            mainCall.enqueue(object : Callback<Response>{

                override fun onResponse(
                    call: Call<Response>,
                    response: retrofit2.Response<Response>
                ) {

                    progressDialog.dismiss()

                    response.body()?.data?.let {
                        rvMainAdapter.addData(it)
                    }
                }

                override fun onFailure(call: Call<Response>, t: Throwable) {

                    progressDialog.dismiss()

                    Toast.makeText(context, t.message.toString(), Toast.LENGTH_LONG).show()
                }

            })

        }
    }
}