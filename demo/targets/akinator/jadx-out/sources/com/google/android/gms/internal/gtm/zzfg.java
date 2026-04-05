package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfg extends zzbr {
    protected String zza;
    protected String zzb;
    protected boolean zzc;
    protected int zzd;
    protected boolean zze;
    protected boolean zzf;

    public zzfg(zzbu zzbuVar) {
        super(zzbuVar);
    }

    public final String zza() {
        zzV();
        return this.zzb;
    }

    public final String zzb() {
        zzV();
        return this.zza;
    }

    public final boolean zzc() {
        zzV();
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.gtm.zzbr
    public final void zzd() throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo;
        int i10;
        Context contextZzo = zzo();
        try {
            applicationInfo = contextZzo.getPackageManager().getApplicationInfo(contextZzo.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e10) {
            zzR("PackageManager doesn't know about the app package", e10);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            zzQ("Couldn't get ApplicationInfo to load global config");
            return;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle == null || (i10 = bundle.getInt("com.google.android.gms.analytics.globalConfigResource")) <= 0) {
            return;
        }
        zzbu zzbuVarZzt = zzt();
        zzej zzejVar = (zzej) new zzcr(zzbuVarZzt, new zzei(zzbuVarZzt)).zza(i10);
        if (zzejVar != null) {
            zzN("Loading global XML config values");
            String str = zzejVar.zza;
            if (str != null) {
                this.zzb = str;
                zzF("XML config - app name", str);
            }
            String str2 = zzejVar.zzb;
            if (str2 != null) {
                this.zza = str2;
                zzF("XML config - app version", str2);
            }
            String str3 = zzejVar.zzc;
            if (str3 != null) {
                String lowerCase = str3.toLowerCase(Locale.US);
                int i11 = "verbose".equals(lowerCase) ? 0 : "info".equals(lowerCase) ? 1 : "warning".equals(lowerCase) ? 2 : "error".equals(lowerCase) ? 3 : -1;
                if (i11 >= 0) {
                    zzO("XML config - log level", Integer.valueOf(i11));
                }
            }
            int i12 = zzejVar.zzd;
            if (i12 >= 0) {
                this.zzd = i12;
                this.zzc = true;
                zzF("XML config - dispatch period (sec)", Integer.valueOf(i12));
            }
            int i13 = zzejVar.zze;
            if (i13 != -1) {
                boolean z10 = 1 == i13;
                this.zzf = z10;
                this.zze = true;
                zzF("XML config - dry run", Boolean.valueOf(z10));
            }
        }
    }

    public final boolean zze() {
        zzV();
        return this.zze;
    }

    public final boolean zzf() {
        zzV();
        return false;
    }
}
