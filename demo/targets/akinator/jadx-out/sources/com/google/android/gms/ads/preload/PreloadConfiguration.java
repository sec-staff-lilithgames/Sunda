package com.google.android.gms.ads.preload;

import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class PreloadConfiguration {
    private final String zza;

    @Deprecated
    private final AdFormat zzb;
    private final AdRequest zzc;
    private final int zzd;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Builder {
        private final String zza;
        private AdFormat zzb;
        private AdRequest zzc = new AdRequest.Builder().build();
        private int zzd;

        public Builder(String str) {
            this.zza = str;
        }

        public PreloadConfiguration build() {
            return new PreloadConfiguration(this, null);
        }

        public Builder setAdRequest(AdRequest adRequest) {
            this.zzc = adRequest;
            return this;
        }

        public Builder setBufferSize(int i10) {
            this.zzd = i10;
            return this;
        }

        public final /* synthetic */ String zza() {
            return this.zza;
        }

        public final /* synthetic */ AdFormat zzb() {
            return this.zzb;
        }

        public final /* synthetic */ AdRequest zzc() {
            return this.zzc;
        }

        public final /* synthetic */ int zzd() {
            return this.zzd;
        }

        @Deprecated
        public Builder(String str, AdFormat adFormat) {
            this.zza = str;
            this.zzb = adFormat;
        }
    }

    public /* synthetic */ PreloadConfiguration(Builder builder, byte[] bArr) {
        this.zza = builder.zza();
        this.zzb = builder.zzb();
        this.zzc = builder.zzc();
        this.zzd = builder.zzd();
    }

    @Deprecated
    public AdFormat getAdFormat() {
        AdFormat adFormat = this.zzb;
        return adFormat == null ? AdFormat.INTERSTITIAL : adFormat;
    }

    public AdRequest getAdRequest() {
        return this.zzc;
    }

    public String getAdUnitId() {
        return this.zza;
    }

    public int getBufferSize() {
        return this.zzd;
    }
}
