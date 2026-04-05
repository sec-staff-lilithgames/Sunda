package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zza {
    private static zza zza;

    public static zza zza(Context context) {
        zza zzaVar;
        synchronized (zza.class) {
            try {
                if (zza == null) {
                    zzai zzaiVar = new zzai(null);
                    zzaiVar.zzb((Application) context.getApplicationContext());
                    zza = zzaiVar.zza();
                }
                zzaVar = zza;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzaVar;
    }

    public abstract zzj zzb();

    public abstract zzbo zzc();
}
