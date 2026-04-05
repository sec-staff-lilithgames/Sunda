package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzair implements zzada {
    private static final byte[] zza = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzv zzb;
    private long zzA;
    private long zzB;
    private zzaiq zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private zzadd zzI;
    private zzaem[] zzJ;
    private zzaem[] zzK;
    private boolean zzL;
    private long zzM;
    private final zzakg zzc;
    private final int zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzeg zzg;
    private final zzeg zzh;
    private final zzeg zzi;
    private final byte[] zzj;
    private final zzeg zzk;
    private final zzagc zzl;
    private final zzeg zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private final zzfq zzp;
    private final zzacp zzq;
    private zzgpe zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private int zzv;
    private zzeg zzw;
    private long zzx;
    private int zzy;
    private long zzz;

    static {
        zzt zztVar = new zzt();
        zztVar.zzm(MimeTypes.APPLICATION_EMSG);
        zzb = zztVar.zzM();
    }

    @Deprecated
    public zzair() {
        this(zzakg.zza, 32, null, null, zzgpe.zzi(), null);
    }

    private final void zzh() {
        this.zzs = 0;
        this.zzv = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:302:0x0750, code lost:
    
        zzh();
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0753, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0474  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzi(long r56) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instructions count: 1876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzair.zzi(long):void");
    }

    private static int zzj(int i10) throws zzat {
        if (i10 >= 0) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 27);
        sb2.append("Unexpected negative value: ");
        sb2.append(i10);
        throw zzat.zzb(sb2.toString(), null);
    }

    private static void zzk(zzeg zzegVar, int i10, zzajh zzajhVar) throws zzat {
        zzegVar.zzh(i10 + 8);
        int iZzB = zzegVar.zzB();
        int i11 = zzaik.zza;
        if ((iZzB & 1) != 0) {
            throw zzat.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iZzB & 2) != 0;
        int iZzH = zzegVar.zzH();
        if (iZzH == 0) {
            Arrays.fill(zzajhVar.zzl, 0, zzajhVar.zze, false);
            return;
        }
        int i12 = zzajhVar.zze;
        if (iZzH != i12) {
            throw zzat.zzb(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.m(iZzH, i12, "Senc sample count ", " is different from fragment sample count", new StringBuilder(String.valueOf(iZzH).length() + 58 + String.valueOf(i12).length())), null);
        }
        Arrays.fill(zzajhVar.zzl, 0, iZzH, z10);
        zzajhVar.zza(zzegVar.zzd());
        zzeg zzegVar2 = zzajhVar.zzn;
        zzegVar.zzm(zzegVar2.zzi(), 0, zzegVar2.zze());
        zzegVar2.zzh(0);
        zzajhVar.zzo = false;
    }

    private static Pair zzl(zzeg zzegVar, long j10) throws zzat {
        long jZzJ;
        long jZzJ2;
        zzeg zzegVar2 = zzegVar;
        zzegVar2.zzh(8);
        int iZza = zzaik.zza(zzegVar2.zzB());
        zzegVar2.zzk(4);
        long jZzz = zzegVar2.zzz();
        if (iZza == 0) {
            jZzJ = zzegVar2.zzz();
            jZzJ2 = zzegVar2.zzz();
        } else {
            jZzJ = zzegVar2.zzJ();
            jZzJ2 = zzegVar2.zzJ();
        }
        long j11 = jZzJ2 + j10;
        long jZzt = zzep.zzt(jZzJ, 1000000L, jZzz, RoundingMode.DOWN);
        zzegVar2.zzk(2);
        int iZzt = zzegVar2.zzt();
        int[] iArr = new int[iZzt];
        long[] jArr = new long[iZzt];
        long[] jArr2 = new long[iZzt];
        long[] jArr3 = new long[iZzt];
        long j12 = j11;
        long j13 = jZzt;
        int i10 = 0;
        while (i10 < iZzt) {
            int iZzB = zzegVar2.zzB();
            if ((Integer.MIN_VALUE & iZzB) != 0) {
                throw zzat.zzb("Unhandled indirect reference", null);
            }
            long jZzz2 = zzegVar2.zzz();
            iArr[i10] = iZzB & Integer.MAX_VALUE;
            jArr[i10] = j12;
            jArr3[i10] = j13;
            jZzJ += jZzz2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jZzt2 = zzep.zzt(jZzJ, 1000000L, jZzz, RoundingMode.DOWN);
            jArr4[i10] = jZzt2 - jArr5[i10];
            zzegVar2.zzk(4);
            j12 += iArr[i10];
            i10++;
            zzegVar2 = zzegVar;
            iZzt = iZzt;
            j13 = jZzt2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jZzt), new zzaco(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzq zzm(java.util.List r19) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzair.zzm(java.util.List):com.google.android.gms.internal.ads.zzq");
    }

    private static final zzail zzn(SparseArray sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return (zzail) sparseArray.valueAt(0);
        }
        zzail zzailVar = (zzail) sparseArray.get(i10);
        zzailVar.getClass();
        return zzailVar;
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final boolean zza(zzadb zzadbVar) throws IOException {
        zzaeh zzaehVarZza = zzaje.zza(zzadbVar);
        this.zzr = zzaehVarZza != null ? zzgpe.zzj(zzaehVarZza) : zzgpe.zzi();
        return zzaehVarZza == null;
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final /* synthetic */ List zzb() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final void zzc(zzadd zzaddVar) {
        int i10;
        int i11 = this.zzd;
        if ((i11 & 32) == 0) {
            zzaddVar = new zzakj(zzaddVar, this.zzc);
        }
        this.zzI = zzaddVar;
        zzh();
        zzaem[] zzaemVarArr = new zzaem[2];
        this.zzJ = zzaemVarArr;
        int i12 = 100;
        int i13 = 0;
        if ((i11 & 4) != 0) {
            zzaemVarArr[0] = this.zzI.zzu(100, 5);
            i10 = 1;
            i12 = 101;
        } else {
            i10 = 0;
        }
        zzaem[] zzaemVarArr2 = (zzaem[]) zzep.zzb(this.zzJ, i10);
        this.zzJ = zzaemVarArr2;
        for (zzaem zzaemVar : zzaemVarArr2) {
            zzaemVar.zzu(zzb);
        }
        List list = this.zze;
        this.zzK = new zzaem[list.size()];
        while (i13 < this.zzK.length) {
            zzaem zzaemVarZzu = this.zzI.zzu(i12, 3);
            zzaemVarZzu.zzu((zzv) list.get(i13));
            this.zzK[i13] = zzaemVarZzu;
            i13++;
            i12++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f5, code lost:
    
        if ((r11 & 31) == 6) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01fb, code lost:
    
        if (java.util.Objects.equals(r2, "video/hevc") != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0203, code lost:
    
        if (com.google.android.gms.internal.ads.zzas.zze(r9.zzk, "video/hevc") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0206, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x020e, code lost:
    
        if (((r11 & 126) >> 1) != 39) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0210, code lost:
    
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0213, code lost:
    
        r17 = r7;
        r21 = r10;
        r10 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0219, code lost:
    
        r31.zzH = r2;
        r8.zzz(r15, r5);
        r31.zzE += r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0223, code lost:
    
        if (r5 <= 0) goto L469;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0227, code lost:
    
        if (r31.zzG != false) goto L470;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0230, code lost:
    
        if (com.google.android.gms.internal.ads.zzfm.zzc(r4, 4, r5, r3.zzg) == false) goto L471;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0232, code lost:
    
        r31.zzG = r19;
        r7 = r17;
        r10 = r21;
        r2 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0240, code lost:
    
        r7 = r17;
        r10 = r21;
        r2 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0248, code lost:
    
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0253, code lost:
    
        throw com.google.android.gms.internal.ads.zzat.zzb("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0254, code lost:
    
        r28 = r2;
        r17 = r7;
        r21 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x025d, code lost:
    
        if (r31.zzH == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x025f, code lost:
    
        r2 = r31.zzi;
        r2.zza(r5);
        r32.zzc(r2.zzi(), 0, r31.zzF);
        r8.zzz(r2, r31.zzF);
        r5 = r31.zzF;
        r7 = com.google.android.gms.internal.ads.zzfm.zza(r2.zzi(), r2.zze());
        r2.zzh(0);
        r2.zzf(r7);
        r7 = r3.zzg.zzq;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x028c, code lost:
    
        if (r7 != (-1)) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x028e, code lost:
    
        r7 = r31.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0294, code lost:
    
        if (r7.zzb() == 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0296, code lost:
    
        r7.zza(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x029a, code lost:
    
        r9 = r31.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02a0, code lost:
    
        if (r9.zzb() == r7) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02a2, code lost:
    
        r9.zza(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02a5, code lost:
    
        r7 = r31.zzp;
        r7.zzc(r12, r2);
        r20 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02b2, code lost:
    
        if ((r28.zzg() & 4) == 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02b4, code lost:
    
        r7.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02b8, code lost:
    
        r20 = 4;
        r5 = r8.zzy(r32, r5, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02bf, code lost:
    
        r31.zzE += r5;
        r31.zzF -= r5;
        r7 = r17;
        r10 = r21;
        r2 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02d4, code lost:
    
        r1 = r28.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02da, code lost:
    
        if (r31.zzG != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02dc, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02df, code lost:
    
        r22 = r1;
        r1 = r28.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02e5, code lost:
    
        if (r1 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02e7, code lost:
    
        r25 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02ec, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02ee, code lost:
    
        r8.zzx(r12, r22, r31.zzD, 0, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02fb, code lost:
    
        r1 = r31.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0301, code lost:
    
        if (r1.isEmpty() != false) goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0303, code lost:
    
        r1 = (com.google.android.gms.internal.ads.zzaip) r1.removeFirst();
        r2 = r31.zzy;
        r7 = r1.zzc;
        r31.zzy = r2 - r7;
        r2 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0314, code lost:
    
        if (r1.zzb == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0316, code lost:
    
        r2 = r2 + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0318, code lost:
    
        r4 = r2;
        r1 = r31.zzJ;
        r2 = r1.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x031d, code lost:
    
        if (r10 >= r2) goto L465;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x031f, code lost:
    
        r1[r10].zzx(r4, 1, r7, r31.zzy, null);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x032f, code lost:
    
        if (r28.zzh() != false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0331, code lost:
    
        r31.zzC = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0334, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0335, code lost:
    
        r31.zzs = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0339, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x05d6, code lost:
    
        throw com.google.android.gms.internal.ads.zzat.zzc("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        r10 = "video/avc";
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
    
        if (r31.zzs != 3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a7, code lost:
    
        r31.zzD = r2.zzf();
        r3 = r2.zzd.zza.zzg.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b9, code lost:
    
        if (java.util.Objects.equals(r3, "video/avc") != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bb, code lost:
    
        java.util.Objects.equals(r3, "video/hevc");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00be, code lost:
    
        r31.zzG = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c4, code lost:
    
        if (r2.zzf >= r2.zzi) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
    
        r32.zzf(r31.zzD);
        r1 = r2.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cf, code lost:
    
        if (r1 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d2, code lost:
    
        r3 = r2.zzb;
        r6 = r3.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d8, code lost:
    
        if (r1 == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00da, code lost:
    
        r6.zzk(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e3, code lost:
    
        if (r3.zzb(r2.zzf) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e5, code lost:
    
        r6.zzk(r6.zzt() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f1, code lost:
    
        if (r2.zzh() != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f3, code lost:
    
        r31.zzC = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f5, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fe, code lost:
    
        if (r2.zzd.zza.zzh != 1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0100, code lost:
    
        r31.zzD -= 8;
        r32.zzf(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0117, code lost:
    
        if ("audio/ac4".equals(r2.zzd.zza.zzg.zzo) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0119, code lost:
    
        r31.zzE = r2.zzi(r31.zzD, 7);
        r3 = r31.zzD;
        r12 = r31.zzk;
        com.google.android.gms.internal.ads.zzace.zzc(r3, r12);
        r2.zza.zzz(r12, 7);
        r3 = r31.zzE + 7;
        r31.zzE = r3;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0135, code lost:
    
        r8 = 0;
        r3 = r2.zzi(r31.zzD, 0);
        r31.zzE = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013e, code lost:
    
        r31.zzD += r3;
        r31.zzs = 4;
        r31.zzF = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0147, code lost:
    
        r3 = r2.zzd.zza;
        r8 = r2.zza;
        r12 = r2.zzd();
        r14 = r3.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0153, code lost:
    
        if (r14 != 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0155, code lost:
    
        r3 = r31.zzE;
        r5 = r31.zzD;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0159, code lost:
    
        if (r3 >= r5) goto L461;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015b, code lost:
    
        r31.zzE += r8.zzy(r32, r5 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0167, code lost:
    
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016b, code lost:
    
        r15 = r31.zzh;
        r4 = r15.zzi();
        r4[0] = 0;
        r4[1] = 0;
        r4[r17] = 0;
        r7 = 4 - r14;
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0181, code lost:
    
        if (r31.zzE >= r31.zzD) goto L466;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0183, code lost:
    
        r5 = r31.zzF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0185, code lost:
    
        if (r5 != 0) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x018a, code lost:
    
        if (r31.zzK.length > 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018e, code lost:
    
        if (r31.zzG != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0191, code lost:
    
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0193, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0195, code lost:
    
        r5 = com.google.android.gms.internal.ads.zzfm.zzb(r3.zzg);
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a4, code lost:
    
        if ((r14 + r5) <= (r31.zzD - r31.zzE)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a7, code lost:
    
        r32.zzc(r4, r7, r14 + r5);
        r15.zzh(0);
        r9 = r15.zzB();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b4, code lost:
    
        if (r9 < 0) goto L468;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b6, code lost:
    
        r31.zzF = r9 - r5;
        r9 = r31.zzg;
        r9.zzh(0);
        r8.zzz(r9, 4);
        r31.zzE += 4;
        r31.zzD += r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cf, code lost:
    
        if (r31.zzK.length <= 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d1, code lost:
    
        if (r5 <= 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d3, code lost:
    
        r9 = r3.zzg;
        r11 = r4[4];
        r2 = r9.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01dd, code lost:
    
        if (java.util.Objects.equals(r2, r10) != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01df, code lost:
    
        r17 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e7, code lost:
    
        if (com.google.android.gms.internal.ads.zzas.zze(r9.zzk, r10) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ea, code lost:
    
        r21 = r10;
        r10 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ee, code lost:
    
        r17 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f0, code lost:
    
        r21 = r10;
        r10 = 6;
     */
    @Override // com.google.android.gms.internal.ads.zzada
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzd(com.google.android.gms.internal.ads.zzadb r32, com.google.android.gms.internal.ads.zzaea r33) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2009
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzair.zzd(com.google.android.gms.internal.ads.zzadb, com.google.android.gms.internal.ads.zzaea):int");
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final void zze(long j10, long j11) {
        SparseArray sparseArray = this.zzf;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzaiq) sparseArray.valueAt(i10)).zzc();
        }
        this.zzo.clear();
        this.zzy = 0;
        this.zzp.zzd();
        this.zzz = j11;
        this.zzn.clear();
        zzh();
    }

    public final /* synthetic */ void zzg(long j10, zzeg zzegVar) {
        zzacn.zza(j10, zzegVar, this.zzK);
    }

    public zzair(zzakg zzakgVar, int i10, zzem zzemVar, zzajf zzajfVar, List list, zzaem zzaemVar) {
        this.zzc = zzakgVar;
        this.zzd = i10;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzagc();
        this.zzm = new zzeg(16);
        this.zzg = new zzeg(zzfm.zza);
        this.zzh = new zzeg(6);
        this.zzi = new zzeg();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzeg(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzr = zzgpe.zzi();
        this.zzA = C.TIME_UNSET;
        this.zzz = C.TIME_UNSET;
        this.zzB = C.TIME_UNSET;
        this.zzI = zzadd.zza;
        this.zzJ = new zzaem[0];
        this.zzK = new zzaem[0];
        this.zzp = new zzfq(new zzfp() { // from class: com.google.android.gms.internal.ads.zzaio
            @Override // com.google.android.gms.internal.ads.zzfp
            public final /* synthetic */ void zza(long j10, zzeg zzegVar) {
                this.zza.zzg(j10, zzegVar);
            }
        });
        this.zzq = new zzacp();
        this.zzM = -1L;
    }
}
