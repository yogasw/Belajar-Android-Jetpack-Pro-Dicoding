package com.arioki.belajarandroidjetpackpro.render

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arioki.belajarandroidjetpackpro.R

class CourseReaderActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_COURSE_ID = "extra_course_id"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_reader)
    }
}
