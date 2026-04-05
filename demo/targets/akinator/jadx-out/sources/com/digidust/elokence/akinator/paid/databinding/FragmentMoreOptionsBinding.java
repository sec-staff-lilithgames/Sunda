package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class FragmentMoreOptionsBinding implements a {
    public final LinearLayout addPicture;
    public final LinearLayout addQuestion;
    public final ImageView akinator;
    public final Guideline akinatorBas;
    public final Guideline akinatorGauche;
    public final Guideline akinatorHaut;
    public final TextView bulleText1;
    public final Guideline cadrePersoDroit;
    public final Guideline cadrePersoGauche;
    public final LinearLayout correctName;
    public final Guideline decalageBulleBas;
    public final Guideline decalageBulleDroite;
    public final Guideline decalageBulleHaut;
    public final TextView descPersoTrouve;
    public final ImageView footerImage;
    public final RelativeLayout globalAddMagicLayout;
    public final Guideline imagePersoBas;
    public final Guideline imagePersoDroit;
    public final Guideline imagePersoGauche;
    public final Guideline imagePersoHaut;
    public final ImageView imagePersoTrouve;
    public final LinearLayout moreQuestions;
    public final TextView nomPersoTrouve;
    public final ImageView report;
    private final RelativeLayout rootView;
    public final TextView textAddPicture;
    public final TextView textAddQuestion;
    public final TextView textCorrectName;
    public final TextView textMoreQuestions;
    public final ImageView titre;
    public final TextView titreText;

    private FragmentMoreOptionsBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, Guideline guideline, Guideline guideline2, Guideline guideline3, TextView textView, Guideline guideline4, Guideline guideline5, LinearLayout linearLayout3, Guideline guideline6, Guideline guideline7, Guideline guideline8, TextView textView2, ImageView imageView2, RelativeLayout relativeLayout2, Guideline guideline9, Guideline guideline10, Guideline guideline11, Guideline guideline12, ImageView imageView3, LinearLayout linearLayout4, TextView textView3, ImageView imageView4, TextView textView4, TextView textView5, TextView textView6, TextView textView7, ImageView imageView5, TextView textView8) {
        this.rootView = relativeLayout;
        this.addPicture = linearLayout;
        this.addQuestion = linearLayout2;
        this.akinator = imageView;
        this.akinatorBas = guideline;
        this.akinatorGauche = guideline2;
        this.akinatorHaut = guideline3;
        this.bulleText1 = textView;
        this.cadrePersoDroit = guideline4;
        this.cadrePersoGauche = guideline5;
        this.correctName = linearLayout3;
        this.decalageBulleBas = guideline6;
        this.decalageBulleDroite = guideline7;
        this.decalageBulleHaut = guideline8;
        this.descPersoTrouve = textView2;
        this.footerImage = imageView2;
        this.globalAddMagicLayout = relativeLayout2;
        this.imagePersoBas = guideline9;
        this.imagePersoDroit = guideline10;
        this.imagePersoGauche = guideline11;
        this.imagePersoHaut = guideline12;
        this.imagePersoTrouve = imageView3;
        this.moreQuestions = linearLayout4;
        this.nomPersoTrouve = textView3;
        this.report = imageView4;
        this.textAddPicture = textView4;
        this.textAddQuestion = textView5;
        this.textCorrectName = textView6;
        this.textMoreQuestions = textView7;
        this.titre = imageView5;
        this.titreText = textView8;
    }

    public static FragmentMoreOptionsBinding bind(View view) {
        int i10 = R.id.addPicture;
        LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.addPicture);
        if (linearLayout != null) {
            i10 = R.id.addQuestion;
            LinearLayout linearLayout2 = (LinearLayout) b.findChildViewById(view, R.id.addQuestion);
            if (linearLayout2 != null) {
                i10 = R.id.akinator;
                ImageView imageView = (ImageView) b.findChildViewById(view, R.id.akinator);
                if (imageView != null) {
                    i10 = R.id.akinator_bas;
                    Guideline guideline = (Guideline) b.findChildViewById(view, R.id.akinator_bas);
                    if (guideline != null) {
                        i10 = R.id.akinator_gauche;
                        Guideline guideline2 = (Guideline) b.findChildViewById(view, R.id.akinator_gauche);
                        if (guideline2 != null) {
                            i10 = R.id.akinator_haut;
                            Guideline guideline3 = (Guideline) b.findChildViewById(view, R.id.akinator_haut);
                            if (guideline3 != null) {
                                i10 = R.id.bulleText1;
                                TextView textView = (TextView) b.findChildViewById(view, R.id.bulleText1);
                                if (textView != null) {
                                    i10 = R.id.cadrePerso_droit;
                                    Guideline guideline4 = (Guideline) b.findChildViewById(view, R.id.cadrePerso_droit);
                                    if (guideline4 != null) {
                                        i10 = R.id.cadrePerso_gauche;
                                        Guideline guideline5 = (Guideline) b.findChildViewById(view, R.id.cadrePerso_gauche);
                                        if (guideline5 != null) {
                                            i10 = R.id.correctName;
                                            LinearLayout linearLayout3 = (LinearLayout) b.findChildViewById(view, R.id.correctName);
                                            if (linearLayout3 != null) {
                                                i10 = R.id.decalage_bulle_bas;
                                                Guideline guideline6 = (Guideline) b.findChildViewById(view, R.id.decalage_bulle_bas);
                                                if (guideline6 != null) {
                                                    i10 = R.id.decalage_bulle_droite;
                                                    Guideline guideline7 = (Guideline) b.findChildViewById(view, R.id.decalage_bulle_droite);
                                                    if (guideline7 != null) {
                                                        i10 = R.id.decalage_bulle_haut;
                                                        Guideline guideline8 = (Guideline) b.findChildViewById(view, R.id.decalage_bulle_haut);
                                                        if (guideline8 != null) {
                                                            i10 = R.id.descPersoTrouve;
                                                            TextView textView2 = (TextView) b.findChildViewById(view, R.id.descPersoTrouve);
                                                            if (textView2 != null) {
                                                                i10 = R.id.footerImage;
                                                                ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.footerImage);
                                                                if (imageView2 != null) {
                                                                    i10 = R.id.globalAddMagicLayout;
                                                                    RelativeLayout relativeLayout = (RelativeLayout) b.findChildViewById(view, R.id.globalAddMagicLayout);
                                                                    if (relativeLayout != null) {
                                                                        i10 = R.id.imagePerso_bas;
                                                                        Guideline guideline9 = (Guideline) b.findChildViewById(view, R.id.imagePerso_bas);
                                                                        if (guideline9 != null) {
                                                                            i10 = R.id.imagePerso_droit;
                                                                            Guideline guideline10 = (Guideline) b.findChildViewById(view, R.id.imagePerso_droit);
                                                                            if (guideline10 != null) {
                                                                                i10 = R.id.imagePerso_gauche;
                                                                                Guideline guideline11 = (Guideline) b.findChildViewById(view, R.id.imagePerso_gauche);
                                                                                if (guideline11 != null) {
                                                                                    i10 = R.id.imagePerso_haut;
                                                                                    Guideline guideline12 = (Guideline) b.findChildViewById(view, R.id.imagePerso_haut);
                                                                                    if (guideline12 != null) {
                                                                                        i10 = R.id.imagePersoTrouve;
                                                                                        ImageView imageView3 = (ImageView) b.findChildViewById(view, R.id.imagePersoTrouve);
                                                                                        if (imageView3 != null) {
                                                                                            i10 = R.id.moreQuestions;
                                                                                            LinearLayout linearLayout4 = (LinearLayout) b.findChildViewById(view, R.id.moreQuestions);
                                                                                            if (linearLayout4 != null) {
                                                                                                i10 = R.id.nomPersoTrouve;
                                                                                                TextView textView3 = (TextView) b.findChildViewById(view, R.id.nomPersoTrouve);
                                                                                                if (textView3 != null) {
                                                                                                    i10 = R.id.report;
                                                                                                    ImageView imageView4 = (ImageView) b.findChildViewById(view, R.id.report);
                                                                                                    if (imageView4 != null) {
                                                                                                        i10 = R.id.textAddPicture;
                                                                                                        TextView textView4 = (TextView) b.findChildViewById(view, R.id.textAddPicture);
                                                                                                        if (textView4 != null) {
                                                                                                            i10 = R.id.textAddQuestion;
                                                                                                            TextView textView5 = (TextView) b.findChildViewById(view, R.id.textAddQuestion);
                                                                                                            if (textView5 != null) {
                                                                                                                i10 = R.id.textCorrectName;
                                                                                                                TextView textView6 = (TextView) b.findChildViewById(view, R.id.textCorrectName);
                                                                                                                if (textView6 != null) {
                                                                                                                    i10 = R.id.textMoreQuestions;
                                                                                                                    TextView textView7 = (TextView) b.findChildViewById(view, R.id.textMoreQuestions);
                                                                                                                    if (textView7 != null) {
                                                                                                                        i10 = R.id.titre;
                                                                                                                        ImageView imageView5 = (ImageView) b.findChildViewById(view, R.id.titre);
                                                                                                                        if (imageView5 != null) {
                                                                                                                            i10 = R.id.titre_text;
                                                                                                                            TextView textView8 = (TextView) b.findChildViewById(view, R.id.titre_text);
                                                                                                                            if (textView8 != null) {
                                                                                                                                return new FragmentMoreOptionsBinding((RelativeLayout) view, linearLayout, linearLayout2, imageView, guideline, guideline2, guideline3, textView, guideline4, guideline5, linearLayout3, guideline6, guideline7, guideline8, textView2, imageView2, relativeLayout, guideline9, guideline10, guideline11, guideline12, imageView3, linearLayout4, textView3, imageView4, textView4, textView5, textView6, textView7, imageView5, textView8);
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

    public static FragmentMoreOptionsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMoreOptionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_more_options, viewGroup, false);
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
