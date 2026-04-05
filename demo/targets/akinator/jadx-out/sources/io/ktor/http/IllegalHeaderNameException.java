package io.ktor.http;

import be.nVUQ.UupKET;
import e3.g;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class IllegalHeaderNameException extends IllegalArgumentException {
    private final String headerName;
    private final int position;

    public final String getHeaderName() {
        return this.headerName;
    }

    public final int getPosition() {
        return this.position;
    }

    public IllegalHeaderNameException(String headerName, int i10) {
        e0.checkNotNullParameter(headerName, "headerName");
        StringBuilder sb2 = new StringBuilder("Header name '");
        sb2.append(headerName);
        sb2.append("' contains illegal character '");
        sb2.append(headerName.charAt(i10));
        sb2.append(UupKET.VeoFLU);
        super(g.m(sb2, headerName.charAt(i10) & 255, ')'));
        this.headerName = headerName;
        this.position = i10;
    }
}
