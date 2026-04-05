package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class HandleInvocationsFromAdViewer$invoke$definition$15 extends f0 implements kv.a {
    public static final HandleInvocationsFromAdViewer$invoke$definition$15 INSTANCE = new HandleInvocationsFromAdViewer$invoke$definition$15();

    public HandleInvocationsFromAdViewer$invoke$definition$15() {
        super(0);
    }

    @Override // kv.a
    public final ExposedFunction invoke() {
        return CommonAdViewerExposedFunctionsKt.getStorage();
    }
}
