package com.tsr.daggersample

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class ActivityViewModel @Inject constructor(
     @Named("String2") val str: String
): ViewModel() {

    init {
        Log.v("ViewModel", str)
    }

}