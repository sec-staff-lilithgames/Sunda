package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzacf {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final float zzk;
    public final String zzl;

    private zzacf(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, String str) {
        this.zza = list;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = i14;
        this.zzg = i15;
        this.zzh = i16;
        this.zzi = i17;
        this.zzj = i18;
        this.zzk = f10;
        this.zzl = str;
    }

    public static zzacf zza(zzeg zzegVar) throws zzat {
        String strZza;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        int i16;
        int i17;
        try {
            zzegVar.zzk(4);
            int iZzs = (zzegVar.zzs() & 3) + 1;
            if (iZzs == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iZzs2 = zzegVar.zzs() & 31;
            for (int i18 = 0; i18 < iZzs2; i18++) {
                arrayList.add(zzb(zzegVar));
            }
            int iZzs3 = zzegVar.zzs();
            for (int i19 = 0; i19 < iZzs3; i19++) {
                arrayList.add(zzb(zzegVar));
            }
            if (iZzs2 > 0) {
                zzfl zzflVarZzd = zzfm.zzd((byte[]) arrayList.get(0), 5, ((byte[]) arrayList.get(0)).length);
                int i20 = zzflVarZzd.zze;
                int i21 = zzflVarZzd.zzf;
                int i22 = zzflVarZzd.zzh + 8;
                int i23 = zzflVarZzd.zzi + 8;
                int i24 = zzflVarZzd.zzj;
                int i25 = zzflVarZzd.zzk;
                int i26 = zzflVarZzd.zzl;
                int i27 = zzflVarZzd.zzm;
                float f11 = zzflVarZzd.zzg;
                strZza = zzdd.zza(zzflVarZzd.zza, zzflVarZzd.zzb, zzflVarZzd.zzc);
                i14 = i26;
                i15 = i27;
                f10 = f11;
                i13 = i23;
                i16 = i24;
                i17 = i25;
                i10 = i20;
                i11 = i21;
                i12 = i22;
            } else {
                strZza = null;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = 16;
                f10 = 1.0f;
                i16 = -1;
                i17 = -1;
            }
            return new zzacf(arrayList, iZzs, i10, i11, i12, i13, i16, i17, i14, i15, f10, strZza);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw zzat.zzb("Error parsing AVC config", e10);
        }
    }

    private static byte[] zzb(zzeg zzegVar) {
        int iZzt = zzegVar.zzt();
        int iZzg = zzegVar.zzg();
        zzegVar.zzk(iZzt);
        return zzdd.zzf(zzegVar.zzi(), iZzg, iZzt);
    }
}
