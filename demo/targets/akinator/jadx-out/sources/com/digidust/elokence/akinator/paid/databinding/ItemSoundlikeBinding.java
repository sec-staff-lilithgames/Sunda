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
public final class ItemSoundlikeBinding implements a {
    public final RelativeLayout layoutSoundlike;
    private final RelativeLayout rootView;
    public final TextView soundlikeDescription;
    public final TextView soundlikeName;

    private ItemSoundlikeBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TextView textView, TextView textView2) {
        this.rootView = relativeLayout;
        this.layoutSoundlike = relativeLayout2;
        this.soundlikeDescription = textView;
        this.soundlikeName = textView2;
    }

    public static ItemSoundlikeBinding bind(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i10 = R.id.soundlike_description;
        TextView textView = (TextView) b.findChildViewById(view, R.id.soundlike_description);
        if (textView != null) {
            i10 = R.id.soundlike_name;
            TextView textView2 = (TextView) b.findChildViewById(view, R.id.soundlike_name);
            if (textView2 != null) {
                return new ItemSoundlikeBinding(relativeLayout, relativeLayout, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemSoundlikeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemSoundlikeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_soundlike, viewGroup, false);
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
