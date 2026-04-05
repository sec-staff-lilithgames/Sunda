package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zztt implements zzuw {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zzve zzc = new zzve();
    private final zzru zzd = new zzru();
    private Looper zze;
    private zzbf zzf;
    private zzpc zzg;

    public abstract void zza(zzgz zzgzVar);

    public abstract void zzd();

    public final void zze(zzbf zzbfVar) {
        this.zzf = zzbfVar;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzuv) arrayList.get(i10)).zza(this, zzbfVar);
        }
    }

    public final zzve zzf(zzuu zzuuVar) {
        return this.zzc.zza(0, zzuuVar);
    }

    public final zzve zzg(int i10, zzuu zzuuVar) {
        return this.zzc.zza(0, zzuuVar);
    }

    public final zzru zzh(zzuu zzuuVar) {
        return this.zzd.zza(0, zzuuVar);
    }

    public final zzru zzi(int i10, zzuu zzuuVar) {
        return this.zzd.zza(0, zzuuVar);
    }

    public final boolean zzj() {
        return !this.zzb.isEmpty();
    }

    public final zzpc zzk() {
        zzpc zzpcVar = this.zzg;
        zzpcVar.getClass();
        return zzpcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzl(Handler handler, zzvf zzvfVar) {
        this.zzc.zzb(handler, zzvfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzm(zzvf zzvfVar) {
        this.zzc.zzc(zzvfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzn(Handler handler, zzrv zzrvVar) {
        this.zzd.zzb(handler, zzrvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzo(zzrv zzrvVar) {
        this.zzd.zzc(zzrvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzp(zzuv zzuvVar, zzgz zzgzVar, zzpc zzpcVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z10 = true;
        if (looper != null && looper != looperMyLooper) {
            z10 = false;
        }
        zzgmd.zza(z10);
        this.zzg = zzpcVar;
        zzbf zzbfVar = this.zzf;
        this.zza.add(zzuvVar);
        if (this.zze == null) {
            this.zze = looperMyLooper;
            this.zzb.add(zzuvVar);
            zza(zzgzVar);
        } else if (zzbfVar != null) {
            zzq(zzuvVar);
            zzuvVar.zza(this, zzbfVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzq(zzuv zzuvVar) {
        this.zze.getClass();
        HashSet hashSet = this.zzb;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(zzuvVar);
        if (zIsEmpty) {
            zzM();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzr(zzuv zzuvVar) {
        HashSet hashSet = this.zzb;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(zzuvVar);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzs(zzuv zzuvVar) {
        ArrayList arrayList = this.zza;
        arrayList.remove(zzuvVar);
        if (!arrayList.isEmpty()) {
            zzr(zzuvVar);
            return;
        }
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
        this.zzb.clear();
        zzd();
    }

    public void zzM() {
    }

    public void zzc() {
    }
}
