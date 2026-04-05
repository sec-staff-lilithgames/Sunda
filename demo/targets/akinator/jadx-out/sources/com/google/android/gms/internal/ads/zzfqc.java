package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfqc {
    private static final zzfqc zza = new zzfqc();
    private WeakReference zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public static zzfqc zza() {
        return zza;
    }

    public final void zzb(Context context) {
        if (context == null) {
            return;
        }
        this.zzb = new WeakReference(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new zzfqb(this), intentFilter);
    }

    public final void zzc() {
        KeyguardManager keyguardManager;
        Context context = (Context) this.zzb.get();
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
        zzd(this.zzc, zIsDeviceLocked);
        this.zzd = zIsDeviceLocked;
    }

    public final void zzd(boolean z10, boolean z11) {
        if ((z11 || z10) == (this.zzd || this.zzc)) {
            return;
        }
        Iterator it = zzfps.zza().zze().iterator();
        while (it.hasNext()) {
            ((zzfoy) it.next()).zzg().zzg(z11 || z10);
        }
    }

    public final /* synthetic */ void zze(boolean z10) {
        this.zzc = z10;
    }

    public final /* synthetic */ boolean zzf() {
        return this.zzd;
    }
}
