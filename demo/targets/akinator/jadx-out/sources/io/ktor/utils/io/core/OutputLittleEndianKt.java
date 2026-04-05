package io.ktor.utils.io.core;

import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.core.internal.UnsafeKt;
import io.odeeo.internal.h.vfsA.QCmNMSGd;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kv.l;
import kv.p;
import qm.zMPW.GalEuEfxjome;
import tu.m0;
import tu.q0;
import tu.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class OutputLittleEndianKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ByteOrder.values().length];
            try {
                iArr[ByteOrder.BIG_ENDIAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final void writeArrayTemplate(Output output, int i10, int i11, int i12, p pVar) {
        int i13 = i11 + i10;
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i12, null);
        while (true) {
            try {
                int iMin = Math.min((chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition()) / i12, i13 - i10) + i10;
                int i14 = iMin - 1;
                if (i10 <= i14) {
                    while (true) {
                        pVar.invoke(chunkBufferPrepareWriteHead, Integer.valueOf(i10));
                        if (i10 == i14) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                int i15 = iMin < i13 ? i12 : 0;
                if (i15 <= 0) {
                    b0.finallyStart(1);
                    output.afterHeadWrite();
                    b0.finallyEnd(1);
                    return;
                }
                chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i15, chunkBufferPrepareWriteHead);
                i10 = iMin;
            } catch (Throwable th2) {
                b0.finallyStart(1);
                output.afterHeadWrite();
                b0.finallyEnd(1);
                throw th2;
            }
        }
    }

    public static final void writeDouble(Output output, double d10, ByteOrder byteOrder) {
        e0.checkNotNullParameter(output, "<this>");
        e0.checkNotNullParameter(byteOrder, "byteOrder");
        if (WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] != 1) {
            d10 = Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(d10)));
        }
        OutputPrimitivesKt.writeDouble(output, d10);
    }

    public static final void writeDoubleLittleEndian(Output output, double d10) {
        e0.checkNotNullParameter(output, "<this>");
        OutputPrimitivesKt.writeDouble(output, Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(d10))));
    }

    public static final void writeFloatLittleEndian(Output output, float f10) {
        e0.checkNotNullParameter(output, "<this>");
        OutputPrimitivesKt.writeFloat(output, Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(f10))));
    }

    public static final void writeFullyLittleEndian(Output output, short[] source, int i10, int i11) {
        e0.checkNotNullParameter(output, "<this>");
        e0.checkNotNullParameter(source, "source");
        int i12 = i11 + i10;
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 2, null);
        while (true) {
            try {
                int iMin = Math.min((chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition()) / 2, i12 - i10) + i10;
                int i13 = iMin - 1;
                if (i10 <= i13) {
                    while (true) {
                        BufferPrimitivesKt.writeShort((Buffer) chunkBufferPrepareWriteHead, Short.reverseBytes(source[i10]));
                        if (i10 == i13) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                int i14 = iMin < i12 ? 2 : 0;
                if (i14 <= 0) {
                    output.afterHeadWrite();
                    return;
                } else {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i14, chunkBufferPrepareWriteHead);
                    i10 = iMin;
                }
            } catch (Throwable th2) {
                output.afterHeadWrite();
                throw th2;
            }
        }
    }

    public static /* synthetic */ void writeFullyLittleEndian$default(Output output, short[] sArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = sArr.length - i10;
        }
        writeFullyLittleEndian(output, sArr, i10, i11);
    }

    /* renamed from: writeFullyLittleEndian-Wt3Bwxc, reason: not valid java name */
    public static final void m4533writeFullyLittleEndianWt3Bwxc(Output writeFullyLittleEndian, short[] source, int i10, int i11) {
        e0.checkNotNullParameter(writeFullyLittleEndian, "$this$writeFullyLittleEndian");
        e0.checkNotNullParameter(source, "source");
        writeFullyLittleEndian(writeFullyLittleEndian, source, i10, i11);
    }

    /* renamed from: writeFullyLittleEndian-Wt3Bwxc$default, reason: not valid java name */
    public static /* synthetic */ void m4535writeFullyLittleEndianWt3Bwxc$default(Output output, short[] sArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = v0.m7121getSizeimpl(sArr) - i10;
        }
        m4533writeFullyLittleEndianWt3Bwxc(output, sArr, i10, i11);
    }

    /* renamed from: writeFullyLittleEndian-o2ZM2JE, reason: not valid java name */
    public static final void m4537writeFullyLittleEndiano2ZM2JE(Output writeFullyLittleEndian, int[] source, int i10, int i11) {
        e0.checkNotNullParameter(writeFullyLittleEndian, "$this$writeFullyLittleEndian");
        e0.checkNotNullParameter(source, "source");
        writeFullyLittleEndian(writeFullyLittleEndian, source, i10, i11);
    }

    /* renamed from: writeFullyLittleEndian-o2ZM2JE$default, reason: not valid java name */
    public static /* synthetic */ void m4539writeFullyLittleEndiano2ZM2JE$default(Output output, int[] iArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = m0.m7071getSizeimpl(iArr) - i10;
        }
        m4537writeFullyLittleEndiano2ZM2JE(output, iArr, i10, i11);
    }

    /* renamed from: writeFullyLittleEndian-pqYNikA, reason: not valid java name */
    public static final void m4541writeFullyLittleEndianpqYNikA(Output writeFullyLittleEndian, long[] source, int i10, int i11) {
        e0.checkNotNullParameter(writeFullyLittleEndian, "$this$writeFullyLittleEndian");
        e0.checkNotNullParameter(source, "source");
        writeFullyLittleEndian(writeFullyLittleEndian, source, i10, i11);
    }

    /* renamed from: writeFullyLittleEndian-pqYNikA$default, reason: not valid java name */
    public static /* synthetic */ void m4543writeFullyLittleEndianpqYNikA$default(Output output, long[] jArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = q0.m7096getSizeimpl(jArr) - i10;
        }
        m4541writeFullyLittleEndianpqYNikA(output, jArr, i10, i11);
    }

    public static final void writeInt(Output output, int i10, ByteOrder byteOrder) {
        e0.checkNotNullParameter(output, "<this>");
        e0.checkNotNullParameter(byteOrder, "byteOrder");
        if (WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] != 1) {
            i10 = Integer.reverseBytes(i10);
        }
        OutputPrimitivesKt.writeInt(output, i10);
    }

    public static final void writeIntLittleEndian(Output output, int i10) {
        e0.checkNotNullParameter(output, "<this>");
        OutputPrimitivesKt.writeInt(output, Integer.reverseBytes(i10));
    }

    public static final void writeLong(Output output, long j10, ByteOrder byteOrder) {
        e0.checkNotNullParameter(output, "<this>");
        e0.checkNotNullParameter(byteOrder, "byteOrder");
        if (WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] != 1) {
            j10 = Long.reverseBytes(j10);
        }
        OutputPrimitivesKt.writeLong(output, j10);
    }

    public static final void writeLongLittleEndian(Output output, long j10) {
        e0.checkNotNullParameter(output, "<this>");
        OutputPrimitivesKt.writeLong(output, Long.reverseBytes(j10));
    }

    private static final <T> void writePrimitiveTemplate(T t10, l lVar, l lVar2) {
        lVar.invoke(lVar2.invoke(t10));
    }

    public static final void writeShort(Output output, short s10, ByteOrder byteOrder) {
        e0.checkNotNullParameter(output, "<this>");
        e0.checkNotNullParameter(byteOrder, "byteOrder");
        if (WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] != 1) {
            s10 = Short.reverseBytes(s10);
        }
        OutputPrimitivesKt.writeShort(output, s10);
    }

    public static final void writeShortLittleEndian(Output output, short s10) {
        e0.checkNotNullParameter(output, "<this>");
        OutputPrimitivesKt.writeShort(output, Short.reverseBytes(s10));
    }

    public static final void writeFloat(Output output, float f10, ByteOrder byteOrder) {
        e0.checkNotNullParameter(output, QCmNMSGd.TVJpzwVZaRTpqd);
        e0.checkNotNullParameter(byteOrder, "byteOrder");
        if (WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] != 1) {
            f10 = Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(f10)));
        }
        OutputPrimitivesKt.writeFloat(output, f10);
    }

    public static /* synthetic */ void writeFullyLittleEndian$default(Output output, int[] iArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = iArr.length - i10;
        }
        writeFullyLittleEndian(output, iArr, i10, i11);
    }

    /* renamed from: writeFullyLittleEndian-Wt3Bwxc, reason: not valid java name */
    public static final void m4532writeFullyLittleEndianWt3Bwxc(Buffer writeFullyLittleEndian, short[] source, int i10, int i11) {
        e0.checkNotNullParameter(writeFullyLittleEndian, "$this$writeFullyLittleEndian");
        e0.checkNotNullParameter(source, "source");
        writeFullyLittleEndian(writeFullyLittleEndian, source, i10, i11);
    }

    /* renamed from: writeFullyLittleEndian-Wt3Bwxc$default, reason: not valid java name */
    public static /* synthetic */ void m4534writeFullyLittleEndianWt3Bwxc$default(Buffer buffer, short[] sArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = v0.m7121getSizeimpl(sArr) - i10;
        }
        m4532writeFullyLittleEndianWt3Bwxc(buffer, sArr, i10, i11);
    }

    /* renamed from: writeFullyLittleEndian-o2ZM2JE, reason: not valid java name */
    public static final void m4536writeFullyLittleEndiano2ZM2JE(Buffer writeFullyLittleEndian, int[] source, int i10, int i11) {
        e0.checkNotNullParameter(writeFullyLittleEndian, "$this$writeFullyLittleEndian");
        e0.checkNotNullParameter(source, "source");
        writeFullyLittleEndian(writeFullyLittleEndian, source, i10, i11);
    }

    /* renamed from: writeFullyLittleEndian-o2ZM2JE$default, reason: not valid java name */
    public static /* synthetic */ void m4538writeFullyLittleEndiano2ZM2JE$default(Buffer buffer, int[] iArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = m0.m7071getSizeimpl(iArr) - i10;
        }
        m4536writeFullyLittleEndiano2ZM2JE(buffer, iArr, i10, i11);
    }

    /* renamed from: writeFullyLittleEndian-pqYNikA, reason: not valid java name */
    public static final void m4540writeFullyLittleEndianpqYNikA(Buffer writeFullyLittleEndian, long[] source, int i10, int i11) {
        e0.checkNotNullParameter(writeFullyLittleEndian, "$this$writeFullyLittleEndian");
        e0.checkNotNullParameter(source, "source");
        writeFullyLittleEndian(writeFullyLittleEndian, source, i10, i11);
    }

    /* renamed from: writeFullyLittleEndian-pqYNikA$default, reason: not valid java name */
    public static /* synthetic */ void m4542writeFullyLittleEndianpqYNikA$default(Buffer buffer, long[] jArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = q0.m7096getSizeimpl(jArr) - i10;
        }
        m4540writeFullyLittleEndianpqYNikA(buffer, jArr, i10, i11);
    }

    private static final <T> void writePrimitiveTemplate(T t10, ByteOrder byteOrder, l lVar, l lVar2) {
        if (WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] != 1) {
            t10 = (T) lVar2.invoke(t10);
        }
        lVar.invoke(t10);
    }

    public static /* synthetic */ void writeFullyLittleEndian$default(Output output, long[] jArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length - i10;
        }
        writeFullyLittleEndian(output, jArr, i10, i11);
    }

    public static final void writeIntLittleEndian(Buffer buffer, int i10) {
        e0.checkNotNullParameter(buffer, "<this>");
        BufferPrimitivesKt.writeInt(buffer, Integer.reverseBytes(i10));
    }

    public static final void writeLongLittleEndian(Buffer buffer, long j10) {
        e0.checkNotNullParameter(buffer, "<this>");
        BufferPrimitivesKt.writeLong(buffer, Long.reverseBytes(j10));
    }

    public static final void writeShortLittleEndian(Buffer buffer, short s10) {
        e0.checkNotNullParameter(buffer, "<this>");
        BufferPrimitivesKt.writeShort(buffer, Short.reverseBytes(s10));
    }

    public static /* synthetic */ void writeFullyLittleEndian$default(Output output, float[] fArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length - i10;
        }
        writeFullyLittleEndian(output, fArr, i10, i11);
    }

    public static final void writeDoubleLittleEndian(Buffer buffer, double d10) throws InsufficientSpaceException {
        e0.checkNotNullParameter(buffer, "<this>");
        BufferPrimitivesKt.writeDouble(buffer, Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(d10))));
    }

    public static final void writeFloatLittleEndian(Buffer buffer, float f10) throws InsufficientSpaceException {
        e0.checkNotNullParameter(buffer, "<this>");
        BufferPrimitivesKt.writeFloat(buffer, Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(f10))));
    }

    public static /* synthetic */ void writeFullyLittleEndian$default(Output output, double[] dArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = dArr.length - i10;
        }
        writeFullyLittleEndian(output, dArr, i10, i11);
    }

    public static /* synthetic */ void writeFullyLittleEndian$default(Buffer buffer, short[] sArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = sArr.length - i10;
        }
        writeFullyLittleEndian(buffer, sArr, i10, i11);
    }

    private static final void writeArrayTemplate(Buffer buffer, int i10, int i11, int i12, p pVar) {
        int iMin = (Math.min((buffer.getLimit() - buffer.getWritePosition()) / i12, (i11 + i10) - i10) + i10) - 1;
        if (i10 > iMin) {
            return;
        }
        while (true) {
            pVar.invoke(buffer, Integer.valueOf(i10));
            if (i10 == iMin) {
                return;
            } else {
                i10++;
            }
        }
    }

    public static /* synthetic */ void writeFullyLittleEndian$default(Buffer buffer, int[] iArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = iArr.length - i10;
        }
        writeFullyLittleEndian(buffer, iArr, i10, i11);
    }

    public static /* synthetic */ void writeFullyLittleEndian$default(Buffer buffer, long[] jArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length - i10;
        }
        writeFullyLittleEndian(buffer, jArr, i10, i11);
    }

    public static final void writeFullyLittleEndian(Output output, int[] source, int i10, int i11) {
        e0.checkNotNullParameter(output, "<this>");
        e0.checkNotNullParameter(source, "source");
        int i12 = i11 + i10;
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 4, null);
        while (true) {
            try {
                int iMin = Math.min((chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition()) / 4, i12 - i10) + i10;
                int i13 = iMin - 1;
                if (i10 <= i13) {
                    while (true) {
                        BufferPrimitivesKt.writeInt((Buffer) chunkBufferPrepareWriteHead, Integer.reverseBytes(source[i10]));
                        if (i10 == i13) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                int i14 = iMin < i12 ? 4 : 0;
                if (i14 > 0) {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i14, chunkBufferPrepareWriteHead);
                    i10 = iMin;
                } else {
                    output.afterHeadWrite();
                    return;
                }
            } catch (Throwable th2) {
                output.afterHeadWrite();
                throw th2;
            }
        }
    }

    public static /* synthetic */ void writeFullyLittleEndian$default(Buffer buffer, float[] fArr, int i10, int i11, int i12, Object obj) throws InsufficientSpaceException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length - i10;
        }
        writeFullyLittleEndian(buffer, fArr, i10, i11);
    }

    public static /* synthetic */ void writeFullyLittleEndian$default(Buffer buffer, double[] dArr, int i10, int i11, int i12, Object obj) throws InsufficientSpaceException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = dArr.length - i10;
        }
        writeFullyLittleEndian(buffer, dArr, i10, i11);
    }

    public static final void writeFullyLittleEndian(Output output, long[] source, int i10, int i11) {
        e0.checkNotNullParameter(output, "<this>");
        e0.checkNotNullParameter(source, "source");
        int i12 = i11 + i10;
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 8, null);
        while (true) {
            try {
                int iMin = Math.min((chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition()) / 8, i12 - i10) + i10;
                int i13 = iMin - 1;
                if (i10 <= i13) {
                    while (true) {
                        BufferPrimitivesKt.writeLong((Buffer) chunkBufferPrepareWriteHead, Long.reverseBytes(source[i10]));
                        if (i10 == i13) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                int i14 = iMin < i12 ? 8 : 0;
                if (i14 > 0) {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i14, chunkBufferPrepareWriteHead);
                    i10 = iMin;
                } else {
                    output.afterHeadWrite();
                    return;
                }
            } catch (Throwable th2) {
                output.afterHeadWrite();
                throw th2;
            }
        }
    }

    public static final void writeFullyLittleEndian(Output output, float[] source, int i10, int i11) {
        e0.checkNotNullParameter(output, "<this>");
        e0.checkNotNullParameter(source, "source");
        int i12 = i11 + i10;
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 4, null);
        while (true) {
            try {
                int iMin = Math.min((chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition()) / 4, i12 - i10) + i10;
                int i13 = iMin - 1;
                if (i10 <= i13) {
                    while (true) {
                        BufferPrimitivesKt.writeFloat((Buffer) chunkBufferPrepareWriteHead, Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(source[i10]))));
                        if (i10 == i13) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                int i14 = iMin < i12 ? 4 : 0;
                if (i14 > 0) {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i14, chunkBufferPrepareWriteHead);
                    i10 = iMin;
                } else {
                    output.afterHeadWrite();
                    return;
                }
            } catch (Throwable th2) {
                output.afterHeadWrite();
                throw th2;
            }
        }
    }

    public static final void writeFullyLittleEndian(Output output, double[] source, int i10, int i11) {
        e0.checkNotNullParameter(output, "<this>");
        e0.checkNotNullParameter(source, "source");
        int i12 = i11 + i10;
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 8, null);
        while (true) {
            try {
                int iMin = Math.min((chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition()) / 8, i12 - i10) + i10;
                int i13 = iMin - 1;
                if (i10 <= i13) {
                    while (true) {
                        BufferPrimitivesKt.writeDouble((Buffer) chunkBufferPrepareWriteHead, Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(source[i10]))));
                        if (i10 == i13) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                int i14 = iMin < i12 ? 8 : 0;
                if (i14 > 0) {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i14, chunkBufferPrepareWriteHead);
                    i10 = iMin;
                } else {
                    output.afterHeadWrite();
                    return;
                }
            } catch (Throwable th2) {
                output.afterHeadWrite();
                throw th2;
            }
        }
    }

    public static final void writeFullyLittleEndian(Buffer buffer, short[] source, int i10, int i11) {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(source, "source");
        int iMin = (Math.min((buffer.getLimit() - buffer.getWritePosition()) / 2, (i11 + i10) - i10) + i10) - 1;
        if (i10 > iMin) {
            return;
        }
        while (true) {
            BufferPrimitivesKt.writeShort(buffer, Short.reverseBytes(source[i10]));
            if (i10 == iMin) {
                return;
            } else {
                i10++;
            }
        }
    }

    public static final void writeFullyLittleEndian(Buffer buffer, int[] source, int i10, int i11) {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(source, "source");
        int iMin = (Math.min((buffer.getLimit() - buffer.getWritePosition()) / 4, (i11 + i10) - i10) + i10) - 1;
        if (i10 > iMin) {
            return;
        }
        while (true) {
            BufferPrimitivesKt.writeInt(buffer, Integer.reverseBytes(source[i10]));
            if (i10 == iMin) {
                return;
            } else {
                i10++;
            }
        }
    }

    public static final void writeFullyLittleEndian(Buffer buffer, long[] source, int i10, int i11) {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(source, "source");
        int iMin = (Math.min((buffer.getLimit() - buffer.getWritePosition()) / 8, (i11 + i10) - i10) + i10) - 1;
        if (i10 > iMin) {
            return;
        }
        while (true) {
            BufferPrimitivesKt.writeLong(buffer, Long.reverseBytes(source[i10]));
            if (i10 == iMin) {
                return;
            } else {
                i10++;
            }
        }
    }

    public static final void writeFullyLittleEndian(Buffer buffer, float[] source, int i10, int i11) throws InsufficientSpaceException {
        e0.checkNotNullParameter(buffer, GalEuEfxjome.KVcBWBtwqhq);
        e0.checkNotNullParameter(source, "source");
        int iMin = (Math.min((buffer.getLimit() - buffer.getWritePosition()) / 4, (i11 + i10) - i10) + i10) - 1;
        if (i10 > iMin) {
            return;
        }
        while (true) {
            BufferPrimitivesKt.writeFloat(buffer, Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(source[i10]))));
            if (i10 == iMin) {
                return;
            } else {
                i10++;
            }
        }
    }

    public static final void writeFullyLittleEndian(Buffer buffer, double[] source, int i10, int i11) throws InsufficientSpaceException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(source, "source");
        int iMin = (Math.min((buffer.getLimit() - buffer.getWritePosition()) / 8, (i11 + i10) - i10) + i10) - 1;
        if (i10 > iMin) {
            return;
        }
        while (true) {
            BufferPrimitivesKt.writeDouble(buffer, Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(source[i10]))));
            if (i10 == iMin) {
                return;
            } else {
                i10++;
            }
        }
    }
}
