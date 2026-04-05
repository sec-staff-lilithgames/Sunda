package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcpw {
    private final String zza;
    private final zzbqy zzb;
    private final Executor zzc;
    private zzcqb zzd;
    private final zzblx zze = new zzcpt(this);
    private final zzblx zzf = new zzcpv(this);

    public zzcpw(String str, zzbqy zzbqyVar, Executor executor) {
        this.zza = str;
        this.zzb = zzbqyVar;
        this.zzc = executor;
    }

    public final void zza(zzcqb zzcqbVar) {
        zzbqy zzbqyVar = this.zzb;
        zzbqyVar.zzb("/updateActiveView", this.zze);
        zzbqyVar.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcqbVar;
    }

    public final void zzb(zzcgy zzcgyVar) {
        zzcgyVar.zzab("/updateActiveView", this.zze);
        zzcgyVar.zzab("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzc(zzcgy zzcgyVar) {
        zzcgyVar.zzac("/updateActiveView", this.zze);
        zzcgyVar.zzac("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzd() {
        zzbqy zzbqyVar = this.zzb;
        zzbqyVar.zzc("/updateActiveView", this.zze);
        zzbqyVar.zzc("/untrackActiveViewUnit", this.zzf);
    }

    public final /* synthetic */ boolean zze(Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.zza);
    }

    public final /* synthetic */ Executor zzf() {
        return this.zzc;
    }

    public final /* synthetic */ zzcqb zzg() {
        return this.zzd;
    }
}
