package judicael.tige.mycivi.Fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import judicael.tige.mycivi.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoisirsFragment extends Fragment {

    public static Fragment newInstance() {
        return (new LoisirsFragment());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_loisirs, container, false);

        //Lancement d'une URL sur clic d'une image
        ImageView imgSquash = (ImageView) view.findViewById(R.id.img_squash);
        imgSquash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.ffsquash.com/fr/jouer-au-squash.html/"));
                startActivity(intent);
            }
        });

        //Lancement d'une URL sur clic d'une image
        ImageView imgLecture = (ImageView) view.findViewById(R.id.img_lecture);
        imgLecture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.albin-michel.fr/ouvrages/victime-2117-9782226396334"));
                startActivity(intent);
            }
        });

        //Lancement d'une URL sur clic d'une image
        ImageView imgClubSport = (ImageView) view.findViewById(R.id.img_club_sport);
        imgClubSport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.neoness.fr/"));
                startActivity(intent);
            }
        });


        return view;
    }
}
