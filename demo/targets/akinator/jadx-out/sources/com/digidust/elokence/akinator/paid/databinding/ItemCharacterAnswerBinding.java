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
public final class ItemCharacterAnswerBinding implements a {
    public final ImageView characterItemBackground;
    public final TextView characterName;
    public final TextView responseLabel;
    public final RelativeLayout responseLayout;
    public final TextView responseValue;
    private final RelativeLayout rootView;

    private ItemCharacterAnswerBinding(RelativeLayout relativeLayout, ImageView imageView, TextView textView, TextView textView2, RelativeLayout relativeLayout2, TextView textView3) {
        this.rootView = relativeLayout;
        this.characterItemBackground = imageView;
        this.characterName = textView;
        this.responseLabel = textView2;
        this.responseLayout = relativeLayout2;
        this.responseValue = textView3;
    }

    public static ItemCharacterAnswerBinding bind(View view) {
        int i10 = R.id.character_item_background;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.character_item_background);
        if (imageView != null) {
            i10 = R.id.character_name;
            TextView textView = (TextView) b.findChildViewById(view, R.id.character_name);
            if (textView != null) {
                i10 = R.id.responseLabel;
                TextView textView2 = (TextView) b.findChildViewById(view, R.id.responseLabel);
                if (textView2 != null) {
                    i10 = R.id.responseLayout;
                    RelativeLayout relativeLayout = (RelativeLayout) b.findChildViewById(view, R.id.responseLayout);
                    if (relativeLayout != null) {
                        i10 = R.id.responseValue;
                        TextView textView3 = (TextView) b.findChildViewById(view, R.id.responseValue);
                        if (textView3 != null) {
                            return new ItemCharacterAnswerBinding((RelativeLayout) view, imageView, textView, textView2, relativeLayout, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemCharacterAnswerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemCharacterAnswerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_character_answer, viewGroup, false);
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
