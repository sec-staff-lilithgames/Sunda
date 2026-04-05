package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzik {
    final Context zza;
    zzdc zzb;
    zzgmv zzc;
    zzgmv zzd;
    zzgmv zze;
    zzgmv zzf;
    zzgmv zzg;
    zzglu zzh;
    Looper zzi;
    int zzj;
    zzd zzk;
    int zzl;
    boolean zzm;
    zzlv zzn;
    zzlu zzo;
    long zzp;
    long zzq;
    int zzr;
    int zzs;
    int zzt;
    int zzu;
    boolean zzv;
    boolean zzw;
    String zzx;
    zzhu zzy;

    public zzik(final Context context, final zzls zzlsVar) {
        zzgmv zzgmvVar = new zzgmv() { // from class: com.google.android.gms.internal.ads.zzij
            @Override // com.google.android.gms.internal.ads.zzgmv
            public final /* synthetic */ Object zza() {
                return zzlsVar;
            }
        };
        zzgmv zzgmvVar2 = new zzgmv() { // from class: com.google.android.gms.internal.ads.zzie
            @Override // com.google.android.gms.internal.ads.zzgmv
            public final /* synthetic */ Object zza() {
                return new zzuh(context, new zzacw());
            }
        };
        zzgmv zzgmvVar3 = new zzgmv() { // from class: com.google.android.gms.internal.ads.zzif
            @Override // com.google.android.gms.internal.ads.zzgmv
            public final /* synthetic */ Object zza() {
                return new zzyi(context);
            }
        };
        zzid zzidVar = zzid.zza;
        zzgmv zzgmvVar4 = new zzgmv() { // from class: com.google.android.gms.internal.ads.zzig
            @Override // com.google.android.gms.internal.ads.zzgmv
            public final /* synthetic */ Object zza() {
                return zzzd.zzh(context);
            }
        };
        zzic zzicVar = zzic.zza;
        context.getClass();
        this.zza = context;
        this.zzc = zzgmvVar;
        this.zzd = zzgmvVar2;
        this.zze = zzgmvVar3;
        this.zzf = zzidVar;
        this.zzg = zzgmvVar4;
        this.zzh = zzicVar;
        this.zzi = zzep.zze();
        this.zzk = zzd.zza;
        this.zzl = 1;
        this.zzm = true;
        this.zzn = zzlv.zzc;
        this.zzo = zzlu.zza;
        this.zzy = new zzhu(0.97f, 1.03f, 1000L, 1.0E-7f, zzep.zzq(20L), zzep.zzq(500L), 0.999f, null);
        this.zzb = zzdc.zza;
        this.zzp = 500L;
        this.zzq = 2000L;
        this.zzr = 600000;
        this.zzs = Integer.MAX_VALUE;
        this.zzt = Integer.MAX_VALUE;
        this.zzu = 600000;
        this.zzv = true;
        this.zzx = "";
        this.zzj = -1000;
        if (Build.VERSION.SDK_INT >= 35) {
            int i10 = zzia.zza;
        }
    }
}
