package com.moloco.sdk.internal.publisher;

import android.util.Base64;
import com.moloco.sdk.internal.MolocoLogger;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a0 implements c0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.n implements kv.p {

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f46228j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, zu.d<? super b> dVar) {
            super(2, dVar);
            this.f46228j = str;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super String> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return a0.this.new b(this.f46228j, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws IOException {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.debug$default(molocoLogger, "Base64GzippedBidProcessor", "Starting bid response pre-process with base64 decode and gunzip", false, 4, null);
            String strA = a0.this.a(this.f46228j);
            MolocoLogger.debug$default(molocoLogger, "Base64GzippedBidProcessor", a.b.k("Processed bidresponse: ", strA), false, 4, null);
            return strA;
        }
    }

    static {
        new a(null);
    }

    @Override // com.moloco.sdk.internal.publisher.c0
    public Object a(String str, zu.d<? super String> dVar) {
        return BuildersKt.withContext(com.moloco.sdk.internal.scheduling.c.a().getDefault(), new b(str, null), dVar);
    }

    public final String a(String str) throws IOException {
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "Base64GzippedBidProcessor", "Base64 decoded bidresponse: " + bArrDecode, false, 4, null);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrDecode);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 2048);
            StringBuilder sb2 = new StringBuilder();
            byte[] bArr = new byte[2048];
            while (true) {
                try {
                    try {
                        int i10 = gZIPInputStream.read(bArr);
                        if (i10 != -1) {
                            sb2.append(new String(bArr, 0, i10, sv.g.f86134b));
                        } else {
                            byteArrayInputStream.close();
                            gZIPInputStream.close();
                            return sb2.toString();
                        }
                    } catch (Exception unused) {
                        MolocoLogger.warn$default(MolocoLogger.INSTANCE, "Base64GzippedBidProcessor", "Failed to unzip bidresponse, perhaps a non-gzipped response", null, false, 12, null);
                        byteArrayInputStream.close();
                        gZIPInputStream.close();
                        return null;
                    }
                } catch (Throwable th2) {
                    byteArrayInputStream.close();
                    gZIPInputStream.close();
                    throw th2;
                }
            }
        } catch (Exception unused2) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "Base64GzippedBidProcessor", "Failed to base64 decode bidresponse, perhpas a non-base64 encoded response", null, false, 12, null);
            return null;
        }
    }
}
