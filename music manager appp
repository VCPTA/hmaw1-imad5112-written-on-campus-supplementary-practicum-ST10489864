package vcmsa.ci.musicplaylistmanager

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowInsetsCompat

private val Displaysonglist:Button? = null
private val Playlist:TextView? = null
private val Displayaveragerating:Button? = null
private val Rating:TextView? = null
private val Return:Button? = null


}

class PlaylistActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playlist)

// Retrieve data from intent
        val songTitles = intent.getStringArrayExtra("SONG_TITLES") ?: arrayOf()
        val artistNames = intent.getStringArrayExtra("ARTIST_NAMES") ?: arrayOf()
        val songRatings = intent.getIntArrayExtra("SONG_RATINGS") ?: intArrayOf()
        val songComments = intent.getStringArrayExtra("SONG_COMMENTS") ?: arrayOf()

        val tvPlaylist = findViewById<TextView>(R.id.Playlist)

        findViewById<Button>(R.id.displaybutton).setOnClickListener {
            displayPlaylist(tvPlaylist, songTitles, artistNames, songRatings, songComments)
        }

        findViewById<Button>(R.id.averagebutton).setOnClickListener {
            calculateAverageRating(tvPlaylist, songRatings)
        }

        findViewById<Button>(R.id.returnbutton).setOnClickListener {
            finish()
        }
    }

    private fun displayPlaylist(
        textView: TextView,
        titles: Array<String>,
        artists: Array<String>,
        ratings: IntArray,
        comments: Array<String>
    ) {
        if (titles.isEmpty()) {
            textView.text = "No songs in playlist!"
            return
        }

        val sb = StringBuilder("Playlist:\n\n")
        for (i in titles.indices) {
            sb.append("${i+1}. ${titles[i]} - ${artists[i]}\n")
            sb.append(" Rating: ${"★".repeat(ratings[i])}\n")
            if (comments[i].isNotEmpty()) {
                sb.append(" Comments: ${comments[i]}\n")
            }
            sb.append("\n")
        }
        textView.text = sb.toString()
    }

    private fun calculateAverageRating(textView: TextView, ratings: IntArray) {
        if (ratings.isEmpty()) {
            textView.text = "No ratings to calculate!"
            return
        }

        var total = 0
        for (rating in ratings) {
            total += rating
        }
        val average = total.toDouble() / ratings.size
        textView.text = String.format("Average Rating: %.1f/5", average)
    }
}







