package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzvl extends zzuc {
    private static final zzak zza;
    private final zzuw[] zzb;
    private final List zzc;
    private final zzbf[] zzd;
    private final ArrayList zze;
    private int zzf = -1;
    private long[][] zzg;
    private zzvj zzh;
    private final zzuf zzi;

    static {
        zzz zzzVar = new zzz();
        zzzVar.zza("MergingMediaSource");
        zza = zzzVar.zzc();
    }

    public zzvl(boolean z10, boolean z11, zzuf zzufVar, zzuw... zzuwVarArr) {
        this.zzb = zzuwVarArr;
        this.zzi = zzufVar;
        this.zze = new ArrayList(Arrays.asList(zzuwVarArr));
        this.zzc = new ArrayList(zzuwVarArr.length);
        int i10 = 0;
        while (true) {
            int length = zzuwVarArr.length;
            if (i10 >= length) {
                this.zzd = new zzbf[length];
                this.zzg = new long[0][];
                new HashMap();
                zzgqt.zzb(8).zzb(2).zza();
                return;
            }
            this.zzc.add(new ArrayList());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzA(zzak zzakVar) {
        this.zzb[0].zzA(zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzD(zzus zzusVar) {
        zzvi zzviVar = (zzvi) zzusVar;
        int i10 = 0;
        while (true) {
            zzuw[] zzuwVarArr = this.zzb;
            if (i10 >= zzuwVarArr.length) {
                return;
            }
            List list = (List) this.zzc.get(i10);
            zzus zzusVarZza = zzviVar.zza(i10);
            int i11 = 0;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                if (((zzvk) list.get(i11)).zzb().equals(zzusVarZza)) {
                    list.remove(i11);
                    break;
                }
                i11++;
            }
            zzuwVarArr[i10].zzD(zzviVar.zza(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final zzus zzG(zzuu zzuuVar, zzyv zzyvVar, long j10) {
        zzbf[] zzbfVarArr = this.zzd;
        zzuw[] zzuwVarArr = this.zzb;
        int length = zzuwVarArr.length;
        zzus[] zzusVarArr = new zzus[length];
        int iZze = zzbfVarArr[0].zze(zzuuVar.zza);
        for (int i10 = 0; i10 < length; i10++) {
            zzuu zzuuVarZza = zzuuVar.zza(zzbfVarArr[i10].zzf(iZze));
            zzusVarArr[i10] = zzuwVarArr[i10].zzG(zzuuVarZza, zzyvVar, j10 - this.zzg[iZze][i10]);
            ((List) this.zzc.get(i10)).add(new zzvk(zzuuVarZza, zzusVarArr[i10], null));
        }
        return new zzvi(this.zzi, this.zzg[iZze], zzusVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final zzak zzJ() {
        zzuw[] zzuwVarArr = this.zzb;
        return zzuwVarArr.length > 0 ? zzuwVarArr[0].zzJ() : zza;
    }

    @Override // com.google.android.gms.internal.ads.zzuc, com.google.android.gms.internal.ads.zztt
    public final void zza(zzgz zzgzVar) {
        super.zza(zzgzVar);
        int i10 = 0;
        while (true) {
            zzuw[] zzuwVarArr = this.zzb;
            if (i10 >= zzuwVarArr.length) {
                return;
            }
            zzv(Integer.valueOf(i10), zzuwVarArr[i10]);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuc, com.google.android.gms.internal.ads.zztt
    public final void zzd() {
        super.zzd();
        Arrays.fill(this.zzd, (Object) null);
        this.zzf = -1;
        this.zzh = null;
        ArrayList arrayList = this.zze;
        arrayList.clear();
        Collections.addAll(arrayList, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzuc, com.google.android.gms.internal.ads.zzuw
    public final void zzt() throws IOException {
        zzvj zzvjVar = this.zzh;
        if (zzvjVar != null) {
            throw zzvjVar;
        }
        super.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzuc
    public final /* bridge */ /* synthetic */ void zzu(Object obj, zzuw zzuwVar, zzbf zzbfVar) {
        int iZzc;
        Integer num = (Integer) obj;
        if (this.zzh != null) {
            return;
        }
        if (this.zzf == -1) {
            iZzc = zzbfVar.zzc();
            this.zzf = iZzc;
        } else {
            int iZzc2 = zzbfVar.zzc();
            int i10 = this.zzf;
            if (iZzc2 != i10) {
                this.zzh = new zzvj(0);
                return;
            }
            iZzc = i10;
        }
        if (this.zzg.length == 0) {
            this.zzg = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iZzc, this.zzd.length);
        }
        ArrayList arrayList = this.zze;
        arrayList.remove(zzuwVar);
        zzbf[] zzbfVarArr = this.zzd;
        zzbfVarArr[num.intValue()] = zzbfVar;
        if (arrayList.isEmpty()) {
            zze(zzbfVarArr[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuc
    public final /* bridge */ /* synthetic */ zzuu zzx(Object obj, zzuu zzuuVar) {
        int iIntValue = ((Integer) obj).intValue();
        List list = this.zzc;
        List list2 = (List) list.get(iIntValue);
        for (int i10 = 0; i10 < list2.size(); i10++) {
            if (((zzvk) list2.get(i10)).zza().equals(zzuuVar)) {
                return ((zzvk) ((List) list.get(0)).get(i10)).zza();
            }
        }
        return null;
    }
}
