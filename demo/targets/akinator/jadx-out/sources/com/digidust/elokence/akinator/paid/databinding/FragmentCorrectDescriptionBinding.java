package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class FragmentCorrectDescriptionBinding implements a {
    public final TextView actualDescription;
    public final EditText newDescriptionEdit;
    private final LinearLayout rootView;
    public final TextView tips;

    private FragmentCorrectDescriptionBinding(LinearLayout linearLayout, TextView textView, EditText editText, TextView textView2) {
        this.rootView = linearLayout;
        this.actualDescription = textView;
        this.newDescriptionEdit = editText;
        this.tips = textView2;
    }

    public static FragmentCorrectDescriptionBinding bind(View view) {
        int i10 = R.id.actualDescription;
        TextView textView = (TextView) b.findChildViewById(view, R.id.actualDescription);
        if (textView != null) {
            i10 = R.id.newDescriptionEdit;
            EditText editText = (EditText) b.findChildViewById(view, R.id.newDescriptionEdit);
            if (editText != null) {
                i10 = R.id.tips;
                TextView textView2 = (TextView) b.findChildViewById(view, R.id.tips);
                if (textView2 != null) {
                    return new FragmentCorrectDescriptionBinding((LinearLayout) view, textView, editText, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentCorrectDescriptionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCorrectDescriptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_correct_description, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
