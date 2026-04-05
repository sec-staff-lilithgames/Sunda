package io.ktor.util;

import bv.f;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.CoroutinesKt;
import io.ktor.utils.io.WriterScope;
import io.ktor.utils.io.pool.ObjectPool;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.x0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class EncodersJvmKt {
    private static final int GZIP_HEADER_SIZE = 10;
    private static final Encoder Deflate = new Encoder() { // from class: io.ktor.util.EncodersJvmKt$Deflate$1
        @Override // io.ktor.util.Encoder
        public ByteReadChannel decode(CoroutineScope coroutineScope, ByteReadChannel source) {
            e0.checkNotNullParameter(coroutineScope, "<this>");
            e0.checkNotNullParameter(source, "source");
            return EncodersJvmKt.inflate(coroutineScope, source, false);
        }

        @Override // io.ktor.util.Encoder
        public ByteReadChannel encode(CoroutineScope coroutineScope, ByteReadChannel source) {
            e0.checkNotNullParameter(coroutineScope, "<this>");
            e0.checkNotNullParameter(source, "source");
            return DeflaterKt.deflated$default(source, true, (ObjectPool) null, coroutineScope.getCoroutineContext(), 2, (Object) null);
        }
    };
    private static final Encoder GZip = new Encoder() { // from class: io.ktor.util.EncodersJvmKt$GZip$1
        @Override // io.ktor.util.Encoder
        public ByteReadChannel decode(CoroutineScope coroutineScope, ByteReadChannel source) {
            e0.checkNotNullParameter(coroutineScope, "<this>");
            e0.checkNotNullParameter(source, "source");
            return EncodersJvmKt.inflate$default(coroutineScope, source, false, 2, null);
        }

        @Override // io.ktor.util.Encoder
        public ByteReadChannel encode(CoroutineScope coroutineScope, ByteReadChannel source) {
            e0.checkNotNullParameter(coroutineScope, "<this>");
            e0.checkNotNullParameter(source, "source");
            return DeflaterKt.deflated$default(source, true, (ObjectPool) null, coroutineScope.getCoroutineContext(), 2, (Object) null);
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.util.EncodersJvmKt$inflate$1", f = "EncodersJvm.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6}, l = {TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER, 85, 161, 164, 103, 109, Sdk.SDKError.Reason.TPAT_ERROR_VALUE}, m = "invokeSuspend", n = {"$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "magic", "format", "flags", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "magic", "format", "flags", "extraLen", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "n$iv", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "totalSize", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "totalSize", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "totalSize"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "S$0", "B$0", "B$1", "L$0", "L$1", "L$2", "L$3", "L$4", "S$0", "B$0", "B$1", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    /* renamed from: io.ktor.util.EncodersJvmKt$inflate$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ boolean $gzip;
        final /* synthetic */ ByteReadChannel $source;
        byte B$0;
        byte B$1;
        int I$0;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        short S$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z10, ByteReadChannel byteReadChannel, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$gzip = z10;
            this.$source = byteReadChannel;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$gzip, this.$source, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kv.p
        public final Object invoke(WriterScope writerScope, d<? super x0> dVar) {
            return ((AnonymousClass1) create(writerScope, dVar)).invokeSuspend(x0.f87415a);
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x034b A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:7:0x0036, B:100:0x0333, B:94:0x030b, B:96:0x0311, B:101:0x034b, B:103:0x034f, B:105:0x0357, B:107:0x0377, B:110:0x037c, B:111:0x03a0, B:112:0x03a1, B:113:0x03a8, B:114:0x03a9, B:115:0x03cc, B:116:0x03cd, B:120:0x03e7, B:121:0x03ee, B:12:0x0060, B:89:0x02df, B:81:0x02ae, B:83:0x02b4, B:85:0x02ba, B:90:0x02f8, B:73:0x0270, B:75:0x0278, B:78:0x0294, B:80:0x029c, B:91:0x02fd, B:93:0x0305, B:122:0x03ef, B:15:0x0082), top: B:133:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x016b  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x01b5  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x01c4  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x01cc  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x01d6  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x01df  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x021e  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0222  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0252  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0278 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:7:0x0036, B:100:0x0333, B:94:0x030b, B:96:0x0311, B:101:0x034b, B:103:0x034f, B:105:0x0357, B:107:0x0377, B:110:0x037c, B:111:0x03a0, B:112:0x03a1, B:113:0x03a8, B:114:0x03a9, B:115:0x03cc, B:116:0x03cd, B:120:0x03e7, B:121:0x03ee, B:12:0x0060, B:89:0x02df, B:81:0x02ae, B:83:0x02b4, B:85:0x02ba, B:90:0x02f8, B:73:0x0270, B:75:0x0278, B:78:0x0294, B:80:0x029c, B:91:0x02fd, B:93:0x0305, B:122:0x03ef, B:15:0x0082), top: B:133:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x029c A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:7:0x0036, B:100:0x0333, B:94:0x030b, B:96:0x0311, B:101:0x034b, B:103:0x034f, B:105:0x0357, B:107:0x0377, B:110:0x037c, B:111:0x03a0, B:112:0x03a1, B:113:0x03a8, B:114:0x03a9, B:115:0x03cc, B:116:0x03cd, B:120:0x03e7, B:121:0x03ee, B:12:0x0060, B:89:0x02df, B:81:0x02ae, B:83:0x02b4, B:85:0x02ba, B:90:0x02f8, B:73:0x0270, B:75:0x0278, B:78:0x0294, B:80:0x029c, B:91:0x02fd, B:93:0x0305, B:122:0x03ef, B:15:0x0082), top: B:133:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x02b4 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:7:0x0036, B:100:0x0333, B:94:0x030b, B:96:0x0311, B:101:0x034b, B:103:0x034f, B:105:0x0357, B:107:0x0377, B:110:0x037c, B:111:0x03a0, B:112:0x03a1, B:113:0x03a8, B:114:0x03a9, B:115:0x03cc, B:116:0x03cd, B:120:0x03e7, B:121:0x03ee, B:12:0x0060, B:89:0x02df, B:81:0x02ae, B:83:0x02b4, B:85:0x02ba, B:90:0x02f8, B:73:0x0270, B:75:0x0278, B:78:0x0294, B:80:0x029c, B:91:0x02fd, B:93:0x0305, B:122:0x03ef, B:15:0x0082), top: B:133:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:91:0x02fd A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:7:0x0036, B:100:0x0333, B:94:0x030b, B:96:0x0311, B:101:0x034b, B:103:0x034f, B:105:0x0357, B:107:0x0377, B:110:0x037c, B:111:0x03a0, B:112:0x03a1, B:113:0x03a8, B:114:0x03a9, B:115:0x03cc, B:116:0x03cd, B:120:0x03e7, B:121:0x03ee, B:12:0x0060, B:89:0x02df, B:81:0x02ae, B:83:0x02b4, B:85:0x02ba, B:90:0x02f8, B:73:0x0270, B:75:0x0278, B:78:0x0294, B:80:0x029c, B:91:0x02fd, B:93:0x0305, B:122:0x03ef, B:15:0x0082), top: B:133:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0311 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:7:0x0036, B:100:0x0333, B:94:0x030b, B:96:0x0311, B:101:0x034b, B:103:0x034f, B:105:0x0357, B:107:0x0377, B:110:0x037c, B:111:0x03a0, B:112:0x03a1, B:113:0x03a8, B:114:0x03a9, B:115:0x03cc, B:116:0x03cd, B:120:0x03e7, B:121:0x03ee, B:12:0x0060, B:89:0x02df, B:81:0x02ae, B:83:0x02b4, B:85:0x02ba, B:90:0x02f8, B:73:0x0270, B:75:0x0278, B:78:0x0294, B:80:0x029c, B:91:0x02fd, B:93:0x0305, B:122:0x03ef, B:15:0x0082), top: B:133:0x000d }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x029a -> B:73:0x0270). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x029c -> B:81:0x02ae). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x02da -> B:89:0x02df). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x0331 -> B:100:0x0333). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.io.EOFException {
            /*
                Method dump skipped, instructions count: 1050
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.EncodersJvmKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.util.EncodersJvmKt", f = "EncodersJvm.kt", i = {0}, l = {157}, m = "inflateTo", n = {"inflated"}, s = {"I$0"})
    /* renamed from: io.ktor.util.EncodersJvmKt$inflateTo$1, reason: invalid class name and case insensitive filesystem */
    public static final class C39951 extends bv.d {
        int I$0;
        int label;
        /* synthetic */ Object result;

        public C39951(d<? super C39951> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EncodersJvmKt.inflateTo(null, null, null, null, this);
        }
    }

    public static final Encoder getDeflate() {
        return Deflate;
    }

    public static final Encoder getGZip() {
        return GZip;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean has(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteReadChannel inflate(CoroutineScope coroutineScope, ByteReadChannel byteReadChannel, boolean z10) {
        return CoroutinesKt.writer$default(coroutineScope, (m) null, false, (p) new AnonymousClass1(z10, byteReadChannel, null), 3, (Object) null).getChannel();
    }

    public static /* synthetic */ ByteReadChannel inflate$default(CoroutineScope coroutineScope, ByteReadChannel byteReadChannel, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return inflate(coroutineScope, byteReadChannel, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object inflateTo(java.util.zip.Inflater r5, io.ktor.utils.io.ByteWriteChannel r6, java.nio.ByteBuffer r7, java.util.zip.Checksum r8, zu.d<? super java.lang.Integer> r9) throws java.util.zip.DataFormatException {
        /*
            boolean r0 = r9 instanceof io.ktor.util.EncodersJvmKt.C39951
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.util.EncodersJvmKt$inflateTo$1 r0 = (io.ktor.util.EncodersJvmKt.C39951) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.util.EncodersJvmKt$inflateTo$1 r0 = new io.ktor.util.EncodersJvmKt$inflateTo$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r5 = r0.I$0
            tu.a0.throwOnFailure(r9)
            goto L62
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            tu.a0.throwOnFailure(r9)
            r7.clear()
            byte[] r9 = r7.array()
            int r2 = r7.position()
            int r4 = r7.remaining()
            int r5 = r5.inflate(r9, r2, r4)
            int r9 = r7.position()
            int r9 = r9 + r5
            r7.position(r9)
            r7.flip()
            io.ktor.util.DeflaterKt.updateKeepPosition(r8, r7)
            r0.I$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.writeFully(r7, r0)
            if (r6 != r1) goto L62
            return r1
        L62:
            java.lang.Integer r5 = bv.b.boxInt(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.EncodersJvmKt.inflateTo(java.util.zip.Inflater, io.ktor.utils.io.ByteWriteChannel, java.nio.ByteBuffer, java.util.zip.Checksum, zu.d):java.lang.Object");
    }
}
