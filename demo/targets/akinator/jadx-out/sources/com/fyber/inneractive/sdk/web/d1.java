package com.fyber.inneractive.sdk.web;

import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.HashMap;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26851a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26852b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f26853c;

    public d1(WebResourceRequest webResourceRequest) {
        this.f26851a = webResourceRequest.getUrl().toString();
        this.f26852b = webResourceRequest.getMethod();
        this.f26853c = new HashMap(webResourceRequest.getRequestHeaders() == null ? Collections.EMPTY_MAP : webResourceRequest.getRequestHeaders());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d1.class != obj.getClass()) {
            return false;
        }
        d1 d1Var = (d1) obj;
        if (this.f26851a.equals(d1Var.f26851a) && this.f26852b.equals(d1Var.f26852b)) {
            return this.f26853c.equals(d1Var.f26853c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26853c.hashCode() + o2.e(this.f26851a.hashCode() * 31, 31, this.f26852b);
    }
}
