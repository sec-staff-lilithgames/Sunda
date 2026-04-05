package io.ktor.http;

import io.ktor.util.StringValues;
import kotlin.jvm.internal.e0;
import kv.l;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface Parameters extends StringValues {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Parameters Empty = EmptyParameters.INSTANCE;

        private Companion() {
        }

        public final Parameters build(l builder) {
            e0.checkNotNullParameter(builder, "builder");
            ParametersBuilder parametersBuilderParametersBuilder$default = ParametersKt.ParametersBuilder$default(0, 1, null);
            builder.invoke(parametersBuilderParametersBuilder$default);
            return parametersBuilderParametersBuilder$default.build();
        }

        public final Parameters getEmpty() {
            return Empty;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static boolean contains(Parameters parameters, String name) {
            e0.checkNotNullParameter(name, "name");
            return StringValues.DefaultImpls.contains(parameters, name);
        }

        public static void forEach(Parameters parameters, p body) {
            e0.checkNotNullParameter(body, "body");
            StringValues.DefaultImpls.forEach(parameters, body);
        }

        public static String get(Parameters parameters, String name) {
            e0.checkNotNullParameter(name, "name");
            return StringValues.DefaultImpls.get(parameters, name);
        }

        public static boolean contains(Parameters parameters, String name, String value) {
            e0.checkNotNullParameter(name, "name");
            e0.checkNotNullParameter(value, "value");
            return StringValues.DefaultImpls.contains(parameters, name, value);
        }
    }
}
