package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzacp {
    private final Map zza = new LinkedHashMap();

    public final void zza(zzaco zzacoVar) {
        long[] jArr = zzacoVar.zze;
        if (jArr.length > 0) {
            Map map = this.zza;
            if (map.containsKey(Long.valueOf(jArr[0]))) {
                return;
            }
            map.put(Long.valueOf(jArr[0]), zzacoVar);
        }
    }

    public final zzaco zzb() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (zzaco zzacoVar : this.zza.values()) {
            arrayList.add(zzacoVar.zzb);
            arrayList2.add(zzacoVar.zzc);
            arrayList3.add(zzacoVar.zzd);
            arrayList4.add(zzacoVar.zze);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long length = 0;
        for (int[] iArr2 : iArr) {
            length += iArr2.length;
        }
        int i10 = (int) length;
        zzgmd.zze(length == ((long) i10), "the total number of elements (%s) in the arrays must fit in an int", length);
        int[] iArr3 = new int[i10];
        int i11 = 0;
        for (int[] iArr4 : iArr) {
            int length2 = iArr4.length;
            System.arraycopy(iArr4, 0, iArr3, i11, length2);
            i11 += length2;
        }
        return new zzaco(iArr3, zzgsw.zza((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), zzgsw.zza((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), zzgsw.zza((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }
}
