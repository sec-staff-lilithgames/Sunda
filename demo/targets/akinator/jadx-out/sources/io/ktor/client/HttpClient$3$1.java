package io.ktor.client;

import io.ktor.client.plugins.DefaultTransformKt;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class HttpClient$3$1 extends f0 implements l {
    public static final HttpClient$3$1 INSTANCE = new HttpClient$3$1();

    public HttpClient$3$1() {
        super(1);
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((HttpClient) obj);
        return x0.f87415a;
    }

    public final void invoke(HttpClient install) {
        e0.checkNotNullParameter(install, "$this$install");
        DefaultTransformKt.defaultTransformers(install);
    }
}
