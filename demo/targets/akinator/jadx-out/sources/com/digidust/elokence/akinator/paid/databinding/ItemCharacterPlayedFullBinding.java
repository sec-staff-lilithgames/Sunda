package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ItemCharacterPlayedFullBinding implements a {
    public final TextView characterPlayedDesc;
    public final TextView characterPlayedName;
    public final ImageView imageBadge;
    public final LayoutLineBinding line;
    private final ConstraintLayout rootView;

    private ItemCharacterPlayedFullBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, LayoutLineBinding layoutLineBinding) {
        this.rootView = constraintLayout;
        this.characterPlayedDesc = textView;
        this.characterPlayedName = textView2;
        this.imageBadge = imageView;
        this.line = layoutLineBinding;
    }

    public static ItemCharacterPlayedFullBinding bind(View view) {
        int i10 = R.id.characterPlayedDesc;
        TextView textView = (TextView) b.findChildViewById(view, R.id.characterPlayedDesc);
        if (textView != null) {
            i10 = R.id.characterPlayedName;
            TextView textView2 = (TextView) b.findChildViewById(view, R.id.characterPlayedName);
            if (textView2 != null) {
                i10 = R.id.imageBadge;
                ImageView imageView = (ImageView) b.findChildViewById(view, R.id.imageBadge);
                if (imageView != null) {
                    i10 = R.id.line;
                    View viewFindChildViewById = b.findChildViewById(view, R.id.line);
                    if (viewFindChildViewById != null) {
                        return new ItemCharacterPlayedFullBinding((ConstraintLayout) view, textView, textView2, imageView, LayoutLineBinding.bind(viewFindChildViewById));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemCharacterPlayedFullBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemCharacterPlayedFullBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_character_played_full, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
