package judicael.tige.mycivi.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import judicael.tige.mycivi.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class InfosFragment extends Fragment {

//    private TextView mTextInfosPersos;
//    private TextView mTextAdresse;
//    private TextView mTextDateNaiss;
    private TextView mTextMail;
//    private TextView mTextPhone;




    public static Fragment newInstance() {
        return (new InfosFragment());
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_infos, container, false);

        //récupération des textview
//        mTextInfosPersos = (TextView) view.findViewById(R.id.infos_generales);
//        mTextAdresse = (TextView) view.findViewById(R.id.infos_adresse);
//        mTextDateNaiss = (TextView) view.findViewById(R.id.infos_date_naissance);
        mTextMail = (TextView) view.findViewById(R.id.infos_mail);
//        mTextPhone = (TextView) view.findViewById(R.id.infos_phone);

        //alimentation du contenu des textview
        mTextMail.setText(Html.fromHtml("<a href='mailto:caludije@gmail.com?subject=Au%20sujet%20de%20votre%20CV'>caludije@gmail.com</a>"));
        mTextMail.setMovementMethod(LinkMovementMethod.getInstance());
        mTextMail.setClickable(true);
//        mTextPhone.setText(Html.fromHtml("<a href='tel:+33750677245'>07 50 67 72 45</a>"));
//        mTextPhone.setMovementMethod(LinkMovementMethod.getInstance());
//        mTextPhone.setClickable(true);

        return view;
    }
}
