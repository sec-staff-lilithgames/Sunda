package com.google.android.gms.internal.measurement;

import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zznz {
    public static final /* synthetic */ int zza = 0;
    private static final zzoi zzb;

    static {
        int i10 = zznu.zza;
        zzb = new zzok();
    }

    public static zzoi zzA() {
        return zzb;
    }

    public static boolean zzB(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzC(zzls zzlsVar, Object obj, Object obj2) {
        if (((zzmc) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzD(zzoi zzoiVar, Object obj, Object obj2) {
        zzmf zzmfVar = (zzmf) obj;
        zzoj zzojVarZzc = zzmfVar.zzc;
        zzoj zzojVar = ((zzmf) obj2).zzc;
        if (!zzoj.zza().equals(zzojVar)) {
            if (zzoj.zza().equals(zzojVarZzc)) {
                zzojVarZzc = zzoj.zzc(zzojVarZzc, zzojVar);
            } else {
                zzojVarZzc.zzl(zzojVar);
            }
        }
        zzmfVar.zzc = zzojVarZzc;
    }

    public static Object zzE(Object obj, int i10, int i11, Object obj2, zzoi zzoiVar) {
        if (obj2 == null) {
            obj2 = zzoiVar.zza(obj);
        }
        ((zzoj) obj2).zzk(i10 << 3, Long.valueOf(i11));
        return obj2;
    }

    public static void zza(int i10, List list, zzov zzovVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzC(i10, list, z10);
    }

    public static void zzb(int i10, List list, zzov zzovVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzB(i10, list, z10);
    }

    public static void zzc(int i10, List list, zzov zzovVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzy(i10, list, z10);
    }

    public static void zzd(int i10, List list, zzov zzovVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzz(i10, list, z10);
    }

    public static void zze(int i10, List list, zzov zzovVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzL(i10, list, z10);
    }

    public static void zzf(int i10, List list, zzov zzovVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzA(i10, list, z10);
    }

    public static void zzg(int i10, List list, zzov zzovVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzJ(i10, list, z10);
    }

    public static void zzh(int i10, List list, zzov zzovVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzw(i10, list, z10);
    }

    public static void zzi(int i10, List list, zzov zzovVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzH(i10, list, z10);
    }

    public static void zzj(int i10, List list, zzov zzovVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzK(i10, list, z10);
    }

    public static void zzk(int i10, List list, zzov zzovVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzx(i10, list, z10);
    }

    public static void zzl(int i10, List list, zzov zzovVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzI(i10, list, z10);
    }

    public static void zzm(int i10, List list, zzov zzovVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzD(i10, list, z10);
    }

    public static void zzn(int i10, List list, zzov zzovVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzE(i10, list, z10);
    }

    public static int zzo(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzna)) {
            int iZzA = 0;
            while (i10 < size) {
                iZzA += zzlm.zzA(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iZzA;
        }
        zzna zznaVar = (zzna) list;
        int iZzA2 = 0;
        while (i10 < size) {
            iZzA2 += zzlm.zzA(zznaVar.zzc(i10));
            i10++;
        }
        return iZzA2;
    }

    public static int zzp(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzna)) {
            int iZzA = 0;
            while (i10 < size) {
                iZzA += zzlm.zzA(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iZzA;
        }
        zzna zznaVar = (zzna) list;
        int iZzA2 = 0;
        while (i10 < size) {
            iZzA2 += zzlm.zzA(zznaVar.zzc(i10));
            i10++;
        }
        return iZzA2;
    }

    public static int zzq(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzna)) {
            int iZzA = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iZzA += zzlm.zzA((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return iZzA;
        }
        zzna zznaVar = (zzna) list;
        int iZzA2 = 0;
        while (i10 < size) {
            long jZzc = zznaVar.zzc(i10);
            iZzA2 += zzlm.zzA((jZzc >> 63) ^ (jZzc + jZzc));
            i10++;
        }
        return iZzA2;
    }

    public static int zzr(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzmg)) {
            int iZzA = 0;
            while (i10 < size) {
                iZzA += zzlm.zzA(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iZzA;
        }
        zzmg zzmgVar = (zzmg) list;
        int iZzA2 = 0;
        while (i10 < size) {
            iZzA2 += zzlm.zzA(zzmgVar.zzf(i10));
            i10++;
        }
        return iZzA2;
    }

    public static int zzs(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzmg)) {
            int iZzA = 0;
            while (i10 < size) {
                iZzA += zzlm.zzA(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iZzA;
        }
        zzmg zzmgVar = (zzmg) list;
        int iZzA2 = 0;
        while (i10 < size) {
            iZzA2 += zzlm.zzA(zzmgVar.zzf(i10));
            i10++;
        }
        return iZzA2;
    }

    public static int zzt(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzmg)) {
            int iZzz = 0;
            while (i10 < size) {
                iZzz += zzlm.zzz(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iZzz;
        }
        zzmg zzmgVar = (zzmg) list;
        int iZzz2 = 0;
        while (i10 < size) {
            iZzz2 += zzlm.zzz(zzmgVar.zzf(i10));
            i10++;
        }
        return iZzz2;
    }

    public static int zzu(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzmg)) {
            int iZzz = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iZzz += zzlm.zzz((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return iZzz;
        }
        zzmg zzmgVar = (zzmg) list;
        int iZzz2 = 0;
        while (i10 < size) {
            int iZzf = zzmgVar.zzf(i10);
            iZzz2 += zzlm.zzz((iZzf >> 31) ^ (iZzf + iZzf));
            i10++;
        }
        return iZzz2;
    }

    public static int zzv(List list) {
        return list.size() * 4;
    }

    public static int zzw(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzlm.zzz(i10 << 3) + 4) * size;
    }

    public static int zzx(List list) {
        return list.size() * 8;
    }

    public static int zzy(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzlm.zzz(i10 << 3) + 8) * size;
    }

    public static int zzz(int i10, Object obj, zznx zznxVar) {
        int i11 = i10 << 3;
        if (!(obj instanceof zzmw)) {
            return zzlm.zzD((zznm) obj, zznxVar) + zzlm.zzz(i11);
        }
        int iZzz = zzlm.zzz(i11);
        int iZzb = ((zzmw) obj).zzb();
        return a.C(iZzb, iZzb, iZzz);
    }
}
