package io.ktor.utils.io.internal;

import bv.d;
import bv.f;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class SequentialCopyToKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.internal.SequentialCopyToKt", f = "SequentialCopyTo.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {26, 31, 39}, m = "copyToSequentialImpl", n = {"$this$copyToSequentialImpl", "dst", "limit", "remainingLimit", "$this$copyToSequentialImpl", "dst", "limit", "remainingLimit", "$this$copyToSequentialImpl", "dst", "limit", "remainingLimit", "transferred"}, s = {"L$0", "L$1", "J$0", "J$1", "L$0", "L$1", "J$0", "J$1", "L$0", "L$1", "J$0", "J$1", "J$2"})
    /* renamed from: io.ktor.utils.io.internal.SequentialCopyToKt$copyToSequentialImpl$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        long J$0;
        long J$1;
        long J$2;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SequentialCopyToKt.copyToSequentialImpl(null, null, 0L, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.internal.SequentialCopyToKt", f = "SequentialCopyTo.kt", i = {0, 0, 1, 1}, l = {60, TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER}, m = "copyToTail", n = {"dst", "lastPiece", "lastPiece", DownloadCommon.DOWNLOAD_REPORT_RETRY_COUNT}, s = {"L$0", "L$1", "L$0", "I$0"})
    /* renamed from: io.ktor.utils.io.internal.SequentialCopyToKt$copyToTail$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40961 extends d {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40961(zu.d<? super C40961> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SequentialCopyToKt.copyToTail(null, null, 0L, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.internal.SequentialCopyToKt", f = "SequentialCopyTo.kt", i = {0, 0}, l = {7}, m = "joinToImpl", n = {"dst", "closeOnEnd"}, s = {"L$0", "Z$0"})
    /* renamed from: io.ktor.utils.io.internal.SequentialCopyToKt$joinToImpl$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40971 extends d {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C40971(zu.d<? super C40971> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SequentialCopyToKt.joinToImpl(null, null, false, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d2, code lost:
    
        if (r14 != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ed, code lost:
    
        if (r0.awaitAtLeastNBytesAvailableForWrite$ktor_io(1, r2) == r3) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00d2 -> B:44:0x00d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00db -> B:50:0x00f0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00ed -> B:50:0x00f0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object copyToSequentialImpl(io.ktor.utils.io.ByteChannelSequentialBase r18, io.ktor.utils.io.ByteChannelSequentialBase r19, long r20, zu.d<? super java.lang.Long> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.internal.SequentialCopyToKt.copyToSequentialImpl(io.ktor.utils.io.ByteChannelSequentialBase, io.ktor.utils.io.ByteChannelSequentialBase, long, zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v10, types: [io.ktor.utils.io.core.internal.ChunkBuffer] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object copyToTail(io.ktor.utils.io.ByteChannelSequentialBase r8, io.ktor.utils.io.ByteChannelSequentialBase r9, long r10, zu.d<? super java.lang.Long> r12) throws java.lang.Throwable {
        /*
            boolean r0 = r12 instanceof io.ktor.utils.io.internal.SequentialCopyToKt.C40961
            if (r0 == 0) goto L13
            r0 = r12
            io.ktor.utils.io.internal.SequentialCopyToKt$copyToTail$1 r0 = (io.ktor.utils.io.internal.SequentialCopyToKt.C40961) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.internal.SequentialCopyToKt$copyToTail$1 r0 = new io.ktor.utils.io.internal.SequentialCopyToKt$copyToTail$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4f
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            int r8 = r0.I$0
            java.lang.Object r9 = r0.L$0
            io.ktor.utils.io.core.internal.ChunkBuffer r9 = (io.ktor.utils.io.core.internal.ChunkBuffer) r9
            tu.a0.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L33
            goto Lac
        L33:
            r8 = move-exception
            goto Lbb
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            java.lang.Object r8 = r0.L$1
            r9 = r8
            io.ktor.utils.io.core.internal.ChunkBuffer r9 = (io.ktor.utils.io.core.internal.ChunkBuffer) r9
            java.lang.Object r8 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialBase r8 = (io.ktor.utils.io.ByteChannelSequentialBase) r8
            tu.a0.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L33
            r7 = r9
            r9 = r8
            r8 = r12
            r12 = r7
            goto L78
        L4f:
            tu.a0.throwOnFailure(r12)
            io.ktor.utils.io.core.internal.ChunkBuffer$Companion r12 = io.ktor.utils.io.core.internal.ChunkBuffer.Companion
            io.ktor.utils.io.pool.ObjectPool r12 = r12.getPool()
            java.lang.Object r12 = r12.borrow()
            io.ktor.utils.io.core.internal.ChunkBuffer r12 = (io.ktor.utils.io.core.internal.ChunkBuffer) r12
            int r2 = r12.getCapacity()     // Catch: java.lang.Throwable -> L98
            long r5 = (long) r2     // Catch: java.lang.Throwable -> L98
            long r10 = qv.v.coerceAtMost(r10, r5)     // Catch: java.lang.Throwable -> L98
            int r10 = (int) r10     // Catch: java.lang.Throwable -> L98
            r12.resetForWrite(r10)     // Catch: java.lang.Throwable -> L98
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L98
            r0.L$1 = r12     // Catch: java.lang.Throwable -> L98
            r0.label = r4     // Catch: java.lang.Throwable -> L98
            java.lang.Object r8 = r8.readAvailable(r12, r0)     // Catch: java.lang.Throwable -> L98
            if (r8 != r1) goto L78
            goto Laa
        L78:
            java.lang.Number r8 = (java.lang.Number) r8     // Catch: java.lang.Throwable -> L98
            int r8 = r8.intValue()     // Catch: java.lang.Throwable -> L98
            r10 = -1
            if (r8 != r10) goto L9b
            io.ktor.utils.io.core.internal.ChunkBuffer$Companion r8 = io.ktor.utils.io.core.internal.ChunkBuffer.Companion     // Catch: java.lang.Throwable -> L98
            io.ktor.utils.io.pool.ObjectPool r9 = r8.getPool()     // Catch: java.lang.Throwable -> L98
            r12.release(r9)     // Catch: java.lang.Throwable -> L98
            r9 = 0
            java.lang.Long r9 = bv.b.boxLong(r9)     // Catch: java.lang.Throwable -> L98
            io.ktor.utils.io.pool.ObjectPool r8 = r8.getPool()
            r12.release(r8)
            return r9
        L98:
            r8 = move-exception
            r9 = r12
            goto Lbb
        L9b:
            r0.L$0 = r12     // Catch: java.lang.Throwable -> L98
            r10 = 0
            r0.L$1 = r10     // Catch: java.lang.Throwable -> L98
            r0.I$0 = r8     // Catch: java.lang.Throwable -> L98
            r0.label = r3     // Catch: java.lang.Throwable -> L98
            java.lang.Object r9 = r9.writeFully(r12, r0)     // Catch: java.lang.Throwable -> L98
            if (r9 != r1) goto Lab
        Laa:
            return r1
        Lab:
            r9 = r12
        Lac:
            long r10 = (long) r8
            java.lang.Long r8 = bv.b.boxLong(r10)     // Catch: java.lang.Throwable -> L33
            io.ktor.utils.io.core.internal.ChunkBuffer$Companion r10 = io.ktor.utils.io.core.internal.ChunkBuffer.Companion
            io.ktor.utils.io.pool.ObjectPool r10 = r10.getPool()
            r9.release(r10)
            return r8
        Lbb:
            io.ktor.utils.io.core.internal.ChunkBuffer$Companion r10 = io.ktor.utils.io.core.internal.ChunkBuffer.Companion
            io.ktor.utils.io.pool.ObjectPool r10 = r10.getPool()
            r9.release(r10)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.internal.SequentialCopyToKt.copyToTail(io.ktor.utils.io.ByteChannelSequentialBase, io.ktor.utils.io.ByteChannelSequentialBase, long, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object joinToImpl(io.ktor.utils.io.ByteChannelSequentialBase r4, io.ktor.utils.io.ByteChannelSequentialBase r5, boolean r6, zu.d<? super tu.x0> r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.internal.SequentialCopyToKt.C40971
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.internal.SequentialCopyToKt$joinToImpl$1 r0 = (io.ktor.utils.io.internal.SequentialCopyToKt.C40971) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.internal.SequentialCopyToKt$joinToImpl$1 r0 = new io.ktor.utils.io.internal.SequentialCopyToKt$joinToImpl$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            boolean r6 = r0.Z$0
            java.lang.Object r4 = r0.L$0
            r5 = r4
            io.ktor.utils.io.ByteChannelSequentialBase r5 = (io.ktor.utils.io.ByteChannelSequentialBase) r5
            tu.a0.throwOnFailure(r7)
            goto L4d
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            tu.a0.throwOnFailure(r7)
            r0.L$0 = r5
            r0.Z$0 = r6
            r0.label = r3
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r4 = copyToSequentialImpl(r4, r5, r2, r0)
            if (r4 != r1) goto L4d
            return r1
        L4d:
            if (r6 == 0) goto L52
            io.ktor.utils.io.ByteWriteChannelKt.close(r5)
        L52:
            tu.x0 r4 = tu.x0.f87415a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.internal.SequentialCopyToKt.joinToImpl(io.ktor.utils.io.ByteChannelSequentialBase, io.ktor.utils.io.ByteChannelSequentialBase, boolean, zu.d):java.lang.Object");
    }
}
