package io.ktor.utils.io;

import av.e;
import bv.d;
import bv.f;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import io.ktor.utils.io.core.ByteOrder;
import io.ktor.utils.io.core.BytePacketBuilder;
import io.ktor.utils.io.core.ByteReadPacket;
import io.ktor.utils.io.core.StringsKt;
import java.nio.charset.Charset;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ByteWriteChannelKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteWriteChannelKt", f = "ByteWriteChannel.kt", i = {0}, l = {202, 202}, m = "writePacketSuspend", n = {"builder$iv"}, s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ByteWriteChannelKt$writePacketSuspend$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
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
            return ByteWriteChannelKt.writePacketSuspend(null, null, this);
        }
    }

    public static final boolean close(ByteWriteChannel byteWriteChannel) {
        e0.checkNotNullParameter(byteWriteChannel, "<this>");
        return byteWriteChannel.close(null);
    }

    public static final Object writeAvailable(ByteWriteChannel byteWriteChannel, byte[] bArr, zu.d<? super Integer> dVar) {
        return byteWriteChannel.writeAvailable(bArr, 0, bArr.length, dVar);
    }

    public static final Object writeBoolean(ByteWriteChannel byteWriteChannel, boolean z10, zu.d<? super x0> dVar) {
        Object objWriteByte = byteWriteChannel.writeByte(z10 ? (byte) 1 : (byte) 0, dVar);
        return objWriteByte == e.getCOROUTINE_SUSPENDED() ? objWriteByte : x0.f87415a;
    }

    public static final Object writeByte(ByteWriteChannel byteWriteChannel, int i10, zu.d<? super x0> dVar) {
        Object objWriteByte = byteWriteChannel.writeByte((byte) (i10 & 255), dVar);
        return objWriteByte == e.getCOROUTINE_SUSPENDED() ? objWriteByte : x0.f87415a;
    }

    public static final Object writeChar(ByteWriteChannel byteWriteChannel, char c10, zu.d<? super x0> dVar) {
        Object objWriteShort = writeShort(byteWriteChannel, c10, dVar);
        return objWriteShort == e.getCOROUTINE_SUSPENDED() ? objWriteShort : x0.f87415a;
    }

    public static final Object writeFully(ByteWriteChannel byteWriteChannel, byte[] bArr, zu.d<? super x0> dVar) {
        Object objWriteFully = byteWriteChannel.writeFully(bArr, 0, bArr.length, dVar);
        return objWriteFully == e.getCOROUTINE_SUSPENDED() ? objWriteFully : x0.f87415a;
    }

    public static final Object writeInt(ByteWriteChannel byteWriteChannel, long j10, zu.d<? super x0> dVar) {
        Object objWriteInt = byteWriteChannel.writeInt((int) j10, dVar);
        return objWriteInt == e.getCOROUTINE_SUSPENDED() ? objWriteInt : x0.f87415a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object writePacket(ByteWriteChannel byteWriteChannel, l lVar, zu.d<? super x0> dVar) {
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, 0 == true ? 1 : 0);
        try {
            lVar.invoke(bytePacketBuilder);
            Object objWritePacket = byteWriteChannel.writePacket(bytePacketBuilder.build(), dVar);
            return objWritePacket == e.getCOROUTINE_SUSPENDED() ? objWritePacket : x0.f87415a;
        } catch (Throwable th2) {
            bytePacketBuilder.release();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Object writePacket$$forInline(ByteWriteChannel byteWriteChannel, l lVar, zu.d<? super x0> dVar) {
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, 0 == true ? 1 : 0);
        try {
            lVar.invoke(bytePacketBuilder);
            ByteReadPacket byteReadPacketBuild = bytePacketBuilder.build();
            b0.mark(0);
            byteWriteChannel.writePacket(byteReadPacketBuild, dVar);
            b0.mark(1);
            return x0.f87415a;
        } catch (Throwable th2) {
            bytePacketBuilder.release();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        if (r6.writePacket(r7, r0) == r1) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object writePacketSuspend(io.ktor.utils.io.ByteWriteChannel r6, kv.p r7, zu.d<? super tu.x0> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof io.ktor.utils.io.ByteWriteChannelKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.ByteWriteChannelKt$writePacketSuspend$1 r0 = (io.ktor.utils.io.ByteWriteChannelKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteWriteChannelKt$writePacketSuspend$1 r0 = new io.ktor.utils.io.ByteWriteChannelKt$writePacketSuspend$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            tu.a0.throwOnFailure(r8)
            goto L6a
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            java.lang.Object r6 = r0.L$1
            io.ktor.utils.io.ByteWriteChannel r6 = (io.ktor.utils.io.ByteWriteChannel) r6
            java.lang.Object r7 = r0.L$0
            io.ktor.utils.io.core.BytePacketBuilder r7 = (io.ktor.utils.io.core.BytePacketBuilder) r7
            tu.a0.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L41
            goto L59
        L41:
            r6 = move-exception
            goto L6f
        L43:
            tu.a0.throwOnFailure(r8)
            io.ktor.utils.io.core.BytePacketBuilder r8 = new io.ktor.utils.io.core.BytePacketBuilder
            r8.<init>(r5, r4, r5)
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L6d
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L6d
            r0.label = r4     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r7 = r7.invoke(r8, r0)     // Catch: java.lang.Throwable -> L6d
            if (r7 != r1) goto L58
            goto L69
        L58:
            r7 = r8
        L59:
            io.ktor.utils.io.core.ByteReadPacket r7 = r7.build()     // Catch: java.lang.Throwable -> L41
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r6.writePacket(r7, r0)
            if (r6 != r1) goto L6a
        L69:
            return r1
        L6a:
            tu.x0 r6 = tu.x0.f87415a
            return r6
        L6d:
            r6 = move-exception
            r7 = r8
        L6f:
            r7.release()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteWriteChannelKt.writePacketSuspend(io.ktor.utils.io.ByteWriteChannel, kv.p, zu.d):java.lang.Object");
    }

    public static final Object writeShort(ByteWriteChannel byteWriteChannel, int i10, zu.d<? super x0> dVar) {
        Object objWriteShort = byteWriteChannel.writeShort((short) (i10 & Settings.DEFAULT_INITIAL_WINDOW_SIZE), dVar);
        return objWriteShort == e.getCOROUTINE_SUSPENDED() ? objWriteShort : x0.f87415a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object writeStringUtf8(ByteWriteChannel byteWriteChannel, CharSequence charSequence, zu.d<? super x0> dVar) {
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, 0 == true ? 1 : 0);
        try {
            StringsKt.writeText$default(bytePacketBuilder, charSequence, 0, 0, (Charset) null, 14, (Object) null);
            Object objWritePacket = byteWriteChannel.writePacket(bytePacketBuilder.build(), dVar);
            return objWritePacket == e.getCOROUTINE_SUSPENDED() ? objWritePacket : x0.f87415a;
        } catch (Throwable th2) {
            bytePacketBuilder.release();
            throw th2;
        }
    }

    public static final Object writeInt(ByteWriteChannel byteWriteChannel, long j10, ByteOrder byteOrder, zu.d<? super x0> dVar) {
        Object objWriteInt = ChannelLittleEndianKt.writeInt(byteWriteChannel, (int) j10, byteOrder, dVar);
        return objWriteInt == e.getCOROUTINE_SUSPENDED() ? objWriteInt : x0.f87415a;
    }

    public static final Object writeShort(ByteWriteChannel byteWriteChannel, int i10, ByteOrder byteOrder, zu.d<? super x0> dVar) {
        Object objWriteShort = ChannelLittleEndianKt.writeShort(byteWriteChannel, (short) (i10 & Settings.DEFAULT_INITIAL_WINDOW_SIZE), byteOrder, dVar);
        return objWriteShort == e.getCOROUTINE_SUSPENDED() ? objWriteShort : x0.f87415a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object writeStringUtf8(ByteWriteChannel byteWriteChannel, String str, zu.d<? super x0> dVar) {
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, 0 == true ? 1 : 0);
        try {
            StringsKt.writeText$default(bytePacketBuilder, str, 0, 0, (Charset) null, 14, (Object) null);
            Object objWritePacket = byteWriteChannel.writePacket(bytePacketBuilder.build(), dVar);
            return objWritePacket == e.getCOROUTINE_SUSPENDED() ? objWritePacket : x0.f87415a;
        } catch (Throwable th2) {
            bytePacketBuilder.release();
            throw th2;
        }
    }
}
