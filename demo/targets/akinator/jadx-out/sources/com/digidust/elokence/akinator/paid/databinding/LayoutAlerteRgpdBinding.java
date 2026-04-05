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
public final class LayoutAlerteRgpdBinding implements a {
    public final ImageView akinatorChapeau;
    public final ImageView akinatorImage;
    public final ImageView akinatorTenue;
    public final RelativeLayout layoutAkinator;
    public final RelativeLayout layoutButtons;
    public final LinearLayout linearText;
    public final AkinatorSmallButton nonButton;
    public final AkinatorSmallButton ouiButton;
    public final TextView rgpd1;
    public final TextView rgpd2;
    public final TextView rgpd3;
    public final TextView rgpd4;
    public final TextView rgpd5;
    public final TextView rgpd6;
    public final TextView rgpd7;
    public final TextView rgpd8;
    public final TextView rgpd9;
    private final RelativeLayout rootView;
    public final TextView textBienvenue;
    public final RelativeLayout zoneTextRGPD;

    private LayoutAlerteRgpdBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, LinearLayout linearLayout, AkinatorSmallButton akinatorSmallButton, AkinatorSmallButton akinatorSmallButton2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, RelativeLayout relativeLayout4) {
        this.rootView = relativeLayout;
        this.akinatorChapeau = imageView;
        this.akinatorImage = imageView2;
        this.akinatorTenue = imageView3;
        this.layoutAkinator = relativeLayout2;
        this.layoutButtons = relativeLayout3;
        this.linearText = linearLayout;
        this.nonButton = akinatorSmallButton;
        this.ouiButton = akinatorSmallButton2;
        this.rgpd1 = textView;
        this.rgpd2 = textView2;
        this.rgpd3 = textView3;
        this.rgpd4 = textView4;
        this.rgpd5 = textView5;
        this.rgpd6 = textView6;
        this.rgpd7 = textView7;
        this.rgpd8 = textView8;
        this.rgpd9 = textView9;
        this.textBienvenue = textView10;
        this.zoneTextRGPD = relativeLayout4;
    }

    public static LayoutAlerteRgpdBinding bind(View view) {
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
                        i10 = R.id.layoutButtons;
                        RelativeLayout relativeLayout2 = (RelativeLayout) b.findChildViewById(view, R.id.layoutButtons);
                        if (relativeLayout2 != null) {
                            i10 = R.id.linearText;
                            LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.linearText);
                            if (linearLayout != null) {
                                i10 = R.id.nonButton;
                                AkinatorSmallButton akinatorSmallButton = (AkinatorSmallButton) b.findChildViewById(view, R.id.nonButton);
                                if (akinatorSmallButton != null) {
                                    i10 = R.id.ouiButton;
                                    AkinatorSmallButton akinatorSmallButton2 = (AkinatorSmallButton) b.findChildViewById(view, R.id.ouiButton);
                                    if (akinatorSmallButton2 != null) {
                                        i10 = R.id.rgpd1;
                                        TextView textView = (TextView) b.findChildViewById(view, R.id.rgpd1);
                                        if (textView != null) {
                                            i10 = R.id.rgpd2;
                                            TextView textView2 = (TextView) b.findChildViewById(view, R.id.rgpd2);
                                            if (textView2 != null) {
                                                i10 = R.id.rgpd3;
                                                TextView textView3 = (TextView) b.findChildViewById(view, R.id.rgpd3);
                                                if (textView3 != null) {
                                                    i10 = R.id.rgpd4;
                                                    TextView textView4 = (TextView) b.findChildViewById(view, R.id.rgpd4);
                                                    if (textView4 != null) {
                                                        i10 = R.id.rgpd5;
                                                        TextView textView5 = (TextView) b.findChildViewById(view, R.id.rgpd5);
                                                        if (textView5 != null) {
                                                            i10 = R.id.rgpd6;
                                                            TextView textView6 = (TextView) b.findChildViewById(view, R.id.rgpd6);
                                                            if (textView6 != null) {
                                                                i10 = R.id.rgpd7;
                                                                TextView textView7 = (TextView) b.findChildViewById(view, R.id.rgpd7);
                                                                if (textView7 != null) {
                                                                    i10 = R.id.rgpd8;
                                                                    TextView textView8 = (TextView) b.findChildViewById(view, R.id.rgpd8);
                                                                    if (textView8 != null) {
                                                                        i10 = R.id.rgpd9;
                                                                        TextView textView9 = (TextView) b.findChildViewById(view, R.id.rgpd9);
                                                                        if (textView9 != null) {
                                                                            i10 = R.id.textBienvenue;
                                                                            TextView textView10 = (TextView) b.findChildViewById(view, R.id.textBienvenue);
                                                                            if (textView10 != null) {
                                                                                i10 = R.id.zoneTextRGPD;
                                                                                RelativeLayout relativeLayout3 = (RelativeLayout) b.findChildViewById(view, R.id.zoneTextRGPD);
                                                                                if (relativeLayout3 != null) {
                                                                                    return new LayoutAlerteRgpdBinding((RelativeLayout) view, imageView, imageView2, imageView3, relativeLayout, relativeLayout2, linearLayout, akinatorSmallButton, akinatorSmallButton2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, relativeLayout3);
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

    public static LayoutAlerteRgpdBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutAlerteRgpdBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_alerte_rgpd, viewGroup, false);
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
