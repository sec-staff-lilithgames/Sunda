package io.ktor.utils.io.core;

import io.ktor.utils.io.bits.Memory;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.core.internal.UnsafeKt;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kv.l;
import kv.q;
import kv.r;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class OutputKt {
    public static final Appendable append(Output output, CharSequence csq, int i10, int i11) {
        e0.checkNotNullParameter(output, "<this>");
        e0.checkNotNullParameter(csq, "csq");
        return output.append(csq, i10, i11);
    }

    public static /* synthetic */ Appendable append$default(Output output, CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        return append(output, charSequence, i10, i11);
    }

    public static final void fill(Output output, long j10, byte b10) {
        e0.checkNotNullParameter(output, "<this>");
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, null);
        long j11 = 0;
        while (true) {
            try {
                int iMin = (int) Math.min(chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition(), j10 - j11);
                BufferCompatibilityKt.fill((Buffer) chunkBufferPrepareWriteHead, iMin, b10);
                j11 += iMin;
                if (j11 >= j10) {
                    return;
                } else {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, chunkBufferPrepareWriteHead);
                }
            } finally {
                output.afterHeadWrite();
            }
        }
    }

    public static /* synthetic */ void fill$default(Output output, long j10, byte b10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            b10 = 0;
        }
        fill(output, j10, b10);
    }

    public static final void writeFully(Output output, byte[] src, int i10, int i11) {
        e0.checkNotNullParameter(output, "<this>");
        e0.checkNotNullParameter(src, "src");
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, null);
        while (true) {
            try {
                int iMin = Math.min(i11, chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition());
                BufferPrimitivesKt.writeFully((Buffer) chunkBufferPrepareWriteHead, src, i10, iMin);
                i10 += iMin;
                i11 -= iMin;
                if (i11 <= 0) {
                    return;
                } else {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, chunkBufferPrepareWriteHead);
                }
            } finally {
                output.afterHeadWrite();
            }
        }
    }

    public static /* synthetic */ void writeFully$default(Output output, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length - i10;
        }
        writeFully(output, bArr, i10, i11);
    }

    /* renamed from: writeFully-UAd2zVI, reason: not valid java name */
    public static final void m4530writeFullyUAd2zVI(Output writeFully, ByteBuffer src, int i10, int i11) {
        e0.checkNotNullParameter(writeFully, "$this$writeFully");
        e0.checkNotNullParameter(src, "src");
        m4531writeFullyUAd2zVI(writeFully, src, i10, i11);
    }

    private static final void writeFullyBytesTemplate(Output output, int i10, int i11, q qVar) {
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, null);
        while (true) {
            try {
                int iMin = Math.min(i11, chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition());
                qVar.invoke(chunkBufferPrepareWriteHead, Integer.valueOf(i10), Integer.valueOf(iMin));
                i10 += iMin;
                i11 -= iMin;
                if (i11 <= 0) {
                    return;
                } else {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, chunkBufferPrepareWriteHead);
                }
            } finally {
                b0.finallyStart(1);
                output.afterHeadWrite();
                b0.finallyEnd(1);
            }
        }
    }

    private static final void writeFullyTemplate(Output output, int i10, int i11, int i12, q qVar) {
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i10, null);
        while (true) {
            try {
                int iMin = Math.min(i12, chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition());
                qVar.invoke(chunkBufferPrepareWriteHead, Integer.valueOf(i11), Integer.valueOf(iMin));
                i11 += iMin;
                i12 -= iMin;
                int i13 = i12 * i10;
                if (i13 <= 0) {
                    return;
                } else {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i13, chunkBufferPrepareWriteHead);
                }
            } finally {
                b0.finallyStart(1);
                output.afterHeadWrite();
                b0.finallyEnd(1);
            }
        }
    }

    public static final void writeWhile(Output output, l block) {
        e0.checkNotNullParameter(output, "<this>");
        e0.checkNotNullParameter(block, "block");
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, null);
        while (((Boolean) block.invoke(chunkBufferPrepareWriteHead)).booleanValue()) {
            try {
                chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, chunkBufferPrepareWriteHead);
            } finally {
                b0.finallyStart(1);
                output.afterHeadWrite();
                b0.finallyEnd(1);
            }
        }
    }

    public static final void writeWhileSize(Output output, int i10, l block) {
        e0.checkNotNullParameter(output, "<this>");
        e0.checkNotNullParameter(block, "block");
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i10, null);
        while (true) {
            try {
                int iIntValue = ((Number) block.invoke(chunkBufferPrepareWriteHead)).intValue();
                if (iIntValue <= 0) {
                    return;
                } else {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, iIntValue, chunkBufferPrepareWriteHead);
                }
            } finally {
                b0.finallyStart(1);
                output.afterHeadWrite();
                b0.finallyEnd(1);
            }
        }
    }

    public static /* synthetic */ void writeWhileSize$default(Output output, int i10, l block, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        e0.checkNotNullParameter(output, "<this>");
        e0.checkNotNullParameter(block, "block");
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i10, null);
        while (true) {
            try {
                int iIntValue = ((Number) block.invoke(chunkBufferPrepareWriteHead)).intValue();
                if (iIntValue <= 0) {
                    return;
                } else {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, iIntValue, chunkBufferPrepareWriteHead);
                }
            } finally {
                b0.finallyStart(1);
                output.afterHeadWrite();
                b0.finallyEnd(1);
            }
        }
    }

    public static final Appendable append(Output output, char[] csq, int i10, int i11) {
        e0.checkNotNullParameter(output, "<this>");
        e0.checkNotNullParameter(csq, "csq");
        return output.append(csq, i10, i11);
    }

    public static /* synthetic */ Appendable append$default(Output output, char[] cArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = cArr.length;
        }
        return append(output, cArr, i10, i11);
    }

    public static /* synthetic */ void writeFully$default(Output output, short[] sArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = sArr.length - i10;
        }
        writeFully(output, sArr, i10, i11);
    }

    /* renamed from: writeFully-UAd2zVI, reason: not valid java name */
    public static final void m4531writeFullyUAd2zVI(Output writeFully, ByteBuffer src, long j10, long j11) {
        e0.checkNotNullParameter(writeFully, "$this$writeFully");
        e0.checkNotNullParameter(src, "src");
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(writeFully, 1, null);
        long j12 = j10;
        while (true) {
            try {
                long jMin = Math.min(j11, chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition());
                ByteBuffer byteBuffer = src;
                Memory.m4316copyToJT6ljtQ(byteBuffer, chunkBufferPrepareWriteHead.m4458getMemorySK3TCg8(), j12, jMin, chunkBufferPrepareWriteHead.getWritePosition());
                chunkBufferPrepareWriteHead.commitWritten((int) jMin);
                j12 += jMin;
                j11 -= jMin;
                if (j11 <= 0) {
                    return;
                }
                chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(writeFully, 1, chunkBufferPrepareWriteHead);
                src = byteBuffer;
            } finally {
                writeFully.afterHeadWrite();
            }
        }
    }

    public static /* synthetic */ void writeFully$default(Output output, int[] iArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = iArr.length - i10;
        }
        writeFully(output, iArr, i10, i11);
    }

    public static /* synthetic */ void writeFully$default(Output output, long[] jArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length - i10;
        }
        writeFully(output, jArr, i10, i11);
    }

    public static /* synthetic */ void writeFully$default(Output output, float[] fArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length - i10;
        }
        writeFully(output, fArr, i10, i11);
    }

    public static /* synthetic */ void writeFully$default(Output output, double[] dArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = dArr.length - i10;
        }
        writeFully(output, dArr, i10, i11);
    }

    public static final void writeFully(Output output, short[] src, int i10, int i11) {
        e0.checkNotNullParameter(output, "<this>");
        e0.checkNotNullParameter(src, "src");
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 2, null);
        while (true) {
            try {
                int iMin = Math.min(i11, chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition());
                BufferPrimitivesKt.writeFully((Buffer) chunkBufferPrepareWriteHead, src, i10, iMin);
                i10 += iMin;
                i11 -= iMin;
                int i12 = i11 * 2;
                if (i12 <= 0) {
                    return;
                } else {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i12, chunkBufferPrepareWriteHead);
                }
            } finally {
                output.afterHeadWrite();
            }
        }
    }

    public static /* synthetic */ void writeFully$default(Output output, Buffer buffer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = buffer.getWritePosition() - buffer.getReadPosition();
        }
        writeFully(output, buffer, i10);
    }

    private static final void writeFullyBytesTemplate(Output output, long j10, long j11, r rVar) {
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, null);
        while (true) {
            try {
                long jMin = Math.min(j11, chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition());
                rVar.invoke(Memory.m4313boximpl(chunkBufferPrepareWriteHead.m4458getMemorySK3TCg8()), Long.valueOf(chunkBufferPrepareWriteHead.getWritePosition()), Long.valueOf(j10), Long.valueOf(jMin));
                chunkBufferPrepareWriteHead.commitWritten((int) jMin);
                j10 += jMin;
                j11 -= jMin;
                if (j11 <= 0) {
                    return;
                } else {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, chunkBufferPrepareWriteHead);
                }
            } finally {
                b0.finallyStart(1);
                output.afterHeadWrite();
                b0.finallyEnd(1);
            }
        }
    }

    public static final void writeFully(Output output, int[] src, int i10, int i11) {
        e0.checkNotNullParameter(output, "<this>");
        e0.checkNotNullParameter(src, "src");
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 4, null);
        while (true) {
            try {
                int iMin = Math.min(i11, chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition());
                BufferPrimitivesKt.writeFully((Buffer) chunkBufferPrepareWriteHead, src, i10, iMin);
                i10 += iMin;
                i11 -= iMin;
                int i12 = i11 * 4;
                if (i12 <= 0) {
                    return;
                } else {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i12, chunkBufferPrepareWriteHead);
                }
            } finally {
                output.afterHeadWrite();
            }
        }
    }

    public static final void writeFully(Output output, long[] src, int i10, int i11) {
        e0.checkNotNullParameter(output, "<this>");
        e0.checkNotNullParameter(src, "src");
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 8, null);
        while (true) {
            try {
                int iMin = Math.min(i11, chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition());
                BufferPrimitivesKt.writeFully((Buffer) chunkBufferPrepareWriteHead, src, i10, iMin);
                i10 += iMin;
                i11 -= iMin;
                int i12 = i11 * 8;
                if (i12 <= 0) {
                    return;
                } else {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i12, chunkBufferPrepareWriteHead);
                }
            } finally {
                output.afterHeadWrite();
            }
        }
    }

    public static final void writeFully(Output output, float[] src, int i10, int i11) {
        e0.checkNotNullParameter(output, "<this>");
        e0.checkNotNullParameter(src, "src");
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 4, null);
        while (true) {
            try {
                int iMin = Math.min(i11, chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition());
                BufferPrimitivesKt.writeFully((Buffer) chunkBufferPrepareWriteHead, src, i10, iMin);
                i10 += iMin;
                i11 -= iMin;
                int i12 = i11 * 4;
                if (i12 <= 0) {
                    return;
                } else {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i12, chunkBufferPrepareWriteHead);
                }
            } finally {
                output.afterHeadWrite();
            }
        }
    }

    public static final void writeFully(Output output, double[] src, int i10, int i11) {
        e0.checkNotNullParameter(output, "<this>");
        e0.checkNotNullParameter(src, "src");
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 8, null);
        while (true) {
            try {
                int iMin = Math.min(i11, chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition());
                BufferPrimitivesKt.writeFully(chunkBufferPrepareWriteHead, src, i10, iMin);
                i10 += iMin;
                i11 -= iMin;
                int i12 = i11 * 8;
                if (i12 <= 0) {
                    return;
                } else {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i12, chunkBufferPrepareWriteHead);
                }
            } finally {
                output.afterHeadWrite();
            }
        }
    }

    public static final void writeFully(Output output, Buffer src, int i10) {
        e0.checkNotNullParameter(output, "<this>");
        e0.checkNotNullParameter(src, "src");
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, null);
        while (true) {
            try {
                int iMin = Math.min(i10, chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition());
                BufferPrimitivesKt.writeFully(chunkBufferPrepareWriteHead, src, iMin);
                i10 -= iMin;
                if (i10 <= 0) {
                    return;
                } else {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, chunkBufferPrepareWriteHead);
                }
            } finally {
                output.afterHeadWrite();
            }
        }
    }
}
