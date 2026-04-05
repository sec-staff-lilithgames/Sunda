package com.google.android.gms.ads.admanager;

import android.os.Bundle;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.AdRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class AdManagerAdRequest extends AdRequest {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends AbstractAdRequestBuilder<Builder> {
        public Builder addCategoryExclusion(String str) {
            this.zza.zzm(str);
            return this;
        }

        public AdManagerAdRequest build() {
            return new AdManagerAdRequest(this, null);
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public final /* bridge */ /* synthetic */ AbstractAdRequestBuilder self() {
            return this;
        }

        public Builder setPublisherProvidedId(String str) {
            this.zza.zzi(str);
            return this;
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public Builder self() {
            return this;
        }
    }

    public /* synthetic */ AdManagerAdRequest(Builder builder, byte[] bArr) {
        super(builder);
    }

    @Override // com.google.android.gms.ads.AdRequest
    public Bundle getCustomTargeting() {
        return this.zza.zzk();
    }

    public String getPublisherProvidedId() {
        return this.zza.zzf();
    }
}
