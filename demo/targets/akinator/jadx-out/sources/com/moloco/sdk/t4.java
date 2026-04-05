package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum t4 implements Internal.EnumLite {
    UNDEFINED_VIDEO_PLACEMENT(0),
    IN_STREAM_PLACEMENT(1),
    IN_BANNER_PLACEMENT(2),
    IN_ARTICLE_PLACEMENT(3),
    IN_FEED_PLACEMENT(4),
    FLOATING_PLACEMENT(5);


    /* renamed from: j, reason: collision with root package name */
    public static final r4 f47488j = new r4();

    /* renamed from: b, reason: collision with root package name */
    public final int f47490b;

    t4(int i10) {
        this.f47490b = i10;
    }

    public static t4 forNumber(int i10) {
        if (i10 == 0) {
            return UNDEFINED_VIDEO_PLACEMENT;
        }
        if (i10 == 1) {
            return IN_STREAM_PLACEMENT;
        }
        if (i10 == 2) {
            return IN_BANNER_PLACEMENT;
        }
        if (i10 == 3) {
            return IN_ARTICLE_PLACEMENT;
        }
        if (i10 == 4) {
            return IN_FEED_PLACEMENT;
        }
        if (i10 != 5) {
            return null;
        }
        return FLOATING_PLACEMENT;
    }

    public static Internal.EnumLiteMap<t4> internalGetValueMap() {
        return f47488j;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return s4.f47433a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f47490b;
    }

    @Deprecated
    public static t4 valueOf(int i10) {
        return forNumber(i10);
    }
}
