package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbf {
    private final String[] zza;
    private final double[] zzb;
    private final double[] zzc;
    private final int[] zzd;
    private int zze;

    public /* synthetic */ zzbf(zzbe zzbeVar, byte[] bArr) {
        int size = zzbeVar.zzd().size();
        this.zza = (String[]) zzbeVar.zzc().toArray(new String[size]);
        this.zzb = zzc(zzbeVar.zzd());
        this.zzc = zzc(zzbeVar.zze());
        this.zzd = new int[size];
        this.zze = 0;
    }

    private static final double[] zzc(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = ((Double) list.get(i10)).doubleValue();
        }
        return dArr;
    }

    public final void zza(double d10) {
        this.zze++;
        int i10 = 0;
        while (true) {
            double[] dArr = this.zzc;
            if (i10 >= dArr.length) {
                return;
            }
            double d11 = dArr[i10];
            if (d11 <= d10 && d10 < this.zzb[i10]) {
                int[] iArr = this.zzd;
                iArr[i10] = iArr[i10] + 1;
            }
            if (d10 < d11) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final List zzb() {
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str = strArr[i10];
            double[] dArr = this.zzc;
            double[] dArr2 = this.zzb;
            int[] iArr = this.zzd;
            double d10 = dArr[i10];
            double d11 = dArr2[i10];
            int i11 = iArr[i10];
            arrayList.add(new zzbd(str, d10, d11, i11 / this.zze, i11));
        }
        return arrayList;
    }
}
