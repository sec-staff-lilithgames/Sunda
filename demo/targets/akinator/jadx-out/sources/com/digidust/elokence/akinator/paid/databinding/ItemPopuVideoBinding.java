package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.views.DarkAutoButton;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ItemPopuVideoBinding implements a {
    public final DarkAutoButton buttonShowVideo;
    private final RelativeLayout rootView;
    public final TextView testShowVideo;

    private ItemPopuVideoBinding(RelativeLayout relativeLayout, DarkAutoButton darkAutoButton, TextView textView) {
        this.rootView = relativeLayout;
        this.buttonShowVideo = darkAutoButton;
        this.testShowVideo = textView;
    }

    public static ItemPopuVideoBinding bind(View view) {
        int i10 = R.id.buttonShowVideo;
        DarkAutoButton darkAutoButton = (DarkAutoButton) b.findChildViewById(view, R.id.buttonShowVideo);
        if (darkAutoButton != null) {
            i10 = R.id.testShowVideo;
            TextView textView = (TextView) b.findChildViewById(view, R.id.testShowVideo);
            if (textView != null) {
                return new ItemPopuVideoBinding((RelativeLayout) view, darkAutoButton, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemPopuVideoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemPopuVideoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_popu_video, viewGroup, false);
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
