package judicael.tige.mycivi.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import judicael.tige.mycivi.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CompetenceFragment extends Fragment {

    private TextView mTextCompTechniques;
    private TextView mTextCompMainframe;
    private TextView mTextCompOpen;
    private TextView mTextMethodologie;
    private TextView mTextQualite;
    private TextView mTextModelisation;
    private TextView mTextAutreCompetence;
    private TextView mTextFoncBanc;
    private TextView mTextFormation;

    private String sTextHtml;

    public static CompetenceFragment newInstance() {
        return (new CompetenceFragment());
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_competence, container, false);

        //textview compétences techniques
        mTextCompTechniques = (TextView) view.findViewById(R.id.comp_techniques);
        mTextCompMainframe = (TextView) view.findViewById(R.id.comp_mainframe);
        mTextCompOpen = (TextView) view.findViewById(R.id.comp_open);

        //textview méthodologie
        mTextMethodologie = (TextView) view.findViewById(R.id.comp_methodo);
        mTextQualite = (TextView) view.findViewById(R.id.comp_qualite);
        mTextModelisation = (TextView) view.findViewById(R.id.comp_modelisation);

        //textview autres compétences
        mTextAutreCompetence = (TextView) view.findViewById(R.id.comp_AutresComp);
        mTextFoncBanc = (TextView) view.findViewById(R.id.comp_fonc_banc);
        mTextFormation = (TextView) view.findViewById(R.id.comp_formation);

        //compétences techniques
        sTextHtml="<h3>Compétences techniques </h3>";
        mTextCompTechniques.setText(Html.fromHtml(sTextHtml));

        //compétences mainframe
        sTextHtml="<h4>Mainframe : </h4>COBOL, JCL, DB2, IMS";
        mTextCompMainframe.setText(Html.fromHtml(sTextHtml));

        //compétences open
        sTextHtml="<h4>Open : </h4>Java, J2EE, HTML5, CSS3, AndroidX, Unix";
        mTextCompOpen.setText(Html.fromHtml(sTextHtml));

        //progessbar Mainframe
        ProgressBar progressMain=(ProgressBar) view.findViewById(R.id.progressbar_mainframe);
        progressMain.getLayoutParams().height = 100;
        progressMain.setProgress(100);
        progressMain.setIndeterminate(false);

        //progessbar Open
        ProgressBar progressOpen=(ProgressBar) view.findViewById(R.id.progressbar_open);
        progressOpen.getLayoutParams().height = 100;
        progressOpen.setProgress(30);
        progressOpen.setIndeterminate(false);

        //méthodologie
        sTextHtml="<h3>Méthodologie </h3>";
        mTextMethodologie.setText(Html.fromHtml(sTextHtml));

        //qualité
        sTextHtml="<h4>Qualité : </h4>CMMi3, Agile/Scrum";
        mTextQualite.setText(Html.fromHtml(sTextHtml));

        //modélisation
        sTextHtml="<h4>Modélisation : </h4>Merise, UML";
        mTextModelisation.setText(Html.fromHtml(sTextHtml));

        //progessbar qualité
        ProgressBar progressQualite=(ProgressBar) view.findViewById(R.id.progressbar_qualite);
        progressQualite.getLayoutParams().height = 100;
        progressQualite.setProgress(70);
        progressQualite.setIndeterminate(false);

        //progressbar modélisation
        ProgressBar progressModel=(ProgressBar) view.findViewById(R.id.progressbar_model);
        progressModel.getLayoutParams().height = 100;
        progressModel.setProgress(70);
        progressModel.setIndeterminate(false);

        //autres compétences
        sTextHtml="<h3>Autres compétences</h3>";
        mTextAutreCompetence.setText(Html.fromHtml(sTextHtml));

        //fonctionnel bancaire
        sTextHtml="<h4>Fonctionnel bancaire : </h4>Monétique, Workflow, GED, boucle GRC";
        mTextFoncBanc.setText(Html.fromHtml(sTextHtml));

        //formation
        sTextHtml="<h4>Formation : </h4>Formateur référence BNP Paribas";
        mTextFormation.setText(Html.fromHtml(sTextHtml));

        //progessbar fonctionnel bancaire
        ProgressBar progressFoncBanc=(ProgressBar) view.findViewById(R.id.progressbar_fonc_banc);
        progressFoncBanc.getLayoutParams().height = 100;
        progressFoncBanc.setProgress(80);
        progressFoncBanc.setIndeterminate(false);

        //progessbar fonctionnel bancaire
        ProgressBar progressFormation=(ProgressBar) view.findViewById(R.id.progressbar_form);
        progressFormation.getLayoutParams().height = 100;
        progressFormation.setProgress(80);
        progressFormation.setIndeterminate(false);

        return view;
    }
}
