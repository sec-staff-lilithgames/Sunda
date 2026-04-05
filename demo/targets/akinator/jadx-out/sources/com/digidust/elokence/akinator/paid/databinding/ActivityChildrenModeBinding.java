package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivityChildrenModeBinding implements a {
    public final ImageView backImage;
    public final ImageView childrenModeImage;
    public final RelativeLayout mainLayout;
    public final RelativeLayout relativeBackButton;
    private final RelativeLayout rootView;
    public final ImageView separation;
    public final ImageView separationSecond;
    public final RelativeLayout signalement;
    public final TextView textActivation;
    public final TextView textExplicatifChildrenVote;
    public final RelativeLayout textRelativeActivation;
    public final TextView textSignalement;
    public final TextView textSignalementExplication;
    public final TextView textTitleForm;
    public final RelativeLayout topTitle;

    private ActivityChildrenModeBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, ImageView imageView3, ImageView imageView4, RelativeLayout relativeLayout4, TextView textView, TextView textView2, RelativeLayout relativeLayout5, TextView textView3, TextView textView4, TextView textView5, RelativeLayout relativeLayout6) {
        this.rootView = relativeLayout;
        this.backImage = imageView;
        this.childrenModeImage = imageView2;
        this.mainLayout = relativeLayout2;
        this.relativeBackButton = relativeLayout3;
        this.separation = imageView3;
        this.separationSecond = imageView4;
        this.signalement = relativeLayout4;
        this.textActivation = textView;
        this.textExplicatifChildrenVote = textView2;
        this.textRelativeActivation = relativeLayout5;
        this.textSignalement = textView3;
        this.textSignalementExplication = textView4;
        this.textTitleForm = textView5;
        this.topTitle = relativeLayout6;
    }

    public static ActivityChildrenModeBinding bind(View view) {
        int i10 = R.id.backImage;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.backImage);
        if (imageView != null) {
            i10 = R.id.childrenModeImage;
            ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.childrenModeImage);
            if (imageView2 != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i10 = R.id.relativeBackButton;
                RelativeLayout relativeLayout2 = (RelativeLayout) b.findChildViewById(view, R.id.relativeBackButton);
                if (relativeLayout2 != null) {
                    i10 = R.id.separation;
                    ImageView imageView3 = (ImageView) b.findChildViewById(view, R.id.separation);
                    if (imageView3 != null) {
                        i10 = R.id.separationSecond;
                        ImageView imageView4 = (ImageView) b.findChildViewById(view, R.id.separationSecond);
                        if (imageView4 != null) {
                            i10 = R.id.signalement;
                            RelativeLayout relativeLayout3 = (RelativeLayout) b.findChildViewById(view, R.id.signalement);
                            if (relativeLayout3 != null) {
                                i10 = R.id.textActivation;
                                TextView textView = (TextView) b.findChildViewById(view, R.id.textActivation);
                                if (textView != null) {
                                    i10 = R.id.textExplicatifChildrenVote;
                                    TextView textView2 = (TextView) b.findChildViewById(view, R.id.textExplicatifChildrenVote);
                                    if (textView2 != null) {
                                        i10 = R.id.textRelativeActivation;
                                        RelativeLayout relativeLayout4 = (RelativeLayout) b.findChildViewById(view, R.id.textRelativeActivation);
                                        if (relativeLayout4 != null) {
                                            i10 = R.id.textSignalement;
                                            TextView textView3 = (TextView) b.findChildViewById(view, R.id.textSignalement);
                                            if (textView3 != null) {
                                                i10 = R.id.textSignalementExplication;
                                                TextView textView4 = (TextView) b.findChildViewById(view, R.id.textSignalementExplication);
                                                if (textView4 != null) {
                                                    i10 = R.id.textTitleForm;
                                                    TextView textView5 = (TextView) b.findChildViewById(view, R.id.textTitleForm);
                                                    if (textView5 != null) {
                                                        i10 = R.id.topTitle;
                                                        RelativeLayout relativeLayout5 = (RelativeLayout) b.findChildViewById(view, R.id.topTitle);
                                                        if (relativeLayout5 != null) {
                                                            return new ActivityChildrenModeBinding(relativeLayout, imageView, imageView2, relativeLayout, relativeLayout2, imageView3, imageView4, relativeLayout3, textView, textView2, relativeLayout4, textView3, textView4, textView5, relativeLayout5);
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

    public static ActivityChildrenModeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityChildrenModeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_children_mode, viewGroup, false);
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
