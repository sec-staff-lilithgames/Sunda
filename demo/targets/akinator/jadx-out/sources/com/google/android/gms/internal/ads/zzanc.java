package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzanc implements zzamq {
    private final zzeg zza;
    private final zzadw zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private zzaem zzf;
    private String zzg;
    private int zzh = 0;
    private int zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzanc(String str, int i10, String str2) {
        zzeg zzegVar = new zzeg(4);
        this.zza = zzegVar;
        zzegVar.zzi()[0] = -1;
        this.zzb = new zzadw();
        this.zzn = C.TIME_UNSET;
        this.zzc = str;
        this.zzd = i10;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzk = false;
        this.zzn = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zzb(zzadd zzaddVar, zzaoe zzaoeVar) {
        zzaoeVar.zza();
        this.zzg = zzaoeVar.zzc();
        this.zzf = zzaddVar.zzu(zzaoeVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zzc(long j10, int i10) {
        this.zzn = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zzd(zzeg zzegVar) {
        this.zzf.getClass();
        while (zzegVar.zzd() > 0) {
            int i10 = this.zzh;
            if (i10 == 0) {
                byte[] bArrZzi = zzegVar.zzi();
                int iZzg = zzegVar.zzg();
                int iZze = zzegVar.zze();
                while (true) {
                    if (iZzg >= iZze) {
                        zzegVar.zzh(iZze);
                        break;
                    }
                    int i11 = iZzg + 1;
                    byte b10 = bArrZzi[iZzg];
                    boolean z10 = (b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 255;
                    boolean z11 = this.zzk && (b10 & 224) == 224;
                    this.zzk = z10;
                    if (z11) {
                        zzegVar.zzh(i11);
                        this.zzk = false;
                        this.zza.zzi()[1] = bArrZzi[iZzg];
                        this.zzi = 2;
                        this.zzh = 1;
                        break;
                    }
                    iZzg = i11;
                }
            } else if (i10 != 1) {
                int iMin = Math.min(zzegVar.zzd(), this.zzm - this.zzi);
                this.zzf.zzz(zzegVar, iMin);
                int i12 = this.zzi + iMin;
                this.zzi = i12;
                if (i12 >= this.zzm) {
                    zzgmd.zzh(this.zzn != C.TIME_UNSET);
                    this.zzf.zzx(this.zzn, 1, this.zzm, 0, null);
                    this.zzn += this.zzl;
                    this.zzi = 0;
                    this.zzh = 0;
                }
            } else {
                int iMin2 = Math.min(zzegVar.zzd(), 4 - this.zzi);
                zzeg zzegVar2 = this.zza;
                zzegVar.zzm(zzegVar2.zzi(), this.zzi, iMin2);
                int i13 = this.zzi + iMin2;
                this.zzi = i13;
                if (i13 >= 4) {
                    zzegVar2.zzh(0);
                    zzadw zzadwVar = this.zzb;
                    if (zzadwVar.zza(zzegVar2.zzB())) {
                        this.zzm = zzadwVar.zzc;
                        if (!this.zzj) {
                            this.zzl = (zzadwVar.zzg * 1000000) / zzadwVar.zzd;
                            zzt zztVar = new zzt();
                            zztVar.zza(this.zzg);
                            zztVar.zzl(this.zze);
                            zztVar.zzm(zzadwVar.zzb);
                            zztVar.zzn(4096);
                            zztVar.zzE(zzadwVar.zze);
                            zztVar.zzF(zzadwVar.zzd);
                            zztVar.zze(this.zzc);
                            zztVar.zzg(this.zzd);
                            this.zzf.zzu(zztVar.zzM());
                            this.zzj = true;
                        }
                        zzegVar2.zzh(0);
                        this.zzf.zzz(zzegVar2, 4);
                        this.zzh = 2;
                    } else {
                        this.zzi = 0;
                        this.zzh = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamq
    public final void zze(boolean z10) {
    }
}
