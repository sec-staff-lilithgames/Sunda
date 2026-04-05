package com.bytedance.sdk.component.jpo;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz {

    /* renamed from: au, reason: collision with root package name */
    boolean f18785au;

    /* renamed from: cm, reason: collision with root package name */
    qk f18786cm;

    /* renamed from: jd, reason: collision with root package name */
    jpo f18787jd;

    /* renamed from: jj, reason: collision with root package name */
    boolean f18788jj;
    WebView jpo;
    Context my;

    /* renamed from: qk, reason: collision with root package name */
    boolean f18790qk;
    ju xyk;
    Cif zz;
    String wqx = "IESJSBridge";

    /* renamed from: yd, reason: collision with root package name */
    String f18791yd = "host";

    /* renamed from: ju, reason: collision with root package name */
    final Set<String> f18789ju = new LinkedHashSet();

    /* renamed from: if, reason: not valid java name */
    final Set<String> f73if = new LinkedHashSet();

    public zz(WebView webView) {
        this.jpo = webView;
    }

    public zz jd(boolean z10) {
        this.f18790qk = z10;
        return this;
    }

    public zz jpo(jpo jpoVar) {
        this.f18787jd = jpoVar;
        return this;
    }

    private void jd() {
        if ((this.jpo == null && !this.f18785au && this.f18787jd == null) || ((TextUtils.isEmpty(this.wqx) && this.jpo != null) || this.f18786cm == null)) {
            throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
        }
    }

    public zz jpo(String str) {
        this.wqx = str;
        return this;
    }

    public zz jpo(yd ydVar) {
        this.f18786cm = qk.jpo(ydVar);
        return this;
    }

    public zz jpo(boolean z10) {
        this.f18788jj = z10;
        return this;
    }

    public prr jpo() {
        jd();
        return new prr(this);
    }

    public zz() {
    }
}
