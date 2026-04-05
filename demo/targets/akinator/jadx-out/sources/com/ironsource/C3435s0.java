package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.s0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3435s0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3368o0 f38327a;

    /* renamed from: b, reason: collision with root package name */
    private final LevelPlayAdInfo f38328b;

    public C3435s0(AbstractC3368o0 adUnit, LevelPlayAdInfo levelPlayAdInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        this.f38327a = adUnit;
        this.f38328b = levelPlayAdInfo;
    }

    public final AbstractC3368o0 a() {
        return this.f38327a;
    }

    public final LevelPlayAdInfo b() {
        return this.f38328b;
    }

    public final LevelPlayAdInfo c() {
        return this.f38328b;
    }

    public final AbstractC3368o0 d() {
        return this.f38327a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3435s0)) {
            return false;
        }
        C3435s0 c3435s0 = (C3435s0) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f38327a, c3435s0.f38327a) && kotlin.jvm.internal.e0.areEqual(this.f38328b, c3435s0.f38328b);
    }

    public int hashCode() {
        int iHashCode = this.f38327a.hashCode() * 31;
        LevelPlayAdInfo levelPlayAdInfo = this.f38328b;
        return iHashCode + (levelPlayAdInfo == null ? 0 : levelPlayAdInfo.hashCode());
    }

    public String toString() {
        return "AdUnitCallback(adUnit=" + this.f38327a + ", adInfo=" + this.f38328b + ")";
    }

    public /* synthetic */ C3435s0(AbstractC3368o0 abstractC3368o0, LevelPlayAdInfo levelPlayAdInfo, int i10, kotlin.jvm.internal.u uVar) {
        this(abstractC3368o0, (i10 & 2) != 0 ? null : levelPlayAdInfo);
    }

    public final C3435s0 a(AbstractC3368o0 adUnit, LevelPlayAdInfo levelPlayAdInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        return new C3435s0(adUnit, levelPlayAdInfo);
    }

    public static /* synthetic */ C3435s0 a(C3435s0 c3435s0, AbstractC3368o0 abstractC3368o0, LevelPlayAdInfo levelPlayAdInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC3368o0 = c3435s0.f38327a;
        }
        if ((i10 & 2) != 0) {
            levelPlayAdInfo = c3435s0.f38328b;
        }
        return c3435s0.a(abstractC3368o0, levelPlayAdInfo);
    }
}
