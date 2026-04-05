package io.ktor.utils.io.core;

import io.ktor.utils.io.bits.MemoryJvmKt;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.core.internal.UnsafeKt;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ScannerKt {
    public static final int copyUntil(Buffer buffer, l predicate, byte[] dst, int i10, int i11) {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(predicate, "predicate");
        e0.checkNotNullParameter(dst, "dst");
        int readPosition = buffer.getReadPosition();
        int iMin = Math.min(buffer.getWritePosition(), i11 + readPosition);
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int i12 = readPosition;
        while (true) {
            if (i12 >= iMin) {
                break;
            }
            if (((Boolean) predicate.invoke(Byte.valueOf(byteBufferM4458getMemorySK3TCg8.get(i12)))).booleanValue()) {
                iMin = i12;
                break;
            }
            i12++;
        }
        int i13 = iMin - readPosition;
        MemoryJvmKt.m4333copyTo9zorpBc(byteBufferM4458getMemorySK3TCg8, dst, readPosition, i13, i10);
        return i13;
    }

    public static final long discardUntilDelimiter(Input input, byte b10) throws Throwable {
        e0.checkNotNullParameter(input, "<this>");
        boolean z10 = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        long j10 = 0;
        if (chunkBufferPrepareReadFirstHead == null) {
            return 0L;
        }
        do {
            try {
                int iDiscardUntilDelimiterImpl = ScannerJVMKt.discardUntilDelimiterImpl(chunkBufferPrepareReadFirstHead, b10);
                j10 += iDiscardUntilDelimiterImpl;
                if (iDiscardUntilDelimiterImpl <= 0 || chunkBufferPrepareReadFirstHead.getWritePosition() > chunkBufferPrepareReadFirstHead.getReadPosition()) {
                    UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                    return j10;
                }
                try {
                    chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
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
        } while (chunkBufferPrepareReadFirstHead != null);
        return j10;
    }

    public static final int discardUntilDelimiterImplMemory(Buffer buffer, byte b10) {
        e0.checkNotNullParameter(buffer, "buffer");
        int readPosition = buffer.getReadPosition();
        int writePosition = buffer.getWritePosition();
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int i10 = readPosition;
        while (i10 < writePosition && byteBufferM4458getMemorySK3TCg8.get(i10) != b10) {
            i10++;
        }
        buffer.discardUntilIndex$ktor_io(i10);
        return i10 - readPosition;
    }

    public static final long discardUntilDelimiters(Input input, byte b10, byte b11) throws Throwable {
        e0.checkNotNullParameter(input, "<this>");
        boolean z10 = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        long j10 = 0;
        if (chunkBufferPrepareReadFirstHead == null) {
            return 0L;
        }
        do {
            try {
                int iDiscardUntilDelimitersImpl = ScannerJVMKt.discardUntilDelimitersImpl(chunkBufferPrepareReadFirstHead, b10, b11);
                j10 += iDiscardUntilDelimitersImpl;
                if (iDiscardUntilDelimitersImpl <= 0 || chunkBufferPrepareReadFirstHead.getWritePosition() > chunkBufferPrepareReadFirstHead.getReadPosition()) {
                    UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                    return j10;
                }
                try {
                    chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
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
        } while (chunkBufferPrepareReadFirstHead != null);
        return j10;
    }

    public static final int discardUntilDelimitersImplMemory(Buffer buffer, byte b10, byte b11) {
        e0.checkNotNullParameter(buffer, "buffer");
        int readPosition = buffer.getReadPosition();
        int writePosition = buffer.getWritePosition();
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int i10 = readPosition;
        while (i10 < writePosition) {
            byte b12 = byteBufferM4458getMemorySK3TCg8.get(i10);
            if (b12 == b10 || b12 == b11) {
                break;
            }
            i10++;
        }
        buffer.discardUntilIndex$ktor_io(i10);
        return i10 - readPosition;
    }

    public static final int readUntilDelimiter(Input input, byte b10, byte[] dst, int i10, int i11) throws Throwable {
        int i12;
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        boolean z10 = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (chunkBufferPrepareReadFirstHead == null) {
            i12 = i10;
        } else {
            i12 = i10;
            do {
                try {
                    int untilDelimiterImpl = ScannerJVMKt.readUntilDelimiterImpl(chunkBufferPrepareReadFirstHead, b10, dst, i12, i11);
                    i12 += untilDelimiterImpl;
                    i11 -= untilDelimiterImpl;
                    if (i11 <= 0 || chunkBufferPrepareReadFirstHead.getWritePosition() > chunkBufferPrepareReadFirstHead.getReadPosition()) {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        break;
                    }
                    try {
                        chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
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
            } while (chunkBufferPrepareReadFirstHead != null);
        }
        return i12 - i10;
    }

    public static /* synthetic */ int readUntilDelimiter$default(Input input, byte b10, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = bArr.length;
        }
        return readUntilDelimiter(input, b10, bArr, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int readUntilDelimiters(io.ktor.utils.io.core.Input r8, byte r9, byte r10, byte[] r11, int r12, int r13) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.e0.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "dst"
            kotlin.jvm.internal.e0.checkNotNullParameter(r11, r0)
            if (r9 != r10) goto L11
            int r8 = readUntilDelimiter(r8, r9, r11, r12, r13)
            return r8
        L11:
            r1 = 1
            io.ktor.utils.io.core.internal.ChunkBuffer r0 = io.ktor.utils.io.core.internal.UnsafeKt.prepareReadFirstHead(r8, r1)
            if (r0 != 0) goto L1a
            r6 = r12
            goto L45
        L1a:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
        L1e:
            r7 = r13
            r2 = r0
            int r9 = io.ktor.utils.io.core.ScannerJVMKt.readUntilDelimitersImpl(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4a
            r10 = r2
            r11 = r6
            r13 = r7
            int r6 = r11 + r9
            int r13 = r13 - r9
            int r9 = r10.getWritePosition()     // Catch: java.lang.Throwable -> L47
            int r11 = r10.getReadPosition()     // Catch: java.lang.Throwable -> L47
            if (r9 <= r11) goto L35
            goto L42
        L35:
            if (r13 <= 0) goto L42
            io.ktor.utils.io.core.internal.ChunkBuffer r0 = io.ktor.utils.io.core.internal.UnsafeKt.prepareReadNextHead(r8, r10)     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L1e
            goto L45
        L3e:
            r0 = move-exception
            r9 = r0
            r1 = 0
            goto L4d
        L42:
            io.ktor.utils.io.core.internal.UnsafeKt.completeReadHead(r8, r10)
        L45:
            int r6 = r6 - r12
            return r6
        L47:
            r0 = move-exception
        L48:
            r9 = r0
            goto L4d
        L4a:
            r0 = move-exception
            r10 = r2
            goto L48
        L4d:
            if (r1 == 0) goto L52
            io.ktor.utils.io.core.internal.UnsafeKt.completeReadHead(r8, r10)
        L52:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.core.ScannerKt.readUntilDelimiters(io.ktor.utils.io.core.Input, byte, byte, byte[], int, int):int");
    }

    public static /* synthetic */ int readUntilDelimiters$default(Input input, byte b10, byte b11, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            i10 = 0;
        }
        int i13 = i10;
        if ((i12 & 16) != 0) {
            i11 = bArr.length;
        }
        return readUntilDelimiters(input, b10, b11, bArr, i13, i11);
    }

    public static final long readUntilDelimiter(Input input, byte b10, Output dst) {
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        boolean z10 = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        long untilDelimiterImpl = 0;
        if (chunkBufferPrepareReadFirstHead == null) {
            return 0L;
        }
        do {
            try {
                untilDelimiterImpl += ScannerJVMKt.readUntilDelimiterImpl(chunkBufferPrepareReadFirstHead, b10, dst);
                if (chunkBufferPrepareReadFirstHead.getWritePosition() > chunkBufferPrepareReadFirstHead.getReadPosition()) {
                    UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                    return untilDelimiterImpl;
                }
                try {
                    chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
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
        } while (chunkBufferPrepareReadFirstHead != null);
        return untilDelimiterImpl;
    }

    public static final int copyUntil(Buffer buffer, l predicate, Output dst) {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(predicate, "predicate");
        e0.checkNotNullParameter(dst, "dst");
        int readPosition = buffer.getReadPosition();
        int writePosition = buffer.getWritePosition();
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        while (readPosition != writePosition && !((Boolean) predicate.invoke(Byte.valueOf(byteBufferM4458getMemorySK3TCg8.get(readPosition)))).booleanValue()) {
            readPosition++;
        }
        int readPosition2 = readPosition - buffer.getReadPosition();
        OutputKt.writeFully(dst, buffer, readPosition2);
        return readPosition2;
    }

    public static final long readUntilDelimiters(Input input, byte b10, byte b11, Output dst) {
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        boolean z10 = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        long untilDelimitersImpl = 0;
        if (chunkBufferPrepareReadFirstHead == null) {
            return 0L;
        }
        do {
            try {
                untilDelimitersImpl += ScannerJVMKt.readUntilDelimitersImpl(chunkBufferPrepareReadFirstHead, b10, b11, dst);
                if (chunkBufferPrepareReadFirstHead.getWritePosition() > chunkBufferPrepareReadFirstHead.getReadPosition()) {
                    UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                    return untilDelimitersImpl;
                }
                try {
                    chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
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
        } while (chunkBufferPrepareReadFirstHead != null);
        return untilDelimitersImpl;
    }
}
