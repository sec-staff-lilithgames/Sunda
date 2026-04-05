package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class LayoutOneClassementBinding implements a {
    public final TextView classementBadgeBlack;
    public final TextView classementBadgeBronze;
    public final TextView classementBadgeDdj;
    public final TextView classementBadgeGold;
    public final TextView classementBadgePlatinum;
    public final TextView classementBadgeSilver;
    public final TextView classementMedaille;
    public final TextView classementNom;
    public final TextView classementRang;
    public final ImageView classementRangImage;
    public final TextView classementScore;
    public final ImageView imageActif;
    private final LinearLayout rootView;

    private LayoutOneClassementBinding(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, ImageView imageView, TextView textView10, ImageView imageView2) {
        this.rootView = linearLayout;
        this.classementBadgeBlack = textView;
        this.classementBadgeBronze = textView2;
        this.classementBadgeDdj = textView3;
        this.classementBadgeGold = textView4;
        this.classementBadgePlatinum = textView5;
        this.classementBadgeSilver = textView6;
        this.classementMedaille = textView7;
        this.classementNom = textView8;
        this.classementRang = textView9;
        this.classementRangImage = imageView;
        this.classementScore = textView10;
        this.imageActif = imageView2;
    }

    public static LayoutOneClassementBinding bind(View view) {
        int i10 = R.id.classementBadgeBlack;
        TextView textView = (TextView) b.findChildViewById(view, R.id.classementBadgeBlack);
        if (textView != null) {
            i10 = R.id.classementBadgeBronze;
            TextView textView2 = (TextView) b.findChildViewById(view, R.id.classementBadgeBronze);
            if (textView2 != null) {
                i10 = R.id.classementBadgeDdj;
                TextView textView3 = (TextView) b.findChildViewById(view, R.id.classementBadgeDdj);
                if (textView3 != null) {
                    i10 = R.id.classementBadgeGold;
                    TextView textView4 = (TextView) b.findChildViewById(view, R.id.classementBadgeGold);
                    if (textView4 != null) {
                        i10 = R.id.classementBadgePlatinum;
                        TextView textView5 = (TextView) b.findChildViewById(view, R.id.classementBadgePlatinum);
                        if (textView5 != null) {
                            i10 = R.id.classementBadgeSilver;
                            TextView textView6 = (TextView) b.findChildViewById(view, R.id.classementBadgeSilver);
                            if (textView6 != null) {
                                i10 = R.id.classementMedaille;
                                TextView textView7 = (TextView) b.findChildViewById(view, R.id.classementMedaille);
                                if (textView7 != null) {
                                    i10 = R.id.classementNom;
                                    TextView textView8 = (TextView) b.findChildViewById(view, R.id.classementNom);
                                    if (textView8 != null) {
                                        i10 = R.id.classementRang;
                                        TextView textView9 = (TextView) b.findChildViewById(view, R.id.classementRang);
                                        if (textView9 != null) {
                                            i10 = R.id.classementRangImage;
                                            ImageView imageView = (ImageView) b.findChildViewById(view, R.id.classementRangImage);
                                            if (imageView != null) {
                                                i10 = R.id.classementScore;
                                                TextView textView10 = (TextView) b.findChildViewById(view, R.id.classementScore);
                                                if (textView10 != null) {
                                                    i10 = R.id.imageActif;
                                                    ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.imageActif);
                                                    if (imageView2 != null) {
                                                        return new LayoutOneClassementBinding((LinearLayout) view, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, imageView, textView10, imageView2);
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

    public static LayoutOneClassementBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutOneClassementBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_one_classement, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
