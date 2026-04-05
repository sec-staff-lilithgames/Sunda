package com.google.android.gms.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzc {
    public static AdSize zza(int i10, int i11, String str) {
        return new AdSize(i10, i11, str);
    }

    public static AdSize zzb(int i10, int i11) {
        AdSize adSize = new AdSize(i10, i11);
        adSize.zzc(true);
        adSize.zzd(i11);
        return adSize;
    }

    public static AdSize zzc(int i10, int i11) {
        AdSize adSize = new AdSize(i10, i11);
        adSize.zzg(true);
        adSize.zzi(i11);
        return adSize;
    }

    public static boolean zzd(AdSize adSize) {
        return adSize.zzf();
    }

    public static int zze(AdSize adSize) {
        return adSize.zzh();
    }

    public static boolean zzf(AdSize adSize) {
        return adSize.zza();
    }

    public static boolean zzg(AdSize adSize) {
        return adSize.zzb();
    }

    public static int zzh(AdSize adSize) {
        return adSize.zze();
    }
}
