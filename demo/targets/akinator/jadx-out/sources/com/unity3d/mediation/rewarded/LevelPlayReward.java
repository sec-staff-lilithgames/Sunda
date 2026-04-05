package com.unity3d.mediation.rewarded;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class LevelPlayReward {

    /* renamed from: a, reason: collision with root package name */
    private final String f50686a;

    /* renamed from: b, reason: collision with root package name */
    private final int f50687b;

    public LevelPlayReward(String name, int i10) {
        e0.checkNotNullParameter(name, "name");
        this.f50686a = name;
        this.f50687b = i10;
    }

    public static /* synthetic */ LevelPlayReward copy$default(LevelPlayReward levelPlayReward, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = levelPlayReward.f50686a;
        }
        if ((i11 & 2) != 0) {
            i10 = levelPlayReward.f50687b;
        }
        return levelPlayReward.copy(str, i10);
    }

    public final String component1() {
        return this.f50686a;
    }

    public final int component2() {
        return this.f50687b;
    }

    public final LevelPlayReward copy(String name, int i10) {
        e0.checkNotNullParameter(name, "name");
        return new LevelPlayReward(name, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelPlayReward)) {
            return false;
        }
        LevelPlayReward levelPlayReward = (LevelPlayReward) obj;
        return e0.areEqual(this.f50686a, levelPlayReward.f50686a) && this.f50687b == levelPlayReward.f50687b;
    }

    public final int getAmount() {
        return this.f50687b;
    }

    public final String getName() {
        return this.f50686a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f50687b) + (this.f50686a.hashCode() * 31);
    }

    public String toString() {
        return "LevelPlayReward(name=" + this.f50686a + ", amount=" + this.f50687b + ")";
    }
}
