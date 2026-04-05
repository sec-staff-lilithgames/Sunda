package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzeaz implements zzguf {
    final /* synthetic */ zzebc zza;

    public zzeaz(zzebc zzebcVar) {
        Objects.requireNonNull(zzebcVar);
        this.zza = zzebcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zza(Throwable th2) throws NumberFormatException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgL)).booleanValue()) {
            Matcher matcher = zzebc.zzh.matcher(th2.getMessage());
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                zzebc zzebcVar = this.zza;
                zzebcVar.zzc().zzc(Integer.parseInt(strGroup));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfgf zzfgfVar = (zzfgf) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgL)).booleanValue()) {
            zzebc zzebcVar = this.zza;
            zzffx zzffxVar = zzfgfVar.zzb.zzb;
            zzebcVar.zzc().zzc(zzffxVar.zzf);
            zzebcVar.zzc().zze(zzffxVar.zzg);
        }
    }
}
