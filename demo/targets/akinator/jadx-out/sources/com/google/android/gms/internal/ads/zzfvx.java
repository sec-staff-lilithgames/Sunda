package com.google.android.gms.internal.ads;

import av.e;
import bv.n;
import kotlin.jvm.internal.e0;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfvx extends n implements p {
    public zzfvx(d dVar) {
        super(2, dVar);
    }

    @Override // bv.a
    public final d create(Object obj, d dVar) {
        return new zzfvx(dVar);
    }

    @Override // kv.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfvx) create((zzfvk) obj, (d) obj2)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        e.getCOROUTINE_SUSPENDED();
        a0.throwOnFailure(obj);
        zzfvk zzfvkVarZzd = zzfvk.zzd();
        e0.checkNotNullExpressionValue(zzfvkVarZzd, "getDefaultInstance(...)");
        return zzfvkVarZzd;
    }
}
