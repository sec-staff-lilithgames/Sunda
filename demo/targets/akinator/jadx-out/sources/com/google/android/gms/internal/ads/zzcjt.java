package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcjt implements zzifh {
    private final zzcjp zza;

    private zzcjt(zzcjp zzcjpVar) {
        this.zza = zzcjpVar;
    }

    public static zzcjt zzc(zzcjp zzcjpVar) {
        return new zzcjt(zzcjpVar);
    }

    public static Context zzd(zzcjp zzcjpVar) {
        Context contextZzb = zzcjpVar.zzb();
        zzifp.zzb(contextZzb);
        return contextZzb;
    }

    public final Context zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
