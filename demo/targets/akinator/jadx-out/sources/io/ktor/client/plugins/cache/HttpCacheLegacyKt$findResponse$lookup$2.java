package io.ktor.client.plugins.cache;

import io.ktor.http.HeadersBuilder;
import java.util.List;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public /* synthetic */ class HttpCacheLegacyKt$findResponse$lookup$2 extends a0 implements l {
    public HttpCacheLegacyKt$findResponse$lookup$2(Object obj) {
        super(1, obj, HeadersBuilder.class, "getAll", "getAll(Ljava/lang/String;)Ljava/util/List;", 0);
    }

    @Override // kv.l
    public final List<String> invoke(String p02) {
        e0.checkNotNullParameter(p02, "p0");
        return ((HeadersBuilder) this.receiver).getAll(p02);
    }
}
