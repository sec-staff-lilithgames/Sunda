package com.unity3d.services.core.network.core;

import av.e;
import bv.f;
import bv.n;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.model.HttpRequest;
import java.lang.reflect.InvocationTargetException;
import kv.p;
import p0.o2;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3", f = "OkHttp3Client.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class OkHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3 extends n implements p {
    final /* synthetic */ HttpRequest $request;
    /* synthetic */ int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3(HttpRequest httpRequest, d<? super OkHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3> dVar) {
        super(2, dVar);
        this.$request = httpRequest;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        OkHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3 okHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3 = new OkHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3(this.$request, dVar);
        okHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3.I$0 = ((Number) obj).intValue();
        return okHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3;
    }

    public final Object invoke(int i10, d<? super x0> dVar) {
        return ((OkHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3) create(Integer.valueOf(i10), dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        e.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a0.throwOnFailure(obj);
        StringBuilder sbT = o2.t(this.I$0, "Downloaded ", "% of ");
        sbT.append(this.$request.getBaseURL());
        DeviceLog.debug(sbT.toString());
        return x0.f87415a;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (d<? super x0>) obj2);
    }
}
