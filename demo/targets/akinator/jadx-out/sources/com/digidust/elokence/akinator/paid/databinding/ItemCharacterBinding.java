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
public final class ItemCharacterBinding implements a {
    public final TextView characterDescription;
    public final TextView characterName;
    public final ImageView imageResult;
    public final RelativeLayout layoutCharacter;
    private final RelativeLayout rootView;

    private ItemCharacterBinding(RelativeLayout relativeLayout, TextView textView, TextView textView2, ImageView imageView, RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.characterDescription = textView;
        this.characterName = textView2;
        this.imageResult = imageView;
        this.layoutCharacter = relativeLayout2;
    }

    public static ItemCharacterBinding bind(View view) {
        int i10 = R.id.character_description;
        TextView textView = (TextView) b.findChildViewById(view, R.id.character_description);
        if (textView != null) {
            i10 = R.id.character_name;
            TextView textView2 = (TextView) b.findChildViewById(view, R.id.character_name);
            if (textView2 != null) {
                i10 = R.id.imageResult;
                ImageView imageView = (ImageView) b.findChildViewById(view, R.id.imageResult);
                if (imageView != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    return new ItemCharacterBinding(relativeLayout, textView, textView2, imageView, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemCharacterBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemCharacterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_character, viewGroup, false);
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
