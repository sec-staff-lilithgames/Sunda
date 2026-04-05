package com.unity3d.services.core.domain.task;

import av.e;
import bv.f;
import bv.n;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import kotlin.jvm.internal.e0;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$2$1$1", f = "InitializeStateComplete.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class InitializeStateComplete$doWork$2$1$1 extends n implements p {
    /* synthetic */ Object L$0;
    int label;

    public InitializeStateComplete$doWork$2$1$1(d<? super InitializeStateComplete$doWork$2$1$1> dVar) {
        super(2, dVar);
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        InitializeStateComplete$doWork$2$1$1 initializeStateComplete$doWork$2$1$1 = new InitializeStateComplete$doWork$2$1$1(dVar);
        initializeStateComplete$doWork$2$1$1.L$0 = obj;
        return initializeStateComplete$doWork$2$1$1;
    }

    @Override // kv.p
    public final Object invoke(ByteStringStoreOuterClass.ByteStringStore byteStringStore, d<? super ByteStringStoreOuterClass.ByteStringStore> dVar) {
        return ((InitializeStateComplete$doWork$2$1$1) create(byteStringStore, dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        e.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a0.throwOnFailure(obj);
        ByteStringStoreOuterClass.ByteStringStore byteStringStoreBuild = ((ByteStringStoreOuterClass.ByteStringStore) this.L$0).toBuilder().clear().build();
        e0.checkNotNullExpressionValue(byteStringStoreBuild, "it.toBuilder().clear().build()");
        return byteStringStoreBuild;
    }
}
