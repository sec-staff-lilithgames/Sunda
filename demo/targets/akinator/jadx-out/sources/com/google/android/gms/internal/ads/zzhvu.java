package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhvu implements zzhzr {
    private final zzhvt zza;

    private zzhvu(zzhvt zzhvtVar) {
        zzhxb.zza(zzhvtVar, "output");
        this.zza = zzhvtVar;
        zzhvtVar.zze = this;
    }

    public static zzhvu zza(zzhvt zzhvtVar) {
        Object obj = zzhvtVar.zze;
        return obj != null ? (zzhvu) obj : new zzhvu(zzhvtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzA(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzhxn)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzhvt zzhvtVar = this.zza;
            zzhvtVar.zzJ(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            zzhvtVar.zzs(i12);
            while (i11 < list.size()) {
                zzhvtVar.zzv(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzhxn zzhxnVar = (zzhxn) list;
        if (!z10) {
            while (i11 < zzhxnVar.size()) {
                this.zza.zzh(i10, zzhxnVar.zzc(i11));
                i11++;
            }
            return;
        }
        zzhvt zzhvtVar2 = this.zza;
        zzhvtVar2.zzJ(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzhxnVar.size(); i15++) {
            zzhxnVar.zzc(i15);
            i14 += 8;
        }
        zzhvtVar2.zzs(i14);
        while (i11 < zzhxnVar.size()) {
            zzhvtVar2.zzv(zzhxnVar.zzc(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzB(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzhwf)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzM(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            zzhvt zzhvtVar = this.zza;
            zzhvtVar.zzJ(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).getClass();
                i12 += 4;
            }
            zzhvtVar.zzs(i12);
            while (i11 < list.size()) {
                zzhvtVar.zzt(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        zzhwf zzhwfVar = (zzhwf) list;
        if (!z10) {
            while (i11 < zzhwfVar.size()) {
                this.zza.zzM(i10, Float.floatToRawIntBits(zzhwfVar.zzf(i11)));
                i11++;
            }
            return;
        }
        zzhvt zzhvtVar2 = this.zza;
        zzhvtVar2.zzJ(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzhwfVar.size(); i15++) {
            zzhwfVar.zzf(i15);
            i14 += 4;
        }
        zzhvtVar2.zzs(i14);
        while (i11 < zzhwfVar.size()) {
            zzhvtVar2.zzt(Float.floatToRawIntBits(zzhwfVar.zzf(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzC(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzhvv)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            zzhvt zzhvtVar = this.zza;
            zzhvtVar.zzJ(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).getClass();
                i12 += 8;
            }
            zzhvtVar.zzs(i12);
            while (i11 < list.size()) {
                zzhvtVar.zzv(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        zzhvv zzhvvVar = (zzhvv) list;
        if (!z10) {
            while (i11 < zzhvvVar.size()) {
                this.zza.zzh(i10, Double.doubleToRawLongBits(zzhvvVar.zzf(i11)));
                i11++;
            }
            return;
        }
        zzhvt zzhvtVar2 = this.zza;
        zzhvtVar2.zzJ(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzhvvVar.size(); i15++) {
            zzhvvVar.zzf(i15);
            i14 += 8;
        }
        zzhvtVar2.zzs(i14);
        while (i11 < zzhvvVar.size()) {
            zzhvtVar2.zzv(Double.doubleToRawLongBits(zzhvvVar.zzf(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzD(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzhwp)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzK(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzhvt zzhvtVar = this.zza;
            zzhvtVar.zzJ(i10, 2);
            int iZzB = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzB += zzhvt.zzB(((Integer) list.get(i12)).intValue());
            }
            zzhvtVar.zzs(iZzB);
            while (i11 < list.size()) {
                zzhvtVar.zzr(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzhwp zzhwpVar = (zzhwp) list;
        if (!z10) {
            while (i11 < zzhwpVar.size()) {
                this.zza.zzK(i10, zzhwpVar.zzf(i11));
                i11++;
            }
            return;
        }
        zzhvt zzhvtVar2 = this.zza;
        zzhvtVar2.zzJ(i10, 2);
        int iZzB2 = 0;
        for (int i13 = 0; i13 < zzhwpVar.size(); i13++) {
            iZzB2 += zzhvt.zzB(zzhwpVar.zzf(i13));
        }
        zzhvtVar2.zzs(iZzB2);
        while (i11 < zzhwpVar.size()) {
            zzhvtVar2.zzr(zzhwpVar.zzf(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzE(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzhuy)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzi(i10, ((Boolean) list.get(i11)).booleanValue());
                    i11++;
                }
                return;
            }
            zzhvt zzhvtVar = this.zza;
            zzhvtVar.zzJ(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).getClass();
                i12++;
            }
            zzhvtVar.zzs(i12);
            while (i11 < list.size()) {
                zzhvtVar.zzq(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        zzhuy zzhuyVar = (zzhuy) list;
        if (!z10) {
            while (i11 < zzhuyVar.size()) {
                this.zza.zzi(i10, zzhuyVar.zzf(i11));
                i11++;
            }
            return;
        }
        zzhvt zzhvtVar2 = this.zza;
        zzhvtVar2.zzJ(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzhuyVar.size(); i15++) {
            zzhuyVar.zzf(i15);
            i14++;
        }
        zzhvtVar2.zzs(i14);
        while (i11 < zzhuyVar.size()) {
            zzhvtVar2.zzq(zzhuyVar.zzf(i11) ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzF(int i10, List list) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzhxk)) {
            while (i11 < list.size()) {
                this.zza.zzj(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        zzhxk zzhxkVar = (zzhxk) list;
        while (i11 < list.size()) {
            Object objZzc = zzhxkVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzj(i10, (String) objZzc);
            } else {
                this.zza.zzk(i10, (zzhvi) objZzc);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzG(int i10, List list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zzk(i10, (zzhvi) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzH(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzhwp)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzL(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzhvt zzhvtVar = this.zza;
            zzhvtVar.zzJ(i10, 2);
            int iZzA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzA += zzhvt.zzA(((Integer) list.get(i12)).intValue());
            }
            zzhvtVar.zzs(iZzA);
            while (i11 < list.size()) {
                zzhvtVar.zzs(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzhwp zzhwpVar = (zzhwp) list;
        if (!z10) {
            while (i11 < zzhwpVar.size()) {
                this.zza.zzL(i10, zzhwpVar.zzf(i11));
                i11++;
            }
            return;
        }
        zzhvt zzhvtVar2 = this.zza;
        zzhvtVar2.zzJ(i10, 2);
        int iZzA2 = 0;
        for (int i13 = 0; i13 < zzhwpVar.size(); i13++) {
            iZzA2 += zzhvt.zzA(zzhwpVar.zzf(i13));
        }
        zzhvtVar2.zzs(iZzA2);
        while (i11 < zzhwpVar.size()) {
            zzhvtVar2.zzs(zzhwpVar.zzf(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzI(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzhwp)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzM(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzhvt zzhvtVar = this.zza;
            zzhvtVar.zzJ(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            zzhvtVar.zzs(i12);
            while (i11 < list.size()) {
                zzhvtVar.zzt(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzhwp zzhwpVar = (zzhwp) list;
        if (!z10) {
            while (i11 < zzhwpVar.size()) {
                this.zza.zzM(i10, zzhwpVar.zzf(i11));
                i11++;
            }
            return;
        }
        zzhvt zzhvtVar2 = this.zza;
        zzhvtVar2.zzJ(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzhwpVar.size(); i15++) {
            zzhwpVar.zzf(i15);
            i14 += 4;
        }
        zzhvtVar2.zzs(i14);
        while (i11 < zzhwpVar.size()) {
            zzhvtVar2.zzt(zzhwpVar.zzf(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzJ(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzhxn)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzhvt zzhvtVar = this.zza;
            zzhvtVar.zzJ(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            zzhvtVar.zzs(i12);
            while (i11 < list.size()) {
                zzhvtVar.zzv(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzhxn zzhxnVar = (zzhxn) list;
        if (!z10) {
            while (i11 < zzhxnVar.size()) {
                this.zza.zzh(i10, zzhxnVar.zzc(i11));
                i11++;
            }
            return;
        }
        zzhvt zzhvtVar2 = this.zza;
        zzhvtVar2.zzJ(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzhxnVar.size(); i15++) {
            zzhxnVar.zzc(i15);
            i14 += 8;
        }
        zzhvtVar2.zzs(i14);
        while (i11 < zzhxnVar.size()) {
            zzhvtVar2.zzv(zzhxnVar.zzc(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzK(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzhwp)) {
            if (!z10) {
                while (i11 < list.size()) {
                    zzhvt zzhvtVar = this.zza;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    zzhvtVar.zzL(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            zzhvt zzhvtVar2 = this.zza;
            zzhvtVar2.zzJ(i10, 2);
            int iZzA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iZzA += zzhvt.zzA((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zzhvtVar2.zzs(iZzA);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                zzhvtVar2.zzs((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        zzhwp zzhwpVar = (zzhwp) list;
        if (!z10) {
            while (i11 < zzhwpVar.size()) {
                zzhvt zzhvtVar3 = this.zza;
                int iZzf = zzhwpVar.zzf(i11);
                zzhvtVar3.zzL(i10, (iZzf >> 31) ^ (iZzf + iZzf));
                i11++;
            }
            return;
        }
        zzhvt zzhvtVar4 = this.zza;
        zzhvtVar4.zzJ(i10, 2);
        int iZzA2 = 0;
        for (int i13 = 0; i13 < zzhwpVar.size(); i13++) {
            int iZzf2 = zzhwpVar.zzf(i13);
            iZzA2 += zzhvt.zzA((iZzf2 >> 31) ^ (iZzf2 + iZzf2));
        }
        zzhvtVar4.zzs(iZzA2);
        while (i11 < zzhwpVar.size()) {
            int iZzf3 = zzhwpVar.zzf(i11);
            zzhvtVar4.zzs((iZzf3 >> 31) ^ (iZzf3 + iZzf3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzL(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzhxn)) {
            if (!z10) {
                while (i11 < list.size()) {
                    zzhvt zzhvtVar = this.zza;
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    zzhvtVar.zzN(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            zzhvt zzhvtVar2 = this.zza;
            zzhvtVar2.zzJ(i10, 2);
            int iZzB = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iZzB += zzhvt.zzB((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zzhvtVar2.zzs(iZzB);
            while (i11 < list.size()) {
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                zzhvtVar2.zzu((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        zzhxn zzhxnVar = (zzhxn) list;
        if (!z10) {
            while (i11 < zzhxnVar.size()) {
                zzhvt zzhvtVar3 = this.zza;
                long jZzc = zzhxnVar.zzc(i11);
                zzhvtVar3.zzN(i10, (jZzc >> 63) ^ (jZzc + jZzc));
                i11++;
            }
            return;
        }
        zzhvt zzhvtVar4 = this.zza;
        zzhvtVar4.zzJ(i10, 2);
        int iZzB2 = 0;
        for (int i13 = 0; i13 < zzhxnVar.size(); i13++) {
            long jZzc2 = zzhxnVar.zzc(i13);
            iZzB2 += zzhvt.zzB((jZzc2 >> 63) ^ (jZzc2 + jZzc2));
        }
        zzhvtVar4.zzs(iZzB2);
        while (i11 < zzhxnVar.size()) {
            long jZzc3 = zzhxnVar.zzc(i11);
            zzhvtVar4.zzu((jZzc3 >> 63) ^ (jZzc3 + jZzc3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzM(int i10, zzhxr zzhxrVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            zzhvt zzhvtVar = this.zza;
            zzhvtVar.zzJ(i10, 2);
            zzhvtVar.zzs(zzhxs.zzc(zzhxrVar, entry.getKey(), entry.getValue()));
            zzhxs.zzb(zzhvtVar, zzhxrVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzb(int i10, int i11) throws IOException {
        this.zza.zzM(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzc(int i10, long j10) throws IOException {
        this.zza.zzN(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzd(int i10, long j10) throws IOException {
        this.zza.zzh(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zze(int i10, float f10) throws IOException {
        this.zza.zzM(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzf(int i10, double d10) throws IOException {
        this.zza.zzh(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzg(int i10, int i11) throws IOException {
        this.zza.zzK(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzh(int i10, long j10) throws IOException {
        this.zza.zzN(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzi(int i10, int i11) throws IOException {
        this.zza.zzK(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzj(int i10, long j10) throws IOException {
        this.zza.zzh(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzk(int i10, int i11) throws IOException {
        this.zza.zzM(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzl(int i10, boolean z10) throws IOException {
        this.zza.zzi(i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzm(int i10, String str) throws IOException {
        this.zza.zzj(i10, str);
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzn(int i10, zzhvi zzhviVar) throws IOException {
        this.zza.zzk(i10, zzhviVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzo(int i10, int i11) throws IOException {
        this.zza.zzL(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzp(int i10, int i11) throws IOException {
        this.zza.zzL(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzq(int i10, long j10) throws IOException {
        this.zza.zzN(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzr(int i10, Object obj, zzhyr zzhyrVar) throws IOException {
        zzhvt zzhvtVar = this.zza;
        zzhur zzhurVar = (zzhur) obj;
        zzhvtVar.zzJ(i10, 2);
        zzhvtVar.zzs(zzhurVar.zzaT(zzhyrVar));
        zzhyrVar.zzf(zzhurVar, this);
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzs(int i10, Object obj, zzhyr zzhyrVar) throws IOException {
        zzhvt zzhvtVar = this.zza;
        zzhvtVar.zzJ(i10, 3);
        zzhyrVar.zzf((zzhur) obj, this);
        zzhvtVar.zzJ(i10, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    @Deprecated
    public final void zzt(int i10) throws IOException {
        this.zza.zzJ(i10, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    @Deprecated
    public final void zzu(int i10) throws IOException {
        this.zza.zzJ(i10, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzv(int i10, Object obj) throws IOException {
        if (obj instanceof zzhvi) {
            this.zza.zzo(i10, (zzhvi) obj);
        } else {
            this.zza.zzn(i10, (zzhxz) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzw(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzhwp)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzK(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzhvt zzhvtVar = this.zza;
            zzhvtVar.zzJ(i10, 2);
            int iZzB = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzB += zzhvt.zzB(((Integer) list.get(i12)).intValue());
            }
            zzhvtVar.zzs(iZzB);
            while (i11 < list.size()) {
                zzhvtVar.zzr(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzhwp zzhwpVar = (zzhwp) list;
        if (!z10) {
            while (i11 < zzhwpVar.size()) {
                this.zza.zzK(i10, zzhwpVar.zzf(i11));
                i11++;
            }
            return;
        }
        zzhvt zzhvtVar2 = this.zza;
        zzhvtVar2.zzJ(i10, 2);
        int iZzB2 = 0;
        for (int i13 = 0; i13 < zzhwpVar.size(); i13++) {
            iZzB2 += zzhvt.zzB(zzhwpVar.zzf(i13));
        }
        zzhvtVar2.zzs(iZzB2);
        while (i11 < zzhwpVar.size()) {
            zzhvtVar2.zzr(zzhwpVar.zzf(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzx(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzhwp)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzM(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzhvt zzhvtVar = this.zza;
            zzhvtVar.zzJ(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            zzhvtVar.zzs(i12);
            while (i11 < list.size()) {
                zzhvtVar.zzt(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzhwp zzhwpVar = (zzhwp) list;
        if (!z10) {
            while (i11 < zzhwpVar.size()) {
                this.zza.zzM(i10, zzhwpVar.zzf(i11));
                i11++;
            }
            return;
        }
        zzhvt zzhvtVar2 = this.zza;
        zzhvtVar2.zzJ(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzhwpVar.size(); i15++) {
            zzhwpVar.zzf(i15);
            i14 += 4;
        }
        zzhvtVar2.zzs(i14);
        while (i11 < zzhwpVar.size()) {
            zzhvtVar2.zzt(zzhwpVar.zzf(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzy(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzhxn)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzN(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzhvt zzhvtVar = this.zza;
            zzhvtVar.zzJ(i10, 2);
            int iZzB = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzB += zzhvt.zzB(((Long) list.get(i12)).longValue());
            }
            zzhvtVar.zzs(iZzB);
            while (i11 < list.size()) {
                zzhvtVar.zzu(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzhxn zzhxnVar = (zzhxn) list;
        if (!z10) {
            while (i11 < zzhxnVar.size()) {
                this.zza.zzN(i10, zzhxnVar.zzc(i11));
                i11++;
            }
            return;
        }
        zzhvt zzhvtVar2 = this.zza;
        zzhvtVar2.zzJ(i10, 2);
        int iZzB2 = 0;
        for (int i13 = 0; i13 < zzhxnVar.size(); i13++) {
            iZzB2 += zzhvt.zzB(zzhxnVar.zzc(i13));
        }
        zzhvtVar2.zzs(iZzB2);
        while (i11 < zzhxnVar.size()) {
            zzhvtVar2.zzu(zzhxnVar.zzc(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzr
    public final void zzz(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzhxn)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzN(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzhvt zzhvtVar = this.zza;
            zzhvtVar.zzJ(i10, 2);
            int iZzB = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzB += zzhvt.zzB(((Long) list.get(i12)).longValue());
            }
            zzhvtVar.zzs(iZzB);
            while (i11 < list.size()) {
                zzhvtVar.zzu(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzhxn zzhxnVar = (zzhxn) list;
        if (!z10) {
            while (i11 < zzhxnVar.size()) {
                this.zza.zzN(i10, zzhxnVar.zzc(i11));
                i11++;
            }
            return;
        }
        zzhvt zzhvtVar2 = this.zza;
        zzhvtVar2.zzJ(i10, 2);
        int iZzB2 = 0;
        for (int i13 = 0; i13 < zzhxnVar.size(); i13++) {
            iZzB2 += zzhvt.zzB(zzhxnVar.zzc(i13));
        }
        zzhvtVar2.zzs(iZzB2);
        while (i11 < zzhxnVar.size()) {
            zzhvtVar2.zzu(zzhxnVar.zzc(i11));
            i11++;
        }
    }
}
