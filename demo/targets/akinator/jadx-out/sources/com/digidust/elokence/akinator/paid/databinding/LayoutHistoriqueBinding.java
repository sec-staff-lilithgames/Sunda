package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class LayoutHistoriqueBinding implements a {
    public final ImageView closePopUp;
    public final Guideline decalageBas;
    public final Guideline decalageDroit;
    public final Guideline decalageGauche;
    public final Guideline decalageHaut;
    public final ListView listViewHistorique;
    private final ConstraintLayout rootView;
    public final TextView titreHisto;

    private LayoutHistoriqueBinding(ConstraintLayout constraintLayout, ImageView imageView, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, ListView listView, TextView textView) {
        this.rootView = constraintLayout;
        this.closePopUp = imageView;
        this.decalageBas = guideline;
        this.decalageDroit = guideline2;
        this.decalageGauche = guideline3;
        this.decalageHaut = guideline4;
        this.listViewHistorique = listView;
        this.titreHisto = textView;
    }

    public static LayoutHistoriqueBinding bind(View view) {
        int i10 = R.id.closePopUp;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.closePopUp);
        if (imageView != null) {
            i10 = R.id.decalage_bas;
            Guideline guideline = (Guideline) b.findChildViewById(view, R.id.decalage_bas);
            if (guideline != null) {
                i10 = R.id.decalage_droit;
                Guideline guideline2 = (Guideline) b.findChildViewById(view, R.id.decalage_droit);
                if (guideline2 != null) {
                    i10 = R.id.decalage_gauche;
                    Guideline guideline3 = (Guideline) b.findChildViewById(view, R.id.decalage_gauche);
                    if (guideline3 != null) {
                        i10 = R.id.decalage_haut;
                        Guideline guideline4 = (Guideline) b.findChildViewById(view, R.id.decalage_haut);
                        if (guideline4 != null) {
                            i10 = R.id.listViewHistorique;
                            ListView listView = (ListView) b.findChildViewById(view, R.id.listViewHistorique);
                            if (listView != null) {
                                i10 = R.id.titreHisto;
                                TextView textView = (TextView) b.findChildViewById(view, R.id.titreHisto);
                                if (textView != null) {
                                    return new LayoutHistoriqueBinding((ConstraintLayout) view, imageView, guideline, guideline2, guideline3, guideline4, listView, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LayoutHistoriqueBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutHistoriqueBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_historique, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
