package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivityRateAppBinding implements a {
    public final Button buttonNoRateApp;
    public final ImageView imageStars;
    public final LinearLayout linearButton;
    public final LinearLayout linearLayout;
    public final RelativeLayout mainRelativeLayout;
    public final RelativeLayout noBanner;
    public final ImageView noButton;
    public final RelativeLayout noRateAppLayout;
    private final RelativeLayout rootView;
    public final TextView textNoDesctription;
    public final TextView textNoDesctription2;
    public final TextView textNoRateApp;
    public final TextView textYesDesctription;
    public final TextView textYesDesctription2;
    public final TextView textYesRateApp;
    public final RelativeLayout titleRateAppLayout;
    public final TextView titleRateAppText;
    public final RelativeLayout yesBanner;
    public final ImageView yesButton;
    public final RelativeLayout yesRateAppLayout;

    private ActivityRateAppBinding(RelativeLayout relativeLayout, Button button, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, ImageView imageView2, RelativeLayout relativeLayout4, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, RelativeLayout relativeLayout5, TextView textView7, RelativeLayout relativeLayout6, ImageView imageView3, RelativeLayout relativeLayout7) {
        this.rootView = relativeLayout;
        this.buttonNoRateApp = button;
        this.imageStars = imageView;
        this.linearButton = linearLayout;
        this.linearLayout = linearLayout2;
        this.mainRelativeLayout = relativeLayout2;
        this.noBanner = relativeLayout3;
        this.noButton = imageView2;
        this.noRateAppLayout = relativeLayout4;
        this.textNoDesctription = textView;
        this.textNoDesctription2 = textView2;
        this.textNoRateApp = textView3;
        this.textYesDesctription = textView4;
        this.textYesDesctription2 = textView5;
        this.textYesRateApp = textView6;
        this.titleRateAppLayout = relativeLayout5;
        this.titleRateAppText = textView7;
        this.yesBanner = relativeLayout6;
        this.yesButton = imageView3;
        this.yesRateAppLayout = relativeLayout7;
    }

    public static ActivityRateAppBinding bind(View view) {
        int i10 = R.id.buttonNoRateApp;
        Button button = (Button) b.findChildViewById(view, R.id.buttonNoRateApp);
        if (button != null) {
            i10 = R.id.imageStars;
            ImageView imageView = (ImageView) b.findChildViewById(view, R.id.imageStars);
            if (imageView != null) {
                i10 = R.id.linearButton;
                LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.linearButton);
                if (linearLayout != null) {
                    i10 = R.id.linearLayout;
                    LinearLayout linearLayout2 = (LinearLayout) b.findChildViewById(view, R.id.linearLayout);
                    if (linearLayout2 != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) view;
                        i10 = R.id.noBanner;
                        RelativeLayout relativeLayout2 = (RelativeLayout) b.findChildViewById(view, R.id.noBanner);
                        if (relativeLayout2 != null) {
                            i10 = R.id.noButton;
                            ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.noButton);
                            if (imageView2 != null) {
                                i10 = R.id.noRateAppLayout;
                                RelativeLayout relativeLayout3 = (RelativeLayout) b.findChildViewById(view, R.id.noRateAppLayout);
                                if (relativeLayout3 != null) {
                                    i10 = R.id.textNoDesctription;
                                    TextView textView = (TextView) b.findChildViewById(view, R.id.textNoDesctription);
                                    if (textView != null) {
                                        i10 = R.id.textNoDesctription2;
                                        TextView textView2 = (TextView) b.findChildViewById(view, R.id.textNoDesctription2);
                                        if (textView2 != null) {
                                            i10 = R.id.textNoRateApp;
                                            TextView textView3 = (TextView) b.findChildViewById(view, R.id.textNoRateApp);
                                            if (textView3 != null) {
                                                i10 = R.id.textYesDesctription;
                                                TextView textView4 = (TextView) b.findChildViewById(view, R.id.textYesDesctription);
                                                if (textView4 != null) {
                                                    i10 = R.id.textYesDesctription2;
                                                    TextView textView5 = (TextView) b.findChildViewById(view, R.id.textYesDesctription2);
                                                    if (textView5 != null) {
                                                        i10 = R.id.textYesRateApp;
                                                        TextView textView6 = (TextView) b.findChildViewById(view, R.id.textYesRateApp);
                                                        if (textView6 != null) {
                                                            i10 = R.id.titleRateAppLayout;
                                                            RelativeLayout relativeLayout4 = (RelativeLayout) b.findChildViewById(view, R.id.titleRateAppLayout);
                                                            if (relativeLayout4 != null) {
                                                                i10 = R.id.titleRateAppText;
                                                                TextView textView7 = (TextView) b.findChildViewById(view, R.id.titleRateAppText);
                                                                if (textView7 != null) {
                                                                    i10 = R.id.yesBanner;
                                                                    RelativeLayout relativeLayout5 = (RelativeLayout) b.findChildViewById(view, R.id.yesBanner);
                                                                    if (relativeLayout5 != null) {
                                                                        i10 = R.id.yesButton;
                                                                        ImageView imageView3 = (ImageView) b.findChildViewById(view, R.id.yesButton);
                                                                        if (imageView3 != null) {
                                                                            i10 = R.id.yesRateAppLayout;
                                                                            RelativeLayout relativeLayout6 = (RelativeLayout) b.findChildViewById(view, R.id.yesRateAppLayout);
                                                                            if (relativeLayout6 != null) {
                                                                                return new ActivityRateAppBinding(relativeLayout, button, imageView, linearLayout, linearLayout2, relativeLayout, relativeLayout2, imageView2, relativeLayout3, textView, textView2, textView3, textView4, textView5, textView6, relativeLayout4, textView7, relativeLayout5, imageView3, relativeLayout6);
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

    public static ActivityRateAppBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityRateAppBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_rate_app, viewGroup, false);
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
