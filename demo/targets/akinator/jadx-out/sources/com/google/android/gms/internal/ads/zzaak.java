package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import androidx.core.app.NotificationCompat;
import com.amazon.device.ads.DtbConstants;
import com.facebook.ads.AdError;
import com.google.android.gms.common.Scopes;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaak extends zzte implements zzaaz {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, DtbConstants.DEFAULT_PLAYER_HEIGHT};
    private static boolean zzc;
    private static boolean zzd;
    private int zzA;
    private int zzB;
    private int zzC;
    private zzlu zzD;
    private boolean zzE;
    private long zzF;
    private int zzG;
    private long zzH;
    private zzbv zzI;
    private zzbv zzJ;
    private int zzK;
    private int zzL;
    private zzaax zzM;
    private long zzN;
    private long zzO;
    private boolean zzP;
    private final Context zze;
    private final boolean zzf;
    private final zzabr zzg;
    private final boolean zzh;
    private final zzaba zzi;
    private final zzaay zzj;
    private final long zzk;
    private final PriorityQueue zzl;
    private zzaaj zzm;
    private boolean zzn;
    private boolean zzo;
    private zzabx zzp;
    private boolean zzq;
    private int zzr;
    private List zzs;
    private Surface zzt;
    private zzaam zzu;
    private zzeh zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private long zzz;

    public zzaak(zzaai zzaaiVar) {
        super(2, zzaaiVar.zzg(), zzaaiVar.zzf(), false, 30.0f);
        Context applicationContext = zzaaiVar.zze().getApplicationContext();
        this.zze = applicationContext;
        this.zzp = null;
        this.zzg = new zzabr(zzaaiVar.zzh(), zzaaiVar.zzi());
        this.zzf = this.zzp == null;
        this.zzi = new zzaba(applicationContext, this, 0L);
        this.zzj = new zzaay();
        this.zzh = "NVIDIA".equals(Build.MANUFACTURER);
        this.zzv = zzeh.zza;
        this.zzx = 1;
        this.zzy = 0;
        this.zzI = zzbv.zza;
        this.zzL = 0;
        this.zzJ = null;
        this.zzK = -1000;
        this.zzN = C.TIME_UNSET;
        this.zzO = C.TIME_UNSET;
        this.zzl = new PriorityQueue();
        this.zzk = C.TIME_UNSET;
        this.zzD = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if (r3.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP8) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a4, code lost:
    
        if (r3.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_MP4V) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bc, code lost:
    
        if (r3.equals(com.unity3d.services.core.device.MimeTypes.VIDEO_AV1) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c5, code lost:
    
        if (r3.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_H263) != false) goto L57;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzat(com.google.android.gms.internal.ads.zzsy r8, com.google.android.gms.internal.ads.zzv r9) {
        /*
            int r0 = r9.zzv
            int r1 = r9.zzw
            r2 = -1
            if (r0 == r2) goto Lcc
            if (r1 != r2) goto Lb
            goto Lcc
        Lb:
            java.lang.String r3 = r9.zzo
            r3.getClass()
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "video/avc"
            java.lang.String r6 = "video/av01"
            java.lang.String r7 = "video/hevc"
            if (r4 == 0) goto L42
            int r3 = com.google.android.gms.internal.ads.zztq.zza
            android.util.Pair r9 = com.google.android.gms.internal.ads.zzdd.zzd(r9)
            if (r9 == 0) goto L41
            java.lang.Object r9 = r9.first
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r3 = 512(0x200, float:7.17E-43)
            if (r9 == r3) goto L3f
            r3 = 1
            if (r9 == r3) goto L3f
            r3 = 2
            if (r9 != r3) goto L39
            goto L3f
        L39:
            r3 = 1024(0x400, float:1.435E-42)
            if (r9 != r3) goto L41
            r3 = r6
            goto L42
        L3f:
            r3 = r5
            goto L42
        L41:
            r3 = r7
        L42:
            int r9 = r3.hashCode()
            r4 = 4
            switch(r9) {
                case -1664118616: goto Lbf;
                case -1662735862: goto Lb8;
                case -1662541442: goto La7;
                case 1187890754: goto L9e;
                case 1331836730: goto L61;
                case 1599127256: goto L58;
                case 1599127257: goto L4c;
                default: goto L4a;
            }
        L4a:
            goto Lcc
        L4c:
            java.lang.String r8 = "video/x-vnd.on2.vp9"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto Lcc
            r4 = 8
            goto Lc7
        L58:
            java.lang.String r8 = "video/x-vnd.on2.vp8"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto Lcc
            goto Lc7
        L61:
            boolean r9 = r3.equals(r5)
            if (r9 == 0) goto Lcc
            java.lang.String r9 = android.os.Build.MODEL
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto Lcc
            java.lang.String r3 = "Amazon"
            java.lang.String r5 = android.os.Build.MANUFACTURER
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L8f
            java.lang.String r3 = "KFSOWI"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto Lcc
            java.lang.String r3 = "AFTS"
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto L8f
            boolean r8 = r8.zzf
            if (r8 != 0) goto Lcc
        L8f:
            java.lang.String r8 = com.google.android.gms.internal.ads.zzep.zza
            int r0 = r0 + 15
            int r1 = r1 + 15
            int r0 = r0 / 16
            int r1 = r1 / 16
            int r1 = r1 * r0
            int r1 = r1 * 768
            int r1 = r1 / r4
            return r1
        L9e:
            java.lang.String r8 = "video/mp4v-es"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto Lcc
            goto Lc7
        La7:
            boolean r8 = r3.equals(r7)
            if (r8 == 0) goto Lcc
            int r0 = r0 * r1
            int r0 = r0 * 3
            int r0 = r0 / r4
            r8 = 2097152(0x200000, float:2.938736E-39)
            int r8 = java.lang.Math.max(r8, r0)
            return r8
        Lb8:
            boolean r8 = r3.equals(r6)
            if (r8 == 0) goto Lcc
            goto Lc7
        Lbf:
            java.lang.String r8 = "video/3gpp"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto Lcc
        Lc7:
            int r0 = r0 * r1
            int r0 = r0 * 3
            int r0 = r0 / r4
            return r0
        Lcc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaak.zzat(com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzv):int");
    }

    public static int zzbg(zzsy zzsyVar, zzv zzvVar) {
        int i10 = zzvVar.zzp;
        if (i10 == -1) {
            return zzat(zzsyVar, zzvVar);
        }
        List list = zzvVar.zzr;
        int size = list.size();
        int length = 0;
        for (int i11 = 0; i11 < size; i11++) {
            length += ((byte[]) list.get(i11)).length;
        }
        return i10 + length;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0656 A[Catch: all -> 0x006c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x0018, B:507:0x066a, B:42:0x0073, B:45:0x007e, B:77:0x00dd, B:500:0x0656, B:508:0x066e), top: B:513:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean zzbk(java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 2286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaak.zzbk(java.lang.String):boolean");
    }

    public static final boolean zzbl(zzsy zzsyVar) {
        return Build.VERSION.SDK_INT >= 35 && zzsyVar.zzh;
    }

    private static List zzbm(Context context, zztg zztgVar, zzv zzvVar, boolean z10, boolean z11) throws zzti {
        String str = zzvVar.zzo;
        if (str == null) {
            return zzgpe.zzi();
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzaah.zza(context)) {
            List listZzd = zztq.zzd(zztgVar, zzvVar, z10, z11);
            if (!listZzd.isEmpty()) {
                return listZzd;
            }
        }
        return zztq.zzc(zztgVar, zzvVar, z10, z11);
    }

    private final void zzbn(Object obj) throws zztb, zzib {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.zzt == surface) {
            if (surface != null) {
                zzbv();
                Surface surface2 = this.zzt;
                if (surface2 == null || !this.zzw) {
                    return;
                }
                this.zzg.zzg(surface2);
                return;
            }
            return;
        }
        this.zzt = surface;
        if (this.zzp == null) {
            this.zzi.zzd(surface);
        }
        this.zzw = false;
        int iZze = zze();
        zzsv zzsvVarZzaE = zzaE();
        if (zzsvVarZzaE != null && this.zzp == null) {
            zzsy zzsyVarZzaH = zzaH();
            zzsyVarZzaH.getClass();
            if (!zzbr(zzsyVarZzaH) || this.zzn) {
                zzaI();
                zzaA();
            } else {
                Surface surfaceZzbs = zzbs(zzsyVarZzaH);
                if (surfaceZzbs != null) {
                    zzsvVarZzaE.zzm(surfaceZzbs);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    zzsvVarZzaE.zzn();
                }
            }
        }
        if (surface != null) {
            zzbv();
        } else {
            this.zzJ = null;
            zzabx zzabxVar = this.zzp;
            if (zzabxVar != null) {
                zzabxVar.zzq();
            }
        }
        if (iZze == 2) {
            zzabx zzabxVar2 = this.zzp;
            if (zzabxVar2 != null) {
                zzabxVar2.zzw(true);
            } else {
                this.zzi.zzj(true);
            }
        }
    }

    private final boolean zzbo(zzhh zzhhVar) {
        if (zzdb() || zzhhVar.zzd() || this.zzO == C.TIME_UNSET) {
            return true;
        }
        return this.zzO - (zzhhVar.zze - zzbb()) <= 100000;
    }

    private final boolean zzbp(zzhh zzhhVar) {
        return zzhhVar.zze < zzG();
    }

    private final void zzbq(long j10, long j11, zzv zzvVar) {
        zzaax zzaaxVar = this.zzM;
        if (zzaaxVar != null) {
            zzaaxVar.zzcS(j10, j11, zzvVar, zzaG());
        }
    }

    private final boolean zzbr(zzsy zzsyVar) {
        if (this.zzp != null) {
            return true;
        }
        Surface surface = this.zzt;
        return (surface != null && surface.isValid()) || zzbl(zzsyVar) || zzbf(zzsyVar);
    }

    private final Surface zzbs(zzsy zzsyVar) {
        zzabx zzabxVar = this.zzp;
        if (zzabxVar != null) {
            return zzabxVar.zzk();
        }
        Surface surface = this.zzt;
        if (surface != null) {
            return surface;
        }
        if (zzbl(zzsyVar)) {
            return null;
        }
        zzgmd.zzh(zzbf(zzsyVar));
        zzaam zzaamVar = this.zzu;
        if (zzaamVar != null) {
            if (zzaamVar.zza != zzsyVar.zzf) {
                zzbt();
            }
        }
        if (this.zzu == null) {
            this.zzu = zzaam.zzb(this.zze, zzsyVar.zzf);
        }
        return this.zzu;
    }

    private final void zzbt() {
        zzaam zzaamVar = this.zzu;
        if (zzaamVar != null) {
            zzaamVar.release();
            this.zzu = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresNonNull({"displaySurface"})
    /* renamed from: zzbu, reason: merged with bridge method [inline-methods] */
    public final void zzbi() {
        this.zzg.zzg(this.zzt);
        this.zzw = true;
    }

    private final void zzbv() {
        zzbv zzbvVar = this.zzJ;
        if (zzbvVar != null) {
            this.zzg.zzf(zzbvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzhr
    public final void zzA(long j10, boolean z10, boolean z11) throws zztb, zzib {
        zzabx zzabxVar = this.zzp;
        if (zzabxVar != null && !z10) {
            zzabxVar.zzg(true);
        }
        super.zzA(j10, z10, z11);
        if (this.zzp == null) {
            this.zzi.zzl();
        }
        if (z10) {
            zzabx zzabxVar2 = this.zzp;
            if (zzabxVar2 != null) {
                zzabxVar2.zzw(false);
            } else {
                this.zzi.zzj(false);
            }
        }
        this.zzB = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zzB() {
        this.zzA = 0;
        this.zzz = zzL().zzb();
        this.zzF = 0L;
        this.zzG = 0;
        zzabx zzabxVar = this.zzp;
        if (zzabxVar != null) {
            zzabxVar.zza();
        } else {
            this.zzi.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zzC() {
        if (this.zzA > 0) {
            long jZzb = zzL().zzb();
            this.zzg.zzd(this.zzA, jZzb - this.zzz);
            this.zzA = 0;
            this.zzz = jZzb;
        }
        int i10 = this.zzG;
        if (i10 != 0) {
            this.zzg.zze(this.zzF, i10);
            this.zzF = 0L;
            this.zzG = 0;
        }
        zzabx zzabxVar = this.zzp;
        if (zzabxVar != null) {
            zzabxVar.zzb();
        } else {
            this.zzi.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzhr
    public final void zzD() {
        this.zzJ = null;
        this.zzO = C.TIME_UNSET;
        this.zzw = false;
        this.zzE = true;
        try {
            super.zzD();
        } finally {
            zzabr zzabrVar = this.zzg;
            zzabrVar.zzi(((zzte) this).zza);
            zzabrVar.zzf(zzbv.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzhr
    public final void zzE() {
        try {
            super.zzE();
        } finally {
            this.zzq = false;
            this.zzN = C.TIME_UNSET;
            zzbt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zzF() {
        zzabx zzabxVar = this.zzp;
        if (zzabxVar == null || !this.zzf) {
            return;
        }
        zzabxVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzln, com.google.android.gms.internal.ads.zzlp
    public final String zzS() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final boolean zzU(long j10) {
        long jZzaU = zzaU();
        return jZzaU == C.TIME_UNSET || j10 > jZzaU - zzbb();
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzln
    public final void zzV(float f10, float f11) throws zztb, zzib {
        super.zzV(f10, f11);
        zzabx zzabxVar = this.zzp;
        if (zzabxVar != null) {
            zzabxVar.zzm(f10);
        } else {
            this.zzi.zzn(f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzW() {
        zzabx zzabxVar = this.zzp;
        if (zzabxVar == null) {
            this.zzi.zzh();
            return;
        }
        int i10 = this.zzr;
        if (i10 == 0 || i10 == 1) {
            this.zzr = 0;
        } else {
            zzabxVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzln
    public final void zzX(long j10, long j11) throws Throwable {
        zzabx zzabxVar = this.zzp;
        if (zzabxVar != null) {
            try {
                zzabxVar.zzv(j10, j11);
            } catch (zzabw e10) {
                throw zzN(e10, e10.zza, false, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE);
            }
        }
        super.zzX(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzln
    public final boolean zzY() {
        boolean zZzaW = zzaW();
        zzabx zzabxVar = this.zzp;
        if (zzabxVar != null) {
            return zzabxVar.zzh(zZzaW);
        }
        if (zZzaW && zzaE() == null) {
            return true;
        }
        return this.zzi.zzi(zZzaW);
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzln
    public final boolean zzZ() {
        if (!super.zzZ()) {
            return false;
        }
        zzabx zzabxVar = this.zzp;
        return zzabxVar == null || zzabxVar.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final boolean zzaC(zzsy zzsyVar) {
        return zzbr(zzsyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final boolean zzaK() {
        zzsy zzsyVarZzaH = zzaH();
        if (this.zzp != null && zzsyVarZzaH != null) {
            String str = zzsyVarZzaH.zza;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.zzaK();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002a  */
    @Override // com.google.android.gms.internal.ads.zzte
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzaL() {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.zzv r0 = r12.zzaF()
            long r1 = r12.zzO
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L2a
            r8 = 1
            long r1 = r1 + r8
            long r8 = r12.zzbb()
            long r10 = r12.zzO
            long r8 = r8 + r10
            long r10 = r12.zzaM()
            long r10 = r10 + r1
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r1 = r1 - r8
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 <= 0) goto L2c
        L2a:
            r1 = r7
            goto L2d
        L2c:
            r1 = r6
        L2d:
            com.google.android.gms.internal.ads.zzlu r2 = r12.zzD
            if (r2 != 0) goto L32
            goto L47
        L32:
            boolean r2 = r12.zzE
            if (r2 != 0) goto L47
            if (r0 == 0) goto L3c
            int r0 = r0.zzq
            if (r0 > 0) goto L47
        L3c:
            if (r1 != 0) goto L47
            long r0 = r12.zzba()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L47
            return r6
        L47:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaak.zzaL():boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final void zzaN() {
        super.zzaN();
        this.zzl.clear();
        this.zzC = 0;
        this.zzE = false;
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final zzsx zzaP(Throwable th2, zzsy zzsyVar) {
        return new zzaae(th2, zzsyVar, this.zzt);
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final boolean zzaQ(zzv zzvVar) throws zzib {
        zzabx zzabxVar = this.zzp;
        if (zzabxVar == null || zzabxVar.zze()) {
            return true;
        }
        try {
            zzabxVar.zzd(zzvVar);
            return true;
        } catch (zzabw e10) {
            throw zzN(e10, zzvVar, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final void zzaR(zzhh zzhhVar) throws zzib {
        int iZzaS = zzaS(zzhhVar);
        if (Build.VERSION.SDK_INT < 34 || (iZzaS & 32) == 0) {
            this.zzC++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final int zzaS(zzhh zzhhVar) {
        return (Build.VERSION.SDK_INT < 34 || this.zzD == null || !zzbp(zzhhVar) || zzbo(zzhhVar)) ? 0 : 32;
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final boolean zzaT(zzhh zzhhVar) {
        boolean z10 = false;
        if (zzbo(zzhhVar)) {
            return false;
        }
        if (zzbp(zzhhVar)) {
            if (zzhhVar.zze()) {
                return false;
            }
            if (zzhhVar.zzf()) {
                zzhhVar.zza();
                z10 = true;
            }
            if (z10) {
                ((zzte) this).zza.zzd++;
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final void zzaV(long j10) {
        super.zzaV(j10);
        this.zzC--;
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final int zzac(zztg zztgVar, zzv zzvVar) throws zzti {
        boolean z10;
        String str = zzvVar.zzo;
        if (!zzas.zzb(str)) {
            return 128;
        }
        Context context = this.zze;
        int i10 = 0;
        boolean z11 = zzvVar.zzs != null;
        List listZzbm = zzbm(context, zztgVar, zzvVar, z11, false);
        if (z11 && listZzbm.isEmpty()) {
            listZzbm = zzbm(context, zztgVar, zzvVar, false, false);
        }
        if (listZzbm.isEmpty()) {
            return 129;
        }
        if (!zzte.zzbd(zzvVar)) {
            return 130;
        }
        zzsy zzsyVar = (zzsy) listZzbm.get(0);
        boolean zZzc = zzsyVar.zzc(zzvVar);
        if (zZzc) {
            z10 = true;
        } else {
            for (int i11 = 1; i11 < listZzbm.size(); i11++) {
                zzsy zzsyVar2 = (zzsy) listZzbm.get(i11);
                if (zzsyVar2.zzc(zzvVar)) {
                    zZzc = true;
                    z10 = false;
                    zzsyVar = zzsyVar2;
                    break;
                }
            }
            z10 = true;
        }
        int i12 = true != zZzc ? 3 : 4;
        int i13 = true != zzsyVar.zze(zzvVar) ? 8 : 16;
        int i14 = true != zzsyVar.zzg ? 0 : 64;
        int i15 = true != z10 ? 0 : 128;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzaah.zza(context)) {
            i15 = NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (zZzc) {
            List listZzbm2 = zzbm(context, zztgVar, zzvVar, z11, true);
            if (!listZzbm2.isEmpty()) {
                zzsy zzsyVar3 = (zzsy) zztq.zze(listZzbm2, zzvVar).get(0);
                if (zzsyVar3.zzc(zzvVar) && zzsyVar3.zze(zzvVar)) {
                    i10 = 32;
                }
            }
        }
        return i12 | i13 | i10 | i14 | i15;
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final List zzad(zztg zztgVar, zzv zzvVar, boolean z10) throws zzti {
        return zztq.zze(zzbm(this.zze, zztgVar, zzvVar, false, false), zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final zzss zzaf(zzsy zzsyVar, zzv zzvVar, MediaCrypto mediaCrypto, float f10) {
        zzaaj zzaajVar;
        Point pointZzi;
        int i10;
        int i11;
        int i12;
        boolean z10;
        zzv[] zzvVarArr;
        char c10;
        boolean z11;
        int iZzat;
        zzv[] zzvVarArrZzI = zzI();
        int length = zzvVarArrZzI.length;
        int iZzbg = zzbg(zzsyVar, zzvVar);
        int i13 = zzvVar.zzw;
        int i14 = zzvVar.zzv;
        if (length == 1) {
            if (iZzbg != -1 && (iZzat = zzat(zzsyVar, zzvVar)) != -1) {
                iZzbg = Math.min((int) (iZzbg * 1.5f), iZzat);
            }
            zzaajVar = new zzaaj(i14, i13, iZzbg);
        } else {
            int iMax = i13;
            int iMax2 = i14;
            int i15 = 0;
            boolean z12 = false;
            while (i15 < length) {
                zzv zzvVarZzM = zzvVarArrZzI[i15];
                zzi zziVar = zzvVar.zzE;
                if (zziVar != null && zzvVarZzM.zzE == null) {
                    zzt zztVarZza = zzvVarZzM.zza();
                    zztVarZza.zzC(zziVar);
                    zzvVarZzM = zztVarZza.zzM();
                }
                if (zzsyVar.zzf(zzvVar, zzvVarZzM).zzd != 0) {
                    int i16 = zzvVarZzM.zzv;
                    c10 = 65535;
                    if (i16 != -1) {
                        zzvVarArr = zzvVarArrZzI;
                        if (zzvVarZzM.zzw != -1) {
                            z11 = false;
                        }
                        z12 |= z11;
                        iMax2 = Math.max(iMax2, i16);
                        iMax = Math.max(iMax, zzvVarZzM.zzw);
                        iZzbg = Math.max(iZzbg, zzbg(zzsyVar, zzvVarZzM));
                    } else {
                        zzvVarArr = zzvVarArrZzI;
                    }
                    z11 = true;
                    z12 |= z11;
                    iMax2 = Math.max(iMax2, i16);
                    iMax = Math.max(iMax, zzvVarZzM.zzw);
                    iZzbg = Math.max(iZzbg, zzbg(zzsyVar, zzvVarZzM));
                } else {
                    zzvVarArr = zzvVarArrZzI;
                    c10 = 65535;
                }
                i15++;
                zzvVarArrZzI = zzvVarArr;
            }
            if (z12) {
                zzdt.zzc("MediaCodecVideoRenderer", com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.m(iMax2, iMax, "Resolutions unknown. Codec max resolution: ", "x", new StringBuilder(String.valueOf(iMax2).length() + 44 + String.valueOf(iMax).length())));
                boolean z13 = i13 > i14;
                int i17 = z13 ? i13 : i14;
                int i18 = true != z13 ? i13 : i14;
                int[] iArr = zzb;
                int i19 = 0;
                while (i19 < 9) {
                    float f11 = i18;
                    float f12 = i17;
                    int i20 = iArr[i19];
                    int i21 = i19;
                    float f13 = i20;
                    if (i20 <= i17 || (i10 = (int) (f13 * (f11 / f12))) <= i18) {
                        break;
                    }
                    int i22 = i17;
                    if (true != z13) {
                        i11 = i18;
                        i12 = i20;
                    } else {
                        i11 = i18;
                        i12 = i10;
                    }
                    if (true != z13) {
                        i20 = i10;
                    }
                    pointZzi = zzsyVar.zzi(i12, i20);
                    float f14 = zzvVar.zzz;
                    if (pointZzi != null) {
                        z10 = z13;
                        if (zzsyVar.zzg(pointZzi.x, pointZzi.y, f14)) {
                            break;
                        }
                    } else {
                        z10 = z13;
                    }
                    i19 = i21 + 1;
                    i17 = i22;
                    i18 = i11;
                    z13 = z10;
                }
                pointZzi = null;
                if (pointZzi != null) {
                    iMax2 = Math.max(iMax2, pointZzi.x);
                    iMax = Math.max(iMax, pointZzi.y);
                    zzt zztVarZza2 = zzvVar.zza();
                    zztVarZza2.zzt(iMax2);
                    zztVarZza2.zzu(iMax);
                    iZzbg = Math.max(iZzbg, zzat(zzsyVar, zztVarZza2.zzM()));
                    zzdt.zzc("MediaCodecVideoRenderer", com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.m(iMax2, iMax, "Codec max resolution adjusted to: ", "x", new StringBuilder(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.a(iMax2, 35) + String.valueOf(iMax).length())));
                }
            }
            zzaajVar = new zzaaj(iMax2, iMax, iZzbg);
        }
        String str = zzsyVar.zzc;
        this.zzm = zzaajVar;
        boolean z14 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i14);
        mediaFormat.setInteger("height", i13);
        zzdw.zza(mediaFormat, zzvVar.zzr);
        float f15 = zzvVar.zzz;
        if (f15 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f15);
        }
        zzdw.zzb(mediaFormat, "rotation-degrees", zzvVar.zzA);
        zzi zziVar2 = zzvVar.zzE;
        if (zziVar2 != null) {
            zzdw.zzb(mediaFormat, "color-transfer", zziVar2.zzd);
            zzdw.zzb(mediaFormat, "color-standard", zziVar2.zzb);
            zzdw.zzb(mediaFormat, "color-range", zziVar2.zzc);
            byte[] bArr = zziVar2.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzvVar.zzo)) {
            int i23 = zztq.zza;
            Pair pairZzd = zzdd.zzd(zzvVar);
            if (pairZzd != null) {
                zzdw.zzb(mediaFormat, Scopes.PROFILE, ((Integer) pairZzd.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", zzaajVar.zza);
        mediaFormat.setInteger("max-height", zzaajVar.zzb);
        zzdw.zzb(mediaFormat, "max-input-size", zzaajVar.zzc);
        mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f10);
        }
        if (z14) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzK));
        }
        Surface surfaceZzbs = zzbs(zzsyVar);
        if (this.zzp != null && !zzep.zzS(this.zze)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return zzss.zzb(zzsyVar, mediaFormat, zzvVar, surfaceZzbs, null);
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final zzht zzag(zzsy zzsyVar, zzv zzvVar, zzv zzvVar2) {
        int i10;
        int i11;
        zzht zzhtVarZzf = zzsyVar.zzf(zzvVar, zzvVar2);
        int i12 = zzhtVarZzf.zze;
        zzaaj zzaajVar = this.zzm;
        zzaajVar.getClass();
        if (zzvVar2.zzv > zzaajVar.zza || zzvVar2.zzw > zzaajVar.zzb) {
            i12 |= NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (zzbg(zzsyVar, zzvVar2) > zzaajVar.zzc) {
            i12 |= 64;
        }
        String str = zzsyVar.zza;
        if (i12 != 0) {
            i11 = 0;
            i10 = i12;
        } else {
            i10 = 0;
            i11 = zzhtVarZzf.zzd;
        }
        return new zzht(str, zzvVar, zzvVar2, i11, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final float zzai(float f10, zzv zzvVar, zzv[] zzvVarArr) {
        zzsy zzsyVarZzaH;
        float fMax = -1.0f;
        for (zzv zzvVar2 : zzvVarArr) {
            float f11 = zzvVar2.zzz;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        float f12 = fMax == -1.0f ? -1.0f : fMax * f10;
        if (this.zzD == null || (zzsyVarZzaH = zzaH()) == null) {
            return f12;
        }
        float fZzh = zzsyVarZzaH.zzh(zzvVar.zzv, zzvVar.zzw);
        return f12 != -1.0f ? Math.max(f12, fZzh) : fZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final void zzaj(String str, zzss zzssVar, long j10, long j11) {
        this.zzg.zzb(str, j10, j11);
        this.zzn = zzbk(str);
        zzsy zzsyVarZzaH = zzaH();
        zzsyVarZzaH.getClass();
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 29 && MimeTypes.VIDEO_VP9.equals(zzsyVarZzaH.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzb = zzsyVarZzaH.zzb();
            int length = codecProfileLevelArrZzb.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (codecProfileLevelArrZzb[i10].profile == 16384) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        }
        this.zzo = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final void zzak(String str) {
        this.zzg.zzh(str);
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final void zzal(Exception exc) {
        zzdt.zzf("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzj(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final zzht zzam(zzkj zzkjVar) throws zztb, zzib {
        zzht zzhtVarZzam = super.zzam(zzkjVar);
        zzv zzvVar = zzkjVar.zzb;
        zzvVar.getClass();
        this.zzg.zzc(zzvVar, zzhtVarZzam);
        return zzhtVarZzam;
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final void zzan(zzv zzvVar, MediaFormat mediaFormat) {
        zzsv zzsvVarZzaE = zzaE();
        if (zzsvVarZzaE != null) {
            zzsvVarZzaE.zzp(this.zzx);
        }
        mediaFormat.getClass();
        boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f10 = zzvVar.zzB;
        int i10 = zzvVar.zzA;
        if (i10 == 90 || i10 == 270) {
            f10 = 1.0f / f10;
            int i11 = integer2;
            integer2 = integer;
            integer = i11;
        }
        this.zzI = new zzbv(integer, integer2, f10);
        zzabx zzabxVar = this.zzp;
        if (zzabxVar == null || !this.zzP) {
            this.zzi.zze(zzvVar.zzz);
        } else {
            zzt zztVarZza = zzvVar.zza();
            zztVarZza.zzt(integer);
            zztVarZza.zzu(integer2);
            zztVarZza.zzz(f10);
            zzv zzvVarZzM = zztVarZza.zzM();
            int i12 = this.zzr;
            List listZzi = this.zzs;
            if (listZzi == null) {
                listZzi = zzgpe.zzi();
            }
            zzabxVar.zzs(1, zzvVarZzM, zzbc(), i12, listZzi);
            this.zzr = 2;
        }
        this.zzP = false;
    }

    @Override // com.google.android.gms.internal.ads.zzaaz
    public final boolean zzao(long j10, long j11, long j12, boolean z10, boolean z11) throws zztb, zzib {
        int iZzP;
        if (this.zzp != null && this.zzf) {
            j11 -= -this.zzN;
        }
        if (j10 >= -500000 || z10 || (iZzP = zzP(j11)) == 0) {
            return false;
        }
        if (z11) {
            zzhs zzhsVar = ((zzte) this).zza;
            int i10 = zzhsVar.zzd + iZzP;
            zzhsVar.zzd = i10;
            zzhsVar.zzf += this.zzC;
            zzhsVar.zzd = this.zzl.size() + i10;
        } else {
            ((zzte) this).zza.zzj++;
            zzaw(this.zzl.size() + iZzP, this.zzC);
        }
        zzaJ();
        zzabx zzabxVar = this.zzp;
        if (zzabxVar != null) {
            zzabxVar.zzg(false);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final void zzap() {
        zzabx zzabxVar = this.zzp;
        if (zzabxVar != null) {
            zzabxVar.zzi();
            long jZzbc = this.zzN;
            if (jZzbc == C.TIME_UNSET) {
                jZzbc = zzbc();
                this.zzN = jZzbc;
            }
            this.zzp.zzo(-jZzbc);
        } else {
            this.zzi.zza(2);
        }
        this.zzP = true;
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final boolean zzaq(long j10, long j11, zzsv zzsvVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzv zzvVar) throws zzib {
        zzaak zzaakVar;
        long j13;
        zzsvVar.getClass();
        long jZzbb = j12 - zzbb();
        int i13 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.zzl;
            Long l9 = (Long) priorityQueue.peek();
            if (l9 == null || l9.longValue() >= j12) {
                break;
            }
            priorityQueue.poll();
            i13++;
        }
        zzaw(i13, 0);
        zzabx zzabxVar = this.zzp;
        if (zzabxVar != null) {
            if (!z10 || z11) {
                return zzabxVar.zzu(j12, new zzaag(this, zzsvVar, i10, jZzbb));
            }
            zzau(zzsvVar, i10, jZzbb);
            return true;
        }
        zzaba zzabaVar = this.zzi;
        long jZzbc = zzbc();
        zzaay zzaayVar = this.zzj;
        int iZzk = zzabaVar.zzk(j12, j10, j11, jZzbc, z10, z11, zzaayVar);
        if (iZzk == 0) {
            long jZzc = zzL().zzc();
            zzbq(jZzbb, jZzc, zzvVar);
            zzay(zzsvVar, i10, jZzbb, jZzc);
            zzax(zzaayVar.zza());
            return true;
        }
        if (iZzk != 1) {
            if (iZzk == 2) {
                zzav(zzsvVar, i10, jZzbb);
                zzax(zzaayVar.zza());
                return true;
            }
            if (iZzk != 3) {
                return false;
            }
            zzau(zzsvVar, i10, jZzbb);
            zzax(zzaayVar.zza());
            return true;
        }
        long jZzb = zzaayVar.zzb();
        long jZza = zzaayVar.zza();
        if (jZzb == this.zzH) {
            zzau(zzsvVar, i10, jZzbb);
            j13 = jZzb;
            zzaakVar = this;
        } else {
            zzbq(jZzbb, jZzb, zzvVar);
            zzay(zzsvVar, i10, jZzbb, jZzb);
            zzaakVar = this;
            j13 = jZzb;
        }
        zzaakVar.zzax(jZza);
        zzaakVar.zzH = j13;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final void zzar() {
        zzabx zzabxVar = this.zzp;
        if (zzabxVar != null) {
            zzabxVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final void zzas(zzhh zzhhVar) throws zzib {
        if (this.zzo) {
            ByteBuffer byteBuffer = zzhhVar.zzf;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zzsv zzsvVarZzaE = zzaE();
                        zzsvVarZzaE.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzsvVarZzaE.zzo(bundle);
                    }
                }
            }
        }
    }

    public final void zzau(zzsv zzsvVar, int i10, long j10) {
        Trace.beginSection("skipVideoBuffer");
        zzsvVar.zzc(i10, false);
        Trace.endSection();
        ((zzte) this).zza.zzf++;
    }

    public final void zzav(zzsv zzsvVar, int i10, long j10) {
        Trace.beginSection("dropVideoBuffer");
        zzsvVar.zzc(i10, false);
        Trace.endSection();
        zzaw(0, 1);
    }

    public final void zzaw(int i10, int i11) {
        zzhs zzhsVar = ((zzte) this).zza;
        zzhsVar.zzh += i10;
        int i12 = i10 + i11;
        zzhsVar.zzg += i12;
        this.zzA += i12;
        int i13 = this.zzB + i12;
        this.zzB = i13;
        zzhsVar.zzi = Math.max(i13, zzhsVar.zzi);
    }

    public final void zzax(long j10) {
        zzhs zzhsVar = ((zzte) this).zza;
        zzhsVar.zzk += j10;
        zzhsVar.zzl++;
        this.zzF += j10;
        this.zzG++;
    }

    public final void zzay(zzsv zzsvVar, int i10, long j10, long j11) {
        Trace.beginSection("releaseOutputBuffer");
        zzsvVar.zzd(i10, j11);
        Trace.endSection();
        ((zzte) this).zza.zze++;
        this.zzB = 0;
        if (this.zzp == null) {
            zzbv zzbvVar = this.zzI;
            if (!zzbvVar.equals(zzbv.zza) && !zzbvVar.equals(this.zzJ)) {
                this.zzJ = zzbvVar;
                this.zzg.zzf(zzbvVar);
            }
            if (!this.zzi.zzf() || this.zzt == null) {
                return;
            }
            zzbi();
        }
    }

    public final boolean zzbf(zzsy zzsyVar) {
        if (zzbk(zzsyVar.zza)) {
            return false;
        }
        return !zzsyVar.zzf || zzaam.zza(this.zze);
    }

    public final /* synthetic */ Surface zzbj() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzli
    public final void zzx(int i10, Object obj) throws zztb, zzib {
        if (i10 == 1) {
            zzbn(obj);
            return;
        }
        if (i10 == 7) {
            obj.getClass();
            zzaax zzaaxVar = (zzaax) obj;
            this.zzM = zzaaxVar;
            zzabx zzabxVar = this.zzp;
            if (zzabxVar != null) {
                zzabxVar.zzl(zzaaxVar);
                return;
            }
            return;
        }
        if (i10 == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.zzL != iIntValue) {
                this.zzL = iIntValue;
                return;
            }
            return;
        }
        if (i10 == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.zzx = iIntValue2;
            zzsv zzsvVarZzaE = zzaE();
            if (zzsvVarZzaE != null) {
                zzsvVarZzaE.zzp(iIntValue2);
                return;
            }
            return;
        }
        if (i10 == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.zzy = iIntValue3;
            zzabx zzabxVar2 = this.zzp;
            if (zzabxVar2 != null) {
                zzabxVar2.zzr(iIntValue3);
                return;
            } else {
                this.zzi.zzm(iIntValue3);
                return;
            }
        }
        if (i10 == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(zzbr.zza)) {
                zzabx zzabxVar3 = this.zzp;
                if (zzabxVar3 == null || !zzabxVar3.zze()) {
                    return;
                }
                zzabxVar3.zzf();
                return;
            }
            this.zzs = list;
            zzabx zzabxVar4 = this.zzp;
            if (zzabxVar4 != null) {
                zzabxVar4.zzn(list);
                return;
            }
            return;
        }
        if (i10 == 14) {
            obj.getClass();
            zzeh zzehVar = (zzeh) obj;
            if (zzehVar.zza() == 0 || zzehVar.zzb() == 0) {
                return;
            }
            this.zzv = zzehVar;
            zzabx zzabxVar5 = this.zzp;
            if (zzabxVar5 != null) {
                Surface surface = this.zzt;
                surface.getClass();
                zzabxVar5.zzp(surface, zzehVar);
                return;
            }
            return;
        }
        switch (i10) {
            case 16:
                obj.getClass();
                this.zzK = ((Integer) obj).intValue();
                zzsv zzsvVarZzaE2 = zzaE();
                if (zzsvVarZzaE2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.zzK));
                    zzsvVarZzaE2.zzo(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.zzt;
                zzbn(null);
                obj.getClass();
                ((zzaak) obj).zzx(1, surface2);
                break;
            case 18:
                boolean z10 = this.zzD != null;
                zzlu zzluVar = (zzlu) obj;
                this.zzD = zzluVar;
                if (z10 != (zzluVar != null)) {
                    zzaZ();
                    break;
                }
                break;
            default:
                super.zzx(i10, obj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzhr
    public final void zzy(boolean z10, boolean z11) throws zzib {
        super.zzy(z10, z11);
        zzJ();
        this.zzg.zza(((zzte) this).zza);
        if (!this.zzq) {
            if (this.zzs != null && this.zzp == null) {
                zzaao zzaaoVar = new zzaao(this.zze, this.zzi);
                zzaaoVar.zza(true);
                long j10 = this.zzk;
                long j11 = C.TIME_UNSET;
                if (j10 != C.TIME_UNSET) {
                    j11 = -j10;
                }
                zzaaoVar.zzc(j11);
                zzaaoVar.zzb(zzL());
                zzaaw zzaawVarZzd = zzaaoVar.zzd();
                zzaawVarZzd.zza(1);
                this.zzp = zzaawVarZzd.zzb(0);
            }
            this.zzq = true;
        }
        int i10 = !z11 ? 1 : 0;
        zzabx zzabxVar = this.zzp;
        if (zzabxVar == null) {
            zzaba zzabaVar = this.zzi;
            zzabaVar.zzg(zzL());
            zzabaVar.zza(i10);
            return;
        }
        zzabxVar.zzc(new zzaaf(this), zzguz.zza());
        zzaax zzaaxVar = this.zzM;
        if (zzaaxVar != null) {
            this.zzp.zzl(zzaaxVar);
        }
        if (this.zzt != null && !this.zzv.equals(zzeh.zza)) {
            this.zzp.zzp(this.zzt, this.zzv);
        }
        this.zzp.zzr(this.zzy);
        this.zzp.zzm(zzaX());
        List list = this.zzs;
        if (list != null) {
            this.zzp.zzn(list);
        }
        this.zzr = i10;
        zzaz();
    }

    @Override // com.google.android.gms.internal.ads.zzte, com.google.android.gms.internal.ads.zzhr
    public final void zzz(zzv[] zzvVarArr, long j10, long j11, zzuu zzuuVar) throws zzib {
        super.zzz(zzvVarArr, j10, j11, zzuuVar);
        zzbf zzbfVarZzM = zzM();
        if (zzbfVarZzM.zzg()) {
            this.zzO = C.TIME_UNSET;
        } else {
            this.zzO = zzbfVarZzM.zzo(zzuuVar.zza, new zzbd()).zzd;
        }
    }
}
