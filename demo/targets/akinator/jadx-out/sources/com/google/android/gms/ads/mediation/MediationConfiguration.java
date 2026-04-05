package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class MediationConfiguration {
    public static final String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";
    private final AdFormat zza;
    private final Bundle zzb;

    public MediationConfiguration(AdFormat adFormat, Bundle bundle) {
        this.zza = adFormat;
        this.zzb = bundle;
    }

    public AdFormat getFormat() {
        return this.zza;
    }

    public Bundle getServerParameters() {
        return this.zzb;
    }
}
