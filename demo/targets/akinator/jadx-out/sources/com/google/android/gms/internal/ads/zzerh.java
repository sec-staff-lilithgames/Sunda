package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzerh implements zzeya {
    private final Executor zza;
    private final zzcbj zzb;

    public zzerh(Executor executor, zzcbj zzcbjVar) {
        this.zza = executor;
        this.zzb = zzcbjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final n1 zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzds)).booleanValue()) {
            return zzgui.zza(new zzeri(null));
        }
        zzcbj zzcbjVar = this.zzb;
        return zzgui.zzk(zzcbjVar.zzq(), zzerg.zza, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 10;
    }
}
