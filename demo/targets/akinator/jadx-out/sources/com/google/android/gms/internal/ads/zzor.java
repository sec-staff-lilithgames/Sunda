package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzor implements zzpa {
    public static final zzgmv zza = zzop.zza;
    private static final Random zzb = new Random();
    private final zzbe zzc;
    private final zzbd zzd;
    private final HashMap zze;
    private zzoz zzf;
    private zzbf zzg;
    private String zzh;
    private long zzi;

    public zzor() {
        throw null;
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private final void zzl(zzmj zzmjVar) {
        if (zzmjVar.zzb.zzg()) {
            String str = this.zzh;
            if (str != null) {
                zzoq zzoqVar = (zzoq) this.zze.get(str);
                zzoqVar.getClass();
                zzm(zzoqVar);
                return;
            }
            return;
        }
        zzoq zzoqVar2 = (zzoq) this.zze.get(this.zzh);
        int i10 = zzmjVar.zzc;
        zzuu zzuuVar = zzmjVar.zzd;
        this.zzh = zzo(i10, zzuuVar).zze();
        zzc(zzmjVar);
        if (zzuuVar == null || !zzuuVar.zzb()) {
            return;
        }
        if (zzoqVar2 != null) {
            if (zzoqVar2.zzg() == zzuuVar.zzd && zzoqVar2.zzh() != null) {
                zzuu zzuuVarZzh = zzoqVar2.zzh();
                if (zzuuVarZzh.zzb == zzuuVar.zzb) {
                    zzuu zzuuVarZzh2 = zzoqVar2.zzh();
                    if (zzuuVarZzh2.zzc == zzuuVar.zzc) {
                        return;
                    }
                }
            }
        }
        zzo(i10, new zzuu(zzuuVar.zza, zzuuVar.zzd));
    }

    private final void zzm(zzoq zzoqVar) {
        if (zzoqVar.zzg() != -1) {
            this.zzi = zzoqVar.zzg();
        }
        this.zzh = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final long zzi() {
        zzoq zzoqVar = (zzoq) this.zze.get(this.zzh);
        return (zzoqVar == null || zzoqVar.zzg() == -1) ? this.zzi + 1 : zzoqVar.zzg();
    }

    private final zzoq zzo(int i10, zzuu zzuuVar) {
        HashMap map = this.zze;
        long j10 = Long.MAX_VALUE;
        zzoq zzoqVar = null;
        for (zzoq zzoqVar2 : map.values()) {
            zzoqVar2.zzc(i10, zzuuVar);
            if (zzoqVar2.zzb(i10, zzuuVar)) {
                long jZzg = zzoqVar2.zzg();
                if (jZzg == -1 || jZzg < j10) {
                    zzoqVar = zzoqVar2;
                    j10 = jZzg;
                } else if (jZzg == j10) {
                    String str = zzep.zza;
                    if (zzoqVar.zzh() != null && zzoqVar2.zzh() != null) {
                        zzoqVar = zzoqVar2;
                    }
                }
            }
        }
        if (zzoqVar != null) {
            return zzoqVar;
        }
        String strZzp = zzp();
        zzoq zzoqVar3 = new zzoq(this, strZzp, i10, zzuuVar);
        map.put(strZzp, zzoqVar3);
        return zzoqVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzp() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzpa
    public final void zza(zzoz zzozVar) {
        this.zzf = zzozVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpa
    public final synchronized String zzb(zzbf zzbfVar, zzuu zzuuVar) {
        return zzo(zzbfVar.zzo(zzuuVar.zza, this.zzd).zzc, zzuuVar).zze();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003e A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003e, B:23:0x0048, B:26:0x0051, B:28:0x0057, B:30:0x006c, B:31:0x0085, B:33:0x008b, B:34:0x008e, B:36:0x009a, B:38:0x00a0, B:44:0x00b1), top: B:47:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzpa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzc(com.google.android.gms.internal.ads.zzmj r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzoz r0 = r9.zzf     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto Lb0
            com.google.android.gms.internal.ads.zzbf r0 = r10.zzb     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r0.zzg()     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto Lf
            goto Lae
        Lf:
            com.google.android.gms.internal.ads.zzuu r1 = r10.zzd     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L3e
            long r2 = r9.zzi()     // Catch: java.lang.Throwable -> L3c
            long r4 = r1.zzd     // Catch: java.lang.Throwable -> L3c
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 < 0) goto Lae
            java.util.HashMap r2 = r9.zze     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = r9.zzh     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzoq r2 = (com.google.android.gms.internal.ads.zzoq) r2     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L3e
            long r3 = r2.zzg()     // Catch: java.lang.Throwable -> L3c
            r5 = -1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L3e
            int r2 = r2.zzf()     // Catch: java.lang.Throwable -> L3c
            int r3 = r10.zzc     // Catch: java.lang.Throwable -> L3c
            if (r2 != r3) goto Lae
            goto L3e
        L3c:
            r10 = move-exception
            goto Lb2
        L3e:
            int r2 = r10.zzc     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzoq r3 = r9.zzo(r2, r1)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = r9.zzh     // Catch: java.lang.Throwable -> L3c
            if (r4 != 0) goto L4e
            java.lang.String r4 = r3.zze()     // Catch: java.lang.Throwable -> L3c
            r9.zzh = r4     // Catch: java.lang.Throwable -> L3c
        L4e:
            r4 = 1
            if (r1 == 0) goto L85
            boolean r5 = r1.zzb()     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L85
            java.lang.Object r5 = r1.zza     // Catch: java.lang.Throwable -> L3c
            long r6 = r1.zzd     // Catch: java.lang.Throwable -> L3c
            int r1 = r1.zzb     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzuu r8 = new com.google.android.gms.internal.ads.zzuu     // Catch: java.lang.Throwable -> L3c
            r8.<init>(r5, r6, r1)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzoq r2 = r9.zzo(r2, r8)     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r2.zzi()     // Catch: java.lang.Throwable -> L3c
            if (r6 != 0) goto L85
            r2.zzj(r4)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzbd r2 = r9.zzd     // Catch: java.lang.Throwable -> L3c
            r0.zzo(r5, r2)     // Catch: java.lang.Throwable -> L3c
            r2.zzc(r1)     // Catch: java.lang.Throwable -> L3c
            r0 = 0
            long r5 = com.google.android.gms.internal.ads.zzep.zzp(r0)     // Catch: java.lang.Throwable -> L3c
            long r7 = com.google.android.gms.internal.ads.zzep.zzp(r0)     // Catch: java.lang.Throwable -> L3c
            long r5 = r5 + r7
            java.lang.Math.max(r0, r5)     // Catch: java.lang.Throwable -> L3c
        L85:
            boolean r0 = r3.zzi()     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L8e
            r3.zzj(r4)     // Catch: java.lang.Throwable -> L3c
        L8e:
            java.lang.String r0 = r3.zze()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = r9.zzh     // Catch: java.lang.Throwable -> L3c
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto Lae
            boolean r0 = r3.zzk()     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto Lae
            r3.zzl(r4)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzoz r0 = r9.zzf     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = r3.zze()     // Catch: java.lang.Throwable -> L3c
            r0.zzc(r10, r1)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r9)
            return
        Lae:
            monitor-exit(r9)
            return
        Lb0:
            r10 = 0
            throw r10     // Catch: java.lang.Throwable -> L3c
        Lb2:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L3c
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzor.zzc(com.google.android.gms.internal.ads.zzmj):void");
    }

    @Override // com.google.android.gms.internal.ads.zzpa
    public final synchronized void zzd(zzmj zzmjVar) {
        try {
            if (this.zzf == null) {
                throw null;
            }
            zzbf zzbfVar = this.zzg;
            this.zzg = zzmjVar.zzb;
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzoq zzoqVar = (zzoq) it.next();
                if (!zzoqVar.zza(zzbfVar, this.zzg) || zzoqVar.zzd(zzmjVar)) {
                    it.remove();
                    if (zzoqVar.zzi()) {
                        if (zzoqVar.zze().equals(this.zzh)) {
                            zzm(zzoqVar);
                        }
                        this.zzf.zzd(zzmjVar, zzoqVar.zze(), false);
                    }
                }
            }
            zzl(zzmjVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpa
    public final synchronized void zze(zzmj zzmjVar, int i10) {
        try {
            if (this.zzf == null) {
                throw null;
            }
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzoq zzoqVar = (zzoq) it.next();
                if (zzoqVar.zzd(zzmjVar)) {
                    it.remove();
                    if (zzoqVar.zzi()) {
                        boolean zEquals = zzoqVar.zze().equals(this.zzh);
                        boolean z10 = false;
                        if (i10 == 0 && zEquals && zzoqVar.zzk()) {
                            z10 = true;
                        }
                        if (zEquals) {
                            zzm(zzoqVar);
                        }
                        this.zzf.zzd(zzmjVar, zzoqVar.zze(), z10);
                    }
                }
            }
            zzl(zzmjVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpa
    public final synchronized String zzf() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzpa
    public final synchronized void zzg(zzmj zzmjVar) {
        zzoz zzozVar;
        try {
            String str = this.zzh;
            if (str != null) {
                zzoq zzoqVar = (zzoq) this.zze.get(str);
                if (zzoqVar == null) {
                    throw null;
                }
                zzm(zzoqVar);
            }
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzoq zzoqVar2 = (zzoq) it.next();
                it.remove();
                if (zzoqVar2.zzi() && (zzozVar = this.zzf) != null) {
                    zzozVar.zzd(zzmjVar, zzoqVar2.zze(), false);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final /* synthetic */ zzbe zzj() {
        return this.zzc;
    }

    public final /* synthetic */ zzbd zzk() {
        return this.zzd;
    }

    public zzor(zzgmv zzgmvVar) {
        this.zzc = new zzbe();
        this.zzd = new zzbd();
        this.zze = new HashMap();
        this.zzg = zzbf.zza;
        this.zzi = -1L;
    }
}
