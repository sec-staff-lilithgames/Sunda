package com.google.android.gms.internal.ads;

import bv.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfwi extends d {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzfwo zzc;
    int zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfwi(zzfwo zzfwoVar, zu.d dVar) {
        super(dVar);
        this.zzc = zzfwoVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zzh(this);
    }
}
