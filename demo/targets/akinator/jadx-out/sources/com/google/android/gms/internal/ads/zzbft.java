package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import androidx.browser.customtabs.d0;
import androidx.browser.customtabs.k0;
import androidx.browser.customtabs.v;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbft extends d0 {
    public static final /* synthetic */ int zza = 0;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private Context zzc;
    private zzdvi zzd;
    private k0 zze;
    private v zzf;

    private final void zzf(Context context) {
        String packageName;
        if (this.zzf != null || context == null || (packageName = v.getPackageName(context, null)) == null || packageName.equals(context.getPackageName())) {
            return;
        }
        v.bindCustomTabsService(context, packageName, this);
    }

    @Override // androidx.browser.customtabs.d0
    public final void onCustomTabsServiceConnected(ComponentName componentName, v vVar) {
        this.zzf = vVar;
        vVar.warmup(0L);
        this.zze = vVar.newSession(new zzbfq(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zzf = null;
        this.zze = null;
    }

    public final void zza(Context context, zzdvi zzdviVar) {
        if (this.zzb.getAndSet(true)) {
            return;
        }
        this.zzc = context;
        this.zzd = zzdviVar;
        zzf(context);
    }

    public final k0 zzb() {
        if (this.zze == null) {
            zzcbv.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbfs
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd();
                }
            });
        }
        return this.zze;
    }

    public final void zzc(final int i10) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfh)).booleanValue() || this.zzd == null) {
            return;
        }
        zzcbv.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbfr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze(i10);
            }
        });
    }

    public final /* synthetic */ void zzd() {
        zzf(this.zzc);
    }

    public final /* synthetic */ void zze(int i10) {
        zzdvi zzdviVar = this.zzd;
        if (zzdviVar != null) {
            zzdvh zzdvhVarZza = zzdviVar.zza();
            zzdvhVarZza.zzc("action", "cct_nav");
            zzdvhVarZza.zzc("cct_navs", String.valueOf(i10));
            zzdvhVarZza.zzd();
        }
    }
}
