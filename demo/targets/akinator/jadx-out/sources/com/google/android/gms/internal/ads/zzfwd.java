package com.google.android.gms.internal.ads;

import av.e;
import bv.n;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfwd extends n implements p {
    int zza;
    final /* synthetic */ zzfwo zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfwd(zzfwo zzfwoVar, String str, d dVar) {
        super(2, dVar);
        this.zzb = zzfwoVar;
        this.zzc = str;
    }

    @Override // bv.a
    public final d create(Object obj, d dVar) {
        return new zzfwd(this.zzb, this.zzc, dVar);
    }

    @Override // kv.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfwd) create((CoroutineScope) obj, (d) obj2)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.zza;
        a0.throwOnFailure(obj);
        if (i10 == 0) {
            zzfwo zzfwoVar = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            if (zzfwoVar.zzi(str, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return x0.f87415a;
    }
}
