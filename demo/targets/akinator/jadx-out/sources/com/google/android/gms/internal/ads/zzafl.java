package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzafl implements zzada {
    private final byte[] zza;
    private final zzeg zzb;
    private final zzadh zzc;
    private zzadd zzd;
    private zzaem zze;
    private int zzf;
    private zzap zzg;
    private zzadn zzh;
    private int zzi;
    private int zzj;
    private zzafj zzk;
    private int zzl;
    private long zzm;

    public zzafl() {
        throw null;
    }

    private final long zzg(zzeg zzegVar, boolean z10) {
        boolean zZza;
        this.zzh.getClass();
        int iZzg = zzegVar.zzg();
        while (iZzg <= zzegVar.zze() - 16) {
            zzegVar.zzh(iZzg);
            zzadn zzadnVar = this.zzh;
            int i10 = this.zzj;
            zzadh zzadhVar = this.zzc;
            if (zzadi.zza(zzegVar, zzadnVar, i10, zzadhVar)) {
                zzegVar.zzh(iZzg);
                return zzadhVar.zza;
            }
            iZzg++;
        }
        if (!z10) {
            zzegVar.zzh(iZzg);
            return -1L;
        }
        while (iZzg <= zzegVar.zze() - this.zzi) {
            zzegVar.zzh(iZzg);
            try {
                zZza = zzadi.zza(zzegVar, this.zzh, this.zzj, this.zzc);
            } catch (IndexOutOfBoundsException unused) {
                zZza = false;
            }
            if (zzegVar.zzg() <= zzegVar.zze() && zZza) {
                zzegVar.zzh(iZzg);
                return this.zzc.zza;
            }
            iZzg++;
        }
        zzegVar.zzh(zzegVar.zze());
        return -1L;
    }

    private final void zzh() {
        long j10 = this.zzm * 1000000;
        zzadn zzadnVar = this.zzh;
        String str = zzep.zza;
        this.zze.zzx(j10 / zzadnVar.zze, 1, this.zzl, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final boolean zza(zzadb zzadbVar) throws IOException {
        zzadk.zza(zzadbVar, false);
        zzeg zzegVar = new zzeg(4);
        ((zzacr) zzadbVar).zzh(zzegVar.zzi(), 0, 4, false);
        return zzegVar.zzz() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final void zzc(zzadd zzaddVar) {
        this.zzd = zzaddVar;
        this.zze = zzaddVar.zzu(0, 1);
        zzaddVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final int zzd(zzadb zzadbVar, zzaea zzaeaVar) throws IOException {
        boolean zZzb;
        zzadn zzadnVar;
        zzaed zzaecVar;
        boolean z10;
        int i10 = this.zzf;
        if (i10 == 0) {
            zzadbVar.zzl();
            long jZzm = zzadbVar.zzm();
            zzap zzapVarZza = zzadk.zza(zzadbVar, true);
            zzadbVar.zzf((int) (zzadbVar.zzm() - jZzm));
            this.zzg = zzapVarZza;
            this.zzf = 1;
            return 0;
        }
        if (i10 == 1) {
            zzadbVar.zzi(this.zza, 0, 42);
            zzadbVar.zzl();
            this.zzf = 2;
            return 0;
        }
        if (i10 == 2) {
            zzeg zzegVar = new zzeg(4);
            zzadbVar.zzc(zzegVar.zzi(), 0, 4);
            if (zzegVar.zzz() != 1716281667) {
                throw zzat.zzb("Failed to read FLAC stream marker.", null);
            }
            this.zzf = 3;
            return 0;
        }
        if (i10 == 3) {
            zzadj zzadjVar = new zzadj(this.zzh);
            do {
                zZzb = zzadk.zzb(zzadbVar, zzadjVar);
                zzadnVar = zzadjVar.zza;
                String str = zzep.zza;
                this.zzh = zzadnVar;
            } while (!zZzb);
            zzadnVar.getClass();
            this.zzi = Math.max(zzadnVar.zzc, 6);
            zzv zzvVarZzc = this.zzh.zzc(this.zza, this.zzg);
            zzaem zzaemVar = this.zze;
            zzt zztVarZza = zzvVarZzc.zza();
            zztVarZza.zzl(MimeTypes.AUDIO_FLAC);
            zzaemVar.zzu(zztVarZza.zzM());
            this.zzh.zza();
            this.zzf = 4;
            return 0;
        }
        if (i10 == 4) {
            zzadbVar.zzl();
            zzeg zzegVar2 = new zzeg(2);
            zzadbVar.zzi(zzegVar2.zzi(), 0, 2);
            int iZzt = zzegVar2.zzt();
            if ((iZzt >> 2) != 16382) {
                zzadbVar.zzl();
                throw zzat.zzb("First frame does not start with sync code.", null);
            }
            zzadbVar.zzl();
            this.zzj = iZzt;
            zzadd zzaddVar = this.zzd;
            String str2 = zzep.zza;
            long jZzn = zzadbVar.zzn();
            long jZzo = zzadbVar.zzo();
            zzadn zzadnVar2 = this.zzh;
            zzadnVar2.getClass();
            zzadm zzadmVar = zzadnVar2.zzk;
            if (zzadmVar != null && zzadmVar.zza.length > 0) {
                zzaecVar = new zzadl(zzadnVar2, jZzn);
            } else if (jZzo == -1 || zzadnVar2.zzj <= 0) {
                zzaecVar = new zzaec(zzadnVar2.zza(), 0L);
            } else {
                zzafj zzafjVar = new zzafj(zzadnVar2, this.zzj, jZzn, jZzo);
                this.zzk = zzafjVar;
                zzaecVar = zzafjVar.zza();
            }
            zzaddVar.zzw(zzaecVar);
            this.zzf = 5;
            return 0;
        }
        this.zze.getClass();
        zzadn zzadnVar3 = this.zzh;
        zzadnVar3.getClass();
        zzafj zzafjVar2 = this.zzk;
        if (zzafjVar2 != null && zzafjVar2.zzc()) {
            return zzafjVar2.zzd(zzadbVar, zzaeaVar);
        }
        if (this.zzm == -1) {
            this.zzm = zzadi.zzb(zzadbVar, zzadnVar3);
            return 0;
        }
        zzeg zzegVar3 = this.zzb;
        int iZze = zzegVar3.zze();
        if (iZze < 32768) {
            int iZza = zzadbVar.zza(zzegVar3.zzi(), iZze, 32768 - iZze);
            z10 = iZza == -1;
            if (!z10) {
                zzegVar3.zzf(iZze + iZza);
            } else if (zzegVar3.zzd() == 0) {
                zzh();
                return -1;
            }
        } else {
            z10 = false;
        }
        int iZzg = zzegVar3.zzg();
        int i11 = this.zzl;
        int i12 = this.zzi;
        if (i11 < i12) {
            zzegVar3.zzk(Math.min(i12 - i11, zzegVar3.zzd()));
        }
        long jZzg = zzg(zzegVar3, z10);
        int iZzg2 = zzegVar3.zzg() - iZzg;
        zzegVar3.zzh(iZzg);
        this.zze.zzz(zzegVar3, iZzg2);
        this.zzl += iZzg2;
        if (jZzg != -1) {
            zzh();
            this.zzl = 0;
            this.zzm = jZzg;
        }
        int length = zzegVar3.zzi().length - zzegVar3.zze();
        if (zzegVar3.zzd() >= 16 || length >= 16) {
            return 0;
        }
        int iZzd = zzegVar3.zzd();
        System.arraycopy(zzegVar3.zzi(), zzegVar3.zzg(), zzegVar3.zzi(), 0, iZzd);
        zzegVar3.zzh(0);
        zzegVar3.zzf(iZzd);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final void zze(long j10, long j11) {
        if (j10 == 0) {
            this.zzf = 0;
        } else {
            zzafj zzafjVar = this.zzk;
            if (zzafjVar != null) {
                zzafjVar.zzb(j11);
            }
        }
        this.zzm = j11 != 0 ? -1L : 0L;
        this.zzl = 0;
        this.zzb.zza(0);
    }

    public zzafl(int i10) {
        this.zza = new byte[42];
        this.zzb = new zzeg(new byte[32768], 0);
        this.zzc = new zzadh();
        this.zzf = 0;
    }
}
