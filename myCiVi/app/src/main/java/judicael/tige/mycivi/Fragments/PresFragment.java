package judicael.tige.mycivi.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import judicael.tige.mycivi.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PresFragment extends Fragment {

    private TextView mTextView;
    public static PresFragment newInstance() {
        return (new PresFragment());
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_pres, container, false);
        mTextView = (TextView) view.findViewById(R.id.fragment_pres_txt);
        String textPres = "<p>" +
                "Travaillant depuis 2010 au sein du groupe BNP Paribas, je dispose d'appétences pour la technique et l'informatique bancaire. \n" +
                "Je suis actuellement un programme de formation visant à devenir de développeur - concepteur dans des technologies Open au sein de BNP Paribas.\n" +
                "C'est grâce à ce programme que j'ai mis en application les compétences acquises pour décliner mon CV sous la forme d'un site Web et d'une application Android.\n" +
                "</p>";
//        String html = "<p>Test de code HTML avec un <a href='http://www.throrinstudio.com'>lien</a>. <b>Et un texte en gras</b></p>";
        mTextView.setText(Html.fromHtml(textPres));
/*        mTextView.setText("Travaillant depuis 2010 au sein du groupe BNP Paribas, " +
                                  "je dispose d'appétences pour la technique et l'informatique bancaire.\n" +
                                  "Je suis actuellement un programme de formation visant à devenir de développeur - concepteur dans des technologies Open au sein de BNP Paribas.\n" +
                                  "C'est grâce à ce programme que j'ai mis en application les compétences acquises pour décliner mon CV sous la forme d'une application Android");
*/


        return view;
    }
}
