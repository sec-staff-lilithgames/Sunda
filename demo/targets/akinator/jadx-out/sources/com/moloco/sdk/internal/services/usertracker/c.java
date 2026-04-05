package com.moloco.sdk.internal.services.usertracker;

import com.moloco.sdk.internal.services.g0;
import kotlin.jvm.internal.e0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f47177a;

    public c(g0 dataStoreService) {
        e0.checkNotNullParameter(dataStoreService, "dataStoreService");
        this.f47177a = dataStoreService;
    }

    @Override // com.moloco.sdk.internal.services.usertracker.b
    public Object a(String str, zu.d<? super x0> dVar) {
        Object objA = this.f47177a.a("com.moloco.sdk.mref", str, dVar);
        return objA == av.e.getCOROUTINE_SUSPENDED() ? objA : x0.f87415a;
    }

    @Override // com.moloco.sdk.internal.services.usertracker.b
    public Object b(zu.d<? super String> dVar) {
        return this.f47177a.d("com.moloco.sdk.mref", dVar);
    }

    @Override // com.moloco.sdk.internal.services.usertracker.b
    public Object a(zu.d<? super x0> dVar) {
        Object objA = this.f47177a.a("com.moloco.sdk.mref", dVar);
        return objA == av.e.getCOROUTINE_SUSPENDED() ? objA : x0.f87415a;
    }
}
