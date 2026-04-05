package com.google.android.gms.ads.rewarded;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class ServerSideVerificationOptions {
    private final String zza;
    private final String zzb;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {
        private String zza = "";
        private String zzb = "";

        public ServerSideVerificationOptions build() {
            return new ServerSideVerificationOptions(this, null);
        }

        public Builder setCustomData(String str) {
            this.zzb = str;
            return this;
        }

        public Builder setUserId(String str) {
            this.zza = str;
            return this;
        }

        public final /* synthetic */ String zza() {
            return this.zza;
        }

        public final /* synthetic */ String zzb() {
            return this.zzb;
        }
    }

    public /* synthetic */ ServerSideVerificationOptions(Builder builder, byte[] bArr) {
        this.zza = builder.zza();
        this.zzb = builder.zzb();
    }

    public String getCustomData() {
        return this.zzb;
    }

    public String getUserId() {
        return this.zza;
    }
}
