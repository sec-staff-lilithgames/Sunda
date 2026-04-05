package com.unity3d.services.core.domain.task;

import av.e;
import bv.d;
import bv.f;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.services.core.domain.task.InitializeSDK", f = "InitializeSDK.kt", i = {}, l = {40}, m = "doWork-gIAlu-s", n = {}, s = {})
/* loaded from: classes8.dex */
public final class InitializeSDK$doWork$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeSDK$doWork$1(InitializeSDK initializeSDK, zu.d<? super InitializeSDK$doWork$1> dVar) {
        super(dVar);
        this.this$0 = initializeSDK;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM3518doWorkgIAlus = this.this$0.m3518doWorkgIAlus((EmptyParams) null, (zu.d<? super z>) this);
        return objM3518doWorkgIAlus == e.getCOROUTINE_SUSPENDED() ? objM3518doWorkgIAlus : z.m7130boximpl(objM3518doWorkgIAlus);
    }
}
