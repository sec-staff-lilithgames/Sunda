package io.ktor.http;

import io.ktor.util.StringValuesSingleImpl;
import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ParametersSingleImpl extends StringValuesSingleImpl implements Parameters {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParametersSingleImpl(String name, List<String> values) {
        super(true, name, values);
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(values, "values");
    }

    @Override // io.ktor.util.StringValuesSingleImpl
    public String toString() {
        return "Parameters " + entries();
    }
}
