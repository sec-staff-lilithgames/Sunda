package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import hr.kNq.ikJMrW;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbbn implements Application.ActivityLifecycleCallbacks {
    private Activity zza;
    private Context zzb;
    private Runnable zzh;
    private long zzj;
    private final Object zzc = new Object();
    private final AtomicBoolean zzd = new AtomicBoolean(true);
    private boolean zze = false;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private boolean zzi = false;

    private final void zzk(Activity activity) {
        synchronized (this.zzc) {
            try {
                if (!activity.getClass().getName().startsWith(MobileAds.ERROR_DOMAIN)) {
                    this.zza = activity;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.zzc) {
            try {
                Activity activity2 = this.zza;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.zza = null;
                }
                Iterator it = this.zzg.iterator();
                while (it.hasNext()) {
                    try {
                        ((zzdsq) it.next()).zzg(activity);
                    } catch (Exception e10) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzk(activity);
        this.zze = false;
        boolean andSet = this.zzd.getAndSet(true);
        Runnable runnable = this.zzh;
        if (runnable != null) {
            com.google.android.gms.ads.internal.util.zzs.zza.removeCallbacks(runnable);
        }
        synchronized (this.zzc) {
            Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                try {
                    ((zzdsq) it.next()).zze(activity);
                } catch (Exception e10) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AppActivityTracker.ActivityListener.onActivityResumed");
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
                }
            }
            if (andSet) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("App is still foreground.");
            } else {
                Iterator it2 = this.zzf.iterator();
                while (it2.hasNext()) {
                    try {
                        ((zzbbo) it2.next()).zza(true);
                    } catch (Exception e11) {
                        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("", e11);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zzk(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public final void zza(Application application, Context context) {
        if (this.zzi) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            zzk((Activity) context);
        }
        this.zzb = application;
        this.zzj = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbl)).longValue();
        this.zzi = true;
    }

    public final void zzb(zzbbo zzbboVar) {
        synchronized (this.zzc) {
            this.zzf.add(zzbboVar);
        }
    }

    public final void zzc(zzbbo zzbboVar) {
        synchronized (this.zzc) {
            this.zzf.remove(zzbboVar);
        }
    }

    public final Activity zzd() {
        return this.zza;
    }

    public final Context zze() {
        return this.zzb;
    }

    public final /* synthetic */ Object zzf() {
        return this.zzc;
    }

    public final /* synthetic */ AtomicBoolean zzg() {
        return this.zzd;
    }

    public final /* synthetic */ boolean zzh() {
        return this.zze;
    }

    public final /* synthetic */ List zzi() {
        return this.zzf;
    }

    public final void zzj(zzdsq zzdsqVar) {
        synchronized (this.zzc) {
            this.zzg.add(zzdsqVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zzk(activity);
        synchronized (this.zzc) {
            Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                try {
                    ((zzdsq) it.next()).zzf(activity);
                } catch (Exception e10) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AppActivityTracker.ActivityListener.onActivityPaused");
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg(ikJMrW.DRaMfBHfQX, e10);
                }
            }
        }
        this.zze = true;
        Runnable runnable = this.zzh;
        if (runnable != null) {
            com.google.android.gms.ads.internal.util.zzs.zza.removeCallbacks(runnable);
        }
        zzfuz zzfuzVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzbbm zzbbmVar = new zzbbm(this);
        this.zzh = zzbbmVar;
        zzfuzVar.postDelayed(zzbbmVar, this.zzj);
    }
}
