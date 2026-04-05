package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ItemLanguageSelectBinding implements a {
    public final ImageView cocheLangue;
    public final TextView languageName;
    private final RelativeLayout rootView;

    private ItemLanguageSelectBinding(RelativeLayout relativeLayout, ImageView imageView, TextView textView) {
        this.rootView = relativeLayout;
        this.cocheLangue = imageView;
        this.languageName = textView;
    }

    public static ItemLanguageSelectBinding bind(View view) {
        int i10 = R.id.cocheLangue;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.cocheLangue);
        if (imageView != null) {
            i10 = R.id.language_name;
            TextView textView = (TextView) b.findChildViewById(view, R.id.language_name);
            if (textView != null) {
                return new ItemLanguageSelectBinding((RelativeLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemLanguageSelectBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemLanguageSelectBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_language_select, viewGroup, false);
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
