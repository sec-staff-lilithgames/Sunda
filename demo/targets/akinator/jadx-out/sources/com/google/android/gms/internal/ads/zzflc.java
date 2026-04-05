package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public interface zzflc {
    static zzflc zzn(Context context, int i10) {
        boolean zBooleanValue;
        if (zzflp.zza()) {
            int i11 = i10 - 2;
            if (i11 == 20 || i11 == 21) {
                zBooleanValue = ((Boolean) zzbgn.zze.zze()).booleanValue();
            } else if (i11 != 110) {
                switch (i11) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zBooleanValue = ((Boolean) zzbgn.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zBooleanValue = ((Boolean) zzbgn.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        zBooleanValue = ((Boolean) zzbgn.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjP)).booleanValue();
            }
            if (zBooleanValue) {
                return new zzfle(context, i10);
            }
        }
        return new zzfmd();
    }

    static zzflc zzo(Context context, int i10, int i11, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        zzflc zzflcVarZzn = zzn(context, i10);
        if (zzflcVarZzn instanceof zzfle) {
            zzflcVarZzn.zza();
            zzflcVarZzn.zzp(i11);
            zzflcVarZzn.zzf(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzd(zzmVar.zzm));
            String str = zzmVar.zzp;
            if (zzfll.zza(str)) {
                zzflcVarZzn.zze(str);
            }
        }
        return zzflcVarZzn;
    }

    zzflc zza();

    boolean zzb();

    zzflc zzc();

    zzflc zzd(boolean z10);

    zzflc zze(String str);

    zzflc zzf(zzflr zzflrVar);

    zzflc zzg(zzfge zzfgeVar);

    zzflc zzh(com.google.android.gms.ads.internal.client.zze zzeVar);

    zzflc zzi(String str);

    zzflc zzj(Throwable th2);

    zzflc zzk(String str);

    boolean zzl();

    zzflf zzm();

    zzflc zzp(int i10);
}
