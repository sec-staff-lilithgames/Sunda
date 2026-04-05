package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzkm {
    public static final /* synthetic */ int zzc = 0;
    private static final Object zzd = new Object();
    private static volatile zzkh zze = null;
    private static volatile boolean zzf = false;
    private static final AtomicInteger zzh;
    final zzkg zza;
    final String zzb;
    private Object zzg;
    private volatile int zzi = -1;
    private volatile Object zzj;
    private volatile boolean zzk;

    static {
        new AtomicReference();
        p1.checkNotNull(zzkk.zza, "BuildInfo must be non-null");
        zzh = new AtomicInteger();
    }

    public /* synthetic */ zzkm(zzkg zzkgVar, String str, Object obj, boolean z10, byte[] bArr) {
        if (zzkgVar.zza == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zza = zzkgVar;
        this.zzb = str;
        this.zzg = obj;
        this.zzk = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void zzb(final android.content.Context r3) {
        /*
            com.google.android.gms.internal.measurement.zzkh r0 = com.google.android.gms.internal.measurement.zzkm.zze
            if (r0 != 0) goto L4d
            if (r3 != 0) goto L7
            goto L4d
        L7:
            java.lang.Object r0 = com.google.android.gms.internal.measurement.zzkm.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkm.zze     // Catch: java.lang.Throwable -> L47
            if (r1 != 0) goto L49
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkm.zze     // Catch: java.lang.Throwable -> L21
            android.content.Context r2 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L18
            r3 = r2
        L18:
            if (r1 == 0) goto L23
            android.content.Context r2 = r1.zza()     // Catch: java.lang.Throwable -> L21
            if (r2 == r3) goto L43
            goto L23
        L21:
            r3 = move-exception
            goto L45
        L23:
            if (r1 == 0) goto L2e
            com.google.android.gms.internal.measurement.zzjr.zzd()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.zzko.zzb()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.zzjy.zzc()     // Catch: java.lang.Throwable -> L21
        L2e:
            com.google.android.gms.internal.measurement.zzkl r1 = new com.google.android.gms.internal.measurement.zzkl     // Catch: java.lang.Throwable -> L21
            r1.<init>()     // Catch: java.lang.Throwable -> L21
            mh.v2 r1 = mh.e3.memoize(r1)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.zzjn r2 = new com.google.android.gms.internal.measurement.zzjn     // Catch: java.lang.Throwable -> L21
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.zzkm.zze = r2     // Catch: java.lang.Throwable -> L21
            java.util.concurrent.atomic.AtomicInteger r3 = com.google.android.gms.internal.measurement.zzkm.zzh     // Catch: java.lang.Throwable -> L21
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L21
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            goto L49
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r3     // Catch: java.lang.Throwable -> L47
        L47:
            r3 = move-exception
            goto L4b
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            return
        L4b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            throw r3
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkm.zzb(android.content.Context):void");
    }

    public static void zzc() {
        zzh.incrementAndGet();
    }

    public abstract Object zza(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a A[PHI: r2
      0x004a: PHI (r2v1 mh.k1) = (r2v0 mh.k1), (r2v0 mh.k1), (r2v7 mh.k1) binds: [B:8:0x0016, B:10:0x001c, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:20:0x0050, B:22:0x005b, B:24:0x0065, B:28:0x0088, B:30:0x0090, B:42:0x00b7, B:45:0x00bf, B:46:0x00c2, B:47:0x00c6, B:34:0x0099, B:36:0x009d, B:38:0x00ad, B:40:0x00b3, B:26:0x0076, B:48:0x00ca), top: B:54:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:20:0x0050, B:22:0x005b, B:24:0x0065, B:28:0x0088, B:30:0x0090, B:42:0x00b7, B:45:0x00bf, B:46:0x00c2, B:47:0x00c6, B:34:0x0099, B:36:0x009d, B:38:0x00ad, B:40:0x00b3, B:26:0x0076, B:48:0x00ca), top: B:54:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:20:0x0050, B:22:0x005b, B:24:0x0065, B:28:0x0088, B:30:0x0090, B:42:0x00b7, B:45:0x00bf, B:46:0x00c2, B:47:0x00c6, B:34:0x0099, B:36:0x009d, B:38:0x00ad, B:40:0x00b3, B:26:0x0076, B:48:0x00ca), top: B:54:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzd() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.measurement.zzkm.zzh
            int r0 = r0.get()
            int r1 = r9.zzi
            if (r1 >= r0) goto Lce
            monitor-enter(r9)
            int r1 = r9.zzi     // Catch: java.lang.Throwable -> L47
            if (r1 >= r0) goto Lca
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkm.zze     // Catch: java.lang.Throwable -> L47
            mh.k1 r2 = mh.k1.absent()     // Catch: java.lang.Throwable -> L47
            r3 = 0
            if (r1 == 0) goto L4a
            mh.v2 r4 = r1.zzb()     // Catch: java.lang.Throwable -> L47
            if (r4 == 0) goto L4a
            mh.v2 r2 = r1.zzb()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r2 = mh.p1.checkNotNull(r2)     // Catch: java.lang.Throwable -> L47
            mh.v2 r2 = (mh.v2) r2     // Catch: java.lang.Throwable -> L47
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L47
            mh.k1 r2 = (mh.k1) r2     // Catch: java.lang.Throwable -> L47
            boolean r4 = r2.isPresent()     // Catch: java.lang.Throwable -> L47
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r2.get()     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.zzjt r4 = (com.google.android.gms.internal.measurement.zzjt) r4     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.zzkg r5 = r9.zza     // Catch: java.lang.Throwable -> L47
            android.net.Uri r6 = r5.zza     // Catch: java.lang.Throwable -> L47
            java.lang.String r5 = r5.zzc     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = r9.zzb     // Catch: java.lang.Throwable -> L47
            java.lang.String r4 = r4.zza(r6, r3, r5, r7)     // Catch: java.lang.Throwable -> L47
            goto L4b
        L47:
            r0 = move-exception
            goto Lcc
        L4a:
            r4 = r3
        L4b:
            if (r1 == 0) goto L4f
            r5 = 1
            goto L50
        L4f:
            r5 = 0
        L50:
            java.lang.String r6 = "Must call PhenotypeFlagInitializer.maybeInit() first"
            mh.p1.checkState(r5, r6)     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.zzkg r5 = r9.zza     // Catch: java.lang.Throwable -> L47
            android.net.Uri r6 = r5.zza     // Catch: java.lang.Throwable -> L47
            if (r6 == 0) goto L76
            android.content.Context r7 = r1.zza()     // Catch: java.lang.Throwable -> L47
            boolean r7 = com.google.android.gms.internal.measurement.zzka.zza(r7, r6)     // Catch: java.lang.Throwable -> L47
            if (r7 == 0) goto L74
            android.content.Context r7 = r1.zza()     // Catch: java.lang.Throwable -> L47
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.zzkj r8 = com.google.android.gms.internal.measurement.zzkj.zza     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.zzjr r6 = com.google.android.gms.internal.measurement.zzjr.zza(r7, r6, r8)     // Catch: java.lang.Throwable -> L47
            goto L86
        L74:
            r6 = r3
            goto L86
        L76:
            android.content.Context r6 = r1.zza()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r7 = mh.p1.checkNotNull(r3)     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.zzki r8 = com.google.android.gms.internal.measurement.zzki.zza     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.zzko r6 = com.google.android.gms.internal.measurement.zzko.zza(r6, r7, r8)     // Catch: java.lang.Throwable -> L47
        L86:
            if (r6 == 0) goto L95
            java.lang.String r7 = r9.zzb     // Catch: java.lang.Throwable -> L47
            java.lang.Object r6 = r6.zze(r7)     // Catch: java.lang.Throwable -> L47
            if (r6 == 0) goto L95
            java.lang.Object r6 = r9.zza(r6)     // Catch: java.lang.Throwable -> L47
            goto L96
        L95:
            r6 = r3
        L96:
            if (r6 == 0) goto L99
            goto Lb7
        L99:
            boolean r5 = r5.zzd     // Catch: java.lang.Throwable -> L47
            if (r5 != 0) goto Lb1
            android.content.Context r1 = r1.zza()     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.zzjy r1 = com.google.android.gms.internal.measurement.zzjy.zza(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.String r5 = r9.zzb     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = r1.zze(r5)     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto Lb1
            java.lang.Object r3 = r9.zza(r1)     // Catch: java.lang.Throwable -> L47
        Lb1:
            if (r3 != 0) goto Lb6
            java.lang.Object r6 = r9.zzg     // Catch: java.lang.Throwable -> L47
            goto Lb7
        Lb6:
            r6 = r3
        Lb7:
            boolean r1 = r2.isPresent()     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto Lc6
            if (r4 != 0) goto Lc2
            java.lang.Object r6 = r9.zzg     // Catch: java.lang.Throwable -> L47
            goto Lc6
        Lc2:
            java.lang.Object r6 = r9.zza(r4)     // Catch: java.lang.Throwable -> L47
        Lc6:
            r9.zzj = r6     // Catch: java.lang.Throwable -> L47
            r9.zzi = r0     // Catch: java.lang.Throwable -> L47
        Lca:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L47
            goto Lce
        Lcc:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L47
            throw r0
        Lce:
            java.lang.Object r0 = r9.zzj
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkm.zzd():java.lang.Object");
    }
}
