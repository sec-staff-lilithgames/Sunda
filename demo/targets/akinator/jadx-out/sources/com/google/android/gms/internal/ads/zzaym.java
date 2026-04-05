package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaym {
    private static final String[] zza = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    private long zzb = 0;
    private long zzc = 0;
    private long zzd = -1;
    private boolean zze = false;

    public zzaym(Context context, Executor executor, String[] strArr) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new zzayl(this));
        } catch (IllegalArgumentException | NoSuchMethodError unused) {
        }
    }

    public static zzaym zza(Context context, Executor executor) {
        return new zzaym(context, executor, zza);
    }

    public final void zzb() {
        if (this.zze) {
            this.zzc = System.currentTimeMillis();
        }
    }

    public final long zzc() {
        if (this.zze) {
            return this.zzc - this.zzb;
        }
        return -1L;
    }

    public final long zzd() {
        long j10 = this.zzd;
        this.zzd = -1L;
        return j10;
    }

    public final /* synthetic */ void zze(long j10) {
        this.zzb = j10;
    }

    public final /* synthetic */ long zzf() {
        return this.zzc;
    }

    public final /* synthetic */ void zzg(long j10) {
        this.zzd = j10;
    }

    public final /* synthetic */ void zzh(boolean z10) {
        this.zze = z10;
    }
}
