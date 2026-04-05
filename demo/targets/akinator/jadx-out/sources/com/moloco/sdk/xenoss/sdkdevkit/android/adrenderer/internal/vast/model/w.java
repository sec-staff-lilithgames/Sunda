package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import kotlin.jvm.internal.e0;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final x f49396a;

    /* renamed from: b, reason: collision with root package name */
    public final String f49397b;

    /* renamed from: c, reason: collision with root package name */
    public final t f49398c;

    public w(x event, String url, t tVar) {
        e0.checkNotNullParameter(event, "event");
        e0.checkNotNullParameter(url, "url");
        this.f49396a = event;
        this.f49397b = url;
        this.f49398c = tVar;
    }

    public final x a() {
        return this.f49396a;
    }

    public final String b() {
        return this.f49397b;
    }

    public final t c() {
        return this.f49398c;
    }

    public final x d() {
        return this.f49396a;
    }

    public final t e() {
        return this.f49398c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f49396a == wVar.f49396a && e0.areEqual(this.f49397b, wVar.f49397b) && e0.areEqual(this.f49398c, wVar.f49398c);
    }

    public final String f() {
        return this.f49397b;
    }

    public int hashCode() {
        int iE = o2.e(this.f49396a.hashCode() * 31, 31, this.f49397b);
        t tVar = this.f49398c;
        return iE + (tVar == null ? 0 : tVar.hashCode());
    }

    public String toString() {
        return "Tracking(event=" + this.f49396a + ", url=" + this.f49397b + ", offset=" + this.f49398c + ')';
    }

    public /* synthetic */ w(x xVar, String str, t tVar, int i10, kotlin.jvm.internal.u uVar) {
        this(xVar, str, (i10 & 4) != 0 ? null : tVar);
    }

    public final w a(x event, String url, t tVar) {
        e0.checkNotNullParameter(event, "event");
        e0.checkNotNullParameter(url, "url");
        return new w(event, url, tVar);
    }

    public static /* synthetic */ w a(w wVar, x xVar, String str, t tVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            xVar = wVar.f49396a;
        }
        if ((i10 & 2) != 0) {
            str = wVar.f49397b;
        }
        if ((i10 & 4) != 0) {
            tVar = wVar.f49398c;
        }
        return wVar.a(xVar, str, tVar);
    }
}
