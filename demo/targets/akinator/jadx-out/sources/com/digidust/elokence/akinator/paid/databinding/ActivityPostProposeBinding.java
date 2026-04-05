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
import com.digidust.elokence.akinator.graphic.AkinatorAddMagicButton;
import com.digidust.elokence.akinator.graphic.AkinatorNormalButton;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivityPostProposeBinding implements a {
    public final LayoutRejectedCheckingBinding badgePiege;
    public final AkinatorNormalButton cadeauRV;
    public final FrameLayout container;
    public final ImageView croixNotFirstTime;
    public final LayoutGenizBinding genizLayout;
    public final ImageView imageAward;
    public final RelativeLayout layoutAward;
    public final LinearLayout layoutGZplus;
    public final RelativeLayout layoutPostPropose;
    public final AkinatorAddMagicButton okButton;
    private final RelativeLayout rootView;
    public final TextView textAwardPart1;
    public final TextView textAwardPart2;
    public final LinearLayout textCongratulation;
    public final TextView textGzWon;

    private ActivityPostProposeBinding(RelativeLayout relativeLayout, LayoutRejectedCheckingBinding layoutRejectedCheckingBinding, AkinatorNormalButton akinatorNormalButton, FrameLayout frameLayout, ImageView imageView, LayoutGenizBinding layoutGenizBinding, ImageView imageView2, RelativeLayout relativeLayout2, LinearLayout linearLayout, RelativeLayout relativeLayout3, AkinatorAddMagicButton akinatorAddMagicButton, TextView textView, TextView textView2, LinearLayout linearLayout2, TextView textView3) {
        this.rootView = relativeLayout;
        this.badgePiege = layoutRejectedCheckingBinding;
        this.cadeauRV = akinatorNormalButton;
        this.container = frameLayout;
        this.croixNotFirstTime = imageView;
        this.genizLayout = layoutGenizBinding;
        this.imageAward = imageView2;
        this.layoutAward = relativeLayout2;
        this.layoutGZplus = linearLayout;
        this.layoutPostPropose = relativeLayout3;
        this.okButton = akinatorAddMagicButton;
        this.textAwardPart1 = textView;
        this.textAwardPart2 = textView2;
        this.textCongratulation = linearLayout2;
        this.textGzWon = textView3;
    }

    public static ActivityPostProposeBinding bind(View view) {
        int i10 = R.id.badgePiege;
        View viewFindChildViewById = b.findChildViewById(view, R.id.badgePiege);
        if (viewFindChildViewById != null) {
            LayoutRejectedCheckingBinding layoutRejectedCheckingBindingBind = LayoutRejectedCheckingBinding.bind(viewFindChildViewById);
            i10 = R.id.cadeauRV;
            AkinatorNormalButton akinatorNormalButton = (AkinatorNormalButton) b.findChildViewById(view, R.id.cadeauRV);
            if (akinatorNormalButton != null) {
                i10 = R.id.container;
                FrameLayout frameLayout = (FrameLayout) b.findChildViewById(view, R.id.container);
                if (frameLayout != null) {
                    i10 = R.id.croixNotFirstTime;
                    ImageView imageView = (ImageView) b.findChildViewById(view, R.id.croixNotFirstTime);
                    if (imageView != null) {
                        i10 = R.id.genizLayout;
                        View viewFindChildViewById2 = b.findChildViewById(view, R.id.genizLayout);
                        if (viewFindChildViewById2 != null) {
                            LayoutGenizBinding layoutGenizBindingBind = LayoutGenizBinding.bind(viewFindChildViewById2);
                            i10 = R.id.imageAward;
                            ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.imageAward);
                            if (imageView2 != null) {
                                i10 = R.id.layoutAward;
                                RelativeLayout relativeLayout = (RelativeLayout) b.findChildViewById(view, R.id.layoutAward);
                                if (relativeLayout != null) {
                                    i10 = R.id.layoutGZplus;
                                    LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.layoutGZplus);
                                    if (linearLayout != null) {
                                        RelativeLayout relativeLayout2 = (RelativeLayout) view;
                                        i10 = R.id.okButton;
                                        AkinatorAddMagicButton akinatorAddMagicButton = (AkinatorAddMagicButton) b.findChildViewById(view, R.id.okButton);
                                        if (akinatorAddMagicButton != null) {
                                            i10 = R.id.textAwardPart1;
                                            TextView textView = (TextView) b.findChildViewById(view, R.id.textAwardPart1);
                                            if (textView != null) {
                                                i10 = R.id.textAwardPart2;
                                                TextView textView2 = (TextView) b.findChildViewById(view, R.id.textAwardPart2);
                                                if (textView2 != null) {
                                                    i10 = R.id.textCongratulation;
                                                    LinearLayout linearLayout2 = (LinearLayout) b.findChildViewById(view, R.id.textCongratulation);
                                                    if (linearLayout2 != null) {
                                                        i10 = R.id.textGzWon;
                                                        TextView textView3 = (TextView) b.findChildViewById(view, R.id.textGzWon);
                                                        if (textView3 != null) {
                                                            return new ActivityPostProposeBinding(relativeLayout2, layoutRejectedCheckingBindingBind, akinatorNormalButton, frameLayout, imageView, layoutGenizBindingBind, imageView2, relativeLayout, linearLayout, relativeLayout2, akinatorAddMagicButton, textView, textView2, linearLayout2, textView3);
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

    public static ActivityPostProposeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityPostProposeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_post_propose, viewGroup, false);
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
