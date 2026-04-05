package io.ktor.http.parsing;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class RawGrammar extends Grammar {
    private final String value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RawGrammar(String value) {
        super(null);
        e0.checkNotNullParameter(value, "value");
        this.value = value;
    }

    public final String getValue() {
        return this.value;
    }
}
