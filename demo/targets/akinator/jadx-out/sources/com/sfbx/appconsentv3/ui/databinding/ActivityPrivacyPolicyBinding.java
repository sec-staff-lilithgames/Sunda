package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sfbx.appconsentv3.ui.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ActivityPrivacyPolicyBinding implements a {
    public final ProgressBar privacyPolicyProgressbar;
    private final ConstraintLayout rootView;
    public final WebView webviewPrivacyPolicy;

    private ActivityPrivacyPolicyBinding(ConstraintLayout constraintLayout, ProgressBar progressBar, WebView webView) {
        this.rootView = constraintLayout;
        this.privacyPolicyProgressbar = progressBar;
        this.webviewPrivacyPolicy = webView;
    }

    public static ActivityPrivacyPolicyBinding bind(View view) {
        int i10 = R.id.privacy_policy_progressbar;
        ProgressBar progressBar = (ProgressBar) b.findChildViewById(view, i10);
        if (progressBar != null) {
            i10 = R.id.webview_privacy_policy;
            WebView webView = (WebView) b.findChildViewById(view, i10);
            if (webView != null) {
                return new ActivityPrivacyPolicyBinding((ConstraintLayout) view, progressBar, webView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityPrivacyPolicyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityPrivacyPolicyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_privacy_policy, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
