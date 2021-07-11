package me.ervinforth.yardiecinema.models;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {
    private final MutableLiveData<Movie> selected = new MutableLiveData<Movie>();

    public void select(Movie item) {
        selected.setValue(item);
    }

    public LiveData<Movie> getSelected() {
        return selected;
    }
}
