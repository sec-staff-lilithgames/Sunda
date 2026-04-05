package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.digidust.elokence.akinator.freemium.R;
import com.elokence.elokenceutils.AutoResizeTextView;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class FragmentDefiDuJourBinding implements a {
    public final Guideline bottomBandeauDefiGuide;
    public final Guideline bottomGuide;
    public final Guideline bottomTitleDefiGuide;
    public final Button buttonPrecedant;
    public final ConstraintLayout defisLayout;
    public final View genizLayout;
    public final ImageView imageTitre;
    public final ConstraintLayout imageTitreBandeau;
    public final Button infoDDJ;
    public final LinearLayout layoutPhotoDefi1;
    public final LinearLayout layoutPhotoDefi2;
    public final Guideline leftGuide;
    public final Guideline rightGuide;
    private final ConstraintLayout rootView;
    public final AutoResizeTextView titreDefi;
    public final Guideline topBandeauDefiGuide;
    public final Guideline topGuide;

    private FragmentDefiDuJourBinding(ConstraintLayout constraintLayout, Guideline guideline, Guideline guideline2, Guideline guideline3, Button button, ConstraintLayout constraintLayout2, View view, ImageView imageView, ConstraintLayout constraintLayout3, Button button2, LinearLayout linearLayout, LinearLayout linearLayout2, Guideline guideline4, Guideline guideline5, AutoResizeTextView autoResizeTextView, Guideline guideline6, Guideline guideline7) {
        this.rootView = constraintLayout;
        this.bottomBandeauDefiGuide = guideline;
        this.bottomGuide = guideline2;
        this.bottomTitleDefiGuide = guideline3;
        this.buttonPrecedant = button;
        this.defisLayout = constraintLayout2;
        this.genizLayout = view;
        this.imageTitre = imageView;
        this.imageTitreBandeau = constraintLayout3;
        this.infoDDJ = button2;
        this.layoutPhotoDefi1 = linearLayout;
        this.layoutPhotoDefi2 = linearLayout2;
        this.leftGuide = guideline4;
        this.rightGuide = guideline5;
        this.titreDefi = autoResizeTextView;
        this.topBandeauDefiGuide = guideline6;
        this.topGuide = guideline7;
    }

    public static FragmentDefiDuJourBinding bind(View view) {
        int i10 = R.id.bottom_bandeau_defi_guide;
        Guideline guideline = (Guideline) b.findChildViewById(view, R.id.bottom_bandeau_defi_guide);
        if (guideline != null) {
            i10 = R.id.bottom_guide;
            Guideline guideline2 = (Guideline) b.findChildViewById(view, R.id.bottom_guide);
            if (guideline2 != null) {
                i10 = R.id.bottom_title_defi_guide;
                Guideline guideline3 = (Guideline) b.findChildViewById(view, R.id.bottom_title_defi_guide);
                if (guideline3 != null) {
                    i10 = R.id.buttonPrecedant;
                    Button button = (Button) b.findChildViewById(view, R.id.buttonPrecedant);
                    if (button != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i10 = R.id.genizLayout;
                        View viewFindChildViewById = b.findChildViewById(view, R.id.genizLayout);
                        if (viewFindChildViewById != null) {
                            i10 = R.id.imageTitre;
                            ImageView imageView = (ImageView) b.findChildViewById(view, R.id.imageTitre);
                            if (imageView != null) {
                                i10 = R.id.imageTitreBandeau;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) b.findChildViewById(view, R.id.imageTitreBandeau);
                                if (constraintLayout2 != null) {
                                    i10 = R.id.infoDDJ;
                                    Button button2 = (Button) b.findChildViewById(view, R.id.infoDDJ);
                                    if (button2 != null) {
                                        i10 = R.id.layoutPhotoDefi1;
                                        LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.layoutPhotoDefi1);
                                        if (linearLayout != null) {
                                            i10 = R.id.layoutPhotoDefi2;
                                            LinearLayout linearLayout2 = (LinearLayout) b.findChildViewById(view, R.id.layoutPhotoDefi2);
                                            if (linearLayout2 != null) {
                                                i10 = R.id.left_guide;
                                                Guideline guideline4 = (Guideline) b.findChildViewById(view, R.id.left_guide);
                                                if (guideline4 != null) {
                                                    i10 = R.id.right_guide;
                                                    Guideline guideline5 = (Guideline) b.findChildViewById(view, R.id.right_guide);
                                                    if (guideline5 != null) {
                                                        i10 = R.id.titreDefi;
                                                        AutoResizeTextView autoResizeTextView = (AutoResizeTextView) b.findChildViewById(view, R.id.titreDefi);
                                                        if (autoResizeTextView != null) {
                                                            i10 = R.id.top_bandeau_defi_guide;
                                                            Guideline guideline6 = (Guideline) b.findChildViewById(view, R.id.top_bandeau_defi_guide);
                                                            if (guideline6 != null) {
                                                                i10 = R.id.top_guide;
                                                                Guideline guideline7 = (Guideline) b.findChildViewById(view, R.id.top_guide);
                                                                if (guideline7 != null) {
                                                                    return new FragmentDefiDuJourBinding(constraintLayout, guideline, guideline2, guideline3, button, constraintLayout, viewFindChildViewById, imageView, constraintLayout2, button2, linearLayout, linearLayout2, guideline4, guideline5, autoResizeTextView, guideline6, guideline7);
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

    public static FragmentDefiDuJourBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDefiDuJourBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_defi_du_jour, viewGroup, false);
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
