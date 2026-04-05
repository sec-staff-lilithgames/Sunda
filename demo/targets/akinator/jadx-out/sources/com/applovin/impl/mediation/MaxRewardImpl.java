package com.applovin.impl.mediation;

import com.applovin.mediation.MaxReward;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class MaxRewardImpl implements MaxReward {

    /* renamed from: a, reason: collision with root package name */
    private final String f14501a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14502b;

    private MaxRewardImpl(int i10, String str) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Reward amount must be greater than or equal to 0");
        }
        this.f14501a = str;
        this.f14502b = i10;
    }

    public static MaxReward create(int i10, String str) {
        return new MaxRewardImpl(i10, str);
    }

    public static MaxReward createDefault() {
        return create(0, "");
    }

    @Override // com.applovin.mediation.MaxReward
    public final int getAmount() {
        return this.f14502b;
    }

    @Override // com.applovin.mediation.MaxReward
    public final String getLabel() {
        return this.f14501a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MaxReward{amount=");
        sb2.append(this.f14502b);
        sb2.append(", label=");
        return o2.o(sb2, this.f14501a, "}");
    }
}
