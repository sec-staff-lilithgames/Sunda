package com.sfbx.appconsentv3.ui.domain;

import av.e;
import bv.f;
import bv.n;
import com.sfbx.appconsent.core.AppConsentCore;
import com.sfbx.appconsent.core.model.api.proto.HelloReply;
import com.sfbx.appconsentv3.ui.model.CountryCore;
import com.sfbx.appconsentv3.ui.model.HelloReplyCoreKt;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.sfbx.appconsentv3.ui.domain.GetCountryFromBOUseCaseImpl$invoke$countryCoreDeferred$1", f = "GetCountryFromBOUseCaseImpl.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class GetCountryFromBOUseCaseImpl$invoke$countryCoreDeferred$1 extends n implements p {
    int label;
    final /* synthetic */ GetCountryFromBOUseCaseImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCountryFromBOUseCaseImpl$invoke$countryCoreDeferred$1(GetCountryFromBOUseCaseImpl getCountryFromBOUseCaseImpl, d<? super GetCountryFromBOUseCaseImpl$invoke$countryCoreDeferred$1> dVar) {
        super(2, dVar);
        this.this$0 = getCountryFromBOUseCaseImpl;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new GetCountryFromBOUseCaseImpl$invoke$countryCoreDeferred$1(this.this$0, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            AppConsentCore appConsentCore = this.this$0.appConsentCore;
            this.label = 1;
            obj = appConsentCore.getCountryFromBO(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
        }
        return HelloReplyCoreKt.convertTo((HelloReply) obj).getCountry();
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super CountryCore> dVar) {
        return ((GetCountryFromBOUseCaseImpl$invoke$countryCoreDeferred$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
