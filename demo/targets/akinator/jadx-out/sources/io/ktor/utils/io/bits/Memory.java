package io.ktor.utils.io.bits;

import e3.g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Memory {
    public static final Companion Companion = new Companion(null);
    private static final ByteBuffer Empty;
    private final ByteBuffer buffer;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        /* renamed from: getEmpty-SK3TCg8, reason: not valid java name */
        public final ByteBuffer m4330getEmptySK3TCg8() {
            return Memory.Empty;
        }

        private Companion() {
        }
    }

    static {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(0).order(ByteOrder.BIG_ENDIAN);
        e0.checkNotNullExpressionValue(byteBufferOrder, "allocate(0).order(ByteOrder.BIG_ENDIAN)");
        Empty = m4314constructorimpl(byteBufferOrder);
    }

    private /* synthetic */ Memory(ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Memory m4313boximpl(ByteBuffer byteBuffer) {
        return new Memory(byteBuffer);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static ByteBuffer m4314constructorimpl(ByteBuffer buffer) {
        e0.checkNotNullParameter(buffer, "buffer");
        return buffer;
    }

    /* renamed from: copyTo-JT6ljtQ, reason: not valid java name */
    public static final void m4315copyToJT6ljtQ(ByteBuffer byteBuffer, ByteBuffer destination, int i10, int i11, int i12) {
        e0.checkNotNullParameter(destination, "destination");
        if (byteBuffer.hasArray() && destination.hasArray() && !byteBuffer.isReadOnly() && !destination.isReadOnly()) {
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + i10, destination.array(), destination.arrayOffset() + i12, i11);
            return;
        }
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(i10);
        byteBufferDuplicate.limit(i10 + i11);
        ByteBuffer byteBufferDuplicate2 = destination.duplicate();
        byteBufferDuplicate2.position(i12);
        byteBufferDuplicate2.put(byteBufferDuplicate);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4317equalsimpl(ByteBuffer byteBuffer, Object obj) {
        return (obj instanceof Memory) && e0.areEqual(byteBuffer, ((Memory) obj).m4329unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4318equalsimpl0(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        return e0.areEqual(byteBuffer, byteBuffer2);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final long m4319getSizeimpl(ByteBuffer byteBuffer) {
        return byteBuffer.limit();
    }

    /* renamed from: getSize32-impl, reason: not valid java name */
    public static final int m4320getSize32impl(ByteBuffer byteBuffer) {
        return byteBuffer.limit();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4321hashCodeimpl(ByteBuffer byteBuffer) {
        return byteBuffer.hashCode();
    }

    /* renamed from: loadAt-impl, reason: not valid java name */
    public static final byte m4322loadAtimpl(ByteBuffer byteBuffer, int i10) {
        return byteBuffer.get(i10);
    }

    /* renamed from: slice-87lwejk, reason: not valid java name */
    public static final ByteBuffer m4324slice87lwejk(ByteBuffer byteBuffer, int i10, int i11) {
        return m4314constructorimpl(MemoryJvmKt.sliceSafe(byteBuffer, i10, i11));
    }

    /* renamed from: storeAt-impl, reason: not valid java name */
    public static final void m4326storeAtimpl(ByteBuffer byteBuffer, int i10, byte b10) {
        byteBuffer.put(i10, b10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4328toStringimpl(ByteBuffer byteBuffer) {
        return "Memory(buffer=" + byteBuffer + ')';
    }

    public boolean equals(Object obj) {
        return m4317equalsimpl(this.buffer, obj);
    }

    public final ByteBuffer getBuffer() {
        return this.buffer;
    }

    public int hashCode() {
        return m4321hashCodeimpl(this.buffer);
    }

    public String toString() {
        return m4328toStringimpl(this.buffer);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ ByteBuffer m4329unboximpl() {
        return this.buffer;
    }

    /* renamed from: loadAt-impl, reason: not valid java name */
    public static final byte m4323loadAtimpl(ByteBuffer byteBuffer, long j10) {
        if (j10 < 2147483647L) {
            return byteBuffer.get((int) j10);
        }
        throw g.r(j10, "index");
    }

    /* renamed from: slice-87lwejk, reason: not valid java name */
    public static final ByteBuffer m4325slice87lwejk(ByteBuffer byteBuffer, long j10, long j11) {
        if (j10 >= 2147483647L) {
            throw g.r(j10, "offset");
        }
        int i10 = (int) j10;
        if (j11 < 2147483647L) {
            return m4324slice87lwejk(byteBuffer, i10, (int) j11);
        }
        throw g.r(j11, "length");
    }

    /* renamed from: storeAt-impl, reason: not valid java name */
    public static final void m4327storeAtimpl(ByteBuffer byteBuffer, long j10, byte b10) {
        if (j10 >= 2147483647L) {
            throw g.r(j10, "index");
        }
        byteBuffer.put((int) j10, b10);
    }

    /* renamed from: copyTo-JT6ljtQ, reason: not valid java name */
    public static final void m4316copyToJT6ljtQ(ByteBuffer byteBuffer, ByteBuffer destination, long j10, long j11, long j12) {
        e0.checkNotNullParameter(destination, "destination");
        if (j10 >= 2147483647L) {
            throw g.r(j10, "offset");
        }
        int i10 = (int) j10;
        if (j11 >= 2147483647L) {
            throw g.r(j11, "length");
        }
        int i11 = (int) j11;
        if (j12 < 2147483647L) {
            m4315copyToJT6ljtQ(byteBuffer, destination, i10, i11, (int) j12);
            return;
        }
        throw g.r(j12, "destinationOffset");
    }
}
