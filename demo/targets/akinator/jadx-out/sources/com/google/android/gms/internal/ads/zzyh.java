package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzyh extends zzya {
    private final boolean zze;
    private final zzxt zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final int zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final int zzv;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzyh(int r5, com.google.android.gms.internal.ads.zzbg r6, int r7, com.google.android.gms.internal.ads.zzxt r8, int r9, java.lang.String r10, int r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyh.<init>(int, com.google.android.gms.internal.ads.zzbg, int, com.google.android.gms.internal.ads.zzxt, int, java.lang.String, int, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzi(zzyh zzyhVar, zzyh zzyhVar2) {
        zzgot zzgotVarZza = zzgot.zzg().zzd(zzyhVar.zzh, zzyhVar2.zzh).zza(Integer.valueOf(zzyhVar.zzm), Integer.valueOf(zzyhVar2.zzm), zzgqy.zzb().zza()).zzb(zzyhVar.zzn, zzyhVar2.zzn).zzb(zzyhVar.zzo, zzyhVar2.zzo).zza(Integer.valueOf(zzyhVar.zzp), Integer.valueOf(zzyhVar2.zzp), zzgqy.zzb().zza()).zzd(zzyhVar.zzq, zzyhVar2.zzq).zzb(zzyhVar.zzr, zzyhVar2.zzr).zzd(zzyhVar.zzi, zzyhVar2.zzi).zzd(zzyhVar.zze, zzyhVar2.zze).zzd(zzyhVar.zzg, zzyhVar2.zzg).zza(Integer.valueOf(zzyhVar.zzl), Integer.valueOf(zzyhVar2.zzl), zzgqy.zzb().zza());
        boolean z10 = zzyhVar.zzt;
        zzgot zzgotVarZzd = zzgotVarZza.zzd(z10, zzyhVar2.zzt);
        boolean z11 = zzyhVar.zzu;
        zzgot zzgotVarZzd2 = zzgotVarZzd.zzd(z11, zzyhVar2.zzu);
        if (z10 && z11) {
            zzgotVarZzd2 = zzgotVarZzd2.zzb(zzyhVar.zzv, zzyhVar2.zzv);
        }
        return zzgotVarZzd2.zze();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzj(zzyh zzyhVar, zzyh zzyhVar2) {
        zzgqy zzgqyVarZza = (zzyhVar.zze && zzyhVar.zzh) ? zzyi.zzc : zzyi.zzc.zza();
        zzgot zzgotVarZzg = zzgot.zzg();
        boolean z10 = zzyhVar.zzf.zzF;
        return zzgotVarZzg.zza(Integer.valueOf(zzyhVar.zzk), Integer.valueOf(zzyhVar2.zzk), zzgqyVarZza).zza(Integer.valueOf(zzyhVar.zzj), Integer.valueOf(zzyhVar2.zzj), zzgqyVarZza).zze();
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final int zza() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final /* bridge */ /* synthetic */ boolean zzc(zzya zzyaVar) {
        zzyh zzyhVar = (zzyh) zzyaVar;
        if (!Objects.equals(this.zzd.zzo, zzyhVar.zzd.zzo)) {
            return false;
        }
        boolean z10 = this.zzf.zzN;
        return this.zzt == zzyhVar.zzt && this.zzu == zzyhVar.zzu;
    }
}
