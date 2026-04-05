package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzzr {
    private static final Comparator zza = zzzq.zza;
    private static final Comparator zzb = zzzp.zza;
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzzo[] zzd = new zzzo[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzzr(int i10) {
    }

    public final void zza() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }

    public final void zzb(int i10, float f10) {
        zzzo zzzoVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i11 = this.zzh;
        if (i11 > 0) {
            zzzo[] zzzoVarArr = this.zzd;
            int i12 = i11 - 1;
            this.zzh = i12;
            zzzoVar = zzzoVarArr[i12];
        } else {
            zzzoVar = new zzzo(null);
        }
        int i13 = this.zzf;
        this.zzf = i13 + 1;
        zzzoVar.zza = i13;
        zzzoVar.zzb = i10;
        zzzoVar.zzc = f10;
        ArrayList arrayList = this.zzc;
        arrayList.add(zzzoVar);
        this.zzg += i10;
        while (true) {
            int i14 = this.zzg;
            if (i14 <= 2000) {
                return;
            }
            int i15 = i14 - 2000;
            zzzo zzzoVar2 = (zzzo) arrayList.get(0);
            int i16 = zzzoVar2.zzb;
            if (i16 <= i15) {
                this.zzg -= i16;
                arrayList.remove(0);
                int i17 = this.zzh;
                if (i17 < 5) {
                    zzzo[] zzzoVarArr2 = this.zzd;
                    this.zzh = i17 + 1;
                    zzzoVarArr2[i17] = zzzoVar2;
                }
            } else {
                zzzoVar2.zzb = i16 - i15;
                this.zzg -= i15;
            }
        }
    }

    public final float zzc(float f10) {
        int i10 = 0;
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f11 = this.zzg;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.zzc;
            if (i10 >= arrayList.size()) {
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                return ((zzzo) arrayList.get(arrayList.size() - 1)).zzc;
            }
            float f12 = 0.5f * f11;
            zzzo zzzoVar = (zzzo) arrayList.get(i10);
            i11 += zzzoVar.zzb;
            if (i11 >= f12) {
                return zzzoVar.zzc;
            }
            i10++;
        }
    }
}
