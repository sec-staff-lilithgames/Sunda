package com.bytedance.sdk.openadsdk.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface PAGConstant {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Retention(RetentionPolicy.CLASS)
    public @interface PAGGDPRConsentType {
        public static final int PAG_GDPR_CONSENT_TYPE_CONSENT = 1;
        public static final int PAG_GDPR_CONSENT_TYPE_DEFAULT = -1;
        public static final int PAG_GDPR_CONSENT_TYPE_NO_CONSENT = 0;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Retention(RetentionPolicy.CLASS)
    public @interface PAGPAConsentType {
        public static final int PAG_PA_CONSENT_TYPE_CONSENT = 1;
        public static final int PAG_PA_CONSENT_TYPE_NO_CONSENT = 0;
    }
}
