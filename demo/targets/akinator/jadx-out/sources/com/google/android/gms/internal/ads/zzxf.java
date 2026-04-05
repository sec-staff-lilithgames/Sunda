package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzxf extends zzya implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzxt zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final int zzu;
    private final boolean zzv;
    private final boolean zzw;
    private final boolean zzx;

    public zzxf(int i10, zzbg zzbgVar, int i11, zzxt zzxtVar, int i12, boolean z10, zzgme zzgmeVar, int i13) {
        int i14;
        int iZzj;
        int iHashCode;
        int iZzj2;
        boolean z11;
        super(i10, zzbgVar, i11);
        this.zzh = zzxtVar;
        int i15 = 1;
        int i16 = true != zzxtVar.zzT ? 16 : 24;
        this.zzg = zzyi.zzi(this.zzd.zzd);
        this.zzi = zzlp.zzaa(i12, false);
        int i17 = 0;
        while (true) {
            i14 = Integer.MAX_VALUE;
            if (i17 >= zzxtVar.zzq.size()) {
                iZzj = 0;
                i17 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj = zzyi.zzj(this.zzd, (String) zzxtVar.zzq.get(i17), false);
                if (iZzj > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.zzk = i17;
        this.zzj = iZzj;
        this.zzl = zzyi.zzm(this.zzd.zzf, 0);
        this.zzm = zzyi.zzn(this.zzd, zzxtVar.zzr);
        zzv zzvVar = this.zzd;
        int i18 = zzvVar.zzf;
        this.zzn = i18 == 0 || (i18 & 1) != 0;
        this.zzq = 1 == (zzvVar.zze & 1);
        String str = zzvVar.zzo;
        this.zzx = str != null && ((iHashCode = str.hashCode()) == -2123537834 ? str.equals(MimeTypes.AUDIO_E_AC3_JOC) : !(iHashCode == 187078297 ? !str.equals("audio/ac4") : !(iHashCode == 1504698186 && str.equals("audio/iamf"))));
        int i19 = zzvVar.zzG;
        this.zzr = i19;
        this.zzs = zzvVar.zzH;
        int i20 = zzvVar.zzj;
        this.zzt = i20;
        this.zzf = (i20 == -1 || i20 <= zzxtVar.zzu) && (i19 == -1 || i19 <= zzxtVar.zzt) && zzgmeVar.zza(zzvVar);
        String str2 = zzep.zza;
        String[] strArrSplit = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        for (int i21 = 0; i21 < strArrSplit.length; i21++) {
            strArrSplit[i21] = zzep.zzh(strArrSplit[i21]);
        }
        int i22 = 0;
        while (true) {
            if (i22 >= strArrSplit.length) {
                iZzj2 = 0;
                i22 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj2 = zzyi.zzj(this.zzd, strArrSplit[i22], false);
                if (iZzj2 > 0) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        this.zzo = i22;
        this.zzp = iZzj2;
        int i23 = 0;
        while (true) {
            if (i23 >= zzxtVar.zzv.size()) {
                break;
            }
            String str3 = this.zzd.zzo;
            if (str3 != null && str3.equals(zzxtVar.zzv.get(i23))) {
                i14 = i23;
                break;
            }
            i23++;
        }
        this.zzu = i14;
        this.zzv = (i12 & 384) == 128;
        this.zzw = (i12 & 64) == 64;
        zzxt zzxtVar2 = this.zzh;
        if (zzlp.zzaa(i12, zzxtVar2.zzV) && ((z11 = this.zzf) || zzxtVar2.zzO)) {
            int i24 = zzxtVar2.zzw.zzb;
            if (zzlp.zzaa(i12, false) && z11 && this.zzd.zzj != -1 && ((zzxtVar2.zzX || !z10) && (i16 & i12) != 0)) {
                i15 = 2;
            }
        } else {
            i15 = 0;
        }
        this.zze = i15;
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxf zzxfVar) {
        boolean z10 = this.zzf;
        zzgqy zzgqyVarZza = (z10 && this.zzi) ? zzyi.zzc : zzyi.zzc.zza();
        zzgot zzgotVarZza = zzgot.zzg().zzd(this.zzi, zzxfVar.zzi).zza(Integer.valueOf(this.zzk), Integer.valueOf(zzxfVar.zzk), zzgqy.zzb().zza()).zzb(this.zzj, zzxfVar.zzj).zzb(this.zzl, zzxfVar.zzl).zza(Integer.valueOf(this.zzm), Integer.valueOf(zzxfVar.zzm), zzgqy.zzb().zza()).zzd(this.zzq, zzxfVar.zzq).zzd(this.zzn, zzxfVar.zzn).zza(Integer.valueOf(this.zzo), Integer.valueOf(zzxfVar.zzo), zzgqy.zzb().zza()).zzb(this.zzp, zzxfVar.zzp).zzd(z10, zzxfVar.zzf).zza(Integer.valueOf(this.zzu), Integer.valueOf(zzxfVar.zzu), zzgqy.zzb().zza());
        boolean z11 = this.zzh.zzF;
        zzgot zzgotVarZza2 = zzgotVarZza.zzd(this.zzv, zzxfVar.zzv).zzd(this.zzw, zzxfVar.zzw).zzd(this.zzx, zzxfVar.zzx).zza(Integer.valueOf(this.zzr), Integer.valueOf(zzxfVar.zzr), zzgqyVarZza).zza(Integer.valueOf(this.zzs), Integer.valueOf(zzxfVar.zzs), zzgqyVarZza);
        if (Objects.equals(this.zzg, zzxfVar.zzg)) {
            zzgotVarZza2 = zzgotVarZza2.zza(Integer.valueOf(this.zzt), Integer.valueOf(zzxfVar.zzt), zzgqyVarZza);
        }
        return zzgotVarZza2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final /* bridge */ /* synthetic */ boolean zzc(zzya zzyaVar) {
        String str;
        int i10;
        zzxf zzxfVar = (zzxf) zzyaVar;
        boolean z10 = this.zzh.zzR;
        zzv zzvVar = this.zzd;
        int i11 = zzvVar.zzG;
        if (i11 == -1) {
            return false;
        }
        zzv zzvVar2 = zzxfVar.zzd;
        return i11 == zzvVar2.zzG && (str = zzvVar.zzo) != null && TextUtils.equals(str, zzvVar2.zzo) && (i10 = zzvVar.zzH) != -1 && i10 == zzvVar2.zzH && this.zzv == zzxfVar.zzv && this.zzw == zzxfVar.zzw;
    }
}
