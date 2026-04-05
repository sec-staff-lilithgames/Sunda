package com.inmobi.media;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Uf {

    /* renamed from: a, reason: collision with root package name */
    public final X9 f32377a;

    /* renamed from: b, reason: collision with root package name */
    public final C2981s2 f32378b;

    /* renamed from: c, reason: collision with root package name */
    public Tf f32379c;

    public Uf(X9 mNetworkRequest, C2981s2 mWebViewClient) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mNetworkRequest, "mNetworkRequest");
        kotlin.jvm.internal.e0.checkNotNullParameter(mWebViewClient, "mWebViewClient");
        this.f32377a = mNetworkRequest;
        this.f32378b = mWebViewClient;
    }

    public final void a() {
        try {
            Context contextD = C2925od.d();
            if (contextD != null) {
                Tf tf2 = new Tf(contextD);
                tf2.setWebViewClient(this.f32378b);
                tf2.getSettings().setJavaScriptEnabled(true);
                tf2.getSettings().setCacheMode(2);
                this.f32379c = tf2;
            }
            Tf tf3 = this.f32379c;
            if (tf3 != null) {
                String strD = this.f32377a.d();
                X9 x92 = this.f32377a;
                boolean z10 = C2736da.f32781a;
                C2736da.a(x92.f32500i);
                tf3.loadUrl(strD, x92.f32500i);
            }
        } catch (Exception unused) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("Uf", "TAG");
        }
    }
}
