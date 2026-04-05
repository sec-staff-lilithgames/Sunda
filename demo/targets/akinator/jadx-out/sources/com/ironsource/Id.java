package com.ironsource;

import com.ironsource.S7;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Id implements S7, S7.a {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, LevelPlayReward> f34678a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, LevelPlayReward> f34679b = new LinkedHashMap();

    @Override // com.ironsource.S7.a
    public void a(String placement, String rewardName, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(placement, "placement");
        kotlin.jvm.internal.e0.checkNotNullParameter(rewardName, "rewardName");
        this.f34678a.put(placement, new LevelPlayReward(rewardName, i10));
    }

    @Override // com.ironsource.S7.a
    public void b(String adUnitId, String rewardName, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.e0.checkNotNullParameter(rewardName, "rewardName");
        this.f34679b.put(adUnitId, new LevelPlayReward(rewardName, i10));
    }

    private final LevelPlayReward b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return this.f34678a.get(str);
    }

    @Override // com.ironsource.S7
    public LevelPlayReward a(String str, String adUnitId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        LevelPlayReward levelPlayRewardB = b(str);
        return levelPlayRewardB == null ? a(adUnitId) : levelPlayRewardB;
    }

    private final LevelPlayReward a(String str) {
        return this.f34679b.get(str);
    }
}
