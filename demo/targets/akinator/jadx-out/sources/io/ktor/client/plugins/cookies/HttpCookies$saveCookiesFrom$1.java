package io.ktor.client.plugins.cookies;

import bv.d;
import bv.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.plugins.cookies.HttpCookies", f = "HttpCookies.kt", i = {0, 0}, l = {78}, m = "saveCookiesFrom$ktor_client_core", n = {"this", "url"}, s = {"L$0", "L$1"})
/* loaded from: classes7.dex */
public final class HttpCookies$saveCookiesFrom$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpCookies this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCookies$saveCookiesFrom$1(HttpCookies httpCookies, zu.d<? super HttpCookies$saveCookiesFrom$1> dVar) {
        super(dVar);
        this.this$0 = httpCookies;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.saveCookiesFrom$ktor_client_core(null, this);
    }
}
