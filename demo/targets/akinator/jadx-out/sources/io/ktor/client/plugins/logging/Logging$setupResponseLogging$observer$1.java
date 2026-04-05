package io.ktor.client.plugins.logging;

import bv.f;
import bv.n;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.client.statement.HttpResponse;
import kv.p;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.plugins.logging.Logging$setupResponseLogging$observer$1", f = "Logging.kt", i = {0, 0, 1, 3, 5}, l = {Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE}, m = "invokeSuspend", n = {"logger", "log", "logger", "logger", "logger"}, s = {"L$0", "L$1", "L$0", "L$0", "L$0"})
/* loaded from: classes7.dex */
public final class Logging$setupResponseLogging$observer$1 extends n implements p {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Logging this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Logging$setupResponseLogging$observer$1(Logging logging, d<? super Logging$setupResponseLogging$observer$1> dVar) {
        super(2, dVar);
        this.this$0 = logging;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        Logging$setupResponseLogging$observer$1 logging$setupResponseLogging$observer$1 = new Logging$setupResponseLogging$observer$1(this.this$0, dVar);
        logging$setupResponseLogging$observer$1.L$0 = obj;
        return logging$setupResponseLogging$observer$1;
    }

    @Override // kv.p
    public final Object invoke(HttpResponse httpResponse, d<? super x0> dVar) {
        return ((Logging$setupResponseLogging$observer$1) create(httpResponse, dVar)).invokeSuspend(x0.f87415a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d4 A[PHI: r1
      0x00d4: PHI (r1v16 io.ktor.client.plugins.logging.HttpClientCallLogger) = 
      (r1v11 io.ktor.client.plugins.logging.HttpClientCallLogger)
      (r1v18 io.ktor.client.plugins.logging.HttpClientCallLogger)
     binds: [B:29:0x00d1, B:14:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd A[PHI: r1
      0x00fd: PHI (r1v19 io.ktor.client.plugins.logging.HttpClientCallLogger) = 
      (r1v10 io.ktor.client.plugins.logging.HttpClientCallLogger)
      (r1v21 io.ktor.client.plugins.logging.HttpClientCallLogger)
     binds: [B:35:0x00fa, B:12:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0108 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0109 A[RETURN] */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.logging.Logging$setupResponseLogging$observer$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
