package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.AkinatorNormalButton;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivityPostHomeSliderBinding implements a {
    public final FrameLayout container;
    public final AkinatorNormalButton goButton;
    public final ImageView imageFiltreEnfant;
    public final ImageView imageFond;
    public final RelativeLayout layoutBottom;
    public final FrameLayout layoutSliderFragment;
    public final LayoutSubjectIconTopBinding layoutSubjectIconTop;
    public final RelativeLayout mainLayout;
    public final View overlayCachePostHome;
    public final ImageView retourButton;
    private final RelativeLayout rootView;

    private ActivityPostHomeSliderBinding(RelativeLayout relativeLayout, FrameLayout frameLayout, AkinatorNormalButton akinatorNormalButton, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout2, FrameLayout frameLayout2, LayoutSubjectIconTopBinding layoutSubjectIconTopBinding, RelativeLayout relativeLayout3, View view, ImageView imageView3) {
        this.rootView = relativeLayout;
        this.container = frameLayout;
        this.goButton = akinatorNormalButton;
        this.imageFiltreEnfant = imageView;
        this.imageFond = imageView2;
        this.layoutBottom = relativeLayout2;
        this.layoutSliderFragment = frameLayout2;
        this.layoutSubjectIconTop = layoutSubjectIconTopBinding;
        this.mainLayout = relativeLayout3;
        this.overlayCachePostHome = view;
        this.retourButton = imageView3;
    }

    public static ActivityPostHomeSliderBinding bind(View view) {
        int i10 = R.id.container;
        FrameLayout frameLayout = (FrameLayout) b.findChildViewById(view, R.id.container);
        if (frameLayout != null) {
            i10 = R.id.goButton;
            AkinatorNormalButton akinatorNormalButton = (AkinatorNormalButton) b.findChildViewById(view, R.id.goButton);
            if (akinatorNormalButton != null) {
                i10 = R.id.image_filtre_enfant;
                ImageView imageView = (ImageView) b.findChildViewById(view, R.id.image_filtre_enfant);
                if (imageView != null) {
                    i10 = R.id.imageFond;
                    ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.imageFond);
                    if (imageView2 != null) {
                        i10 = R.id.layoutBottom;
                        RelativeLayout relativeLayout = (RelativeLayout) b.findChildViewById(view, R.id.layoutBottom);
                        if (relativeLayout != null) {
                            i10 = R.id.layoutSliderFragment;
                            FrameLayout frameLayout2 = (FrameLayout) b.findChildViewById(view, R.id.layoutSliderFragment);
                            if (frameLayout2 != null) {
                                i10 = R.id.layoutSubjectIconTop;
                                View viewFindChildViewById = b.findChildViewById(view, R.id.layoutSubjectIconTop);
                                if (viewFindChildViewById != null) {
                                    LayoutSubjectIconTopBinding layoutSubjectIconTopBindingBind = LayoutSubjectIconTopBinding.bind(viewFindChildViewById);
                                    RelativeLayout relativeLayout2 = (RelativeLayout) view;
                                    i10 = R.id.overlayCachePostHome;
                                    View viewFindChildViewById2 = b.findChildViewById(view, R.id.overlayCachePostHome);
                                    if (viewFindChildViewById2 != null) {
                                        i10 = R.id.retourButton;
                                        ImageView imageView3 = (ImageView) b.findChildViewById(view, R.id.retourButton);
                                        if (imageView3 != null) {
                                            return new ActivityPostHomeSliderBinding(relativeLayout2, frameLayout, akinatorNormalButton, imageView, imageView2, relativeLayout, frameLayout2, layoutSubjectIconTopBindingBind, relativeLayout2, viewFindChildViewById2, imageView3);
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

    public static ActivityPostHomeSliderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityPostHomeSliderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_post_home_slider, viewGroup, false);
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
