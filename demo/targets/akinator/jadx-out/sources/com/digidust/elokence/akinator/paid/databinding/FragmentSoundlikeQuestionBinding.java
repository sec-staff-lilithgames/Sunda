package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class FragmentSoundlikeQuestionBinding implements a {
    public final Button addQuestionButton;
    public final ListView questionsList;
    private final RelativeLayout rootView;

    private FragmentSoundlikeQuestionBinding(RelativeLayout relativeLayout, Button button, ListView listView) {
        this.rootView = relativeLayout;
        this.addQuestionButton = button;
        this.questionsList = listView;
    }

    public static FragmentSoundlikeQuestionBinding bind(View view) {
        int i10 = R.id.addQuestionButton;
        Button button = (Button) b.findChildViewById(view, R.id.addQuestionButton);
        if (button != null) {
            i10 = R.id.questionsList;
            ListView listView = (ListView) b.findChildViewById(view, R.id.questionsList);
            if (listView != null) {
                return new FragmentSoundlikeQuestionBinding((RelativeLayout) view, button, listView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentSoundlikeQuestionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSoundlikeQuestionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_soundlike_question, viewGroup, false);
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
