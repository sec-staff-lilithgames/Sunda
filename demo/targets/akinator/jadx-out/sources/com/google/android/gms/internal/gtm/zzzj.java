package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzzj implements zzaez {
    private final zzzi zza;

    private zzzj(zzzi zzziVar) {
        byte[] bArr = zzaco.zzb;
        this.zza = zzziVar;
        zzziVar.zze = this;
    }

    public static zzzj zza(zzzi zzziVar) {
        zzzj zzzjVar = zzziVar.zze;
        return zzzjVar != null ? zzzjVar : new zzzj(zzziVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzA(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzada)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzj(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            this.zza.zzu(i12);
            while (i11 < list.size()) {
                this.zza.zzk(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzada zzadaVar = (zzada) list;
        if (!z10) {
            while (i11 < zzadaVar.size()) {
                this.zza.zzj(i10, zzadaVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzadaVar.size(); i15++) {
            zzadaVar.zze(i15);
            i14 += 8;
        }
        this.zza.zzu(i14);
        while (i11 < zzadaVar.size()) {
            this.zza.zzk(zzadaVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzB(int i10, int i11) throws IOException {
        this.zza.zzt(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzC(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzacg)) {
            if (!z10) {
                while (i11 < list.size()) {
                    zzzi zzziVar = this.zza;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    zzziVar.zzt(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            this.zza.zzs(i10, 2);
            int iZzC = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iZzC += zzzi.zzC((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.zza.zzu(iZzC);
            while (i11 < list.size()) {
                zzzi zzziVar2 = this.zza;
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                zzziVar2.zzu((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        zzacg zzacgVar = (zzacg) list;
        if (!z10) {
            while (i11 < zzacgVar.size()) {
                zzzi zzziVar3 = this.zza;
                int iZze = zzacgVar.zze(i11);
                zzziVar3.zzt(i10, (iZze >> 31) ^ (iZze + iZze));
                i11++;
            }
            return;
        }
        this.zza.zzs(i10, 2);
        int iZzC2 = 0;
        for (int i13 = 0; i13 < zzacgVar.size(); i13++) {
            int iZze2 = zzacgVar.zze(i13);
            iZzC2 += zzzi.zzC((iZze2 >> 31) ^ (iZze2 + iZze2));
        }
        this.zza.zzu(iZzC2);
        while (i11 < zzacgVar.size()) {
            zzzi zzziVar4 = this.zza;
            int iZze3 = zzacgVar.zze(i11);
            zzziVar4.zzu((iZze3 >> 31) ^ (iZze3 + iZze3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzD(int i10, long j10) throws IOException {
        this.zza.zzv(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzE(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzada)) {
            if (!z10) {
                while (i11 < list.size()) {
                    zzzi zzziVar = this.zza;
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    zzziVar.zzv(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            this.zza.zzs(i10, 2);
            int iZzD = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iZzD += zzzi.zzD((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.zza.zzu(iZzD);
            while (i11 < list.size()) {
                zzzi zzziVar2 = this.zza;
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                zzziVar2.zzw((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        zzada zzadaVar = (zzada) list;
        if (!z10) {
            while (i11 < zzadaVar.size()) {
                zzzi zzziVar3 = this.zza;
                long jZze = zzadaVar.zze(i11);
                zzziVar3.zzv(i10, (jZze >> 63) ^ (jZze + jZze));
                i11++;
            }
            return;
        }
        this.zza.zzs(i10, 2);
        int iZzD2 = 0;
        for (int i13 = 0; i13 < zzadaVar.size(); i13++) {
            long jZze2 = zzadaVar.zze(i13);
            iZzD2 += zzzi.zzD((jZze2 >> 63) ^ (jZze2 + jZze2));
        }
        this.zza.zzu(iZzD2);
        while (i11 < zzadaVar.size()) {
            zzzi zzziVar4 = this.zza;
            long jZze3 = zzadaVar.zze(i11);
            zzziVar4.zzw((jZze3 >> 63) ^ (jZze3 + jZze3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    @Deprecated
    public final void zzF(int i10) throws IOException {
        this.zza.zzs(i10, 3);
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzG(int i10, String str) throws IOException {
        this.zza.zzq(i10, str);
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzH(int i10, List list) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzacx)) {
            while (i11 < list.size()) {
                this.zza.zzq(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        zzacx zzacxVar = (zzacx) list;
        while (i11 < list.size()) {
            Object objZzb = zzacxVar.zzb();
            if (objZzb instanceof String) {
                this.zza.zzq(i10, (String) objZzb);
            } else {
                this.zza.zzL(i10, (zzyx) objZzb);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzI(int i10, int i11) throws IOException {
        this.zza.zzt(i10, i11);
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzJ(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzacg)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzt(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzs(i10, 2);
            int iZzC = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzC += zzzi.zzC(((Integer) list.get(i12)).intValue());
            }
            this.zza.zzu(iZzC);
            while (i11 < list.size()) {
                this.zza.zzu(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzacg zzacgVar = (zzacg) list;
        if (!z10) {
            while (i11 < zzacgVar.size()) {
                this.zza.zzt(i10, zzacgVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzs(i10, 2);
        int iZzC2 = 0;
        for (int i13 = 0; i13 < zzacgVar.size(); i13++) {
            iZzC2 += zzzi.zzC(zzacgVar.zze(i13));
        }
        this.zza.zzu(iZzC2);
        while (i11 < zzacgVar.size()) {
            this.zza.zzu(zzacgVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzK(int i10, long j10) throws IOException {
        this.zza.zzv(i10, j10);
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzL(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzada)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzv(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzs(i10, 2);
            int iZzD = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzD += zzzi.zzD(((Long) list.get(i12)).longValue());
            }
            this.zza.zzu(iZzD);
            while (i11 < list.size()) {
                this.zza.zzw(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzada zzadaVar = (zzada) list;
        if (!z10) {
            while (i11 < zzadaVar.size()) {
                this.zza.zzv(i10, zzadaVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzs(i10, 2);
        int iZzD2 = 0;
        for (int i13 = 0; i13 < zzadaVar.size(); i13++) {
            iZzD2 += zzzi.zzD(zzadaVar.zze(i13));
        }
        this.zza.zzu(iZzD2);
        while (i11 < zzadaVar.size()) {
            this.zza.zzw(zzadaVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzb(int i10, boolean z10) throws IOException {
        this.zza.zzK(i10, z10);
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzc(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzyo)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzK(i10, ((Boolean) list.get(i11)).booleanValue());
                    i11++;
                }
                return;
            }
            this.zza.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).getClass();
                i12++;
            }
            this.zza.zzu(i12);
            while (i11 < list.size()) {
                this.zza.zzJ(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        zzyo zzyoVar = (zzyo) list;
        if (!z10) {
            while (i11 < zzyoVar.size()) {
                this.zza.zzK(i10, zzyoVar.zzf(i11));
                i11++;
            }
            return;
        }
        this.zza.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzyoVar.size(); i15++) {
            zzyoVar.zzf(i15);
            i14++;
        }
        this.zza.zzu(i14);
        while (i11 < zzyoVar.size()) {
            this.zza.zzJ(zzyoVar.zzf(i11) ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzd(int i10, zzyx zzyxVar) throws IOException {
        this.zza.zzL(i10, zzyxVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zze(int i10, List list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zzL(i10, (zzyx) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzf(int i10, double d10) throws IOException {
        this.zza.zzj(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzg(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzabn)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzj(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            this.zza.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).getClass();
                i12 += 8;
            }
            this.zza.zzu(i12);
            while (i11 < list.size()) {
                this.zza.zzk(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        zzabn zzabnVar = (zzabn) list;
        if (!z10) {
            while (i11 < zzabnVar.size()) {
                this.zza.zzj(i10, Double.doubleToRawLongBits(zzabnVar.zze(i11)));
                i11++;
            }
            return;
        }
        this.zza.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzabnVar.size(); i15++) {
            zzabnVar.zze(i15);
            i14 += 8;
        }
        this.zza.zzu(i14);
        while (i11 < zzabnVar.size()) {
            this.zza.zzk(Double.doubleToRawLongBits(zzabnVar.zze(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    @Deprecated
    public final void zzh(int i10) throws IOException {
        this.zza.zzs(i10, 4);
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzi(int i10, int i11) throws IOException {
        this.zza.zzl(i10, i11);
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzj(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzacg)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzl(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzs(i10, 2);
            int iZzD = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzD += zzzi.zzD(((Integer) list.get(i12)).intValue());
            }
            this.zza.zzu(iZzD);
            while (i11 < list.size()) {
                this.zza.zzm(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzacg zzacgVar = (zzacg) list;
        if (!z10) {
            while (i11 < zzacgVar.size()) {
                this.zza.zzl(i10, zzacgVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzs(i10, 2);
        int iZzD2 = 0;
        for (int i13 = 0; i13 < zzacgVar.size(); i13++) {
            iZzD2 += zzzi.zzD(zzacgVar.zze(i13));
        }
        this.zza.zzu(iZzD2);
        while (i11 < zzacgVar.size()) {
            this.zza.zzm(zzacgVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzk(int i10, int i11) throws IOException {
        this.zza.zzh(i10, i11);
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzl(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzacg)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            this.zza.zzu(i12);
            while (i11 < list.size()) {
                this.zza.zzi(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzacg zzacgVar = (zzacg) list;
        if (!z10) {
            while (i11 < zzacgVar.size()) {
                this.zza.zzh(i10, zzacgVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzacgVar.size(); i15++) {
            zzacgVar.zze(i15);
            i14 += 4;
        }
        this.zza.zzu(i14);
        while (i11 < zzacgVar.size()) {
            this.zza.zzi(zzacgVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzm(int i10, long j10) throws IOException {
        this.zza.zzj(i10, j10);
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzn(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzada)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzj(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            this.zza.zzu(i12);
            while (i11 < list.size()) {
                this.zza.zzk(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzada zzadaVar = (zzada) list;
        if (!z10) {
            while (i11 < zzadaVar.size()) {
                this.zza.zzj(i10, zzadaVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzadaVar.size(); i15++) {
            zzadaVar.zze(i15);
            i14 += 8;
        }
        this.zza.zzu(i14);
        while (i11 < zzadaVar.size()) {
            this.zza.zzk(zzadaVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzo(int i10, float f10) throws IOException {
        this.zza.zzh(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzp(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzabx)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            this.zza.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).getClass();
                i12 += 4;
            }
            this.zza.zzu(i12);
            while (i11 < list.size()) {
                this.zza.zzi(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        zzabx zzabxVar = (zzabx) list;
        if (!z10) {
            while (i11 < zzabxVar.size()) {
                this.zza.zzh(i10, Float.floatToRawIntBits(zzabxVar.zze(i11)));
                i11++;
            }
            return;
        }
        this.zza.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzabxVar.size(); i15++) {
            zzabxVar.zze(i15);
            i14 += 4;
        }
        this.zza.zzu(i14);
        while (i11 < zzabxVar.size()) {
            this.zza.zzi(Float.floatToRawIntBits(zzabxVar.zze(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzq(int i10, Object obj, zzadx zzadxVar) throws IOException {
        zzzi zzziVar = this.zza;
        zzziVar.zzs(i10, 3);
        zzadxVar.zzj((zzadl) obj, zzziVar.zze);
        zzziVar.zzs(i10, 4);
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzr(int i10, int i11) throws IOException {
        this.zza.zzl(i10, i11);
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzs(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzacg)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzl(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzs(i10, 2);
            int iZzD = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzD += zzzi.zzD(((Integer) list.get(i12)).intValue());
            }
            this.zza.zzu(iZzD);
            while (i11 < list.size()) {
                this.zza.zzm(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzacg zzacgVar = (zzacg) list;
        if (!z10) {
            while (i11 < zzacgVar.size()) {
                this.zza.zzl(i10, zzacgVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzs(i10, 2);
        int iZzD2 = 0;
        for (int i13 = 0; i13 < zzacgVar.size(); i13++) {
            iZzD2 += zzzi.zzD(zzacgVar.zze(i13));
        }
        this.zza.zzu(iZzD2);
        while (i11 < zzacgVar.size()) {
            this.zza.zzm(zzacgVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzt(int i10, long j10) throws IOException {
        this.zza.zzv(i10, j10);
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzu(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzada)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzv(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzs(i10, 2);
            int iZzD = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzD += zzzi.zzD(((Long) list.get(i12)).longValue());
            }
            this.zza.zzu(iZzD);
            while (i11 < list.size()) {
                this.zza.zzw(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzada zzadaVar = (zzada) list;
        if (!z10) {
            while (i11 < zzadaVar.size()) {
                this.zza.zzv(i10, zzadaVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzs(i10, 2);
        int iZzD2 = 0;
        for (int i13 = 0; i13 < zzadaVar.size(); i13++) {
            iZzD2 += zzzi.zzD(zzadaVar.zze(i13));
        }
        this.zza.zzu(iZzD2);
        while (i11 < zzadaVar.size()) {
            this.zza.zzw(zzadaVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzv(int i10, Object obj, zzadx zzadxVar) throws IOException {
        this.zza.zzn(i10, (zzadl) obj, zzadxVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzw(int i10, Object obj) throws IOException {
        if (obj instanceof zzyx) {
            this.zza.zzp(i10, (zzyx) obj);
        } else {
            this.zza.zzo(i10, (zzadl) obj);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzx(int i10, int i11) throws IOException {
        this.zza.zzh(i10, i11);
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzy(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzacg)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            this.zza.zzu(i12);
            while (i11 < list.size()) {
                this.zza.zzi(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzacg zzacgVar = (zzacg) list;
        if (!z10) {
            while (i11 < zzacgVar.size()) {
                this.zza.zzh(i10, zzacgVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzacgVar.size(); i15++) {
            zzacgVar.zze(i15);
            i14 += 4;
        }
        this.zza.zzu(i14);
        while (i11 < zzacgVar.size()) {
            this.zza.zzi(zzacgVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzaez
    public final void zzz(int i10, long j10) throws IOException {
        this.zza.zzj(i10, j10);
    }
}
