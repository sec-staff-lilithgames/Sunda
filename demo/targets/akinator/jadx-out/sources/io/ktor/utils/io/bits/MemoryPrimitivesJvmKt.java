package io.ktor.utils.io.bits;

import e3.g;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class MemoryPrimitivesJvmKt {
    /* renamed from: loadDoubleAt-eY85DW0, reason: not valid java name */
    public static final double m4346loadDoubleAteY85DW0(ByteBuffer loadDoubleAt, int i10) {
        e0.checkNotNullParameter(loadDoubleAt, "$this$loadDoubleAt");
        return loadDoubleAt.getDouble(i10);
    }

    /* renamed from: loadFloatAt-eY85DW0, reason: not valid java name */
    public static final float m4348loadFloatAteY85DW0(ByteBuffer loadFloatAt, int i10) {
        e0.checkNotNullParameter(loadFloatAt, "$this$loadFloatAt");
        return loadFloatAt.getFloat(i10);
    }

    /* renamed from: loadIntAt-eY85DW0, reason: not valid java name */
    public static final int m4350loadIntAteY85DW0(ByteBuffer loadIntAt, int i10) {
        e0.checkNotNullParameter(loadIntAt, "$this$loadIntAt");
        return loadIntAt.getInt(i10);
    }

    /* renamed from: loadLongAt-eY85DW0, reason: not valid java name */
    public static final long m4352loadLongAteY85DW0(ByteBuffer loadLongAt, int i10) {
        e0.checkNotNullParameter(loadLongAt, "$this$loadLongAt");
        return loadLongAt.getLong(i10);
    }

    /* renamed from: loadShortAt-eY85DW0, reason: not valid java name */
    public static final short m4354loadShortAteY85DW0(ByteBuffer loadShortAt, int i10) {
        e0.checkNotNullParameter(loadShortAt, "$this$loadShortAt");
        return loadShortAt.getShort(i10);
    }

    /* renamed from: storeDoubleAt-62zg_DM, reason: not valid java name */
    public static final void m4356storeDoubleAt62zg_DM(ByteBuffer storeDoubleAt, int i10, double d10) {
        e0.checkNotNullParameter(storeDoubleAt, "$this$storeDoubleAt");
        storeDoubleAt.putDouble(i10, d10);
    }

    /* renamed from: storeFloatAt-62zg_DM, reason: not valid java name */
    public static final void m4358storeFloatAt62zg_DM(ByteBuffer storeFloatAt, int i10, float f10) {
        e0.checkNotNullParameter(storeFloatAt, "$this$storeFloatAt");
        storeFloatAt.putFloat(i10, f10);
    }

    /* renamed from: storeIntAt-62zg_DM, reason: not valid java name */
    public static final void m4360storeIntAt62zg_DM(ByteBuffer storeIntAt, int i10, int i11) {
        e0.checkNotNullParameter(storeIntAt, "$this$storeIntAt");
        storeIntAt.putInt(i10, i11);
    }

    /* renamed from: storeLongAt-62zg_DM, reason: not valid java name */
    public static final void m4362storeLongAt62zg_DM(ByteBuffer storeLongAt, int i10, long j10) {
        e0.checkNotNullParameter(storeLongAt, "$this$storeLongAt");
        storeLongAt.putLong(i10, j10);
    }

    /* renamed from: storeShortAt-62zg_DM, reason: not valid java name */
    public static final void m4364storeShortAt62zg_DM(ByteBuffer storeShortAt, int i10, short s10) {
        e0.checkNotNullParameter(storeShortAt, "$this$storeShortAt");
        storeShortAt.putShort(i10, s10);
    }

    /* renamed from: loadDoubleAt-eY85DW0, reason: not valid java name */
    public static final double m4347loadDoubleAteY85DW0(ByteBuffer loadDoubleAt, long j10) {
        e0.checkNotNullParameter(loadDoubleAt, "$this$loadDoubleAt");
        if (j10 < 2147483647L) {
            return loadDoubleAt.getDouble((int) j10);
        }
        throw g.r(j10, "offset");
    }

    /* renamed from: loadFloatAt-eY85DW0, reason: not valid java name */
    public static final float m4349loadFloatAteY85DW0(ByteBuffer loadFloatAt, long j10) {
        e0.checkNotNullParameter(loadFloatAt, "$this$loadFloatAt");
        if (j10 < 2147483647L) {
            return loadFloatAt.getFloat((int) j10);
        }
        throw g.r(j10, "offset");
    }

    /* renamed from: loadIntAt-eY85DW0, reason: not valid java name */
    public static final int m4351loadIntAteY85DW0(ByteBuffer loadIntAt, long j10) {
        e0.checkNotNullParameter(loadIntAt, "$this$loadIntAt");
        if (j10 < 2147483647L) {
            return loadIntAt.getInt((int) j10);
        }
        throw g.r(j10, "offset");
    }

    /* renamed from: loadLongAt-eY85DW0, reason: not valid java name */
    public static final long m4353loadLongAteY85DW0(ByteBuffer loadLongAt, long j10) {
        e0.checkNotNullParameter(loadLongAt, "$this$loadLongAt");
        if (j10 < 2147483647L) {
            return loadLongAt.getLong((int) j10);
        }
        throw g.r(j10, "offset");
    }

    /* renamed from: loadShortAt-eY85DW0, reason: not valid java name */
    public static final short m4355loadShortAteY85DW0(ByteBuffer loadShortAt, long j10) {
        e0.checkNotNullParameter(loadShortAt, "$this$loadShortAt");
        if (j10 < 2147483647L) {
            return loadShortAt.getShort((int) j10);
        }
        throw g.r(j10, "offset");
    }

    /* renamed from: storeDoubleAt-62zg_DM, reason: not valid java name */
    public static final void m4357storeDoubleAt62zg_DM(ByteBuffer storeDoubleAt, long j10, double d10) {
        e0.checkNotNullParameter(storeDoubleAt, "$this$storeDoubleAt");
        if (j10 >= 2147483647L) {
            throw g.r(j10, "offset");
        }
        storeDoubleAt.putDouble((int) j10, d10);
    }

    /* renamed from: storeFloatAt-62zg_DM, reason: not valid java name */
    public static final void m4359storeFloatAt62zg_DM(ByteBuffer storeFloatAt, long j10, float f10) {
        e0.checkNotNullParameter(storeFloatAt, "$this$storeFloatAt");
        if (j10 >= 2147483647L) {
            throw g.r(j10, "offset");
        }
        storeFloatAt.putFloat((int) j10, f10);
    }

    /* renamed from: storeIntAt-62zg_DM, reason: not valid java name */
    public static final void m4361storeIntAt62zg_DM(ByteBuffer storeIntAt, long j10, int i10) {
        e0.checkNotNullParameter(storeIntAt, "$this$storeIntAt");
        if (j10 >= 2147483647L) {
            throw g.r(j10, "offset");
        }
        storeIntAt.putInt((int) j10, i10);
    }

    /* renamed from: storeLongAt-62zg_DM, reason: not valid java name */
    public static final void m4363storeLongAt62zg_DM(ByteBuffer storeLongAt, long j10, long j11) {
        e0.checkNotNullParameter(storeLongAt, "$this$storeLongAt");
        if (j10 >= 2147483647L) {
            throw g.r(j10, "offset");
        }
        storeLongAt.putLong((int) j10, j11);
    }

    /* renamed from: storeShortAt-62zg_DM, reason: not valid java name */
    public static final void m4365storeShortAt62zg_DM(ByteBuffer storeShortAt, long j10, short s10) {
        e0.checkNotNullParameter(storeShortAt, "$this$storeShortAt");
        if (j10 >= 2147483647L) {
            throw g.r(j10, "offset");
        }
        storeShortAt.putShort((int) j10, s10);
    }
}
