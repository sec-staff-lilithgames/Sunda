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
public final class LayoutAlerteRgpdVipBinding implements a {
    public final ImageView akinatorChapeau;
    public final ImageView akinatorImage;
    public final ImageView akinatorTenue;
    public final RelativeLayout layoutAkinator;
    public final LinearLayout linearText;
    public final AkinatorSmallButton okButton;
    public final TextView rgpd1;
    public final TextView rgpd2;
    private final RelativeLayout rootView;
    public final TextView textBienvenue;
    public final RelativeLayout zoneTextRGPD;

    private LayoutAlerteRgpdVipBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, RelativeLayout relativeLayout2, LinearLayout linearLayout, AkinatorSmallButton akinatorSmallButton, TextView textView, TextView textView2, TextView textView3, RelativeLayout relativeLayout3) {
        this.rootView = relativeLayout;
        this.akinatorChapeau = imageView;
        this.akinatorImage = imageView2;
        this.akinatorTenue = imageView3;
        this.layoutAkinator = relativeLayout2;
        this.linearText = linearLayout;
        this.okButton = akinatorSmallButton;
        this.rgpd1 = textView;
        this.rgpd2 = textView2;
        this.textBienvenue = textView3;
        this.zoneTextRGPD = relativeLayout3;
    }

    public static LayoutAlerteRgpdVipBinding bind(View view) {
        int i10 = R.id.akinatorChapeau;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.akinatorChapeau);
        if (imageView != null) {
            i10 = R.id.akinatorImage;
            ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.akinatorImage);
            if (imageView2 != null) {
                i10 = R.id.akinatorTenue;
                ImageView imageView3 = (ImageView) b.findChildViewById(view, R.id.akinatorTenue);
                if (imageView3 != null) {
                    i10 = R.id.layoutAkinator;
                    RelativeLayout relativeLayout = (RelativeLayout) b.findChildViewById(view, R.id.layoutAkinator);
                    if (relativeLayout != null) {
                        i10 = R.id.linearText;
                        LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.linearText);
                        if (linearLayout != null) {
                            i10 = R.id.okButton;
                            AkinatorSmallButton akinatorSmallButton = (AkinatorSmallButton) b.findChildViewById(view, R.id.okButton);
                            if (akinatorSmallButton != null) {
                                i10 = R.id.rgpd1;
                                TextView textView = (TextView) b.findChildViewById(view, R.id.rgpd1);
                                if (textView != null) {
                                    i10 = R.id.rgpd2;
                                    TextView textView2 = (TextView) b.findChildViewById(view, R.id.rgpd2);
                                    if (textView2 != null) {
                                        i10 = R.id.textBienvenue;
                                        TextView textView3 = (TextView) b.findChildViewById(view, R.id.textBienvenue);
                                        if (textView3 != null) {
                                            i10 = R.id.zoneTextRGPD;
                                            RelativeLayout relativeLayout2 = (RelativeLayout) b.findChildViewById(view, R.id.zoneTextRGPD);
                                            if (relativeLayout2 != null) {
                                                return new LayoutAlerteRgpdVipBinding((RelativeLayout) view, imageView, imageView2, imageView3, relativeLayout, linearLayout, akinatorSmallButton, textView, textView2, textView3, relativeLayout2);
                                            }
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

    public static LayoutAlerteRgpdVipBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutAlerteRgpdVipBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_alerte_rgpd_vip, viewGroup, false);
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
