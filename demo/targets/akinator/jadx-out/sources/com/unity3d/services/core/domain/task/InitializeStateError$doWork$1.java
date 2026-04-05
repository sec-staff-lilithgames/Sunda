package com.unity3d.services.core.domain.task;

import av.e;
import bv.d;
import bv.f;
import com.unity3d.services.core.domain.task.InitializeStateError;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.services.core.domain.task.InitializeStateError", f = "InitializeStateError.kt", i = {}, l = {27}, m = "doWork-gIAlu-s", n = {}, s = {})
/* loaded from: classes8.dex */
public final class InitializeStateError$doWork$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateError this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateError$doWork$1(InitializeStateError initializeStateError, zu.d<? super InitializeStateError$doWork$1> dVar) {
        super(dVar);
        this.this$0 = initializeStateError;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM3524doWorkgIAlus = this.this$0.m3524doWorkgIAlus((InitializeStateError.Params) null, (zu.d<? super z>) this);
        return objM3524doWorkgIAlus == e.getCOROUTINE_SUSPENDED() ? objM3524doWorkgIAlus : z.m7130boximpl(objM3524doWorkgIAlus);
    }
}
