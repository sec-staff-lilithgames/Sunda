package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mh.p1;
import z.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzko implements zzjv {
    private static final Map zza = new f();
    private final SharedPreferences zzb;
    private SharedPreferences.OnSharedPreferenceChangeListener zzc;
    private volatile Map zze;
    private final Object zzd = new Object();
    private final List zzf = new ArrayList();

    private zzko(SharedPreferences sharedPreferences, Runnable runnable) {
        this.zzb = sharedPreferences;
    }

    public static zzko zza(Context context, String str, Runnable runnable) {
        final zzko zzkoVar;
        SharedPreferences sharedPreferencesZza;
        if (zzjm.zza() && !str.startsWith("direct_boot:") && !zzjm.zzc(context)) {
            return null;
        }
        synchronized (zzko.class) {
            Map map = zza;
            zzkoVar = (zzko) map.get(str);
            if (zzkoVar == null) {
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    if (str.startsWith("direct_boot:")) {
                        if (zzjm.zza()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        sharedPreferencesZza = zzcf.zza(context, str.substring(12), 0, zzcb.zza);
                    } else {
                        sharedPreferencesZza = zzcf.zza(context, str, 0, zzcb.zza);
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    zzkoVar = new zzko(sharedPreferencesZza, runnable);
                    SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.zzkn
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                            this.zza.zzc(sharedPreferences, str2);
                        }
                    };
                    zzkoVar.zzc = onSharedPreferenceChangeListener;
                    zzkoVar.zzb.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    map.put(str, zzkoVar);
                } catch (Throwable th2) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    throw th2;
                }
            }
        }
        return zzkoVar;
    }

    public static synchronized void zzb() {
        try {
            Map map = zza;
            for (zzko zzkoVar : map.values()) {
                zzkoVar.zzb.unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) p1.checkNotNull(zzkoVar.zzc));
            }
            map.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final /* synthetic */ void zzc(SharedPreferences sharedPreferences, String str) {
        synchronized (this.zzd) {
            this.zze = null;
            zzkm.zzc();
        }
        synchronized (this) {
            try {
                Iterator it = this.zzf.iterator();
                while (it.hasNext()) {
                    ((zzjs) it.next()).zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjv
    public final Object zze(String str) {
        Map<String, ?> map = this.zze;
        if (map == null) {
            synchronized (this.zzd) {
                try {
                    map = this.zze;
                    if (map == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all = this.zzb.getAll();
                            this.zze = all;
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = all;
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th2;
                        }
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
