package blue.umbrella.book.Adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.RoundedCorner
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import blue.umbrella.book.Network.Model.*
import blue.umbrella.book.R
import blue.umbrella.book.databinding.ModelTrendingBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.squareup.picasso.Picasso
import java.lang.System.load

class TrendingAdapter : RecyclerView.Adapter<TrendingAdapter.TrendingVH>() {

    private val listTrending = ArrayList<DataItem>()

    fun addData(items: List<DataItem>) {
        listTrending.clear()
        listTrending.addAll(items)
        notifyDataSetChanged()
    }

    inner class TrendingVH(private val binding : ModelTrendingBinding) : RecyclerView.ViewHolder(binding.root){
        @SuppressLint("UnsafeDynamicallyLoadedCode")
        fun bind(trend : PosterImage){
            binding.run {

                var requestOptions = RequestOptions()
                requestOptions = requestOptions.transform(CenterCrop(), RoundedCorners(12))

                Glide
                    .with(binding.root)
                    .load(trend.medium)
                    .apply(requestOptions)
                    .placeholder(R.drawable.ic_load)
                    .into(binding.ivTrending)

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrendingAdapter.TrendingVH {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ModelTrendingBinding.inflate(layoutInflater, parent, false)
        return TrendingVH(binding)
    }

    override fun onBindViewHolder(holder: TrendingAdapter.TrendingVH, position: Int) {
        val item = listTrending[position]
        item.attributes?.posterImage?.let {
            holder.bind(it)
        }
    }

    override fun getItemCount(): Int {
        return listTrending.size
    }

}