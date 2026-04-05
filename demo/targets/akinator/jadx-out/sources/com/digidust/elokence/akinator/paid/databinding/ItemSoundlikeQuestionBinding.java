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
public final class ItemSoundlikeQuestionBinding implements a {
    public final RelativeLayout mainLayout;
    private final RelativeLayout rootView;
    public final TextView soundlikeName;

    private ItemSoundlikeQuestionBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TextView textView) {
        this.rootView = relativeLayout;
        this.mainLayout = relativeLayout2;
        this.soundlikeName = textView;
    }

    public static ItemSoundlikeQuestionBinding bind(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        TextView textView = (TextView) b.findChildViewById(view, R.id.soundlike_name);
        if (textView != null) {
            return new ItemSoundlikeQuestionBinding(relativeLayout, relativeLayout, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.soundlike_name)));
    }

    public static ItemSoundlikeQuestionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemSoundlikeQuestionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_soundlike_question, viewGroup, false);
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
