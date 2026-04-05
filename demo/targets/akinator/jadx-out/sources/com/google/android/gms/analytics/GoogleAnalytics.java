package com.google.android.gms.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzeg;
import com.google.android.gms.internal.gtm.zzeh;
import com.google.android.gms.internal.gtm.zzen;
import com.google.android.gms.internal.gtm.zzfd;
import com.google.android.gms.internal.gtm.zzfe;
import com.google.android.gms.internal.gtm.zzfg;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class GoogleAnalytics extends zza {
    private static List zzb = new ArrayList();
    private boolean zzc;
    private final Set zzd;
    private boolean zze;
    private boolean zzf;
    private volatile boolean zzg;
    private boolean zzh;

    public GoogleAnalytics(zzbu zzbuVar) {
        super(zzbuVar);
        this.zzd = new HashSet();
    }

    public static GoogleAnalytics getInstance(Context context) {
        return zzbu.zzg(context).zzc();
    }

    public static void zzf() {
        synchronized (GoogleAnalytics.class) {
            try {
                List list = zzb;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zzb = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void dispatchLocalHits() {
        zzb().zzf().zzc();
    }

    public void enableAutoActivityReports(Application application) {
        if (this.zze) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new zze(this));
        this.zze = true;
    }

    public boolean getAppOptOut() {
        return this.zzg;
    }

    @Deprecated
    public Logger getLogger() {
        return zzen.zza();
    }

    public boolean isDryRunEnabled() {
        return this.zzf;
    }

    public Tracker newTracker(int i10) {
        Tracker tracker;
        zzfe zzfeVar;
        synchronized (this) {
            try {
                tracker = new Tracker(zzb(), null, null);
                if (i10 > 0 && (zzfeVar = (zzfe) new zzfd(zzb()).zza(i10)) != null) {
                    tracker.zzm(zzfeVar);
                }
                tracker.zzW();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tracker;
    }

    public void reportActivityStart(Activity activity) {
        if (this.zze) {
            return;
        }
        zzh(activity);
    }

    public void reportActivityStop(Activity activity) {
        if (this.zze) {
            return;
        }
        zzi(activity);
    }

    public void setAppOptOut(boolean z10) {
        this.zzg = z10;
        if (this.zzg) {
            zzb().zzf().zzg();
        }
    }

    public void setDryRun(boolean z10) {
        this.zzf = z10;
    }

    public void setLocalDispatchPeriod(int i10) {
        zzb().zzf().zzl(i10);
    }

    @Deprecated
    public void setLogger(Logger logger) {
        zzen.zzc(logger);
        if (this.zzh) {
            return;
        }
        zzeg zzegVar = zzeh.zzb;
        Log.i((String) zzegVar.zzb(), "GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag." + ((String) zzegVar.zzb()) + " DEBUG");
        this.zzh = true;
    }

    public final void zzg() {
        zzfg zzfgVarZzq = zzb().zzq();
        zzfgVarZzq.zzf();
        if (zzfgVarZzq.zze()) {
            setDryRun(zzfgVarZzq.zzc());
        }
        zzfgVarZzq.zzf();
        this.zzc = true;
    }

    public final void zzh(Activity activity) {
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            ((zzv) it.next()).zza(activity);
        }
    }

    public final void zzi(Activity activity) {
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            ((zzv) it.next()).zzb(activity);
        }
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public final void zzk(zzv zzvVar) {
        this.zzd.add(zzvVar);
        Context contextZza = zzb().zza();
        if (contextZza instanceof Application) {
            enableAutoActivityReports((Application) contextZza);
        }
    }

    public final void zzl(zzv zzvVar) {
        this.zzd.remove(zzvVar);
    }

    public Tracker newTracker(String str) {
        Tracker tracker;
        synchronized (this) {
            tracker = new Tracker(zzb(), str, null);
            tracker.zzW();
        }
        return tracker;
    }
}
