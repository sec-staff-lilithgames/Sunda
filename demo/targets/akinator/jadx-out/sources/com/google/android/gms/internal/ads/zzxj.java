package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final /* synthetic */ class zzxj implements Comparator {
    static final /* synthetic */ zzxj zza = new zzxj();

    private /* synthetic */ zzxj() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        List list = (List) obj2;
        List list2 = (List) obj;
        return zzgot.zzg().zza((zzyh) Collections.max(list2, zzyg.zza), (zzyh) Collections.max(list, zzyb.zza), zzyc.zza).zzb(list2.size(), list.size()).zza((zzyh) Collections.max(list2, zzyd.zza), (zzyh) Collections.max(list, zzye.zza), zzyf.zza).zze();
    }
}
