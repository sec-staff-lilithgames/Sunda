package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import m3.i;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzjy implements zzjv {
    private static zzjy zza;
    private final Context zzb;
    private final ContentObserver zzc;
    private boolean zzd;

    private zzjy() {
        this.zzd = false;
        this.zzb = null;
        this.zzc = null;
    }

    public static zzjy zza(Context context) {
        zzjy zzjyVar;
        synchronized (zzjy.class) {
            try {
                if (zza == null) {
                    zza = i.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzjy(context) : new zzjy();
                }
                zzjy zzjyVar2 = zza;
                if (zzjyVar2 != null && zzjyVar2.zzc != null && !zzjyVar2.zzd) {
                    try {
                        context.getContentResolver().registerContentObserver(zzjg.zza, true, zza.zzc);
                        ((zzjy) p1.checkNotNull(zza)).zzd = true;
                    } catch (SecurityException e10) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e10);
                    }
                }
                zzjyVar = (zzjy) p1.checkNotNull(zza);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzjyVar;
    }

    public static synchronized void zzc() {
        Context context;
        try {
            zzjy zzjyVar = zza;
            if (zzjyVar != null && (context = zzjyVar.zzb) != null && zzjyVar.zzc != null && zzjyVar.zzd) {
                context.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjv
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final String zze(final String str) {
        Context context = this.zzb;
        if (context != null && !zzjm.zzb(context)) {
            try {
                return (String) zzjv.zzh(new zzju() { // from class: com.google.android.gms.internal.measurement.zzjx
                    @Override // com.google.android.gms.internal.measurement.zzju
                    public final /* synthetic */ Object zza() {
                        return this.zza.zzd(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e10) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e10);
            }
        }
        return null;
    }

    public final /* synthetic */ String zzd(String str) {
        return zzjf.zza(((Context) p1.checkNotNull(this.zzb)).getContentResolver(), str, null);
    }

    private zzjy(Context context) {
        this.zzd = false;
        this.zzb = context;
        this.zzc = new zzjw(this, null);
    }
}
