package io.ktor.http;

import e3.g;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class IllegalHeaderValueException extends IllegalArgumentException {
    private final String headerValue;
    private final int position;

    public IllegalHeaderValueException(String headerValue, int i10) {
        e0.checkNotNullParameter(headerValue, "headerValue");
        StringBuilder sb2 = new StringBuilder("Header value '");
        sb2.append(headerValue);
        sb2.append("' contains illegal character '");
        sb2.append(headerValue.charAt(i10));
        sb2.append("' (code ");
        super(g.m(sb2, headerValue.charAt(i10) & 255, ')'));
        this.headerValue = headerValue;
        this.position = i10;
    }

    public final String getHeaderValue() {
        return this.headerValue;
    }

    public final int getPosition() {
        return this.position;
    }
}
