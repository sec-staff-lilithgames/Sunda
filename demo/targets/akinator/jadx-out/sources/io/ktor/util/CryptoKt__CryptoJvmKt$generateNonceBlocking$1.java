package io.ktor.util;

import av.e;
import bv.f;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.util.CryptoKt__CryptoJvmKt$generateNonceBlocking$1", f = "CryptoJvm.kt", i = {}, l = {TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class CryptoKt__CryptoJvmKt$generateNonceBlocking$1 extends n implements p {
    int label;

    public CryptoKt__CryptoJvmKt$generateNonceBlocking$1(d<? super CryptoKt__CryptoJvmKt$generateNonceBlocking$1> dVar) {
        super(2, dVar);
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new CryptoKt__CryptoJvmKt$generateNonceBlocking$1(dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return obj;
        }
        a0.throwOnFailure(obj);
        Channel<String> seedChannel = NonceKt.getSeedChannel();
        this.label = 1;
        Object objReceive = seedChannel.receive(this);
        return objReceive == coroutine_suspended ? coroutine_suspended : objReceive;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super String> dVar) {
        return ((CryptoKt__CryptoJvmKt$generateNonceBlocking$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
