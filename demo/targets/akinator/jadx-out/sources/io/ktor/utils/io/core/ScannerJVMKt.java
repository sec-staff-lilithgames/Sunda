package io.ktor.utils.io.core;

import io.ktor.utils.io.bits.MemoryJvmKt;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.core.internal.UnsafeKt;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ScannerJVMKt {
    private static final int copyUntilArrays(ByteBuffer byteBuffer, l lVar, int i10, byte[] bArr, int i11, int i12) {
        int i13;
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position() + i10;
        int iMin = Math.min(i12, byteBuffer.remaining()) + iArrayOffset;
        if (iMin <= bArrArray.length) {
            i13 = iArrayOffset;
            while (i13 < iMin && !((Boolean) lVar.invoke(Byte.valueOf(bArrArray[i13]))).booleanValue()) {
                i13++;
            }
        } else {
            i13 = iArrayOffset;
        }
        int i14 = i13 - iArrayOffset;
        System.arraycopy(bArrArray, iArrayOffset, bArr, i11, i14);
        return i14;
    }

    private static final int copyUntilDirect(ByteBuffer byteBuffer, l lVar, byte[] bArr, int i10, int i11) {
        int iPosition = byteBuffer.position();
        int i12 = i11 + iPosition;
        int i13 = iPosition;
        while (i13 < byteBuffer.limit() && i13 < i12 && !((Boolean) lVar.invoke(Byte.valueOf(byteBuffer.get(i13)))).booleanValue()) {
            i13++;
        }
        int i14 = i13 - iPosition;
        byteBuffer.get(bArr, i10, i14);
        return i14;
    }

    public static final int discardUntilDelimiterImpl(Buffer buffer, byte b10) {
        e0.checkNotNullParameter(buffer, "<this>");
        return ByteBuffersKt.hasArray(buffer) ? discardUntilDelimiterImplArrays(buffer, b10) : ScannerKt.discardUntilDelimiterImplMemory(buffer, b10);
    }

    private static final int discardUntilDelimiterImplArrays(Buffer buffer, byte b10) {
        int i10;
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        byte[] bArrArray = byteBufferM4458getMemorySK3TCg8.array();
        int readPosition = buffer.getReadPosition() + byteBufferM4458getMemorySK3TCg8.position() + byteBufferM4458getMemorySK3TCg8.arrayOffset();
        int writePosition = (buffer.getWritePosition() - buffer.getReadPosition()) + readPosition;
        if (writePosition <= bArrArray.length) {
            i10 = readPosition;
            while (i10 < writePosition && bArrArray[i10] != b10) {
                i10++;
            }
        } else {
            i10 = readPosition;
        }
        buffer.discardUntilIndex$ktor_io(i10);
        return i10 - readPosition;
    }

    public static final int discardUntilDelimitersImpl(Buffer buffer, byte b10, byte b11) {
        e0.checkNotNullParameter(buffer, "<this>");
        return ByteBuffersKt.hasArray(buffer) ? discardUntilDelimitersImplArrays(buffer, b10, b11) : ScannerKt.discardUntilDelimitersImplMemory(buffer, b10, b11);
    }

    private static final int discardUntilDelimitersImplArrays(Buffer buffer, byte b10, byte b11) {
        int i10;
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        byte[] bArrArray = byteBufferM4458getMemorySK3TCg8.array();
        int readPosition = buffer.getReadPosition() + byteBufferM4458getMemorySK3TCg8.position() + byteBufferM4458getMemorySK3TCg8.arrayOffset();
        int writePosition = (buffer.getWritePosition() - buffer.getReadPosition()) + readPosition;
        if (writePosition <= bArrArray.length) {
            i10 = readPosition;
            while (i10 < writePosition) {
                byte b12 = bArrArray[i10];
                if (b12 == b10 || b12 == b11) {
                    break;
                }
                i10++;
            }
        } else {
            i10 = readPosition;
        }
        buffer.discardUntilIndex$ktor_io(i10);
        return i10 - readPosition;
    }

    private static final int readUntilDelimiterArrays(Buffer buffer, byte b10, byte[] bArr, int i10, int i11) {
        int i12;
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int readPosition = buffer.getReadPosition();
        int iMin = Math.min(i11, buffer.getWritePosition() - buffer.getReadPosition());
        byte[] bArrArray = byteBufferM4458getMemorySK3TCg8.array();
        int iArrayOffset = byteBufferM4458getMemorySK3TCg8.arrayOffset() + byteBufferM4458getMemorySK3TCg8.position() + readPosition;
        int iMin2 = Math.min(iMin, byteBufferM4458getMemorySK3TCg8.remaining()) + iArrayOffset;
        if (iMin2 <= bArrArray.length) {
            i12 = iArrayOffset;
            while (i12 < iMin2 && bArrArray[i12] != b10) {
                i12++;
            }
        } else {
            i12 = iArrayOffset;
        }
        int i13 = i12 - iArrayOffset;
        System.arraycopy(bArrArray, iArrayOffset, bArr, i10, i13);
        buffer.discardExact(i13);
        return i13;
    }

    private static final int readUntilDelimiterDirect(Buffer buffer, byte b10, byte[] bArr, int i10, int i11) {
        int readPosition = buffer.getReadPosition();
        int iMin = Math.min(buffer.getWritePosition(), i11 + readPosition);
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int i12 = readPosition;
        while (true) {
            if (i12 >= iMin) {
                break;
            }
            if (byteBufferM4458getMemorySK3TCg8.get(i12) == b10) {
                iMin = i12;
                break;
            }
            i12++;
        }
        int i13 = iMin - readPosition;
        MemoryJvmKt.m4333copyTo9zorpBc(byteBufferM4458getMemorySK3TCg8, bArr, readPosition, i13, i10);
        buffer.discardExact(i13);
        return i13;
    }

    public static final int readUntilDelimiterImpl(Buffer buffer, byte b10, byte[] dst, int i10, int i11) {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        int length = dst.length;
        return ByteBuffersKt.hasArray(buffer) ? readUntilDelimiterArrays(buffer, b10, dst, i10, i11) : readUntilDelimiterDirect(buffer, b10, dst, i10, i11);
    }

    private static final int readUntilDelimitersArrays(Buffer buffer, byte b10, byte b11, byte[] bArr, int i10, int i11) {
        int i12;
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int readPosition = buffer.getReadPosition();
        int iMin = Math.min(i11, buffer.getWritePosition() - buffer.getReadPosition());
        byte[] bArrArray = byteBufferM4458getMemorySK3TCg8.array();
        int iArrayOffset = byteBufferM4458getMemorySK3TCg8.arrayOffset() + byteBufferM4458getMemorySK3TCg8.position() + readPosition;
        int iMin2 = Math.min(iMin, byteBufferM4458getMemorySK3TCg8.remaining()) + iArrayOffset;
        if (iMin2 <= bArrArray.length) {
            i12 = iArrayOffset;
            while (i12 < iMin2) {
                byte b12 = bArrArray[i12];
                if (b12 == b10 || b12 == b11) {
                    break;
                }
                i12++;
            }
        } else {
            i12 = iArrayOffset;
        }
        int i13 = i12 - iArrayOffset;
        System.arraycopy(bArrArray, iArrayOffset, bArr, i10, i13);
        buffer.discardExact(i13);
        return i13;
    }

    private static final int readUntilDelimitersDirect(Buffer buffer, byte b10, byte b11, byte[] bArr, int i10, int i11) {
        int readPosition = buffer.getReadPosition();
        int iMin = Math.min(buffer.getWritePosition(), i11 + readPosition);
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        for (int i12 = readPosition; i12 < iMin; i12++) {
            byte b12 = byteBufferM4458getMemorySK3TCg8.get(i12);
            if (b12 == b10 || b12 == b11) {
                iMin = i12;
                break;
            }
        }
        int i13 = iMin - readPosition;
        MemoryJvmKt.m4333copyTo9zorpBc(byteBufferM4458getMemorySK3TCg8, bArr, readPosition, i13, i10);
        buffer.discardExact(i13);
        return i13;
    }

    public static final int readUntilDelimitersImpl(Buffer buffer, byte b10, byte b11, byte[] dst, int i10, int i11) {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        int length = dst.length;
        return ByteBuffersKt.hasArray(buffer) ? readUntilDelimitersArrays(buffer, b10, b11, dst, i10, i11) : readUntilDelimitersDirect(buffer, b10, b11, dst, i10, i11);
    }

    public static final int readUntilDelimiterImpl(Buffer buffer, byte b10, Output dst) {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        if (ByteBuffersKt.hasArray(buffer)) {
            return readUntilDelimiterArrays(buffer, b10, dst);
        }
        return readUntilDelimiterDirect(buffer, b10, dst);
    }

    public static final int readUntilDelimitersImpl(Buffer buffer, byte b10, byte b11, Output dst) {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        if (ByteBuffersKt.hasArray(buffer)) {
            return readUntilDelimitersArrays(buffer, b10, b11, dst);
        }
        return readUntilDelimitersDirect(buffer, b10, b11, dst);
    }

    /* JADX WARN: Finally extract failed */
    private static final int copyUntilArrays(Buffer buffer, l lVar, Output output) {
        int i10;
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        byte[] array = byteBufferM4458getMemorySK3TCg8.array();
        int readPosition = buffer.getReadPosition() + byteBufferM4458getMemorySK3TCg8.arrayOffset() + byteBufferM4458getMemorySK3TCg8.position();
        int writePosition = buffer.getWritePosition() + byteBufferM4458getMemorySK3TCg8.arrayOffset() + byteBufferM4458getMemorySK3TCg8.position();
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, null);
        int i11 = 0;
        while (true) {
            try {
                int iMin = Math.min((chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition()) + readPosition, writePosition);
                if (iMin <= array.length) {
                    i10 = readPosition;
                    while (i10 < iMin && !((Boolean) lVar.invoke(Byte.valueOf(array[i10]))).booleanValue()) {
                        i10++;
                    }
                } else {
                    i10 = readPosition;
                }
                int i12 = i10 - readPosition;
                e0.checkNotNullExpressionValue(array, "array");
                BufferPrimitivesKt.writeFully((Buffer) chunkBufferPrepareWriteHead, array, readPosition, i12);
                i11 += i12;
                if (chunkBufferPrepareWriteHead.getLimit() > chunkBufferPrepareWriteHead.getWritePosition() || i10 >= writePosition) {
                    break;
                }
                chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, chunkBufferPrepareWriteHead);
                readPosition = i10;
            } catch (Throwable th2) {
                b0.finallyStart(1);
                output.afterHeadWrite();
                b0.finallyEnd(1);
                throw th2;
            }
        }
        b0.finallyStart(1);
        output.afterHeadWrite();
        b0.finallyEnd(1);
        buffer.discardUntilIndex$ktor_io(i10);
        return i11;
    }

    public static final int readUntilDelimiterDirect(Buffer buffer, byte b10, Output dst) {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        int readPosition = buffer.getReadPosition();
        int writePosition = buffer.getWritePosition();
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        while (readPosition != writePosition && byteBufferM4458getMemorySK3TCg8.get(readPosition) != b10) {
            readPosition++;
        }
        int readPosition2 = readPosition - buffer.getReadPosition();
        OutputKt.writeFully(dst, buffer, readPosition2);
        return readPosition2;
    }

    public static final int readUntilDelimitersDirect(Buffer buffer, byte b10, byte b11, Output dst) {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        int readPosition = buffer.getReadPosition();
        int writePosition = buffer.getWritePosition();
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        while (readPosition != writePosition) {
            byte b12 = byteBufferM4458getMemorySK3TCg8.get(readPosition);
            if (b12 == b10 || b12 == b11) {
                break;
            }
            readPosition++;
        }
        int readPosition2 = readPosition - buffer.getReadPosition();
        OutputKt.writeFully(dst, buffer, readPosition2);
        return readPosition2;
    }

    /* JADX WARN: Finally extract failed */
    public static final int readUntilDelimiterArrays(Buffer buffer, byte b10, Output dst) {
        int i10;
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        byte[] array = byteBufferM4458getMemorySK3TCg8.array();
        int readPosition = buffer.getReadPosition() + byteBufferM4458getMemorySK3TCg8.arrayOffset() + byteBufferM4458getMemorySK3TCg8.position();
        int writePosition = buffer.getWritePosition() + byteBufferM4458getMemorySK3TCg8.arrayOffset() + byteBufferM4458getMemorySK3TCg8.position();
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(dst, 1, null);
        int i11 = 0;
        while (true) {
            try {
                int iMin = Math.min((chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition()) + readPosition, writePosition);
                if (iMin <= array.length) {
                    i10 = readPosition;
                    while (i10 < iMin && array[i10] != b10) {
                        i10++;
                    }
                } else {
                    i10 = readPosition;
                }
                int i12 = i10 - readPosition;
                e0.checkNotNullExpressionValue(array, "array");
                BufferPrimitivesKt.writeFully((Buffer) chunkBufferPrepareWriteHead, array, readPosition, i12);
                i11 += i12;
                if (chunkBufferPrepareWriteHead.getLimit() > chunkBufferPrepareWriteHead.getWritePosition() || i10 >= writePosition) {
                    break;
                }
                chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(dst, 1, chunkBufferPrepareWriteHead);
                readPosition = i10;
            } catch (Throwable th2) {
                dst.afterHeadWrite();
                throw th2;
            }
        }
        dst.afterHeadWrite();
        buffer.discardUntilIndex$ktor_io(i10);
        return i11;
    }

    /* JADX WARN: Finally extract failed */
    public static final int readUntilDelimitersArrays(Buffer buffer, byte b10, byte b11, Output dst) {
        int i10;
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        byte[] array = byteBufferM4458getMemorySK3TCg8.array();
        int readPosition = buffer.getReadPosition() + byteBufferM4458getMemorySK3TCg8.arrayOffset() + byteBufferM4458getMemorySK3TCg8.position();
        int writePosition = buffer.getWritePosition() + byteBufferM4458getMemorySK3TCg8.arrayOffset() + byteBufferM4458getMemorySK3TCg8.position();
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(dst, 1, null);
        int i11 = 0;
        while (true) {
            try {
                int iMin = Math.min((chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition()) + readPosition, writePosition);
                if (iMin <= array.length) {
                    i10 = readPosition;
                    while (i10 < iMin) {
                        byte b12 = array[i10];
                        if (b12 == b10 || b12 == b11) {
                            break;
                        }
                        i10++;
                    }
                } else {
                    i10 = readPosition;
                }
                int i12 = i10 - readPosition;
                e0.checkNotNullExpressionValue(array, "array");
                BufferPrimitivesKt.writeFully((Buffer) chunkBufferPrepareWriteHead, array, readPosition, i12);
                i11 += i12;
                if (chunkBufferPrepareWriteHead.getLimit() > chunkBufferPrepareWriteHead.getWritePosition() || i10 >= writePosition) {
                    break;
                }
                chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(dst, 1, chunkBufferPrepareWriteHead);
                readPosition = i10;
            } catch (Throwable th2) {
                dst.afterHeadWrite();
                throw th2;
            }
        }
        dst.afterHeadWrite();
        buffer.discardUntilIndex$ktor_io(i10);
        return i11;
    }
}
