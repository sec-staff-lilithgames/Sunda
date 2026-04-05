package com.unity3d.services.core.network.core;

import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;
import xv.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class RefactoredOkHttp3Client$execute$2$1 extends f0 implements l {
    final /* synthetic */ j $call;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefactoredOkHttp3Client$execute$2$1(j jVar) {
        super(1);
        this.$call = jVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return x0.f87415a;
    }

    public final void invoke(Throwable th2) {
        this.$call.cancel();
    }
}
