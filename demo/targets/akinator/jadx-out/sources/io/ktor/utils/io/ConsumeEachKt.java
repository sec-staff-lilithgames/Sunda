package io.ktor.utils.io;

import bv.d;
import bv.f;
import io.ktor.utils.io.bits.Memory;
import io.ktor.utils.io.core.Buffer;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.w0;
import kv.p;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ConsumeEachKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ConsumeEachKt", f = "ConsumeEach.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2}, l = {46, 50, 53}, m = "consumeEachBufferRange", n = {"$this$consumeEachBufferRange", "visitor", "continueFlag", "lastChunkReported", "$this$read_u24default$iv", "$this$consumeEachBufferRange", "visitor", "continueFlag", "lastChunkReported", "$this$read_u24default$iv", "buffer$iv", "bytesRead$iv", "cause$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0"})
    /* renamed from: io.ktor.utils.io.ConsumeEachKt$consumeEachBufferRange$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConsumeEachKt.consumeEachBufferRange(null, null, this);
        }
    }

    /* JADX WARN: Path cross not found for [B:39:0x00f1, B:42:0x00f9], limit reached: 63 */
    /* JADX WARN: Path cross not found for [B:49:0x012e, B:52:0x0135], limit reached: 63 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5 A[Catch: all -> 0x00db, TryCatch #1 {all -> 0x00db, blocks: (B:31:0x00c3, B:33:0x00d5, B:37:0x00e7, B:39:0x00f1, B:43:0x00fa, B:36:0x00e1), top: B:63:0x00c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1 A[Catch: all -> 0x00db, TryCatch #1 {all -> 0x00db, blocks: (B:31:0x00c3, B:33:0x00d5, B:37:0x00e7, B:39:0x00f1, B:43:0x00fa, B:36:0x00e1), top: B:63:0x00c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0155 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0127 -> B:47:0x012a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object consumeEachBufferRange(io.ktor.utils.io.ByteReadChannel r18, kv.p r19, zu.d<? super tu.x0> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ConsumeEachKt.consumeEachBufferRange(io.ktor.utils.io.ByteReadChannel, kv.p, zu.d):java.lang.Object");
    }

    private static final Object consumeEachBufferRange$$forInline(ByteReadChannel byteReadChannel, p pVar, zu.d<? super x0> dVar) {
        w0 w0Var = new w0();
        w0 w0Var2 = new w0();
        do {
            w0Var.f71863b = false;
            b0.mark(0);
            Object objRequestBuffer = ReadSessionKt.requestBuffer(byteReadChannel, 1, dVar);
            b0.mark(1);
            Buffer empty = (Buffer) objRequestBuffer;
            if (empty == null) {
                empty = Buffer.Companion.getEmpty();
            }
            try {
                Memory memoryM4313boximpl = Memory.m4313boximpl(empty.m4458getMemorySK3TCg8());
                Long lValueOf = Long.valueOf(empty.getReadPosition());
                long jLongValue = Long.valueOf(empty.getWritePosition()).longValue();
                long jLongValue2 = lValueOf.longValue();
                ByteBuffer byteBufferM4325slice87lwejk = jLongValue > jLongValue2 ? Memory.m4325slice87lwejk(memoryM4313boximpl.m4329unboximpl(), jLongValue2, jLongValue - jLongValue2) : Memory.Companion.m4330getEmptySK3TCg8();
                boolean z10 = byteBufferM4325slice87lwejk.remaining() == byteReadChannel.getAvailableForRead() && byteReadChannel.isClosedForWrite();
                w0Var2.f71863b = z10;
                w0Var.f71863b = ((Boolean) pVar.invoke(byteBufferM4325slice87lwejk, Boolean.valueOf(z10))).booleanValue();
                int iIntValue = Integer.valueOf(byteBufferM4325slice87lwejk.position()).intValue();
                b0.mark(0);
                ReadSessionKt.completeReadingFromBuffer(byteReadChannel, empty, iIntValue, dVar);
                b0.mark(1);
                if (w0Var2.f71863b && byteReadChannel.isClosedForRead()) {
                    break;
                }
            } catch (Throwable th2) {
                b0.mark(0);
                ReadSessionKt.completeReadingFromBuffer(byteReadChannel, empty, 0, dVar);
                b0.mark(1);
                throw th2;
            }
        } while (w0Var.f71863b);
        return x0.f87415a;
    }
}
