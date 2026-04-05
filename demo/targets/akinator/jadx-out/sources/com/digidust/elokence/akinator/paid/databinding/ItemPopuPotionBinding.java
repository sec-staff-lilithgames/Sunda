package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.views.DarkAutoButton;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ItemPopuPotionBinding implements a {
    public final DarkAutoButton buttonBuyPotion;
    public final ImageView popuFace;
    public final ImageView popuNoAds;
    private final RelativeLayout rootView;
    public final TextView textBuyPotion;

    private ItemPopuPotionBinding(RelativeLayout relativeLayout, DarkAutoButton darkAutoButton, ImageView imageView, ImageView imageView2, TextView textView) {
        this.rootView = relativeLayout;
        this.buttonBuyPotion = darkAutoButton;
        this.popuFace = imageView;
        this.popuNoAds = imageView2;
        this.textBuyPotion = textView;
    }

    public static ItemPopuPotionBinding bind(View view) {
        int i10 = R.id.buttonBuyPotion;
        DarkAutoButton darkAutoButton = (DarkAutoButton) b.findChildViewById(view, R.id.buttonBuyPotion);
        if (darkAutoButton != null) {
            i10 = R.id.popuFace;
            ImageView imageView = (ImageView) b.findChildViewById(view, R.id.popuFace);
            if (imageView != null) {
                i10 = R.id.popuNoAds;
                ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.popuNoAds);
                if (imageView2 != null) {
                    i10 = R.id.textBuyPotion;
                    TextView textView = (TextView) b.findChildViewById(view, R.id.textBuyPotion);
                    if (textView != null) {
                        return new ItemPopuPotionBinding((RelativeLayout) view, darkAutoButton, imageView, imageView2, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemPopuPotionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemPopuPotionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_popu_potion, viewGroup, false);
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
