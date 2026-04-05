package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class FragmentAddQuestionBinding implements a {
    public final ListView characterList;
    public final EditText questionFieldValue;
    public final TextView questionText;
    private final RelativeLayout rootView;
    public final TextView title;
    public final RelativeLayout top;

    private FragmentAddQuestionBinding(RelativeLayout relativeLayout, ListView listView, EditText editText, TextView textView, TextView textView2, RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.characterList = listView;
        this.questionFieldValue = editText;
        this.questionText = textView;
        this.title = textView2;
        this.top = relativeLayout2;
    }

    public static FragmentAddQuestionBinding bind(View view) {
        int i10 = R.id.characterList;
        ListView listView = (ListView) b.findChildViewById(view, R.id.characterList);
        if (listView != null) {
            i10 = R.id.questionFieldValue;
            EditText editText = (EditText) b.findChildViewById(view, R.id.questionFieldValue);
            if (editText != null) {
                i10 = R.id.questionText;
                TextView textView = (TextView) b.findChildViewById(view, R.id.questionText);
                if (textView != null) {
                    i10 = R.id.title;
                    TextView textView2 = (TextView) b.findChildViewById(view, R.id.title);
                    if (textView2 != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) view;
                        return new FragmentAddQuestionBinding(relativeLayout, listView, editText, textView, textView2, relativeLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentAddQuestionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAddQuestionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_add_question, viewGroup, false);
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
