package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivityWebviewGeneralBinding implements a {
    public final ImageView backButtonImage;
    public final RelativeLayout mainLayout;
    private final RelativeLayout rootView;
    public final WebView webviewCGV;

    private ActivityWebviewGeneralBinding(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, WebView webView) {
        this.rootView = relativeLayout;
        this.backButtonImage = imageView;
        this.mainLayout = relativeLayout2;
        this.webviewCGV = webView;
    }

    public static ActivityWebviewGeneralBinding bind(View view) {
        int i10 = R.id.backButtonImage;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.backButtonImage);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            WebView webView = (WebView) b.findChildViewById(view, R.id.webviewCGV);
            if (webView != null) {
                return new ActivityWebviewGeneralBinding(relativeLayout, imageView, relativeLayout, webView);
            }
            i10 = R.id.webviewCGV;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityWebviewGeneralBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityWebviewGeneralBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_webview_general, viewGroup, false);
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
