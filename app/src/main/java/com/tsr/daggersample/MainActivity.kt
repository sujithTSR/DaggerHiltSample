package com.tsr.daggersample

import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named


// Android Entry point is required to use dagger injection. Making dagger know that
// this is an activity which might require dependencies

// Similar annotation for fragments is also required, alongside fragments,
// their parent activity also need to be annotated with the same one.

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {


    private val viewModel: ActivityViewModel by viewModels()
    // Inject will search in all of it's modules for a string dependency and inject the one
    // If more than 2 dependencies are returning the same type it'll be a problem for dagger to identify
    // Hence, @Named is helpful here

    @Inject @Named("String1")
    lateinit var injectedString: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel
        findViewById<TextView>(R.id.text_view).text = injectedString

    }
}