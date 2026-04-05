package io.ktor.http;

import io.ktor.util.StringValuesBuilderImpl;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HeadersBuilder extends StringValuesBuilderImpl {
    public HeadersBuilder() {
        this(0, 1, null);
    }

    @Override // io.ktor.util.StringValuesBuilderImpl
    public void validateName(String name) {
        e0.checkNotNullParameter(name, "name");
        super.validateName(name);
        HttpHeaders.INSTANCE.checkHeaderName(name);
    }

    @Override // io.ktor.util.StringValuesBuilderImpl
    public void validateValue(String value) {
        e0.checkNotNullParameter(value, "value");
        super.validateValue(value);
        HttpHeaders.INSTANCE.checkHeaderValue(value);
    }

    public HeadersBuilder(int i10) {
        super(true, i10);
    }

    @Override // io.ktor.util.StringValuesBuilderImpl, io.ktor.util.StringValuesBuilder
    public Headers build() {
        return new HeadersImpl(getValues());
    }

    public /* synthetic */ HeadersBuilder(int i10, int i11, u uVar) {
        this((i11 & 1) != 0 ? 8 : i10);
    }
}
