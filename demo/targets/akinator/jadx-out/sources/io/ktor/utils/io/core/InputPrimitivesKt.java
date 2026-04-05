package io.ktor.utils.io.core;

import e3.g;
import io.ktor.utils.io.bits.Memory;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.core.internal.UnsafeKt;
import java.io.EOFException;
import kotlin.jvm.internal.e0;
import kv.a;
import kv.l;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class InputPrimitivesKt {
    public static final double readDouble(Input input) {
        e0.checkNotNullParameter(input, "<this>");
        if (input.getHeadEndExclusive() - input.getHeadPosition() <= 8) {
            return readDoubleFallback(input);
        }
        int headPosition = input.getHeadPosition();
        input.setHeadPosition(headPosition + 8);
        return input.m4497getHeadMemorySK3TCg8().getDouble(headPosition);
    }

    public static final double readDoubleFallback(Input input) throws EOFException {
        e0.checkNotNullParameter(input, "<this>");
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 8);
        if (chunkBufferPrepareReadFirstHead == null) {
            throw g.q(8);
        }
        double d10 = BufferPrimitivesKt.readDouble((Buffer) chunkBufferPrepareReadFirstHead);
        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
        return d10;
    }

    public static final float readFloat(Input input) {
        e0.checkNotNullParameter(input, "<this>");
        if (input.getHeadEndExclusive() - input.getHeadPosition() <= 4) {
            return readFloatFallback(input);
        }
        int headPosition = input.getHeadPosition();
        input.setHeadPosition(headPosition + 4);
        return input.m4497getHeadMemorySK3TCg8().getFloat(headPosition);
    }

    public static final float readFloatFallback(Input input) throws EOFException {
        e0.checkNotNullParameter(input, "<this>");
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 4);
        if (chunkBufferPrepareReadFirstHead == null) {
            throw g.q(4);
        }
        float f10 = BufferPrimitivesKt.readFloat((Buffer) chunkBufferPrepareReadFirstHead);
        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
        return f10;
    }

    public static final int readInt(Input input) {
        e0.checkNotNullParameter(input, "<this>");
        if (input.getHeadEndExclusive() - input.getHeadPosition() <= 4) {
            return readIntFallback(input);
        }
        int headPosition = input.getHeadPosition();
        input.setHeadPosition(headPosition + 4);
        return input.m4497getHeadMemorySK3TCg8().getInt(headPosition);
    }

    private static final int readIntFallback(Input input) throws EOFException {
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 4);
        if (chunkBufferPrepareReadFirstHead == null) {
            throw g.q(4);
        }
        int i10 = BufferPrimitivesKt.readInt((Buffer) chunkBufferPrepareReadFirstHead);
        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
        return i10;
    }

    public static final long readLong(Input input) {
        e0.checkNotNullParameter(input, "<this>");
        if (input.getHeadEndExclusive() - input.getHeadPosition() <= 8) {
            return readLongFallback(input);
        }
        int headPosition = input.getHeadPosition();
        input.setHeadPosition(headPosition + 8);
        return input.m4497getHeadMemorySK3TCg8().getLong(headPosition);
    }

    private static final long readLongFallback(Input input) throws EOFException {
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 8);
        if (chunkBufferPrepareReadFirstHead == null) {
            throw g.q(8);
        }
        long j10 = BufferPrimitivesKt.readLong((Buffer) chunkBufferPrepareReadFirstHead);
        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
        return j10;
    }

    private static final <R> R readPrimitive(Input input, int i10, p pVar, a aVar) {
        if (input.getHeadEndExclusive() - input.getHeadPosition() <= i10) {
            return (R) aVar.invoke();
        }
        int headPosition = input.getHeadPosition();
        input.setHeadPosition(i10 + headPosition);
        return (R) pVar.invoke(Memory.m4313boximpl(input.m4497getHeadMemorySK3TCg8()), Integer.valueOf(headPosition));
    }

    private static final <R> R readPrimitiveFallback(Input input, int i10, l lVar) {
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, i10);
        if (chunkBufferPrepareReadFirstHead == null) {
            throw g.q(i10);
        }
        R r10 = (R) lVar.invoke(chunkBufferPrepareReadFirstHead);
        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
        return r10;
    }

    public static final short readShort(Input input) {
        e0.checkNotNullParameter(input, "<this>");
        if (input.getHeadEndExclusive() - input.getHeadPosition() <= 2) {
            return readShortFallback(input);
        }
        int headPosition = input.getHeadPosition();
        input.setHeadPosition(headPosition + 2);
        return input.m4497getHeadMemorySK3TCg8().getShort(headPosition);
    }

    private static final short readShortFallback(Input input) throws EOFException {
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 2);
        if (chunkBufferPrepareReadFirstHead == null) {
            throw g.q(2);
        }
        short s10 = BufferPrimitivesKt.readShort((Buffer) chunkBufferPrepareReadFirstHead);
        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
        return s10;
    }
}
