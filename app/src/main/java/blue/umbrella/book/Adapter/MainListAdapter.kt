package blue.umbrella.book.Adapter

import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import blue.umbrella.book.Network.MainData
import blue.umbrella.book.R
import blue.umbrella.book.Ui.DetailActivity
import blue.umbrella.book.databinding.ModelMainListBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.google.android.material.snackbar.Snackbar

class MainListAdapter : RecyclerView.Adapter<MainListAdapter.MListVH>() {

    private val listMain = ArrayList<MainData>()

    fun addData(items : List<MainData>){
        listMain.clear()
        listMain.addAll(items)
        notifyDataSetChanged()
    }

    inner class MListVH(private val binding : ModelMainListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(list: MainData) {
            binding.run {

                //bind data to ui
                var requestOptions = RequestOptions()
                requestOptions = requestOptions.transform(CenterCrop(), RoundedCorners(12))

                Glide
                    .with(binding.root)
                    .load(list.attributes?.posterImage?.medium)
                    .apply(requestOptions)
                    .placeholder(R.drawable.ic_load)
                    .into(binding.ivList)

                tvList.text = list.attributes?.titles?.enJp
                tvRating.text = list.attributes?.averageRating
                tvUserCount.text = list.attributes?.userCount.toString()
                tvListAuth.text = list.attributes?.serialization
                tvStatus.text = list.attributes?.status

                addMark.setOnClickListener {
                    Snackbar.make(root, "Add to Bookmark", Snackbar.LENGTH_LONG).show()
                    addMark.setColorFilter(Color.parseColor("#787878"))
                }

                val showStatus = list.attributes?.status
                if (showStatus == "current"){
                    icStatus.setColorFilter(Color.parseColor("#29D930"))
                } else if (showStatus == "finished") {
                    icStatus.setColorFilter(Color.parseColor("#20AEDB"))
                } else if (showStatus == "tba"){
                    icStatus.setColorFilter(Color.parseColor("#DB2020"))
                } else if (showStatus == "unreleased"){
                    icStatus.setColorFilter(Color.parseColor("#CCDB20"))
                } else if (showStatus == "upcoming") {
                    icStatus.setColorFilter(Color.parseColor("#787878"))
                } else {
                    icStatus.setColorFilter(Color.parseColor("#E98E45"))
                }

                root.setOnClickListener {
                    val intent = Intent(it.context, DetailActivity::class.java).apply {
                        putExtra("Rating", list.attributes?.averageRating)
                        putExtra("User", list.attributes?.userCount)
                        putExtra("Chapter", list.attributes?.chapterCount)
                        putExtra("Image", list.attributes?.posterImage?.medium)
                        putExtra("Name", list.attributes?.titles?.enJp)
                        putExtra("Desc", list.attributes?.description)
                        putExtra("Author", list.attributes?.serialization)
                    }
                    it.context.startActivity(intent)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainListAdapter.MListVH {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ModelMainListBinding.inflate(layoutInflater, parent, false)
        return MListVH(binding)
    }

    override fun onBindViewHolder(holder: MainListAdapter.MListVH, position: Int) {
        val item = listMain[position]

        holder.bind(item)

    }

    override fun getItemCount(): Int {
        return listMain.size
    }

}