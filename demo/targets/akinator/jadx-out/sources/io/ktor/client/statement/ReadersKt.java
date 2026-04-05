package io.ktor.client.statement;

import av.e;
import bv.d;
import bv.f;
import io.ktor.utils.io.ByteReadChannelKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ReadersKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.statement.ReadersKt", f = "Readers.kt", i = {}, l = {16}, m = "readBytes", n = {}, s = {})
    /* renamed from: io.ktor.client.statement.ReadersKt$readBytes$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReadersKt.readBytes(null, 0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.statement.ReadersKt", f = "Readers.kt", i = {}, l = {24}, m = "readBytes", n = {}, s = {})
    /* renamed from: io.ktor.client.statement.ReadersKt$readBytes$3, reason: invalid class name */
    public static final class AnonymousClass3 extends d {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass3(zu.d<? super AnonymousClass3> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReadersKt.readBytes(null, this);
        }
    }

    public static final Object discardRemaining(HttpResponse httpResponse, zu.d<? super x0> dVar) {
        Object objDiscard = ByteReadChannelKt.discard(httpResponse.getContent(), dVar);
        return objDiscard == e.getCOROUTINE_SUSPENDED() ? objDiscard : x0.f87415a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readBytes(io.ktor.client.statement.HttpResponse r4, int r5, zu.d<? super byte[]> r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.client.statement.ReadersKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.statement.ReadersKt$readBytes$1 r0 = (io.ktor.client.statement.ReadersKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.statement.ReadersKt$readBytes$1 r0 = new io.ktor.client.statement.ReadersKt$readBytes$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            byte[] r4 = (byte[]) r4
            tu.a0.throwOnFailure(r6)
            return r4
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            tu.a0.throwOnFailure(r6)
            byte[] r5 = new byte[r5]
            io.ktor.utils.io.ByteReadChannel r4 = r4.getContent()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = io.ktor.utils.io.ByteReadChannelKt.readFully(r4, r5, r0)
            if (r4 != r1) goto L49
            return r1
        L49:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.statement.ReadersKt.readBytes(io.ktor.client.statement.HttpResponse, int, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readBytes(io.ktor.client.statement.HttpResponse r8, zu.d<? super byte[]> r9) {
        /*
            boolean r0 = r9 instanceof io.ktor.client.statement.ReadersKt.AnonymousClass3
            if (r0 == 0) goto L14
            r0 = r9
            io.ktor.client.statement.ReadersKt$readBytes$3 r0 = (io.ktor.client.statement.ReadersKt.AnonymousClass3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            io.ktor.client.statement.ReadersKt$readBytes$3 r0 = new io.ktor.client.statement.ReadersKt$readBytes$3
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.result
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r7 = 1
            if (r1 == 0) goto L33
            if (r1 != r7) goto L2b
            tu.a0.throwOnFailure(r9)
            goto L47
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            tu.a0.throwOnFailure(r9)
            io.ktor.utils.io.ByteReadChannel r1 = r8.getContent()
            r4.label = r7
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r9 = io.ktor.utils.io.ByteReadChannel.DefaultImpls.readRemaining$default(r1, r2, r4, r5, r6)
            if (r9 != r0) goto L47
            return r0
        L47:
            io.ktor.utils.io.core.ByteReadPacket r9 = (io.ktor.utils.io.core.ByteReadPacket) r9
            r8 = 0
            r0 = 0
            byte[] r8 = io.ktor.utils.io.core.StringsKt.readBytes$default(r9, r8, r7, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.statement.ReadersKt.readBytes(io.ktor.client.statement.HttpResponse, zu.d):java.lang.Object");
    }
}
