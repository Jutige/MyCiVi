package judicael.tige.mycivi.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import judicael.tige.mycivi.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FormationFragment extends Fragment {

    public static FormationFragment newInstance() {
        return (new FormationFragment());
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_formation, container, false);
    }
}
