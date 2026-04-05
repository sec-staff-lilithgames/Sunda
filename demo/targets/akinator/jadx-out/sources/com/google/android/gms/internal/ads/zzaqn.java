package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzaqn {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    public zzaqn(String str, zzapd zzapdVar) {
        String str2 = zzapdVar.zzb;
        long j10 = zzapdVar.zzc;
        long j11 = zzapdVar.zzd;
        long j12 = zzapdVar.zze;
        long j13 = zzapdVar.zzf;
        List arrayList = zzapdVar.zzh;
        if (arrayList == 0) {
            Map map = zzapdVar.zzg;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new zzapm((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j10, j11, j12, j13, arrayList);
    }

    public static zzaqn zza(zzaqo zzaqoVar) throws IOException {
        if (zzaqq.zzi(zzaqoVar) != 538247942) {
            throw new IOException();
        }
        String strZzm = zzaqq.zzm(zzaqoVar);
        String strZzm2 = zzaqq.zzm(zzaqoVar);
        long jZzk = zzaqq.zzk(zzaqoVar);
        long jZzk2 = zzaqq.zzk(zzaqoVar);
        long jZzk3 = zzaqq.zzk(zzaqoVar);
        long jZzk4 = zzaqq.zzk(zzaqoVar);
        int iZzi = zzaqq.zzi(zzaqoVar);
        if (iZzi < 0) {
            throw new IOException(o2.l(iZzi, "readHeaderList size=", new StringBuilder(String.valueOf(iZzi).length() + 20)));
        }
        List arrayList = iZzi == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i10 = 0; i10 < iZzi; i10++) {
            arrayList.add(new zzapm(zzaqq.zzm(zzaqoVar).intern(), zzaqq.zzm(zzaqoVar).intern()));
        }
        return new zzaqn(strZzm, strZzm2, jZzk, jZzk2, jZzk3, jZzk4, arrayList);
    }

    private zzaqn(String str, String str2, long j10, long j11, long j12, long j13, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j10;
        this.zze = j11;
        this.zzf = j12;
        this.zzg = j13;
        this.zzh = list;
    }
}
