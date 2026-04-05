package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
abstract class zzgtt extends zzgtk {
    private List zza;

    public zzgtt(zzgpa zzgpaVar, boolean z10) {
        super(zzgpaVar, z10, true);
        List listZzb = zzgpaVar.isEmpty() ? Collections.EMPTY_LIST : zzgqe.zzb(zzgpaVar.size());
        for (int i10 = 0; i10 < zzgpaVar.size(); i10++) {
            listZzb.add(null);
        }
        this.zza = listZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgtk
    public final void zzA(int i10) {
        super.zzA(i10);
        this.zza = null;
    }

    public abstract Object zzD(List list);

    @Override // com.google.android.gms.internal.ads.zzgtk
    public final void zzw(int i10, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i10, new zzgts(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgtk
    public final void zzx() {
        List list = this.zza;
        if (list != null) {
            zza(zzD(list));
        }
    }
}
