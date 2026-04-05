package com.sfbx.appconsent.core.api;

import av.e;
import bv.d;
import bv.f;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.sfbx.appconsent.core.api.AppConsentService", f = "AppConsentService.kt", i = {0}, l = {261}, m = "sendDisplayMetric-0E7RQCE", n = {"$this$sendDisplayMetric_0E7RQCE_u24lambda_u2414"}, s = {"L$0"})
/* loaded from: classes8.dex */
public final class AppConsentService$sendDisplayMetric$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppConsentService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppConsentService$sendDisplayMetric$1(AppConsentService appConsentService, zu.d<? super AppConsentService$sendDisplayMetric$1> dVar) {
        super(dVar);
        this.this$0 = appConsentService;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM3442sendDisplayMetric0E7RQCE = this.this$0.m3442sendDisplayMetric0E7RQCE(null, null, this);
        return objM3442sendDisplayMetric0E7RQCE == e.getCOROUTINE_SUSPENDED() ? objM3442sendDisplayMetric0E7RQCE : z.m7130boximpl(objM3442sendDisplayMetric0E7RQCE);
    }
}
