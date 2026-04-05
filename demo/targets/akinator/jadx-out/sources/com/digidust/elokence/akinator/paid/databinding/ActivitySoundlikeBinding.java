package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivitySoundlikeBinding implements a {
    public final ImageView backgroundImage;
    public final LayoutHomeButtonBinding homeButton;
    public final ImageView layoutBanner;
    public final FrameLayout layoutFragmentContainer;
    public final LayoutSubjectIconTopBinding layoutIconTop;
    public final RelativeLayout mainLayout;
    private final RelativeLayout rootView;
    public final TextView titleText;

    private ActivitySoundlikeBinding(RelativeLayout relativeLayout, ImageView imageView, LayoutHomeButtonBinding layoutHomeButtonBinding, ImageView imageView2, FrameLayout frameLayout, LayoutSubjectIconTopBinding layoutSubjectIconTopBinding, RelativeLayout relativeLayout2, TextView textView) {
        this.rootView = relativeLayout;
        this.backgroundImage = imageView;
        this.homeButton = layoutHomeButtonBinding;
        this.layoutBanner = imageView2;
        this.layoutFragmentContainer = frameLayout;
        this.layoutIconTop = layoutSubjectIconTopBinding;
        this.mainLayout = relativeLayout2;
        this.titleText = textView;
    }

    public static ActivitySoundlikeBinding bind(View view) {
        int i10 = R.id.backgroundImage;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.backgroundImage);
        if (imageView != null) {
            i10 = R.id.homeButton;
            View viewFindChildViewById = b.findChildViewById(view, R.id.homeButton);
            if (viewFindChildViewById != null) {
                LayoutHomeButtonBinding layoutHomeButtonBindingBind = LayoutHomeButtonBinding.bind(viewFindChildViewById);
                i10 = R.id.layoutBanner;
                ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.layoutBanner);
                if (imageView2 != null) {
                    i10 = R.id.layoutFragmentContainer;
                    FrameLayout frameLayout = (FrameLayout) b.findChildViewById(view, R.id.layoutFragmentContainer);
                    if (frameLayout != null) {
                        i10 = R.id.layoutIconTop;
                        View viewFindChildViewById2 = b.findChildViewById(view, R.id.layoutIconTop);
                        if (viewFindChildViewById2 != null) {
                            LayoutSubjectIconTopBinding layoutSubjectIconTopBindingBind = LayoutSubjectIconTopBinding.bind(viewFindChildViewById2);
                            RelativeLayout relativeLayout = (RelativeLayout) view;
                            i10 = R.id.titleText;
                            TextView textView = (TextView) b.findChildViewById(view, R.id.titleText);
                            if (textView != null) {
                                return new ActivitySoundlikeBinding(relativeLayout, imageView, layoutHomeButtonBindingBind, imageView2, frameLayout, layoutSubjectIconTopBindingBind, relativeLayout, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivitySoundlikeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySoundlikeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_soundlike, viewGroup, false);
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
