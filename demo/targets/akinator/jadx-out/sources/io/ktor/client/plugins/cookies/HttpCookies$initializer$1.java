package io.ktor.client.plugins.cookies;

import av.e;
import bv.f;
import bv.n;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.plugins.cookies.HttpCookies$initializer$1", f = "HttpCookies.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class HttpCookies$initializer$1 extends n implements p {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ HttpCookies this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCookies$initializer$1(HttpCookies httpCookies, d<? super HttpCookies$initializer$1> dVar) {
        super(2, dVar);
        this.this$0 = httpCookies;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new HttpCookies$initializer$1(this.this$0, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        HttpCookies httpCookies;
        Iterator it;
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            List list = this.this$0.defaults;
            httpCookies = this.this$0;
            it = list.iterator();
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$1;
            httpCookies = (HttpCookies) this.L$0;
            a0.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            p pVar = (p) it.next();
            CookiesStorage cookiesStorage = httpCookies.storage;
            this.L$0 = httpCookies;
            this.L$1 = it;
            this.label = 1;
            if (pVar.invoke(cookiesStorage, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
        return ((HttpCookies$initializer$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
