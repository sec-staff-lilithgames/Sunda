package io.ktor.websocket;

import bv.f;
import bv.n;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.websocket.RawWebSocketCommon$writerJob$1", f = "RawWebSocketCommon.kt", i = {1}, l = {58, 60}, m = "invokeSuspend", n = {PglCryptUtils.KEY_MESSAGE}, s = {"L$0"})
/* loaded from: classes10.dex */
public final class RawWebSocketCommon$writerJob$1 extends n implements p {
    Object L$0;
    int label;
    final /* synthetic */ RawWebSocketCommon this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RawWebSocketCommon$writerJob$1(RawWebSocketCommon rawWebSocketCommon, d<? super RawWebSocketCommon$writerJob$1> dVar) {
        super(2, dVar);
        this.this$0 = rawWebSocketCommon;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new RawWebSocketCommon$writerJob$1(this.this$0, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d A[Catch: all -> 0x0017, ChannelWriteException -> 0x001a, PHI: r9
      0x003d: PHI (r9v15 java.lang.Object) = (r9v20 java.lang.Object), (r9v0 java.lang.Object) binds: [B:19:0x003a, B:15:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0017, blocks: (B:7:0x0013, B:27:0x005c, B:18:0x002c, B:21:0x003d, B:23:0x0041, B:31:0x0089, B:33:0x008d, B:34:0x0093, B:35:0x00a9, B:29:0x0069, B:15:0x0025), top: B:50:0x000b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041 A[Catch: all -> 0x0017, ChannelWriteException -> 0x001a, TryCatch #1 {all -> 0x0017, blocks: (B:7:0x0013, B:27:0x005c, B:18:0x002c, B:21:0x003d, B:23:0x0041, B:31:0x0089, B:33:0x008d, B:34:0x0093, B:35:0x00a9, B:29:0x0069, B:15:0x0025), top: B:50:0x000b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069 A[Catch: all -> 0x0017, ChannelWriteException -> 0x001a, TRY_LEAVE, TryCatch #1 {all -> 0x0017, blocks: (B:7:0x0013, B:27:0x005c, B:18:0x002c, B:21:0x003d, B:23:0x0041, B:31:0x0089, B:33:0x008d, B:34:0x0093, B:35:0x00a9, B:29:0x0069, B:15:0x0025), top: B:50:0x000b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089 A[Catch: all -> 0x0017, ChannelWriteException -> 0x001a, TRY_ENTER, TryCatch #1 {all -> 0x0017, blocks: (B:7:0x0013, B:27:0x005c, B:18:0x002c, B:21:0x003d, B:23:0x0041, B:31:0x0089, B:33:0x008d, B:34:0x0093, B:35:0x00a9, B:29:0x0069, B:15:0x0025), top: B:50:0x000b, outer: #0 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005b -> B:27:0x005c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x008d -> B:18:0x002c). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.RawWebSocketCommon$writerJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
        return ((RawWebSocketCommon$writerJob$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
