package com.google.android.gms.internal.ads;

import android.view.Surface;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzaab implements zzabx {
    private final zzaba zza;
    private final zzabb zzb;
    private final zzabg zzc;
    private final Queue zzd;
    private Surface zze;
    private zzv zzf;
    private long zzg;
    private zzabu zzh;
    private Executor zzi;
    private zzaax zzj;

    public zzaab(zzaba zzabaVar, zzabb zzabbVar, zzdc zzdcVar) {
        this.zza = zzabaVar;
        this.zzb = zzabbVar;
        zzabaVar.zzg(zzdcVar);
        this.zzc = new zzabg(new zzaaa(this, null), zzabaVar, zzabbVar);
        this.zzd = new ArrayDeque();
        this.zzf = new zzt().zzM();
        this.zzg = C.TIME_UNSET;
        this.zzh = zzabu.zzb;
        this.zzi = zzzw.zza;
        this.zzj = zzzu.zza;
    }

    public final /* synthetic */ Surface zzA() {
        return this.zze;
    }

    public final /* synthetic */ zzabu zzB() {
        return this.zzh;
    }

    public final /* synthetic */ Executor zzC() {
        return this.zzi;
    }

    public final /* synthetic */ zzaax zzD() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final void zza() {
        this.zzb.zzd();
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final void zzb() {
        this.zzb.zzd();
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final void zzc(zzabu zzabuVar, Executor executor) {
        this.zzh = zzabuVar;
        this.zzi = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final boolean zzd(zzv zzvVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final void zzf() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final void zzg(boolean z10) {
        if (z10) {
            this.zza.zzl();
        }
        this.zzb.zzd();
        this.zzc.zza();
        this.zzd.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final boolean zzh(boolean z10) {
        return this.zza.zzi(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final void zzi() {
        this.zzc.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final boolean zzj() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final Surface zzk() {
        Surface surface = this.zze;
        surface.getClass();
        return surface;
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final void zzl(zzaax zzaaxVar) {
        this.zzj = zzaaxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final void zzm(float f10) {
        this.zza.zzn(f10);
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final void zzn(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final void zzo(long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final void zzp(Surface surface, zzeh zzehVar) {
        this.zze = surface;
        this.zza.zzd(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final void zzq() {
        this.zze = null;
        this.zza.zzd(null);
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final void zzr(int i10) {
        this.zza.zzm(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final void zzs(int i10, zzv zzvVar, long j10, int i11, List list) {
        zzgmd.zzh(list.isEmpty());
        int i12 = zzvVar.zzv;
        zzv zzvVar2 = this.zzf;
        if (i12 != zzvVar2.zzv || zzvVar.zzw != zzvVar2.zzw) {
            this.zzc.zzc(i12, zzvVar.zzw);
        }
        float f10 = zzvVar.zzz;
        if (f10 != this.zzf.zzz) {
            this.zza.zze(f10);
        }
        this.zzf = zzvVar;
        if (j10 != this.zzg) {
            this.zzc.zzd(i11, j10);
            this.zzg = j10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final void zzt() {
        this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final boolean zzu(long j10, zzabv zzabvVar) {
        this.zzd.add(zzabvVar);
        this.zzc.zze(j10);
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzy();
            }
        });
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final void zzv(long j10, long j11) throws zzabw {
        try {
            this.zzc.zzb(j10, j11);
        } catch (zzib e10) {
            throw new zzabw(e10, this.zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final void zzw(boolean z10) {
        this.zza.zzj(z10);
    }

    public final /* synthetic */ void zzy() {
        this.zzh.zza();
    }

    public final /* synthetic */ Queue zzz() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final void zzx() {
    }
}
