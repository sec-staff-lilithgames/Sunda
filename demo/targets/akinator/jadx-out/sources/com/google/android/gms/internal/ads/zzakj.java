package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzakj implements zzadd {
    private final zzadd zzb;
    private final zzakg zzc;
    private final SparseArray zzd = new SparseArray();
    private boolean zze;

    public zzakj(zzadd zzaddVar, zzakg zzakgVar) {
        this.zzb = zzaddVar;
        this.zzc = zzakgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadd
    public final zzaem zzu(int i10, int i11) {
        if (i11 != 3) {
            this.zze = true;
            return this.zzb.zzu(i10, i11);
        }
        SparseArray sparseArray = this.zzd;
        zzakl zzaklVar = (zzakl) sparseArray.get(i10);
        if (zzaklVar != null) {
            return zzaklVar;
        }
        zzakl zzaklVar2 = new zzakl(this.zzb.zzu(i10, 3), this.zzc);
        sparseArray.put(i10, zzaklVar2);
        return zzaklVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzadd
    public final void zzv() {
        this.zzb.zzv();
        if (!this.zze) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.zzd;
            if (i10 >= sparseArray.size()) {
                return;
            }
            ((zzakl) sparseArray.valueAt(i10)).zza(true);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadd
    public final void zzw(zzaed zzaedVar) {
        this.zzb.zzw(zzaedVar);
    }
}
