package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class LayoutIndiceBinding implements a {
    public final Guideline bottomGuide;
    public final View closeView;
    public final TextView indiceTypeText;
    private final ConstraintLayout rootView;
    public final Guideline topGuide;

    private LayoutIndiceBinding(ConstraintLayout constraintLayout, Guideline guideline, View view, TextView textView, Guideline guideline2) {
        this.rootView = constraintLayout;
        this.bottomGuide = guideline;
        this.closeView = view;
        this.indiceTypeText = textView;
        this.topGuide = guideline2;
    }

    public static LayoutIndiceBinding bind(View view) {
        int i10 = R.id.bottom_guide;
        Guideline guideline = (Guideline) b.findChildViewById(view, R.id.bottom_guide);
        if (guideline != null) {
            i10 = R.id.closeView;
            View viewFindChildViewById = b.findChildViewById(view, R.id.closeView);
            if (viewFindChildViewById != null) {
                i10 = R.id.indiceTypeText;
                TextView textView = (TextView) b.findChildViewById(view, R.id.indiceTypeText);
                if (textView != null) {
                    i10 = R.id.top_guide;
                    Guideline guideline2 = (Guideline) b.findChildViewById(view, R.id.top_guide);
                    if (guideline2 != null) {
                        return new LayoutIndiceBinding((ConstraintLayout) view, guideline, viewFindChildViewById, textView, guideline2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LayoutIndiceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutIndiceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_indice, viewGroup, false);
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
