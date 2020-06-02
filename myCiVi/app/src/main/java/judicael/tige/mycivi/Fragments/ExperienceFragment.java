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
public class ExperienceFragment extends Fragment {

    private TextView mTextViewPcs;
    private TextView mTextViewPcsDetail;
    private TextView mTextViewBnpp_1;
    private TextView mTextViewBnpp_1Detail;
    private TextView mTextViewMedit;
    private TextView mTextViewMeditDetail;
    private TextView mTextViewBnpp_2;
    private TextView mTextViewBnpp_2Detail;
    private TextView mTextViewCgi;
    private TextView mTextViewCgiDetail;

    private String sTextHtml;
    public static ExperienceFragment newInstance() {
        return (new ExperienceFragment());
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_experience, container, false);

        mTextViewPcs = (TextView) view.findViewById(R.id.partecis_txt);
        mTextViewPcsDetail = (TextView) view.findViewById(R.id.partecis_detail);
        mTextViewBnpp_1 = (TextView) view.findViewById(R.id.bnpp_1_txt);
        mTextViewBnpp_1Detail = (TextView) view.findViewById(R.id.bnpp_1_detail);
        mTextViewMedit = (TextView) view.findViewById(R.id.medit_txt);
        mTextViewMeditDetail = (TextView) view.findViewById(R.id.medit_detail);
        mTextViewBnpp_2 = (TextView) view.findViewById(R.id.bnpp_2_txt);
        mTextViewBnpp_2Detail = (TextView) view.findViewById(R.id.bnpp_2_detail);
        mTextViewCgi = (TextView) view.findViewById(R.id.cgi_txt);
        mTextViewCgiDetail = (TextView) view.findViewById(R.id.cgi_detail);

        //Expérience Partecis
        sTextHtml = "<h3>Product Owner Monétique</h3>"+
                "<h4>Avril 2017 à Février 2020</h4>"+
							"<h5>Charenton-le-Pont</h5>";
        mTextViewPcs.setText(Html.fromHtml(sTextHtml));
        sTextHtml="<u>Fonctions occupées :</u> Responsable patrimoine puis Product Owner d'une équipe de 12 personnes au sein du domaine acquisition des transactions monétiques.";
        mTextViewPcsDetail.setText(Html.fromHtml(sTextHtml));

        //Expérience BDDF IT
        sTextHtml="<h3>Chef de projet/Expert technique</h3>" +
                "<h4>Avril 2017 à Février 2020</h4>" +
                "<h5>Montreuil</h5>";
        mTextViewBnpp_1.setText(Html.fromHtml(sTextHtml));
        sTextHtml="<u>Fonctions occupées :</u> Chef de projet, Expert technique Mainframe, Responsable formations Open/Mainframe.";
        mTextViewBnpp_1Detail.setText(Html.fromHtml(sTextHtml));

        //Experience Medit
        sTextHtml="<h3>Manager technique</h3>" +
                "<h4>Novembre 2013 à Avril 2016</h4>" +
                "<h5>Casablanca (Maroc)</h5>";
        mTextViewMedit.setText(Html.fromHtml(sTextHtml));
        sTextHtml="<u>Fonctions occupées :</u> Responsable cellule technique Mainframe, Responsable formations Mainframe, Chef de projet informatique.";
        mTextViewMeditDetail.setText(Html.fromHtml(sTextHtml));

        //Expérience DSI BDDF
        sTextHtml="<h3>Chef de projet informatique</h3>" +
                "<h4>Avril 2010 à Novembre 2013</h4>" +
                "<h5>Montreuil</h5>";
        mTextViewBnpp_2.setText(Html.fromHtml(sTextHtml));
        sTextHtml="<u>Fonctions occupées :</u> Chef de projet, Responsable d'applications, Expertise Workflow.";
        mTextViewBnpp_2Detail.setText(Html.fromHtml(sTextHtml));

        //Expérience CGI
        sTextHtml="<h3>Ingénieur analyse</h3>" +
                "<h4>Juin 2007 à Avril 2010</h4>" +
                "<h5>Mérignac</h5>";
        mTextViewCgi.setText(Html.fromHtml(sTextHtml));
        sTextHtml="<u>Fonctions occupées :</u> Responsable d'applications Workflow, Responsable GCL.";
        mTextViewCgiDetail.setText(Html.fromHtml(sTextHtml));

        return view;

    }
}
