package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.AkinatorAddMagicButton;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ItemMessageVersionBinding implements a {
    public final AkinatorAddMagicButton buttonGoToStore;
    public final ImageView crossHome;
    public final TextView majText;
    public final TextView majTitle;
    private final RelativeLayout rootView;

    /* renamed from: y, reason: collision with root package name */
    public final ImageView f21815y;

    private ItemMessageVersionBinding(RelativeLayout relativeLayout, AkinatorAddMagicButton akinatorAddMagicButton, ImageView imageView, TextView textView, TextView textView2, ImageView imageView2) {
        this.rootView = relativeLayout;
        this.buttonGoToStore = akinatorAddMagicButton;
        this.crossHome = imageView;
        this.majText = textView;
        this.majTitle = textView2;
        this.f21815y = imageView2;
    }

    public static ItemMessageVersionBinding bind(View view) {
        int i10 = R.id.buttonGoToStore;
        AkinatorAddMagicButton akinatorAddMagicButton = (AkinatorAddMagicButton) b.findChildViewById(view, R.id.buttonGoToStore);
        if (akinatorAddMagicButton != null) {
            i10 = R.id.crossHome;
            ImageView imageView = (ImageView) b.findChildViewById(view, R.id.crossHome);
            if (imageView != null) {
                i10 = R.id.majText;
                TextView textView = (TextView) b.findChildViewById(view, R.id.majText);
                if (textView != null) {
                    i10 = R.id.majTitle;
                    TextView textView2 = (TextView) b.findChildViewById(view, R.id.majTitle);
                    if (textView2 != null) {
                        i10 = R.id.y;
                        ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.y);
                        if (imageView2 != null) {
                            return new ItemMessageVersionBinding((RelativeLayout) view, akinatorAddMagicButton, imageView, textView, textView2, imageView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemMessageVersionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemMessageVersionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_message_version, viewGroup, false);
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
