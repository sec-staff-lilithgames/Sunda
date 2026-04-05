package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgs implements zzjw {
    private final zzgr zza;

    private zzgs(zzgr zzgrVar) {
        byte[] bArr = zzhp.zzb;
        this.zza = zzgrVar;
        zzgrVar.zza = this;
    }

    public static zzgs zza(zzgr zzgrVar) {
        zzgs zzgsVar = zzgrVar.zza;
        return zzgsVar != null ? zzgsVar : new zzgs(zzgrVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzA(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzib)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            this.zza.zzt(i12);
            while (i11 < list.size()) {
                this.zza.zzi(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzib zzibVar = (zzib) list;
        if (!z10) {
            while (i11 < zzibVar.size()) {
                this.zza.zzh(i10, zzibVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzibVar.size(); i15++) {
            zzibVar.zze(i15);
            i14 += 8;
        }
        this.zza.zzt(i14);
        while (i11 < zzibVar.size()) {
            this.zza.zzi(zzibVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzB(int i10, int i11) throws IOException {
        this.zza.zzs(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzC(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzhl)) {
            if (!z10) {
                while (i11 < list.size()) {
                    zzgr zzgrVar = this.zza;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    zzgrVar.zzs(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int iZzz = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iZzz += zzgr.zzz((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.zza.zzt(iZzz);
            while (i11 < list.size()) {
                zzgr zzgrVar2 = this.zza;
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                zzgrVar2.zzt((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        zzhl zzhlVar = (zzhl) list;
        if (!z10) {
            while (i11 < zzhlVar.size()) {
                zzgr zzgrVar3 = this.zza;
                int iZze = zzhlVar.zze(i11);
                zzgrVar3.zzs(i10, (iZze >> 31) ^ (iZze + iZze));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int iZzz2 = 0;
        for (int i13 = 0; i13 < zzhlVar.size(); i13++) {
            int iZze2 = zzhlVar.zze(i13);
            iZzz2 += zzgr.zzz((iZze2 >> 31) ^ (iZze2 + iZze2));
        }
        this.zza.zzt(iZzz2);
        while (i11 < zzhlVar.size()) {
            zzgr zzgrVar4 = this.zza;
            int iZze3 = zzhlVar.zze(i11);
            zzgrVar4.zzt((iZze3 >> 31) ^ (iZze3 + iZze3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzD(int i10, long j10) throws IOException {
        this.zza.zzu(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzE(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzib)) {
            if (!z10) {
                while (i11 < list.size()) {
                    zzgr zzgrVar = this.zza;
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    zzgrVar.zzu(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int iZzA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iZzA += zzgr.zzA((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.zza.zzt(iZzA);
            while (i11 < list.size()) {
                zzgr zzgrVar2 = this.zza;
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                zzgrVar2.zzv((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        zzib zzibVar = (zzib) list;
        if (!z10) {
            while (i11 < zzibVar.size()) {
                zzgr zzgrVar3 = this.zza;
                long jZze = zzibVar.zze(i11);
                zzgrVar3.zzu(i10, (jZze >> 63) ^ (jZze + jZze));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int iZzA2 = 0;
        for (int i13 = 0; i13 < zzibVar.size(); i13++) {
            long jZze2 = zzibVar.zze(i13);
            iZzA2 += zzgr.zzA((jZze2 >> 63) ^ (jZze2 + jZze2));
        }
        this.zza.zzt(iZzA2);
        while (i11 < zzibVar.size()) {
            zzgr zzgrVar4 = this.zza;
            long jZze3 = zzibVar.zze(i11);
            zzgrVar4.zzv((jZze3 >> 63) ^ (jZze3 + jZze3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    @Deprecated
    public final void zzF(int i10) throws IOException {
        this.zza.zzr(i10, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzG(int i10, String str) throws IOException {
        this.zza.zzp(i10, str);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzH(int i10, List list) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzhy)) {
            while (i11 < list.size()) {
                this.zza.zzp(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        zzhy zzhyVar = (zzhy) list;
        while (i11 < list.size()) {
            Object objZzc = zzhyVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzp(i10, (String) objZzc);
            } else {
                this.zza.zze(i10, (zzgk) objZzc);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzI(int i10, int i11) throws IOException {
        this.zza.zzs(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzJ(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzhl)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzs(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int iZzz = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzz += zzgr.zzz(((Integer) list.get(i12)).intValue());
            }
            this.zza.zzt(iZzz);
            while (i11 < list.size()) {
                this.zza.zzt(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzhl zzhlVar = (zzhl) list;
        if (!z10) {
            while (i11 < zzhlVar.size()) {
                this.zza.zzs(i10, zzhlVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int iZzz2 = 0;
        for (int i13 = 0; i13 < zzhlVar.size(); i13++) {
            iZzz2 += zzgr.zzz(zzhlVar.zze(i13));
        }
        this.zza.zzt(iZzz2);
        while (i11 < zzhlVar.size()) {
            this.zza.zzt(zzhlVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzK(int i10, long j10) throws IOException {
        this.zza.zzu(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzL(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzib)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzu(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int iZzA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzA += zzgr.zzA(((Long) list.get(i12)).longValue());
            }
            this.zza.zzt(iZzA);
            while (i11 < list.size()) {
                this.zza.zzv(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzib zzibVar = (zzib) list;
        if (!z10) {
            while (i11 < zzibVar.size()) {
                this.zza.zzu(i10, zzibVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int iZzA2 = 0;
        for (int i13 = 0; i13 < zzibVar.size(); i13++) {
            iZzA2 += zzgr.zzA(zzibVar.zze(i13));
        }
        this.zza.zzt(iZzA2);
        while (i11 < zzibVar.size()) {
            this.zza.zzv(zzibVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzb(int i10, boolean z10) throws IOException {
        this.zza.zzd(i10, z10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzc(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzd(i10, ((Boolean) list.get(i11)).booleanValue());
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).getClass();
                i12++;
            }
            this.zza.zzt(i12);
            while (i11 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        zzgb zzgbVar = (zzgb) list;
        if (!z10) {
            while (i11 < zzgbVar.size()) {
                this.zza.zzd(i10, zzgbVar.zzf(i11));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzgbVar.size(); i15++) {
            zzgbVar.zzf(i15);
            i14++;
        }
        this.zza.zzt(i14);
        while (i11 < zzgbVar.size()) {
            this.zza.zzb(zzgbVar.zzf(i11) ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzd(int i10, zzgk zzgkVar) throws IOException {
        this.zza.zze(i10, zzgkVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zze(int i10, List list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zze(i10, (zzgk) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzf(int i10, double d10) throws IOException {
        this.zza.zzh(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzg(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgt)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).getClass();
                i12 += 8;
            }
            this.zza.zzt(i12);
            while (i11 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        zzgt zzgtVar = (zzgt) list;
        if (!z10) {
            while (i11 < zzgtVar.size()) {
                this.zza.zzh(i10, Double.doubleToRawLongBits(zzgtVar.zze(i11)));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzgtVar.size(); i15++) {
            zzgtVar.zze(i15);
            i14 += 8;
        }
        this.zza.zzt(i14);
        while (i11 < zzgtVar.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(zzgtVar.zze(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    @Deprecated
    public final void zzh(int i10) throws IOException {
        this.zza.zzr(i10, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzi(int i10, int i11) throws IOException {
        this.zza.zzj(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzj(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzhl)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzj(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int iZzA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzA += zzgr.zzA(((Integer) list.get(i12)).intValue());
            }
            this.zza.zzt(iZzA);
            while (i11 < list.size()) {
                this.zza.zzk(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzhl zzhlVar = (zzhl) list;
        if (!z10) {
            while (i11 < zzhlVar.size()) {
                this.zza.zzj(i10, zzhlVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int iZzA2 = 0;
        for (int i13 = 0; i13 < zzhlVar.size(); i13++) {
            iZzA2 += zzgr.zzA(zzhlVar.zze(i13));
        }
        this.zza.zzt(iZzA2);
        while (i11 < zzhlVar.size()) {
            this.zza.zzk(zzhlVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzk(int i10, int i11) throws IOException {
        this.zza.zzf(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzl(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzhl)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzf(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            this.zza.zzt(i12);
            while (i11 < list.size()) {
                this.zza.zzg(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzhl zzhlVar = (zzhl) list;
        if (!z10) {
            while (i11 < zzhlVar.size()) {
                this.zza.zzf(i10, zzhlVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzhlVar.size(); i15++) {
            zzhlVar.zze(i15);
            i14 += 4;
        }
        this.zza.zzt(i14);
        while (i11 < zzhlVar.size()) {
            this.zza.zzg(zzhlVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzm(int i10, long j10) throws IOException {
        this.zza.zzh(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzn(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzib)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            this.zza.zzt(i12);
            while (i11 < list.size()) {
                this.zza.zzi(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzib zzibVar = (zzib) list;
        if (!z10) {
            while (i11 < zzibVar.size()) {
                this.zza.zzh(i10, zzibVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzibVar.size(); i15++) {
            zzibVar.zze(i15);
            i14 += 8;
        }
        this.zza.zzt(i14);
        while (i11 < zzibVar.size()) {
            this.zza.zzi(zzibVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzo(int i10, float f10) throws IOException {
        this.zza.zzf(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzp(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzhd)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzf(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).getClass();
                i12 += 4;
            }
            this.zza.zzt(i12);
            while (i11 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        zzhd zzhdVar = (zzhd) list;
        if (!z10) {
            while (i11 < zzhdVar.size()) {
                this.zza.zzf(i10, Float.floatToRawIntBits(zzhdVar.zze(i11)));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzhdVar.size(); i15++) {
            zzhdVar.zze(i15);
            i14 += 4;
        }
        this.zza.zzt(i14);
        while (i11 < zzhdVar.size()) {
            this.zza.zzg(Float.floatToRawIntBits(zzhdVar.zze(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzq(int i10, Object obj, zzix zzixVar) throws IOException {
        zzgr zzgrVar = this.zza;
        zzgrVar.zzr(i10, 3);
        zzixVar.zzi((zzim) obj, zzgrVar.zza);
        zzgrVar.zzr(i10, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzr(int i10, int i11) throws IOException {
        this.zza.zzj(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzs(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzhl)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzj(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int iZzA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzA += zzgr.zzA(((Integer) list.get(i12)).intValue());
            }
            this.zza.zzt(iZzA);
            while (i11 < list.size()) {
                this.zza.zzk(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzhl zzhlVar = (zzhl) list;
        if (!z10) {
            while (i11 < zzhlVar.size()) {
                this.zza.zzj(i10, zzhlVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int iZzA2 = 0;
        for (int i13 = 0; i13 < zzhlVar.size(); i13++) {
            iZzA2 += zzgr.zzA(zzhlVar.zze(i13));
        }
        this.zza.zzt(iZzA2);
        while (i11 < zzhlVar.size()) {
            this.zza.zzk(zzhlVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzt(int i10, long j10) throws IOException {
        this.zza.zzu(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzu(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzib)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzu(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int iZzA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzA += zzgr.zzA(((Long) list.get(i12)).longValue());
            }
            this.zza.zzt(iZzA);
            while (i11 < list.size()) {
                this.zza.zzv(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzib zzibVar = (zzib) list;
        if (!z10) {
            while (i11 < zzibVar.size()) {
                this.zza.zzu(i10, zzibVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int iZzA2 = 0;
        for (int i13 = 0; i13 < zzibVar.size(); i13++) {
            iZzA2 += zzgr.zzA(zzibVar.zze(i13));
        }
        this.zza.zzt(iZzA2);
        while (i11 < zzibVar.size()) {
            this.zza.zzv(zzibVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzv(int i10, Object obj, zzix zzixVar) throws IOException {
        this.zza.zzm(i10, (zzim) obj, zzixVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzw(int i10, Object obj) throws IOException {
        if (obj instanceof zzgk) {
            this.zza.zzo(i10, (zzgk) obj);
        } else {
            this.zza.zzn(i10, (zzim) obj);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzx(int i10, int i11) throws IOException {
        this.zza.zzf(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzy(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzhl)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzf(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            this.zza.zzt(i12);
            while (i11 < list.size()) {
                this.zza.zzg(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzhl zzhlVar = (zzhl) list;
        if (!z10) {
            while (i11 < zzhlVar.size()) {
                this.zza.zzf(i10, zzhlVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzhlVar.size(); i15++) {
            zzhlVar.zze(i15);
            i14 += 4;
        }
        this.zza.zzt(i14);
        while (i11 < zzhlVar.size()) {
            this.zza.zzg(zzhlVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjw
    public final void zzz(int i10, long j10) throws IOException {
        this.zza.zzh(i10, j10);
    }
}
