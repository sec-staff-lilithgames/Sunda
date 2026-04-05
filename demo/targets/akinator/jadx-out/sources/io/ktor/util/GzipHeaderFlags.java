package io.ktor.util;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class GzipHeaderFlags {
    public static final int EXTRA = 4;
    public static final int FCOMMENT = 16;
    public static final int FHCRC = 2;
    public static final int FNAME = 8;
    public static final int FTEXT = 1;
    public static final GzipHeaderFlags INSTANCE = new GzipHeaderFlags();

    private GzipHeaderFlags() {
    }
}
