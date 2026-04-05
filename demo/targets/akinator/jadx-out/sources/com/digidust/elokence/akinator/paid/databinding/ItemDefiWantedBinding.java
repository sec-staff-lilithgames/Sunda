package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ItemDefiWantedBinding implements a {
    public final Guideline bottomBulleGuide;
    public final Guideline bottomGuide;
    public final Guideline bottomPhotoGuide;
    public final TextView defiGz;
    public final TextView defiPourcentText;
    public final ImageView imagePersoWanted;
    public final ImageView layoutPersoIndice;
    public final ConstraintLayout layoutPersoPourcent;
    public final Guideline leftBulleGuide;
    public final Guideline leftGuide;
    public final Guideline leftIndiceGuide;
    public final Guideline leftPcGuide;
    public final Guideline leftPhotoGuide;
    public final Guideline leftTextGuide;
    public final Guideline rightBulleGuide;
    public final Guideline rightGuide;
    public final Guideline rightIndiceGuide;
    public final Guideline rightPcGuide;
    public final Guideline rightPhotoGuide;
    public final Guideline rightTextGuide;
    private final RelativeLayout rootView;
    public final Guideline topBulleGuide;
    public final Guideline topGuide;
    public final Guideline topPhotoGuide;
    public final Guideline topTextGuide;

    private ItemDefiWantedBinding(RelativeLayout relativeLayout, Guideline guideline, Guideline guideline2, Guideline guideline3, TextView textView, TextView textView2, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, Guideline guideline4, Guideline guideline5, Guideline guideline6, Guideline guideline7, Guideline guideline8, Guideline guideline9, Guideline guideline10, Guideline guideline11, Guideline guideline12, Guideline guideline13, Guideline guideline14, Guideline guideline15, Guideline guideline16, Guideline guideline17, Guideline guideline18, Guideline guideline19) {
        this.rootView = relativeLayout;
        this.bottomBulleGuide = guideline;
        this.bottomGuide = guideline2;
        this.bottomPhotoGuide = guideline3;
        this.defiGz = textView;
        this.defiPourcentText = textView2;
        this.imagePersoWanted = imageView;
        this.layoutPersoIndice = imageView2;
        this.layoutPersoPourcent = constraintLayout;
        this.leftBulleGuide = guideline4;
        this.leftGuide = guideline5;
        this.leftIndiceGuide = guideline6;
        this.leftPcGuide = guideline7;
        this.leftPhotoGuide = guideline8;
        this.leftTextGuide = guideline9;
        this.rightBulleGuide = guideline10;
        this.rightGuide = guideline11;
        this.rightIndiceGuide = guideline12;
        this.rightPcGuide = guideline13;
        this.rightPhotoGuide = guideline14;
        this.rightTextGuide = guideline15;
        this.topBulleGuide = guideline16;
        this.topGuide = guideline17;
        this.topPhotoGuide = guideline18;
        this.topTextGuide = guideline19;
    }

    public static ItemDefiWantedBinding bind(View view) {
        int i10 = R.id.bottomBulle_guide;
        Guideline guideline = (Guideline) b.findChildViewById(view, R.id.bottomBulle_guide);
        if (guideline != null) {
            i10 = R.id.bottom_guide;
            Guideline guideline2 = (Guideline) b.findChildViewById(view, R.id.bottom_guide);
            if (guideline2 != null) {
                i10 = R.id.bottomPhoto_guide;
                Guideline guideline3 = (Guideline) b.findChildViewById(view, R.id.bottomPhoto_guide);
                if (guideline3 != null) {
                    i10 = R.id.defiGz;
                    TextView textView = (TextView) b.findChildViewById(view, R.id.defiGz);
                    if (textView != null) {
                        i10 = R.id.defiPourcentText;
                        TextView textView2 = (TextView) b.findChildViewById(view, R.id.defiPourcentText);
                        if (textView2 != null) {
                            i10 = R.id.imagePersoWanted;
                            ImageView imageView = (ImageView) b.findChildViewById(view, R.id.imagePersoWanted);
                            if (imageView != null) {
                                i10 = R.id.layoutPersoIndice;
                                ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.layoutPersoIndice);
                                if (imageView2 != null) {
                                    i10 = R.id.layoutPersoPourcent;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) b.findChildViewById(view, R.id.layoutPersoPourcent);
                                    if (constraintLayout != null) {
                                        i10 = R.id.leftBulle_guide;
                                        Guideline guideline4 = (Guideline) b.findChildViewById(view, R.id.leftBulle_guide);
                                        if (guideline4 != null) {
                                            i10 = R.id.left_guide;
                                            Guideline guideline5 = (Guideline) b.findChildViewById(view, R.id.left_guide);
                                            if (guideline5 != null) {
                                                i10 = R.id.leftIndice_guide;
                                                Guideline guideline6 = (Guideline) b.findChildViewById(view, R.id.leftIndice_guide);
                                                if (guideline6 != null) {
                                                    i10 = R.id.leftPc_guide;
                                                    Guideline guideline7 = (Guideline) b.findChildViewById(view, R.id.leftPc_guide);
                                                    if (guideline7 != null) {
                                                        i10 = R.id.leftPhoto_guide;
                                                        Guideline guideline8 = (Guideline) b.findChildViewById(view, R.id.leftPhoto_guide);
                                                        if (guideline8 != null) {
                                                            i10 = R.id.leftText_guide;
                                                            Guideline guideline9 = (Guideline) b.findChildViewById(view, R.id.leftText_guide);
                                                            if (guideline9 != null) {
                                                                i10 = R.id.rightBulle_guide;
                                                                Guideline guideline10 = (Guideline) b.findChildViewById(view, R.id.rightBulle_guide);
                                                                if (guideline10 != null) {
                                                                    i10 = R.id.right_guide;
                                                                    Guideline guideline11 = (Guideline) b.findChildViewById(view, R.id.right_guide);
                                                                    if (guideline11 != null) {
                                                                        i10 = R.id.rightIndice_guide;
                                                                        Guideline guideline12 = (Guideline) b.findChildViewById(view, R.id.rightIndice_guide);
                                                                        if (guideline12 != null) {
                                                                            i10 = R.id.rightPc_guide;
                                                                            Guideline guideline13 = (Guideline) b.findChildViewById(view, R.id.rightPc_guide);
                                                                            if (guideline13 != null) {
                                                                                i10 = R.id.rightPhoto_guide;
                                                                                Guideline guideline14 = (Guideline) b.findChildViewById(view, R.id.rightPhoto_guide);
                                                                                if (guideline14 != null) {
                                                                                    i10 = R.id.rightText_guide;
                                                                                    Guideline guideline15 = (Guideline) b.findChildViewById(view, R.id.rightText_guide);
                                                                                    if (guideline15 != null) {
                                                                                        i10 = R.id.topBulle_guide;
                                                                                        Guideline guideline16 = (Guideline) b.findChildViewById(view, R.id.topBulle_guide);
                                                                                        if (guideline16 != null) {
                                                                                            i10 = R.id.top_guide;
                                                                                            Guideline guideline17 = (Guideline) b.findChildViewById(view, R.id.top_guide);
                                                                                            if (guideline17 != null) {
                                                                                                i10 = R.id.topPhoto_guide;
                                                                                                Guideline guideline18 = (Guideline) b.findChildViewById(view, R.id.topPhoto_guide);
                                                                                                if (guideline18 != null) {
                                                                                                    i10 = R.id.topText_guide;
                                                                                                    Guideline guideline19 = (Guideline) b.findChildViewById(view, R.id.topText_guide);
                                                                                                    if (guideline19 != null) {
                                                                                                        return new ItemDefiWantedBinding((RelativeLayout) view, guideline, guideline2, guideline3, textView, textView2, imageView, imageView2, constraintLayout, guideline4, guideline5, guideline6, guideline7, guideline8, guideline9, guideline10, guideline11, guideline12, guideline13, guideline14, guideline15, guideline16, guideline17, guideline18, guideline19);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemDefiWantedBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemDefiWantedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_defi_wanted, viewGroup, false);
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
