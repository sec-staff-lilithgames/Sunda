package com.ironsource;

import com.unity3d.mediation.LevelPlay;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.sd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3448sd {

    /* renamed from: a, reason: collision with root package name */
    private final String f38380a;

    /* renamed from: b, reason: collision with root package name */
    private final LevelPlay.AdFormat f38381b;

    public C3448sd(String placementName, LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.e0.checkNotNullParameter(placementName, "placementName");
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, "adFormat");
        this.f38380a = placementName;
        this.f38381b = adFormat;
    }

    public final String a() {
        return this.f38380a + "_" + this.f38381b;
    }
}
