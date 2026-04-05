package com.unity3d.services.core.domain.task;

import bv.f;
import bv.n;
import com.unity3d.services.core.domain.task.InitializeStateReset;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.x0;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2", f = "InitializeStateReset.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class InitializeStateReset$doWork$2 extends n implements p {
    final /* synthetic */ InitializeStateReset.Params $params;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InitializeStateReset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateReset$doWork$2(InitializeStateReset.Params params, InitializeStateReset initializeStateReset, d<? super InitializeStateReset$doWork$2> dVar) {
        super(2, dVar);
        this.$params = params;
        this.this$0 = initializeStateReset;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new InitializeStateReset$doWork$2(this.$params, this.this$0, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0080 A[Catch: all -> 0x0018, CancellationException -> 0x001b, TryCatch #2 {CancellationException -> 0x001b, all -> 0x0018, blocks: (B:6:0x0014, B:26:0x0063, B:31:0x0071, B:33:0x0080, B:35:0x0086, B:37:0x0094, B:38:0x0096, B:40:0x0099, B:42:0x00a5, B:43:0x00b0, B:44:0x00b3, B:45:0x00bc, B:46:0x00c3, B:47:0x00c4, B:48:0x00cb, B:29:0x0069, B:30:0x0070, B:15:0x002d, B:17:0x003a, B:19:0x003f, B:22:0x0047), top: B:59:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4 A[Catch: all -> 0x0018, CancellationException -> 0x001b, TryCatch #2 {CancellationException -> 0x001b, all -> 0x0018, blocks: (B:6:0x0014, B:26:0x0063, B:31:0x0071, B:33:0x0080, B:35:0x0086, B:37:0x0094, B:38:0x0096, B:40:0x0099, B:42:0x00a5, B:43:0x00b0, B:44:0x00b3, B:45:0x00bc, B:46:0x00c3, B:47:0x00c4, B:48:0x00cb, B:29:0x0069, B:30:0x0070, B:15:0x002d, B:17:0x003a, B:19:0x003f, B:22:0x0047), top: B:59:0x0008 }] */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super z> dVar) {
        return ((InitializeStateReset$doWork$2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
