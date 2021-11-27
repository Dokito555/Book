package blue.umbrella.book.Ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import blue.umbrella.book.databinding.ActivityDetailBinding
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.run {
            btnBack.setOnClickListener {
                val intent = Intent(this@DetailActivity, MainActivity::class.java)
                startActivity(intent)
                finish()
            }

            var getExtras : Bundle? = intent.extras

            val getTitle = getExtras!!.getString("Rating")
            tvRatingCount.text = getTitle

            val getName = getExtras!!.getString("Name")
            itemName.text = getName

            val getDesc = getExtras!!.getString("Desc")
            itemDesc.text = getDesc

            val getRating = getExtras!!.getString("Rating")
            tvRatingCount.text = getRating

            val getImage = getExtras!!.getInt("Image")
            Glide
                .with(binding.root)
                .load(getImage)
                .into(itemImg)

            val getChapter = getExtras!!.getInt("Chapter")
            tvChapterCount.text = getChapter.toString()

            val getSerialization = getExtras!!.getString("Author")
            itemAuthor.text = getSerialization

            val getUser = getExtras!!.getInt("User")
            tvUserCount.text = getUser.toString()

            supportActionBar!!.hide()

        }
    }
}