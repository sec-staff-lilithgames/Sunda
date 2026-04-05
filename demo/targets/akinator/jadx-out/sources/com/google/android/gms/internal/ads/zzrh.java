package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzrh implements zzqh {
    private static final Object zza = new Object();
    private static ScheduledExecutorService zzb;
    private static int zzc;
    private zzqx zzA;
    private zzav zzB;
    private boolean zzC;
    private long zzD;
    private long zzE;
    private long zzF;
    private long zzG;
    private int zzH;
    private boolean zzI;
    private boolean zzJ;
    private long zzK;
    private float zzL;
    private ByteBuffer zzM;
    private int zzN;
    private ByteBuffer zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private int zzT;
    private boolean zzU;
    private zze zzV;
    private AudioDeviceInfo zzW;
    private long zzX;
    private boolean zzY;
    private boolean zzZ;
    private Looper zzaa;
    private long zzab;
    private long zzac;
    private Handler zzad;
    private Context zzae;
    private boolean zzaf;
    private int zzag;
    private boolean zzah;
    private final zzqr zzai;
    private final zzqn zzaj;
    private final Context zzd;
    private final zzqm zze;
    private final zzrp zzf;
    private final zzck zzg;
    private final zzro zzh;
    private final zzgpe zzi;
    private final zzql zzj;
    private final ArrayDeque zzk;
    private zzrg zzl;
    private final zzrc zzm;
    private final zzrc zzn;
    private final int zzo;
    private zzpc zzp;
    private zzqe zzq;
    private zzqq zzr;
    private zzqq zzs;
    private zzcc zzt;
    private AudioTrack zzu;
    private zzpe zzv;
    private zzpj zzw;
    private zzrb zzx;
    private zzd zzy;
    private zzqx zzz;

    public /* synthetic */ zzrh(zzqp zzqpVar, byte[] bArr) {
        int deviceId;
        byte[] bArr2 = null;
        Context applicationContext = zzqpVar.zzb() == null ? null : zzqpVar.zzb().getApplicationContext();
        this.zzd = applicationContext;
        this.zzy = zzd.zza;
        this.zzv = applicationContext != null ? null : zzqpVar.zzc();
        this.zzai = zzqpVar.zzd();
        zzqn zzqnVarZze = zzqpVar.zze();
        zzqnVarZze.getClass();
        this.zzaj = zzqnVarZze;
        this.zzj = new zzql(new zzrd(this, bArr2));
        zzqm zzqmVar = new zzqm();
        this.zze = zzqmVar;
        zzrp zzrpVar = new zzrp();
        this.zzf = zzrpVar;
        this.zzg = new zzck();
        this.zzh = new zzro();
        this.zzi = zzgpe.zzk(zzrpVar, zzqmVar);
        this.zzL = 1.0f;
        this.zzT = 0;
        this.zzV = new zze(0, 0.0f);
        zzav zzavVar = zzav.zza;
        this.zzA = new zzqx(zzavVar, 0L, 0L, null);
        this.zzB = zzavVar;
        this.zzC = false;
        this.zzk = new ArrayDeque();
        this.zzm = new zzrc();
        this.zzn = new zzrc();
        int i10 = -1;
        if (Build.VERSION.SDK_INT >= 34 && zzqpVar.zzb() != null && (deviceId = zzqpVar.zzb().getDeviceId()) != 0 && deviceId != -1) {
            i10 = deviceId;
        }
        this.zzo = i10;
        this.zzaf = true;
    }

    public static /* synthetic */ void zzE(AudioTrack audioTrack, final zzqe zzqeVar, Handler handler, final zzqb zzqbVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (zzqeVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqu
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzqeVar.zzc(zzqbVar);
                    }
                });
            }
            synchronized (zza) {
                try {
                    int i10 = zzc - 1;
                    zzc = i10;
                    if (i10 == 0) {
                        zzb.shutdown();
                        zzb = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (zzqeVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqv
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzqeVar.zzc(zzqbVar);
                    }
                });
            }
            synchronized (zza) {
                try {
                    int i11 = zzc - 1;
                    zzc = i11;
                    if (i11 == 0) {
                        zzb.shutdown();
                        zzb = null;
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    public static /* synthetic */ boolean zzH() {
        boolean z10;
        synchronized (zza) {
            z10 = zzc > 0;
        }
        return z10;
    }

    private final void zzM() {
        zzcc zzccVar = this.zzs.zzi;
        this.zzt = zzccVar;
        zzccVar.zzb(zzce.zza);
    }

    private final AudioTrack zzN(zzqq zzqqVar) throws zzqd {
        Context context;
        try {
            int i10 = this.zzT;
            int i11 = this.zzo;
            Context context2 = null;
            if (i11 != -1 && (context = this.zzd) != null && Build.VERSION.SDK_INT >= 34) {
                if (this.zzae == null) {
                    this.zzae = context.createDeviceContext(i11);
                }
                context2 = this.zzae;
                i10 = 0;
            }
            return zzaf(zzqqVar.zza(), this.zzy, i10, zzqqVar.zza, context2);
        } catch (zzqd e10) {
            zzqe zzqeVar = this.zzq;
            if (zzqeVar != null) {
                zzqeVar.zzb(e10);
            }
            throw e10;
        }
    }

    private final void zzO(long j10) throws Exception {
        zzR(j10);
        if (this.zzO != null) {
            return;
        }
        if (!this.zzt.zzc()) {
            ByteBuffer byteBuffer = this.zzM;
            if (byteBuffer != null) {
                zzQ(byteBuffer);
                zzR(j10);
                return;
            }
            return;
        }
        while (!this.zzt.zzg()) {
            do {
                ByteBuffer byteBufferZze = this.zzt.zze();
                if (byteBufferZze.hasRemaining()) {
                    zzQ(byteBufferZze);
                    zzR(j10);
                } else {
                    ByteBuffer byteBuffer2 = this.zzM;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.zzt.zzd(this.zzM);
                    }
                }
            } while (this.zzO == null);
            return;
        }
    }

    private final boolean zzP() throws Exception {
        if (!this.zzt.zzc()) {
            zzR(Long.MIN_VALUE);
            return this.zzO == null;
        }
        this.zzt.zzf();
        zzO(Long.MIN_VALUE);
        if (!this.zzt.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer = this.zzO;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x004b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzQ(java.nio.ByteBuffer r19) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrh.zzQ(java.nio.ByteBuffer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzR(long r8) throws java.lang.Exception {
        /*
            r7 = this;
            java.nio.ByteBuffer r8 = r7.zzO
            if (r8 != 0) goto L6
            goto Lb6
        L6:
            com.google.android.gms.internal.ads.zzrc r8 = r7.zzn
            boolean r9 = r8.zzb()
            if (r9 != 0) goto Lb6
            java.nio.ByteBuffer r9 = r7.zzO
            int r9 = r9.remaining()
            android.media.AudioTrack r0 = r7.zzu
            java.nio.ByteBuffer r1 = r7.zzO
            r2 = 1
            int r0 = r0.write(r1, r9, r2)
            long r3 = android.os.SystemClock.elapsedRealtime()
            r7.zzX = r3
            r3 = 0
            r1 = 0
            if (r0 >= 0) goto L6d
            r9 = -6
            if (r0 == r9) goto L32
            r9 = -32
            if (r0 != r9) goto L30
            goto L32
        L30:
            r2 = r1
            goto L46
        L32:
            long r5 = r7.zzG()
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 <= 0) goto L3b
            goto L46
        L3b:
            android.media.AudioTrack r9 = r7.zzu
            boolean r9 = zzab(r9)
            if (r9 == 0) goto L30
            r7.zzS()
        L46:
            com.google.android.gms.internal.ads.zzqg r9 = new com.google.android.gms.internal.ads.zzqg
            com.google.android.gms.internal.ads.zzqq r1 = r7.zzs
            com.google.android.gms.internal.ads.zzv r1 = r1.zza
            r9.<init>(r0, r1, r2)
            com.google.android.gms.internal.ads.zzqe r0 = r7.zzq
            if (r0 == 0) goto L56
            r0.zzb(r9)
        L56:
            boolean r0 = r9.zzb
            if (r0 == 0) goto L69
            android.content.Context r0 = r7.zzd
            if (r0 != 0) goto L5f
            goto L69
        L5f:
            com.google.android.gms.internal.ads.zzpe r8 = com.google.android.gms.internal.ads.zzpe.zza
            r7.zzv = r8
            com.google.android.gms.internal.ads.zzpj r0 = r7.zzw
            r0.zza(r8)
            throw r9
        L69:
            r8.zza(r9)
            return
        L6d:
            r8.zzc()
            android.media.AudioTrack r8 = r7.zzu
            boolean r8 = zzab(r8)
            if (r8 == 0) goto L8c
            long r5 = r7.zzG
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 <= 0) goto L80
            r7.zzZ = r1
        L80:
            boolean r8 = r7.zzS
            if (r8 == 0) goto L8c
            com.google.android.gms.internal.ads.zzqe r8 = r7.zzq
            if (r8 == 0) goto L8c
            if (r0 >= r9) goto L8c
            com.google.android.gms.internal.ads.zzrk r8 = (com.google.android.gms.internal.ads.zzrk) r8
        L8c:
            com.google.android.gms.internal.ads.zzqq r8 = r7.zzs
            int r8 = r8.zzc
            if (r8 != 0) goto L98
            long r3 = r7.zzF
            long r5 = (long) r0
            long r3 = r3 + r5
            r7.zzF = r3
        L98:
            if (r0 != r9) goto Lb6
            if (r8 == 0) goto Lb3
            java.nio.ByteBuffer r8 = r7.zzO
            java.nio.ByteBuffer r9 = r7.zzM
            if (r8 != r9) goto La3
            goto La4
        La3:
            r2 = r1
        La4:
            com.google.android.gms.internal.ads.zzgmd.zzh(r2)
            long r8 = r7.zzG
            int r0 = r7.zzH
            long r0 = (long) r0
            int r2 = r7.zzN
            long r2 = (long) r2
            long r0 = r0 * r2
            long r0 = r0 + r8
            r7.zzG = r0
        Lb3:
            r8 = 0
            r7.zzO = r8
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrh.zzR(long):void");
    }

    private final void zzS() {
        if (this.zzs.zzc == 1) {
            this.zzY = true;
        }
    }

    private final void zzT() {
        if (zzX()) {
            this.zzu.setVolume(this.zzL);
        }
    }

    private final void zzU(zzav zzavVar) {
        zzqx zzqxVar = new zzqx(zzavVar, C.TIME_UNSET, C.TIME_UNSET, null);
        if (zzX()) {
            this.zzz = zzqxVar;
        } else {
            this.zzA = zzqxVar;
        }
    }

    private final void zzV(long j10) {
        zzav zzavVar;
        boolean z10;
        if (zzW()) {
            zzqr zzqrVar = this.zzai;
            zzavVar = this.zzB;
            zzqrVar.zzb(zzavVar);
        } else {
            zzavVar = zzav.zza;
        }
        zzav zzavVar2 = zzavVar;
        this.zzB = zzavVar2;
        if (zzW()) {
            zzqr zzqrVar2 = this.zzai;
            z10 = this.zzC;
            zzqrVar2.zzc(z10);
        } else {
            z10 = false;
        }
        this.zzC = z10;
        this.zzk.add(new zzqx(zzavVar2, Math.max(0L, j10), zzep.zzr(zzG(), this.zzs.zze), null));
        zzM();
        zzqe zzqeVar = this.zzq;
        if (zzqeVar != null) {
            ((zzrk) zzqeVar).zza.zzaw().zzh(this.zzC);
        }
    }

    private final boolean zzW() {
        zzqq zzqqVar = this.zzs;
        if (zzqqVar.zzc != 0) {
            return false;
        }
        int i10 = zzqqVar.zza.zzI;
        return true;
    }

    private final boolean zzX() {
        return this.zzu != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzY, reason: merged with bridge method [inline-methods] */
    public final long zzF() {
        return this.zzs.zzc == 0 ? this.zzD / r0.zzb : this.zzE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzZ, reason: merged with bridge method [inline-methods] */
    public final long zzG() {
        zzqq zzqqVar = this.zzs;
        if (zzqqVar.zzc != 0) {
            return this.zzG;
        }
        long j10 = this.zzF;
        long j11 = zzqqVar.zzd;
        String str = zzep.zza;
        return ((j10 + j11) - 1) / j11;
    }

    @EnsuresNonNull({"audioCapabilities"})
    private final void zzaa() {
        Context context;
        Looper looperMyLooper = Looper.myLooper();
        boolean z10 = true;
        if (this.zzw != null && this.zzaa != looperMyLooper) {
            z10 = false;
        }
        zzgmd.zzj(z10, "DefaultAudioSink accessed on multiple threads: %s and %s", zzae(this.zzaa), zzae(looperMyLooper));
        if (this.zzw == null && (context = this.zzd) != null) {
            this.zzaa = looperMyLooper;
            zzpj zzpjVar = new zzpj(context, new zzpi() { // from class: com.google.android.gms.internal.ads.zzqs
                @Override // com.google.android.gms.internal.ads.zzpi
                public final /* synthetic */ void zza(zzpe zzpeVar) {
                    this.zza.zzC(zzpeVar);
                }
            }, this.zzy, this.zzW);
            this.zzw = zzpjVar;
            this.zzv = zzpjVar.zzd();
        }
        this.zzv.getClass();
    }

    private static boolean zzab(AudioTrack audioTrack) {
        return Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final void zzac() throws IllegalStateException {
        if (this.zzQ) {
            return;
        }
        this.zzQ = true;
        this.zzj.zzf(zzG());
        if (zzab(this.zzu)) {
            this.zzR = false;
        }
        this.zzu.stop();
    }

    private final boolean zzad(long j10) {
        long jZzb = this.zzj.zzb();
        AudioTrack audioTrack = this.zzu;
        audioTrack.getClass();
        return j10 > zzep.zzs(jZzb, audioTrack.getSampleRate());
    }

    private static String zzae(Looper looper) {
        return looper == null ? AbstractJsonLexerKt.NULL : looper.getThread().getName();
    }

    private static final AudioTrack zzaf(zzqb zzqbVar, zzd zzdVar, int i10, zzv zzvVar, Context context) throws UnsupportedOperationException, IllegalArgumentException, zzqd {
        zzv zzvVar2;
        Exception exc;
        try {
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(zzdVar.zza()).setAudioFormat(zzep.zzC(zzqbVar.zzb, zzqbVar.zzc, zzqbVar.zza)).setTransferMode(1).setBufferSizeInBytes(zzqbVar.zze).setSessionId(i10);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                try {
                    sessionId.setOffloadedPlayback(zzqbVar.zzd);
                } catch (IllegalArgumentException e10) {
                    e = e10;
                    exc = e;
                    zzvVar2 = zzvVar;
                    throw new zzqd(0, zzqbVar.zzb, zzqbVar.zzc, zzqbVar.zza, zzqbVar.zze, zzvVar2, zzqbVar.zzd, exc);
                } catch (UnsupportedOperationException e11) {
                    e = e11;
                    exc = e;
                    zzvVar2 = zzvVar;
                    throw new zzqd(0, zzqbVar.zzb, zzqbVar.zzc, zzqbVar.zza, zzqbVar.zze, zzvVar2, zzqbVar.zzd, exc);
                }
            }
            if (i11 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack audioTrackBuild = sessionId.build();
            int state = audioTrackBuild.getState();
            if (state == 1) {
                return audioTrackBuild;
            }
            try {
                audioTrackBuild.release();
            } catch (Exception unused) {
            }
            throw new zzqd(state, zzqbVar.zzb, zzqbVar.zzc, zzqbVar.zza, zzqbVar.zze, zzvVar, zzqbVar.zzd, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e12) {
            zzvVar2 = zzvVar;
            exc = e12;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zzA() throws IllegalStateException {
        zzz();
        zzgpe zzgpeVar = this.zzi;
        int size = zzgpeVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzcg) zzgpeVar.get(i10)).zzj();
        }
        this.zzg.zzj();
        this.zzh.zzj();
        zzcc zzccVar = this.zzt;
        if (zzccVar != null) {
            zzccVar.zzh();
        }
        this.zzS = false;
        this.zzY = false;
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zzB() {
        zzpj zzpjVar = this.zzw;
        if (zzpjVar != null) {
            zzpjVar.zze();
        }
    }

    public final void zzC(zzpe zzpeVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.zzaa;
        zzgmd.zzj(looper == looperMyLooper, "Current looper (%s) is not the playback looper (%s)", zzae(looperMyLooper), zzae(this.zzaa));
        zzpe zzpeVar2 = this.zzv;
        if (zzpeVar2 == null || zzpeVar.equals(zzpeVar2)) {
            return;
        }
        this.zzv = zzpeVar;
        zzqe zzqeVar = this.zzq;
        if (zzqeVar != null) {
            ((zzrk) zzqeVar).zza.zzR();
        }
    }

    public final /* synthetic */ void zzD() {
        if (this.zzac >= 300000) {
            ((zzrk) this.zzq).zza.zzay(true);
            this.zzac = 0L;
        }
    }

    public final /* synthetic */ zzqe zzI() {
        return this.zzq;
    }

    public final /* synthetic */ AudioTrack zzJ() {
        return this.zzu;
    }

    public final /* synthetic */ void zzK(boolean z10) {
        this.zzR = true;
    }

    public final /* synthetic */ boolean zzL() {
        return this.zzS;
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zza(zzqe zzqeVar) {
        this.zzq = zzqeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zzb(zzpc zzpcVar) {
        this.zzp = zzpcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zzc(zzdc zzdcVar) {
        this.zzj.zzi(zzdcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final boolean zzd(zzv zzvVar) {
        return zze(zzvVar) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final int zze(zzv zzvVar) {
        zzaa();
        if (!MimeTypes.AUDIO_RAW.equals(zzvVar.zzo)) {
            return this.zzv.zzd(zzvVar, this.zzy) != null ? 2 : 0;
        }
        int i10 = zzvVar.zzI;
        if (zzep.zzA(i10)) {
            return i10 != 2 ? 1 : 2;
        }
        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.s(new StringBuilder(String.valueOf(i10).length() + 22), "Invalid PCM encoding: ", i10, "DefaultAudioSink");
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final zzpl zzf(zzv zzvVar) {
        return this.zzY ? zzpl.zza : this.zzaj.zza(zzvVar, this.zzy);
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final long zzg(boolean z10) {
        ArrayDeque arrayDeque;
        long j10;
        if (!zzX() || this.zzJ) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.zzj.zzb(), zzep.zzr(zzG(), this.zzs.zze));
        while (true) {
            arrayDeque = this.zzk;
            if (arrayDeque.isEmpty() || jMin < ((zzqx) arrayDeque.getFirst()).zzc) {
                break;
            }
            this.zzA = (zzqx) arrayDeque.remove();
        }
        zzqx zzqxVar = this.zzA;
        long j11 = jMin - zzqxVar.zzc;
        long jZzv = zzep.zzv(j11, zzqxVar.zza.zzb);
        if (arrayDeque.isEmpty()) {
            long jZzd = this.zzai.zzd(j11);
            zzqx zzqxVar2 = this.zzA;
            j10 = zzqxVar2.zzb + jZzd;
            zzqxVar2.zzd = jZzd - jZzv;
        } else {
            zzqx zzqxVar3 = this.zzA;
            j10 = zzqxVar3.zzb + jZzv + zzqxVar3.zzd;
        }
        long jZze = this.zzai.zze();
        long jZzr = zzep.zzr(jZze, this.zzs.zze) + j10;
        long j12 = this.zzab;
        if (jZze > j12) {
            long jZzr2 = zzep.zzr(jZze - j12, this.zzs.zze);
            this.zzab = jZze;
            this.zzac += jZzr2;
            if (this.zzad == null) {
                this.zzad = new Handler(Looper.myLooper());
            }
            this.zzad.removeCallbacksAndMessages(null);
            this.zzad.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzD();
                }
            }, 100L);
        }
        return jZzr;
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zzh(zzv zzvVar, int i10, int[] iArr) throws zzqc {
        zzcc zzccVar;
        int i11;
        int i12;
        int iZzE;
        int iIntValue;
        int i13;
        int i14;
        zzaa();
        if (MimeTypes.AUDIO_RAW.equals(zzvVar.zzo)) {
            int i15 = zzvVar.zzI;
            zzgmd.zza(zzep.zzA(i15));
            int i16 = zzvVar.zzG;
            iZzE = zzep.zzE(i15) * i16;
            zzgpb zzgpbVar = new zzgpb();
            zzgpbVar.zzh(this.zzi);
            zzgpbVar.zzf(this.zzg);
            zzgpbVar.zzg(this.zzai.zza());
            zzccVar = new zzcc(zzgpbVar.zzi());
            if (zzccVar.equals(this.zzt)) {
                zzccVar = this.zzt;
            }
            this.zzf.zzq(zzvVar.zzJ, zzvVar.zzK);
            this.zze.zzq(iArr);
            try {
                zzcd zzcdVarZza = zzccVar.zza(new zzcd(zzvVar.zzH, i16, i15));
                int i17 = zzcdVarZza.zzd;
                i11 = zzcdVarZza.zzb;
                int i18 = zzcdVarZza.zzc;
                int iZzB = zzep.zzB(i18);
                int iZzE2 = zzep.zzE(i17) * i18;
                i12 = 0;
                iIntValue = iZzB;
                i13 = i17;
                i14 = iZzE2;
            } catch (zzcf e10) {
                throw new zzqc(e10, zzvVar);
            }
        } else {
            zzccVar = new zzcc(zzgpe.zzi());
            i11 = zzvVar.zzH;
            zzpl zzplVar = zzpl.zza;
            Pair pairZzd = this.zzv.zzd(zzvVar, this.zzy);
            if (pairZzd == null) {
                throw new zzqc("Unable to configure passthrough for: ".concat(String.valueOf(zzvVar)), zzvVar);
            }
            int iIntValue2 = ((Integer) pairZzd.first).intValue();
            i12 = 2;
            iZzE = -1;
            iIntValue = ((Integer) pairZzd.second).intValue();
            i13 = iIntValue2;
            i14 = -1;
        }
        int i19 = i11;
        if (i13 == 0) {
            String strValueOf = String.valueOf(zzvVar);
            StringBuilder sb2 = new StringBuilder(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.a(i12, 37) + strValueOf.length());
            sb2.append("Invalid output encoding (mode=");
            sb2.append(i12);
            sb2.append(") for: ");
            sb2.append(strValueOf);
            throw new zzqc(sb2.toString(), zzvVar);
        }
        if (iIntValue == 0) {
            String strValueOf2 = String.valueOf(zzvVar);
            StringBuilder sb3 = new StringBuilder(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.a(i12, 43) + strValueOf2.length());
            sb3.append("Invalid output channel config (mode=");
            sb3.append(i12);
            sb3.append(") for: ");
            sb3.append(strValueOf2);
            throw new zzqc(sb3.toString(), zzvVar);
        }
        int i20 = zzvVar.zzj;
        if (MimeTypes.AUDIO_DTS_EXPRESS.equals(zzvVar.zzo) && i20 == -1) {
            i20 = 768000;
        }
        int i21 = i20;
        int minBufferSize = AudioTrack.getMinBufferSize(i19, iIntValue, i13);
        zzgmd.zzh(minBufferSize != -2);
        int i22 = i14 != -1 ? i14 : 1;
        int i23 = i13;
        int iZzb = zzrj.zzb(minBufferSize, i23, i12, i22, i19, i21);
        int i24 = i22;
        this.zzY = false;
        zzqq zzqqVar = new zzqq(zzvVar, iZzE, i12, i14, i19, iIntValue, i23, (((Math.max(minBufferSize, iZzb) + i24) - 1) / i24) * i24, zzccVar, false, false, false);
        if (zzX()) {
            this.zzr = zzqqVar;
        } else {
            this.zzs = zzqqVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zzi() throws IllegalStateException {
        this.zzS = true;
        if (zzX()) {
            this.zzj.zzc();
            if (!this.zzQ || zzab(this.zzu)) {
                this.zzu.play();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zzj() {
        this.zzI = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:121:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02d6  */
    @Override // com.google.android.gms.internal.ads.zzqh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzk(java.nio.ByteBuffer r29, long r30, int r32) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1132
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrh.zzk(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zzl() throws IllegalStateException, zzqg {
        if (!this.zzP && zzX() && zzP()) {
            zzac();
            this.zzP = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final boolean zzm() {
        if (zzX()) {
            return this.zzP && !zzn();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final boolean zzn() {
        if (zzX()) {
            return !(Build.VERSION.SDK_INT >= 29 && this.zzu.isOffloadedPlayback() && this.zzR) && zzad(zzG());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zzo(zzav zzavVar) {
        float f10 = zzavVar.zzb;
        String str = zzep.zza;
        this.zzB = new zzav(Math.max(0.1f, Math.min(f10, 8.0f)), Math.max(0.1f, Math.min(zzavVar.zzc, 8.0f)));
        zzU(zzavVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final zzav zzp() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zzq(boolean z10) {
        this.zzC = z10;
        zzU(this.zzB);
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zzr(zzd zzdVar) throws IllegalStateException {
        if (this.zzy.equals(zzdVar)) {
            return;
        }
        this.zzy = zzdVar;
        zzpj zzpjVar = this.zzw;
        if (zzpjVar != null) {
            zzpjVar.zzb(zzdVar);
        }
        zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zzs(int i10) throws IllegalStateException {
        if (this.zzU) {
            if (this.zzT != i10) {
                return;
            } else {
                this.zzU = false;
            }
        }
        if (this.zzT != i10) {
            this.zzT = i10;
            zzz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zzt(zze zzeVar) {
        if (this.zzV.equals(zzeVar)) {
            return;
        }
        if (this.zzu != null) {
            int i10 = this.zzV.zza;
        }
        this.zzV = zzeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zzu(AudioDeviceInfo audioDeviceInfo) {
        this.zzW = audioDeviceInfo;
        zzpj zzpjVar = this.zzw;
        if (zzpjVar != null) {
            zzpjVar.zzc(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.zzu;
        if (audioTrack != null) {
            audioTrack.setPreferredDevice(this.zzW);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final long zzv() {
        if (!zzX()) {
            return C.TIME_UNSET;
        }
        zzqq zzqqVar = this.zzs;
        if (zzqqVar.zzc == 0) {
            return zzep.zzr(this.zzu.getBufferSizeInFrames(), zzqqVar.zze);
        }
        long bufferSizeInFrames = this.zzu.getBufferSizeInFrames();
        int iZzf = zzade.zzf(this.zzs.zzg);
        zzgmd.zzh(iZzf != -2147483647);
        return zzep.zzt(bufferSizeInFrames, 1000000L, iZzf, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zzw(int i10, int i11) {
        AudioTrack audioTrack = this.zzu;
        if (audioTrack != null) {
            zzab(audioTrack);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zzx(float f10) {
        if (this.zzL != f10) {
            this.zzL = f10;
            zzT();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zzy() throws IllegalStateException {
        this.zzS = false;
        if (zzX()) {
            this.zzj.zzg();
            if (!this.zzQ || zzab(this.zzu)) {
                this.zzu.pause();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqh
    public final void zzz() throws IllegalStateException {
        if (zzX()) {
            this.zzD = 0L;
            this.zzE = 0L;
            this.zzF = 0L;
            this.zzG = 0L;
            this.zzZ = false;
            this.zzH = 0;
            this.zzA = new zzqx(this.zzB, 0L, 0L, null);
            this.zzK = 0L;
            this.zzz = null;
            this.zzk.clear();
            this.zzM = null;
            this.zzN = 0;
            this.zzO = null;
            this.zzQ = false;
            this.zzP = false;
            this.zzR = false;
            this.zzf.zzr();
            zzM();
            zzql zzqlVar = this.zzj;
            if (zzqlVar.zzd()) {
                this.zzu.pause();
            }
            if (zzab(this.zzu)) {
                zzrg zzrgVar = this.zzl;
                zzrgVar.getClass();
                zzrgVar.zzb(this.zzu);
            }
            final zzqb zzqbVarZza = this.zzs.zza();
            zzqq zzqqVar = this.zzr;
            if (zzqqVar != null) {
                this.zzs = zzqqVar;
                this.zzr = null;
            }
            zzqlVar.zzh();
            zzrb zzrbVar = this.zzx;
            if (zzrbVar != null) {
                zzrbVar.zza();
                this.zzx = null;
            }
            final AudioTrack audioTrack = this.zzu;
            final zzqe zzqeVar = this.zzq;
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (zza) {
                try {
                    if (zzb == null) {
                        zzb = zzep.zzg("ExoPlayer:AudioTrackReleaseThread");
                    }
                    zzc++;
                    zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqt
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzrh.zzE(audioTrack, zzqeVar, handler, zzqbVarZza);
                        }
                    }, 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.zzu = null;
        }
        this.zzn.zzc();
        this.zzm.zzc();
        this.zzab = 0L;
        this.zzac = 0L;
        Handler handler2 = this.zzad;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }
}
