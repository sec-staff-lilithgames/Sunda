package com.google.android.gms.measurement.internal;

import android.util.Log;
import java.util.Objects;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgr implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ Object zzd;
    final /* synthetic */ Object zze;
    final /* synthetic */ zzgu zzf;

    public zzgr(zzgu zzguVar, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
        Objects.requireNonNull(zzguVar);
        this.zzf = zzguVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgu zzguVar = this.zzf;
        zzhh zzhhVarZzd = zzguVar.zzu.zzd();
        if (!zzhhVarZzd.zzv()) {
            Log.println(6, zzguVar.zzn(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (zzguVar.zzr() == 0) {
            zzic zzicVar = zzguVar.zzu;
            if (zzicVar.zzc().zzj()) {
                zzicVar.zzaU();
                zzguVar.zzs('C');
            } else {
                zzicVar.zzaU();
                zzguVar.zzs('c');
            }
        }
        if (zzguVar.zzt() < 0) {
            zzguVar.zzu.zzc().zzi();
            zzguVar.zzu(133005L);
        }
        int i10 = this.zza;
        char cZzr = zzguVar.zzr();
        long jZzt = zzguVar.zzt();
        String str = this.zzb;
        Object obj = this.zzc;
        Object obj2 = this.zzd;
        Object obj3 = this.zze;
        char cCharAt = "01VDIWEA?".charAt(i10);
        String strZzo = zzgu.zzo(true, str, obj, obj2, obj3);
        StringBuilder sb2 = new StringBuilder(o2.c(String.valueOf(cCharAt).length() + 1, String.valueOf(cZzr).length(), String.valueOf(jZzt).length(), 1) + strZzo.length());
        sb2.append("2");
        sb2.append(cCharAt);
        sb2.append(cZzr);
        sb2.append(jZzt);
        sb2.append(":");
        sb2.append(strZzo);
        String string = sb2.toString();
        if (string.length() > 1024) {
            string = str.substring(0, 1024);
        }
        zzhf zzhfVar = zzhhVarZzd.zzb;
        if (zzhfVar != null) {
            zzhfVar.zza(string, 1L);
        }
    }
}
