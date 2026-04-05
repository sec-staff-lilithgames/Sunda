package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.p0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3385p0 {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<String, R0> f38053a = new HashMap<>();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.p0$a */
    public enum a {
        DidntAttemptToLoad,
        FailedToLoad,
        LoadedSuccessfully,
        FailedToShow,
        ShowedSuccessfully,
        NotPartOfWaterfall
    }

    public final R0 a(String adUnitId, List<? extends NetworkSettings> providers, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.e0.checkNotNullParameter(providers, "providers");
        R0 r02 = this.f38053a.get(adUnitId);
        if (r02 != null) {
            return r02;
        }
        R0 r03 = new R0(providers, i10);
        this.f38053a.put(adUnitId, r03);
        return r03;
    }
}
