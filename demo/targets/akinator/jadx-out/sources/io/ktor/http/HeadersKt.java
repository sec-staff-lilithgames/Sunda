package io.ktor.http;

import io.ktor.http.Headers;
import java.util.List;
import kotlin.jvm.internal.e0;
import kv.l;
import tu.v;
import uu.f0;
import uu.o0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HeadersKt {
    public static final Headers headers(l builder) {
        e0.checkNotNullParameter(builder, "builder");
        Headers.Companion companion = Headers.Companion;
        HeadersBuilder headersBuilder = new HeadersBuilder(0, 1, null);
        builder.invoke(headersBuilder);
        return headersBuilder.build();
    }

    public static final Headers headersOf() {
        return Headers.Companion.getEmpty();
    }

    public static final Headers headersOf(String name, String value) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(value, "value");
        return new HeadersSingleImpl(name, o0.listOf(value));
    }

    public static final Headers headersOf(String name, List<String> values) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(values, "values");
        return new HeadersSingleImpl(name, values);
    }

    public static final Headers headersOf(v... pairs) {
        e0.checkNotNullParameter(pairs, "pairs");
        return new HeadersImpl(p1.toMap(f0.asList(pairs)));
    }
}
