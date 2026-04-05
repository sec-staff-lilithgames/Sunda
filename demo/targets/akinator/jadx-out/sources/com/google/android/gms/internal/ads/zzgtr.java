package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgtr extends zzgtt {
    public zzgtr(zzgpa zzgpaVar, boolean z10) {
        super(zzgpaVar, z10);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgtt
    public final /* bridge */ /* synthetic */ Object zzD(List list) {
        ArrayList arrayListZzb = zzgqe.zzb(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgts zzgtsVar = (zzgts) it.next();
            arrayListZzb.add(zzgtsVar != null ? zzgtsVar.zza : null);
        }
        return Collections.unmodifiableList(arrayListZzb);
    }
}
