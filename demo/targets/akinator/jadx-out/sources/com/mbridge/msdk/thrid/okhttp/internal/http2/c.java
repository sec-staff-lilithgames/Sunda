package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.applovin.shadow.okhttp3.internal.http2.Header;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f43439d = com.mbridge.msdk.thrid.okio.f.c(":");

    /* renamed from: e, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f43440e = com.mbridge.msdk.thrid.okio.f.c(Header.RESPONSE_STATUS_UTF8);

    /* renamed from: f, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f43441f = com.mbridge.msdk.thrid.okio.f.c(Header.TARGET_METHOD_UTF8);

    /* renamed from: g, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f43442g = com.mbridge.msdk.thrid.okio.f.c(Header.TARGET_PATH_UTF8);

    /* renamed from: h, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f43443h = com.mbridge.msdk.thrid.okio.f.c(Header.TARGET_SCHEME_UTF8);

    /* renamed from: i, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f43444i = com.mbridge.msdk.thrid.okio.f.c(Header.TARGET_AUTHORITY_UTF8);

    /* renamed from: a, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okio.f f43445a;

    /* renamed from: b, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okio.f f43446b;

    /* renamed from: c, reason: collision with root package name */
    final int f43447c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
    }

    public c(String str, String str2) {
        this(com.mbridge.msdk.thrid.okio.f.c(str), com.mbridge.msdk.thrid.okio.f.c(str2));
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f43445a.equals(cVar.f43445a) && this.f43446b.equals(cVar.f43446b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f43446b.hashCode() + ((this.f43445a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public String toString() {
        return com.mbridge.msdk.thrid.okhttp.internal.c.a("%s: %s", this.f43445a.h(), this.f43446b.h());
    }

    public c(com.mbridge.msdk.thrid.okio.f fVar, String str) {
        this(fVar, com.mbridge.msdk.thrid.okio.f.c(str));
    }

    public c(com.mbridge.msdk.thrid.okio.f fVar, com.mbridge.msdk.thrid.okio.f fVar2) {
        this.f43445a = fVar;
        this.f43446b = fVar2;
        this.f43447c = fVar2.e() + fVar.e() + 32;
    }
}
