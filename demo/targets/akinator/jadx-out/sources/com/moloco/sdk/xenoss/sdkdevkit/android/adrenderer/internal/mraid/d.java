package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a0;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f48033a;

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final a0 a() {
        return this.f48033a;
    }

    public final a0 b() {
        return this.f48033a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && e0.areEqual(this.f48033a, ((d) obj).f48033a);
    }

    public int hashCode() {
        a0 a0Var = this.f48033a;
        if (a0Var == null) {
            return 0;
        }
        return a0Var.hashCode();
    }

    public String toString() {
        return "MraidAdData(dec=" + this.f48033a + ')';
    }

    public d(a0 a0Var) {
        this.f48033a = a0Var;
    }

    public final d a(a0 a0Var) {
        return new d(a0Var);
    }

    public static /* synthetic */ d a(d dVar, a0 a0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            a0Var = dVar.f48033a;
        }
        return dVar.a(a0Var);
    }

    public /* synthetic */ d(a0 a0Var, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : a0Var);
    }
}
