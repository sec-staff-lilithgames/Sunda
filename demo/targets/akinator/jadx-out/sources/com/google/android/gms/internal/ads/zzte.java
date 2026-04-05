package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import cv.BLca.YsiBvdpw;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzte extends zzhr {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private ArrayDeque zzA;
    private zztb zzB;
    private zzsy zzC;
    private int zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private long zzJ;
    private boolean zzK;
    private long zzL;
    private int zzM;
    private int zzN;
    private ByteBuffer zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private int zzV;
    private int zzW;
    private int zzX;
    private boolean zzY;
    private boolean zzZ;
    protected zzhs zza;
    private boolean zzaa;
    private long zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private zztd zzaf;
    private long zzag;
    private boolean zzah;
    private boolean zzai;
    private boolean zzaj;
    private long zzak;
    private final zzst zzc;
    private final zztg zzd;
    private final float zze;
    private final zzhh zzf;
    private final zzhh zzg;
    private final zzhh zzh;
    private final zzsm zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zzrm zzl;
    private zzv zzm;
    private zzv zzn;
    private zzrs zzo;
    private zzrs zzp;
    private zzlm zzq;
    private MediaCrypto zzr;
    private long zzs;
    private float zzt;
    private float zzu;
    private zzsv zzv;
    private zzv zzw;
    private MediaFormat zzx;
    private boolean zzy;
    private float zzz;

    public zzte(int i10, zzst zzstVar, zztg zztgVar, boolean z10, float f10) {
        super(i10);
        this.zzc = zzstVar;
        zztgVar.getClass();
        this.zzd = zztgVar;
        this.zze = f10;
        this.zzf = new zzhh(0, 0);
        this.zzg = new zzhh(0, 0);
        this.zzh = new zzhh(2, 0);
        zzsm zzsmVar = new zzsm();
        this.zzi = zzsmVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzt = 1.0f;
        this.zzu = 1.0f;
        this.zzs = C.TIME_UNSET;
        this.zzk = new ArrayDeque();
        this.zzaf = zztd.zza;
        zzsmVar.zzj(0);
        zzsmVar.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zzrm();
        this.zzz = -1.0f;
        this.zzD = 0;
        this.zzV = 0;
        this.zzM = -1;
        this.zzN = -1;
        this.zzL = C.TIME_UNSET;
        this.zzab = C.TIME_UNSET;
        this.zzag = C.TIME_UNSET;
        this.zzJ = C.TIME_UNSET;
        this.zzW = 0;
        this.zzX = 0;
        this.zza = new zzhs();
        this.zzaj = false;
        this.zzak = 0L;
    }

    private final void zzao() {
        this.zzR = false;
        zzat();
    }

    private final void zzat() {
        zzaw();
        this.zzT = false;
        this.zzi.zza();
        this.zzh.zza();
        this.zzS = false;
        this.zzl.zzb();
    }

    private final boolean zzau() {
        if (this.zzv == null) {
            return false;
        }
        if (zzaK()) {
            zzaI();
            return true;
        }
        if (zzaL()) {
            zzav();
            return false;
        }
        this.zzaj = true;
        return false;
    }

    private final void zzav() {
        try {
            zzsv zzsvVar = this.zzv;
            if (zzsvVar == null) {
                throw null;
            }
            zzsvVar.zzj();
        } finally {
            zzaN();
        }
    }

    private final void zzaw() {
        this.zzab = C.TIME_UNSET;
        this.zzaf.zzf = C.TIME_UNSET;
        this.zzag = C.TIME_UNSET;
    }

    private final boolean zzax(int i10) throws zztb, zzib {
        zzkj zzkjVarZzH = zzH();
        zzhh zzhhVar = this.zzf;
        zzhhVar.zza();
        int iZzO = zzO(zzkjVarZzH, zzhhVar, i10 | 4);
        if (iZzO == -5) {
            zzam(zzkjVarZzH);
            return true;
        }
        if (iZzO != -4 || !zzhhVar.zzb()) {
            return false;
        }
        this.zzac = true;
        zzbl();
        return false;
    }

    private final boolean zzay(long j10) {
        return this.zzs == C.TIME_UNSET || zzL().zzb() - j10 < this.zzs;
    }

    public static boolean zzbd(zzv zzvVar) {
        return zzvVar.zzN == 0;
    }

    private final boolean zzbf() {
        return this.zzN >= 0;
    }

    private final void zzbg() {
        this.zzM = -1;
        this.zzg.zzc = null;
    }

    private final void zzbh() {
        this.zzN = -1;
        this.zzO = null;
    }

    private final boolean zzbj() throws zzib {
        if (this.zzY) {
            this.zzW = 1;
            if (this.zzF) {
                this.zzX = 3;
                return false;
            }
            this.zzX = 2;
        } else {
            zzbo();
        }
        return true;
    }

    private final void zzbk() throws zztb, zzib {
        if (this.zzY) {
            this.zzW = 1;
            this.zzX = 3;
        } else {
            zzaI();
            zzaA();
        }
    }

    private final void zzbl() throws zztb, zzib {
        int i10 = this.zzX;
        if (i10 == 1) {
            zzav();
            return;
        }
        if (i10 == 2) {
            zzav();
            zzbo();
        } else if (i10 != 3) {
            this.zzad = true;
            zzar();
        } else {
            zzaI();
            zzaA();
        }
    }

    private final void zzbm(zztd zztdVar) {
        this.zzaf = zztdVar;
        if (zztdVar.zzd != C.TIME_UNSET) {
            this.zzah = true;
        }
    }

    private final zztd zzbn() {
        ArrayDeque arrayDeque = this.zzk;
        return !arrayDeque.isEmpty() ? (zztd) arrayDeque.getLast() : this.zzaf;
    }

    private final void zzbo() throws zzib {
        zzrs zzrsVar = this.zzp;
        zzrsVar.getClass();
        this.zzo = zzrsVar;
        this.zzW = 0;
        this.zzX = 0;
    }

    private final boolean zzbp(long j10, long j11) {
        if (j11 >= j10) {
            return false;
        }
        zzv zzvVar = this.zzn;
        return (zzvVar != null && Objects.equals(zzvVar.zzo, MimeTypes.AUDIO_OPUS) && zzadz.zzf(j10, j11)) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public void zzA(long j10, boolean z10, boolean z11) throws zztb, zzib {
        if (z11) {
            this.zzac = false;
            this.zzad = false;
            if (this.zzR) {
                zzat();
            } else {
                zzaJ();
            }
            zzel zzelVar = this.zzaf.zze;
            if (zzelVar.zzc() > 0) {
                this.zzae = true;
            }
            zzelVar.zzb();
            this.zzk.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public void zzD() {
        this.zzm = null;
        zzbm(zztd.zza);
        this.zzk.clear();
        if (this.zzR) {
            zzao();
        } else {
            zzau();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public void zzE() {
        try {
            zzao();
            zzaI();
        } finally {
            this.zzp = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final long zzT(long j10, long j11) {
        return zzah(j10, j11, this.zzK);
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public void zzV(float f10, float f11) throws zztb, zzib {
        this.zzt = f10;
        this.zzu = f11;
        zzbi(this.zzw);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:128|129|(12:392|131|(2:133|(2:135|(6:137|(1:146)(1:143)|144|145|227|(2:402|229)(1:230))(2:396|147))(6:395|148|(1:154)|155|(1:159)|160))(2:162|(4:164|145|227|(0)(0))(2:167|(7:172|(1:174)|175|(1:181)|(1:183)(2:184|(0))|188|(1:190)(2:398|191))(2:397|171)))|358|(2:361|(1:379))|365|(1:370)(1:369)|(1:372)|373|(1:375)(1:376)|377|378)(1:192)|193|(1:197)(1:198)|199|(1:204)(1:203)|205|206|383|207|(3:209|210|(5:212|(1:214)(1:215)|(1:221)|222|(2:401|224)(3:226|227|(0)(0)))(1:400))(3:399|349|350)) */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x026a, code lost:
    
        r2 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x035d, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0372, code lost:
    
        r4 = r21.zzv;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0374, code lost:
    
        if (r4 == null) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0379, code lost:
    
        if (r21.zzW == 2) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x037d, code lost:
    
        if (r21.zzac == false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0385, code lost:
    
        if (r21.zzM >= 0) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0387, code lost:
    
        r0 = r4.zze();
        r21.zzM = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x038d, code lost:
    
        if (r0 < 0) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x038f, code lost:
    
        r5 = r21.zzg;
        r5.zzc = r4.zzh(r0);
        r5.zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x039c, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x039d, code lost:
    
        if (r21.zzW != 1) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x03a1, code lost:
    
        if (r21.zzI != false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x03a3, code lost:
    
        r21.zzZ = true;
        r4.zza(r21.zzM, 0, 0, 0, 4);
        zzbg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x03b4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x03b7, code lost:
    
        r21.zzW = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x03be, code lost:
    
        if (r21.zzG == false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x03c1, code lost:
    
        r21.zzG = false;
        r0 = r21.zzg.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x03c7, code lost:
    
        if (r0 == null) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x03c9, code lost:
    
        r0.put(com.google.android.gms.internal.ads.zzte.zzb);
        r4.zza(r21.zzM, 0, 38, 0, 0);
        zzbg();
        r21.zzY = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x03e6, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x03ea, code lost:
    
        if (r21.zzV != 1) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x03ec, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x03ed, code lost:
    
        r5 = r21.zzw;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x03ef, code lost:
    
        if (r5 == null) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x03f7, code lost:
    
        if (r0 >= r5.zzr.size()) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x03f9, code lost:
    
        r5 = (byte[]) r21.zzw.zzr.get(r0);
        r6 = r21.zzg.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0407, code lost:
    
        if (r6 == null) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0409, code lost:
    
        r6.put(r5);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x040f, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0410, code lost:
    
        r21.zzV = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0413, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0414, code lost:
    
        r0 = r21.zzg;
        r5 = r0.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0418, code lost:
    
        if (r5 == null) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x041a, code lost:
    
        r5 = r5.position();
        r6 = zzH();
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0422, code lost:
    
        r0 = zzO(r6, r0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0427, code lost:
    
        if (r0 != (-3)) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x042d, code lost:
    
        if (zzdb() == false) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x042f, code lost:
    
        zzbn().zzf = r21.zzab;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x043a, code lost:
    
        if (r0 != (-5)) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x043e, code lost:
    
        if (r21.zzV != 2) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0440, code lost:
    
        r21.zzg.zza();
        r21.zzV = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0447, code lost:
    
        zzam(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x044c, code lost:
    
        r0 = r21.zzg;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0452, code lost:
    
        if (r0.zzb() == false) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0454, code lost:
    
        zzbn().zzf = r21.zzab;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x045e, code lost:
    
        if (r21.zzV != 2) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0460, code lost:
    
        r0.zza();
        r21.zzV = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0465, code lost:
    
        r21.zzac = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0469, code lost:
    
        if (r21.zzY != false) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x046b, code lost:
    
        zzbl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0472, code lost:
    
        if (r21.zzI != false) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0474, code lost:
    
        r21.zzZ = true;
        r4.zza(r21.zzM, 0, 0, 0, 4);
        zzbg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0488, code lost:
    
        if (r21.zzY != false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x048e, code lost:
    
        if (r0.zzc() != false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0490, code lost:
    
        r0.zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0495, code lost:
    
        if (r21.zzV != 2) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0497, code lost:
    
        r21.zzV = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x049f, code lost:
    
        if (zzaT(r0) != false) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x04a1, code lost:
    
        r6 = r0.zzk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x04a5, code lost:
    
        if (r6 == false) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x04a7, code lost:
    
        r0.zzb.zzc(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x04ac, code lost:
    
        r7 = r0.zze;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x04b0, code lost:
    
        if (r21.zzae == false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x04b2, code lost:
    
        r5 = zzbn().zze;
        r9 = r21.zzm;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x04ba, code lost:
    
        if (r9 == null) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x04bc, code lost:
    
        r5.zza(r7, r9);
        r21.zzae = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x04c2, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x04c3, code lost:
    
        r21.zzab = java.lang.Math.max(r21.zzab, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x04cf, code lost:
    
        if (zzdb() != false) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x04d5, code lost:
    
        if (r0.zzd() == false) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x04d7, code lost:
    
        zzbn().zzf = r21.zzab;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x04df, code lost:
    
        r0.zzl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x04e6, code lost:
    
        if (r0.zze() == false) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x04e8, code lost:
    
        zzas(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x04ed, code lost:
    
        if (r21.zzaj == false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x04ef, code lost:
    
        r9 = r21.zzab;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x04f3, code lost:
    
        if (r7 > r9) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x04f5, code lost:
    
        r21.zzak = ((r9 - r7) + 1) + r21.zzak;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x04ff, code lost:
    
        r21.zzab = r7;
        r21.zzaj = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0503, code lost:
    
        zzaR(r0);
        r10 = zzaS(r0);
        r8 = r7 + r21.zzak;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x050e, code lost:
    
        if (r6 == false) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0510, code lost:
    
        r4.zzb(r21.zzM, 0, r0.zzb, r8, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0519, code lost:
    
        r5 = r21.zzM;
        r0 = r0.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x051d, code lost:
    
        if (r0 == null) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x051f, code lost:
    
        r4.zza(r5, 0, r0.limit(), r8, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0527, code lost:
    
        zzbg();
        r21.zzY = true;
        r21.zzV = 0;
        r21.zza.zzc++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0536, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0537, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0538, code lost:
    
        zzal(r0);
        zzax(0);
        zzav();
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0549, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0552, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0553, code lost:
    
        r12 = r5;
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x000d, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0369 A[LOOP:0: B:126:0x01fa->B:230:0x0369, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0368 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzte] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.media.MediaFormat, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // com.google.android.gms.internal.ads.zzln
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void zzX(long r22, long r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzte.zzX(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public boolean zzY() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public boolean zzZ() {
        return this.zzad;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0227 A[Catch: Exception -> 0x0107, TryCatch #3 {Exception -> 0x0107, blocks: (B:57:0x00dd, B:59:0x00e7, B:61:0x00fb, B:67:0x0139, B:69:0x014a, B:71:0x0178, B:73:0x0181, B:75:0x0189, B:77:0x0193, B:79:0x019b, B:81:0x01a3, B:85:0x01ae, B:87:0x01b4, B:91:0x01c0, B:93:0x01c9, B:118:0x0221, B:120:0x0227, B:122:0x022d, B:123:0x023b, B:98:0x01d7, B:100:0x01df, B:102:0x01e7, B:104:0x01ef, B:106:0x01f7, B:108:0x01ff, B:110:0x0207, B:112:0x0211, B:114:0x021b), top: B:165:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0283 A[Catch: zztb -> 0x0084, TryCatch #4 {zztb -> 0x0084, blocks: (B:25:0x0057, B:27:0x005e, B:29:0x0062, B:31:0x0078, B:36:0x0089, B:40:0x0095, B:42:0x009d, B:44:0x00a1, B:46:0x00a5, B:48:0x00ae, B:138:0x026a, B:140:0x0283, B:142:0x028c, B:145:0x0293, B:146:0x0295, B:141:0x0286, B:148:0x0297, B:149:0x0298, B:151:0x029d, B:152:0x029e, B:153:0x02a8, B:38:0x008c, B:39:0x0094, B:155:0x02ab), top: B:167:0x0057, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0286 A[Catch: zztb -> 0x0084, TryCatch #4 {zztb -> 0x0084, blocks: (B:25:0x0057, B:27:0x005e, B:29:0x0062, B:31:0x0078, B:36:0x0089, B:40:0x0095, B:42:0x009d, B:44:0x00a1, B:46:0x00a5, B:48:0x00ae, B:138:0x026a, B:140:0x0283, B:142:0x028c, B:145:0x0293, B:146:0x0295, B:141:0x0286, B:148:0x0297, B:149:0x0298, B:151:0x029d, B:152:0x029e, B:153:0x02a8, B:38:0x008c, B:39:0x0094, B:155:0x02ab), top: B:167:0x0057, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0255 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d5  */
    /* JADX WARN: Type inference failed for: r0v30, types: [com.google.android.gms.internal.ads.zzst] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.google.android.gms.internal.ads.zzss] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzte] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzaA() throws com.google.android.gms.internal.ads.zztb, com.google.android.gms.internal.ads.zzib {
        /*
            Method dump skipped, instructions count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzte.zzaA():void");
    }

    public final boolean zzaB(zzv zzvVar) {
        return this.zzp == null && zzae(zzvVar);
    }

    public boolean zzaC(zzsy zzsyVar) {
        return true;
    }

    public final boolean zzaD() {
        return this.zzR;
    }

    public final zzsv zzaE() {
        return this.zzv;
    }

    public final zzv zzaF() {
        return this.zzw;
    }

    public final MediaFormat zzaG() {
        return this.zzx;
    }

    public final zzsy zzaH() {
        return this.zzC;
    }

    public final void zzaI() {
        try {
            zzsv zzsvVar = this.zzv;
            if (zzsvVar != null) {
                zzsvVar.zzk();
                this.zza.zzb++;
                zzsy zzsyVar = this.zzC;
                if (zzsyVar == null) {
                    throw null;
                }
                zzak(zzsyVar.zza);
            }
            this.zzv = null;
            this.zzr = null;
            this.zzo = null;
            zzaO();
        } catch (Throwable th2) {
            this.zzv = null;
            this.zzr = null;
            this.zzo = null;
            zzaO();
            throw th2;
        }
    }

    public final boolean zzaJ() throws zztb, zzib {
        boolean zZzau = zzau();
        if (zZzau) {
            zzaA();
        }
        return zZzau;
    }

    public boolean zzaK() {
        int i10 = this.zzX;
        if (i10 == 3 || ((this.zzE && !this.zzaa) || (this.zzF && this.zzZ))) {
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        try {
            zzbo();
            return false;
        } catch (zzib e10) {
            zzdt.zzd("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
            return true;
        }
    }

    public boolean zzaL() {
        return true;
    }

    public final long zzaM() {
        return this.zzak;
    }

    public void zzaN() {
        zzbg();
        zzbh();
        zzaw();
        this.zzL = C.TIME_UNSET;
        this.zzZ = false;
        this.zzJ = C.TIME_UNSET;
        this.zzY = false;
        this.zzG = false;
        this.zzH = false;
        this.zzP = false;
        this.zzQ = false;
        this.zzW = 0;
        this.zzX = 0;
        this.zzV = this.zzU ? 1 : 0;
        this.zzaj = false;
        this.zzak = 0L;
    }

    public final void zzaO() {
        zzaN();
        this.zzA = null;
        this.zzC = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = false;
        this.zzaa = false;
        this.zzz = -1.0f;
        this.zzD = 0;
        this.zzE = false;
        this.zzF = false;
        this.zzI = false;
        this.zzK = false;
        this.zzU = false;
        this.zzV = 0;
    }

    public zzsx zzaP(Throwable th2, zzsy zzsyVar) {
        return new zzsx(th2, zzsyVar);
    }

    public boolean zzaQ(zzv zzvVar) throws zzib {
        return true;
    }

    public void zzaR(zzhh zzhhVar) throws zzib {
    }

    public int zzaS(zzhh zzhhVar) {
        return 0;
    }

    public boolean zzaT(zzhh zzhhVar) {
        return false;
    }

    public final long zzaU() {
        return this.zzag;
    }

    public void zzaV(long j10) {
        this.zzag = j10;
        while (true) {
            ArrayDeque arrayDeque = this.zzk;
            if (arrayDeque.isEmpty() || j10 < ((zztd) arrayDeque.peek()).zzb) {
                return;
            }
            zztd zztdVar = (zztd) arrayDeque.poll();
            zztdVar.getClass();
            zzbm(zztdVar);
            zzap();
        }
    }

    public final boolean zzaW() {
        if (this.zzm == null) {
            return false;
        }
        if (zzQ() || zzbf()) {
            return true;
        }
        return this.zzL != C.TIME_UNSET && zzL().zzb() < this.zzL;
    }

    public final float zzaX() {
        return this.zzt;
    }

    public final zzlm zzaY() {
        return this.zzq;
    }

    public final boolean zzaZ() throws zzib {
        return zzbi(this.zzw);
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final int zzab(zzv zzvVar) throws zzib {
        try {
            return zzac(this.zzd, zzvVar);
        } catch (zzti e10) {
            throw zzN(e10, zzvVar, false, 4002);
        }
    }

    public abstract int zzac(zztg zztgVar, zzv zzvVar) throws zzti;

    public abstract List zzad(zztg zztgVar, zzv zzvVar, boolean z10) throws zzti;

    public boolean zzae(zzv zzvVar) {
        return false;
    }

    public abstract zzss zzaf(zzsy zzsyVar, zzv zzvVar, MediaCrypto mediaCrypto, float f10);

    public zzht zzag(zzsy zzsyVar, zzv zzvVar, zzv zzvVar2) {
        throw null;
    }

    public long zzah(long j10, long j11, boolean z10) {
        return super.zzT(j10, j11);
    }

    public float zzai(float f10, zzv zzvVar, zzv[] zzvVarArr) {
        throw null;
    }

    public void zzaj(String str, zzss zzssVar, long j10, long j11) {
        throw null;
    }

    public void zzak(String str) {
        throw null;
    }

    public void zzal(Exception exc) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.ads.zzht zzam(com.google.android.gms.internal.ads.zzkj r14) throws com.google.android.gms.internal.ads.zztb, com.google.android.gms.internal.ads.zzib {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzte.zzam(com.google.android.gms.internal.ads.zzkj):com.google.android.gms.internal.ads.zzht");
    }

    public void zzan(zzv zzvVar, MediaFormat mediaFormat) throws zzib {
        throw null;
    }

    public void zzap() {
    }

    public abstract boolean zzaq(long j10, long j11, zzsv zzsvVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzv zzvVar) throws zzib;

    public void zzar() throws zzib {
        throw null;
    }

    public void zzas(zzhh zzhhVar) throws zzib {
        throw null;
    }

    public final void zzaz() {
        this.zzai = true;
    }

    public final long zzba() {
        return this.zzaf.zzf;
    }

    public final long zzbb() {
        return this.zzaf.zzd;
    }

    public final long zzbc() {
        return this.zzaf.zzc;
    }

    public final /* synthetic */ zzlm zzbe() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzlp
    public final int zzu() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzli
    public void zzx(int i10, Object obj) throws zzib {
        if (i10 == 11) {
            zzlm zzlmVar = (zzlm) obj;
            zzlmVar.getClass();
            this.zzq = zzlmVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public void zzy(boolean z10, boolean z11) throws zzib {
        this.zza = new zzhs();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzhr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void zzz(com.google.android.gms.internal.ads.zzv[] r12, long r13, long r15, com.google.android.gms.internal.ads.zzuu r17) throws com.google.android.gms.internal.ads.zzib {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.zztd r12 = r11.zzaf
            long r0 = r12.zzd
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            com.google.android.gms.internal.ads.zztd r4 = new com.google.android.gms.internal.ads.zztd
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.zzbm(r4)
            boolean r12 = r11.zzai
            if (r12 == 0) goto L56
            r11.zzap()
            return
        L24:
            java.util.ArrayDeque r12 = r11.zzk
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.zzab
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.zzag
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            com.google.android.gms.internal.ads.zztd r4 = new com.google.android.gms.internal.ads.zztd
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.zzbm(r4)
            com.google.android.gms.internal.ads.zztd r12 = r11.zzaf
            long r12 = r12.zzd
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.zzap()
        L56:
            return
        L57:
            com.google.android.gms.internal.ads.zztd r0 = new com.google.android.gms.internal.ads.zztd
            long r1 = r11.zzab
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzte.zzz(com.google.android.gms.internal.ads.zzv[], long, long, com.google.android.gms.internal.ads.zzuu):void");
    }

    private final boolean zzbi(zzv zzvVar) throws zztb, zzib {
        if (this.zzv != null && this.zzX != 3 && zze() != 0) {
            float f10 = this.zzu;
            zzvVar.getClass();
            float fZzai = zzai(f10, zzvVar, zzI());
            float f11 = this.zzz;
            if (f11 != fZzai) {
                if (fZzai == -1.0f) {
                    zzbk();
                    return false;
                }
                if (f11 != -1.0f || fZzai > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat(YsiBvdpw.fOep, fZzai);
                    zzsv zzsvVar = this.zzv;
                    zzsvVar.getClass();
                    zzsvVar.zzo(bundle);
                    this.zzz = fZzai;
                }
            }
        }
        return true;
    }
}
