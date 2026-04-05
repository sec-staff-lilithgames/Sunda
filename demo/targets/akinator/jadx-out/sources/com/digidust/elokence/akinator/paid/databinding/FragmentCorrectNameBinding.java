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
public final class FragmentCorrectNameBinding implements a {
    public final TextView actualName;
    public final EditText newNameEdit;
    private final LinearLayout rootView;
    public final TextView tips;

    private FragmentCorrectNameBinding(LinearLayout linearLayout, TextView textView, EditText editText, TextView textView2) {
        this.rootView = linearLayout;
        this.actualName = textView;
        this.newNameEdit = editText;
        this.tips = textView2;
    }

    public static FragmentCorrectNameBinding bind(View view) {
        int i10 = R.id.actualName;
        TextView textView = (TextView) b.findChildViewById(view, R.id.actualName);
        if (textView != null) {
            i10 = R.id.newNameEdit;
            EditText editText = (EditText) b.findChildViewById(view, R.id.newNameEdit);
            if (editText != null) {
                i10 = R.id.tips;
                TextView textView2 = (TextView) b.findChildViewById(view, R.id.tips);
                if (textView2 != null) {
                    return new FragmentCorrectNameBinding((LinearLayout) view, textView, editText, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentCorrectNameBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCorrectNameBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_correct_name, viewGroup, false);
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
