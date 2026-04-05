package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ItemHistoriquePodiumsBinding implements a {
    public final TextView podiumDate;
    public final LayoutOneClassementBinding podiumJoueur;
    private final RelativeLayout rootView;

    private ItemHistoriquePodiumsBinding(RelativeLayout relativeLayout, TextView textView, LayoutOneClassementBinding layoutOneClassementBinding) {
        this.rootView = relativeLayout;
        this.podiumDate = textView;
        this.podiumJoueur = layoutOneClassementBinding;
    }

    public static ItemHistoriquePodiumsBinding bind(View view) {
        int i10 = R.id.podiumDate;
        TextView textView = (TextView) b.findChildViewById(view, R.id.podiumDate);
        if (textView != null) {
            i10 = R.id.podiumJoueur;
            View viewFindChildViewById = b.findChildViewById(view, R.id.podiumJoueur);
            if (viewFindChildViewById != null) {
                return new ItemHistoriquePodiumsBinding((RelativeLayout) view, textView, LayoutOneClassementBinding.bind(viewFindChildViewById));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemHistoriquePodiumsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemHistoriquePodiumsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_historique_podiums, viewGroup, false);
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
