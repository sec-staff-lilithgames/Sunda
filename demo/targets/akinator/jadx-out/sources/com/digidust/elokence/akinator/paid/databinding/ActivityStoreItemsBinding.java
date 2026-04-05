package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
public final class ActivityStoreItemsBinding implements a {
    public final ImageView akinatorChapeau;
    public final ImageView akinatorImage;
    public final ImageView akinatorTenue;
    public final Guideline bottomGuideline;
    public final Button buttonClothLeft;
    public final Button buttonClothRight;
    public final Button buttonHatLeft;
    public final Button buttonHatRight;
    public final ImageView imageArrowBottom;
    public final ImageView imageArrowCloth;
    public final RelativeLayout layoutAkinator;
    public final RelativeLayout layoutArrowBottom;
    public final RelativeLayout layoutArrowTop;
    public final ImageView retourButton;
    private final RelativeLayout rootView;
    public final LinearLayout storeSousHeaderLabo;
    public final TextView textArrowBottom;
    public final TextView textArrowCloth;
    public final Guideline topGuideline;
    public final Guideline topGuidelineFleche1;
    public final Guideline topGuidelineFleche2;

    private ActivityStoreItemsBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, Guideline guideline, Button button, Button button2, Button button3, Button button4, ImageView imageView4, ImageView imageView5, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, ImageView imageView6, LinearLayout linearLayout, TextView textView, TextView textView2, Guideline guideline2, Guideline guideline3, Guideline guideline4) {
        this.rootView = relativeLayout;
        this.akinatorChapeau = imageView;
        this.akinatorImage = imageView2;
        this.akinatorTenue = imageView3;
        this.bottomGuideline = guideline;
        this.buttonClothLeft = button;
        this.buttonClothRight = button2;
        this.buttonHatLeft = button3;
        this.buttonHatRight = button4;
        this.imageArrowBottom = imageView4;
        this.imageArrowCloth = imageView5;
        this.layoutAkinator = relativeLayout2;
        this.layoutArrowBottom = relativeLayout3;
        this.layoutArrowTop = relativeLayout4;
        this.retourButton = imageView6;
        this.storeSousHeaderLabo = linearLayout;
        this.textArrowBottom = textView;
        this.textArrowCloth = textView2;
        this.topGuideline = guideline2;
        this.topGuidelineFleche1 = guideline3;
        this.topGuidelineFleche2 = guideline4;
    }

    public static ActivityStoreItemsBinding bind(View view) {
        int i10 = R.id.akinatorChapeau;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.akinatorChapeau);
        if (imageView != null) {
            i10 = R.id.akinatorImage;
            ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.akinatorImage);
            if (imageView2 != null) {
                i10 = R.id.akinatorTenue;
                ImageView imageView3 = (ImageView) b.findChildViewById(view, R.id.akinatorTenue);
                if (imageView3 != null) {
                    i10 = R.id.bottom_guideline;
                    Guideline guideline = (Guideline) b.findChildViewById(view, R.id.bottom_guideline);
                    if (guideline != null) {
                        i10 = R.id.buttonClothLeft;
                        Button button = (Button) b.findChildViewById(view, R.id.buttonClothLeft);
                        if (button != null) {
                            i10 = R.id.buttonClothRight;
                            Button button2 = (Button) b.findChildViewById(view, R.id.buttonClothRight);
                            if (button2 != null) {
                                i10 = R.id.buttonHatLeft;
                                Button button3 = (Button) b.findChildViewById(view, R.id.buttonHatLeft);
                                if (button3 != null) {
                                    i10 = R.id.buttonHatRight;
                                    Button button4 = (Button) b.findChildViewById(view, R.id.buttonHatRight);
                                    if (button4 != null) {
                                        i10 = R.id.imageArrowBottom;
                                        ImageView imageView4 = (ImageView) b.findChildViewById(view, R.id.imageArrowBottom);
                                        if (imageView4 != null) {
                                            i10 = R.id.imageArrowCloth;
                                            ImageView imageView5 = (ImageView) b.findChildViewById(view, R.id.imageArrowCloth);
                                            if (imageView5 != null) {
                                                i10 = R.id.layoutAkinator;
                                                RelativeLayout relativeLayout = (RelativeLayout) b.findChildViewById(view, R.id.layoutAkinator);
                                                if (relativeLayout != null) {
                                                    i10 = R.id.layoutArrowBottom;
                                                    RelativeLayout relativeLayout2 = (RelativeLayout) b.findChildViewById(view, R.id.layoutArrowBottom);
                                                    if (relativeLayout2 != null) {
                                                        i10 = R.id.layoutArrowTop;
                                                        RelativeLayout relativeLayout3 = (RelativeLayout) b.findChildViewById(view, R.id.layoutArrowTop);
                                                        if (relativeLayout3 != null) {
                                                            i10 = R.id.retourButton;
                                                            ImageView imageView6 = (ImageView) b.findChildViewById(view, R.id.retourButton);
                                                            if (imageView6 != null) {
                                                                i10 = R.id.storeSousHeaderLabo;
                                                                LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.storeSousHeaderLabo);
                                                                if (linearLayout != null) {
                                                                    i10 = R.id.textArrowBottom;
                                                                    TextView textView = (TextView) b.findChildViewById(view, R.id.textArrowBottom);
                                                                    if (textView != null) {
                                                                        i10 = R.id.textArrowCloth;
                                                                        TextView textView2 = (TextView) b.findChildViewById(view, R.id.textArrowCloth);
                                                                        if (textView2 != null) {
                                                                            i10 = R.id.top_guideline;
                                                                            Guideline guideline2 = (Guideline) b.findChildViewById(view, R.id.top_guideline);
                                                                            if (guideline2 != null) {
                                                                                i10 = R.id.top_guidelineFleche1;
                                                                                Guideline guideline3 = (Guideline) b.findChildViewById(view, R.id.top_guidelineFleche1);
                                                                                if (guideline3 != null) {
                                                                                    i10 = R.id.top_guidelineFleche2;
                                                                                    Guideline guideline4 = (Guideline) b.findChildViewById(view, R.id.top_guidelineFleche2);
                                                                                    if (guideline4 != null) {
                                                                                        return new ActivityStoreItemsBinding((RelativeLayout) view, imageView, imageView2, imageView3, guideline, button, button2, button3, button4, imageView4, imageView5, relativeLayout, relativeLayout2, relativeLayout3, imageView6, linearLayout, textView, textView2, guideline2, guideline3, guideline4);
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

    public static ActivityStoreItemsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityStoreItemsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_store_items, viewGroup, false);
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
