package io.ktor.utils.io;

import bv.f;
import bv.n;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.w0;
import kv.p;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.utils.io.DelimitedKt$readUntilDelimiterSuspend$copied$1", f = "Delimited.kt", i = {0, 0, 1, 1}, l = {85, 95}, m = "invokeSuspend", n = {"$this$lookAheadSuspend", "copied", "$this$lookAheadSuspend", "copied"}, s = {"L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes10.dex */
public final class DelimitedKt$readUntilDelimiterSuspend$copied$1 extends n implements p {
    final /* synthetic */ int $copied0;
    final /* synthetic */ ByteBuffer $delimiter;
    final /* synthetic */ ByteBuffer $dst;
    final /* synthetic */ w0 $endFound;
    final /* synthetic */ ByteReadChannel $this_readUntilDelimiterSuspend;
    int I$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DelimitedKt$readUntilDelimiterSuspend$copied$1(int i10, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, w0 w0Var, ByteReadChannel byteReadChannel, d<? super DelimitedKt$readUntilDelimiterSuspend$copied$1> dVar) {
        super(2, dVar);
        this.$copied0 = i10;
        this.$delimiter = byteBuffer;
        this.$dst = byteBuffer2;
        this.$endFound = w0Var;
        this.$this_readUntilDelimiterSuspend = byteReadChannel;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        DelimitedKt$readUntilDelimiterSuspend$copied$1 delimitedKt$readUntilDelimiterSuspend$copied$1 = new DelimitedKt$readUntilDelimiterSuspend$copied$1(this.$copied0, this.$delimiter, this.$dst, this.$endFound, this.$this_readUntilDelimiterSuspend, dVar);
        delimitedKt$readUntilDelimiterSuspend$copied$1.L$0 = obj;
        return delimitedKt$readUntilDelimiterSuspend$copied$1;
    }

    @Override // kv.p
    public final Object invoke(LookAheadSuspendSession lookAheadSuspendSession, d<? super Integer> dVar) {
        return ((DelimitedKt$readUntilDelimiterSuspend$copied$1) create(lookAheadSuspendSession, dVar)).invokeSuspend(x0.f87415a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        if (r4.awaitAtLeast(r7, r6) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r6.$endFound.f71863b == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007a, code lost:
    
        r1 = r1 + r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0077 -> B:26:0x007a). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2a
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            int r1 = r6.I$0
            java.lang.Object r4 = r6.L$0
            io.ktor.utils.io.LookAheadSuspendSession r4 = (io.ktor.utils.io.LookAheadSuspendSession) r4
            tu.a0.throwOnFailure(r7)
            goto L7a
        L18:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L20:
            int r1 = r6.I$0
            java.lang.Object r4 = r6.L$0
            io.ktor.utils.io.LookAheadSuspendSession r4 = (io.ktor.utils.io.LookAheadSuspendSession) r4
            tu.a0.throwOnFailure(r7)
            goto L41
        L2a:
            tu.a0.throwOnFailure(r7)
            java.lang.Object r7 = r6.L$0
            io.ktor.utils.io.LookAheadSuspendSession r7 = (io.ktor.utils.io.LookAheadSuspendSession) r7
            int r1 = r6.$copied0
        L33:
            r6.L$0 = r7
            r6.I$0 = r1
            r6.label = r3
            java.lang.Object r4 = r7.awaitAtLeast(r3, r6)
            if (r4 != r0) goto L40
            goto L79
        L40:
            r4 = r7
        L41:
            java.nio.ByteBuffer r7 = r6.$delimiter
            java.nio.ByteBuffer r5 = r6.$dst
            int r7 = io.ktor.utils.io.DelimitedKt.access$tryCopyUntilDelimiter(r4, r7, r5)
            if (r7 != 0) goto L7c
            java.nio.ByteBuffer r7 = r6.$delimiter
            int r7 = io.ktor.utils.io.DelimitedKt.access$startsWithDelimiter(r4, r7)
            java.nio.ByteBuffer r5 = r6.$delimiter
            int r5 = r5.remaining()
            if (r7 != r5) goto L5e
            kotlin.jvm.internal.w0 r7 = r6.$endFound
            r7.f71863b = r3
            goto L93
        L5e:
            io.ktor.utils.io.ByteReadChannel r7 = r6.$this_readUntilDelimiterSuspend
            boolean r7 = r7.isClosedForWrite()
            if (r7 == 0) goto L67
            goto L93
        L67:
            java.nio.ByteBuffer r7 = r6.$delimiter
            int r7 = r7.remaining()
            r6.L$0 = r4
            r6.I$0 = r1
            r6.label = r2
            java.lang.Object r7 = r4.awaitAtLeast(r7, r6)
            if (r7 != r0) goto L7a
        L79:
            return r0
        L7a:
            r7 = r4
            goto L85
        L7c:
            if (r7 > 0) goto L83
            kotlin.jvm.internal.w0 r5 = r6.$endFound
            r5.f71863b = r3
            int r7 = -r7
        L83:
            int r1 = r1 + r7
            goto L7a
        L85:
            java.nio.ByteBuffer r4 = r6.$dst
            boolean r4 = r4.hasRemaining()
            if (r4 == 0) goto L93
            kotlin.jvm.internal.w0 r4 = r6.$endFound
            boolean r4 = r4.f71863b
            if (r4 == 0) goto L33
        L93:
            java.lang.Integer r7 = bv.b.boxInt(r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.DelimitedKt$readUntilDelimiterSuspend$copied$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
