package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbcd {
    public static void zza(String[] strArr, int i10, int i11, PriorityQueue priorityQueue) throws UnsupportedEncodingException {
        int length = strArr.length;
        if (length < 6) {
            zzb(i10, zze(strArr, 0, length), zzc(strArr, 0, length), length, priorityQueue);
            return;
        }
        long jZze = zze(strArr, 0, 6);
        zzb(i10, jZze, zzc(strArr, 0, 6), 6, priorityQueue);
        int i12 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i12 >= length2 - 5) {
                return;
            }
            long jZza = zzbca.zza(strArr[i12 - 1]);
            long jZza2 = zzbca.zza(strArr[i12 + 5]);
            String strZzc = zzc(strArr, i12, 6);
            jZze = (((jZza2 + 2147483647L) % 1073807359) + (((((jZze + 1073807359) - ((((jZza + 2147483647L) % 1073807359) * zzd(16785407L, 5)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
            zzb(i10, jZze, strZzc, length2, priorityQueue);
            i12++;
        }
    }

    public static void zzb(int i10, long j10, String str, int i11, PriorityQueue priorityQueue) {
        zzbcc zzbccVar = new zzbcc(j10, str, i11);
        if ((priorityQueue.size() != i10 || (((zzbcc) priorityQueue.peek()).zzc <= zzbccVar.zzc && ((zzbcc) priorityQueue.peek()).zza <= zzbccVar.zza)) && !priorityQueue.contains(zzbccVar)) {
            priorityQueue.add(zzbccVar);
            if (priorityQueue.size() > i10) {
                priorityQueue.poll();
            }
        }
    }

    public static String zzc(String[] strArr, int i10, int i11) {
        int i12 = i11 + i10;
        if (strArr.length < i12) {
            int i13 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to construct shingle");
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i14 = i12 - 1;
            if (i10 >= i14) {
                sb2.append(strArr[i14]);
                return sb2.toString();
            }
            sb2.append(strArr[i10]);
            sb2.append(' ');
            i10++;
        }
    }

    public static long zzd(long j10, int i10) {
        if (i10 == 1) {
            return j10;
        }
        int i11 = i10 >> 1;
        long j11 = (j10 * j10) % 1073807359;
        return (i10 & 1) == 0 ? zzd(j11, i11) % 1073807359 : ((zzd(j11, i11) % 1073807359) * j10) % 1073807359;
    }

    private static long zze(String[] strArr, int i10, int i11) {
        long jZza = (zzbca.zza(strArr[0]) + 2147483647L) % 1073807359;
        for (int i12 = 1; i12 < i11; i12++) {
            jZza = (((zzbca.zza(strArr[i12]) + 2147483647L) % 1073807359) + ((jZza * 16785407) % 1073807359)) % 1073807359;
        }
        return jZza;
    }
}
