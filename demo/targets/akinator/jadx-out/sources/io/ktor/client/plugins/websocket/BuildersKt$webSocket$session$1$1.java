package io.ktor.client.plugins.websocket;

import io.ktor.http.URLBuilder;
import io.ktor.http.URLProtocol;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.p;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class BuildersKt$webSocket$session$1$1 extends f0 implements p {
    public static final BuildersKt$webSocket$session$1$1 INSTANCE = new BuildersKt$webSocket$session$1$1();

    public BuildersKt$webSocket$session$1$1() {
        super(2);
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((URLBuilder) obj, (URLBuilder) obj2);
        return x0.f87415a;
    }

    public final void invoke(URLBuilder url, URLBuilder it) {
        e0.checkNotNullParameter(url, "$this$url");
        e0.checkNotNullParameter(it, "it");
        url.setProtocol(URLProtocol.Companion.getWS());
    }
}
