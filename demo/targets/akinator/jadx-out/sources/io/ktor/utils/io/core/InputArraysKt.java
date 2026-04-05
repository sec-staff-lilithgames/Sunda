package io.ktor.utils.io.core;

import e3.g;
import io.ktor.utils.io.bits.Memory;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.core.internal.UnsafeKt;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kv.q;
import kv.r;
import tu.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class InputArraysKt {
    public static final int readAvailable(Input input, byte[] dst, int i10, int i11) throws Throwable {
        int i12;
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        boolean z10 = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (chunkBufferPrepareReadFirstHead == null) {
            i12 = i11;
        } else {
            i12 = i11;
            while (true) {
                try {
                    int iMin = Math.min(i12, chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition());
                    BufferPrimitivesKt.readFully((Buffer) chunkBufferPrepareReadFirstHead, dst, i10, iMin);
                    i12 -= iMin;
                    i10 += iMin;
                    if (i12 <= 0) {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        break;
                    }
                    try {
                        chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                        if (chunkBufferPrepareReadFirstHead == null) {
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = false;
                        if (z10) {
                            UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
        return i11 - i12;
    }

    public static /* synthetic */ int readAvailable$default(Input input, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length - i10;
        }
        return readAvailable(input, bArr, i10, i11);
    }

    /* renamed from: readAvailable-UAd2zVI, reason: not valid java name */
    public static final int m4500readAvailableUAd2zVI(Input readAvailable, ByteBuffer destination, int i10, int i11) {
        e0.checkNotNullParameter(readAvailable, "$this$readAvailable");
        e0.checkNotNullParameter(destination, "destination");
        return (int) m4501readAvailableUAd2zVI(readAvailable, destination, i10, i11);
    }

    public static final void readFully(Input input, byte[] dst, int i10, int i11) {
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        boolean z10 = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (chunkBufferPrepareReadFirstHead != null) {
            while (true) {
                try {
                    int iMin = Math.min(i11, chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition());
                    BufferPrimitivesKt.readFully((Buffer) chunkBufferPrepareReadFirstHead, dst, i10, iMin);
                    i11 -= iMin;
                    i10 += iMin;
                    if (i11 <= 0) {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        break;
                    }
                    try {
                        chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                        if (chunkBufferPrepareReadFirstHead == null) {
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = false;
                        if (z10) {
                            UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
        if (i11 > 0) {
            throw g.q(i11);
        }
    }

    public static /* synthetic */ void readFully$default(Input input, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length - i10;
        }
        readFully(input, bArr, i10, i11);
    }

    /* renamed from: readFully-UAd2zVI, reason: not valid java name */
    public static final void m4502readFullyUAd2zVI(Input readFully, ByteBuffer destination, int i10, int i11) throws EOFException {
        e0.checkNotNullParameter(readFully, "$this$readFully");
        e0.checkNotNullParameter(destination, "destination");
        m4503readFullyUAd2zVI(readFully, destination, i10, i11);
    }

    private static final int readFullyBytesTemplate(Input input, int i10, int i11, q qVar) throws Throwable {
        boolean z10;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (chunkBufferPrepareReadFirstHead == null) {
            return i11;
        }
        while (true) {
            try {
                int iMin = Math.min(i11, chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition());
                qVar.invoke(chunkBufferPrepareReadFirstHead, Integer.valueOf(i10), Integer.valueOf(iMin));
                i11 -= iMin;
                i10 += iMin;
                if (i11 <= 0) {
                    z10 = true;
                    break;
                }
                z10 = false;
                try {
                    ChunkBuffer chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                    if (chunkBufferPrepareReadNextHead == null) {
                        break;
                    }
                    chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
                } catch (Throwable th2) {
                    th = th2;
                    b0.finallyStart(1);
                    if (z10) {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                    }
                    b0.finallyEnd(1);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                z10 = true;
            }
        }
        b0.finallyStart(1);
        if (z10) {
            UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
        }
        b0.finallyEnd(1);
        return i11;
    }

    private static final int readFullyTemplate(Input input, int i10, int i11, int i12, q qVar) throws Throwable {
        boolean z10;
        ChunkBuffer chunkBufferPrepareReadNextHead;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (chunkBufferPrepareReadFirstHead == null) {
            return i11;
        }
        int i13 = 1;
        while (true) {
            try {
                int writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                z10 = false;
                if (writePosition >= i13) {
                    try {
                        int iMin = Math.min(i11, (chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition()) / i12);
                        qVar.invoke(chunkBufferPrepareReadFirstHead, Integer.valueOf(i10), Integer.valueOf(iMin));
                        i11 -= iMin;
                        i10 += iMin;
                        i13 = i11 > 0 ? i12 : 0;
                        b0.finallyStart(1);
                        writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                        b0.finallyEnd(1);
                    } finally {
                    }
                }
                if (writePosition == 0) {
                    try {
                        chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                    } catch (Throwable th2) {
                        th = th2;
                        b0.finallyStart(1);
                        if (z10) {
                            UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        }
                        b0.finallyEnd(1);
                        throw th;
                    }
                } else if (writePosition < i13 || chunkBufferPrepareReadFirstHead.getCapacity() - chunkBufferPrepareReadFirstHead.getLimit() < 8) {
                    UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                    chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, i13);
                } else {
                    chunkBufferPrepareReadNextHead = chunkBufferPrepareReadFirstHead;
                }
                if (chunkBufferPrepareReadNextHead == null) {
                    break;
                }
                if (i13 <= 0) {
                    z10 = true;
                    chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
                    break;
                }
                chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
            } catch (Throwable th3) {
                th = th3;
                z10 = true;
            }
        }
        b0.finallyStart(1);
        if (z10) {
            UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
        }
        b0.finallyEnd(1);
        return i11;
    }

    private static final void requireNoRemaining(int i10) {
        if (i10 > 0) {
            throw g.q(i10);
        }
    }

    public static /* synthetic */ int readAvailable$default(Input input, short[] sArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = sArr.length - i10;
        }
        return readAvailable(input, sArr, i10, i11);
    }

    /* renamed from: readAvailable-UAd2zVI, reason: not valid java name */
    public static final long m4501readAvailableUAd2zVI(Input readAvailable, ByteBuffer byteBuffer, long j10, long j11) throws Throwable {
        long j12;
        e0.checkNotNullParameter(readAvailable, "$this$readAvailable");
        ByteBuffer destination = byteBuffer;
        e0.checkNotNullParameter(destination, "destination");
        boolean z10 = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(readAvailable, 1);
        if (chunkBufferPrepareReadFirstHead == null) {
            j12 = j11;
        } else {
            long j13 = j10;
            j12 = j11;
            ChunkBuffer chunkBufferPrepareReadNextHead = chunkBufferPrepareReadFirstHead;
            while (true) {
                try {
                    int iMin = (int) Math.min(j12, chunkBufferPrepareReadNextHead.getWritePosition() - chunkBufferPrepareReadNextHead.getReadPosition());
                    long j14 = iMin;
                    Memory.m4316copyToJT6ljtQ(chunkBufferPrepareReadNextHead.m4458getMemorySK3TCg8(), destination, chunkBufferPrepareReadNextHead.getReadPosition(), j14, j13);
                    chunkBufferPrepareReadNextHead.discardExact(iMin);
                    j12 -= j14;
                    j13 += j14;
                    if (j12 <= 0) {
                        UnsafeKt.completeReadHead(readAvailable, chunkBufferPrepareReadNextHead);
                        break;
                    }
                    try {
                        chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadNextHead(readAvailable, chunkBufferPrepareReadNextHead);
                        if (chunkBufferPrepareReadNextHead == null) {
                            break;
                        }
                        destination = byteBuffer;
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = false;
                        if (z10) {
                            UnsafeKt.completeReadHead(readAvailable, chunkBufferPrepareReadNextHead);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
        long j15 = j11 - j12;
        if (j15 == 0 && readAvailable.getEndOfInput()) {
            return -1L;
        }
        return j15;
    }

    public static /* synthetic */ void readFully$default(Input input, short[] sArr, int i10, int i11, int i12, Object obj) throws Throwable {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = sArr.length - i10;
        }
        readFully(input, sArr, i10, i11);
    }

    /* renamed from: readFully-UAd2zVI, reason: not valid java name */
    public static final void m4503readFullyUAd2zVI(Input readFully, ByteBuffer destination, long j10, long j11) throws EOFException {
        e0.checkNotNullParameter(readFully, "$this$readFully");
        e0.checkNotNullParameter(destination, "destination");
        if (m4501readAvailableUAd2zVI(readFully, destination, j10, j11) == j11) {
            return;
        }
        StringsKt.prematureEndOfStream(j11);
        throw new k();
    }

    public static /* synthetic */ int readAvailable$default(Input input, int[] iArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = iArr.length - i10;
        }
        return readAvailable(input, iArr, i10, i11);
    }

    public static /* synthetic */ void readFully$default(Input input, int[] iArr, int i10, int i11, int i12, Object obj) throws Throwable {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = iArr.length - i10;
        }
        readFully(input, iArr, i10, i11);
    }

    public static /* synthetic */ int readAvailable$default(Input input, long[] jArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length - i10;
        }
        return readAvailable(input, jArr, i10, i11);
    }

    public static /* synthetic */ void readFully$default(Input input, long[] jArr, int i10, int i11, int i12, Object obj) throws Throwable {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length - i10;
        }
        readFully(input, jArr, i10, i11);
    }

    public static /* synthetic */ int readAvailable$default(Input input, float[] fArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length - i10;
        }
        return readAvailable(input, fArr, i10, i11);
    }

    public static /* synthetic */ void readFully$default(Input input, float[] fArr, int i10, int i11, int i12, Object obj) throws Throwable {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length - i10;
        }
        readFully(input, fArr, i10, i11);
    }

    public static /* synthetic */ int readAvailable$default(Input input, double[] dArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = dArr.length - i10;
        }
        return readAvailable(input, dArr, i10, i11);
    }

    public static /* synthetic */ void readFully$default(Input input, double[] dArr, int i10, int i11, int i12, Object obj) throws Throwable {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = dArr.length - i10;
        }
        readFully(input, dArr, i10, i11);
    }

    public static final int readAvailable(Input input, short[] dst, int i10, int i11) throws Throwable {
        int i12;
        ChunkBuffer chunkBufferPrepareReadNextHead;
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        boolean z10 = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (chunkBufferPrepareReadFirstHead == null) {
            i12 = i11;
        } else {
            i12 = i11;
            int i13 = 1;
            while (true) {
                try {
                    int writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                    if (writePosition >= i13) {
                        try {
                            int iMin = Math.min(i12, (chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition()) / 2);
                            BufferPrimitivesKt.readFully((Buffer) chunkBufferPrepareReadFirstHead, dst, i10, iMin);
                            i12 -= iMin;
                            i10 += iMin;
                            i13 = i12 > 0 ? 2 : 0;
                            writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                        } finally {
                        }
                    }
                    if (writePosition == 0) {
                        try {
                            chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                        } catch (Throwable th2) {
                            th = th2;
                            z10 = false;
                            if (z10) {
                                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else if (writePosition < i13 || chunkBufferPrepareReadFirstHead.getCapacity() - chunkBufferPrepareReadFirstHead.getLimit() < 8) {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, i13);
                    } else {
                        chunkBufferPrepareReadNextHead = chunkBufferPrepareReadFirstHead;
                    }
                    if (chunkBufferPrepareReadNextHead == null) {
                        z10 = false;
                        break;
                    }
                    chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
                    if (i13 <= 0) {
                        break;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (z10) {
                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
            }
        }
        return i11 - i12;
    }

    public static /* synthetic */ int readAvailable$default(Input input, Buffer buffer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = buffer.getLimit() - buffer.getWritePosition();
        }
        return readAvailable(input, buffer, i10);
    }

    public static /* synthetic */ void readFully$default(Input input, Buffer buffer, int i10, int i11, Object obj) throws Throwable {
        if ((i11 & 2) != 0) {
            i10 = buffer.getLimit() - buffer.getWritePosition();
        }
        readFully(input, buffer, i10);
    }

    private static final long readFullyBytesTemplate(Input input, long j10, long j11, r rVar) throws Throwable {
        boolean z10;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (chunkBufferPrepareReadFirstHead == null) {
            return j11;
        }
        while (true) {
            try {
                int iMin = (int) Math.min(j11, chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition());
                rVar.invoke(Memory.m4313boximpl(chunkBufferPrepareReadFirstHead.m4458getMemorySK3TCg8()), Long.valueOf(chunkBufferPrepareReadFirstHead.getReadPosition()), Long.valueOf(j10), Integer.valueOf(iMin));
                chunkBufferPrepareReadFirstHead.discardExact(iMin);
                long j12 = iMin;
                j11 -= j12;
                j10 += j12;
                if (j11 <= 0) {
                    z10 = true;
                    break;
                }
                z10 = false;
                try {
                    ChunkBuffer chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                    if (chunkBufferPrepareReadNextHead == null) {
                        break;
                    }
                    chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
                } catch (Throwable th2) {
                    th = th2;
                    b0.finallyStart(1);
                    if (z10) {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                    }
                    b0.finallyEnd(1);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                z10 = true;
            }
        }
        b0.finallyStart(1);
        if (z10) {
            UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
        }
        b0.finallyEnd(1);
        return j11;
    }

    public static final void readFully(Input input, short[] dst, int i10, int i11) throws Throwable {
        ChunkBuffer chunkBufferPrepareReadNextHead;
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        boolean z10 = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (chunkBufferPrepareReadFirstHead != null) {
            int i12 = 1;
            while (true) {
                try {
                    int writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                    if (writePosition >= i12) {
                        try {
                            int iMin = Math.min(i11, (chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition()) / 2);
                            BufferPrimitivesKt.readFully((Buffer) chunkBufferPrepareReadFirstHead, dst, i10, iMin);
                            i11 -= iMin;
                            i10 += iMin;
                            i12 = i11 > 0 ? 2 : 0;
                            writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                        } finally {
                        }
                    }
                    if (writePosition == 0) {
                        try {
                            chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                        } catch (Throwable th2) {
                            th = th2;
                            z10 = false;
                            if (z10) {
                                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else if (writePosition < i12 || chunkBufferPrepareReadFirstHead.getCapacity() - chunkBufferPrepareReadFirstHead.getLimit() < 8) {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, i12);
                    } else {
                        chunkBufferPrepareReadNextHead = chunkBufferPrepareReadFirstHead;
                    }
                    if (chunkBufferPrepareReadNextHead == null) {
                        z10 = false;
                        break;
                    } else {
                        chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
                        if (i12 <= 0) {
                            break;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (z10) {
                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
            }
        }
        if (i11 > 0) {
            throw g.q(i11);
        }
    }

    public static final int readAvailable(Input input, int[] dst, int i10, int i11) throws Throwable {
        int i12;
        ChunkBuffer chunkBufferPrepareReadNextHead;
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        boolean z10 = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (chunkBufferPrepareReadFirstHead == null) {
            i12 = i11;
        } else {
            i12 = i11;
            int i13 = 1;
            while (true) {
                try {
                    int writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                    if (writePosition >= i13) {
                        try {
                            int iMin = Math.min(i12, (chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition()) / 4);
                            BufferPrimitivesKt.readFully((Buffer) chunkBufferPrepareReadFirstHead, dst, i10, iMin);
                            i12 -= iMin;
                            i10 += iMin;
                            i13 = i12 > 0 ? 4 : 0;
                            writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                        } finally {
                        }
                    }
                    if (writePosition == 0) {
                        try {
                            chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                        } catch (Throwable th2) {
                            th = th2;
                            z10 = false;
                            if (z10) {
                                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else if (writePosition < i13 || chunkBufferPrepareReadFirstHead.getCapacity() - chunkBufferPrepareReadFirstHead.getLimit() < 8) {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, i13);
                    } else {
                        chunkBufferPrepareReadNextHead = chunkBufferPrepareReadFirstHead;
                    }
                    if (chunkBufferPrepareReadNextHead == null) {
                        z10 = false;
                        break;
                    }
                    chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
                    if (i13 <= 0) {
                        break;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (z10) {
                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
            }
        }
        return i11 - i12;
    }

    public static final int readAvailable(Input input, long[] dst, int i10, int i11) throws Throwable {
        int i12;
        ChunkBuffer chunkBufferPrepareReadNextHead;
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        boolean z10 = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (chunkBufferPrepareReadFirstHead == null) {
            i12 = i11;
        } else {
            i12 = i11;
            int i13 = 1;
            while (true) {
                try {
                    int writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                    if (writePosition >= i13) {
                        try {
                            int iMin = Math.min(i12, (chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition()) / 8);
                            BufferPrimitivesKt.readFully((Buffer) chunkBufferPrepareReadFirstHead, dst, i10, iMin);
                            i12 -= iMin;
                            i10 += iMin;
                            i13 = i12 > 0 ? 8 : 0;
                            writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                        } finally {
                        }
                    }
                    if (writePosition == 0) {
                        try {
                            chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                        } catch (Throwable th2) {
                            th = th2;
                            z10 = false;
                            if (z10) {
                                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else if (writePosition < i13 || chunkBufferPrepareReadFirstHead.getCapacity() - chunkBufferPrepareReadFirstHead.getLimit() < 8) {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, i13);
                    } else {
                        chunkBufferPrepareReadNextHead = chunkBufferPrepareReadFirstHead;
                    }
                    if (chunkBufferPrepareReadNextHead == null) {
                        z10 = false;
                        break;
                    }
                    chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
                    if (i13 <= 0) {
                        break;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (z10) {
                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
            }
        }
        return i11 - i12;
    }

    public static final void readFully(Input input, int[] dst, int i10, int i11) throws Throwable {
        ChunkBuffer chunkBufferPrepareReadNextHead;
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        boolean z10 = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (chunkBufferPrepareReadFirstHead != null) {
            int i12 = 1;
            while (true) {
                try {
                    int writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                    if (writePosition >= i12) {
                        try {
                            int iMin = Math.min(i11, (chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition()) / 4);
                            BufferPrimitivesKt.readFully((Buffer) chunkBufferPrepareReadFirstHead, dst, i10, iMin);
                            i11 -= iMin;
                            i10 += iMin;
                            i12 = i11 > 0 ? 4 : 0;
                            writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                        } finally {
                        }
                    }
                    if (writePosition == 0) {
                        try {
                            chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                        } catch (Throwable th2) {
                            th = th2;
                            z10 = false;
                            if (z10) {
                                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else if (writePosition < i12 || chunkBufferPrepareReadFirstHead.getCapacity() - chunkBufferPrepareReadFirstHead.getLimit() < 8) {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, i12);
                    } else {
                        chunkBufferPrepareReadNextHead = chunkBufferPrepareReadFirstHead;
                    }
                    if (chunkBufferPrepareReadNextHead == null) {
                        z10 = false;
                        break;
                    } else {
                        chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
                        if (i12 <= 0) {
                            break;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (z10) {
                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
            }
        }
        if (i11 > 0) {
            throw g.q(i11);
        }
    }

    public static final int readAvailable(Input input, float[] dst, int i10, int i11) throws Throwable {
        int i12;
        ChunkBuffer chunkBufferPrepareReadNextHead;
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        boolean z10 = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (chunkBufferPrepareReadFirstHead == null) {
            i12 = i11;
        } else {
            i12 = i11;
            int i13 = 1;
            while (true) {
                try {
                    int writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                    if (writePosition >= i13) {
                        try {
                            int iMin = Math.min(i12, (chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition()) / 4);
                            BufferPrimitivesKt.readFully((Buffer) chunkBufferPrepareReadFirstHead, dst, i10, iMin);
                            i12 -= iMin;
                            i10 += iMin;
                            i13 = i12 > 0 ? 4 : 0;
                            writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                        } finally {
                        }
                    }
                    if (writePosition == 0) {
                        try {
                            chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                        } catch (Throwable th2) {
                            th = th2;
                            z10 = false;
                            if (z10) {
                                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else if (writePosition < i13 || chunkBufferPrepareReadFirstHead.getCapacity() - chunkBufferPrepareReadFirstHead.getLimit() < 8) {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, i13);
                    } else {
                        chunkBufferPrepareReadNextHead = chunkBufferPrepareReadFirstHead;
                    }
                    if (chunkBufferPrepareReadNextHead == null) {
                        z10 = false;
                        break;
                    }
                    chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
                    if (i13 <= 0) {
                        break;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (z10) {
                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
            }
        }
        return i11 - i12;
    }

    public static final void readFully(Input input, long[] dst, int i10, int i11) throws Throwable {
        ChunkBuffer chunkBufferPrepareReadNextHead;
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        boolean z10 = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (chunkBufferPrepareReadFirstHead != null) {
            int i12 = 1;
            while (true) {
                try {
                    int writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                    if (writePosition >= i12) {
                        try {
                            int iMin = Math.min(i11, (chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition()) / 8);
                            BufferPrimitivesKt.readFully((Buffer) chunkBufferPrepareReadFirstHead, dst, i10, iMin);
                            i11 -= iMin;
                            i10 += iMin;
                            i12 = i11 > 0 ? 8 : 0;
                            writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                        } finally {
                        }
                    }
                    if (writePosition == 0) {
                        try {
                            chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                        } catch (Throwable th2) {
                            th = th2;
                            z10 = false;
                            if (z10) {
                                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else if (writePosition < i12 || chunkBufferPrepareReadFirstHead.getCapacity() - chunkBufferPrepareReadFirstHead.getLimit() < 8) {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, i12);
                    } else {
                        chunkBufferPrepareReadNextHead = chunkBufferPrepareReadFirstHead;
                    }
                    if (chunkBufferPrepareReadNextHead == null) {
                        z10 = false;
                        break;
                    } else {
                        chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
                        if (i12 <= 0) {
                            break;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (z10) {
                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
            }
        }
        if (i11 > 0) {
            throw g.q(i11);
        }
    }

    public static final int readAvailable(Input input, double[] dst, int i10, int i11) throws Throwable {
        int i12;
        ChunkBuffer chunkBufferPrepareReadNextHead;
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        boolean z10 = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (chunkBufferPrepareReadFirstHead == null) {
            i12 = i11;
        } else {
            i12 = i11;
            int i13 = 1;
            while (true) {
                try {
                    int writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                    if (writePosition >= i13) {
                        try {
                            int iMin = Math.min(i12, (chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition()) / 8);
                            BufferPrimitivesKt.readFully(chunkBufferPrepareReadFirstHead, dst, i10, iMin);
                            i12 -= iMin;
                            i10 += iMin;
                            i13 = i12 > 0 ? 8 : 0;
                            writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                        } finally {
                        }
                    }
                    if (writePosition == 0) {
                        try {
                            chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                        } catch (Throwable th2) {
                            th = th2;
                            z10 = false;
                            if (z10) {
                                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else if (writePosition < i13 || chunkBufferPrepareReadFirstHead.getCapacity() - chunkBufferPrepareReadFirstHead.getLimit() < 8) {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, i13);
                    } else {
                        chunkBufferPrepareReadNextHead = chunkBufferPrepareReadFirstHead;
                    }
                    if (chunkBufferPrepareReadNextHead == null) {
                        z10 = false;
                        break;
                    }
                    chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
                    if (i13 <= 0) {
                        break;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (z10) {
                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
            }
        }
        return i11 - i12;
    }

    public static final int readAvailable(Input input, Buffer dst, int i10) throws Throwable {
        int i11;
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        boolean z10 = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (chunkBufferPrepareReadFirstHead == null) {
            i11 = i10;
        } else {
            i11 = i10;
            while (true) {
                try {
                    int iMin = Math.min(i11, chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition());
                    BufferPrimitivesKt.readFully(chunkBufferPrepareReadFirstHead, dst, iMin);
                    i11 -= iMin;
                    if (i11 > 0) {
                        try {
                            chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                            if (chunkBufferPrepareReadFirstHead == null) {
                                break;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            z10 = false;
                            if (z10) {
                                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        break;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
        return i10 - i11;
    }

    public static final void readFully(Input input, float[] dst, int i10, int i11) throws Throwable {
        ChunkBuffer chunkBufferPrepareReadNextHead;
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        boolean z10 = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (chunkBufferPrepareReadFirstHead != null) {
            int i12 = 1;
            while (true) {
                try {
                    int writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                    if (writePosition >= i12) {
                        try {
                            int iMin = Math.min(i11, (chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition()) / 4);
                            BufferPrimitivesKt.readFully((Buffer) chunkBufferPrepareReadFirstHead, dst, i10, iMin);
                            i11 -= iMin;
                            i10 += iMin;
                            i12 = i11 > 0 ? 4 : 0;
                            writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                        } finally {
                        }
                    }
                    if (writePosition == 0) {
                        try {
                            chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                        } catch (Throwable th2) {
                            th = th2;
                            z10 = false;
                            if (z10) {
                                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else if (writePosition < i12 || chunkBufferPrepareReadFirstHead.getCapacity() - chunkBufferPrepareReadFirstHead.getLimit() < 8) {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, i12);
                    } else {
                        chunkBufferPrepareReadNextHead = chunkBufferPrepareReadFirstHead;
                    }
                    if (chunkBufferPrepareReadNextHead == null) {
                        z10 = false;
                        break;
                    } else {
                        chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
                        if (i12 <= 0) {
                            break;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (z10) {
                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
            }
        }
        if (i11 > 0) {
            throw g.q(i11);
        }
    }

    public static final void readFully(Input input, double[] dst, int i10, int i11) throws Throwable {
        ChunkBuffer chunkBufferPrepareReadNextHead;
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        boolean z10 = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (chunkBufferPrepareReadFirstHead != null) {
            int i12 = 1;
            while (true) {
                try {
                    int writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                    if (writePosition >= i12) {
                        try {
                            int iMin = Math.min(i11, (chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition()) / 8);
                            BufferPrimitivesKt.readFully(chunkBufferPrepareReadFirstHead, dst, i10, iMin);
                            i11 -= iMin;
                            i10 += iMin;
                            i12 = i11 > 0 ? 8 : 0;
                            writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                        } finally {
                        }
                    }
                    if (writePosition == 0) {
                        try {
                            chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                        } catch (Throwable th2) {
                            th = th2;
                            z10 = false;
                            if (z10) {
                                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else if (writePosition < i12 || chunkBufferPrepareReadFirstHead.getCapacity() - chunkBufferPrepareReadFirstHead.getLimit() < 8) {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, i12);
                    } else {
                        chunkBufferPrepareReadNextHead = chunkBufferPrepareReadFirstHead;
                    }
                    if (chunkBufferPrepareReadNextHead == null) {
                        z10 = false;
                        break;
                    } else {
                        chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
                        if (i12 <= 0) {
                            break;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (z10) {
                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
            }
        }
        if (i11 > 0) {
            throw g.q(i11);
        }
    }

    public static final void readFully(Input input, Buffer dst, int i10) throws Throwable {
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        boolean z10 = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (chunkBufferPrepareReadFirstHead != null) {
            while (true) {
                try {
                    int iMin = Math.min(i10, chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition());
                    BufferPrimitivesKt.readFully(chunkBufferPrepareReadFirstHead, dst, iMin);
                    i10 -= iMin;
                    if (i10 > 0) {
                        try {
                            chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                            if (chunkBufferPrepareReadFirstHead == null) {
                                break;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            z10 = false;
                            if (z10) {
                                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        break;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
        if (i10 > 0) {
            throw g.q(i10);
        }
    }
}
