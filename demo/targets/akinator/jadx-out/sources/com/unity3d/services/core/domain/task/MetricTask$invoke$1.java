package com.unity3d.services.core.domain.task;

import av.e;
import bv.d;
import bv.f;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.services.core.domain.task.MetricTask", f = "MetricTask.kt", i = {0, 0, 0}, l = {24}, m = "invoke-gIAlu-s$suspendImpl", n = {"$this", "result", "start$iv"}, s = {"L$0", "L$1", "J$0"})
/* loaded from: classes8.dex */
public final class MetricTask$invoke$1 extends d {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MetricTask<P, R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MetricTask$invoke$1(MetricTask<? super P, R> metricTask, zu.d<? super MetricTask$invoke$1> dVar) {
        super(dVar);
        this.this$0 = metricTask;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM3530invokegIAlus$suspendImpl = MetricTask.m3530invokegIAlus$suspendImpl(this.this$0, null, this);
        return objM3530invokegIAlus$suspendImpl == e.getCOROUTINE_SUSPENDED() ? objM3530invokegIAlus$suspendImpl : z.m7130boximpl(objM3530invokegIAlus$suspendImpl);
    }
}
