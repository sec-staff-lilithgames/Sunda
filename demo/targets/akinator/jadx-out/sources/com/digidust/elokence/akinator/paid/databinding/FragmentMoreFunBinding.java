package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.AkinatorSmallButton;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class FragmentMoreFunBinding implements a {
    public final AkinatorSmallButton accessoriesButton;
    public final RecyclerView recyclerView;
    private final ConstraintLayout rootView;
    public final TextView textCustomizeTheGenie;
    public final ImageView titre;

    private FragmentMoreFunBinding(ConstraintLayout constraintLayout, AkinatorSmallButton akinatorSmallButton, RecyclerView recyclerView, TextView textView, ImageView imageView) {
        this.rootView = constraintLayout;
        this.accessoriesButton = akinatorSmallButton;
        this.recyclerView = recyclerView;
        this.textCustomizeTheGenie = textView;
        this.titre = imageView;
    }

    public static FragmentMoreFunBinding bind(View view) {
        int i10 = R.id.accessoriesButton;
        AkinatorSmallButton akinatorSmallButton = (AkinatorSmallButton) b.findChildViewById(view, R.id.accessoriesButton);
        if (akinatorSmallButton != null) {
            i10 = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) b.findChildViewById(view, R.id.recycler_view);
            if (recyclerView != null) {
                i10 = R.id.textCustomizeTheGenie;
                TextView textView = (TextView) b.findChildViewById(view, R.id.textCustomizeTheGenie);
                if (textView != null) {
                    i10 = R.id.titre;
                    ImageView imageView = (ImageView) b.findChildViewById(view, R.id.titre);
                    if (imageView != null) {
                        return new FragmentMoreFunBinding((ConstraintLayout) view, akinatorSmallButton, recyclerView, textView, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentMoreFunBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMoreFunBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_more_fun, viewGroup, false);
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
