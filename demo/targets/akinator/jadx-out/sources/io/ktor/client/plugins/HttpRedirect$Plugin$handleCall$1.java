package io.ktor.client.plugins;

import androidx.core.app.NotificationCompat;
import bv.d;
import bv.f;
import io.ktor.client.plugins.HttpRedirect;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.plugins.HttpRedirect$Plugin", f = "HttpRedirect.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {113}, m = "handleCall", n = {"this", "$this$handleCall", "context", "client", NotificationCompat.CATEGORY_CALL, "requestBuilder", "originProtocol", "originAuthority", "allowHttpsDowngrade"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "Z$0"})
/* loaded from: classes7.dex */
public final class HttpRedirect$Plugin$handleCall$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpRedirect.Plugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpRedirect$Plugin$handleCall$1(HttpRedirect.Plugin plugin, zu.d<? super HttpRedirect$Plugin$handleCall$1> dVar) {
        super(dVar);
        this.this$0 = plugin;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.handleCall(null, null, null, false, null, this);
    }
}
