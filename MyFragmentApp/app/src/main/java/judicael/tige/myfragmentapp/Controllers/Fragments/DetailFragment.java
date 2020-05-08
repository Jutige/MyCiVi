package judicael.tige.myfragmentapp.Controllers.Fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import judicael.tige.myfragmentapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {

    private TextView textView;
    private int buttontag;
    public static final String KEY_BUTTONTAG = "judicael.tige.myfragmentapp.Controllers.Fragments.DetailFragment.KEY_BUTTONTAG";
    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail,container,false);
        // Inflate the layout for this fragment
        this.textView = (TextView) textView.findViewById(R.id.fragment_detail_text_view);
        return (view);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (savedInstanceState !=null) {
            int buttonTagRestored = savedInstanceState.getInt(KEY_BUTTONTAG,0);
            this.updateTextView(buttonTagRestored);
        }
    }

    public void onSaveInstanceState (Bundle outState) {
        super.onSaveInstanceState(outState);
        //sauvegarde du bouton
        outState.putInt(KEY_BUTTONTAG,buttontag);
    }

    public void updateTextView(int buttonTag) {
        this.buttontag = buttonTag;
        switch (buttonTag){
            case 10:
                this.textView.setText("1er bouton");
                break;
            case 20:
                this.textView.setText("2eme bouton");
                break;
            case 30:
                this.textView.setText("3eme bouton");
                break;
            default:
                break;
        }
    }

}
