package io.ktor.utils.io;

import av.e;
import bv.b;
import bv.d;
import bv.f;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.http.ContentDisposition;
import io.ktor.utils.io.internal.SequentialCopyToKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ByteReadChannelJVMKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteReadChannelJVMKt", f = "ByteReadChannelJVM.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE, Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE}, m = "copyToImpl", n = {"$this$copyToImpl", "dst", "buffer", "limit", "dstNeedsFlush", "copied", "$this$copyToImpl", "dst", "buffer", "limit", "dstNeedsFlush", "copied", ContentDisposition.Parameters.Size}, s = {"L$0", "L$1", "L$2", "J$0", "I$0", "J$1", "L$0", "L$1", "L$2", "J$0", "I$0", "J$1", "I$1"})
    /* renamed from: io.ktor.utils.io.ByteReadChannelJVMKt$copyToImpl$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        int I$0;
        int I$1;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelJVMKt.copyToImpl(null, null, 0L, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteReadChannelJVMKt", f = "ByteReadChannelJVM.kt", i = {0, 0}, l = {267}, m = "joinToImplSuspend", n = {"dst", "close"}, s = {"L$0", "Z$0"})
    /* renamed from: io.ktor.utils.io.ByteReadChannelJVMKt$joinToImplSuspend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40781 extends d {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C40781(zu.d<? super C40781> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelJVMKt.joinToImplSuspend(null, null, false, this);
        }
    }

    public static final Object copyTo(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, long j10, zu.d<? super Long> dVar) {
        if (byteReadChannel != byteWriteChannel) {
            return j10 == 0 ? b.boxLong(0L) : ((byteReadChannel instanceof ByteBufferChannel) && (byteWriteChannel instanceof ByteBufferChannel)) ? ((ByteBufferChannel) byteWriteChannel).copyDirect$ktor_io((ByteBufferChannel) byteReadChannel, j10, null, dVar) : ((byteReadChannel instanceof ByteChannelSequentialBase) && (byteWriteChannel instanceof ByteChannelSequentialBase)) ? SequentialCopyToKt.copyToSequentialImpl((ByteChannelSequentialBase) byteReadChannel, (ByteChannelSequentialBase) byteWriteChannel, Long.MAX_VALUE, dVar) : copyToImpl(byteReadChannel, byteWriteChannel, j10, dVar);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f A[Catch: all -> 0x00f0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:38:0x00e6, B:40:0x00ec, B:26:0x008f), top: B:55:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4 A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #2 {all -> 0x0048, blocks: (B:13:0x0040, B:30:0x00bb, B:32:0x00c4, B:47:0x00ff, B:21:0x0067), top: B:59:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00db -> B:15:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object copyToImpl(io.ktor.utils.io.ByteReadChannel r19, io.ktor.utils.io.ByteWriteChannel r20, long r21, zu.d<? super java.lang.Long> r23) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelJVMKt.copyToImpl(io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel, long, zu.d):java.lang.Object");
    }

    public static final Object joinTo(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, boolean z10, zu.d<? super x0> dVar) throws Throwable {
        if (byteWriteChannel == byteReadChannel) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        boolean z11 = byteReadChannel instanceof ByteBufferChannel;
        x0 x0Var = x0.f87415a;
        if (z11 && (byteWriteChannel instanceof ByteBufferChannel)) {
            Object objJoinFrom$ktor_io = ((ByteBufferChannel) byteWriteChannel).joinFrom$ktor_io((ByteBufferChannel) byteReadChannel, z10, dVar);
            return objJoinFrom$ktor_io == e.getCOROUTINE_SUSPENDED() ? objJoinFrom$ktor_io : x0Var;
        }
        Object objJoinToImplSuspend = joinToImplSuspend(byteReadChannel, byteWriteChannel, z10, dVar);
        return objJoinToImplSuspend == e.getCOROUTINE_SUSPENDED() ? objJoinToImplSuspend : x0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object joinToImplSuspend(io.ktor.utils.io.ByteReadChannel r4, io.ktor.utils.io.ByteWriteChannel r5, boolean r6, zu.d<? super tu.x0> r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.ByteReadChannelJVMKt.C40781
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.ByteReadChannelJVMKt$joinToImplSuspend$1 r0 = (io.ktor.utils.io.ByteReadChannelJVMKt.C40781) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelJVMKt$joinToImplSuspend$1 r0 = new io.ktor.utils.io.ByteReadChannelJVMKt$joinToImplSuspend$1
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
            io.ktor.utils.io.ByteWriteChannel r5 = (io.ktor.utils.io.ByteWriteChannel) r5
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
            java.lang.Object r4 = copyTo(r4, r5, r2, r0)
            if (r4 != r1) goto L4d
            return r1
        L4d:
            if (r6 == 0) goto L53
            io.ktor.utils.io.ByteWriteChannelKt.close(r5)
            goto L56
        L53:
            r5.flush()
        L56:
            tu.x0 r4 = tu.x0.f87415a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelJVMKt.joinToImplSuspend(io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel, boolean, zu.d):java.lang.Object");
    }
}
