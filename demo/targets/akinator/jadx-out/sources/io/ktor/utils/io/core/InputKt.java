package io.ktor.utils.io.core;

import a.b;
import b0.e2;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.core.internal.UnsafeKt;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class InputKt {
    public static final long discard(Input input) {
        e0.checkNotNullParameter(input, "<this>");
        return input.discard(Long.MAX_VALUE);
    }

    public static final void discardExact(Input input, long j10) {
        e0.checkNotNullParameter(input, "<this>");
        long jDiscard = input.discard(j10);
        if (jDiscard != j10) {
            throw new IllegalStateException(b.g(j10, " requested", e2.r(jDiscard, "Only ", " bytes were discarded of ")));
        }
    }

    public static final void forEach(Input input, l block) throws Throwable {
        boolean z10;
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(block, "block");
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (chunkBufferPrepareReadFirstHead == null) {
            return;
        }
        do {
            try {
                ByteBuffer byteBufferM4458getMemorySK3TCg8 = chunkBufferPrepareReadFirstHead.m4458getMemorySK3TCg8();
                int readPosition = chunkBufferPrepareReadFirstHead.getReadPosition();
                int writePosition = chunkBufferPrepareReadFirstHead.getWritePosition();
                for (int i10 = readPosition; i10 < writePosition; i10++) {
                    block.invoke(Byte.valueOf(byteBufferM4458getMemorySK3TCg8.get(i10)));
                }
                chunkBufferPrepareReadFirstHead.discardExact(writePosition - readPosition);
                try {
                    chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                } catch (Throwable th2) {
                    th = th2;
                    z10 = false;
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
        } while (chunkBufferPrepareReadFirstHead != null);
        b0.finallyStart(1);
        b0.finallyEnd(1);
    }

    public static final char peekCharUtf8(Input input) throws EOFException {
        e0.checkNotNullParameter(input, "<this>");
        int iTryPeek = input.tryPeek();
        if ((iTryPeek & 128) == 0) {
            return (char) iTryPeek;
        }
        if (iTryPeek != -1) {
            return peekCharUtf8Impl(input, iTryPeek);
        }
        throw new EOFException("Failed to peek a char: end of input");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final char peekCharUtf8Impl(io.ktor.utils.io.core.Input r17, int r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.core.InputKt.peekCharUtf8Impl(io.ktor.utils.io.core.Input, int):char");
    }

    public static final void takeWhile(Input input, l block) throws Throwable {
        boolean z10;
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(block, "block");
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (chunkBufferPrepareReadFirstHead == null) {
            return;
        }
        while (true) {
            try {
                if (!((Boolean) block.invoke(chunkBufferPrepareReadFirstHead)).booleanValue()) {
                    z10 = true;
                    break;
                }
                z10 = false;
                try {
                    ChunkBuffer chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                    if (chunkBufferPrepareReadNextHead == null) {
                        break;
                    } else {
                        chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
                    }
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
    }

    public static final void takeWhileSize(Input input, int i10, l block) throws Throwable {
        boolean z10;
        ChunkBuffer chunkBufferPrepareReadNextHead;
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(block, "block");
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, i10);
        if (chunkBufferPrepareReadFirstHead == null) {
            return;
        }
        while (true) {
            try {
                int writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                if (writePosition >= i10) {
                    try {
                        i10 = ((Number) block.invoke(chunkBufferPrepareReadFirstHead)).intValue();
                        b0.finallyStart(1);
                        writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                        b0.finallyEnd(1);
                    } finally {
                    }
                }
                z10 = false;
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
                } else if (writePosition < i10 || chunkBufferPrepareReadFirstHead.getCapacity() - chunkBufferPrepareReadFirstHead.getLimit() < 8) {
                    UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                    chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, i10);
                } else {
                    chunkBufferPrepareReadNextHead = chunkBufferPrepareReadFirstHead;
                }
                if (chunkBufferPrepareReadNextHead == null) {
                    break;
                }
                if (i10 <= 0) {
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
    }

    public static /* synthetic */ void takeWhileSize$default(Input input, int i10, l block, int i11, Object obj) throws Throwable {
        boolean z10;
        ChunkBuffer chunkBufferPrepareReadNextHead;
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(block, "block");
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, i10);
        if (chunkBufferPrepareReadFirstHead == null) {
            return;
        }
        while (true) {
            try {
                int writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                if (writePosition >= i10) {
                    try {
                        i10 = ((Number) block.invoke(chunkBufferPrepareReadFirstHead)).intValue();
                        b0.finallyStart(1);
                        writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                        b0.finallyEnd(1);
                    } finally {
                    }
                }
                z10 = false;
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
                } else if (writePosition < i10 || chunkBufferPrepareReadFirstHead.getCapacity() - chunkBufferPrepareReadFirstHead.getLimit() < 8) {
                    UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                    chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, i10);
                } else {
                    chunkBufferPrepareReadNextHead = chunkBufferPrepareReadFirstHead;
                }
                if (chunkBufferPrepareReadNextHead == null) {
                    break;
                }
                if (i10 <= 0) {
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
    }

    public static final void discardExact(Input input, int i10) {
        e0.checkNotNullParameter(input, "<this>");
        discardExact(input, i10);
    }
}
