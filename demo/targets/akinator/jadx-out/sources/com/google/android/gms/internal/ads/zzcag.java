package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzcag {
    static zzcag zzi;

    public static synchronized zzcag zzb(Context context) {
        try {
            zzcag zzcagVar = zzi;
            if (zzcagVar != null) {
                return zzcagVar;
            }
            Context applicationContext = context.getApplicationContext();
            zzbeu.zza(applicationContext);
            com.google.android.gms.ads.internal.util.zzg zzgVarZzo = com.google.android.gms.ads.internal.zzt.zzh().zzo();
            zzgVarZzo.zza(applicationContext);
            zzcaa zzcaaVar = new zzcaa(null);
            zzcaaVar.zza(applicationContext);
            zzcaaVar.zzb(com.google.android.gms.ads.internal.zzt.zzk());
            zzcaaVar.zzc(zzgVarZzo);
            zzcaaVar.zzd(com.google.android.gms.ads.internal.zzt.zzD());
            zzcag zzcagVarZze = zzcaaVar.zze();
            zzi = zzcagVarZze;
            ((zzbzu) ((zzcab) zzcagVarZze).zzc.zzb()).zza();
            final zzcal zzcalVar = (zzcal) ((zzcab) zzi).zzh.zzb();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzaM)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                final Map mapZzz = com.google.android.gms.ads.internal.util.zzs.zzz((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzaN));
                Iterator it = mapZzz.keySet().iterator();
                while (it.hasNext()) {
                    zzcalVar.zzb((String) it.next());
                }
                zzcalVar.zza(new zzcaj() { // from class: com.google.android.gms.internal.ads.zzcak
                    @Override // com.google.android.gms.internal.ads.zzcaj
                    public final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str, String str2) {
                        zzcalVar.zzc(mapZzz, sharedPreferences, str, str2);
                    }
                });
            }
            return zzi;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public abstract zzbzy zza();
}
