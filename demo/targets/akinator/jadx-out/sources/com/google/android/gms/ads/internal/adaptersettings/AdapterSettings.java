package com.google.android.gms.ads.internal.adaptersettings;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzbed;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
class AdapterSettings {
    private static volatile AdapterSettings instance;
    private final zzbed adapterSettingsInternal = zzbd.zzd();

    private boolean getBoolean(String str, boolean z10) {
        return this.adapterSettingsInternal.zzf(str, z10);
    }

    private float getFloat(String str, float f10) {
        return this.adapterSettingsInternal.zze(str, f10);
    }

    public static AdapterSettings getInstance() {
        if (instance == null) {
            synchronized (AdapterSettings.class) {
                try {
                    if (instance == null) {
                        instance = new AdapterSettings();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    private int getInt(String str, int i10) {
        return this.adapterSettingsInternal.zzd(str, i10);
    }

    private long getLong(String str, long j10) {
        return this.adapterSettingsInternal.zzc(str, j10);
    }

    private String getString(String str, String str2) {
        return this.adapterSettingsInternal.zzb(str, str2);
    }
}
