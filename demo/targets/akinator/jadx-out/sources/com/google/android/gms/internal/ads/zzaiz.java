package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaiz implements zzada {
    public static final /* synthetic */ int zza = 0;
    private int zzA;
    private zzafz zzB;
    private final zzakg zzb;
    private final int zzc;
    private final zzeg zzd;
    private final zzeg zze;
    private final zzeg zzf;
    private final zzeg zzg;
    private final ArrayDeque zzh;
    private final zzajd zzi;
    private final List zzj;
    private zzgpe zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzo;
    private zzeg zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private long zzw;
    private zzadd zzx;
    private zzaiy[] zzy;
    private long[][] zzz;

    @Deprecated
    public zzaiz() {
        this(zzakg.zza, 16);
    }

    public static /* synthetic */ long zzg(zzaji zzajiVar, long j10, long j11) {
        int iZzk = zzk(zzajiVar, j10);
        return iZzk == -1 ? j11 : Math.min(zzajiVar.zzc[iZzk], j11);
    }

    private final void zzi() {
        this.zzl = 0;
        this.zzo = 0;
    }

    private final void zzj(long j10) throws zzat {
        zzap zzapVarZzc;
        int i10;
        boolean z10;
        ArrayDeque arrayDeque;
        int i11;
        List list;
        int i12;
        zzads zzadsVar;
        zzap zzapVar;
        ArrayList arrayList;
        while (true) {
            ArrayDeque arrayDeque2 = this.zzh;
            if (arrayDeque2.isEmpty() || ((zzeu) arrayDeque2.peek()).zza != j10) {
                break;
            }
            zzeu zzeuVar = (zzeu) arrayDeque2.pop();
            if (zzeuVar.zzd == 1836019574) {
                zzeu zzeuVarZzd = zzeuVar.zzd(1835365473);
                new ArrayList();
                zzap zzapVarZze = zzeuVarZzd != null ? zzaik.zze(zzeuVarZzd) : null;
                ArrayList arrayList2 = new ArrayList();
                boolean z11 = this.zzA == 1;
                zzads zzadsVar2 = new zzads();
                zzev zzevVarZzc = zzeuVar.zzc(1969517665);
                if (zzevVarZzc != null) {
                    zzapVarZzc = zzaik.zzc(zzevVarZzc);
                    zzadsVar2.zza(zzapVarZzc);
                } else {
                    zzapVarZzc = null;
                }
                zzev zzevVarZzc2 = zzeuVar.zzc(1836476516);
                zzevVarZzc2.getClass();
                ArrayList arrayList3 = arrayList2;
                zzap zzapVar2 = new zzap(C.TIME_UNSET, zzaik.zzd(zzevVarZzc2.zza));
                int i13 = this.zzc;
                if (1 != (i13 & 1)) {
                    i10 = i13;
                    z10 = false;
                } else {
                    i10 = i13;
                    z10 = true;
                }
                int i14 = i10;
                zzap zzapVar3 = zzapVarZzc;
                List listZzb = zzaik.zzb(zzeuVar, zzadsVar2, C.TIME_UNSET, null, z10, z11, zzaiw.zza, false);
                String strZza = zzaiu.zza(listZzb);
                int i15 = 0;
                int i16 = 0;
                long jMax = -9223372036854775807L;
                int size = -1;
                while (i15 < listZzb.size()) {
                    zzaji zzajiVar = (zzaji) listZzb.get(i15);
                    if (zzajiVar.zzb == 0) {
                        arrayDeque = arrayDeque2;
                        list = listZzb;
                        zzadsVar = zzadsVar2;
                        i12 = i15;
                        i11 = i16;
                        arrayList = arrayList3;
                    } else {
                        zzajf zzajfVar = zzajiVar.zza;
                        arrayDeque = arrayDeque2;
                        zzadd zzaddVar = this.zzx;
                        i11 = i16 + 1;
                        list = listZzb;
                        int i17 = zzajfVar.zzb;
                        zzaiy zzaiyVar = new zzaiy(zzajfVar, zzajiVar, zzaddVar.zzu(i16, i17));
                        int i18 = i15;
                        long j11 = zzajfVar.zze;
                        if (j11 == C.TIME_UNSET) {
                            j11 = zzajiVar.zzh;
                        }
                        i12 = i18;
                        zzaem zzaemVar = zzaiyVar.zzc;
                        jMax = Math.max(jMax, j11);
                        zzv zzvVar = zzajfVar.zzg;
                        String str = zzvVar.zzo;
                        int i19 = MimeTypes.AUDIO_TRUEHD.equals(str) ? zzajiVar.zze * 16 : zzajiVar.zze + 30;
                        zzt zztVarZza = zzvVar.zza();
                        zztVarZza.zzn(i19);
                        if (i17 == 2) {
                            int i20 = zzvVar.zzf;
                            if ((i14 & 8) != 0) {
                                i20 |= size == -1 ? 1 : 2;
                            }
                            zztVarZza.zzg(i20);
                            i17 = 2;
                        }
                        zzait.zzb(i17, zzadsVar2, zztVarZza);
                        zzap zzapVar4 = zzvVar.zzl;
                        List list2 = this.zzj;
                        if (list2.isEmpty()) {
                            zzadsVar = zzadsVar2;
                            zzapVar = null;
                        } else {
                            zzadsVar = zzadsVar2;
                            zzapVar = new zzap(list2);
                        }
                        zzait.zza(i17, zzapVarZze, zztVarZza, zzapVar4, zzapVar, zzapVar3, zzapVar2);
                        zztVarZza.zzl(strZza);
                        if (Objects.equals(str, MimeTypes.AUDIO_MPEG)) {
                            zzaiyVar.zzf = zztVarZza.zzM();
                        } else {
                            zzaemVar.zzu(zztVarZza.zzM());
                        }
                        if (i17 == 2 && size == -1) {
                            size = arrayList3.size();
                        }
                        arrayList = arrayList3;
                        arrayList.add(zzaiyVar);
                    }
                    i15 = i12 + 1;
                    arrayList3 = arrayList;
                    arrayDeque2 = arrayDeque;
                    i16 = i11;
                    listZzb = list;
                    zzadsVar2 = zzadsVar;
                }
                ArrayDeque arrayDeque3 = arrayDeque2;
                int i21 = -1;
                zzaiy[] zzaiyVarArr = (zzaiy[]) arrayList3.toArray(new zzaiy[0]);
                this.zzy = zzaiyVarArr;
                int length = zzaiyVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i22 = 0; i22 < zzaiyVarArr.length; i22++) {
                    jArr[i22] = new long[zzaiyVarArr[i22].zzb.zzb];
                    jArr2[i22] = zzaiyVarArr[i22].zzb.zzf[0];
                }
                long j12 = 0;
                int i23 = 0;
                while (i23 < zzaiyVarArr.length) {
                    long j13 = Long.MAX_VALUE;
                    int i24 = i21;
                    for (int i25 = 0; i25 < zzaiyVarArr.length; i25++) {
                        if (!zArr[i25]) {
                            long j14 = jArr2[i25];
                            if (j14 <= j13) {
                                i24 = i25;
                                j13 = j14;
                            }
                        }
                    }
                    int i26 = iArr[i24];
                    long[] jArr3 = jArr[i24];
                    jArr3[i26] = j12;
                    zzaji zzajiVar2 = zzaiyVarArr[i24].zzb;
                    zzaiy[] zzaiyVarArr2 = zzaiyVarArr;
                    boolean[] zArr2 = zArr;
                    j12 += zzajiVar2.zzd[i26];
                    int i27 = i26 + 1;
                    iArr[i24] = i27;
                    if (i27 < jArr3.length) {
                        jArr2[i24] = zzajiVar2.zzf[i27];
                    } else {
                        zArr2[i24] = true;
                        i23++;
                    }
                    zzaiyVarArr = zzaiyVarArr2;
                    zArr = zArr2;
                    i21 = -1;
                }
                this.zzz = jArr;
                this.zzx.zzv();
                this.zzx.zzw(new zzaix(jMax, this.zzy, size));
                arrayDeque3.clear();
                this.zzl = 2;
            } else if (!arrayDeque2.isEmpty()) {
                ((zzeu) arrayDeque2.peek()).zzb(zzeuVar);
            }
        }
        if (this.zzl != 2) {
            zzi();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzk(zzaji zzajiVar, long j10) {
        int iZza = zzajiVar.zza(j10);
        return iZza == -1 ? zzajiVar.zzb(j10) : iZza;
    }

    private static int zzl(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final boolean zza(zzadb zzadbVar) throws IOException {
        zzaeh zzaehVarZzb = zzaje.zzb(zzadbVar, (this.zzc & 2) != 0);
        this.zzk = zzaehVarZzb != null ? zzgpe.zzj(zzaehVarZzb) : zzgpe.zzi();
        return zzaehVarZzb == null;
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final /* synthetic */ List zzb() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final void zzc(zzadd zzaddVar) {
        if ((this.zzc & 16) == 0) {
            zzaddVar = new zzakj(zzaddVar, this.zzb);
        }
        this.zzx = zzaddVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    @Override // com.google.android.gms.internal.ads.zzada
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzd(com.google.android.gms.internal.ads.zzadb r35, com.google.android.gms.internal.ads.zzaea r36) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiz.zzd(com.google.android.gms.internal.ads.zzadb, com.google.android.gms.internal.ads.zzaea):int");
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final void zze(long j10, long j11) {
        this.zzh.clear();
        this.zzo = 0;
        this.zzq = -1;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = false;
        if (j10 == 0) {
            if (this.zzl != 3) {
                zzi();
                return;
            } else {
                this.zzi.zza();
                this.zzj.clear();
                return;
            }
        }
        for (zzaiy zzaiyVar : this.zzy) {
            zzaji zzajiVar = zzaiyVar.zzb;
            int iZza = zzajiVar.zza(j11);
            if (iZza == -1) {
                iZza = zzajiVar.zzb(j11);
            }
            zzaiyVar.zze = iZza;
            zzaen zzaenVar = zzaiyVar.zzd;
            if (zzaenVar != null) {
                zzaenVar.zza();
            }
        }
    }

    public zzaiz(zzakg zzakgVar, int i10) {
        this.zzb = zzakgVar;
        this.zzc = i10;
        this.zzk = zzgpe.zzi();
        this.zzl = (i10 & 4) != 0 ? 3 : 0;
        this.zzi = new zzajd();
        this.zzj = new ArrayList();
        this.zzg = new zzeg(16);
        this.zzh = new ArrayDeque();
        this.zzd = new zzeg(zzfm.zza);
        this.zze = new zzeg(6);
        this.zzf = new zzeg();
        this.zzq = -1;
        this.zzx = zzadd.zza;
        this.zzy = new zzaiy[0];
    }
}
