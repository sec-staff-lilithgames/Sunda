package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivityWebviewCgvBinding implements a {
    public final ImageView backButtonImage;
    public final RelativeLayout consent1;
    public final RelativeLayout consent2;
    public final RelativeLayout consent3;
    public final RelativeLayout consentPoliticsLayout;
    public final ProgressBar loadingBar;
    public final RelativeLayout mainLayout;
    private final RelativeLayout rootView;
    public final TextView textConsent1;
    public final TextView textConsent2;
    public final TextView textConsent3;
    public final TextView titleConsent;
    public final ImageView toggle1;
    public final ImageView toggle2;
    public final ImageView toggle3;
    public final Button validateButton;
    public final WebView webviewCGV;

    private ActivityWebviewCgvBinding(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, ProgressBar progressBar, RelativeLayout relativeLayout6, TextView textView, TextView textView2, TextView textView3, TextView textView4, ImageView imageView2, ImageView imageView3, ImageView imageView4, Button button, WebView webView) {
        this.rootView = relativeLayout;
        this.backButtonImage = imageView;
        this.consent1 = relativeLayout2;
        this.consent2 = relativeLayout3;
        this.consent3 = relativeLayout4;
        this.consentPoliticsLayout = relativeLayout5;
        this.loadingBar = progressBar;
        this.mainLayout = relativeLayout6;
        this.textConsent1 = textView;
        this.textConsent2 = textView2;
        this.textConsent3 = textView3;
        this.titleConsent = textView4;
        this.toggle1 = imageView2;
        this.toggle2 = imageView3;
        this.toggle3 = imageView4;
        this.validateButton = button;
        this.webviewCGV = webView;
    }

    public static ActivityWebviewCgvBinding bind(View view) {
        int i10 = R.id.backButtonImage;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.backButtonImage);
        if (imageView != null) {
            i10 = R.id.consent1;
            RelativeLayout relativeLayout = (RelativeLayout) b.findChildViewById(view, R.id.consent1);
            if (relativeLayout != null) {
                i10 = R.id.consent2;
                RelativeLayout relativeLayout2 = (RelativeLayout) b.findChildViewById(view, R.id.consent2);
                if (relativeLayout2 != null) {
                    i10 = R.id.consent3;
                    RelativeLayout relativeLayout3 = (RelativeLayout) b.findChildViewById(view, R.id.consent3);
                    if (relativeLayout3 != null) {
                        i10 = R.id.consentPoliticsLayout;
                        RelativeLayout relativeLayout4 = (RelativeLayout) b.findChildViewById(view, R.id.consentPoliticsLayout);
                        if (relativeLayout4 != null) {
                            i10 = R.id.loadingBar;
                            ProgressBar progressBar = (ProgressBar) b.findChildViewById(view, R.id.loadingBar);
                            if (progressBar != null) {
                                RelativeLayout relativeLayout5 = (RelativeLayout) view;
                                i10 = R.id.textConsent1;
                                TextView textView = (TextView) b.findChildViewById(view, R.id.textConsent1);
                                if (textView != null) {
                                    i10 = R.id.textConsent2;
                                    TextView textView2 = (TextView) b.findChildViewById(view, R.id.textConsent2);
                                    if (textView2 != null) {
                                        i10 = R.id.textConsent3;
                                        TextView textView3 = (TextView) b.findChildViewById(view, R.id.textConsent3);
                                        if (textView3 != null) {
                                            i10 = R.id.titleConsent;
                                            TextView textView4 = (TextView) b.findChildViewById(view, R.id.titleConsent);
                                            if (textView4 != null) {
                                                i10 = R.id.toggle1;
                                                ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.toggle1);
                                                if (imageView2 != null) {
                                                    i10 = R.id.toggle2;
                                                    ImageView imageView3 = (ImageView) b.findChildViewById(view, R.id.toggle2);
                                                    if (imageView3 != null) {
                                                        i10 = R.id.toggle3;
                                                        ImageView imageView4 = (ImageView) b.findChildViewById(view, R.id.toggle3);
                                                        if (imageView4 != null) {
                                                            i10 = R.id.validateButton;
                                                            Button button = (Button) b.findChildViewById(view, R.id.validateButton);
                                                            if (button != null) {
                                                                i10 = R.id.webviewCGV;
                                                                WebView webView = (WebView) b.findChildViewById(view, R.id.webviewCGV);
                                                                if (webView != null) {
                                                                    return new ActivityWebviewCgvBinding(relativeLayout5, imageView, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, progressBar, relativeLayout5, textView, textView2, textView3, textView4, imageView2, imageView3, imageView4, button, webView);
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

    public static ActivityWebviewCgvBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityWebviewCgvBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_webview_cgv, viewGroup, false);
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
