package com.google.android.gms.internal.ads;

import bv.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfvt extends d {
    Object zza;
    Object zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zzfwo zzd;
    int zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfvt(zzfwo zzfwoVar, zu.d dVar) {
        super(dVar);
        this.zzd = zzfwoVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.zzc = obj;
        this.zze |= Integer.MIN_VALUE;
        return this.zzd.zzs(null, this);
    }
}
