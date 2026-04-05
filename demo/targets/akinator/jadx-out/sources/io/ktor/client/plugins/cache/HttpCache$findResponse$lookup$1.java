package io.ktor.client.plugins.cache;

import io.ktor.http.HeadersBuilder;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public /* synthetic */ class HttpCache$findResponse$lookup$1 extends a0 implements l {
    public HttpCache$findResponse$lookup$1(Object obj) {
        super(1, obj, HeadersBuilder.class, "get", "get(Ljava/lang/String;)Ljava/lang/String;", 0);
    }

    @Override // kv.l
    public final String invoke(String p02) {
        e0.checkNotNullParameter(p02, "p0");
        return ((HeadersBuilder) this.receiver).get(p02);
    }
}
