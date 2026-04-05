package com.google.android.ump;

import android.app.Activity;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public interface ConsentInformation {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ConsentStatus {
        public static final int NOT_REQUIRED = 1;
        public static final int OBTAINED = 3;
        public static final int REQUIRED = 2;
        public static final int UNKNOWN = 0;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface OnConsentInfoUpdateFailureListener {
        void onConsentInfoUpdateFailure(FormError formError);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface OnConsentInfoUpdateSuccessListener {
        void onConsentInfoUpdateSuccess();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class PrivacyOptionsRequirementStatus {
        public static final PrivacyOptionsRequirementStatus NOT_REQUIRED;
        public static final PrivacyOptionsRequirementStatus REQUIRED;
        public static final PrivacyOptionsRequirementStatus UNKNOWN;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ PrivacyOptionsRequirementStatus[] f29636b;

        static {
            PrivacyOptionsRequirementStatus privacyOptionsRequirementStatus = new PrivacyOptionsRequirementStatus("UNKNOWN", 0);
            UNKNOWN = privacyOptionsRequirementStatus;
            PrivacyOptionsRequirementStatus privacyOptionsRequirementStatus2 = new PrivacyOptionsRequirementStatus("NOT_REQUIRED", 1);
            NOT_REQUIRED = privacyOptionsRequirementStatus2;
            PrivacyOptionsRequirementStatus privacyOptionsRequirementStatus3 = new PrivacyOptionsRequirementStatus("REQUIRED", 2);
            REQUIRED = privacyOptionsRequirementStatus3;
            f29636b = new PrivacyOptionsRequirementStatus[]{privacyOptionsRequirementStatus, privacyOptionsRequirementStatus2, privacyOptionsRequirementStatus3};
        }

        public static PrivacyOptionsRequirementStatus valueOf(String str) {
            return (PrivacyOptionsRequirementStatus) Enum.valueOf(PrivacyOptionsRequirementStatus.class, str);
        }

        public static PrivacyOptionsRequirementStatus[] values() {
            return (PrivacyOptionsRequirementStatus[]) f29636b.clone();
        }
    }

    boolean canRequestAds();

    int getConsentStatus();

    PrivacyOptionsRequirementStatus getPrivacyOptionsRequirementStatus();

    boolean isConsentFormAvailable();

    void requestConsentInfoUpdate(Activity activity, ConsentRequestParameters consentRequestParameters, OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener);

    void reset();
}
