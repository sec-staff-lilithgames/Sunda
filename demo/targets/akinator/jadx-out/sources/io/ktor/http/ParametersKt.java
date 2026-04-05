package io.ktor.http;

import io.ktor.http.Parameters;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kv.l;
import tu.v;
import uu.f0;
import uu.o0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ParametersKt {
    public static final ParametersBuilder ParametersBuilder(int i10) {
        return new ParametersBuilderImpl(i10);
    }

    public static /* synthetic */ ParametersBuilder ParametersBuilder$default(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8;
        }
        return ParametersBuilder(i10);
    }

    public static final Parameters parameters(l builder) {
        e0.checkNotNullParameter(builder, "builder");
        Parameters.Companion companion = Parameters.Companion;
        ParametersBuilder parametersBuilderParametersBuilder$default = ParametersBuilder$default(0, 1, null);
        builder.invoke(parametersBuilderParametersBuilder$default);
        return parametersBuilderParametersBuilder$default.build();
    }

    public static final Parameters parametersOf() {
        return Parameters.Companion.getEmpty();
    }

    public static final Parameters plus(Parameters parameters, Parameters other) {
        e0.checkNotNullParameter(parameters, "<this>");
        e0.checkNotNullParameter(other, "other");
        if (parameters.getCaseInsensitiveName() != other.getCaseInsensitiveName()) {
            throw new IllegalArgumentException("Cannot concatenate Parameters with case-sensitive and case-insensitive names");
        }
        if (parameters.isEmpty()) {
            return other;
        }
        if (other.isEmpty()) {
            return parameters;
        }
        Parameters.Companion companion = Parameters.Companion;
        ParametersBuilder parametersBuilderParametersBuilder$default = ParametersBuilder$default(0, 1, null);
        parametersBuilderParametersBuilder$default.appendAll(parameters);
        parametersBuilderParametersBuilder$default.appendAll(other);
        return parametersBuilderParametersBuilder$default.build();
    }

    public static final Parameters parametersOf(String name, String value) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(value, "value");
        return new ParametersSingleImpl(name, o0.listOf(value));
    }

    public static final Parameters parametersOf(String name, List<String> values) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(values, "values");
        return new ParametersSingleImpl(name, values);
    }

    public static final Parameters parametersOf(Map<String, ? extends List<String>> map) {
        e0.checkNotNullParameter(map, "map");
        return new ParametersImpl(map);
    }

    public static final Parameters parametersOf(v... pairs) {
        e0.checkNotNullParameter(pairs, "pairs");
        return new ParametersImpl(p1.toMap(f0.asList(pairs)));
    }
}
