package io.ktor.utils.io.bits;

import e3.g;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class MemoryKt {
    /* renamed from: copyTo-JT6ljtQ, reason: not valid java name */
    public static final void m4338copyToJT6ljtQ(ByteBuffer copyTo, byte[] destination, int i10, int i11) {
        e0.checkNotNullParameter(copyTo, "$this$copyTo");
        e0.checkNotNullParameter(destination, "destination");
        MemoryJvmKt.m4333copyTo9zorpBc(copyTo, destination, i10, i11, 0);
    }

    /* renamed from: get-eY85DW0, reason: not valid java name */
    public static final byte m4340geteY85DW0(ByteBuffer get, int i10) {
        e0.checkNotNullParameter(get, "$this$get");
        return get.get(i10);
    }

    /* renamed from: set-62zg_DM, reason: not valid java name */
    public static final void m4343set62zg_DM(ByteBuffer set, long j10, byte b10) {
        e0.checkNotNullParameter(set, "$this$set");
        if (j10 >= 2147483647L) {
            throw g.r(j10, "index");
        }
        set.put((int) j10, b10);
    }

    /* renamed from: storeAt-OEmREl0, reason: not valid java name */
    public static final void m4345storeAtOEmREl0(ByteBuffer storeAt, long j10, byte b10) {
        e0.checkNotNullParameter(storeAt, "$this$storeAt");
        if (j10 >= 2147483647L) {
            throw g.r(j10, "index");
        }
        storeAt.put((int) j10, b10);
    }

    /* renamed from: copyTo-JT6ljtQ, reason: not valid java name */
    public static final void m4339copyToJT6ljtQ(ByteBuffer copyTo, byte[] destination, long j10, int i10) {
        e0.checkNotNullParameter(copyTo, "$this$copyTo");
        e0.checkNotNullParameter(destination, "destination");
        MemoryJvmKt.m4334copyTo9zorpBc(copyTo, destination, j10, i10, 0);
    }

    /* renamed from: get-eY85DW0, reason: not valid java name */
    public static final byte m4341geteY85DW0(ByteBuffer get, long j10) {
        e0.checkNotNullParameter(get, "$this$get");
        if (j10 < 2147483647L) {
            return get.get((int) j10);
        }
        throw g.r(j10, "index");
    }

    /* renamed from: set-62zg_DM, reason: not valid java name */
    public static final void m4342set62zg_DM(ByteBuffer set, int i10, byte b10) {
        e0.checkNotNullParameter(set, "$this$set");
        set.put(i10, b10);
    }

    /* renamed from: storeAt-OEmREl0, reason: not valid java name */
    public static final void m4344storeAtOEmREl0(ByteBuffer storeAt, int i10, byte b10) {
        e0.checkNotNullParameter(storeAt, "$this$storeAt");
        storeAt.put(i10, b10);
    }
}
