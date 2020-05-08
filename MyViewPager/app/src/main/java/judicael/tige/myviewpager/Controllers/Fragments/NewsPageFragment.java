package judicael.tige.myviewpager.Controllers.Fragments;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import judicael.tige.myviewpager.R;

/**
 * Created by Philippe on 17/11/2017.
 */

public class NewsPageFragment extends Fragment {

    public static NewsPageFragment newInstance() {
        return (new NewsPageFragment());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_page_news, container, false);
    }
}
