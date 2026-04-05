package com.google.android.gms.internal.gtm;

import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzadz {
    public static final /* synthetic */ int zza = 0;
    private static final zzaem zzb;

    static {
        int i10 = zzadt.zza;
        zzb = new zzaeo();
    }

    public static void zzA(int i10, List list, zzaez zzaezVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaezVar.zzu(i10, list, z10);
    }

    public static void zzB(int i10, List list, zzaez zzaezVar, zzadx zzadxVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((zzzj) zzaezVar).zzv(i10, list.get(i11), zzadxVar);
        }
    }

    public static void zzC(int i10, List list, zzaez zzaezVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaezVar.zzy(i10, list, z10);
    }

    public static void zzD(int i10, List list, zzaez zzaezVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaezVar.zzA(i10, list, z10);
    }

    public static void zzE(int i10, List list, zzaez zzaezVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaezVar.zzC(i10, list, z10);
    }

    public static void zzF(int i10, List list, zzaez zzaezVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaezVar.zzE(i10, list, z10);
    }

    public static void zzG(int i10, List list, zzaez zzaezVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaezVar.zzH(i10, list);
    }

    public static void zzH(int i10, List list, zzaez zzaezVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaezVar.zzJ(i10, list, z10);
    }

    public static void zzI(int i10, List list, zzaez zzaezVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaezVar.zzL(i10, list, z10);
    }

    public static boolean zzJ(Object obj, Object obj2) {
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
        if (!(list instanceof zzacg)) {
            int iZzD = 0;
            while (i10 < size) {
                iZzD += zzzi.zzD(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iZzD;
        }
        zzacg zzacgVar = (zzacg) list;
        int iZzD2 = 0;
        while (i10 < size) {
            iZzD2 += zzzi.zzD(zzacgVar.zze(i10));
            i10++;
        }
        return iZzD2;
    }

    public static int zzb(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzzi.zzC(i10 << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzzi.zzC(i10 << 3) + 8) * size;
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
        if (!(list instanceof zzacg)) {
            int iZzD = 0;
            while (i10 < size) {
                iZzD += zzzi.zzD(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iZzD;
        }
        zzacg zzacgVar = (zzacg) list;
        int iZzD2 = 0;
        while (i10 < size) {
            iZzD2 += zzzi.zzD(zzacgVar.zze(i10));
            i10++;
        }
        return iZzD2;
    }

    public static int zzg(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzada)) {
            int iZzD = 0;
            while (i10 < size) {
                iZzD += zzzi.zzD(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iZzD;
        }
        zzada zzadaVar = (zzada) list;
        int iZzD2 = 0;
        while (i10 < size) {
            iZzD2 += zzzi.zzD(zzadaVar.zze(i10));
            i10++;
        }
        return iZzD2;
    }

    public static int zzh(int i10, Object obj, zzadx zzadxVar) {
        int i11 = i10 << 3;
        if (!(obj instanceof zzacw)) {
            return zzzi.zzA((zzadl) obj, zzadxVar) + zzzi.zzC(i11);
        }
        int iZzC = zzzi.zzC(i11);
        int iZza = ((zzacw) obj).zza();
        return a.B(iZza, iZza, iZzC);
    }

    public static int zzi(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzacg)) {
            int iZzC = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iZzC += zzzi.zzC((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return iZzC;
        }
        zzacg zzacgVar = (zzacg) list;
        int iZzC2 = 0;
        while (i10 < size) {
            int iZze = zzacgVar.zze(i10);
            iZzC2 += zzzi.zzC((iZze >> 31) ^ (iZze + iZze));
            i10++;
        }
        return iZzC2;
    }

    public static int zzj(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzada)) {
            int iZzD = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iZzD += zzzi.zzD((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return iZzD;
        }
        zzada zzadaVar = (zzada) list;
        int iZzD2 = 0;
        while (i10 < size) {
            long jZze = zzadaVar.zze(i10);
            iZzD2 += zzzi.zzD((jZze >> 63) ^ (jZze + jZze));
            i10++;
        }
        return iZzD2;
    }

    public static int zzk(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzacg)) {
            int iZzC = 0;
            while (i10 < size) {
                iZzC += zzzi.zzC(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iZzC;
        }
        zzacg zzacgVar = (zzacg) list;
        int iZzC2 = 0;
        while (i10 < size) {
            iZzC2 += zzzi.zzC(zzacgVar.zze(i10));
            i10++;
        }
        return iZzC2;
    }

    public static int zzl(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzada)) {
            int iZzD = 0;
            while (i10 < size) {
                iZzD += zzzi.zzD(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iZzD;
        }
        zzada zzadaVar = (zzada) list;
        int iZzD2 = 0;
        while (i10 < size) {
            iZzD2 += zzzi.zzD(zzadaVar.zze(i10));
            i10++;
        }
        return iZzD2;
    }

    public static zzaem zzm() {
        return zzb;
    }

    public static Object zzn(Object obj, int i10, List list, zzacj zzacjVar, Object obj2, zzaem zzaemVar) {
        if (zzacjVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zzacjVar.zza(iIntValue)) {
                    obj2 = zzo(obj, i10, iIntValue, obj2, zzaemVar);
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
            if (zzacjVar.zza(iIntValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                obj2 = zzo(obj, i10, iIntValue2, obj2, zzaemVar);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return obj2;
    }

    public static Object zzo(Object obj, int i10, int i11, Object obj2, zzaem zzaemVar) {
        if (obj2 == null) {
            obj2 = zzaemVar.zza(obj);
        }
        zzaemVar.zzh(obj2, i10, i11);
        return obj2;
    }

    public static void zzp(zzabr zzabrVar, Object obj, Object obj2) {
        zzabv zzabvVar = ((zzacc) obj2).zza;
        if (zzabvVar.zza.isEmpty()) {
            return;
        }
        ((zzacc) obj).zzU().zzj(zzabvVar);
    }

    public static void zzq(zzaem zzaemVar, Object obj, Object obj2) {
        zzacf zzacfVar = (zzacf) obj;
        zzaen zzaenVarZze = zzacfVar.zzc;
        zzaen zzaenVar = ((zzacf) obj2).zzc;
        if (!zzaen.zzc().equals(zzaenVar)) {
            if (zzaen.zzc().equals(zzaenVarZze)) {
                zzaenVarZze = zzaen.zze(zzaenVarZze, zzaenVar);
            } else {
                zzaenVarZze.zzd(zzaenVar);
            }
        }
        zzacfVar.zzc = zzaenVarZze;
    }

    public static void zzr(int i10, List list, zzaez zzaezVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaezVar.zzc(i10, list, z10);
    }

    public static void zzs(int i10, List list, zzaez zzaezVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaezVar.zze(i10, list);
    }

    public static void zzt(int i10, List list, zzaez zzaezVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaezVar.zzg(i10, list, z10);
    }

    public static void zzu(int i10, List list, zzaez zzaezVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaezVar.zzj(i10, list, z10);
    }

    public static void zzv(int i10, List list, zzaez zzaezVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaezVar.zzl(i10, list, z10);
    }

    public static void zzw(int i10, List list, zzaez zzaezVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaezVar.zzn(i10, list, z10);
    }

    public static void zzx(int i10, List list, zzaez zzaezVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaezVar.zzp(i10, list, z10);
    }

    public static void zzy(int i10, List list, zzaez zzaezVar, zzadx zzadxVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((zzzj) zzaezVar).zzq(i10, list.get(i11), zzadxVar);
        }
    }

    public static void zzz(int i10, List list, zzaez zzaezVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaezVar.zzs(i10, list, z10);
    }
}
