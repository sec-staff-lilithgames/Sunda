package io.ktor.http;

import io.ktor.util.StringValuesBuilderImpl;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ParametersBuilderImpl extends StringValuesBuilderImpl implements ParametersBuilder {
    public ParametersBuilderImpl() {
        this(0, 1, null);
    }

    public /* synthetic */ ParametersBuilderImpl(int i10, int i11, u uVar) {
        this((i11 & 1) != 0 ? 8 : i10);
    }

    @Override // io.ktor.util.StringValuesBuilderImpl, io.ktor.util.StringValuesBuilder
    public Parameters build() {
        return new ParametersImpl(getValues());
    }

    public ParametersBuilderImpl(int i10) {
        super(true, i10);
    }
}
