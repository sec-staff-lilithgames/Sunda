package com.applovin.shadow.okio;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.applovin.shadow.okio.-GzipSourceExtensions, reason: invalid class name */
/* loaded from: classes4.dex */
public final class GzipSourceExtensions {
    private static final int FCOMMENT = 4;
    private static final int FEXTRA = 2;
    private static final int FHCRC = 1;
    private static final int FNAME = 3;
    private static final byte SECTION_BODY = 1;
    private static final byte SECTION_DONE = 3;
    private static final byte SECTION_HEADER = 0;
    private static final byte SECTION_TRAILER = 2;

    private static final boolean getBit(int i10, int i11) {
        return ((i10 >> i11) & 1) == 1;
    }

    public static final GzipSource gzip(Source source) {
        e0.checkNotNullParameter(source, "<this>");
        return new GzipSource(source);
    }
}
