package vcmsa.ci.musicplaylistmanager

import android.annotation.SuppressLint


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.view.View.inflate
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import android.widget.EditText
import android.widget.RatingBar

private val Any.androidx: Any
    get() {}

class MainActivity : AppCompatActivity() {
    // Parallel arrays to store playlist data
    private val songTitles = ArrayList<String>()
    private val artistNames = ArrayList<String>()
    private val songRatings = ArrayList<Int>()
    private val songComments = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// Set up button click listeners
        findViewById<Button>(R.id.addbutton).setOnClickListener { showAddSongDialog() }

        findViewById<Button>(R.id.nextbutton).setOnClickListener {
            if (songTitles.isEmpty()) {
                Toast.makeText(this, "Playlist is empty!", Toast.LENGTH_SHORT).show()
            } else {
                navigateToPlaylistScreen()
            }
        }

        findViewById<Button>(R.id.exitbutton).setOnClickListener {
            finish()
        }
    }

    private fun navigateToPlaylistScreen() {
        TODO("Not yet implemented")
    }

    private fun showAddSongDialog() {
        TODO("Not yet implemented")
    }


    private fun Song(title: String, artist: String, rating: Int, comments: String) {
        // Sample data
        val sampleSongs = listOf(
            Song("Blinding Lights", "The Weeknd", 4, "Great dance song"),
            Song("Save Your Tears", "The Weeknd", 5, "Best love song"),
            Song("Starboy", "The Weeknd", 3, "Memories from college"),
            Song("Take My Breath", "The Weeknd", 2, "Good workout song")
        )

    }



    data class Song(
        val title: String,
        val artist: String,
        val rating: Int,
        val comments: String,













        @SuppressLint("MissingInflatedId")
        fun showAddSongDialog( {

    }

    val dialogView: View = layoutInflater.androidx.androidx.foundation.layout.Box {
        inflate(R.layout.dialog_add_song, null)
    }

    private fun inflate(dialogAddSong: Int, nothing: Nothing?): View? {

    }

    val etSongTitle: EditText? = dialogView.findViewById<EditText>(R.id.txtsong)
    val etArtistName = dialogView.findViewById<EditText>(R.id.txtname)
    val ratingBar = dialogView.findViewById<RatingBar>(R.id.txtrating)
    val etComments = dialogView.findViewById<EditText>(R.id.txtcomment)

    val show: AlertDialog = AlertDialog.Builder(this)
        .setTitle("Add New Song to Playlist")
        .setView(dialogView)
        .setPositiveButton("Add") { _, _ ->
            val title = etSongTitle.text.toString().trim()
            val artist = etArtistName.text.toString().trim()
            val rating = ratingBar.rating.toInt()
            val comments = etComments.text.toString().trim()

            if (title.isEmpty() || artist.isEmpty()) {
                Toast.makeText(this, "Song title and artist are required!", Toast.LENGTH_SHORT)
                    .show()
            } else {
                addSong(title, artist, rating, comments)
                Toast.makeText(this, "Song added successfully!", Toast.LENGTH_SHORT).show()
            }
        }
        .setNegativeButton("Cancel", null)
        .show()

    private fun addSong(title: String, artist: String, rating: Int, comments: String) {
        TODO("Not yet implemented")
    }
}
















