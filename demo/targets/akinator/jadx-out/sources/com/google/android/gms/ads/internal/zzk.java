package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzatd;
import com.google.android.gms.internal.ads.zzate;
import com.google.android.gms.internal.ads.zzawo;
import com.google.android.gms.internal.ads.zzaws;
import com.google.android.gms.internal.ads.zzawv;
import com.google.android.gms.internal.ads.zzawz;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzfrs;
import com.google.android.gms.internal.ads.zzfsp;
import com.google.android.gms.internal.ads.zzftj;
import com.google.android.gms.internal.ads.zzgui;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzk implements Runnable, zzawv {
    private static final long zzc = System.currentTimeMillis();
    protected boolean zza;
    private final boolean zzg;
    private final boolean zzh;
    private final Executor zzi;
    private final zzfrs zzj;
    private Context zzk;
    private final Context zzl;
    private VersionInfoParcel zzm;
    private final VersionInfoParcel zzn;
    private final boolean zzo;
    private int zzp;
    private final List zzd = new Vector();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    final CountDownLatch zzb = new CountDownLatch(1);

    public zzk(Context context, VersionInfoParcel versionInfoParcel) {
        this.zzk = context;
        this.zzl = context;
        this.zzm = versionInfoParcel;
        this.zzn = versionInfoParcel;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.zzi = executorServiceNewCachedThreadPool;
        boolean zBooleanValue = ((Boolean) zzbd.zzc().zzd(zzbeu.zzcN)).booleanValue();
        this.zzo = zBooleanValue;
        this.zzj = zzfrs.zza(context, executorServiceNewCachedThreadPool, zBooleanValue);
        this.zzg = ((Boolean) zzbd.zzc().zzd(zzbeu.zzcK)).booleanValue();
        this.zzh = ((Boolean) zzbd.zzc().zzd(zzbeu.zzcO)).booleanValue();
        if (((Boolean) zzbd.zzc().zzd(zzbeu.zzcM)).booleanValue()) {
            this.zzp = 2;
        } else {
            this.zzp = 1;
        }
        if (!((Boolean) zzbd.zzc().zzd(zzbeu.zzdX)).booleanValue()) {
            this.zza = zzm();
        }
        if (((Boolean) zzbd.zzc().zzd(zzbeu.zzdQ)).booleanValue()) {
            zzcbv.zza.execute(this);
            return;
        }
        zzbb.zza();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzz()) {
            zzcbv.zza.execute(this);
        } else {
            run();
        }
    }

    private final void zzq() {
        List<Object[]> list = this.zzd;
        zzawv zzawvVarZzs = zzs();
        if (list.isEmpty() || zzawvVarZzs == null) {
            return;
        }
        for (Object[] objArr : list) {
            int length = objArr.length;
            if (length == 1) {
                zzawvVarZzs.zzd((MotionEvent) objArr[0]);
            } else if (length == 3) {
                zzawvVarZzs.zze(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        list.clear();
    }

    private final void zzr(boolean z10) {
        String str = this.zzm.afmaVersion;
        Context contextZzt = zzt(this.zzk);
        zzatd zzatdVarZze = zzate.zze();
        zzatdVarZze.zzb(z10);
        zzatdVarZze.zza(str);
        this.zze.set(zzawz.zzt(contextZzt, (zzate) zzatdVarZze.zzbu()));
    }

    private final zzawv zzs() {
        return zzp() == 2 ? (zzawv) this.zzf.get() : (zzawv) this.zze.get();
    }

    private static final Context zzt(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private static final zzaws zzu(Context context, VersionInfoParcel versionInfoParcel, boolean z10, boolean z11) {
        zzatd zzatdVarZze = zzate.zze();
        zzatdVarZze.zzb(z10);
        zzatdVarZze.zza(versionInfoParcel.afmaVersion);
        return zzaws.zza(zzt(context), (zzate) zzatdVarZze.zzbu(), z11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) zzbd.zzc().zzd(zzbeu.zzdX)).booleanValue()) {
                this.zza = zzm();
            }
            boolean z10 = this.zzm.isClientJar;
            final boolean z11 = false;
            if (!((Boolean) zzbd.zzc().zzd(zzbeu.zzbo)).booleanValue() && z10) {
                z11 = true;
            }
            if (zzp() == 1) {
                zzr(z11);
                if (this.zzp == 2) {
                    this.zzi.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzi
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzn(z11);
                        }
                    });
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    zzaws zzawsVarZzu = zzu(this.zzk, this.zzm, z11, this.zzo);
                    this.zzf.set(zzawsVarZzu);
                    if (this.zzh && !zzawsVarZzu.zzb()) {
                        this.zzp = 1;
                        zzr(z11);
                    }
                } catch (NullPointerException e10) {
                    this.zzp = 1;
                    zzr(z11);
                    this.zzj.zzc(2031, System.currentTimeMillis() - jCurrentTimeMillis, e10);
                }
            }
            this.zzb.countDown();
            this.zzk = null;
            this.zzm = null;
        } catch (Throwable th2) {
            this.zzb.countDown();
            this.zzk = null;
            this.zzm = null;
            throw th2;
        }
    }

    public final boolean zza() throws InterruptedException {
        try {
            this.zzb.await();
            return true;
        } catch (InterruptedException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Interrupted during GADSignals creation.", e10);
            return false;
        }
    }

    public final String zzb(Context context, byte[] bArr) {
        zzawv zzawvVarZzs;
        if (!zza() || (zzawvVarZzs = zzs()) == null) {
            return "";
        }
        zzq();
        return zzawvVarZzs.zzl(zzt(context));
    }

    public final String zzc() {
        int i10 = this.zzp;
        int i11 = i10 - 1;
        if (i10 != 0) {
            return i11 != 0 ? "2" : "1";
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzawv
    public final void zzd(MotionEvent motionEvent) {
        zzawv zzawvVarZzs = zzs();
        if (zzawvVarZzs == null) {
            this.zzd.add(new Object[]{motionEvent});
        } else {
            zzq();
            zzawvVarZzs.zzd(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawv
    public final void zze(int i10, int i11, int i12) {
        zzawv zzawvVarZzs = zzs();
        if (zzawvVarZzs == null) {
            this.zzd.add(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)});
        } else {
            zzq();
            zzawvVarZzs.zze(i10, i11, i12);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawv
    public final String zzf(Context context, String str, View view, Activity activity) {
        if (!zza()) {
            return "";
        }
        zzawv zzawvVarZzs = zzs();
        if (((Boolean) zzbd.zzc().zzd(zzbeu.zzlH)).booleanValue()) {
            zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzN(view, 4, null);
        }
        if (zzawvVarZzs == null) {
            return "";
        }
        zzq();
        return zzawvVarZzs.zzf(zzt(context), str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzawv
    public final String zzg(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzawv
    public final void zzh(View view) {
        zzawv zzawvVarZzs = zzs();
        if (zzawvVarZzs != null) {
            zzawvVarZzs.zzh(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawv
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        zzawv zzawvVarZzs;
        zzawv zzawvVarZzs2;
        if (((Boolean) zzbd.zzc().zzd(zzbeu.zzdl)).booleanValue()) {
            if (this.zzb.getCount() != 0 || (zzawvVarZzs2 = zzs()) == null) {
                return;
            }
            zzawvVarZzs2.zzi(stackTraceElementArr);
            return;
        }
        if (!zza() || (zzawvVarZzs = zzs()) == null) {
            return;
        }
        zzawvVarZzs.zzi(stackTraceElementArr);
    }

    @Override // com.google.android.gms.internal.ads.zzawv
    public final String zzj(Context context, View view, Activity activity) {
        if (!((Boolean) zzbd.zzc().zzd(zzbeu.zzlG)).booleanValue()) {
            zzawv zzawvVarZzs = zzs();
            if (((Boolean) zzbd.zzc().zzd(zzbeu.zzlH)).booleanValue()) {
                zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzN(view, 2, null);
            }
            return zzawvVarZzs != null ? zzawvVarZzs.zzj(context, view, activity) : "";
        }
        if (!zza()) {
            return "";
        }
        zzawv zzawvVarZzs2 = zzs();
        if (((Boolean) zzbd.zzc().zzd(zzbeu.zzlH)).booleanValue()) {
            zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzN(view, 2, null);
        }
        return zzawvVarZzs2 != null ? zzawvVarZzs2.zzj(context, view, activity) : "";
    }

    @Override // com.google.android.gms.internal.ads.zzawv
    public final String zzk(final Context context) {
        try {
            return (String) zzgui.zzd(new Callable() { // from class: com.google.android.gms.ads.internal.zzj
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzb(context, null);
                }
            }, this.zzi).get(((Integer) zzbd.zzc().zzd(zzbeu.zzde)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            return zzawo.zza(context, this.zzn.afmaVersion, zzc, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawv
    public final String zzl(Context context) {
        return zzb(context, null);
    }

    public final boolean zzm() {
        Context context = this.zzk;
        zzh zzhVar = new zzh(this);
        zzfrs zzfrsVar = this.zzj;
        return new zzftj(this.zzk, zzfsp.zzb(context, zzfrsVar), zzhVar, ((Boolean) zzbd.zzc().zzd(zzbeu.zzcL)).booleanValue()).zzd(1);
    }

    public final /* synthetic */ void zzn(boolean z10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            zzu(this.zzl, this.zzn, z10, this.zzo).zzm();
        } catch (NullPointerException e10) {
            this.zzj.zzc(2027, System.currentTimeMillis() - jCurrentTimeMillis, e10);
        }
    }

    public final /* synthetic */ zzfrs zzo() {
        return this.zzj;
    }

    public final int zzp() {
        if (!this.zzg || this.zza) {
            return this.zzp;
        }
        return 1;
    }
}
