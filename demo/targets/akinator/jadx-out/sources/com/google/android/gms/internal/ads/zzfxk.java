package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfxk implements zzgtq {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzfxn zzb;

    public zzfxk(zzfxn zzfxnVar, Context context) {
        this.zza = context;
        Objects.requireNonNull(zzfxnVar);
        this.zzb = zzfxnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgtq
    public final /* bridge */ /* synthetic */ n1 zza(Object obj) throws Exception {
        return this.zzb.zzg().zzb(this.zza);
    }
}
