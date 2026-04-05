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
import com.digidust.elokence.akinator.graphic.AkinatorSmallButton;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivityContinueProcessBinding implements a {
    public final ImageView akinatorChapeau;
    public final ImageView akinatorImage;
    public final ImageView akinatorTenue;
    public final View backButtonImage;
    public final TextView bulleText;
    public final FrameLayout bulleTextLayout;
    public final LinearLayout continueButtons;
    public final LayoutGenizBinding genizLayout;
    public final LayoutHomeButtonBinding homeButton;
    public final ImageView imageBackground;
    public final RelativeLayout layoutAkinator;
    public final RelativeLayout mainLayout;
    public final AkinatorSmallButton noContinueButton;
    public final View partageButton;
    private final RelativeLayout rootView;
    public final AkinatorSmallButton yesContinueButton;

    private ActivityContinueProcessBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, View view, TextView textView, FrameLayout frameLayout, LinearLayout linearLayout, LayoutGenizBinding layoutGenizBinding, LayoutHomeButtonBinding layoutHomeButtonBinding, ImageView imageView4, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, AkinatorSmallButton akinatorSmallButton, View view2, AkinatorSmallButton akinatorSmallButton2) {
        this.rootView = relativeLayout;
        this.akinatorChapeau = imageView;
        this.akinatorImage = imageView2;
        this.akinatorTenue = imageView3;
        this.backButtonImage = view;
        this.bulleText = textView;
        this.bulleTextLayout = frameLayout;
        this.continueButtons = linearLayout;
        this.genizLayout = layoutGenizBinding;
        this.homeButton = layoutHomeButtonBinding;
        this.imageBackground = imageView4;
        this.layoutAkinator = relativeLayout2;
        this.mainLayout = relativeLayout3;
        this.noContinueButton = akinatorSmallButton;
        this.partageButton = view2;
        this.yesContinueButton = akinatorSmallButton2;
    }

    public static ActivityContinueProcessBinding bind(View view) {
        int i10 = R.id.akinatorChapeau;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.akinatorChapeau);
        if (imageView != null) {
            i10 = R.id.akinatorImage;
            ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.akinatorImage);
            if (imageView2 != null) {
                i10 = R.id.akinatorTenue;
                ImageView imageView3 = (ImageView) b.findChildViewById(view, R.id.akinatorTenue);
                if (imageView3 != null) {
                    i10 = R.id.backButtonImage;
                    View viewFindChildViewById = b.findChildViewById(view, R.id.backButtonImage);
                    if (viewFindChildViewById != null) {
                        i10 = R.id.bulleText;
                        TextView textView = (TextView) b.findChildViewById(view, R.id.bulleText);
                        if (textView != null) {
                            i10 = R.id.bulleTextLayout;
                            FrameLayout frameLayout = (FrameLayout) b.findChildViewById(view, R.id.bulleTextLayout);
                            if (frameLayout != null) {
                                i10 = R.id.continueButtons;
                                LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.continueButtons);
                                if (linearLayout != null) {
                                    i10 = R.id.genizLayout;
                                    View viewFindChildViewById2 = b.findChildViewById(view, R.id.genizLayout);
                                    if (viewFindChildViewById2 != null) {
                                        LayoutGenizBinding layoutGenizBindingBind = LayoutGenizBinding.bind(viewFindChildViewById2);
                                        i10 = R.id.homeButton;
                                        View viewFindChildViewById3 = b.findChildViewById(view, R.id.homeButton);
                                        if (viewFindChildViewById3 != null) {
                                            LayoutHomeButtonBinding layoutHomeButtonBindingBind = LayoutHomeButtonBinding.bind(viewFindChildViewById3);
                                            i10 = R.id.imageBackground;
                                            ImageView imageView4 = (ImageView) b.findChildViewById(view, R.id.imageBackground);
                                            if (imageView4 != null) {
                                                i10 = R.id.layoutAkinator;
                                                RelativeLayout relativeLayout = (RelativeLayout) b.findChildViewById(view, R.id.layoutAkinator);
                                                if (relativeLayout != null) {
                                                    RelativeLayout relativeLayout2 = (RelativeLayout) view;
                                                    i10 = R.id.noContinueButton;
                                                    AkinatorSmallButton akinatorSmallButton = (AkinatorSmallButton) b.findChildViewById(view, R.id.noContinueButton);
                                                    if (akinatorSmallButton != null) {
                                                        i10 = R.id.partageButton;
                                                        View viewFindChildViewById4 = b.findChildViewById(view, R.id.partageButton);
                                                        if (viewFindChildViewById4 != null) {
                                                            i10 = R.id.yesContinueButton;
                                                            AkinatorSmallButton akinatorSmallButton2 = (AkinatorSmallButton) b.findChildViewById(view, R.id.yesContinueButton);
                                                            if (akinatorSmallButton2 != null) {
                                                                return new ActivityContinueProcessBinding(relativeLayout2, imageView, imageView2, imageView3, viewFindChildViewById, textView, frameLayout, linearLayout, layoutGenizBindingBind, layoutHomeButtonBindingBind, imageView4, relativeLayout, relativeLayout2, akinatorSmallButton, viewFindChildViewById4, akinatorSmallButton2);
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

    public static ActivityContinueProcessBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityContinueProcessBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_continue_process, viewGroup, false);
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
