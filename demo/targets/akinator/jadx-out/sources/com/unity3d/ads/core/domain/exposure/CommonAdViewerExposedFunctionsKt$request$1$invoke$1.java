package com.unity3d.ads.core.domain.exposure;

import bv.d;
import bv.f;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1", f = "CommonAdViewerExposedFunctions.kt", i = {0, 0}, l = {426}, m = "invoke", n = {"id", "url"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
public final class CommonAdViewerExposedFunctionsKt$request$1$invoke$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonAdViewerExposedFunctionsKt.C38311 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonAdViewerExposedFunctionsKt$request$1$invoke$1(CommonAdViewerExposedFunctionsKt.C38311 c38311, zu.d<? super CommonAdViewerExposedFunctionsKt$request$1$invoke$1> dVar) {
        super(dVar);
        this.this$0 = c38311;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke((Object[]) null, (zu.d<Object>) this);
    }
}
