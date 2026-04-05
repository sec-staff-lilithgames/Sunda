package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.AkinatorSmallButton;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class LayoutAlerteAchatGenizBinding implements a {
    public final LayoutGenizBinding cout;
    public final ImageView imageCoin;
    public final LinearLayout layoutButtons;
    public final LinearLayout layoutDepense;
    public final AkinatorSmallButton nonButton;
    public final AkinatorSmallButton ouiButton;
    private final RelativeLayout rootView;
    public final TextView textCoutQuantite;
    public final TextView textTitre;
    public final TextView textToDisplay;

    private LayoutAlerteAchatGenizBinding(RelativeLayout relativeLayout, LayoutGenizBinding layoutGenizBinding, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, AkinatorSmallButton akinatorSmallButton, AkinatorSmallButton akinatorSmallButton2, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = relativeLayout;
        this.cout = layoutGenizBinding;
        this.imageCoin = imageView;
        this.layoutButtons = linearLayout;
        this.layoutDepense = linearLayout2;
        this.nonButton = akinatorSmallButton;
        this.ouiButton = akinatorSmallButton2;
        this.textCoutQuantite = textView;
        this.textTitre = textView2;
        this.textToDisplay = textView3;
    }

    public static LayoutAlerteAchatGenizBinding bind(View view) {
        int i10 = R.id.cout;
        View viewFindChildViewById = b.findChildViewById(view, R.id.cout);
        if (viewFindChildViewById != null) {
            LayoutGenizBinding layoutGenizBindingBind = LayoutGenizBinding.bind(viewFindChildViewById);
            i10 = R.id.imageCoin;
            ImageView imageView = (ImageView) b.findChildViewById(view, R.id.imageCoin);
            if (imageView != null) {
                i10 = R.id.layoutButtons;
                LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.layoutButtons);
                if (linearLayout != null) {
                    i10 = R.id.layoutDepense;
                    LinearLayout linearLayout2 = (LinearLayout) b.findChildViewById(view, R.id.layoutDepense);
                    if (linearLayout2 != null) {
                        i10 = R.id.nonButton;
                        AkinatorSmallButton akinatorSmallButton = (AkinatorSmallButton) b.findChildViewById(view, R.id.nonButton);
                        if (akinatorSmallButton != null) {
                            i10 = R.id.ouiButton;
                            AkinatorSmallButton akinatorSmallButton2 = (AkinatorSmallButton) b.findChildViewById(view, R.id.ouiButton);
                            if (akinatorSmallButton2 != null) {
                                i10 = R.id.textCoutQuantite;
                                TextView textView = (TextView) b.findChildViewById(view, R.id.textCoutQuantite);
                                if (textView != null) {
                                    i10 = R.id.textTitre;
                                    TextView textView2 = (TextView) b.findChildViewById(view, R.id.textTitre);
                                    if (textView2 != null) {
                                        i10 = R.id.textToDisplay;
                                        TextView textView3 = (TextView) b.findChildViewById(view, R.id.textToDisplay);
                                        if (textView3 != null) {
                                            return new LayoutAlerteAchatGenizBinding((RelativeLayout) view, layoutGenizBindingBind, imageView, linearLayout, linearLayout2, akinatorSmallButton, akinatorSmallButton2, textView, textView2, textView3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LayoutAlerteAchatGenizBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutAlerteAchatGenizBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_alerte_achat_geniz, viewGroup, false);
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
