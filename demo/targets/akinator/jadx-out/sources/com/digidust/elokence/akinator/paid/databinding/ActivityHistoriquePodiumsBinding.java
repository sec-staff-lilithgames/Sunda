package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.spinner.AkinatorSpinner;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivityHistoriquePodiumsBinding implements a {
    public final ImageView classementTitre;
    public final Guideline decalageClassementHaut;
    public final Guideline decalageLegendesBas;
    public final ListView historiquePodiums;
    public final ImageView imageBackground;
    public final LayoutReturnBinding layoutReturn;
    public final LinearLayout layoutSpinners;
    public final LayoutSubjectIconTopBinding layoutSubjectIconTop;
    public final ListView legendesPodium;
    public final ProgressBar loadingBarHistoriquePodiums;
    public final ProgressBar loadingBarLegendes;
    public final RelativeLayout mainLayout;
    public final TextView messageErrorHistorique;
    public final TextView messageErrorLegendes;
    private final RelativeLayout rootView;
    public final AkinatorSpinner spinnerMonths;
    public final AkinatorSpinner spinnerYear;

    private ActivityHistoriquePodiumsBinding(RelativeLayout relativeLayout, ImageView imageView, Guideline guideline, Guideline guideline2, ListView listView, ImageView imageView2, LayoutReturnBinding layoutReturnBinding, LinearLayout linearLayout, LayoutSubjectIconTopBinding layoutSubjectIconTopBinding, ListView listView2, ProgressBar progressBar, ProgressBar progressBar2, RelativeLayout relativeLayout2, TextView textView, TextView textView2, AkinatorSpinner akinatorSpinner, AkinatorSpinner akinatorSpinner2) {
        this.rootView = relativeLayout;
        this.classementTitre = imageView;
        this.decalageClassementHaut = guideline;
        this.decalageLegendesBas = guideline2;
        this.historiquePodiums = listView;
        this.imageBackground = imageView2;
        this.layoutReturn = layoutReturnBinding;
        this.layoutSpinners = linearLayout;
        this.layoutSubjectIconTop = layoutSubjectIconTopBinding;
        this.legendesPodium = listView2;
        this.loadingBarHistoriquePodiums = progressBar;
        this.loadingBarLegendes = progressBar2;
        this.mainLayout = relativeLayout2;
        this.messageErrorHistorique = textView;
        this.messageErrorLegendes = textView2;
        this.spinnerMonths = akinatorSpinner;
        this.spinnerYear = akinatorSpinner2;
    }

    public static ActivityHistoriquePodiumsBinding bind(View view) {
        int i10 = R.id.classementTitre;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.classementTitre);
        if (imageView != null) {
            i10 = R.id.decalage_classement_haut;
            Guideline guideline = (Guideline) b.findChildViewById(view, R.id.decalage_classement_haut);
            if (guideline != null) {
                i10 = R.id.decalage_legendes_bas;
                Guideline guideline2 = (Guideline) b.findChildViewById(view, R.id.decalage_legendes_bas);
                if (guideline2 != null) {
                    i10 = R.id.historiquePodiums;
                    ListView listView = (ListView) b.findChildViewById(view, R.id.historiquePodiums);
                    if (listView != null) {
                        i10 = R.id.imageBackground;
                        ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.imageBackground);
                        if (imageView2 != null) {
                            i10 = R.id.layoutReturn;
                            View viewFindChildViewById = b.findChildViewById(view, R.id.layoutReturn);
                            if (viewFindChildViewById != null) {
                                LayoutReturnBinding layoutReturnBindingBind = LayoutReturnBinding.bind(viewFindChildViewById);
                                i10 = R.id.layoutSpinners;
                                LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.layoutSpinners);
                                if (linearLayout != null) {
                                    i10 = R.id.layoutSubjectIconTop;
                                    View viewFindChildViewById2 = b.findChildViewById(view, R.id.layoutSubjectIconTop);
                                    if (viewFindChildViewById2 != null) {
                                        LayoutSubjectIconTopBinding layoutSubjectIconTopBindingBind = LayoutSubjectIconTopBinding.bind(viewFindChildViewById2);
                                        i10 = R.id.legendesPodium;
                                        ListView listView2 = (ListView) b.findChildViewById(view, R.id.legendesPodium);
                                        if (listView2 != null) {
                                            i10 = R.id.loadingBarHistoriquePodiums;
                                            ProgressBar progressBar = (ProgressBar) b.findChildViewById(view, R.id.loadingBarHistoriquePodiums);
                                            if (progressBar != null) {
                                                i10 = R.id.loadingBarLegendes;
                                                ProgressBar progressBar2 = (ProgressBar) b.findChildViewById(view, R.id.loadingBarLegendes);
                                                if (progressBar2 != null) {
                                                    RelativeLayout relativeLayout = (RelativeLayout) view;
                                                    i10 = R.id.messageErrorHistorique;
                                                    TextView textView = (TextView) b.findChildViewById(view, R.id.messageErrorHistorique);
                                                    if (textView != null) {
                                                        i10 = R.id.messageErrorLegendes;
                                                        TextView textView2 = (TextView) b.findChildViewById(view, R.id.messageErrorLegendes);
                                                        if (textView2 != null) {
                                                            i10 = R.id.spinnerMonths;
                                                            AkinatorSpinner akinatorSpinner = (AkinatorSpinner) b.findChildViewById(view, R.id.spinnerMonths);
                                                            if (akinatorSpinner != null) {
                                                                i10 = R.id.spinnerYear;
                                                                AkinatorSpinner akinatorSpinner2 = (AkinatorSpinner) b.findChildViewById(view, R.id.spinnerYear);
                                                                if (akinatorSpinner2 != null) {
                                                                    return new ActivityHistoriquePodiumsBinding(relativeLayout, imageView, guideline, guideline2, listView, imageView2, layoutReturnBindingBind, linearLayout, layoutSubjectIconTopBindingBind, listView2, progressBar, progressBar2, relativeLayout, textView, textView2, akinatorSpinner, akinatorSpinner2);
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

    public static ActivityHistoriquePodiumsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityHistoriquePodiumsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_historique_podiums, viewGroup, false);
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
