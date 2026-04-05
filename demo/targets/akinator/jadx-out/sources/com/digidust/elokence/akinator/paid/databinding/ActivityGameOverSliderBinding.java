package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.AkinatorNormalButton;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivityGameOverSliderBinding implements a {
    public final FrameLayout container;
    public final FrameLayout containerAddMagic;
    public final FrameLayout containerCross;
    public final LayoutHomeButtonBinding homeButton;
    public final ImageView imageBackground;
    public final ImageView imageFiltreEnfant;
    public final ImageView imageGz;
    public final RelativeLayout layoutBottom;
    public final LinearLayout layoutGz;
    public final FrameLayout layoutSliderFragment;
    public final RelativeLayout mainLayout;
    public final AkinatorNormalButton rejouerButton;
    private final RelativeLayout rootView;
    public final TextView textScoreGz;

    private ActivityGameOverSliderBinding(RelativeLayout relativeLayout, FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, LayoutHomeButtonBinding layoutHomeButtonBinding, ImageView imageView, ImageView imageView2, ImageView imageView3, RelativeLayout relativeLayout2, LinearLayout linearLayout, FrameLayout frameLayout4, RelativeLayout relativeLayout3, AkinatorNormalButton akinatorNormalButton, TextView textView) {
        this.rootView = relativeLayout;
        this.container = frameLayout;
        this.containerAddMagic = frameLayout2;
        this.containerCross = frameLayout3;
        this.homeButton = layoutHomeButtonBinding;
        this.imageBackground = imageView;
        this.imageFiltreEnfant = imageView2;
        this.imageGz = imageView3;
        this.layoutBottom = relativeLayout2;
        this.layoutGz = linearLayout;
        this.layoutSliderFragment = frameLayout4;
        this.mainLayout = relativeLayout3;
        this.rejouerButton = akinatorNormalButton;
        this.textScoreGz = textView;
    }

    public static ActivityGameOverSliderBinding bind(View view) {
        int i10 = R.id.container;
        FrameLayout frameLayout = (FrameLayout) b.findChildViewById(view, R.id.container);
        if (frameLayout != null) {
            i10 = R.id.containerAddMagic;
            FrameLayout frameLayout2 = (FrameLayout) b.findChildViewById(view, R.id.containerAddMagic);
            if (frameLayout2 != null) {
                i10 = R.id.containerCross;
                FrameLayout frameLayout3 = (FrameLayout) b.findChildViewById(view, R.id.containerCross);
                if (frameLayout3 != null) {
                    i10 = R.id.homeButton;
                    View viewFindChildViewById = b.findChildViewById(view, R.id.homeButton);
                    if (viewFindChildViewById != null) {
                        LayoutHomeButtonBinding layoutHomeButtonBindingBind = LayoutHomeButtonBinding.bind(viewFindChildViewById);
                        i10 = R.id.imageBackground;
                        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.imageBackground);
                        if (imageView != null) {
                            i10 = R.id.image_filtre_enfant;
                            ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.image_filtre_enfant);
                            if (imageView2 != null) {
                                i10 = R.id.imageGz;
                                ImageView imageView3 = (ImageView) b.findChildViewById(view, R.id.imageGz);
                                if (imageView3 != null) {
                                    i10 = R.id.layoutBottom;
                                    RelativeLayout relativeLayout = (RelativeLayout) b.findChildViewById(view, R.id.layoutBottom);
                                    if (relativeLayout != null) {
                                        i10 = R.id.layoutGz;
                                        LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.layoutGz);
                                        if (linearLayout != null) {
                                            i10 = R.id.layoutSliderFragment;
                                            FrameLayout frameLayout4 = (FrameLayout) b.findChildViewById(view, R.id.layoutSliderFragment);
                                            if (frameLayout4 != null) {
                                                RelativeLayout relativeLayout2 = (RelativeLayout) view;
                                                i10 = R.id.rejouerButton;
                                                AkinatorNormalButton akinatorNormalButton = (AkinatorNormalButton) b.findChildViewById(view, R.id.rejouerButton);
                                                if (akinatorNormalButton != null) {
                                                    i10 = R.id.textScoreGz;
                                                    TextView textView = (TextView) b.findChildViewById(view, R.id.textScoreGz);
                                                    if (textView != null) {
                                                        return new ActivityGameOverSliderBinding(relativeLayout2, frameLayout, frameLayout2, frameLayout3, layoutHomeButtonBindingBind, imageView, imageView2, imageView3, relativeLayout, linearLayout, frameLayout4, relativeLayout2, akinatorNormalButton, textView);
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

    public static ActivityGameOverSliderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityGameOverSliderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_game_over_slider, viewGroup, false);
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
