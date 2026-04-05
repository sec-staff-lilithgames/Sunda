package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import b0.e2;
import com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.services.core.request.NJc.yFkbx;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzahk implements zzada {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final UUID zzf;
    private static final Map zzg;
    private long zzA;
    private long zzB;
    private boolean zzC;
    private boolean zzD;
    private zzahj zzE;
    private boolean zzF;
    private int zzG;
    private long zzH;
    private final SparseArray zzI;
    private boolean zzJ;
    private long zzK;
    private int zzL;
    private long zzM;
    private int zzN;
    private boolean zzO;
    private long zzP;
    private long zzQ;
    private long zzR;
    private boolean zzS;
    private int zzT;
    private long zzU;
    private long zzV;
    private int zzW;
    private int zzX;
    private int[] zzY;
    private int zzZ;
    private int zzaa;
    private int zzab;
    private int zzac;
    private boolean zzad;
    private long zzae;
    private int zzaf;
    private int zzag;
    private int zzah;
    private boolean zzai;
    private boolean zzaj;
    private boolean zzak;
    private int zzal;
    private byte zzam;
    private boolean zzan;
    private zzadd zzao;
    private final zzahd zzap;
    private final zzahm zzh;
    private final SparseArray zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final zzakg zzl;
    private final zzeg zzm;
    private final zzeg zzn;
    private final zzeg zzo;
    private final zzeg zzp;
    private final zzeg zzq;
    private final zzeg zzr;
    private final zzeg zzs;
    private final zzeg zzt;
    private final zzeg zzu;
    private final zzeg zzv;
    private ByteBuffer zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        String str = zzep.zza;
        zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        zzd = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zze = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zzf = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        e2.v(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        e2.v(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        zzg = Collections.unmodifiableMap(map);
    }

    @Deprecated
    public zzahk() {
        this(new zzahd(), 2, zzakg.zza);
    }

    private final void zzA() {
        if (!this.zzD) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i10 >= sparseArray.size()) {
                zzadd zzaddVar = this.zzao;
                zzaddVar.getClass();
                zzaddVar.zzv();
                this.zzD = false;
                return;
            }
            if (((zzahj) sparseArray.valueAt(i10)).zzV) {
                return;
            } else {
                i10++;
            }
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private final void zzp(int i10) throws zzat {
        if (this.zzE != null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 32);
        sb2.append("Element ");
        sb2.append(i10);
        sb2.append(" must be in a TrackEntry");
        throw zzat.zzb(sb2.toString(), null);
    }

    private final void zzq(int i10) throws zzat {
        if (this.zzJ) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 26);
        sb2.append("Element ");
        sb2.append(i10);
        sb2.append(" must be in a Cues");
        throw zzat.zzb(sb2.toString(), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
    
        if (r2.equals("S_TEXT/SSA") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        if (r2.equals("S_TEXT/ASS") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a3, code lost:
    
        r2 = zzw(r10, "%01d:%02d:%02d:%02d", 10000);
        r3 = 21;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca A[SYNTHETIC] */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzr(com.google.android.gms.internal.ads.zzahj r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahk.zzr(com.google.android.gms.internal.ads.zzahj, long, int, int, int):void");
    }

    private final void zzs(zzadb zzadbVar, int i10) throws IOException {
        zzeg zzegVar = this.zzo;
        if (zzegVar.zze() >= i10) {
            return;
        }
        if (zzegVar.zzj() < i10) {
            int iZzj = zzegVar.zzj();
            zzegVar.zzc(Math.max(iZzj + iZzj, i10));
        }
        zzadbVar.zzc(zzegVar.zzi(), zzegVar.zze(), i10 - zzegVar.zze());
        zzegVar.zzf(i10);
    }

    private final void zzu() {
        this.zzaf = 0;
        this.zzag = 0;
        this.zzah = 0;
        this.zzai = false;
        this.zzaj = false;
        this.zzak = false;
        this.zzal = 0;
        this.zzam = (byte) 0;
        this.zzan = false;
        this.zzr.zza(0);
    }

    private final void zzv(zzadb zzadbVar, byte[] bArr, int i10) throws IOException {
        int length = bArr.length;
        int i11 = length + i10;
        zzeg zzegVar = this.zzs;
        if (zzegVar.zzj() < i11) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i11 + i10);
            zzegVar.zzb(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, zzegVar.zzi(), 0, length);
        }
        zzadbVar.zzc(zzegVar.zzi(), length, i10);
        zzegVar.zzh(0);
        zzegVar.zzf(i11);
    }

    private static byte[] zzw(long j10, String str, long j11) {
        zzgmd.zza(j10 != C.TIME_UNSET);
        Locale locale = Locale.US;
        int i10 = (int) (j10 / 3600000000L);
        Integer numValueOf = Integer.valueOf(i10);
        long j12 = j10 - (i10 * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i11);
        long j13 = j12 - (i11 * 60000000);
        int i12 = (int) (j13 / 1000000);
        String str2 = String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11)));
        String str3 = zzep.zza;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    private final int zzx(zzadb zzadbVar, zzaem zzaemVar, int i10) throws IOException {
        zzeg zzegVar = this.zzr;
        int iZzd = zzegVar.zzd();
        if (iZzd <= 0) {
            return zzaemVar.zzy(zzadbVar, i10, false);
        }
        int iMin = Math.min(i10, iZzd);
        zzaemVar.zzz(zzegVar, iMin);
        return iMin;
    }

    private final long zzy(long j10) throws zzat {
        long j11 = this.zzz;
        if (j11 != C.TIME_UNSET) {
            return zzep.zzt(j10, j11, 1000L, RoundingMode.DOWN);
        }
        throw zzat.zzb("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static int[] zzz(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        int length = iArr.length;
        return length >= i10 ? iArr : new int[Math.max(length + length, i10)];
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final boolean zza(zzadb zzadbVar) throws IOException {
        return new zzahl().zza(zzadbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final void zzc(zzadd zzaddVar) {
        if (this.zzk) {
            zzaddVar = new zzakj(zzaddVar, this.zzl);
        }
        this.zzao = zzaddVar;
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final int zzd(zzadb zzadbVar, zzaea zzaeaVar) throws IOException {
        int i10 = 0;
        this.zzS = false;
        while (!this.zzS) {
            if (this.zzap.zzc(zzadbVar)) {
                long jZzn = zzadbVar.zzn();
                if (this.zzO) {
                    this.zzQ = jZzn;
                    zzaeaVar.zza = this.zzP;
                    this.zzO = false;
                    return 1;
                }
                if (this.zzF) {
                    long j10 = this.zzQ;
                    if (j10 != -1) {
                        zzaeaVar.zza = j10;
                        this.zzQ = -1L;
                        return 1;
                    }
                }
            } else {
                while (true) {
                    SparseArray sparseArray = this.zzi;
                    if (i10 >= sparseArray.size()) {
                        return -1;
                    }
                    zzahj zzahjVar = (zzahj) sparseArray.valueAt(i10);
                    zzahjVar.zzb();
                    zzaen zzaenVar = zzahjVar.zzU;
                    if (zzaenVar != null) {
                        zzaenVar.zzd(zzahjVar.zzY, zzahjVar.zzj);
                    }
                    i10++;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final void zze(long j10, long j11) {
        this.zzR = C.TIME_UNSET;
        int i10 = 0;
        this.zzT = 0;
        this.zzap.zzb();
        this.zzh.zza();
        zzu();
        this.zzJ = false;
        this.zzK = C.TIME_UNSET;
        this.zzL = -1;
        this.zzM = -1L;
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i10 >= sparseArray.size()) {
                return;
            }
            zzaen zzaenVar = ((zzahj) sparseArray.valueAt(i10)).zzU;
            if (zzaenVar != null) {
                zzaenVar.zza();
            }
            i10++;
        }
    }

    public final void zzg(int i10, long j10, long j11) throws zzat {
        zzadd zzaddVar = this.zzao;
        zzaddVar.getClass();
        if (i10 == 160) {
            this.zzad = false;
            this.zzae = 0L;
            return;
        }
        if (i10 == 174) {
            zzahj zzahjVar = new zzahj();
            this.zzE = zzahjVar;
            zzahjVar.zza = this.zzC;
            return;
        }
        if (i10 == 183) {
            zzq(i10);
            this.zzL = -1;
            this.zzM = -1L;
            return;
        }
        if (i10 == 187) {
            zzq(i10);
            this.zzK = C.TIME_UNSET;
            return;
        }
        if (i10 == 19899) {
            this.zzG = -1;
            this.zzH = -1L;
            return;
        }
        if (i10 == 20533) {
            zzp(i10);
            this.zzE.zzh = true;
            return;
        }
        if (i10 == 21968) {
            zzp(i10);
            this.zzE.zzy = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.zzy;
            if (j12 != -1 && j12 != j10) {
                throw zzat.zzb("Multiple Segment elements not supported", null);
            }
            this.zzy = j10;
            this.zzx = j11;
            return;
        }
        if (i10 == 475249515) {
            this.zzJ = true;
            return;
        }
        if (i10 == 524531317 && !this.zzF) {
            if (this.zzj && this.zzP != -1) {
                this.zzO = true;
            } else {
                zzaddVar.zzw(new zzaec(this.zzB, 0L));
                this.zzF = true;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:223:0x030b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(int r25) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahk.zzh(int):void");
    }

    public final void zzj(int i10, double d10) throws zzat {
        if (i10 == 181) {
            zzp(i10);
            this.zzE.zzR = (int) d10;
            return;
        }
        if (i10 == 17545) {
            this.zzA = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                zzp(i10);
                this.zzE.zzE = (float) d10;
                break;
            case 21970:
                zzp(i10);
                this.zzE.zzF = (float) d10;
                break;
            case 21971:
                zzp(i10);
                this.zzE.zzG = (float) d10;
                break;
            case 21972:
                zzp(i10);
                this.zzE.zzH = (float) d10;
                break;
            case 21973:
                zzp(i10);
                this.zzE.zzI = (float) d10;
                break;
            case 21974:
                zzp(i10);
                this.zzE.zzJ = (float) d10;
                break;
            case 21975:
                zzp(i10);
                this.zzE.zzK = (float) d10;
                break;
            case 21976:
                zzp(i10);
                this.zzE.zzL = (float) d10;
                break;
            case 21977:
                zzp(i10);
                this.zzE.zzM = (float) d10;
                break;
            case 21978:
                zzp(i10);
                this.zzE.zzN = (float) d10;
                break;
            default:
                switch (i10) {
                    case 30323:
                        zzp(i10);
                        this.zzE.zzt = (float) d10;
                        break;
                    case 30324:
                        zzp(i10);
                        this.zzE.zzu = (float) d10;
                        break;
                    case 30325:
                        zzp(i10);
                        this.zzE.zzv = (float) d10;
                        break;
                }
        }
    }

    public final void zzk(int i10, String str) throws zzat {
        if (i10 == 134) {
            zzp(i10);
            this.zzE.zzc = str;
            return;
        }
        if (i10 != 17026) {
            if (i10 == 21358) {
                zzp(i10);
                this.zzE.zzb = str;
                return;
            } else {
                if (i10 != 2274716) {
                    return;
                }
                zzp(i10);
                this.zzE.zze(str);
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            this.zzC = Objects.equals(str, "webm");
            return;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 22);
        sb2.append("DocType ");
        sb2.append(str);
        sb2.append(" not supported");
        throw zzat.zzb(sb2.toString(), null);
    }

    public final void zzl(int i10, int i11, zzadb zzadbVar) throws IOException {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j10;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23 = i10;
        int i24 = 2;
        int i25 = 1;
        int i26 = 0;
        if (i23 != 161 && i23 != 163) {
            if (i23 == 165) {
                if (this.zzT != 2) {
                    return;
                }
                zzahj zzahjVar = (zzahj) this.zzi.get(this.zzZ);
                if (this.zzac != 4 || !"V_VP9".equals(zzahjVar.zzc)) {
                    zzadbVar.zzf(i11);
                    return;
                }
                zzeg zzegVar = this.zzv;
                zzegVar.zza(i11);
                zzadbVar.zzc(zzegVar.zzi(), 0, i11);
                return;
            }
            if (i23 == 16877) {
                zzp(i10);
                zzahj zzahjVar2 = this.zzE;
                if (zzahjVar2.zzc() != 1685485123 && zzahjVar2.zzc() != 1685480259) {
                    zzadbVar.zzf(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                zzahjVar2.zzO = bArr;
                zzadbVar.zzc(bArr, 0, i11);
                return;
            }
            if (i23 == 16981) {
                zzp(i10);
                byte[] bArr2 = new byte[i11];
                this.zzE.zzi = bArr2;
                zzadbVar.zzc(bArr2, 0, i11);
                return;
            }
            if (i23 == 18402) {
                byte[] bArr3 = new byte[i11];
                zzadbVar.zzc(bArr3, 0, i11);
                zzp(i10);
                this.zzE.zzj = new zzael(1, bArr3, 0, 0);
                return;
            }
            if (i23 == 21419) {
                zzeg zzegVar2 = this.zzq;
                Arrays.fill(zzegVar2.zzi(), (byte) 0);
                zzadbVar.zzc(zzegVar2.zzi(), 4 - i11, i11);
                zzegVar2.zzh(0);
                this.zzG = (int) zzegVar2.zzz();
                return;
            }
            if (i23 == 25506) {
                zzp(i10);
                byte[] bArr4 = new byte[i11];
                this.zzE.zzk = bArr4;
                zzadbVar.zzc(bArr4, 0, i11);
                return;
            }
            if (i23 != 30322) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i23).length() + 15);
                sb2.append("Unexpected id: ");
                sb2.append(i23);
                throw zzat.zzb(sb2.toString(), null);
            }
            zzp(i10);
            byte[] bArr5 = new byte[i11];
            this.zzE.zzw = bArr5;
            zzadbVar.zzc(bArr5, 0, i11);
            return;
        }
        int i27 = 8;
        if (this.zzT == 0) {
            zzahm zzahmVar = this.zzh;
            this.zzZ = (int) zzahmVar.zzb(zzadbVar, false, true, 8);
            this.zzaa = zzahmVar.zzc();
            this.zzV = C.TIME_UNSET;
            this.zzT = 1;
            this.zzo.zza(0);
        }
        zzahj zzahjVar3 = (zzahj) this.zzi.get(this.zzZ);
        if (zzahjVar3 == null) {
            zzadbVar.zzf(i11 - this.zzaa);
            this.zzT = 0;
            return;
        }
        zzahjVar3.zzb();
        if (this.zzT == 1) {
            zzs(zzadbVar, 3);
            zzeg zzegVar3 = this.zzo;
            int i28 = (zzegVar3.zzi()[2] & 6) >> 1;
            if (i28 == 0) {
                this.zzX = 1;
                int[] iArrZzz = zzz(this.zzY, 1);
                this.zzY = iArrZzz;
                iArrZzz[0] = (i11 - this.zzaa) - 3;
            } else {
                zzs(zzadbVar, 4);
                int i29 = (zzegVar3.zzi()[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) + 1;
                this.zzX = i29;
                int[] iArrZzz2 = zzz(this.zzY, i29);
                this.zzY = iArrZzz2;
                if (i28 == 2) {
                    int i30 = (i11 - this.zzaa) - 4;
                    int i31 = this.zzX;
                    Arrays.fill(iArrZzz2, 0, i31, i30 / i31);
                } else {
                    if (i28 != 1) {
                        if (i28 != 3) {
                            throw zzat.zzb("Unexpected lacing value: 2", null);
                        }
                        int i32 = 0;
                        int i33 = 0;
                        int i34 = 4;
                        while (true) {
                            int i35 = this.zzX - 1;
                            if (i32 >= i35) {
                                i13 = i24;
                                i14 = i25;
                                i15 = i26;
                                this.zzY[i35] = ((i11 - this.zzaa) - i34) - i33;
                                break;
                            }
                            this.zzY[i32] = i26;
                            int i36 = i34 + 1;
                            zzs(zzadbVar, i36);
                            if (zzegVar3.zzi()[i34] == 0) {
                                throw zzat.zzb("No valid varint length mask found", null);
                            }
                            int i37 = i26;
                            while (true) {
                                if (i26 >= i27) {
                                    i16 = i24;
                                    i17 = i25;
                                    i18 = i27;
                                    j10 = 0;
                                    break;
                                }
                                i18 = i27;
                                int i38 = i25 << (7 - i26);
                                if ((zzegVar3.zzi()[i34] & i38) != 0) {
                                    i36 += i26;
                                    zzs(zzadbVar, i36);
                                    int i39 = i34 + 1;
                                    int i40 = zzegVar3.zzi()[i34] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED & (~i38);
                                    int i41 = i24;
                                    j10 = i40;
                                    i16 = i41;
                                    int i42 = i39;
                                    while (i42 < i36) {
                                        j10 = (j10 << i18) | (zzegVar3.zzi()[i42] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                        i25 = i25;
                                        i42++;
                                        i26 = i26;
                                    }
                                    i17 = i25;
                                    int i43 = i26;
                                    if (i32 > 0) {
                                        j10 -= (1 << ((i43 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i26++;
                                    i27 = i18;
                                }
                            }
                            if (j10 < -2147483648L || j10 > 2147483647L) {
                                break;
                            }
                            int[] iArr = this.zzY;
                            int i44 = (int) j10;
                            if (i32 != 0) {
                                i44 += iArr[i32 - 1];
                            }
                            iArr[i32] = i44;
                            i33 += i44;
                            i32++;
                            i34 = i36;
                            i26 = i37;
                            i24 = i16;
                            i27 = i18;
                            i25 = i17;
                        }
                        throw zzat.zzb("EBML lacing sample size out of range.", null);
                    }
                    int i45 = 0;
                    int i46 = 0;
                    int i47 = 4;
                    while (true) {
                        i19 = this.zzX - 1;
                        if (i45 >= i19) {
                            break;
                        }
                        this.zzY[i45] = 0;
                        while (true) {
                            i20 = i47 + 1;
                            zzs(zzadbVar, i20);
                            int i48 = zzegVar3.zzi()[i47] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                            int[] iArr2 = this.zzY;
                            i21 = iArr2[i45] + i48;
                            iArr2[i45] = i21;
                            if (i48 != 255) {
                                break;
                            } else {
                                i47 = i20;
                            }
                        }
                        i46 += i21;
                        i45++;
                        i47 = i20;
                    }
                    this.zzY[i19] = ((i11 - this.zzaa) - i47) - i46;
                }
            }
            i13 = 2;
            i14 = 1;
            i15 = 0;
            this.zzU = this.zzR + zzy((zzegVar3.zzi()[i15] << 8) | (zzegVar3.zzi()[i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
            if (zzahjVar3.zze == i14) {
                i22 = 1;
                this.zzab = i22;
                this.zzT = i13;
                this.zzW = i15;
                i12 = 163;
            } else {
                if (i23 != 163) {
                    i22 = i15;
                } else if ((zzegVar3.zzi()[i13] & 128) == 128) {
                    i23 = 163;
                    i22 = 1;
                } else {
                    i22 = i15;
                    i23 = 163;
                }
                this.zzab = i22;
                this.zzT = i13;
                this.zzW = i15;
                i12 = 163;
            }
        } else {
            i12 = 163;
        }
        if (i23 == i12) {
            while (true) {
                int i49 = this.zzW;
                if (i49 >= this.zzX) {
                    this.zzT = 0;
                    return;
                }
                int iZzt = zzt(zzadbVar, zzahjVar3, this.zzY[i49], false);
                zzahj zzahjVar4 = zzahjVar3;
                zzr(zzahjVar4, this.zzU + ((this.zzW * zzahjVar3.zzf) / 1000), this.zzab, iZzt, 0);
                this.zzW++;
                zzahjVar3 = zzahjVar4;
            }
        } else {
            while (true) {
                int i50 = this.zzW;
                if (i50 >= this.zzX) {
                    return;
                }
                int[] iArr3 = this.zzY;
                iArr3[i50] = zzt(zzadbVar, zzahjVar3, iArr3[i50], true);
                this.zzW++;
            }
        }
    }

    public zzahk(zzahd zzahdVar, int i10, zzakg zzakgVar) {
        this.zzy = -1L;
        this.zzz = C.TIME_UNSET;
        this.zzA = C.TIME_UNSET;
        this.zzB = C.TIME_UNSET;
        this.zzK = C.TIME_UNSET;
        this.zzL = -1;
        this.zzM = -1L;
        this.zzN = -1;
        this.zzP = -1L;
        this.zzQ = -1L;
        this.zzR = C.TIME_UNSET;
        this.zzap = zzahdVar;
        zzahdVar.zza(new zzahf(this, null));
        this.zzl = zzakgVar;
        this.zzI = new SparseArray();
        this.zzj = 1 == ((i10 & 1) ^ 1);
        this.zzk = (i10 & 2) == 0;
        this.zzh = new zzahm();
        this.zzi = new SparseArray();
        this.zzo = new zzeg(4);
        this.zzp = new zzeg(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzq = new zzeg(4);
        this.zzm = new zzeg(zzfm.zza);
        this.zzn = new zzeg(4);
        this.zzr = new zzeg();
        this.zzs = new zzeg();
        this.zzt = new zzeg(8);
        this.zzu = new zzeg();
        this.zzv = new zzeg();
        this.zzY = new int[1];
        this.zzD = true;
    }

    @RequiresNonNull({"#2.output"})
    private final int zzt(zzadb zzadbVar, zzahj zzahjVar, int i10, boolean z10) throws IOException {
        int i11;
        if ("S_TEXT/UTF8".equals(zzahjVar.zzc)) {
            zzv(zzadbVar, zzb, i10);
            int i12 = this.zzag;
            zzu();
            return i12;
        }
        if ("S_TEXT/ASS".equals(zzahjVar.zzc) || "S_TEXT/SSA".equals(zzahjVar.zzc)) {
            zzv(zzadbVar, zzd, i10);
            int i13 = this.zzag;
            zzu();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(zzahjVar.zzc)) {
            zzv(zzadbVar, zze, i10);
            int i14 = this.zzag;
            zzu();
            return i14;
        }
        if (zzahjVar.zzV) {
            zzahjVar.zzZ.getClass();
            zzeg zzegVar = new zzeg(i10);
            if (zzadbVar.zzh(zzegVar.zzi(), 0, i10, true)) {
                zzadbVar.zzl();
                if (zzacz.zza(zzegVar.zzr()) == 1 && zzegVar.zzd() >= 10) {
                    byte[] bArr = new byte[10];
                    zzegVar.zzm(bArr, 0, 10);
                    zzegVar.zzh(0);
                    int iZzc = zzacz.zzc(bArr);
                    if (zzegVar.zzd() >= iZzc + 4) {
                        zzegVar.zzk(iZzc);
                        if (zzacz.zza(zzegVar.zzB()) == 2) {
                            zzt zztVarZza = zzahjVar.zzZ.zza();
                            zztVarZza.zzm(MimeTypes.AUDIO_DTS_HD);
                            zzahjVar.zzZ = zztVarZza.zzM();
                        }
                    }
                }
            }
            zzahjVar.zzY.zzu(zzahjVar.zzZ);
            zzahjVar.zzV = false;
            zzA();
        }
        zzaem zzaemVar = zzahjVar.zzY;
        if (!this.zzai) {
            if (zzahjVar.zzh) {
                this.zzab &= -1073741825;
                if (!this.zzaj) {
                    zzeg zzegVar2 = this.zzo;
                    zzadbVar.zzc(zzegVar2.zzi(), 0, 1);
                    this.zzaf++;
                    if ((zzegVar2.zzi()[0] & 128) == 128) {
                        throw zzat.zzb("Extension bit is set in signal byte", null);
                    }
                    this.zzam = zzegVar2.zzi()[0];
                    this.zzaj = true;
                }
                byte b10 = this.zzam;
                if ((b10 & 1) == 1) {
                    int i15 = b10 & 2;
                    this.zzab |= 1073741824;
                    if (!this.zzan) {
                        zzeg zzegVar3 = this.zzt;
                        zzadbVar.zzc(zzegVar3.zzi(), 0, 8);
                        this.zzaf += 8;
                        this.zzan = true;
                        zzeg zzegVar4 = this.zzo;
                        zzegVar4.zzi()[0] = (byte) ((i15 != 2 ? 0 : 128) | 8);
                        zzegVar4.zzh(0);
                        zzaemVar.zzw(zzegVar4, 1, 1);
                        this.zzag++;
                        zzegVar3.zzh(0);
                        zzaemVar.zzw(zzegVar3, 8, 1);
                        this.zzag += 8;
                    }
                    if (i15 == 2) {
                        if (!this.zzak) {
                            zzeg zzegVar5 = this.zzo;
                            zzadbVar.zzc(zzegVar5.zzi(), 0, 1);
                            this.zzaf++;
                            zzegVar5.zzh(0);
                            this.zzal = zzegVar5.zzs();
                            this.zzak = true;
                        }
                        int i16 = this.zzal * 4;
                        zzeg zzegVar6 = this.zzo;
                        zzegVar6.zza(i16);
                        zzadbVar.zzc(zzegVar6.zzi(), 0, i16);
                        this.zzaf += i16;
                        int i17 = (this.zzal >> 1) + 1;
                        int i18 = (i17 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzw;
                        if (byteBuffer == null || byteBuffer.capacity() < i18) {
                            this.zzw = ByteBuffer.allocate(i18);
                        }
                        this.zzw.position(0);
                        this.zzw.putShort((short) i17);
                        int i19 = 0;
                        int i20 = 0;
                        while (true) {
                            i11 = this.zzal;
                            if (i19 >= i11) {
                                break;
                            }
                            int iZzH = zzegVar6.zzH();
                            int i21 = iZzH - i20;
                            if (i19 % 2 == 0) {
                                this.zzw.putShort((short) i21);
                            } else {
                                this.zzw.putInt(i21);
                            }
                            i19++;
                            i20 = iZzH;
                        }
                        int i22 = (i10 - this.zzaf) - i20;
                        if ((i11 & 1) == 1) {
                            this.zzw.putInt(i22);
                        } else {
                            this.zzw.putShort((short) i22);
                            this.zzw.putInt(0);
                        }
                        zzeg zzegVar7 = this.zzu;
                        zzegVar7.zzb(this.zzw.array(), i18);
                        zzaemVar.zzw(zzegVar7, i18, 1);
                        this.zzag += i18;
                    }
                }
            } else {
                byte[] bArr2 = zzahjVar.zzi;
                if (bArr2 != null) {
                    this.zzr.zzb(bArr2, bArr2.length);
                }
            }
            if (!yFkbx.zFECaFMA.equals(zzahjVar.zzc) ? zzahjVar.zzg > 0 : z10) {
                this.zzab |= 268435456;
                this.zzv.zza(0);
                int iZze = (this.zzr.zze() + i10) - this.zzaf;
                zzeg zzegVar8 = this.zzo;
                zzegVar8.zza(4);
                zzegVar8.zzi()[0] = (byte) ((iZze >> 24) & 255);
                zzegVar8.zzi()[1] = (byte) ((iZze >> 16) & 255);
                zzegVar8.zzi()[2] = (byte) ((iZze >> 8) & 255);
                zzegVar8.zzi()[3] = (byte) (iZze & 255);
                zzaemVar.zzw(zzegVar8, 4, 2);
                this.zzag += 4;
            }
            this.zzai = true;
        }
        zzeg zzegVar9 = this.zzr;
        int iZze2 = zzegVar9.zze() + i10;
        if (!"V_MPEG4/ISO/AVC".equals(zzahjVar.zzc) && !"V_MPEGH/ISO/HEVC".equals(zzahjVar.zzc)) {
            if (zzahjVar.zzU != null) {
                zzgmd.zzh(zzegVar9.zze() == 0);
                zzahjVar.zzU.zzb(zzadbVar);
            }
            while (true) {
                int i23 = this.zzaf;
                if (i23 >= iZze2) {
                    break;
                }
                int iZzx = zzx(zzadbVar, zzaemVar, iZze2 - i23);
                this.zzaf += iZzx;
                this.zzag += iZzx;
            }
        } else {
            zzeg zzegVar10 = this.zzn;
            byte[] bArrZzi = zzegVar10.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 0;
            bArrZzi[2] = 0;
            int i24 = zzahjVar.zzaa;
            int i25 = 4 - i24;
            while (this.zzaf < iZze2) {
                int i26 = this.zzah;
                if (i26 == 0) {
                    int iMin = Math.min(i24, zzegVar9.zzd());
                    zzadbVar.zzc(bArrZzi, i25 + iMin, i24 - iMin);
                    if (iMin > 0) {
                        zzegVar9.zzm(bArrZzi, i25, iMin);
                    }
                    this.zzaf += i24;
                    zzegVar10.zzh(0);
                    this.zzah = zzegVar10.zzH();
                    zzeg zzegVar11 = this.zzm;
                    zzegVar11.zzh(0);
                    zzaemVar.zzz(zzegVar11, 4);
                    this.zzag += 4;
                } else {
                    int iZzx2 = zzx(zzadbVar, zzaemVar, i26);
                    this.zzaf += iZzx2;
                    this.zzag += iZzx2;
                    this.zzah -= iZzx2;
                }
            }
        }
        if ("A_VORBIS".equals(zzahjVar.zzc)) {
            zzeg zzegVar12 = this.zzp;
            zzegVar12.zzh(0);
            zzaemVar.zzz(zzegVar12, 4);
            this.zzag += 4;
        }
        int i27 = this.zzag;
        zzu();
        return i27;
    }

    public final void zzi(int i10, long j10) throws zzat {
        boolean z10;
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 35);
            sb2.append(OcvDtWCQ.GTrKXYLu);
            sb2.append(j10);
            sb2.append(" not supported");
            throw zzat.zzb(sb2.toString(), null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(j10).length() + 35);
            sb3.append("ContentEncodingScope ");
            sb3.append(j10);
            sb3.append(" not supported");
            throw zzat.zzb(sb3.toString(), null);
        }
        switch (i10) {
            case MRAID_JS_WRITE_FAILED_VALUE:
                int i11 = (int) j10;
                if (i11 == 1) {
                    zzp(i10);
                    this.zzE.zze = 2;
                    return;
                }
                if (i11 == 2) {
                    zzp(i10);
                    this.zzE.zze = 1;
                    return;
                } else if (i11 == 17) {
                    zzp(i10);
                    this.zzE.zze = 3;
                    return;
                } else if (i11 != 33) {
                    zzp(i10);
                    this.zzE.zze = -1;
                    return;
                } else {
                    zzp(i10);
                    this.zzE.zze = 5;
                    return;
                }
            case PRIVACY_URL_ERROR_VALUE:
                z10 = j10 == 1;
                zzp(i10);
                this.zzE.zzX = z10;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                this.zzV = zzy(j10);
                return;
            case 159:
                zzp(i10);
                this.zzE.zzP = (int) j10;
                return;
            case 176:
                zzp(i10);
                this.zzE.zzm = (int) j10;
                return;
            case 179:
                zzq(i10);
                this.zzK = zzy(j10);
                return;
            case 186:
                zzp(i10);
                this.zzE.zzn = (int) j10;
                return;
            case AD_RESPONSE_EMPTY_VALUE:
                zzp(i10);
                this.zzE.zzd = (int) j10;
                return;
            case 231:
                this.zzR = zzy(j10);
                return;
            case 238:
                this.zzac = (int) j10;
                return;
            case 241:
                zzq(i10);
                if (this.zzM == -1) {
                    this.zzM = j10;
                    return;
                }
                return;
            case 247:
                zzq(i10);
                this.zzL = (int) j10;
                return;
            case 251:
                this.zzad = true;
                return;
            case 16871:
                zzp(i10);
                this.zzE.zzd((int) j10);
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                StringBuilder sb4 = new StringBuilder(String.valueOf(j10).length() + 30);
                sb4.append("ContentCompAlgo ");
                sb4.append(j10);
                sb4.append(" not supported");
                throw zzat.zzb(sb4.toString(), null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(j10).length() + 33);
                    sb5.append("DocTypeReadVersion ");
                    sb5.append(j10);
                    sb5.append(" not supported");
                    throw zzat.zzb(sb5.toString(), null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(String.valueOf(j10).length() + 30);
                sb6.append("EBMLReadVersion ");
                sb6.append(j10);
                sb6.append(" not supported");
                throw zzat.zzb(sb6.toString(), null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(String.valueOf(j10).length() + 29);
                sb7.append("ContentEncAlgo ");
                sb7.append(j10);
                sb7.append(" not supported");
                throw zzat.zzb(sb7.toString(), null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                StringBuilder sb8 = new StringBuilder(String.valueOf(j10).length() + 36);
                sb8.append("AESSettingsCipherMode ");
                sb8.append(j10);
                sb8.append(" not supported");
                throw zzat.zzb(sb8.toString(), null);
            case 21420:
                this.zzH = j10 + this.zzy;
                return;
            case 21432:
                int i12 = (int) j10;
                zzp(i10);
                if (i12 == 0) {
                    this.zzE.zzx = 0;
                    return;
                }
                if (i12 == 1) {
                    this.zzE.zzx = 2;
                    return;
                } else if (i12 == 3) {
                    this.zzE.zzx = 1;
                    return;
                } else {
                    if (i12 != 15) {
                        return;
                    }
                    this.zzE.zzx = 3;
                    return;
                }
            case 21680:
                zzp(i10);
                this.zzE.zzp = (int) j10;
                return;
            case 21682:
                zzp(i10);
                this.zzE.zzr = (int) j10;
                return;
            case 21690:
                zzp(i10);
                this.zzE.zzq = (int) j10;
                return;
            case 21930:
                z10 = j10 == 1;
                zzp(i10);
                this.zzE.zzW = z10;
                return;
            case 21938:
                zzp(i10);
                zzahj zzahjVar = this.zzE;
                zzahjVar.zzy = true;
                zzahjVar.zzo = (int) j10;
                return;
            case 21998:
                zzp(i10);
                this.zzE.zzg = (int) j10;
                return;
            case 22186:
                zzp(i10);
                this.zzE.zzS = j10;
                return;
            case 22203:
                zzp(i10);
                this.zzE.zzT = j10;
                return;
            case 25188:
                zzp(i10);
                this.zzE.zzQ = (int) j10;
                return;
            case 30114:
                this.zzae = j10;
                return;
            case 30321:
                int i13 = (int) j10;
                zzp(i10);
                if (i13 == 0) {
                    this.zzE.zzs = 0;
                    return;
                }
                if (i13 == 1) {
                    this.zzE.zzs = 1;
                    return;
                } else if (i13 == 2) {
                    this.zzE.zzs = 2;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    this.zzE.zzs = 3;
                    return;
                }
            case 2352003:
                zzp(i10);
                this.zzE.zzf = (int) j10;
                return;
            case 2807729:
                this.zzz = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        int i14 = (int) j10;
                        zzp(i10);
                        if (i14 == 1) {
                            this.zzE.zzB = 2;
                            return;
                        } else {
                            if (i14 != 2) {
                                return;
                            }
                            this.zzE.zzB = 1;
                            return;
                        }
                    case 21946:
                        zzp(i10);
                        int iZzc = zzi.zzc((int) j10);
                        if (iZzc != -1) {
                            this.zzE.zzA = iZzc;
                            return;
                        }
                        return;
                    case 21947:
                        zzp(i10);
                        this.zzE.zzy = true;
                        int iZzb = zzi.zzb((int) j10);
                        if (iZzb != -1) {
                            this.zzE.zzz = iZzb;
                            return;
                        }
                        return;
                    case 21948:
                        zzp(i10);
                        this.zzE.zzC = (int) j10;
                        return;
                    case 21949:
                        zzp(i10);
                        this.zzE.zzD = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    public zzahk(zzakg zzakgVar, int i10) {
        this(new zzahd(), 0, zzakgVar);
    }
}
