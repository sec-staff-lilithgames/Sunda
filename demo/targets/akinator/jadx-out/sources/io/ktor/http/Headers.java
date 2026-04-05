package io.ktor.http;

import io.ktor.util.StringValues;
import kotlin.jvm.internal.e0;
import kv.l;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface Headers extends StringValues {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static boolean contains(Headers headers, String name) {
            e0.checkNotNullParameter(name, "name");
            return StringValues.DefaultImpls.contains(headers, name);
        }

        public static void forEach(Headers headers, p body) {
            e0.checkNotNullParameter(body, "body");
            StringValues.DefaultImpls.forEach(headers, body);
        }

        public static String get(Headers headers, String name) {
            e0.checkNotNullParameter(name, "name");
            return StringValues.DefaultImpls.get(headers, name);
        }

        public static boolean contains(Headers headers, String name, String value) {
            e0.checkNotNullParameter(name, "name");
            e0.checkNotNullParameter(value, "value");
            return StringValues.DefaultImpls.contains(headers, name, value);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Headers Empty = EmptyHeaders.INSTANCE;

        private Companion() {
        }

        public final Headers build(l builder) {
            e0.checkNotNullParameter(builder, "builder");
            HeadersBuilder headersBuilder = new HeadersBuilder(0, 1, null);
            builder.invoke(headersBuilder);
            return headersBuilder.build();
        }

        public final Headers getEmpty() {
            return Empty;
        }

        public static /* synthetic */ void getEmpty$annotations() {
        }
    }
}
