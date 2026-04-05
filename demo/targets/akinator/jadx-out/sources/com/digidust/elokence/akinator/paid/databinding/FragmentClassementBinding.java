package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class FragmentClassementBinding implements a {
    public final Button buttonClassementHistoriquePodiums;
    public final TextView buttonClassementToday;
    public final TextView buttonClassementVeille;
    public final Button buttonVote;
    public final ImageView classementTitre;
    public final View espace;
    public final ProgressBar loadingBarClassement;
    public final RelativeLayout mainLayout;
    public final TextView messageErrorHistorique;
    private final RelativeLayout rootView;
    public final ScrollView scrollViewTopPlayers;
    public final LinearLayout tabClassement;
    public final TextView textFinDans;
    public final TextView textNbParticipant;
    public final TextView textTemps;
    public final Button whatIsAkiAward;
    public final LinearLayout zoneClassement;
    public final LinearLayout zoneMe;
    public final LinearLayout zoneTemps;
    public final LinearLayout zoneTopPlayers;

    private FragmentClassementBinding(RelativeLayout relativeLayout, Button button, TextView textView, TextView textView2, Button button2, ImageView imageView, View view, ProgressBar progressBar, RelativeLayout relativeLayout2, TextView textView3, ScrollView scrollView, LinearLayout linearLayout, TextView textView4, TextView textView5, TextView textView6, Button button3, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5) {
        this.rootView = relativeLayout;
        this.buttonClassementHistoriquePodiums = button;
        this.buttonClassementToday = textView;
        this.buttonClassementVeille = textView2;
        this.buttonVote = button2;
        this.classementTitre = imageView;
        this.espace = view;
        this.loadingBarClassement = progressBar;
        this.mainLayout = relativeLayout2;
        this.messageErrorHistorique = textView3;
        this.scrollViewTopPlayers = scrollView;
        this.tabClassement = linearLayout;
        this.textFinDans = textView4;
        this.textNbParticipant = textView5;
        this.textTemps = textView6;
        this.whatIsAkiAward = button3;
        this.zoneClassement = linearLayout2;
        this.zoneMe = linearLayout3;
        this.zoneTemps = linearLayout4;
        this.zoneTopPlayers = linearLayout5;
    }

    public static FragmentClassementBinding bind(View view) {
        int i10 = R.id.buttonClassementHistoriquePodiums;
        Button button = (Button) b.findChildViewById(view, R.id.buttonClassementHistoriquePodiums);
        if (button != null) {
            i10 = R.id.buttonClassementToday;
            TextView textView = (TextView) b.findChildViewById(view, R.id.buttonClassementToday);
            if (textView != null) {
                i10 = R.id.buttonClassementVeille;
                TextView textView2 = (TextView) b.findChildViewById(view, R.id.buttonClassementVeille);
                if (textView2 != null) {
                    i10 = R.id.buttonVote;
                    Button button2 = (Button) b.findChildViewById(view, R.id.buttonVote);
                    if (button2 != null) {
                        i10 = R.id.classementTitre;
                        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.classementTitre);
                        if (imageView != null) {
                            i10 = R.id.espace;
                            View viewFindChildViewById = b.findChildViewById(view, R.id.espace);
                            if (viewFindChildViewById != null) {
                                i10 = R.id.loadingBarClassement;
                                ProgressBar progressBar = (ProgressBar) b.findChildViewById(view, R.id.loadingBarClassement);
                                if (progressBar != null) {
                                    RelativeLayout relativeLayout = (RelativeLayout) view;
                                    i10 = R.id.messageErrorHistorique;
                                    TextView textView3 = (TextView) b.findChildViewById(view, R.id.messageErrorHistorique);
                                    if (textView3 != null) {
                                        i10 = R.id.scrollViewTopPlayers;
                                        ScrollView scrollView = (ScrollView) b.findChildViewById(view, R.id.scrollViewTopPlayers);
                                        if (scrollView != null) {
                                            i10 = R.id.tabClassement;
                                            LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.tabClassement);
                                            if (linearLayout != null) {
                                                i10 = R.id.textFinDans;
                                                TextView textView4 = (TextView) b.findChildViewById(view, R.id.textFinDans);
                                                if (textView4 != null) {
                                                    i10 = R.id.textNbParticipant;
                                                    TextView textView5 = (TextView) b.findChildViewById(view, R.id.textNbParticipant);
                                                    if (textView5 != null) {
                                                        i10 = R.id.textTemps;
                                                        TextView textView6 = (TextView) b.findChildViewById(view, R.id.textTemps);
                                                        if (textView6 != null) {
                                                            i10 = R.id.whatIsAkiAward;
                                                            Button button3 = (Button) b.findChildViewById(view, R.id.whatIsAkiAward);
                                                            if (button3 != null) {
                                                                i10 = R.id.zoneClassement;
                                                                LinearLayout linearLayout2 = (LinearLayout) b.findChildViewById(view, R.id.zoneClassement);
                                                                if (linearLayout2 != null) {
                                                                    i10 = R.id.zoneMe;
                                                                    LinearLayout linearLayout3 = (LinearLayout) b.findChildViewById(view, R.id.zoneMe);
                                                                    if (linearLayout3 != null) {
                                                                        i10 = R.id.zoneTemps;
                                                                        LinearLayout linearLayout4 = (LinearLayout) b.findChildViewById(view, R.id.zoneTemps);
                                                                        if (linearLayout4 != null) {
                                                                            i10 = R.id.zoneTopPlayers;
                                                                            LinearLayout linearLayout5 = (LinearLayout) b.findChildViewById(view, R.id.zoneTopPlayers);
                                                                            if (linearLayout5 != null) {
                                                                                return new FragmentClassementBinding(relativeLayout, button, textView, textView2, button2, imageView, viewFindChildViewById, progressBar, relativeLayout, textView3, scrollView, linearLayout, textView4, textView5, textView6, button3, linearLayout2, linearLayout3, linearLayout4, linearLayout5);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentClassementBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentClassementBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_classement, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
