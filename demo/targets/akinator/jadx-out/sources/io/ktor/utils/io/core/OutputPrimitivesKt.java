package io.ktor.utils.io.core;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import io.ktor.utils.io.bits.Memory;
import kotlin.jvm.internal.e0;
import kv.l;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class OutputPrimitivesKt {
    public static final void writeDouble(Output output, double d10) {
        e0.checkNotNullParameter(output, "<this>");
        int tailPosition$ktor_io = output.getTailPosition$ktor_io();
        if (output.getTailEndExclusive$ktor_io() - tailPosition$ktor_io <= 8) {
            writeLongFallback(output, Double.doubleToRawLongBits(d10));
        } else {
            output.setTailPosition$ktor_io(tailPosition$ktor_io + 8);
            output.m4528getTailMemorySK3TCg8$ktor_io().putDouble(tailPosition$ktor_io, d10);
        }
    }

    public static final void writeFloat(Output output, float f10) {
        e0.checkNotNullParameter(output, "<this>");
        int tailPosition$ktor_io = output.getTailPosition$ktor_io();
        if (output.getTailEndExclusive$ktor_io() - tailPosition$ktor_io <= 4) {
            writeIntFallback(output, Float.floatToRawIntBits(f10));
        } else {
            output.setTailPosition$ktor_io(tailPosition$ktor_io + 4);
            output.m4528getTailMemorySK3TCg8$ktor_io().putFloat(tailPosition$ktor_io, f10);
        }
    }

    public static final void writeInt(Output output, int i10) {
        e0.checkNotNullParameter(output, "<this>");
        int tailPosition$ktor_io = output.getTailPosition$ktor_io();
        if (output.getTailEndExclusive$ktor_io() - tailPosition$ktor_io <= 4) {
            writeIntFallback(output, i10);
        } else {
            output.setTailPosition$ktor_io(tailPosition$ktor_io + 4);
            output.m4528getTailMemorySK3TCg8$ktor_io().putInt(tailPosition$ktor_io, i10);
        }
    }

    private static final void writeIntByteByByte(Output output, int i10) throws InsufficientSpaceException {
        short s10 = (short) (i10 >>> 16);
        output.writeByte((byte) (s10 >>> 8));
        output.writeByte((byte) (s10 & 255));
        short s11 = (short) (i10 & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        output.writeByte((byte) (s11 >>> 8));
        output.writeByte((byte) (s11 & 255));
    }

    private static final void writeIntFallback(Output output, int i10) {
        BufferPrimitivesKt.writeInt((Buffer) output.prepareWriteHead(4), i10);
        output.afterHeadWrite();
    }

    public static final void writeLong(Output output, long j10) {
        e0.checkNotNullParameter(output, "<this>");
        int tailPosition$ktor_io = output.getTailPosition$ktor_io();
        if (output.getTailEndExclusive$ktor_io() - tailPosition$ktor_io <= 8) {
            writeLongFallback(output, j10);
        } else {
            output.setTailPosition$ktor_io(tailPosition$ktor_io + 8);
            output.m4528getTailMemorySK3TCg8$ktor_io().putLong(tailPosition$ktor_io, j10);
        }
    }

    private static final void writeLongFallback(Output output, long j10) {
        BufferPrimitivesKt.writeLong((Buffer) output.prepareWriteHead(8), j10);
        output.afterHeadWrite();
    }

    private static final boolean writePrimitiveFallbackTemplate(Output output, int i10, l lVar) {
        lVar.invoke(output.prepareWriteHead(i10));
        output.afterHeadWrite();
        return true;
    }

    private static final boolean writePrimitiveTemplate(Output output, int i10, p pVar) {
        int tailPosition$ktor_io = output.getTailPosition$ktor_io();
        if (output.getTailEndExclusive$ktor_io() - tailPosition$ktor_io <= i10) {
            return false;
        }
        output.setTailPosition$ktor_io(i10 + tailPosition$ktor_io);
        pVar.invoke(Memory.m4313boximpl(output.m4528getTailMemorySK3TCg8$ktor_io()), Integer.valueOf(tailPosition$ktor_io));
        return true;
    }

    public static final void writeShort(Output output, short s10) {
        e0.checkNotNullParameter(output, "<this>");
        int tailPosition$ktor_io = output.getTailPosition$ktor_io();
        if (output.getTailEndExclusive$ktor_io() - tailPosition$ktor_io <= 2) {
            writeShortFallback(output, s10);
        } else {
            output.setTailPosition$ktor_io(tailPosition$ktor_io + 2);
            output.m4528getTailMemorySK3TCg8$ktor_io().putShort(tailPosition$ktor_io, s10);
        }
    }

    private static final void writeShortFallback(Output output, short s10) {
        BufferPrimitivesKt.writeShort((Buffer) output.prepareWriteHead(2), s10);
        output.afterHeadWrite();
    }
}
