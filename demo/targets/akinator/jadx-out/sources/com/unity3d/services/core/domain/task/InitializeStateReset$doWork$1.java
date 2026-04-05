package com.unity3d.services.core.domain.task;

import av.e;
import bv.d;
import bv.f;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.services.core.domain.task.InitializeStateReset", f = "InitializeStateReset.kt", i = {}, l = {33}, m = "doWork-gIAlu-s$suspendImpl", n = {}, s = {})
/* loaded from: classes8.dex */
public final class InitializeStateReset$doWork$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateReset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateReset$doWork$1(InitializeStateReset initializeStateReset, zu.d<? super InitializeStateReset$doWork$1> dVar) {
        super(dVar);
        this.this$0 = initializeStateReset;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM3528doWorkgIAlus$suspendImpl = InitializeStateReset.m3528doWorkgIAlus$suspendImpl(this.this$0, null, this);
        return objM3528doWorkgIAlus$suspendImpl == e.getCOROUTINE_SUSPENDED() ? objM3528doWorkgIAlus$suspendImpl : z.m7130boximpl(objM3528doWorkgIAlus$suspendImpl);
    }
}
