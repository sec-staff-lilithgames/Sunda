package com.unity3d.services.core.domain.task;

import bv.f;
import bv.n;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.x0;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2", f = "InitializeStateConfigWithLoader.kt", i = {0, 0, 0, 1, 1, 2}, l = {58, 101, 109}, m = "invokeSuspend", n = {"$this$withContext", "configurationLoader", DTBMetricsConfiguration.CONFIG_DIR, "configurationLoader", DTBMetricsConfiguration.CONFIG_DIR, DTBMetricsConfiguration.CONFIG_DIR}, s = {"L$0", "L$3", "L$4", "L$2", "L$3", "L$0"})
/* loaded from: classes8.dex */
public final class InitializeStateConfigWithLoader$doWork$2 extends n implements p {
    final /* synthetic */ InitializeStateConfigWithLoader.Params $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ InitializeStateConfigWithLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfigWithLoader$doWork$2(InitializeStateConfigWithLoader initializeStateConfigWithLoader, InitializeStateConfigWithLoader.Params params, d<? super InitializeStateConfigWithLoader$doWork$2> dVar) {
        super(2, dVar);
        this.this$0 = initializeStateConfigWithLoader;
        this.$params = params;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        InitializeStateConfigWithLoader$doWork$2 initializeStateConfigWithLoader$doWork$2 = new InitializeStateConfigWithLoader$doWork$2(this.this$0, this.$params, dVar);
        initializeStateConfigWithLoader$doWork$2.L$0 = obj;
        return initializeStateConfigWithLoader$doWork$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x016a A[Catch: all -> 0x0024, CancellationException -> 0x0027, TRY_LEAVE, TryCatch #6 {CancellationException -> 0x0027, all -> 0x0024, blocks: (B:8:0x001f, B:56:0x01e0, B:62:0x0211, B:50:0x01ae, B:52:0x01b4, B:57:0x01ea, B:58:0x01fc, B:49:0x01a3, B:37:0x0164, B:39:0x016a, B:59:0x01fd, B:60:0x020a, B:61:0x020b, B:36:0x0159, B:27:0x0086), top: B:82:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b4 A[Catch: all -> 0x0024, CancellationException -> 0x0027, TryCatch #6 {CancellationException -> 0x0027, all -> 0x0024, blocks: (B:8:0x001f, B:56:0x01e0, B:62:0x0211, B:50:0x01ae, B:52:0x01b4, B:57:0x01ea, B:58:0x01fc, B:49:0x01a3, B:37:0x0164, B:39:0x016a, B:59:0x01fd, B:60:0x020a, B:61:0x020b, B:36:0x0159, B:27:0x0086), top: B:82:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ea A[Catch: all -> 0x0024, CancellationException -> 0x0027, TryCatch #6 {CancellationException -> 0x0027, all -> 0x0024, blocks: (B:8:0x001f, B:56:0x01e0, B:62:0x0211, B:50:0x01ae, B:52:0x01b4, B:57:0x01ea, B:58:0x01fc, B:49:0x01a3, B:37:0x0164, B:39:0x016a, B:59:0x01fd, B:60:0x020a, B:61:0x020b, B:36:0x0159, B:27:0x0086), top: B:82:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x020b A[Catch: all -> 0x0024, CancellationException -> 0x0027, TryCatch #6 {CancellationException -> 0x0027, all -> 0x0024, blocks: (B:8:0x001f, B:56:0x01e0, B:62:0x0211, B:50:0x01ae, B:52:0x01b4, B:57:0x01ea, B:58:0x01fc, B:49:0x01a3, B:37:0x0164, B:39:0x016a, B:59:0x01fd, B:60:0x020a, B:61:0x020b, B:36:0x0159, B:27:0x0086), top: B:82:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0231  */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super z> dVar) {
        return ((InitializeStateConfigWithLoader$doWork$2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
