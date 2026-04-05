package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzhr implements zzln, zzlp {
    private final int zzb;
    private zzlq zzd;
    private int zze;
    private zzpc zzf;
    private zzdc zzg;
    private int zzh;
    private zzwk zzi;
    private zzv[] zzj;
    private long zzk;
    private long zzl;
    private boolean zzn;
    private boolean zzo;
    private zzuu zzq;
    private zzlo zzr;
    private final Object zza = new Object();
    private final zzkj zzc = new zzkj();
    private long zzm = Long.MIN_VALUE;
    private zzbf zzp = zzbf.zza;

    public zzhr(int i10) {
        this.zzb = i10;
    }

    private final void zzac(long j10, boolean z10, boolean z11) throws zzib {
        this.zzn = false;
        this.zzl = j10;
        this.zzm = j10;
        if (!z11) {
            z11 = zzP(j10) != 0;
        }
        zzA(j10, z10, z11);
    }

    public void zzA(long j10, boolean z10, boolean z11) throws zzib {
        throw null;
    }

    public void zzD() {
        throw null;
    }

    public final long zzG() {
        return this.zzl;
    }

    public final zzkj zzH() {
        zzkj zzkjVar = this.zzc;
        zzkjVar.zza = null;
        zzkjVar.zzb = null;
        return zzkjVar;
    }

    public final zzv[] zzI() {
        zzv[] zzvVarArr = this.zzj;
        zzvVarArr.getClass();
        return zzvVarArr;
    }

    public final zzlq zzJ() {
        zzlq zzlqVar = this.zzd;
        zzlqVar.getClass();
        return zzlqVar;
    }

    public final zzpc zzK() {
        zzpc zzpcVar = this.zzf;
        zzpcVar.getClass();
        return zzpcVar;
    }

    public final zzdc zzL() {
        zzdc zzdcVar = this.zzg;
        zzdcVar.getClass();
        return zzdcVar;
    }

    public final zzbf zzM() {
        return this.zzp;
    }

    public final zzib zzN(Throwable th2, zzv zzvVar, boolean z10, int i10) {
        int iZzab = 4;
        if (zzvVar != null && !this.zzo) {
            this.zzo = true;
            try {
                iZzab = zzab(zzvVar) & 7;
            } catch (zzib unused) {
            } finally {
                this.zzo = false;
            }
        }
        return zzib.zzb(th2, zzS(), this.zze, zzvVar, iZzab, this.zzq, z10, i10);
    }

    public final int zzO(zzkj zzkjVar, zzhh zzhhVar, int i10) {
        zzwk zzwkVar = this.zzi;
        zzwkVar.getClass();
        int iZzd = zzwkVar.zzd(zzkjVar, zzhhVar, i10);
        if (iZzd == -4) {
            if (zzhhVar.zzb()) {
                this.zzm = Long.MIN_VALUE;
                return this.zzn ? -4 : -3;
            }
            long j10 = zzhhVar.zze + this.zzk;
            zzhhVar.zze = j10;
            this.zzm = Math.max(this.zzm, j10);
            return iZzd;
        }
        if (iZzd == -5) {
            zzv zzvVar = zzkjVar.zzb;
            zzvVar.getClass();
            long j11 = zzvVar.zzt;
            if (j11 != Long.MAX_VALUE) {
                zzt zztVarZza = zzvVar.zza();
                zztVarZza.zzr(j11 + this.zzk);
                zzkjVar.zzb = zztVarZza.zzM();
                return -5;
            }
        }
        return iZzd;
    }

    public final int zzP(long j10) {
        zzwk zzwkVar = this.zzi;
        zzwkVar.getClass();
        return zzwkVar.zze(j10 - this.zzk);
    }

    public final boolean zzQ() {
        if (zzdb()) {
            return this.zzn;
        }
        zzwk zzwkVar = this.zzi;
        zzwkVar.getClass();
        return zzwkVar.zzb();
    }

    public final void zzR() {
        zzlo zzloVar;
        synchronized (this.zza) {
            zzloVar = this.zzr;
        }
        if (zzloVar != null) {
            zzloVar.zza(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzln, com.google.android.gms.internal.ads.zzlp
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzc(int i10, zzpc zzpcVar, zzdc zzdcVar) {
        this.zze = i10;
        this.zzf = zzpcVar;
        this.zzg = zzdcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzcY() throws zzib {
        zzgmd.zzh(this.zzh == 1);
        this.zzh = 2;
        zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzcZ(zzv[] zzvVarArr, zzwk zzwkVar, long j10, long j11, zzuu zzuuVar) throws zzib {
        zzgmd.zzh(!this.zzn);
        this.zzi = zzwkVar;
        this.zzq = zzuuVar;
        if (this.zzm == Long.MIN_VALUE) {
            this.zzm = j10;
        }
        this.zzj = zzvVarArr;
        this.zzk = j11;
        zzz(zzvVarArr, j10, j11, zzuuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public zzko zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final zzwk zzda() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final boolean zzdb() {
        return this.zzm == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final int zze() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzf(zzlq zzlqVar, zzv[] zzvVarArr, zzwk zzwkVar, long j10, boolean z10, boolean z11, long j11, long j12, zzuu zzuuVar) throws zzib {
        zzgmd.zzh(this.zzh == 0);
        this.zzd = zzlqVar;
        this.zzq = zzuuVar;
        this.zzh = 1;
        zzy(z10, z11);
        zzcZ(zzvVarArr, zzwkVar, j11, j12, zzuuVar);
        zzac(j11, z10, true);
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final long zzk() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzl() {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final boolean zzm() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzn() throws IOException {
        zzwk zzwkVar = this.zzi;
        zzwkVar.getClass();
        zzwkVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzo(zzbf zzbfVar) {
        if (Objects.equals(this.zzp, zzbfVar)) {
            return;
        }
        this.zzp = zzbfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzp(long j10, boolean z10) throws zzib {
        zzac(j10, false, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzq() {
        zzgmd.zzh(this.zzh == 2);
        this.zzh = 1;
        zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzr() {
        zzgmd.zzh(this.zzh == 1);
        zzkj zzkjVar = this.zzc;
        zzkjVar.zza = null;
        zzkjVar.zzb = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        zzD();
        this.zzq = null;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzs() {
        zzgmd.zzh(this.zzh == 0);
        zzkj zzkjVar = this.zzc;
        zzkjVar.zza = null;
        zzkjVar.zzb = null;
        zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzt() {
        zzgmd.zzh(this.zzh == 0);
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public int zzu() throws zzib {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void zzv(zzlo zzloVar) {
        synchronized (this.zza) {
            this.zzr = zzloVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void zzw() {
        synchronized (this.zza) {
            this.zzr = null;
        }
    }

    public void zzB() throws zzib {
    }

    public void zzC() {
    }

    public void zzE() {
    }

    public void zzF() {
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final zzlp zzb() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public void zzx(int i10, Object obj) throws zzib {
    }

    public void zzy(boolean z10, boolean z11) throws zzib {
    }

    public void zzz(zzv[] zzvVarArr, long j10, long j11, zzuu zzuuVar) throws zzib {
    }
}
