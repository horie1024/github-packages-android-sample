package com.horie1024.mylibrary

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyLibraryViewModel : ViewModel() {

    private val _event: MutableLiveData<Event> = MutableLiveData()
    val event: LiveData<Event> = _event

    init {
        _event.value = Event.Initialized
    }

    sealed class Event {
        object Initialized : Event()
    }
}
