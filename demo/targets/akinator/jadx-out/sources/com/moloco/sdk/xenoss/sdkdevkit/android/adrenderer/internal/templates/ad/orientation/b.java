package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f48340a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f48341b;

    public b(a orientation, boolean z10) {
        e0.checkNotNullParameter(orientation, "orientation");
        this.f48340a = orientation;
        this.f48341b = z10;
    }

    public final a a() {
        return this.f48340a;
    }

    public final boolean b() {
        return this.f48341b;
    }

    public final boolean c() {
        return this.f48341b;
    }

    public final a d() {
        return this.f48340a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f48340a == bVar.f48340a && this.f48341b == bVar.f48341b;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f48341b) + (this.f48340a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("OrientationSettings(orientation=");
        sb2.append(this.f48340a);
        sb2.append(", allowOrientationChange=");
        return a.b.p(sb2, this.f48341b, ')');
    }

    public /* synthetic */ b(a aVar, boolean z10, int i10, u uVar) {
        this(aVar, (i10 & 2) != 0 ? true : z10);
    }

    public final b a(a orientation, boolean z10) {
        e0.checkNotNullParameter(orientation, "orientation");
        return new b(orientation, z10);
    }

    public static /* synthetic */ b a(b bVar, a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = bVar.f48340a;
        }
        if ((i10 & 2) != 0) {
            z10 = bVar.f48341b;
        }
        return bVar.a(aVar, z10);
    }
}
