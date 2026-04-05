package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivityPartageVideoBinding implements a {
    public final ImageView cancelButton;
    public final Guideline decalageBas;
    public final Guideline decalageDroit;
    public final Guideline decalageGauche;
    public final Guideline decalageHaut;
    public final ImageView deleteButton;
    public final RelativeLayout layoutButtons;
    public final ConstraintLayout mainPartageView;
    public final ImageView partageButton;
    private final ConstraintLayout rootView;
    public final VideoView videoPreview;

    private ActivityPartageVideoBinding(ConstraintLayout constraintLayout, ImageView imageView, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, ImageView imageView2, RelativeLayout relativeLayout, ConstraintLayout constraintLayout2, ImageView imageView3, VideoView videoView) {
        this.rootView = constraintLayout;
        this.cancelButton = imageView;
        this.decalageBas = guideline;
        this.decalageDroit = guideline2;
        this.decalageGauche = guideline3;
        this.decalageHaut = guideline4;
        this.deleteButton = imageView2;
        this.layoutButtons = relativeLayout;
        this.mainPartageView = constraintLayout2;
        this.partageButton = imageView3;
        this.videoPreview = videoView;
    }

    public static ActivityPartageVideoBinding bind(View view) {
        int i10 = R.id.cancelButton;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.cancelButton);
        if (imageView != null) {
            i10 = R.id.decalage_bas;
            Guideline guideline = (Guideline) b.findChildViewById(view, R.id.decalage_bas);
            if (guideline != null) {
                i10 = R.id.decalage_droit;
                Guideline guideline2 = (Guideline) b.findChildViewById(view, R.id.decalage_droit);
                if (guideline2 != null) {
                    i10 = R.id.decalage_gauche;
                    Guideline guideline3 = (Guideline) b.findChildViewById(view, R.id.decalage_gauche);
                    if (guideline3 != null) {
                        i10 = R.id.decalage_haut;
                        Guideline guideline4 = (Guideline) b.findChildViewById(view, R.id.decalage_haut);
                        if (guideline4 != null) {
                            i10 = R.id.deleteButton;
                            ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.deleteButton);
                            if (imageView2 != null) {
                                i10 = R.id.layoutButtons;
                                RelativeLayout relativeLayout = (RelativeLayout) b.findChildViewById(view, R.id.layoutButtons);
                                if (relativeLayout != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                    i10 = R.id.partageButton;
                                    ImageView imageView3 = (ImageView) b.findChildViewById(view, R.id.partageButton);
                                    if (imageView3 != null) {
                                        i10 = R.id.videoPreview;
                                        VideoView videoView = (VideoView) b.findChildViewById(view, R.id.videoPreview);
                                        if (videoView != null) {
                                            return new ActivityPartageVideoBinding(constraintLayout, imageView, guideline, guideline2, guideline3, guideline4, imageView2, relativeLayout, constraintLayout, imageView3, videoView);
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

    public static ActivityPartageVideoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityPartageVideoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_partage_video, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
