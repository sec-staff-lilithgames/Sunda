package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzamd implements zzakd {
    private final List zza;
    private final long[] zzb;
    private final long[] zzc;

    public zzamd(List list) {
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.zzb = new long[size + size];
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzalt zzaltVar = (zzalt) list.get(i10);
            long[] jArr = this.zzb;
            int i11 = i10 + i10;
            jArr[i11] = zzaltVar.zzb;
            jArr[i11 + 1] = zzaltVar.zzc;
        }
        long[] jArr2 = this.zzb;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.zzc = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final int zza() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final long zzb(int i10) {
        zzgmd.zza(i10 >= 0);
        long[] jArr = this.zzc;
        zzgmd.zza(i10 < jArr.length);
        return jArr[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final List zzc(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            List list = this.zza;
            if (i10 >= list.size()) {
                break;
            }
            long[] jArr = this.zzb;
            int i11 = i10 + i10;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                zzalt zzaltVar = (zzalt) list.get(i10);
                zzcm zzcmVar = zzaltVar.zza;
                if (zzcmVar.zze == -3.4028235E38f) {
                    arrayList2.add(zzaltVar);
                } else {
                    arrayList.add(zzcmVar);
                }
            }
            i10++;
        }
        Collections.sort(arrayList2, zzamc.zza);
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            zzcl zzclVarZza = ((zzalt) arrayList2.get(i12)).zza.zza();
            zzclVarZza.zzf((-1) - i12, 1);
            arrayList.add(zzclVarZza.zzr());
        }
        return arrayList;
    }
}
