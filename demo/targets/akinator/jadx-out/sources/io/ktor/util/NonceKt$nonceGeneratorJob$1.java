package io.ktor.util;

import bv.f;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.util.NonceKt$nonceGeneratorJob$1", f = "Nonce.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER}, m = "invokeSuspend", n = {"seedChannel", "previousRoundNonceList", "secureInstance", "weakRandom", "secureBytes", "weakBytes", "randomNonceList", "lastReseed", "index"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "I$0"})
/* loaded from: classes8.dex */
public final class NonceKt$nonceGeneratorJob$1 extends n implements p {
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;

    public NonceKt$nonceGeneratorJob$1(d<? super NonceKt$nonceGeneratorJob$1> dVar) {
        super(2, dVar);
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new NonceKt$nonceGeneratorJob$1(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007e A[Catch: all -> 0x0040, LOOP:1: B:14:0x007c->B:15:0x007e, LOOP_END, TryCatch #0 {all -> 0x0040, blocks: (B:6:0x002f, B:25:0x00f7, B:22:0x00d6, B:26:0x00f9, B:28:0x0108, B:13:0x0073, B:15:0x007e, B:16:0x0087, B:18:0x0093, B:20:0x00a4, B:19:0x00a1), top: B:38:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:6:0x002f, B:25:0x00f7, B:22:0x00d6, B:26:0x00f9, B:28:0x0108, B:13:0x0073, B:15:0x007e, B:16:0x0087, B:18:0x0093, B:20:0x00a4, B:19:0x00a1), top: B:38:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a1 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:6:0x002f, B:25:0x00f7, B:22:0x00d6, B:26:0x00f9, B:28:0x0108, B:13:0x0073, B:15:0x007e, B:16:0x0087, B:18:0x0093, B:20:0x00a4, B:19:0x00a1), top: B:38:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d6 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:6:0x002f, B:25:0x00f7, B:22:0x00d6, B:26:0x00f9, B:28:0x0108, B:13:0x0073, B:15:0x007e, B:16:0x0087, B:18:0x0093, B:20:0x00a4, B:19:0x00a1), top: B:38:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:6:0x002f, B:25:0x00f7, B:22:0x00d6, B:26:0x00f9, B:28:0x0108, B:13:0x0073, B:15:0x007e, B:16:0x0087, B:18:0x0093, B:20:0x00a4, B:19:0x00a1), top: B:38:0x002f }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00f4 -> B:25:0x00f7). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.security.NoSuchAlgorithmException {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.NonceKt$nonceGeneratorJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
        return ((NonceKt$nonceGeneratorJob$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
