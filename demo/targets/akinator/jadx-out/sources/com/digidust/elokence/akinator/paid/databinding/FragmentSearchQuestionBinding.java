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
public final class FragmentSearchQuestionBinding implements a {
    private final LinearLayout rootView;
    public final TextView searchQuestionContentText;
    public final EditText searchQuestionFieldValue;

    private FragmentSearchQuestionBinding(LinearLayout linearLayout, TextView textView, EditText editText) {
        this.rootView = linearLayout;
        this.searchQuestionContentText = textView;
        this.searchQuestionFieldValue = editText;
    }

    public static FragmentSearchQuestionBinding bind(View view) {
        int i10 = R.id.searchQuestionContentText;
        TextView textView = (TextView) b.findChildViewById(view, R.id.searchQuestionContentText);
        if (textView != null) {
            i10 = R.id.searchQuestionFieldValue;
            EditText editText = (EditText) b.findChildViewById(view, R.id.searchQuestionFieldValue);
            if (editText != null) {
                return new FragmentSearchQuestionBinding((LinearLayout) view, textView, editText);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentSearchQuestionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSearchQuestionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_search_question, viewGroup, false);
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
