package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzee {
    private static zzee zza;
    private final Executor zzb;
    private final CopyOnWriteArrayList zzc;
    private final Object zzd;
    private int zze;
    private boolean zzf;

    private zzee(final Context context) {
        Executor executorZza = zzcw.zza();
        this.zzb = executorZza;
        this.zzc = new CopyOnWriteArrayList();
        this.zzd = new Object();
        this.zze = 0;
        executorZza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new zzed(this.zza, null), intentFilter);
            }
        });
    }

    public static synchronized zzee zza(Context context) {
        try {
            if (zza == null) {
                zza = new zzee(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zza;
    }

    private final void zzg() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zzc;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzea zzeaVar = (zzea) it.next();
            if (zzeaVar.zza()) {
                copyOnWriteArrayList.remove(zzeaVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final void zze(int i10) {
        zzg();
        synchronized (this.zzd) {
            try {
                if (this.zzf && this.zze == i10) {
                    return;
                }
                this.zzf = true;
                this.zze = i10;
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    ((zzea) it.next()).zzb();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzb(zzdy zzdyVar, Executor executor) {
        boolean z10;
        zzg();
        zzea zzeaVar = new zzea(this, zzdyVar, executor);
        synchronized (this.zzd) {
            this.zzc.add(zzeaVar);
            z10 = this.zzf;
        }
        if (z10) {
            zzeaVar.zzb();
        }
    }

    public final int zzc() {
        int i10;
        synchronized (this.zzd) {
            i10 = this.zze;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void zzd(android.content.Context r10) {
        /*
            r9 = this;
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r10.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            r1 = 0
            r2 = 5
            if (r0 != 0) goto Ld
            goto L4e
        Ld:
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L4e
            r3 = 1
            if (r0 == 0) goto L1a
            boolean r4 = r0.isConnected()
            if (r4 != 0) goto L1c
        L1a:
            r1 = r3
            goto L4e
        L1c:
            int r4 = r0.getType()
            r5 = 2
            r6 = 9
            r7 = 6
            r8 = 4
            if (r4 == 0) goto L3a
            if (r4 == r3) goto L38
            if (r4 == r8) goto L3a
            if (r4 == r2) goto L3a
            if (r4 == r7) goto L36
            if (r4 == r6) goto L34
            r1 = 8
            goto L4e
        L34:
            r1 = 7
            goto L4e
        L36:
            r1 = r2
            goto L4e
        L38:
            r1 = r5
            goto L4e
        L3a:
            int r0 = r0.getSubtype()
            switch(r0) {
                case 1: goto L4d;
                case 2: goto L4d;
                case 3: goto L4b;
                case 4: goto L4b;
                case 5: goto L4b;
                case 6: goto L4b;
                case 7: goto L4b;
                case 8: goto L4b;
                case 9: goto L4b;
                case 10: goto L4b;
                case 11: goto L4b;
                case 12: goto L4b;
                case 13: goto L36;
                case 14: goto L4b;
                case 15: goto L4b;
                case 16: goto L41;
                case 17: goto L4b;
                case 18: goto L38;
                case 19: goto L41;
                case 20: goto L43;
                default: goto L41;
            }
        L41:
            r1 = r7
            goto L4e
        L43:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r0 < r3) goto L4e
            r1 = r6
            goto L4e
        L4b:
            r1 = r8
            goto L4e
        L4d:
            r1 = 3
        L4e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r0 < r3) goto L74
            if (r1 != r2) goto L74
            java.lang.String r0 = "phone"
            java.lang.Object r10 = r10.getSystemService(r0)     // Catch: java.lang.RuntimeException -> L70
            android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10     // Catch: java.lang.RuntimeException -> L70
            if (r10 == 0) goto L6e
            com.google.android.gms.internal.ads.zzdx r0 = new com.google.android.gms.internal.ads.zzdx     // Catch: java.lang.RuntimeException -> L70
            r0.<init>(r9)     // Catch: java.lang.RuntimeException -> L70
            java.util.concurrent.Executor r1 = r9.zzb     // Catch: java.lang.RuntimeException -> L70
            r10.registerTelephonyCallback(r1, r0)     // Catch: java.lang.RuntimeException -> L70
            r10.unregisterTelephonyCallback(r0)     // Catch: java.lang.RuntimeException -> L70
            return
        L6e:
            r10 = 0
            throw r10     // Catch: java.lang.RuntimeException -> L70
        L70:
            r9.zze(r2)
            return
        L74:
            r9.zze(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzee.zzd(android.content.Context):void");
    }

    public final /* synthetic */ Executor zzf() {
        return this.zzb;
    }
}
