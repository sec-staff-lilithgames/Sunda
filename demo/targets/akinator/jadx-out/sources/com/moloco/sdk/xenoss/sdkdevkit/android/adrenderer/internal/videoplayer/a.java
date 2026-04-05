package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f50082a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f50083b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f50084c;

    public a(boolean z10, boolean z11, boolean z12) {
        this.f50082a = z10;
        this.f50083b = z11;
        this.f50084c = z12;
    }

    public final boolean a() {
        return this.f50082a;
    }

    public final boolean b() {
        return this.f50083b;
    }

    public final boolean c() {
        return this.f50084c;
    }

    public final boolean d() {
        return this.f50084c;
    }

    public final boolean e() {
        return this.f50082a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f50082a == aVar.f50082a && this.f50083b == aVar.f50083b && this.f50084c == aVar.f50084c;
    }

    public final boolean f() {
        return this.f50083b;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f50084c) + com.google.android.gms.internal.play_billing.a.c(Boolean.hashCode(this.f50082a) * 31, 31, this.f50083b);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PlayingState(isPlaying=");
        sb2.append(this.f50082a);
        sb2.append(", isVisible=");
        sb2.append(this.f50083b);
        sb2.append(", hasMore=");
        return a.b.p(sb2, this.f50084c, ')');
    }

    public final a a(boolean z10, boolean z11, boolean z12) {
        return new a(z10, z11, z12);
    }

    public static /* synthetic */ a a(a aVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = aVar.f50082a;
        }
        if ((i10 & 2) != 0) {
            z11 = aVar.f50083b;
        }
        if ((i10 & 4) != 0) {
            z12 = aVar.f50084c;
        }
        return aVar.a(z10, z11, z12);
    }

    public /* synthetic */ a(boolean z10, boolean z11, boolean z12, int i10, u uVar) {
        this(z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12);
    }
}
