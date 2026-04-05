package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ItemDefiPersoBinding implements a {
    public final Guideline bottomPhotoGuide;
    public final ImageView imagePersoTrouve;
    public final ImageView imagePersoWanted;
    public final LinearLayout layoutCharacter;
    public final Guideline leftPhotoGuide;
    public final View line;
    public final TextView nomPersoDefi;
    public final Guideline rightPhotoGuide;
    private final RelativeLayout rootView;
    public final Guideline topPhotoGuide;

    private ItemDefiPersoBinding(RelativeLayout relativeLayout, Guideline guideline, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, Guideline guideline2, View view, TextView textView, Guideline guideline3, Guideline guideline4) {
        this.rootView = relativeLayout;
        this.bottomPhotoGuide = guideline;
        this.imagePersoTrouve = imageView;
        this.imagePersoWanted = imageView2;
        this.layoutCharacter = linearLayout;
        this.leftPhotoGuide = guideline2;
        this.line = view;
        this.nomPersoDefi = textView;
        this.rightPhotoGuide = guideline3;
        this.topPhotoGuide = guideline4;
    }

    public static ItemDefiPersoBinding bind(View view) {
        int i10 = R.id.bottomPhoto_guide;
        Guideline guideline = (Guideline) b.findChildViewById(view, R.id.bottomPhoto_guide);
        if (guideline != null) {
            i10 = R.id.imagePersoTrouve;
            ImageView imageView = (ImageView) b.findChildViewById(view, R.id.imagePersoTrouve);
            if (imageView != null) {
                i10 = R.id.imagePersoWanted;
                ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.imagePersoWanted);
                if (imageView2 != null) {
                    i10 = R.id.layoutCharacter;
                    LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.layoutCharacter);
                    if (linearLayout != null) {
                        i10 = R.id.leftPhoto_guide;
                        Guideline guideline2 = (Guideline) b.findChildViewById(view, R.id.leftPhoto_guide);
                        if (guideline2 != null) {
                            i10 = R.id.line;
                            View viewFindChildViewById = b.findChildViewById(view, R.id.line);
                            if (viewFindChildViewById != null) {
                                i10 = R.id.nomPersoDefi;
                                TextView textView = (TextView) b.findChildViewById(view, R.id.nomPersoDefi);
                                if (textView != null) {
                                    i10 = R.id.rightPhoto_guide;
                                    Guideline guideline3 = (Guideline) b.findChildViewById(view, R.id.rightPhoto_guide);
                                    if (guideline3 != null) {
                                        i10 = R.id.topPhoto_guide;
                                        Guideline guideline4 = (Guideline) b.findChildViewById(view, R.id.topPhoto_guide);
                                        if (guideline4 != null) {
                                            return new ItemDefiPersoBinding((RelativeLayout) view, guideline, imageView, imageView2, linearLayout, guideline2, viewFindChildViewById, textView, guideline3, guideline4);
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

    public static ItemDefiPersoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemDefiPersoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_defi_perso, viewGroup, false);
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
