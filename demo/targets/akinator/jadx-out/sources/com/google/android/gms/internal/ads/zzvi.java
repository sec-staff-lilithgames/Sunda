package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzvi implements zzus, zzur {
    private final zzus[] zza;
    private final boolean[] zzb;
    private zzur zzf;
    private zzwv zzg;
    private final ArrayList zzd = new ArrayList();
    private final HashMap zze = new HashMap();
    private zzwm zzi = new zzue(zzgpe.zzi(), zzgpe.zzi());
    private final IdentityHashMap zzc = new IdentityHashMap();
    private zzus[] zzh = new zzus[0];

    public zzvi(zzuf zzufVar, long[] jArr, zzus... zzusVarArr) {
        this.zza = zzusVarArr;
        this.zzb = new boolean[zzusVarArr.length];
        for (int i10 = 0; i10 < zzusVarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.zzb[i10] = true;
                this.zza[i10] = new zzws(zzusVarArr[i10], j10);
            }
        }
    }

    public final zzus zza(int i10) {
        return this.zzb[i10] ? ((zzws) this.zza[i10]).zza() : this.zza[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzb(zzur zzurVar, long j10) {
        this.zzf = zzurVar;
        ArrayList arrayList = this.zzd;
        zzus[] zzusVarArr = this.zza;
        Collections.addAll(arrayList, zzusVarArr);
        for (zzus zzusVar : zzusVarArr) {
            zzusVar.zzb(this, j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzc() throws IOException {
        int i10 = 0;
        while (true) {
            zzus[] zzusVarArr = this.zza;
            if (i10 >= zzusVarArr.length) {
                return;
            }
            zzusVarArr[i10].zzc();
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final zzwv zzd() {
        zzwv zzwvVar = this.zzg;
        zzwvVar.getClass();
        return zzwvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final long zze(zzyk[] zzykVarArr, boolean[] zArr, zzwk[] zzwkVarArr, boolean[] zArr2, long j10) {
        int length;
        int[] iArr;
        int length2 = zzykVarArr.length;
        int[] iArr2 = new int[length2];
        int[] iArr3 = new int[length2];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = zzykVarArr.length;
            if (i11 >= length) {
                break;
            }
            zzwk zzwkVar = zzwkVarArr[i11];
            Integer num = zzwkVar == null ? null : (Integer) this.zzc.get(zzwkVar);
            iArr2[i11] = num == null ? -1 : num.intValue();
            zzyk zzykVar = zzykVarArr[i11];
            if (zzykVar != null) {
                String str = zzykVar.zza().zzb;
                iArr3[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i11] = -1;
            }
            i11++;
        }
        IdentityHashMap identityHashMap = this.zzc;
        identityHashMap.clear();
        zzus[] zzusVarArr = this.zza;
        zzwk[] zzwkVarArr2 = new zzwk[length];
        zzwk[] zzwkVarArr3 = new zzwk[length];
        zzyk[] zzykVarArr2 = new zzyk[length];
        ArrayList arrayList = new ArrayList(zzusVarArr.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < zzusVarArr.length) {
            int i13 = i10;
            while (i13 < zzykVarArr.length) {
                zzwkVarArr3[i13] = iArr2[i13] == i12 ? zzwkVarArr[i13] : null;
                if (iArr3[i13] == i12) {
                    zzyk zzykVar2 = zzykVarArr[i13];
                    zzykVar2.getClass();
                    iArr = iArr3;
                    zzbg zzbgVar = (zzbg) this.zze.get(zzykVar2.zza());
                    zzbgVar.getClass();
                    zzykVarArr2[i13] = new zzvh(zzykVar2, zzbgVar);
                } else {
                    iArr = iArr3;
                    zzykVarArr2[i13] = null;
                }
                i13++;
                iArr3 = iArr;
            }
            int[] iArr4 = iArr3;
            ArrayList arrayList2 = arrayList;
            int i14 = i12;
            long jZze = zzusVarArr[i12].zze(zzykVarArr2, zArr, zzwkVarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = jZze;
            } else if (jZze != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < zzykVarArr.length; i15++) {
                if (iArr4[i15] == i14) {
                    zzwk zzwkVar2 = zzwkVarArr3[i15];
                    zzwkVar2.getClass();
                    zzwkVarArr2[i15] = zzwkVar2;
                    identityHashMap.put(zzwkVar2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr2[i15] == i14) {
                    zzgmd.zzh(zzwkVarArr3[i15] == null);
                }
            }
            if (z10) {
                arrayList2.add(zzusVarArr[i14]);
            }
            i12 = i14 + 1;
            arrayList = arrayList2;
            iArr3 = iArr4;
            i10 = 0;
        }
        int i16 = i10;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzwkVarArr2, i16, zzwkVarArr, i16, length);
        this.zzh = (zzus[]) arrayList3.toArray(new zzus[i16]);
        this.zzi = new zzue(arrayList3, zzgqe.zzc(arrayList3, zzvg.zza));
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzf(long j10, boolean z10) {
        for (zzus zzusVar : this.zzh) {
            zzusVar.zzf(j10, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzus, com.google.android.gms.internal.ads.zzwm
    public final void zzg(long j10) {
        this.zzi.zzg(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final long zzh() {
        long j10 = -9223372036854775807L;
        for (zzus zzusVar : this.zzh) {
            long jZzh = zzusVar.zzh();
            if (jZzh == C.TIME_UNSET) {
                if (j10 != C.TIME_UNSET && zzusVar.zzj(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == C.TIME_UNSET) {
                for (zzus zzusVar2 : this.zzh) {
                    if (zzusVar2 == zzusVar) {
                        break;
                    }
                    if (zzusVar2.zzj(jZzh) != jZzh) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j10 = jZzh;
            } else if (jZzh != j10) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzus, com.google.android.gms.internal.ads.zzwm
    public final long zzi() {
        return this.zzi.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final long zzj(long j10) {
        long jZzj = this.zzh[0].zzj(j10);
        int i10 = 1;
        while (true) {
            zzus[] zzusVarArr = this.zzh;
            if (i10 >= zzusVarArr.length) {
                return jZzj;
            }
            if (zzusVarArr[i10].zzj(jZzj) != jZzj) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final long zzk(long j10, zzlv zzlvVar) {
        zzus[] zzusVarArr = this.zzh;
        return (zzusVarArr.length > 0 ? zzusVarArr[0] : this.zza[0]).zzk(j10, zzlvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzus, com.google.android.gms.internal.ads.zzwm
    public final long zzl() {
        return this.zzi.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzus, com.google.android.gms.internal.ads.zzwm
    public final boolean zzm(zzkn zzknVar) {
        ArrayList arrayList = this.zzd;
        if (arrayList.isEmpty()) {
            return this.zzi.zzm(zzknVar);
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzus) arrayList.get(i10)).zzm(zzknVar);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzus, com.google.android.gms.internal.ads.zzwm
    public final boolean zzn() {
        return this.zzi.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzp(zzus zzusVar) {
        ArrayList arrayList = this.zzd;
        arrayList.remove(zzusVar);
        if (arrayList.isEmpty()) {
            zzus[] zzusVarArr = this.zza;
            int i10 = 0;
            for (zzus zzusVar2 : zzusVarArr) {
                i10 += zzusVar2.zzd().zzb;
            }
            zzbg[] zzbgVarArr = new zzbg[i10];
            int i11 = 0;
            for (int i12 = 0; i12 < zzusVarArr.length; i12++) {
                zzwv zzwvVarZzd = zzusVarArr[i12].zzd();
                int i13 = zzwvVarZzd.zzb;
                int i14 = 0;
                while (i14 < i13) {
                    zzbg zzbgVarZza = zzwvVarZzd.zza(i14);
                    int i15 = zzbgVarZza.zza;
                    zzv[] zzvVarArr = new zzv[i15];
                    int i16 = 0;
                    while (i16 < i15) {
                        zzv zzvVarZza = zzbgVarZza.zza(i16);
                        zzt zztVarZza = zzvVarZza.zza();
                        String str = zzvVarZza.zza;
                        if (str == null) {
                            str = "";
                        }
                        zzus[] zzusVarArr2 = zzusVarArr;
                        StringBuilder sb2 = new StringBuilder(str.length() + com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.a(i12, 1));
                        sb2.append(i12);
                        sb2.append(":");
                        sb2.append(str);
                        zztVarZza.zza(sb2.toString());
                        zzvVarArr[i16] = zztVarZza.zzM();
                        i16++;
                        zzusVarArr = zzusVarArr2;
                    }
                    zzus[] zzusVarArr3 = zzusVarArr;
                    String str2 = zzbgVarZza.zzb;
                    StringBuilder sb3 = new StringBuilder(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.a(i12, 1) + String.valueOf(str2).length());
                    sb3.append(i12);
                    sb3.append(":");
                    sb3.append(str2);
                    zzbg zzbgVar = new zzbg(sb3.toString(), zzvVarArr);
                    this.zze.put(zzbgVar, zzbgVarZza);
                    zzbgVarArr[i11] = zzbgVar;
                    i14++;
                    i11++;
                    zzusVarArr = zzusVarArr3;
                }
            }
            this.zzg = new zzwv(zzbgVarArr);
            zzur zzurVar = this.zzf;
            zzurVar.getClass();
            zzurVar.zzp(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwl
    public final /* bridge */ /* synthetic */ void zzs(zzwm zzwmVar) {
        zzur zzurVar = this.zzf;
        zzurVar.getClass();
        zzurVar.zzs(this);
    }
}
