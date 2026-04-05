package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhyt {
    public static final /* synthetic */ int zza = 0;
    private static final zzhzc zzb;

    static {
        int i10 = zzhuv.zza;
        zzb = new zzhze();
    }

    public static int zzA(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzhvt.zzA(i10 << 3) + 4) * size;
    }

    public static int zzB(List list) {
        return list.size() * 8;
    }

    public static int zzC(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzhvt.zzA(i10 << 3) + 8) * size;
    }

    public static int zzD(int i10, Object obj, zzhyr zzhyrVar) {
        int i11 = i10 << 3;
        if (obj instanceof zzhxj) {
            int iZzA = zzhvt.zzA(i11);
            int iZzb = ((zzhxj) obj).zzb();
            return com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.b(iZzb, iZzb, iZzA);
        }
        int iZzA2 = zzhvt.zzA(i11);
        int iZzaT = ((zzhur) obj).zzaT(zzhyrVar);
        return com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.b(iZzaT, iZzaT, iZzA2);
    }

    @Deprecated
    public static int zzE(int i10, zzhxz zzhxzVar, zzhyr zzhyrVar) {
        int iZzA = zzhvt.zzA(i10 << 3);
        return ((zzhur) zzhxzVar).zzaT(zzhyrVar) + iZzA + iZzA;
    }

    public static zzhzc zzF() {
        return zzb;
    }

    public static boolean zzG(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzH(zzhvz zzhvzVar, Object obj, Object obj2) {
        if (((zzhwk) obj2).zza.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzI(zzhzc zzhzcVar, Object obj, Object obj2) {
        zzhwo zzhwoVar = (zzhwo) obj;
        zzhzd zzhzdVarZzc = zzhwoVar.zzt;
        zzhzd zzhzdVar = ((zzhwo) obj2).zzt;
        if (!zzhzd.zza().equals(zzhzdVar)) {
            if (zzhzd.zza().equals(zzhzdVarZzc)) {
                zzhzdVarZzc = zzhzd.zzc(zzhzdVarZzc, zzhzdVar);
            } else {
                zzhzdVarZzc.zzm(zzhzdVar);
            }
        }
        zzhwoVar.zzt = zzhzdVarZzc;
    }

    public static Object zzJ(Object obj, int i10, List list, zzhwu zzhwuVar, Object obj2, zzhzc zzhzcVar) {
        if (zzhwuVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zzhwuVar.zza(iIntValue)) {
                    obj2 = zzK(obj, i10, iIntValue, obj2, zzhzcVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) list.get(i12);
            int iIntValue2 = num.intValue();
            if (zzhwuVar.zza(iIntValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                obj2 = zzK(obj, i10, iIntValue2, obj2, zzhzcVar);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return obj2;
    }

    public static Object zzK(Object obj, int i10, int i11, Object obj2, zzhzc zzhzcVar) {
        if (obj2 == null) {
            obj2 = zzhzcVar.zzh(obj);
        }
        zzhzcVar.zza(obj2, i10, i11);
        return obj2;
    }

    public static void zza(int i10, List list, zzhzr zzhzrVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhzrVar.zzC(i10, list, z10);
    }

    public static void zzb(int i10, List list, zzhzr zzhzrVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhzrVar.zzB(i10, list, z10);
    }

    public static void zzc(int i10, List list, zzhzr zzhzrVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhzrVar.zzy(i10, list, z10);
    }

    public static void zzd(int i10, List list, zzhzr zzhzrVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhzrVar.zzz(i10, list, z10);
    }

    public static void zze(int i10, List list, zzhzr zzhzrVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhzrVar.zzL(i10, list, z10);
    }

    public static void zzf(int i10, List list, zzhzr zzhzrVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhzrVar.zzA(i10, list, z10);
    }

    public static void zzg(int i10, List list, zzhzr zzhzrVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhzrVar.zzJ(i10, list, z10);
    }

    public static void zzh(int i10, List list, zzhzr zzhzrVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhzrVar.zzw(i10, list, z10);
    }

    public static void zzi(int i10, List list, zzhzr zzhzrVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhzrVar.zzH(i10, list, z10);
    }

    public static void zzj(int i10, List list, zzhzr zzhzrVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhzrVar.zzK(i10, list, z10);
    }

    public static void zzk(int i10, List list, zzhzr zzhzrVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhzrVar.zzx(i10, list, z10);
    }

    public static void zzl(int i10, List list, zzhzr zzhzrVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhzrVar.zzI(i10, list, z10);
    }

    public static void zzm(int i10, List list, zzhzr zzhzrVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhzrVar.zzD(i10, list, z10);
    }

    public static void zzn(int i10, List list, zzhzr zzhzrVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhzrVar.zzE(i10, list, z10);
    }

    public static void zzo(int i10, List list, zzhzr zzhzrVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhzrVar.zzF(i10, list);
    }

    public static void zzp(int i10, List list, zzhzr zzhzrVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhzrVar.zzG(i10, list);
    }

    public static void zzq(int i10, List list, zzhzr zzhzrVar, zzhyr zzhyrVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((zzhvu) zzhzrVar).zzr(i10, list.get(i11), zzhyrVar);
        }
    }

    public static void zzr(int i10, List list, zzhzr zzhzrVar, zzhyr zzhyrVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((zzhvu) zzhzrVar).zzs(i10, list.get(i11), zzhyrVar);
        }
    }

    public static int zzs(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhxn)) {
            int iZzB = 0;
            while (i10 < size) {
                iZzB += zzhvt.zzB(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iZzB;
        }
        zzhxn zzhxnVar = (zzhxn) list;
        int iZzB2 = 0;
        while (i10 < size) {
            iZzB2 += zzhvt.zzB(zzhxnVar.zzc(i10));
            i10++;
        }
        return iZzB2;
    }

    public static int zzt(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhxn)) {
            int iZzB = 0;
            while (i10 < size) {
                iZzB += zzhvt.zzB(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iZzB;
        }
        zzhxn zzhxnVar = (zzhxn) list;
        int iZzB2 = 0;
        while (i10 < size) {
            iZzB2 += zzhvt.zzB(zzhxnVar.zzc(i10));
            i10++;
        }
        return iZzB2;
    }

    public static int zzu(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhxn)) {
            int iZzB = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iZzB += zzhvt.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return iZzB;
        }
        zzhxn zzhxnVar = (zzhxn) list;
        int iZzB2 = 0;
        while (i10 < size) {
            long jZzc = zzhxnVar.zzc(i10);
            iZzB2 += zzhvt.zzB((jZzc >> 63) ^ (jZzc + jZzc));
            i10++;
        }
        return iZzB2;
    }

    public static int zzv(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhwp)) {
            int iZzB = 0;
            while (i10 < size) {
                iZzB += zzhvt.zzB(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iZzB;
        }
        zzhwp zzhwpVar = (zzhwp) list;
        int iZzB2 = 0;
        while (i10 < size) {
            iZzB2 += zzhvt.zzB(zzhwpVar.zzf(i10));
            i10++;
        }
        return iZzB2;
    }

    public static int zzw(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhwp)) {
            int iZzB = 0;
            while (i10 < size) {
                iZzB += zzhvt.zzB(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iZzB;
        }
        zzhwp zzhwpVar = (zzhwp) list;
        int iZzB2 = 0;
        while (i10 < size) {
            iZzB2 += zzhvt.zzB(zzhwpVar.zzf(i10));
            i10++;
        }
        return iZzB2;
    }

    public static int zzx(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhwp)) {
            int iZzA = 0;
            while (i10 < size) {
                iZzA += zzhvt.zzA(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iZzA;
        }
        zzhwp zzhwpVar = (zzhwp) list;
        int iZzA2 = 0;
        while (i10 < size) {
            iZzA2 += zzhvt.zzA(zzhwpVar.zzf(i10));
            i10++;
        }
        return iZzA2;
    }

    public static int zzy(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhwp)) {
            int iZzA = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iZzA += zzhvt.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return iZzA;
        }
        zzhwp zzhwpVar = (zzhwp) list;
        int iZzA2 = 0;
        while (i10 < size) {
            int iZzf = zzhwpVar.zzf(i10);
            iZzA2 += zzhvt.zzA((iZzf >> 31) ^ (iZzf + iZzf));
            i10++;
        }
        return iZzA2;
    }

    public static int zzz(List list) {
        return list.size() * 4;
    }
}
