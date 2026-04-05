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
public final class FragmentSoundlikeSearchBinding implements a {
    public final ListView listAutocompletion;
    public final RelativeLayout mainLayout;
    private final RelativeLayout rootView;
    public final EditText soundlike1FieldValue;
    public final TextView tipsContentText;

    private FragmentSoundlikeSearchBinding(RelativeLayout relativeLayout, ListView listView, RelativeLayout relativeLayout2, EditText editText, TextView textView) {
        this.rootView = relativeLayout;
        this.listAutocompletion = listView;
        this.mainLayout = relativeLayout2;
        this.soundlike1FieldValue = editText;
        this.tipsContentText = textView;
    }

    public static FragmentSoundlikeSearchBinding bind(View view) {
        int i10 = R.id.listAutocompletion;
        ListView listView = (ListView) b.findChildViewById(view, R.id.listAutocompletion);
        if (listView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i10 = R.id.soundlike1FieldValue;
            EditText editText = (EditText) b.findChildViewById(view, R.id.soundlike1FieldValue);
            if (editText != null) {
                i10 = R.id.tipsContentText;
                TextView textView = (TextView) b.findChildViewById(view, R.id.tipsContentText);
                if (textView != null) {
                    return new FragmentSoundlikeSearchBinding(relativeLayout, listView, relativeLayout, editText, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentSoundlikeSearchBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSoundlikeSearchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_soundlike_search, viewGroup, false);
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
