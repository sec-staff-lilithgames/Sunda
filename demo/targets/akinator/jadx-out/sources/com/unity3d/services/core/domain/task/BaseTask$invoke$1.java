package com.unity3d.services.core.domain.task;

import av.e;
import bv.d;
import bv.f;
import com.unity3d.services.core.domain.task.BaseParams;
import com.unity3d.services.core.domain.task.BaseTask;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.services.core.domain.task.BaseTask$DefaultImpls", f = "BaseTask.kt", i = {}, l = {11}, m = "invoke-gIAlu-s", n = {}, s = {})
/* loaded from: classes8.dex */
public final class BaseTask$invoke$1<P extends BaseParams, R> extends d {
    int label;
    /* synthetic */ Object result;

    public BaseTask$invoke$1(zu.d<? super BaseTask$invoke$1> dVar) {
        super(dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM3514invokegIAlus = BaseTask.DefaultImpls.m3514invokegIAlus(null, null, this);
        return objM3514invokegIAlus == e.getCOROUTINE_SUSPENDED() ? objM3514invokegIAlus : z.m7130boximpl(objM3514invokegIAlus);
    }
}
