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
public final class ItemSubjectIconBinding implements a {
    public final ImageView itemIcon;
    public final RelativeLayout mainLayout;
    private final RelativeLayout rootView;
    public final TextView textTheme;

    private ItemSubjectIconBinding(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, TextView textView) {
        this.rootView = relativeLayout;
        this.itemIcon = imageView;
        this.mainLayout = relativeLayout2;
        this.textTheme = textView;
    }

    public static ItemSubjectIconBinding bind(View view) {
        int i10 = R.id.itemIcon;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.itemIcon);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            TextView textView = (TextView) b.findChildViewById(view, R.id.textTheme);
            if (textView != null) {
                return new ItemSubjectIconBinding(relativeLayout, imageView, relativeLayout, textView);
            }
            i10 = R.id.textTheme;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemSubjectIconBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemSubjectIconBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_subject_icon, viewGroup, false);
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
