package com.example.recycerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.hellohasan.recyclerviewmultipleviewtype.PostData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val timelineRecyclerViewAdapter = TimelineRecyclerViewAdapter(getPostDataList())
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = timelineRecyclerViewAdapter
    }

    private fun getPostDataList() : List<PostData> {

        val postList = mutableListOf<PostData>()

        for (i in 1..5) {
            val postData1 = PostData(userName = "Yaseen khan", timeStamp = "9:23 AM, 23 Sep 2022", userProfilePhotoUrl = "https://i.imgur.com/L3J7Oge.jpg", postDescription = "This is my first project for recycler with multiple views on this platform. I have uploaded this awesome photo for your opinion. Have a good day", postImageUrl = "https://i.imgur.com/bZDLmPw.jpg")
            val postData2 = PostData(userName = "Abid", timeStamp = "9:12 AM, 20 Jan 2023", userProfilePhotoUrl = "https://i.imgur.com/zmJP4JM.png", postDescription = "It is better to lead from behind and to put others in front, especially when you celebrate victory when nice things occur. You take the front line when there is danger. Then people will appreciate your leadership. -[Nelson Mandela]", postImageUrl = "")
            val postData3 = PostData(userName = "Herry", timeStamp = "1:39 PM, 9 Nov 2022", userProfilePhotoUrl = "https://i.imgur.com/KvKTla7.png", postDescription = "It's lunch time!", postImageUrl = "https://i.imgur.com/L0X8CWb.jpg")

            postList.add(postData1)
            postList.add(postData2)
            postList.add(postData3)
        }

        return postList
    }
}
