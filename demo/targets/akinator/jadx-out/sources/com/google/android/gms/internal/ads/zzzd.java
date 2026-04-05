package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzzd implements zzza, zzgz {
    public static final zzgpe zza = zzgpe.zzm(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final zzgpe zzb = zzgpe.zzm(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final zzgpe zzc = zzgpe.zzm(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final zzgpe zzd = zzgpe.zzm(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final zzgpe zze = zzgpe.zzm(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final zzgpe zzf = zzgpe.zzm(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    private static zzzd zzg;
    private final Context zzh;
    private final zzgph zzi;
    private final zzyy zzj;
    private final zzzr zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private int zzs;
    private String zzt;

    public /* synthetic */ zzzd(Context context, Map map, int i10, zzdc zzdcVar, boolean z10, byte[] bArr) {
        this.zzh = context == null ? null : context.getApplicationContext();
        this.zzi = zzgph.zzc(map);
        this.zzj = new zzyy();
        this.zzk = new zzzr(2000);
        if (context == null) {
            this.zzs = 0;
            this.zzq = 1000000L;
            return;
        }
        zzee zzeeVarZza = zzee.zza(context);
        int iZzc = zzeeVarZza.zzc();
        this.zzs = iZzc;
        this.zzq = zzl(iZzc);
        zzeeVarZza.zzb(new zzdy() { // from class: com.google.android.gms.internal.ads.zzzc
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(int i11) throws Throwable {
                this.zza.zzi(i11);
            }
        }, zzcw.zza());
    }

    public static synchronized zzzd zzh(Context context) {
        try {
            if (zzg == null) {
                Context applicationContext = context == null ? null : context.getApplicationContext();
                zzdc zzdcVar = zzdc.zza;
                HashMap map = new HashMap(8);
                map.put(0, 1000000L);
                Long lValueOf = Long.valueOf(C.TIME_UNSET);
                map.put(2, lValueOf);
                map.put(3, lValueOf);
                map.put(4, lValueOf);
                map.put(5, lValueOf);
                map.put(10, lValueOf);
                map.put(9, lValueOf);
                map.put(7, lValueOf);
                zzg = new zzzd(applicationContext, map, 2000, zzdcVar, true, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zzg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0012 A[Catch: all -> 0x0083, TRY_ENTER, TryCatch #1 {all -> 0x0083, blocks: (B:3:0x0001, B:11:0x0012, B:17:0x001e, B:28:0x0050, B:34:0x0067), top: B:47:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042 A[Catch: all -> 0x000d, TryCatch #2 {all -> 0x000d, blocks: (B:5:0x0005, B:19:0x0022, B:21:0x0028, B:23:0x0033, B:25:0x003d, B:27:0x004e, B:26:0x0042, B:30:0x005e), top: B:49:0x0005 }] */
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzi(int r9) throws java.lang.Throwable {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.zzs     // Catch: java.lang.Throwable -> L83
            if (r0 != r9) goto L12
            java.lang.String r0 = r8.zzt     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto La
            goto L12
        La:
            r2 = r8
            goto L86
        Ld:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L88
        L12:
            r8.zzs = r9     // Catch: java.lang.Throwable -> L83
            r0 = 1
            if (r9 == r0) goto La
            if (r9 == 0) goto La
            r0 = 8
            if (r9 != r0) goto L1e
            goto La
        L1e:
            java.lang.String r0 = r8.zzt     // Catch: java.lang.Throwable -> L83
            if (r0 != 0) goto L50
            android.content.Context r0 = r8.zzh     // Catch: java.lang.Throwable -> Ld
            java.lang.String r1 = com.google.android.gms.internal.ads.zzep.zza     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto L42
            r1 = 0
            java.lang.String r1 = bp.oM.DwaEpyvxz.bQZVTMMNhZbNF     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> Ld
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto L42
            java.lang.String r0 = r0.getNetworkCountryIso()     // Catch: java.lang.Throwable -> Ld
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Ld
            if (r1 != 0) goto L42
            java.lang.String r0 = com.google.android.gms.internal.ads.zzglm.zzb(r0)     // Catch: java.lang.Throwable -> Ld
            goto L4e
        L42:
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = r0.getCountry()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = com.google.android.gms.internal.ads.zzglm.zzb(r0)     // Catch: java.lang.Throwable -> Ld
        L4e:
            r8.zzt = r0     // Catch: java.lang.Throwable -> Ld
        L50:
            long r0 = r8.zzl(r9)     // Catch: java.lang.Throwable -> L83
            r8.zzq = r0     // Catch: java.lang.Throwable -> L83
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L83
            int r9 = r8.zzl     // Catch: java.lang.Throwable -> L83
            if (r9 <= 0) goto L65
            long r2 = r8.zzm     // Catch: java.lang.Throwable -> Ld
            long r2 = r0 - r2
            int r9 = (int) r2
        L63:
            r3 = r9
            goto L67
        L65:
            r9 = 0
            goto L63
        L67:
            long r4 = r8.zzn     // Catch: java.lang.Throwable -> L83
            long r6 = r8.zzq     // Catch: java.lang.Throwable -> L83
            r2 = r8
            r2.zzk(r3, r4, r6)     // Catch: java.lang.Throwable -> L80
            r2.zzm = r0     // Catch: java.lang.Throwable -> L80
            r0 = 0
            r2.zzn = r0     // Catch: java.lang.Throwable -> L80
            r2.zzp = r0     // Catch: java.lang.Throwable -> L80
            r2.zzo = r0     // Catch: java.lang.Throwable -> L80
            com.google.android.gms.internal.ads.zzzr r9 = r2.zzk     // Catch: java.lang.Throwable -> L80
            r9.zza()     // Catch: java.lang.Throwable -> L80
            monitor-exit(r8)
            return
        L80:
            r0 = move-exception
        L81:
            r9 = r0
            goto L88
        L83:
            r0 = move-exception
            r2 = r8
            goto L81
        L86:
            monitor-exit(r8)
            return
        L88:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L80
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzd.zzi(int):void");
    }

    private final void zzk(int i10, long j10, long j11) {
        int i11;
        long j12;
        if (i10 == 0) {
            if (j10 != 0) {
                j12 = j10;
            } else if (j11 == this.zzr) {
                return;
            } else {
                j12 = 0;
            }
            i11 = 0;
        } else {
            i11 = i10;
            j12 = j10;
        }
        this.zzr = j11;
        this.zzj.zzc(i11, j12, j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long zzl(int r10) {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.zzgph r0 = r9.zzi
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            java.lang.Object r1 = r0.get(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            r2 = 1000000(0xf4240, double:4.940656E-318)
            r4 = 0
            if (r1 != 0) goto L1f
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            java.lang.Object r10 = r0.get(r10)
            r1 = r10
            java.lang.Long r1 = (java.lang.Long) r1
            goto Lad
        L1f:
            long r5 = r1.longValue()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto Lad
            java.lang.String r0 = r9.zzt
            java.lang.String r0 = com.google.android.gms.internal.ads.zzgmu.zza(r0)
            int[] r0 = zzn(r0)
            r1 = 2
            if (r10 == r1) goto L9b
            r5 = 3
            if (r10 == r5) goto L8b
            r6 = 4
            if (r10 == r6) goto L7c
            r1 = 5
            if (r10 == r1) goto L6d
            r5 = 7
            if (r10 == r5) goto L9b
            r4 = 9
            if (r10 == r4) goto L5e
            r1 = 10
            if (r10 == r1) goto L4f
            r0 = r2
            goto La9
        L4f:
            com.google.android.gms.internal.ads.zzgpe r10 = com.google.android.gms.internal.ads.zzzd.zze
            r0 = r0[r6]
            java.lang.Object r10 = r10.get(r0)
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
            goto La9
        L5e:
            com.google.android.gms.internal.ads.zzgpe r10 = com.google.android.gms.internal.ads.zzzd.zzf
            r0 = r0[r1]
            java.lang.Object r10 = r10.get(r0)
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
            goto La9
        L6d:
            com.google.android.gms.internal.ads.zzgpe r10 = com.google.android.gms.internal.ads.zzzd.zzd
            r0 = r0[r5]
            java.lang.Object r10 = r10.get(r0)
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
            goto La9
        L7c:
            com.google.android.gms.internal.ads.zzgpe r10 = com.google.android.gms.internal.ads.zzzd.zzc
            r0 = r0[r1]
            java.lang.Object r10 = r10.get(r0)
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
            goto La9
        L8b:
            com.google.android.gms.internal.ads.zzgpe r10 = com.google.android.gms.internal.ads.zzzd.zzb
            r1 = 1
            r0 = r0[r1]
            java.lang.Object r10 = r10.get(r0)
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
            goto La9
        L9b:
            com.google.android.gms.internal.ads.zzgpe r10 = com.google.android.gms.internal.ads.zzzd.zza
            r0 = r0[r4]
            java.lang.Object r10 = r10.get(r0)
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
        La9:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        Lad:
            if (r1 != 0) goto Lb3
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
        Lb3:
            long r0 = r1.longValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzd.zzl(int):long");
    }

    private static boolean zzm(zzgf zzgfVar, boolean z10) {
        return z10 && !zzgfVar.zza(8);
    }

    @Override // com.google.android.gms.internal.ads.zzgz
    public final void zza(zzgb zzgbVar, zzgf zzgfVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzgz
    public final synchronized void zzb(zzgb zzgbVar, zzgf zzgfVar, boolean z10) {
        try {
            if (zzm(zzgfVar, z10)) {
                if (this.zzl == 0) {
                    this.zzm = SystemClock.elapsedRealtime();
                }
                this.zzl++;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgz
    public final synchronized void zzc(zzgb zzgbVar, zzgf zzgfVar, boolean z10, int i10) {
        if (zzm(zzgfVar, z10)) {
            this.zzn += i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    @Override // com.google.android.gms.internal.ads.zzgz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzd(com.google.android.gms.internal.ads.zzgb r11, com.google.android.gms.internal.ads.zzgf r12, boolean r13) throws java.lang.Throwable {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r11 = zzm(r12, r13)     // Catch: java.lang.Throwable -> L6d
            if (r11 != 0) goto L9
            monitor-exit(r10)
            return
        L9:
            int r11 = r10.zzl     // Catch: java.lang.Throwable -> L6d
            if (r11 <= 0) goto Lf
            r11 = 1
            goto L10
        Lf:
            r11 = 0
        L10:
            com.google.android.gms.internal.ads.zzgmd.zzh(r11)     // Catch: java.lang.Throwable -> L6d
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L6d
            long r0 = r10.zzm     // Catch: java.lang.Throwable -> L6d
            long r0 = r11 - r0
            long r2 = r10.zzo     // Catch: java.lang.Throwable -> L6d
            int r5 = (int) r0     // Catch: java.lang.Throwable -> L6d
            long r0 = (long) r5     // Catch: java.lang.Throwable -> L6d
            long r2 = r2 + r0
            r10.zzo = r2     // Catch: java.lang.Throwable -> L6d
            long r0 = r10.zzp     // Catch: java.lang.Throwable -> L6d
            long r2 = r10.zzn     // Catch: java.lang.Throwable -> L6d
            long r0 = r0 + r2
            r10.zzp = r0     // Catch: java.lang.Throwable -> L6d
            if (r5 <= 0) goto L70
            float r13 = (float) r2     // Catch: java.lang.Throwable -> L6d
            com.google.android.gms.internal.ads.zzzr r0 = r10.zzk     // Catch: java.lang.Throwable -> L6d
            double r1 = (double) r2     // Catch: java.lang.Throwable -> L6d
            double r1 = java.lang.Math.sqrt(r1)     // Catch: java.lang.Throwable -> L6d
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L6d
            r2 = 1174011904(0x45fa0000, float:8000.0)
            float r13 = r13 * r2
            float r2 = (float) r5     // Catch: java.lang.Throwable -> L6d
            float r13 = r13 / r2
            r0.zzb(r1, r13)     // Catch: java.lang.Throwable -> L6d
            long r1 = r10.zzo     // Catch: java.lang.Throwable -> L6d
            r3 = 2000(0x7d0, double:9.88E-321)
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L52
            long r1 = r10.zzp     // Catch: java.lang.Throwable -> L4e
            r3 = 524288(0x80000, double:2.590327E-318)
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L5b
            goto L52
        L4e:
            r0 = move-exception
            r11 = r0
            r4 = r10
            goto L79
        L52:
            r13 = 1056964608(0x3f000000, float:0.5)
            float r13 = r0.zzc(r13)     // Catch: java.lang.Throwable -> L6d
            long r0 = (long) r13     // Catch: java.lang.Throwable -> L6d
            r10.zzq = r0     // Catch: java.lang.Throwable -> L6d
        L5b:
            long r6 = r10.zzn     // Catch: java.lang.Throwable -> L6d
            long r8 = r10.zzq     // Catch: java.lang.Throwable -> L6d
            r4 = r10
            r4.zzk(r5, r6, r8)     // Catch: java.lang.Throwable -> L6a
            r4.zzm = r11     // Catch: java.lang.Throwable -> L6a
            r11 = 0
            r4.zzn = r11     // Catch: java.lang.Throwable -> L6a
            goto L71
        L6a:
            r0 = move-exception
        L6b:
            r11 = r0
            goto L79
        L6d:
            r0 = move-exception
            r4 = r10
            goto L6b
        L70:
            r4 = r10
        L71:
            int r11 = r4.zzl     // Catch: java.lang.Throwable -> L6a
            int r11 = r11 + (-1)
            r4.zzl = r11     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r10)
            return
        L79:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L6a
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzd.zzd(com.google.android.gms.internal.ads.zzgb, com.google.android.gms.internal.ads.zzgf, boolean):void");
    }

    @Override // com.google.android.gms.internal.ads.zzza
    public final zzgz zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzza
    public final void zzf(Handler handler, zzyz zzyzVar) {
        zzyzVar.getClass();
        this.zzj.zza(handler, zzyzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzza
    public final void zzg(zzyz zzyzVar) {
        this.zzj.zzb(zzyzVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0145, code lost:
    
        if (r3.equals("YE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x015d, code lost:
    
        if (r3.equals("WS") != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0167, code lost:
    
        if (r3.equals("WF") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0171, code lost:
    
        if (r3.equals("VU") != false) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01a5, code lost:
    
        if (r3.equals("VE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01af, code lost:
    
        if (r3.equals("VC") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01b9, code lost:
    
        if (r3.equals("VA") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01fc, code lost:
    
        if (r3.equals("UA") != false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0222, code lost:
    
        if (r3.equals("TV") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x023a, code lost:
    
        if (r3.equals("TR") != false) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0260, code lost:
    
        if (r3.equals("TM") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x026a, code lost:
    
        if (r3.equals("TL") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0274, code lost:
    
        if (r3.equals("TJ") != false) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x027e, code lost:
    
        if (r3.equals("TH") != false) goto L804;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0296, code lost:
    
        if (r3.equals("TD") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x02ae, code lost:
    
        if (r3.equals("SZ") != false) goto L866;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x02b8, code lost:
    
        if (r3.equals("SY") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x02c2, code lost:
    
        if (r3.equals("SX") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x02e8, code lost:
    
        if (r3.equals("SS") != false) goto L656;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x031c, code lost:
    
        if (r3.equals("SM") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0326, code lost:
    
        if (r3.equals("SL") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x033e, code lost:
    
        if (r3.equals("SJ") != false) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0348, code lost:
    
        if (r3.equals("SI") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0352, code lost:
    
        if (r3.equals("SH") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x036a, code lost:
    
        if (r3.equals("SE") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0374, code lost:
    
        if (r3.equals("SD") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x037e, code lost:
    
        if (r3.equals("SC") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r3.equals("CI") != false) goto L862;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0388, code lost:
    
        if (r3.equals("SB") != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x038f, code lost:
    
        return new int[]{4, 2, 4, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x03f8, code lost:
    
        if (r3.equals("PY") != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0410, code lost:
    
        if (r3.equals("PT") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0436, code lost:
    
        if (r3.equals("PM") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x046a, code lost:
    
        if (r3.equals(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_PG) != false) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        if (r3.equals("CG") != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0490, code lost:
    
        if (r3.equals("PA") != false) goto L901;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x04b6, code lost:
    
        if (r3.equals("NU") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x04c0, code lost:
    
        if (r3.equals("NR") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x04f4, code lost:
    
        if (r3.equals("NI") != false) goto L788;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x050c, code lost:
    
        if (r3.equals("NF") != false) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0516, code lost:
    
        if (r3.equals("NE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0520, code lost:
    
        if (r3.equals("NC") != false) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0527, code lost:
    
        return new int[]{2, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x053c, code lost:
    
        if (r3.equals("MZ") != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0543, code lost:
    
        return new int[]{3, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0590, code lost:
    
        if (r3.equals("MT") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x059a, code lost:
    
        if (r3.equals("MS") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x05a4, code lost:
    
        if (r3.equals("MR") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x05bc, code lost:
    
        if (r3.equals("MP") != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x05c3, code lost:
    
        return new int[]{1, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x05e6, code lost:
    
        if (r3.equals("MM") != false) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x05f0, code lost:
    
        if (r3.equals("ML") != false) goto L811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0608, code lost:
    
        if (r3.equals("MH") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x060f, code lost:
    
        return new int[]{4, 2, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0616, code lost:
    
        if (r3.equals("MG") != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x064a, code lost:
    
        if (r3.equals("MC") != false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0662, code lost:
    
        if (r3.equals("LY") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x066c, code lost:
    
        if (r3.equals("LV") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0692, code lost:
    
        if (r3.equals("LS") != false) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0699, code lost:
    
        return new int[]{4, 3, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x06a0, code lost:
    
        if (r3.equals("LR") != false) goto L748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x06aa, code lost:
    
        if (r3.equals("LK") != false) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x06b1, code lost:
    
        return new int[]{3, 2, 3, 3, 4, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x06b8, code lost:
    
        if (r3.equals("LI") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x06fa, code lost:
    
        if (r3.equals("KY") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0704, code lost:
    
        if (r3.equals("KW") != false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0099, code lost:
    
        if (r3.equals("BQ") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x071c, code lost:
    
        if (r3.equals("KN") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0726, code lost:
    
        if (r3.equals("KM") != false) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x072d, code lost:
    
        return new int[]{4, 3, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0734, code lost:
    
        if (r3.equals("KI") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0776, code lost:
    
        if (r3.equals("JO") != false) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x078e, code lost:
    
        if (r3.equals("JE") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x07a6, code lost:
    
        if (r3.equals(com.ironsource.mediationsdk.utils.IronSourceConstants.INTERSTITIAL_EVENT_TYPE) != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x07e8, code lost:
    
        if (r3.equals("IM") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x081c, code lost:
    
        if (r3.equals("HU") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x0826, code lost:
    
        if (r3.equals("HT") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x0830, code lost:
    
        if (r3.equals("HR") != false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x0837, code lost:
    
        return new int[]{1, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x0892, code lost:
    
        if (r3.equals("GQ") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x08b8, code lost:
    
        if (r3.equals("GM") != false) goto L656;
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x08bf, code lost:
    
        return new int[]{4, 3, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x08c6, code lost:
    
        if (r3.equals("GL") != false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x08cd, code lost:
    
        return new int[]{1, 2, 2, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x08d4, code lost:
    
        if (r3.equals("GI") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x08db, code lost:
    
        return new int[]{0, 2, 0, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00cd, code lost:
    
        if (r3.equals("BL") != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:707:0x096e, code lost:
    
        if (r3.equals("FK") != false) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:709:0x0975, code lost:
    
        return new int[]{3, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:727:0x09b4, code lost:
    
        if (r3.equals("ER") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:729:0x09bb, code lost:
    
        return new int[]{4, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:731:0x09c2, code lost:
    
        if (r3.equals("EG") != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:733:0x09c9, code lost:
    
        return new int[]{3, 4, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x09d0, code lost:
    
        if (r3.equals("EE") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x09d7, code lost:
    
        return new int[]{0, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:743:0x09ec, code lost:
    
        if (r3.equals("DZ") != false) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x09f3, code lost:
    
        return new int[]{3, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x09fa, code lost:
    
        if (r3.equals("DO") != false) goto L748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:749:0x0a01, code lost:
    
        return new int[]{3, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e5, code lost:
    
        if (r3.equals("AT") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:751:0x0a08, code lost:
    
        if (r3.equals("DM") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:758:0x0a20, code lost:
    
        if (r3.equals("DJ") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x0a54, code lost:
    
        if (r3.equals("CX") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:776:0x0a5e, code lost:
    
        if (r3.equals("CW") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x0a76, code lost:
    
        if (r3.equals("CU") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x0a7d, code lost:
    
        return new int[]{4, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:787:0x0a84, code lost:
    
        if (r3.equals("CR") != false) goto L788;
     */
    /* JADX WARN: Code restructure failed: missing block: B:789:0x0a8b, code lost:
    
        return new int[]{2, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:799:0x0aae, code lost:
    
        if (r3.equals("CM") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x0ab5, code lost:
    
        return new int[]{4, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:803:0x0abc, code lost:
    
        if (r3.equals("CL") != false) goto L804;
     */
    /* JADX WARN: Code restructure failed: missing block: B:805:0x0ac3, code lost:
    
        return new int[]{0, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:807:0x0aca, code lost:
    
        if (r3.equals("CK") != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:810:0x0ad4, code lost:
    
        if (r3.equals("CD") != false) goto L811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:812:0x0adb, code lost:
    
        return new int[]{3, 3, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:814:0x0ae2, code lost:
    
        if (r3.equals("CA") != false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:816:0x0ae9, code lost:
    
        return new int[]{0, 2, 1, 2, 3, 3};
     */
    /* JADX WARN: Code restructure failed: missing block: B:826:0x0b0c, code lost:
    
        if (r3.equals("BI") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:828:0x0b13, code lost:
    
        return new int[]{4, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:834:0x0b29, code lost:
    
        if (r3.equals(ao.kwoC.zAQQWzBxnS.OzRUxu) != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:836:0x0b30, code lost:
    
        return new int[]{0, 0, 0, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:838:0x0b37, code lost:
    
        if (r3.equals("BF") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:840:0x0b3e, code lost:
    
        return new int[]{4, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:850:0x0b61, code lost:
    
        if (r3.equals("AZ") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:852:0x0b68, code lost:
    
        return new int[]{4, 2, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:858:0x0b7d, code lost:
    
        if (r3.equals("AI") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x010b, code lost:
    
        if (r3.equals("AQ") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:861:0x0b86, code lost:
    
        if (r3.equals("AG") != false) goto L862;
     */
    /* JADX WARN: Code restructure failed: missing block: B:863:0x0b8d, code lost:
    
        return new int[]{2, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:865:0x0b94, code lost:
    
        if (r3.equals("AF") != false) goto L866;
     */
    /* JADX WARN: Code restructure failed: missing block: B:867:0x0b9b, code lost:
    
        return new int[]{4, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:873:0x0bb0, code lost:
    
        if (r3.equals("AD") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:876:0x0bb9, code lost:
    
        if (r3.equals("BZ") != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:878:0x0bc0, code lost:
    
        return new int[]{2, 2, 2, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:884:0x0bd5, code lost:
    
        if (r3.equals("BB") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:886:0x0bdc, code lost:
    
        return new int[]{1, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:888:0x0be3, code lost:
    
        if (r3.equals("BA") != false) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0115, code lost:
    
        if (r3.equals("ZW") != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:890:0x0bea, code lost:
    
        return new int[]{1, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:892:0x0bf1, code lost:
    
        if (r3.equals("AX") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:894:0x0bf8, code lost:
    
        return new int[]{0, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:900:0x0c0d, code lost:
    
        if (r3.equals("AM") != false) goto L901;
     */
    /* JADX WARN: Code restructure failed: missing block: B:902:0x0c14, code lost:
    
        return new int[]{2, 3, 2, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x013b, code lost:
    
        if (r3.equals("YT") != false) goto L390;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int[] zzn(java.lang.String r3) {
        /*
            Method dump skipped, instructions count: 6674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzd.zzn(java.lang.String):int[]");
    }
}
