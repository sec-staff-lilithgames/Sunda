package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzll extends zzhi {
    public static final /* synthetic */ int zzb = 0;
    private final int zzc;
    private final int zzd;
    private final int[] zze;
    private final int[] zzf;
    private final zzbf[] zzg;
    private final Object[] zzh;
    private final HashMap zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzll(Collection collection, zzwn zzwnVar) {
        zzbf[] zzbfVarArr = new zzbf[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            zzbfVarArr[i11] = ((zzkt) it.next()).zzb();
            i11++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i10] = ((zzkt) it2.next()).zza();
            i10++;
        }
        this(zzbfVarArr, objArr, zzwnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhi
    public final int zzp(int i10) {
        return zzep.zzl(this.zze, i10 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhi
    public final int zzq(int i10) {
        return zzep.zzl(this.zzf, i10 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhi
    public final int zzr(Object obj) {
        Integer num = (Integer) this.zzi.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzhi
    public final zzbf zzs(int i10) {
        return this.zzg[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzhi
    public final int zzt(int i10) {
        return this.zze[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzhi
    public final int zzu(int i10) {
        return this.zzf[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzhi
    public final Object zzv(int i10) {
        return this.zzh[i10];
    }

    public final List zzw() {
        return Arrays.asList(this.zzg);
    }

    public final zzll zzx(zzwn zzwnVar) {
        zzbf[] zzbfVarArr = this.zzg;
        zzbf[] zzbfVarArr2 = new zzbf[zzbfVarArr.length];
        for (int i10 = 0; i10 < zzbfVarArr.length; i10++) {
            zzbfVarArr2[i10] = new zzlk(this, zzbfVarArr[i10]);
        }
        return new zzll(zzbfVarArr2, this.zzh, zzwnVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzll(zzbf[] zzbfVarArr, Object[] objArr, zzwn zzwnVar) {
        super(false, zzwnVar);
        int i10 = 0;
        this.zzg = zzbfVarArr;
        int length = zzbfVarArr.length;
        this.zze = new int[length];
        this.zzf = new int[length];
        this.zzh = objArr;
        this.zzi = new HashMap();
        int iZza = 0;
        int iZzc = 0;
        int i11 = 0;
        while (i10 < zzbfVarArr.length) {
            zzbf zzbfVar = zzbfVarArr[i10];
            this.zzg[i11] = zzbfVar;
            this.zzf[i11] = iZza;
            this.zze[i11] = iZzc;
            iZza += zzbfVar.zza();
            iZzc += this.zzg[i11].zzc();
            this.zzi.put(objArr[i11], Integer.valueOf(i11));
            i10++;
            i11++;
        }
        this.zzc = iZza;
        this.zzd = iZzc;
    }
}
