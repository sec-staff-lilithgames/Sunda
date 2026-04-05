package io.ktor.http;

import io.ktor.util.StringValuesImpl;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ParametersImpl extends StringValuesImpl implements Parameters {
    /* JADX WARN: Multi-variable type inference failed */
    public ParametersImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.ktor.util.StringValuesImpl
    public String toString() {
        return "Parameters " + entries();
    }

    public /* synthetic */ ParametersImpl(Map map, int i10, u uVar) {
        this((i10 & 1) != 0 ? p1.emptyMap() : map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParametersImpl(Map<String, ? extends List<String>> values) {
        super(true, values);
        e0.checkNotNullParameter(values, "values");
    }
}
