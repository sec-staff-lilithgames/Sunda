package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzxy extends zzya implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;

    public zzxy(int i10, zzbg zzbgVar, int i11, zzxt zzxtVar, int i12, String str, String str2) {
        int iZzj;
        super(i10, zzbgVar, i11);
        int i13 = 0;
        this.zzf = zzlp.zzaa(i12, false);
        int i14 = this.zzd.zze;
        int i15 = zzxtVar.zzC;
        this.zzg = 1 == (i14 & 1);
        this.zzh = (i14 & 2) != 0;
        zzgpe zzgpeVarZzj = str2 != null ? zzgpe.zzj(str2) : zzxtVar.zzy.isEmpty() ? zzgpe.zzj("") : zzxtVar.zzy;
        int i16 = 0;
        while (true) {
            if (i16 >= zzgpeVarZzj.size()) {
                iZzj = 0;
                i16 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj = zzyi.zzj(this.zzd, (String) zzgpeVarZzj.get(i16), false);
                if (iZzj > 0) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        this.zzi = i16;
        this.zzj = iZzj;
        int iZzm = zzyi.zzm(this.zzd.zzf, str2 != null ? 1088 : 0);
        this.zzk = iZzm;
        zzv zzvVar = this.zzd;
        this.zzn = (1088 & zzvVar.zzf) != 0;
        int iZzn = zzyi.zzn(zzvVar, zzxtVar.zzz);
        this.zzl = iZzn;
        int iZzj2 = zzyi.zzj(this.zzd, str, zzyi.zzi(str) == null);
        this.zzm = iZzj2;
        boolean z10 = iZzj > 0 || (zzxtVar.zzy.isEmpty() && iZzm > 0) || ((zzxtVar.zzy.isEmpty() && iZzn != Integer.MAX_VALUE) || this.zzg || (this.zzh && iZzj2 > 0));
        if (zzlp.zzaa(i12, zzxtVar.zzV) && z10) {
            i13 = 1;
        }
        this.zze = i13;
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxy zzxyVar) {
        zzgot zzgotVarZza = zzgot.zzg().zzd(this.zzf, zzxyVar.zzf).zza(Integer.valueOf(this.zzi), Integer.valueOf(zzxyVar.zzi), zzgqy.zzb().zza());
        int i10 = this.zzj;
        zzgot zzgotVarZzb = zzgotVarZza.zzb(i10, zzxyVar.zzj);
        int i11 = this.zzk;
        zzgot zzgotVarZzb2 = zzgotVarZzb.zzb(i11, zzxyVar.zzk).zza(Integer.valueOf(this.zzl), Integer.valueOf(zzxyVar.zzl), zzgqy.zzb().zza()).zzd(this.zzg, zzxyVar.zzg).zza(Boolean.valueOf(this.zzh), Boolean.valueOf(zzxyVar.zzh), i10 == 0 ? zzgqy.zzb() : zzgqy.zzb().zza()).zzb(this.zzm, zzxyVar.zzm);
        if (i11 == 0) {
            zzgotVarZzb2 = zzgotVarZzb2.zzc(this.zzn, zzxyVar.zzn);
        }
        return zzgotVarZzb2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final /* bridge */ /* synthetic */ boolean zzc(zzya zzyaVar) {
        return false;
    }
}
