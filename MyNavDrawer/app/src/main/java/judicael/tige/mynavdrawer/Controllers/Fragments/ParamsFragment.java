package judicael.tige.mynavdrawer.Controllers.Fragments;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import judicael.tige.mynavdrawer.R;

/**
 * Created by Philippe on 20/11/2017.
 */

public class ParamsFragment extends Fragment {

    public static ParamsFragment newInstance() {
        return (new ParamsFragment());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_params, container, false);
    }
}