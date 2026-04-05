package com.sfbx.appconsentv3.ui;

import av.e;
import bv.f;
import bv.n;
import com.sfbx.appconsentv3.ui.listener.OnPresentGeolocationNoticeListener;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.sfbx.appconsentv3.ui.AppConsentBusinessImpl$subscriberAppConsentGeolocationNotice$1$onResult$1", f = "AppConsentBusinessImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class AppConsentBusinessImpl$subscriberAppConsentGeolocationNotice$1$onResult$1 extends n implements p {
    int label;
    final /* synthetic */ AppConsentBusinessImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppConsentBusinessImpl$subscriberAppConsentGeolocationNotice$1$onResult$1(AppConsentBusinessImpl appConsentBusinessImpl, d<? super AppConsentBusinessImpl$subscriberAppConsentGeolocationNotice$1$onResult$1> dVar) {
        super(2, dVar);
        this.this$0 = appConsentBusinessImpl;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new AppConsentBusinessImpl$subscriberAppConsentGeolocationNotice$1$onResult$1(this.this$0, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        e.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a0.throwOnFailure(obj);
        OnPresentGeolocationNoticeListener onPresentGeolocationNoticeListener = this.this$0.getOnPresentGeolocationNoticeListener();
        if (onPresentGeolocationNoticeListener != null) {
            onPresentGeolocationNoticeListener.presentGeolocationConsentGiven();
        }
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
        return ((AppConsentBusinessImpl$subscriberAppConsentGeolocationNotice$1$onResult$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
