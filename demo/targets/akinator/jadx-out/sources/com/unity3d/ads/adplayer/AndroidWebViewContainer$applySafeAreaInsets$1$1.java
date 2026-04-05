package com.unity3d.ads.adplayer;

import av.e;
import bv.f;
import bv.n;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$applySafeAreaInsets$1$1", f = "AndroidWebViewContainer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class AndroidWebViewContainer$applySafeAreaInsets$1$1 extends n implements p {
    final /* synthetic */ String $js;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidWebViewContainer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidWebViewContainer$applySafeAreaInsets$1$1(AndroidWebViewContainer androidWebViewContainer, String str, d<? super AndroidWebViewContainer$applySafeAreaInsets$1$1> dVar) {
        super(2, dVar);
        this.this$0 = androidWebViewContainer;
        this.$js = str;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        AndroidWebViewContainer$applySafeAreaInsets$1$1 androidWebViewContainer$applySafeAreaInsets$1$1 = new AndroidWebViewContainer$applySafeAreaInsets$1$1(this.this$0, this.$js, dVar);
        androidWebViewContainer$applySafeAreaInsets$1$1.L$0 = obj;
        return androidWebViewContainer$applySafeAreaInsets$1$1;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        x0 x0Var = x0.f87415a;
        e.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a0.throwOnFailure(obj);
        AndroidWebViewContainer androidWebViewContainer = this.this$0;
        String str = this.$js;
        try {
            int i10 = z.f87419c;
            androidWebViewContainer.getWebView().evaluateJavascript(str, null);
            z.m7131constructorimpl(x0Var);
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            z.m7131constructorimpl(a0.createFailure(th2));
        }
        return x0Var;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
        return ((AndroidWebViewContainer$applySafeAreaInsets$1$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
