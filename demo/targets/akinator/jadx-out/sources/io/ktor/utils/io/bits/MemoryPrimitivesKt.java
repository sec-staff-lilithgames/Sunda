package io.ktor.utils.io.bits;

import e3.g;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;
import tu.k0;
import tu.o0;
import tu.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class MemoryPrimitivesKt {
    /* renamed from: loadUIntAt-eY85DW0, reason: not valid java name */
    public static final int m4366loadUIntAteY85DW0(ByteBuffer loadUIntAt, int i10) {
        e0.checkNotNullParameter(loadUIntAt, "$this$loadUIntAt");
        return k0.m7056constructorimpl(loadUIntAt.getInt(i10));
    }

    /* renamed from: loadULongAt-eY85DW0, reason: not valid java name */
    public static final long m4368loadULongAteY85DW0(ByteBuffer loadULongAt, int i10) {
        e0.checkNotNullParameter(loadULongAt, "$this$loadULongAt");
        return o0.m7081constructorimpl(loadULongAt.getLong(i10));
    }

    /* renamed from: loadUShortAt-eY85DW0, reason: not valid java name */
    public static final short m4370loadUShortAteY85DW0(ByteBuffer loadUShortAt, int i10) {
        e0.checkNotNullParameter(loadUShortAt, "$this$loadUShortAt");
        return t0.m7106constructorimpl(loadUShortAt.getShort(i10));
    }

    /* renamed from: storeUIntAt-c9EmHqw, reason: not valid java name */
    public static final void m4372storeUIntAtc9EmHqw(ByteBuffer storeUIntAt, int i10, int i11) {
        e0.checkNotNullParameter(storeUIntAt, "$this$storeUIntAt");
        storeUIntAt.putInt(i10, i11);
    }

    /* renamed from: storeULongAt-zwzI6Wg, reason: not valid java name */
    public static final void m4374storeULongAtzwzI6Wg(ByteBuffer storeULongAt, int i10, long j10) {
        e0.checkNotNullParameter(storeULongAt, "$this$storeULongAt");
        storeULongAt.putLong(i10, j10);
    }

    /* renamed from: storeUShortAt-4ET0KQI, reason: not valid java name */
    public static final void m4376storeUShortAt4ET0KQI(ByteBuffer storeUShortAt, int i10, short s10) {
        e0.checkNotNullParameter(storeUShortAt, "$this$storeUShortAt");
        storeUShortAt.putShort(i10, s10);
    }

    /* renamed from: storeUIntAt-c9EmHqw, reason: not valid java name */
    public static final void m4373storeUIntAtc9EmHqw(ByteBuffer storeUIntAt, long j10, int i10) {
        e0.checkNotNullParameter(storeUIntAt, "$this$storeUIntAt");
        if (j10 >= 2147483647L) {
            throw g.r(j10, "offset");
        }
        storeUIntAt.putInt((int) j10, i10);
    }

    /* renamed from: storeULongAt-zwzI6Wg, reason: not valid java name */
    public static final void m4375storeULongAtzwzI6Wg(ByteBuffer storeULongAt, long j10, long j11) {
        e0.checkNotNullParameter(storeULongAt, "$this$storeULongAt");
        if (j10 >= 2147483647L) {
            throw g.r(j10, "offset");
        }
        storeULongAt.putLong((int) j10, j11);
    }

    /* renamed from: storeUShortAt-4ET0KQI, reason: not valid java name */
    public static final void m4377storeUShortAt4ET0KQI(ByteBuffer storeUShortAt, long j10, short s10) {
        e0.checkNotNullParameter(storeUShortAt, "$this$storeUShortAt");
        if (j10 >= 2147483647L) {
            throw g.r(j10, "offset");
        }
        storeUShortAt.putShort((int) j10, s10);
    }

    /* renamed from: loadUIntAt-eY85DW0, reason: not valid java name */
    public static final int m4367loadUIntAteY85DW0(ByteBuffer loadUIntAt, long j10) {
        e0.checkNotNullParameter(loadUIntAt, "$this$loadUIntAt");
        if (j10 < 2147483647L) {
            return k0.m7056constructorimpl(loadUIntAt.getInt((int) j10));
        }
        throw g.r(j10, "offset");
    }

    /* renamed from: loadULongAt-eY85DW0, reason: not valid java name */
    public static final long m4369loadULongAteY85DW0(ByteBuffer loadULongAt, long j10) {
        e0.checkNotNullParameter(loadULongAt, "$this$loadULongAt");
        if (j10 < 2147483647L) {
            return o0.m7081constructorimpl(loadULongAt.getLong((int) j10));
        }
        throw g.r(j10, "offset");
    }

    /* renamed from: loadUShortAt-eY85DW0, reason: not valid java name */
    public static final short m4371loadUShortAteY85DW0(ByteBuffer loadUShortAt, long j10) {
        e0.checkNotNullParameter(loadUShortAt, "$this$loadUShortAt");
        if (j10 < 2147483647L) {
            return t0.m7106constructorimpl(loadUShortAt.getShort((int) j10));
        }
        throw g.r(j10, "offset");
    }
}
