package io.ktor.client.plugins;

import bv.d;
import bv.f;
import io.ktor.client.plugins.HttpSend;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.plugins.HttpSend$DefaultSender", f = "HttpSend.kt", i = {0}, l = {138}, m = "execute", n = {"this"}, s = {"L$0"})
/* loaded from: classes7.dex */
public final class HttpSend$DefaultSender$execute$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpSend.DefaultSender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpSend$DefaultSender$execute$1(HttpSend.DefaultSender defaultSender, zu.d<? super HttpSend$DefaultSender$execute$1> dVar) {
        super(dVar);
        this.this$0 = defaultSender;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute(null, this);
    }
}
