package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zziz {
    public static final /* synthetic */ int zza = 0;
    private static final zzjj zzb;

    static {
        int i10 = zziu.zza;
        zzb = new zzjl();
    }

    public static void zzA(int i10, List list, zzjw zzjwVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzC(i10, list, z10);
    }

    public static void zzB(int i10, List list, zzjw zzjwVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzE(i10, list, z10);
    }

    public static void zzC(int i10, List list, zzjw zzjwVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzJ(i10, list, z10);
    }

    public static void zzD(int i10, List list, zzjw zzjwVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzL(i10, list, z10);
    }

    public static boolean zzE(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhl)) {
            int iZzA = 0;
            while (i10 < size) {
                iZzA += zzgr.zzA(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iZzA;
        }
        zzhl zzhlVar = (zzhl) list;
        int iZzA2 = 0;
        while (i10 < size) {
            iZzA2 += zzgr.zzA(zzhlVar.zze(i10));
            i10++;
        }
        return iZzA2;
    }

    public static int zzb(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgr.zzz(i10 << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgr.zzz(i10 << 3) + 8) * size;
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhl)) {
            int iZzA = 0;
            while (i10 < size) {
                iZzA += zzgr.zzA(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iZzA;
        }
        zzhl zzhlVar = (zzhl) list;
        int iZzA2 = 0;
        while (i10 < size) {
            iZzA2 += zzgr.zzA(zzhlVar.zze(i10));
            i10++;
        }
        return iZzA2;
    }

    public static int zzg(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzib)) {
            int iZzA = 0;
            while (i10 < size) {
                iZzA += zzgr.zzA(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iZzA;
        }
        zzib zzibVar = (zzib) list;
        int iZzA2 = 0;
        while (i10 < size) {
            iZzA2 += zzgr.zzA(zzibVar.zze(i10));
            i10++;
        }
        return iZzA2;
    }

    public static int zzh(int i10, Object obj, zzix zzixVar) {
        int i11 = i10 << 3;
        if (!(obj instanceof zzhx)) {
            return zzgr.zzx((zzim) obj, zzixVar) + zzgr.zzz(i11);
        }
        int iZzz = zzgr.zzz(i11);
        int iZza = ((zzhx) obj).zza();
        return a.b(iZza, iZza, iZzz);
    }

    public static int zzi(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhl)) {
            int iZzz = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iZzz += zzgr.zzz((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return iZzz;
        }
        zzhl zzhlVar = (zzhl) list;
        int iZzz2 = 0;
        while (i10 < size) {
            int iZze = zzhlVar.zze(i10);
            iZzz2 += zzgr.zzz((iZze >> 31) ^ (iZze + iZze));
            i10++;
        }
        return iZzz2;
    }

    public static int zzj(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzib)) {
            int iZzA = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iZzA += zzgr.zzA((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return iZzA;
        }
        zzib zzibVar = (zzib) list;
        int iZzA2 = 0;
        while (i10 < size) {
            long jZze = zzibVar.zze(i10);
            iZzA2 += zzgr.zzA((jZze >> 63) ^ (jZze + jZze));
            i10++;
        }
        return iZzA2;
    }

    public static int zzk(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhl)) {
            int iZzz = 0;
            while (i10 < size) {
                iZzz += zzgr.zzz(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iZzz;
        }
        zzhl zzhlVar = (zzhl) list;
        int iZzz2 = 0;
        while (i10 < size) {
            iZzz2 += zzgr.zzz(zzhlVar.zze(i10));
            i10++;
        }
        return iZzz2;
    }

    public static int zzl(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzib)) {
            int iZzA = 0;
            while (i10 < size) {
                iZzA += zzgr.zzA(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iZzA;
        }
        zzib zzibVar = (zzib) list;
        int iZzA2 = 0;
        while (i10 < size) {
            iZzA2 += zzgr.zzA(zzibVar.zze(i10));
            i10++;
        }
        return iZzA2;
    }

    public static zzjj zzm() {
        return zzb;
    }

    public static Object zzn(Object obj, int i10, int i11, Object obj2, zzjj zzjjVar) {
        Object obj3 = obj2;
        if (obj2 == null) {
            zzhk zzhkVar = (zzhk) obj;
            zzjk zzjkVar = zzhkVar.zzc;
            obj3 = zzjkVar;
            if (zzjkVar == zzjk.zzc()) {
                zzjk zzjkVarZzf = zzjk.zzf();
                zzhkVar.zzc = zzjkVarZzf;
                obj3 = zzjkVarZzf;
            }
        }
        ((zzjk) obj3).zzj(i10 << 3, Long.valueOf(i11));
        return obj3;
    }

    public static void zzo(zzgx zzgxVar, Object obj, Object obj2) {
        if (((zzhh) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzp(zzjj zzjjVar, Object obj, Object obj2) {
        zzhk zzhkVar = (zzhk) obj;
        zzjk zzjkVarZze = zzhkVar.zzc;
        zzjk zzjkVar = ((zzhk) obj2).zzc;
        if (!zzjk.zzc().equals(zzjkVar)) {
            if (zzjk.zzc().equals(zzjkVarZze)) {
                zzjkVarZze = zzjk.zze(zzjkVarZze, zzjkVar);
            } else {
                zzjkVarZze.zzd(zzjkVar);
            }
        }
        zzhkVar.zzc = zzjkVarZze;
    }

    public static void zzq(int i10, List list, zzjw zzjwVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzc(i10, list, z10);
    }

    public static void zzr(int i10, List list, zzjw zzjwVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzg(i10, list, z10);
    }

    public static void zzs(int i10, List list, zzjw zzjwVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzj(i10, list, z10);
    }

    public static void zzt(int i10, List list, zzjw zzjwVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzl(i10, list, z10);
    }

    public static void zzu(int i10, List list, zzjw zzjwVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzn(i10, list, z10);
    }

    public static void zzv(int i10, List list, zzjw zzjwVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzp(i10, list, z10);
    }

    public static void zzw(int i10, List list, zzjw zzjwVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzs(i10, list, z10);
    }

    public static void zzx(int i10, List list, zzjw zzjwVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzu(i10, list, z10);
    }

    public static void zzy(int i10, List list, zzjw zzjwVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzy(i10, list, z10);
    }

    public static void zzz(int i10, List list, zzjw zzjwVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjwVar.zzA(i10, list, z10);
    }
}
