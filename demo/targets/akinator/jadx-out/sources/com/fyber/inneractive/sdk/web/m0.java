package com.fyber.inneractive.sdk.web;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.player.exoplayer2.text.Ir.NyKZx;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m0 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f26933a;

    public m0(v0 v0Var) {
        this.f26933a = v0Var;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Activity activity = (Activity) com.fyber.inneractive.sdk.util.v.a(this.f26933a.f26974q);
        if (activity != null) {
            activity.finish();
        }
        com.fyber.inneractive.sdk.util.r.f26804b.postDelayed(new l0(this), 1000L);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.endsWith("success")) {
            v0 v0Var = this.f26933a;
            n0 n0Var = v0Var.f26973p;
            if (n0Var != null) {
                com.fyber.inneractive.sdk.util.r.f26804b.removeCallbacks(n0Var);
                v0Var.f26973p = null;
            }
            v0 v0Var2 = this.f26933a;
            v0Var2.getClass();
            IAlog.a("%sInternalStoreWebpageController: onWebviewLoaded - load took %d msec", IAlog.a(v0Var2), Long.valueOf(System.currentTimeMillis() - this.f26933a.f26972o));
            this.f26933a.f26969l = true;
            return true;
        }
        if (!str.startsWith("exit")) {
            return false;
        }
        Activity activity = (Activity) com.fyber.inneractive.sdk.util.v.a(this.f26933a.f26974q);
        if (activity == null) {
            return true;
        }
        try {
            Uri uri = Uri.parse(str);
            String queryParameter = uri.getQueryParameter("target");
            boolean zEquals = TextUtils.equals("mail", uri.getAuthority());
            Intent intent = new Intent(zEquals ? NyKZx.oaYQS : "android.intent.action.VIEW", Uri.parse(queryParameter));
            if (zEquals) {
                intent = Intent.createChooser(intent, "Choose an application");
            }
            com.fyber.inneractive.sdk.util.h0.a(activity, intent);
        } catch (Throwable th2) {
            com.fyber.inneractive.sdk.network.z.a(th2, null, null);
        }
        return true;
    }
}
