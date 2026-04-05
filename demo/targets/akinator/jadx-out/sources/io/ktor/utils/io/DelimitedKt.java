package io.ktor.utils.io;

import av.e;
import bv.b;
import bv.d;
import bv.f;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import io.ktor.utils.io.internal.UtilsKt;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.w0;
import kotlin.jvm.internal.z0;
import kv.l;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class DelimitedKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.utils.io.DelimitedKt$readUntilDelimiter$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f0 implements l {
        final /* synthetic */ z0 $copied;
        final /* synthetic */ ByteBuffer $delimiter;
        final /* synthetic */ ByteBuffer $dst;
        final /* synthetic */ w0 $endFound;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, w0 w0Var, z0 z0Var) {
            super(1);
            this.$delimiter = byteBuffer;
            this.$dst = byteBuffer2;
            this.$endFound = w0Var;
            this.$copied = z0Var;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LookAheadSession) obj);
            return x0.f87415a;
        }

        public final void invoke(LookAheadSession lookAhead) {
            e0.checkNotNullParameter(lookAhead, "$this$lookAhead");
            do {
                int iTryCopyUntilDelimiter = DelimitedKt.tryCopyUntilDelimiter(lookAhead, this.$delimiter, this.$dst);
                if (iTryCopyUntilDelimiter == 0) {
                    return;
                }
                if (iTryCopyUntilDelimiter < 0) {
                    this.$endFound.f71863b = true;
                    iTryCopyUntilDelimiter = -iTryCopyUntilDelimiter;
                }
                this.$copied.f71866b += iTryCopyUntilDelimiter;
                if (!this.$dst.hasRemaining()) {
                    return;
                }
            } while (!this.$endFound.f71863b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.DelimitedKt", f = "Delimited.kt", i = {0, 0, 0}, l = {81, 113}, m = "readUntilDelimiterSuspend", n = {"$this$readUntilDelimiterSuspend", "dst", "endFound"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: io.ktor.utils.io.DelimitedKt$readUntilDelimiterSuspend$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        int I$0;
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
            return DelimitedKt.readUntilDelimiterSuspend(null, null, null, 0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.utils.io.DelimitedKt$skipDelimiter$2, reason: invalid class name and case insensitive filesystem */
    public static final class C40892 extends f0 implements l {
        final /* synthetic */ ByteBuffer $delimiter;
        final /* synthetic */ w0 $found;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40892(w0 w0Var, ByteBuffer byteBuffer) {
            super(1);
            this.$found = w0Var;
            this.$delimiter = byteBuffer;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LookAheadSession) obj);
            return x0.f87415a;
        }

        public final void invoke(LookAheadSession lookAhead) {
            e0.checkNotNullParameter(lookAhead, "$this$lookAhead");
            this.$found.f71863b = DelimitedKt.tryEnsureDelimiter(lookAhead, this.$delimiter) == this.$delimiter.remaining();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.DelimitedKt$skipDelimiterSuspend$2", f = "Delimited.kt", i = {0}, l = {TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER}, m = "invokeSuspend", n = {"$this$lookAheadSuspend"}, s = {"L$0"})
    /* renamed from: io.ktor.utils.io.DelimitedKt$skipDelimiterSuspend$2, reason: invalid class name and case insensitive filesystem */
    public static final class C40902 extends n implements p {
        final /* synthetic */ ByteBuffer $delimiter;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40902(ByteBuffer byteBuffer, zu.d<? super C40902> dVar) {
            super(2, dVar);
            this.$delimiter = byteBuffer;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            C40902 c40902 = new C40902(this.$delimiter, dVar);
            c40902.L$0 = obj;
            return c40902;
        }

        @Override // kv.p
        public final Object invoke(LookAheadSuspendSession lookAheadSuspendSession, zu.d<? super x0> dVar) {
            return ((C40902) create(lookAheadSuspendSession, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws IOException {
            LookAheadSuspendSession lookAheadSuspendSession;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                LookAheadSuspendSession lookAheadSuspendSession2 = (LookAheadSuspendSession) this.L$0;
                int iRemaining = this.$delimiter.remaining();
                this.L$0 = lookAheadSuspendSession2;
                this.label = 1;
                if (lookAheadSuspendSession2.awaitAtLeast(iRemaining, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                lookAheadSuspendSession = lookAheadSuspendSession2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lookAheadSuspendSession = (LookAheadSuspendSession) this.L$0;
                a0.throwOnFailure(obj);
            }
            if (DelimitedKt.tryEnsureDelimiter(lookAheadSuspendSession, this.$delimiter) == this.$delimiter.remaining()) {
                return x0.f87415a;
            }
            throw new IOException("Broken delimiter occurred");
        }
    }

    public static final Object readUntilDelimiter(ByteReadChannel byteReadChannel, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, zu.d<? super Integer> dVar) {
        int i10;
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (byteBuffer == byteBuffer2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        z0 z0Var = new z0();
        w0 w0Var = new w0();
        byteReadChannel.lookAhead(new AnonymousClass2(byteBuffer, byteBuffer2, w0Var, z0Var));
        if (z0Var.f71866b == 0 && byteReadChannel.isClosedForRead()) {
            i10 = -1;
        } else {
            if (byteBuffer2.hasRemaining() && !w0Var.f71863b) {
                return readUntilDelimiterSuspend(byteReadChannel, byteBuffer, byteBuffer2, z0Var.f71866b, dVar);
            }
            i10 = z0Var.f71866b;
        }
        return b.boxInt(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readUntilDelimiterSuspend(io.ktor.utils.io.ByteReadChannel r12, java.nio.ByteBuffer r13, java.nio.ByteBuffer r14, int r15, zu.d<? super java.lang.Integer> r16) {
        /*
            r0 = r16
            boolean r1 = r0 instanceof io.ktor.utils.io.DelimitedKt.AnonymousClass1
            if (r1 == 0) goto L16
            r1 = r0
            io.ktor.utils.io.DelimitedKt$readUntilDelimiterSuspend$1 r1 = (io.ktor.utils.io.DelimitedKt.AnonymousClass1) r1
            int r2 = r1.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r2 & r4
            if (r5 == 0) goto L16
            int r2 = r2 - r4
            r1.label = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            io.ktor.utils.io.DelimitedKt$readUntilDelimiterSuspend$1 r1 = new io.ktor.utils.io.DelimitedKt$readUntilDelimiterSuspend$1
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.result
            java.lang.Object r8 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            r9 = 2
            r10 = 1
            if (r1 == 0) goto L4b
            if (r1 == r10) goto L3b
            if (r1 != r9) goto L33
            int r1 = r7.I$0
            tu.a0.throwOnFailure(r0)
            goto L9c
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3b:
            java.lang.Object r1 = r7.L$2
            kotlin.jvm.internal.w0 r1 = (kotlin.jvm.internal.w0) r1
            java.lang.Object r2 = r7.L$1
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            java.lang.Object r3 = r7.L$0
            io.ktor.utils.io.ByteReadChannel r3 = (io.ktor.utils.io.ByteReadChannel) r3
            tu.a0.throwOnFailure(r0)
            goto L75
        L4b:
            tu.a0.throwOnFailure(r0)
            java.lang.String r0 = "Failed requirement."
            if (r13 == r14) goto Lbd
            if (r15 < 0) goto Lb7
            kotlin.jvm.internal.w0 r4 = new kotlin.jvm.internal.w0
            r4.<init>()
            io.ktor.utils.io.DelimitedKt$readUntilDelimiterSuspend$copied$1 r0 = new io.ktor.utils.io.DelimitedKt$readUntilDelimiterSuspend$copied$1
            r6 = 0
            r5 = r12
            r2 = r13
            r3 = r14
            r1 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.L$0 = r12
            r7.L$1 = r14
            r7.L$2 = r4
            r7.label = r10
            java.lang.Object r0 = r12.lookAheadSuspend(r0, r7)
            if (r0 != r8) goto L72
            goto L98
        L72:
            r3 = r12
            r2 = r14
            r1 = r4
        L75:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 <= 0) goto La9
            boolean r4 = r3.isClosedForWrite()
            if (r4 == 0) goto La9
            boolean r1 = r1.f71863b
            if (r1 != 0) goto La9
            r1 = 0
            r7.L$0 = r1
            r7.L$1 = r1
            r7.L$2 = r1
            r7.I$0 = r0
            r7.label = r9
            java.lang.Object r1 = r3.readAvailable(r2, r7)
            if (r1 != r8) goto L99
        L98:
            return r8
        L99:
            r11 = r1
            r1 = r0
            r0 = r11
        L9c:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2 = 0
            int r0 = qv.v.coerceAtLeast(r0, r2)
            int r0 = r0 + r1
            goto Lb2
        La9:
            if (r0 != 0) goto Lb2
            boolean r1 = r3.isClosedForRead()
            if (r1 == 0) goto Lb2
            r0 = -1
        Lb2:
            java.lang.Integer r0 = bv.b.boxInt(r0)
            return r0
        Lb7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        Lbd:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.DelimitedKt.readUntilDelimiterSuspend(io.ktor.utils.io.ByteReadChannel, java.nio.ByteBuffer, java.nio.ByteBuffer, int, zu.d):java.lang.Object");
    }

    public static final Object skipDelimiter(ByteReadChannel byteReadChannel, ByteBuffer byteBuffer, zu.d<? super x0> dVar) {
        Object objSkipDelimiterSuspend;
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        w0 w0Var = new w0();
        byteReadChannel.lookAhead(new C40892(w0Var, byteBuffer));
        return (w0Var.f71863b || (objSkipDelimiterSuspend = skipDelimiterSuspend(byteReadChannel, byteBuffer, dVar)) != e.getCOROUTINE_SUSPENDED()) ? x0.f87415a : objSkipDelimiterSuspend;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object skipDelimiterSuspend(ByteReadChannel byteReadChannel, ByteBuffer byteBuffer, zu.d<? super x0> dVar) {
        Object objLookAheadSuspend = byteReadChannel.lookAheadSuspend(new C40902(byteBuffer, null), dVar);
        return objLookAheadSuspend == e.getCOROUTINE_SUSPENDED() ? objLookAheadSuspend : x0.f87415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int startsWithDelimiter(LookAheadSession lookAheadSession, ByteBuffer byteBuffer) {
        ByteBuffer byteBufferRequest = lookAheadSession.request(0, 1);
        if (byteBufferRequest == null) {
            return 0;
        }
        int iIndexOfPartial = UtilsKt.indexOfPartial(byteBufferRequest, byteBuffer);
        if (iIndexOfPartial != 0) {
            return -1;
        }
        int iMin = Math.min(byteBufferRequest.remaining() - iIndexOfPartial, byteBuffer.remaining());
        int iRemaining = byteBuffer.remaining() - iMin;
        if (iRemaining > 0) {
            ByteBuffer byteBufferRequest2 = lookAheadSession.request(iIndexOfPartial + iMin, iRemaining);
            if (byteBufferRequest2 == null) {
                return iMin;
            }
            if (!UtilsKt.startsWith(byteBufferRequest2, byteBuffer, iMin)) {
                return -1;
            }
        }
        return byteBuffer.remaining();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int tryCopyUntilDelimiter(LookAheadSession lookAheadSession, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int iPutAtMost$default;
        boolean z10 = false;
        ByteBuffer byteBufferRequest = lookAheadSession.request(0, 1);
        if (byteBufferRequest == null) {
            return 0;
        }
        int iIndexOfPartial = UtilsKt.indexOfPartial(byteBufferRequest, byteBuffer);
        if (iIndexOfPartial != -1) {
            int iMin = Math.min(byteBufferRequest.remaining() - iIndexOfPartial, byteBuffer.remaining());
            int iRemaining = byteBuffer.remaining() - iMin;
            if (iRemaining == 0) {
                iPutAtMost$default = UtilsKt.putLimited(byteBuffer2, byteBufferRequest, byteBufferRequest.position() + iIndexOfPartial);
            } else {
                ByteBuffer remembered = byteBufferRequest.duplicate();
                ByteBuffer byteBufferRequest2 = lookAheadSession.request(iIndexOfPartial + iMin, 1);
                if (byteBufferRequest2 == null) {
                    e0.checkNotNullExpressionValue(remembered, "remembered");
                    iPutAtMost$default = UtilsKt.putLimited(byteBuffer2, remembered, remembered.position() + iIndexOfPartial);
                } else if (!UtilsKt.startsWith(byteBufferRequest2, byteBuffer, iMin)) {
                    e0.checkNotNullExpressionValue(remembered, "remembered");
                    iPutAtMost$default = UtilsKt.putLimited(byteBuffer2, remembered, remembered.position() + iIndexOfPartial + 1);
                } else if (byteBufferRequest2.remaining() >= iRemaining) {
                    e0.checkNotNullExpressionValue(remembered, "remembered");
                    iPutAtMost$default = UtilsKt.putLimited(byteBuffer2, remembered, remembered.position() + iIndexOfPartial);
                } else {
                    e0.checkNotNullExpressionValue(remembered, "remembered");
                    iPutAtMost$default = UtilsKt.putLimited(byteBuffer2, remembered, remembered.position() + iIndexOfPartial);
                }
            }
            z10 = true;
        } else {
            iPutAtMost$default = UtilsKt.putAtMost$default(byteBuffer2, byteBufferRequest, 0, 2, null);
        }
        lookAheadSession.mo4580consumed(iPutAtMost$default);
        return z10 ? -iPutAtMost$default : iPutAtMost$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int tryEnsureDelimiter(LookAheadSession lookAheadSession, ByteBuffer byteBuffer) throws IOException {
        int iStartsWithDelimiter = startsWithDelimiter(lookAheadSession, byteBuffer);
        if (iStartsWithDelimiter == -1) {
            throw new IOException("Failed to skip delimiter: actual bytes differ from delimiter bytes");
        }
        if (iStartsWithDelimiter < byteBuffer.remaining()) {
            return iStartsWithDelimiter;
        }
        lookAheadSession.mo4580consumed(byteBuffer.remaining());
        return byteBuffer.remaining();
    }
}
