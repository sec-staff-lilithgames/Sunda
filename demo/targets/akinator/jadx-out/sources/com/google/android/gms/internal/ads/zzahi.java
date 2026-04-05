package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzahi implements zzaed {
    private final zzaco zza;
    private final SparseArray zzb;
    private final long zzc;
    private final int zzd;

    public zzahi(SparseArray sparseArray, long j10, int i10, long j11, long j12) {
        int i11;
        this.zzb = sparseArray;
        this.zzc = j10;
        this.zzd = i10;
        List list = (List) sparseArray.get(i10);
        zzaco zzacoVar = null;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            int[] iArrCopyOf = new int[size];
            long[] jArrCopyOf = new long[size];
            long[] jArrCopyOf2 = new long[size];
            long[] jArrCopyOf3 = new long[size];
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                zzahh zzahhVar = (zzahh) list.get(i13);
                jArrCopyOf3[i13] = zzahhVar.zza;
                jArrCopyOf[i13] = zzahhVar.zzb;
            }
            while (true) {
                i11 = size - 1;
                if (i12 >= i11) {
                    break;
                }
                int i14 = i12 + 1;
                iArrCopyOf[i12] = (int) (jArrCopyOf[i14] - jArrCopyOf[i12]);
                jArrCopyOf2[i12] = jArrCopyOf3[i14] - jArrCopyOf3[i12];
                i12 = i14;
            }
            int i15 = i11;
            while (i15 > 0 && jArrCopyOf3[i15] >= j10) {
                i15--;
            }
            iArrCopyOf[i15] = (int) ((j11 + j12) - jArrCopyOf[i15]);
            jArrCopyOf2[i15] = j10 - jArrCopyOf3[i15];
            if (i15 < i11) {
                zzdt.zzc("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i16 = i15 + 1;
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i16);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i16);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i16);
                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i16);
            }
            zzacoVar = new zzaco(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
        }
        this.zza = zzacoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final boolean zzb() {
        List list = (List) this.zzb.get(this.zzd);
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final zzaeb zzc(long j10) {
        zzaco zzacoVar = this.zza;
        if (zzacoVar != null) {
            return zzacoVar.zzc(j10);
        }
        zzaee zzaeeVar = zzaee.zza;
        return new zzaeb(zzaeeVar, zzaeeVar);
    }
}
