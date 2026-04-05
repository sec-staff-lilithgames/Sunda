package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzft implements zzgb {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzgf zzd;

    public zzft(boolean z10) {
        this.zza = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final void zze(zzgz zzgzVar) {
        zzgzVar.getClass();
        ArrayList arrayList = this.zzb;
        if (arrayList.contains(zzgzVar)) {
            return;
        }
        arrayList.add(zzgzVar);
        this.zzc++;
    }

    public final void zzf(zzgf zzgfVar) {
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzgz) this.zzb.get(i10)).zza(this, zzgfVar, this.zza);
        }
    }

    public final void zzg(zzgf zzgfVar) {
        this.zzd = zzgfVar;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzgz) this.zzb.get(i10)).zzb(this, zzgfVar, this.zza);
        }
    }

    public final void zzh(int i10) {
        zzgf zzgfVar = this.zzd;
        String str = zzep.zza;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            ((zzgz) this.zzb.get(i11)).zzc(this, zzgfVar, this.zza, i10);
        }
    }

    public final void zzi() {
        zzgf zzgfVar = this.zzd;
        String str = zzep.zza;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzgz) this.zzb.get(i10)).zzd(this, zzgfVar, this.zza);
        }
        this.zzd = null;
    }
}
