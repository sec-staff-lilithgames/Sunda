package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzek;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class AdRequest {
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_APP_ID_MISSING = 8;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_AD_STRING = 11;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_MEDIATION_NO_FILL = 9;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int ERROR_CODE_REQUEST_ID_MISMATCH = 10;
    public static final int MAX_CONTENT_URL_LENGTH = 512;
    protected final zzek zza;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Builder extends AbstractAdRequestBuilder<Builder> {
        public AdRequest build() {
            return new AdRequest(this);
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public Builder self() {
            return this;
        }
    }

    public AdRequest(AbstractAdRequestBuilder abstractAdRequestBuilder) {
        this.zza = new zzek(abstractAdRequestBuilder.zza, null);
    }

    public String getAdString() {
        return this.zza.zzn();
    }

    public String getContentUrl() {
        return this.zza.zza();
    }

    @Deprecated
    public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.zza.zze(cls);
    }

    public Bundle getCustomTargeting() {
        return this.zza.zzk();
    }

    public Set<String> getKeywords() {
        return this.zza.zzc();
    }

    public List<String> getNeighboringContentUrls() {
        return this.zza.zzb();
    }

    public <T extends MediationExtrasReceiver> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.zza.zzd(cls);
    }

    public long getPlacementId() {
        return this.zza.zzr();
    }

    public String getRequestAgent() {
        return this.zza.zzg();
    }

    public boolean isTestDevice(Context context) {
        return this.zza.zzh(context);
    }

    public final zzek zza() {
        return this.zza;
    }
}
