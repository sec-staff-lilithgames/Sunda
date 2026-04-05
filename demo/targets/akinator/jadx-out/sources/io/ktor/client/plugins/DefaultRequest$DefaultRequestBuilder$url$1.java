package io.ktor.client.plugins;

import io.ktor.http.URLBuilder;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class DefaultRequest$DefaultRequestBuilder$url$1 extends f0 implements l {
    public static final DefaultRequest$DefaultRequestBuilder$url$1 INSTANCE = new DefaultRequest$DefaultRequestBuilder$url$1();

    public DefaultRequest$DefaultRequestBuilder$url$1() {
        super(1);
    }

    public final void invoke(URLBuilder uRLBuilder) {
        e0.checkNotNullParameter(uRLBuilder, "$this$null");
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((URLBuilder) obj);
        return x0.f87415a;
    }
}
