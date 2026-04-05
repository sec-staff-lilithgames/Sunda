package io.ktor.util.cio;

import bv.d;
import bv.f;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ReadersKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.util.cio.ReadersKt", f = "Readers.kt", i = {}, l = {15}, m = "toByteArray", n = {}, s = {})
    /* renamed from: io.ktor.util.cio.ReadersKt$toByteArray$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReadersKt.toByteArray(null, 0, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object toByteArray(io.ktor.utils.io.ByteReadChannel r4, int r5, zu.d<? super byte[]> r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.util.cio.ReadersKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.util.cio.ReadersKt$toByteArray$1 r0 = (io.ktor.util.cio.ReadersKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.util.cio.ReadersKt$toByteArray$1 r0 = new io.ktor.util.cio.ReadersKt$toByteArray$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r6)
            goto L3e
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            tu.a0.throwOnFailure(r6)
            long r5 = (long) r5
            r0.label = r3
            java.lang.Object r6 = r4.readRemaining(r5, r0)
            if (r6 != r1) goto L3e
            return r1
        L3e:
            io.ktor.utils.io.core.ByteReadPacket r6 = (io.ktor.utils.io.core.ByteReadPacket) r6
            r4 = 0
            r5 = 0
            byte[] r4 = io.ktor.utils.io.core.StringsKt.readBytes$default(r6, r4, r3, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.cio.ReadersKt.toByteArray(io.ktor.utils.io.ByteReadChannel, int, zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object toByteArray$default(ByteReadChannel byteReadChannel, int i10, zu.d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return toByteArray(byteReadChannel, i10, dVar);
    }

    public static final void use(ByteWriteChannel byteWriteChannel, l block) {
        e0.checkNotNullParameter(byteWriteChannel, "<this>");
        e0.checkNotNullParameter(block, "block");
        try {
            block.invoke(byteWriteChannel);
        } finally {
        }
    }
}
