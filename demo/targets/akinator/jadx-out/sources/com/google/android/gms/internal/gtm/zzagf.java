package com.google.android.gms.internal.gtm;

import com.ironsource.G9;
import com.ironsource.InterfaceC3129ae;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.bidmachine.protobuf.sdk.ErrorReasonAnalytics;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public enum zzagf implements zzach {
    ST_NOT_SPECIFIED(0),
    ST_NOT_REQUIRED(999),
    ST_PSEUDONYMOUS_ID(1000),
    ST_ZWIEBACK_ID(1001),
    ST_PREF_ID(1002),
    ST_BISCOTTI_ID(IronSourceError.AUCTION_ERROR_DECRYPTION),
    ST_ANALYTICS_ID(1004),
    ST_MANDELBREAD_ID(1005),
    ST_ANDROID_LOGGING_ID2(1006),
    ST_ACSA_ID(1007),
    ST_HERREVAD_ID(1008),
    ST_YOUTUBE_VISITOR_ID(1009),
    ST_CLOUD_RESOURCE_NAME_PSEUDONYMOUS(1010),
    ST_IDENTIFYING_ID(1100),
    ST_EMAIL_ID(1102),
    ST_NAME(1103),
    ST_PHONE_NUMBER(1104),
    ST_GAIA_ID(1105),
    ST_USERNAME(1106),
    ST_GSERVICES_ANDROID_ID(1107),
    ST_ARES_ID(1108),
    ST_MEDICAL_RECORD_NUMBER(1109),
    ST_PAYMENTS_RISK_DATA(1110),
    ST_CLOUD_PROJECT_ID(1111),
    ST_CLOUD_PRINCIPAL_ID(1112),
    ST_FITBIT_ID(1113),
    ST_DUSI_ID(1114),
    ST_CLOUD_RESOURCE_NAME(1119),
    ST_GOOGLE_OBJECT_ID(12031),
    ST_FIFE_URL(1115),
    ST_BLOBSTORE_ID(1117),
    ST_WORKSPACE_OBJECT_ID(12001),
    ST_SYSTEM_RESOURCE_IDENTIFIER(12015),
    ST_BIGSTORE_PATH(1116),
    ST_GOOGLE_FILE_PATH(1118),
    zzJ(InterfaceC3129ae.c.f35991d),
    ST_GOVERNMENT_ID_NUMBER(InterfaceC3129ae.a.f35977b),
    ST_HEALTHCARE_INFO(InterfaceC3129ae.a.f35982g),
    ST_SENSITIVE_BACKGROUND_INFO(1204),
    ST_RACE_ETHNICITY(1205),
    ST_POLITICAL_BELIEFS(InterfaceC3129ae.a.f35980e),
    ST_RELIGIOUS_BELIEFS(1207),
    ST_GENDER_IDENTITY(1208),
    ST_AGE(1209),
    ST_CARDHOLDER_DATA(InterfaceC3129ae.a.f35978c),
    ST_CHD_PAN(InterfaceC3129ae.a.f35986k),
    ST_CHD_INFO(1212),
    ST_PAYMENTS_INFO(1220),
    ST_CRITICAL_PAYMENT_INFO(1221),
    ST_PAYMENT_ID(1222),
    ST_LIMITED_USE_PAYMENTS_INFO(1223),
    ST_PAYMENTS_INFERRED_REAL_IDENTITY(1224),
    ST_PAYMENTS_TRANSACTION_INFO(1240),
    ST_NETWORK_ENDPOINT(1300),
    ST_IP_ADDRESS(InterfaceC3129ae.c.f35992e),
    ST_CHIME_REPRESENTATIVE_TARGET_ID(1302),
    ST_HARDWARE_INFO(1402),
    ST_HARDWARE_ID(1400),
    ST_ANDROID_LOGGING_ID(1401),
    ST_SOFTWARE_ID(1500),
    ST_USER_AGENT(1501),
    ST_CLIENT_TAG(1502),
    ST_ANONYMOUS_DATA(1600),
    ST_DEMOGRAPHIC_INFO(1601),
    ST_LOCATION(1700),
    ST_PRECISE_LOCATION(1701),
    ST_COARSE_LOCATION(1702),
    ST_GOOGLE_RELATIONSHIP_ID(1800),
    ST_CUSTOMER_ID(1801),
    ST_PARTNER_ID(1802),
    ST_PUBLISHER_ID(1803),
    ST_RTB_CUSTOMER_DATA(1804),
    ST_CLOUD_PROJECT_NUMBER(1805),
    ST_CLOUD_FOLDER_ID(1806),
    ST_USER_CONTENT(1900),
    ST_USER_QUERY(1901),
    ST_AUDIO(1902),
    ST_MUSIC(1903),
    ST_TEXT_TO_SPEECH(1904),
    ST_USER_SECURITY_CONFIGURATION(1905),
    ST_USER_CONFIGURATION(1906),
    ST_UNSTRUCTURED_ADMIN_SETTING(12003),
    ST_STRUCTURED_ADMIN_SETTING(12024),
    ST_UNSTRUCTURED_USER_SETTING(12004),
    ST_STRUCTURED_USER_SETTING(12012),
    ST_USER_DEFINED_ATTRIBUTE(1907),
    ST_USER_LABEL(12005),
    ST_PERSONAL_DATA(2400),
    ST_USER_CORE_CONTENT(1908),
    ST_DOCUMENT_CONTENT(1911),
    ST_EMAIL_CONTENT(2402),
    ST_CALENDAR_CONTENT(2403),
    ST_CONTACT_CONTENT(2404),
    ST_USER_MESSAGE(2405),
    ST_TITLE(12030),
    ST_USER_GROUP_NAME(12036),
    ST_CREDIT_INFO(2401),
    ST_BODY_SENSOR_DATA(2406),
    ST_VOICE(2407),
    ST_SMART_HOME(2408),
    ST_USER_IMAGE(1909),
    ST_USER_IMAGE_REF(1910),
    ST_CONTENT_SUMMARY(12034),
    ST_THIRD_PARTY_DATA(2000),
    ST_TIMESTAMP(2100),
    ST_SENSITIVE_TIMESTAMP(ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_MONITOR_NO_CONTENT_VALUE),
    ST_CALENDAR_EVENT_TIMESTAMP(12035),
    zzbd(12025),
    ST_SESSION_ID(G9.b.f34493g),
    ST_EXPERIMENT_ID(2301),
    ST_AVOCADO_ID(2500),
    ST_SECURITY_MATERIAL(2600),
    ST_SECURITY_KEY(2601),
    ST_ACCOUNT_CREDENTIAL(2602),
    ST_PAYMENTS_PCI_SAD(2603),
    ST_CLOUD_IAM_PARENT(2701),
    ST_CLOUD_IAM_ROLE_ID(2702),
    ST_CLOUD_IAM_ROLE_NAME(2703),
    ST_CLOUD_IAM_PERMISSION(2704),
    ST_GOOGLE_OPERATIONAL_DATA(2800),
    ST_SYSTEM_DIAGNOSTIC_INFO(12017),
    ST_GOOGLE_OPERATIONAL_METRICS(2801),
    ST_GOOGLE_GENERATED_USER_METADATA(2901),
    ST_GOOGLE_GENERATED_USER_CONTENT_METADATA(2902),
    ST_GOOGLE_GENERATED_USER_CONTENT(2903),
    ST_FRAUD_ABUSE_INFO(2904),
    ST_SYSTEM_CONFIGURATION(12028),
    ST_GOOGLE_OBJECT_INFO(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED),
    ST_GOOGLE_OBJECT_VERSION(12016),
    ST_WORKSPACE_OBJECT_INFO(12033),
    ST_WORKSPACE_OBJECT_CONTENT_REFERENCE(12032),
    ST_METRICS(3100),
    ST_PER_USER_METRICS(12009),
    ST_CROSS_USER_METRICS(12010),
    ST_PER_CUSTOMER_METRICS(12038),
    ST_ACCESS_LEVEL(12023),
    ST_USER_ACTION(12008),
    ST_STRUCTURED_REQUEST_PARAMETER(12027),
    ST_CONTENT_DEPENDENT(9900),
    ST_DEBUG_INFO(9901),
    ST_KEY_VALUE_PAIR(9902),
    ST_KEY(9903),
    ST_VALUE(9904),
    ST_REFERER_URL(9905);

    private static final zzaci zzbO = new zzaci() { // from class: com.google.android.gms.internal.gtm.zzagd
        @Override // com.google.android.gms.internal.gtm.zzaci
        public final /* synthetic */ zzach zza(int i10) {
            return zzagf.zzc(i10);
        }
    };
    private final int zzbQ;

    zzagf(int i10) {
        this.zzbQ = i10;
    }

    public static zzaci zzb() {
        return zzbO;
    }

    public static zzagf zzc(int i10) {
        if (i10 != 0) {
            if (i10 == 1211) {
                return ST_CHD_PAN;
            }
            if (i10 == 1212) {
                return ST_CHD_INFO;
            }
            if (i10 == 1600) {
                return ST_ANONYMOUS_DATA;
            }
            if (i10 == 1601) {
                return ST_DEMOGRAPHIC_INFO;
            }
            switch (i10) {
                case 0:
                    break;
                case 1100:
                    return ST_IDENTIFYING_ID;
                case 1102:
                    return ST_EMAIL_ID;
                case 1103:
                    return ST_NAME;
                case 1104:
                    return ST_PHONE_NUMBER;
                case 1105:
                    return ST_GAIA_ID;
                case 1106:
                    return ST_USERNAME;
                case 1107:
                    return ST_GSERVICES_ANDROID_ID;
                case 1108:
                    return ST_ARES_ID;
                case 1109:
                    return ST_MEDICAL_RECORD_NUMBER;
                case 1110:
                    return ST_PAYMENTS_RISK_DATA;
                case 1111:
                    return ST_CLOUD_PROJECT_ID;
                case 1112:
                    return ST_CLOUD_PRINCIPAL_ID;
                case 1113:
                    return ST_FITBIT_ID;
                case 1114:
                    return ST_DUSI_ID;
                case 1115:
                    return ST_FIFE_URL;
                case 1116:
                    return ST_BIGSTORE_PATH;
                case 1117:
                    return ST_BLOBSTORE_ID;
                case 1118:
                    return ST_GOOGLE_FILE_PATH;
                case 1119:
                    return ST_CLOUD_RESOURCE_NAME;
                case 1240:
                    return ST_PAYMENTS_TRANSACTION_INFO;
                case 1800:
                    return ST_GOOGLE_RELATIONSHIP_ID;
                case 1801:
                    return ST_CUSTOMER_ID;
                case 1802:
                    return ST_PARTNER_ID;
                case 1803:
                    return ST_PUBLISHER_ID;
                case 1804:
                    return ST_RTB_CUSTOMER_DATA;
                case 1805:
                    return ST_CLOUD_PROJECT_NUMBER;
                case 1806:
                    return ST_CLOUD_FOLDER_ID;
                case 1900:
                    return ST_USER_CONTENT;
                case 1901:
                    return ST_USER_QUERY;
                case 1902:
                    return ST_AUDIO;
                case 1903:
                    return ST_MUSIC;
                case 1904:
                    return ST_TEXT_TO_SPEECH;
                case 1905:
                    return ST_USER_SECURITY_CONFIGURATION;
                case 1906:
                    return ST_USER_CONFIGURATION;
                case 1907:
                    return ST_USER_DEFINED_ATTRIBUTE;
                case 1908:
                    return ST_USER_CORE_CONTENT;
                case 1909:
                    return ST_USER_IMAGE;
                case 1910:
                    return ST_USER_IMAGE_REF;
                case 1911:
                    return ST_DOCUMENT_CONTENT;
                case 2000:
                    return ST_THIRD_PARTY_DATA;
                case 2100:
                    return ST_TIMESTAMP;
                case ERROR_REASON_ANALYTICS_MONITOR_NO_CONTENT_VALUE:
                    return ST_SENSITIVE_TIMESTAMP;
                case G9.b.f34493g /* 2300 */:
                    return ST_SESSION_ID;
                case 2301:
                    return ST_EXPERIMENT_ID;
                case 2400:
                    return ST_PERSONAL_DATA;
                case 2401:
                    return ST_CREDIT_INFO;
                case 2402:
                    return ST_EMAIL_CONTENT;
                case 2403:
                    return ST_CALENDAR_CONTENT;
                case 2404:
                    return ST_CONTACT_CONTENT;
                case 2405:
                    return ST_USER_MESSAGE;
                case 2406:
                    return ST_BODY_SENSOR_DATA;
                case 2407:
                    return ST_VOICE;
                case 2408:
                    return ST_SMART_HOME;
                case 2500:
                    return ST_AVOCADO_ID;
                case 2600:
                    return ST_SECURITY_MATERIAL;
                case 2601:
                    return ST_SECURITY_KEY;
                case 2602:
                    return ST_ACCOUNT_CREDENTIAL;
                case 2603:
                    return ST_PAYMENTS_PCI_SAD;
                case 2701:
                    return ST_CLOUD_IAM_PARENT;
                case 2702:
                    return ST_CLOUD_IAM_ROLE_ID;
                case 2703:
                    return ST_CLOUD_IAM_ROLE_NAME;
                case 2704:
                    return ST_CLOUD_IAM_PERMISSION;
                case 2800:
                    return ST_GOOGLE_OPERATIONAL_DATA;
                case 2801:
                    return ST_GOOGLE_OPERATIONAL_METRICS;
                case 2901:
                    return ST_GOOGLE_GENERATED_USER_METADATA;
                case 2902:
                    return ST_GOOGLE_GENERATED_USER_CONTENT_METADATA;
                case 2903:
                    return ST_GOOGLE_GENERATED_USER_CONTENT;
                case 2904:
                    return ST_FRAUD_ABUSE_INFO;
                case IronSourceError.ERROR_CAPPING_VALIDATION_FAILED /* 3000 */:
                    return ST_GOOGLE_OBJECT_INFO;
                case 3100:
                    return ST_METRICS;
                case 9900:
                    return ST_CONTENT_DEPENDENT;
                case 9901:
                    return ST_DEBUG_INFO;
                case 9902:
                    return ST_KEY_VALUE_PAIR;
                case 9903:
                    return ST_KEY;
                case 9904:
                    return ST_VALUE;
                case 9905:
                    return ST_REFERER_URL;
                case 12001:
                    return ST_WORKSPACE_OBJECT_ID;
                case 12003:
                    return ST_UNSTRUCTURED_ADMIN_SETTING;
                case 12004:
                    return ST_UNSTRUCTURED_USER_SETTING;
                case 12005:
                    return ST_USER_LABEL;
                case 12008:
                    return ST_USER_ACTION;
                case 12009:
                    return ST_PER_USER_METRICS;
                case 12010:
                    return ST_CROSS_USER_METRICS;
                case 12012:
                    return ST_STRUCTURED_USER_SETTING;
                case 12015:
                    return ST_SYSTEM_RESOURCE_IDENTIFIER;
                case 12016:
                    return ST_GOOGLE_OBJECT_VERSION;
                case 12017:
                    return ST_SYSTEM_DIAGNOSTIC_INFO;
                case 12023:
                    return ST_ACCESS_LEVEL;
                case 12024:
                    return ST_STRUCTURED_ADMIN_SETTING;
                case 12025:
                    return zzbd;
                case 12027:
                    return ST_STRUCTURED_REQUEST_PARAMETER;
                case 12028:
                    return ST_SYSTEM_CONFIGURATION;
                case 12030:
                    return ST_TITLE;
                case 12031:
                    return ST_GOOGLE_OBJECT_ID;
                case 12032:
                    return ST_WORKSPACE_OBJECT_CONTENT_REFERENCE;
                case 12033:
                    return ST_WORKSPACE_OBJECT_INFO;
                case 12034:
                    return ST_CONTENT_SUMMARY;
                case 12035:
                    return ST_CALENDAR_EVENT_TIMESTAMP;
                case 12036:
                    return ST_USER_GROUP_NAME;
                case 12038:
                    return ST_PER_CUSTOMER_METRICS;
                default:
                    switch (i10) {
                        case 999:
                            return ST_NOT_REQUIRED;
                        case 1000:
                            return ST_PSEUDONYMOUS_ID;
                        case 1001:
                            return ST_ZWIEBACK_ID;
                        case 1002:
                            return ST_PREF_ID;
                        case IronSourceError.AUCTION_ERROR_DECRYPTION /* 1003 */:
                            return ST_BISCOTTI_ID;
                        case 1004:
                            return ST_ANALYTICS_ID;
                        case 1005:
                            return ST_MANDELBREAD_ID;
                        case 1006:
                            return ST_ANDROID_LOGGING_ID2;
                        case 1007:
                            return ST_ACSA_ID;
                        case 1008:
                            return ST_HERREVAD_ID;
                        case 1009:
                            return ST_YOUTUBE_VISITOR_ID;
                        case 1010:
                            return ST_CLOUD_RESOURCE_NAME_PSEUDONYMOUS;
                        default:
                            switch (i10) {
                                case InterfaceC3129ae.c.f35991d /* 1200 */:
                                    return zzJ;
                                case InterfaceC3129ae.a.f35977b /* 1201 */:
                                    return ST_GOVERNMENT_ID_NUMBER;
                                case InterfaceC3129ae.a.f35978c /* 1202 */:
                                    return ST_CARDHOLDER_DATA;
                                case InterfaceC3129ae.a.f35982g /* 1203 */:
                                    return ST_HEALTHCARE_INFO;
                                case 1204:
                                    return ST_SENSITIVE_BACKGROUND_INFO;
                                case 1205:
                                    return ST_RACE_ETHNICITY;
                                case InterfaceC3129ae.a.f35980e /* 1206 */:
                                    return ST_POLITICAL_BELIEFS;
                                case 1207:
                                    return ST_RELIGIOUS_BELIEFS;
                                case 1208:
                                    return ST_GENDER_IDENTITY;
                                case 1209:
                                    return ST_AGE;
                                default:
                                    switch (i10) {
                                        case 1220:
                                            return ST_PAYMENTS_INFO;
                                        case 1221:
                                            return ST_CRITICAL_PAYMENT_INFO;
                                        case 1222:
                                            return ST_PAYMENT_ID;
                                        case 1223:
                                            return ST_LIMITED_USE_PAYMENTS_INFO;
                                        case 1224:
                                            return ST_PAYMENTS_INFERRED_REAL_IDENTITY;
                                        default:
                                            switch (i10) {
                                                case 1300:
                                                    return ST_NETWORK_ENDPOINT;
                                                case InterfaceC3129ae.c.f35992e /* 1301 */:
                                                    return ST_IP_ADDRESS;
                                                case 1302:
                                                    return ST_CHIME_REPRESENTATIVE_TARGET_ID;
                                                default:
                                                    switch (i10) {
                                                        case 1400:
                                                            return ST_HARDWARE_ID;
                                                        case 1401:
                                                            return ST_ANDROID_LOGGING_ID;
                                                        case 1402:
                                                            return ST_HARDWARE_INFO;
                                                        default:
                                                            switch (i10) {
                                                                case 1500:
                                                                    return ST_SOFTWARE_ID;
                                                                case 1501:
                                                                    return ST_USER_AGENT;
                                                                case 1502:
                                                                    return ST_CLIENT_TAG;
                                                                default:
                                                                    switch (i10) {
                                                                        case 1700:
                                                                            return ST_LOCATION;
                                                                        case 1701:
                                                                            return ST_PRECISE_LOCATION;
                                                                        case 1702:
                                                                            return ST_COARSE_LOCATION;
                                                                        default:
                                                                            return null;
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
        return ST_NOT_SPECIFIED;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzbQ);
    }

    @Override // com.google.android.gms.internal.gtm.zzach
    public final int zza() {
        return this.zzbQ;
    }
}
