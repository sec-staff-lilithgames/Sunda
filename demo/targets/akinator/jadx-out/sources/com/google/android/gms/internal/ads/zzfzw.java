package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfzw implements zzfzn, zzfzj, zzgac {
    private static final zziaa zza;
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    private final ExecutorService zzd;
    private final zzfys zze;
    private final boolean zzf;
    private final String zzg;
    private final long zzh;
    private final long zzi;
    private final double zzj;
    private final String zzk;
    private final long zzl;
    private final AtomicBoolean zzm = new AtomicBoolean(false);
    private final Object zzn = new Object();
    private final Object zzo = new Object();
    private final Object zzp = new Object();
    private final zzatf zzq = zzatg.zza();
    private final List zzr = new ArrayList();
    private boolean zzs = false;
    private final HashMap zzt = new HashMap();

    static {
        zzhzz zzhzzVarZzc = zziaa.zzc();
        zzhzzVarZzc.zza(17);
        zza = (zziaa) zzhzzVarZzc.zzbu();
    }

    public zzfzw(Context context, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, zzfys zzfysVar, Random random, String str, long j10, long j11, double d10, String str2, long j12) {
        this.zzb = context;
        this.zzc = scheduledExecutorService;
        this.zzd = executorService;
        this.zze = zzfysVar;
        this.zzg = str;
        this.zzh = j10;
        this.zzi = j11;
        this.zzj = d10;
        this.zzk = str2;
        this.zzl = j12;
        this.zzf = random.nextDouble() < d10;
    }

    @Override // com.google.android.gms.internal.ads.zzfzj
    public final n1 zza() {
        return zzgui.zze(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfzu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf();
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfzn
    public final void zzb(int i10, long j10, Throwable th2, String str) {
        long jLongValue;
        if (this.zzf) {
            synchronized (this.zzo) {
                try {
                    List list = this.zzr;
                    synchronized (this.zzp) {
                        try {
                            HashMap map = this.zzt;
                            Integer numValueOf = Integer.valueOf(i10);
                            Long l9 = (Long) map.get(numValueOf);
                            if (l9 == null) {
                                l9 = 0L;
                            }
                            jLongValue = 1 + l9.longValue();
                            map.put(numValueOf, Long.valueOf(jLongValue));
                        } finally {
                        }
                    }
                    list.add(new zzfzt(i10, j10, th2, str, jLongValue));
                    if (!this.zzs) {
                        this.zzs = true;
                        this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfzv
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() throws IOException {
                                this.zza.zzd();
                            }
                        }, this.zzi, TimeUnit.MILLISECONDS);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final void zzc(zzgab zzgabVar) {
        synchronized (this.zzn) {
            this.zzq.zzj(zzgabVar.zza());
        }
    }

    public final void zzd() throws IOException {
        zzatf zzatfVar;
        zzgpe zzgpeVarZzq;
        String string;
        synchronized (this.zzn) {
            zzatfVar = (zzatf) this.zzq.clone();
        }
        synchronized (this.zzo) {
            List list = this.zzr;
            zzgpeVarZzq = zzgpe.zzq(list);
            list.clear();
            this.zzs = false;
        }
        int size = zzgpeVarZzq.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            zzfzt zzfztVar = (zzfzt) zzgpeVarZzq.get(i10);
            if (i11 >= this.zzh) {
                zze((zzatg) zzatfVar.zzbu());
                zzatfVar.zzb();
                i11 = 0;
            }
            zzatx zzatxVarZza = zzaty.zza();
            zzatxVarZza.zza(zzfztVar.zza);
            zzatxVarZza.zzb(zzfztVar.zzb);
            zzatxVarZza.zze(zzfztVar.zze);
            String str = zzfztVar.zzd;
            if (str != null) {
                zzatxVarZza.zzf(str);
            }
            Throwable th2 = zzfztVar.zzc;
            zzatxVarZza.zzg(th2 == null ? 2 : 3);
            if (th2 != null) {
                zzatxVarZza.zzc(th2.getClass().getName());
                try {
                    StringWriter stringWriter = new StringWriter();
                    try {
                        PrintWriter printWriter = new PrintWriter(stringWriter);
                        try {
                            th2.printStackTrace(printWriter);
                            string = stringWriter.toString();
                            printWriter.close();
                            stringWriter.close();
                        } catch (Throwable th3) {
                            try {
                                printWriter.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        try {
                            stringWriter.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                } catch (IOException unused) {
                    string = "";
                }
                zzatxVarZza.zzd(string);
            }
            zzatfVar.zza((zzaty) zzatxVarZza.zzbu());
            i10++;
            i11++;
        }
        if (i11 > 0) {
            zze((zzatg) zzatfVar.zzbu());
            zzatfVar.zzb();
        }
    }

    public final void zze(zzatg zzatgVar) {
        try {
            zzfzr zzfzrVarZza = zzfzs.zza();
            zzfzrVarZza.zzb(zza);
            zzfzp zzfzpVarZza = zzfzq.zza();
            zzfzpVarZza.zza(zzatgVar);
            zzfzrVarZza.zza((zzfzq) zzfzpVarZza.zzbu());
            this.zze.zzb(this.zzg, ((zzfzs) zzfzrVarZza.zzbu()).zzaN(), CommonGatewayClient.HEADER_PROTOBUF);
        } catch (RuntimeException unused) {
        }
    }

    public final /* synthetic */ void zzf() {
        int i10;
        if (!this.zzf || this.zzm.getAndSet(true)) {
            return;
        }
        Context context = this.zzb;
        String str = this.zzk;
        double d10 = this.zzj;
        long j10 = this.zzl;
        Locale locale = Locale.getDefault();
        zzatf zzatfVarZza = zzatg.zza();
        zzatfVarZza.zzc(Build.VERSION.SDK_INT);
        zzatfVarZza.zzd(Build.MODEL);
        zzatfVarZza.zze(locale.getLanguage());
        zzatfVarZza.zzf(locale.getCountry());
        zzatfVarZza.zzi(str);
        zzatfVarZza.zzg(context.getPackageName());
        zzatfVarZza.zzl(j10);
        if (d10 > 0.0d) {
            zzatfVarZza.zzk((int) (1.0d / d10));
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            zzatfVarZza.zzh(packageManager.getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception unused) {
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                i10 = 5;
            } else if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                i10 = 4;
            } else if (packageManager.hasSystemFeature("android.hardware.type.pc")) {
                i10 = 7;
            } else {
                UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                i10 = (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) ? 2 : 6;
            }
            zzatfVarZza.zzm(i10);
        } catch (RuntimeException unused2) {
        }
        zzatg zzatgVar = (zzatg) zzatfVarZza.zzbu();
        synchronized (this.zzn) {
            this.zzq.zzbo(zzatgVar);
        }
    }
}
