package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzevl implements zzeya {
    private final Context zza;
    private final Intent zzb;

    public zzevl(Context context, Intent intent) {
        this.zza = context;
        this.zzb = intent;
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final n1 zza() {
        com.google.android.gms.ads.internal.util.zze.zza("HsdpMigrationSignal.produce");
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zznP)).booleanValue()) {
            return zzgui.zza(new zzevm(null));
        }
        boolean z10 = false;
        try {
            if (this.zzb.resolveActivity(this.zza.getPackageManager()) != null) {
                com.google.android.gms.ads.internal.util.zze.zza("HSDP intent is supported");
                z10 = true;
            }
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "HsdpMigrationSignal.isHsdpMigrationSupported");
        }
        return zzgui.zza(new zzevm(Boolean.valueOf(z10)));
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 60;
    }
}
