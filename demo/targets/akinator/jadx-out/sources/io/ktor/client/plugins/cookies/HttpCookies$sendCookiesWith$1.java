package io.ktor.client.plugins.cookies;

import bv.d;
import bv.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.plugins.cookies.HttpCookies", f = "HttpCookies.kt", i = {0}, l = {59}, m = "sendCookiesWith$ktor_client_core", n = {"builder"}, s = {"L$0"})
/* loaded from: classes7.dex */
public final class HttpCookies$sendCookiesWith$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpCookies this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCookies$sendCookiesWith$1(HttpCookies httpCookies, zu.d<? super HttpCookies$sendCookiesWith$1> dVar) {
        super(dVar);
        this.this$0 = httpCookies;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.sendCookiesWith$ktor_client_core(null, this);
    }
}
