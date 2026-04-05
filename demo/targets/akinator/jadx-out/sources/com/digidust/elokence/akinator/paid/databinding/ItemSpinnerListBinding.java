package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ItemSpinnerListBinding implements a {
    private final TextView rootView;
    public final TextView textViewSpinner;

    private ItemSpinnerListBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.textViewSpinner = textView2;
    }

    public static ItemSpinnerListBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new ItemSpinnerListBinding(textView, textView);
    }

    public static ItemSpinnerListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemSpinnerListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_spinner_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public TextView getRoot() {
        return this.rootView;
    }
}
