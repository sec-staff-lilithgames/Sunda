package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import com.unity3d.ads.core.domain.om.GetOmData;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class HandleInvocationsFromAdViewer$invoke$definition$36 extends f0 implements kv.a {
    final /* synthetic */ HandleInvocationsFromAdViewer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleInvocationsFromAdViewer$invoke$definition$36(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        super(0);
        this.this$0 = handleInvocationsFromAdViewer;
    }

    @Override // kv.a
    public final ExposedFunction invoke() {
        return CommonAdViewerExposedFunctionsKt.omGetData((GetOmData) this.this$0.getServiceProvider().getRegistry().getService("", c1.getOrCreateKotlinClass(GetOmData.class)));
    }
}
