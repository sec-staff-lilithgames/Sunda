package com.unity3d.services.core.domain.task;

import bv.f;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import com.vungle.ads.internal.ui.AdActivity;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.x0;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2", f = "InitializeStateLoadWeb.kt", i = {0, 0, 1}, l = {46, 64, TokenParametersOuterClass$TokenParameters.ODT_FIELD_NUMBER}, m = "invokeSuspend", n = {"$this$withContext", AdActivity.REQUEST_KEY_EXTRA, AdActivity.REQUEST_KEY_EXTRA}, s = {"L$0", "L$3", "L$2"})
/* loaded from: classes8.dex */
public final class InitializeStateLoadWeb$doWork$2 extends n implements p {
    final /* synthetic */ InitializeStateLoadWeb.Params $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InitializeStateLoadWeb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadWeb$doWork$2(InitializeStateLoadWeb.Params params, InitializeStateLoadWeb initializeStateLoadWeb, d<? super InitializeStateLoadWeb$doWork$2> dVar) {
        super(2, dVar);
        this.$params = params;
        this.this$0 = initializeStateLoadWeb;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        InitializeStateLoadWeb$doWork$2 initializeStateLoadWeb$doWork$2 = new InitializeStateLoadWeb$doWork$2(this.$params, this.this$0, dVar);
        initializeStateLoadWeb$doWork$2.L$0 = obj;
        return initializeStateLoadWeb$doWork$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x017b, code lost:
    
        if (r0 == r8) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0127 A[Catch: all -> 0x004c, TRY_ENTER, TryCatch #3 {all -> 0x004c, blocks: (B:17:0x003f, B:42:0x0146, B:39:0x0127), top: B:79:0x000e, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015f A[Catch: all -> 0x0022, CancellationException -> 0x0025, TryCatch #5 {CancellationException -> 0x0025, all -> 0x0022, blocks: (B:8:0x001a, B:50:0x017e, B:54:0x01a1, B:56:0x01ab, B:59:0x01b6, B:60:0x01c8, B:62:0x01cb, B:63:0x01d7, B:45:0x0159, B:47:0x015f, B:51:0x0181, B:52:0x0193, B:44:0x014f, B:37:0x0121, B:53:0x0194, B:36:0x0117, B:27:0x0077, B:17:0x003f, B:42:0x0146, B:39:0x0127), top: B:79:0x000e, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0181 A[Catch: all -> 0x0022, CancellationException -> 0x0025, TryCatch #5 {CancellationException -> 0x0025, all -> 0x0022, blocks: (B:8:0x001a, B:50:0x017e, B:54:0x01a1, B:56:0x01ab, B:59:0x01b6, B:60:0x01c8, B:62:0x01cb, B:63:0x01d7, B:45:0x0159, B:47:0x015f, B:51:0x0181, B:52:0x0193, B:44:0x014f, B:37:0x0121, B:53:0x0194, B:36:0x0117, B:27:0x0077, B:17:0x003f, B:42:0x0146, B:39:0x0127), top: B:79:0x000e, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0194 A[Catch: all -> 0x0022, CancellationException -> 0x0025, TryCatch #5 {CancellationException -> 0x0025, all -> 0x0022, blocks: (B:8:0x001a, B:50:0x017e, B:54:0x01a1, B:56:0x01ab, B:59:0x01b6, B:60:0x01c8, B:62:0x01cb, B:63:0x01d7, B:45:0x0159, B:47:0x015f, B:51:0x0181, B:52:0x0193, B:44:0x014f, B:37:0x0121, B:53:0x0194, B:36:0x0117, B:27:0x0077, B:17:0x003f, B:42:0x0146, B:39:0x0127), top: B:79:0x000e, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cb A[Catch: all -> 0x0022, CancellationException -> 0x0025, TryCatch #5 {CancellationException -> 0x0025, all -> 0x0022, blocks: (B:8:0x001a, B:50:0x017e, B:54:0x01a1, B:56:0x01ab, B:59:0x01b6, B:60:0x01c8, B:62:0x01cb, B:63:0x01d7, B:45:0x0159, B:47:0x015f, B:51:0x0181, B:52:0x0193, B:44:0x014f, B:37:0x0121, B:53:0x0194, B:36:0x0117, B:27:0x0077, B:17:0x003f, B:42:0x0146, B:39:0x0127), top: B:79:0x000e, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fa  */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25, types: [com.unity3d.services.core.network.model.HttpRequest] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.unity3d.services.core.network.model.HttpRequest] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super z> dVar) {
        return ((InitializeStateLoadWeb$doWork$2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
