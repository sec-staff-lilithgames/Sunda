package com.unity3d.services.core.domain.task;

import av.e;
import bv.d;
import bv.f;
import com.unity3d.services.core.domain.task.InitializeStateNetworkError;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.services.core.domain.task.InitializeStateNetworkError", f = "InitializeStateNetworkError.kt", i = {}, l = {33}, m = "doWork-gIAlu-s", n = {}, s = {})
/* loaded from: classes8.dex */
public final class InitializeStateNetworkError$doWork$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateNetworkError this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateNetworkError$doWork$1(InitializeStateNetworkError initializeStateNetworkError, zu.d<? super InitializeStateNetworkError$doWork$1> dVar) {
        super(dVar);
        this.this$0 = initializeStateNetworkError;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM3527doWorkgIAlus = this.this$0.m3527doWorkgIAlus((InitializeStateNetworkError.Params) null, (zu.d<? super z>) this);
        return objM3527doWorkgIAlus == e.getCOROUTINE_SUSPENDED() ? objM3527doWorkgIAlus : z.m7130boximpl(objM3527doWorkgIAlus);
    }
}
