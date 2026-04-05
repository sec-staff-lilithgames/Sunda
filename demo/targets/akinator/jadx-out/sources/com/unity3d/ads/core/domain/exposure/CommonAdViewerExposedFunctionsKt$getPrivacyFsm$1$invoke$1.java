package com.unity3d.ads.core.domain.exposure;

import bv.d;
import bv.f;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1", f = "CommonAdViewerExposedFunctions.kt", i = {}, l = {Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE}, m = "invoke", n = {}, s = {})
/* loaded from: classes8.dex */
public final class CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonAdViewerExposedFunctionsKt.C38091 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1(CommonAdViewerExposedFunctionsKt.C38091 c38091, zu.d<? super CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1> dVar) {
        super(dVar);
        this.this$0 = c38091;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke((Object[]) null, (zu.d<Object>) this);
    }
}
