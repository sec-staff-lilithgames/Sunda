package io.ktor.client;

import bv.d;
import bv.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.HttpClient", f = "HttpClient.kt", i = {}, l = {191}, m = "execute$ktor_client_core", n = {}, s = {})
/* loaded from: classes4.dex */
public final class HttpClient$execute$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpClient$execute$1(HttpClient httpClient, zu.d<? super HttpClient$execute$1> dVar) {
        super(dVar);
        this.this$0 = httpClient;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute$ktor_client_core(null, this);
    }
}
