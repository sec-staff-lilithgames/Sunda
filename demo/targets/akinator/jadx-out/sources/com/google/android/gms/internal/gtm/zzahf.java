package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public enum zzahf implements zzach {
    LOGSID_NONE(0),
    LOGSID_IP_ADDRESS(1),
    LOGSID_IP_ADDRESS_INTERNAL(2),
    LOGSID_USER_AGENT(3),
    LOGSID_SENSITIVE_TIMESTAMP(4),
    LOGSID_SENSITIVE_LOCATION(5),
    LOGSID_APPROXIMATE_LOCATION(15),
    LOGSID_COARSE_LOCATION(6),
    LOGSID_OTHER_LOCATION(9),
    LOGSID_OTHER_VERSION_ID(7),
    LOGSID_REFERER(8),
    LOGSID_THIRD_PARTY_PARAMETERS(16),
    LOGSID_OTHER_PSEUDONYMOUS_ID(10),
    LOGSID_PREF(11),
    LOGSID_ZWIEBACK(12),
    LOGSID_BISCOTTI(13),
    LOGSID_CUSTOM_SESSION_ID(14),
    LOGSID_OTHER_PERSONAL_ID(20),
    LOGSID_GAIA_ID(21),
    LOGSID_EMAIL(22),
    LOGSID_USERNAME(23),
    LOGSID_PHONE_NUMBER(24),
    LOGSID_GAIA_ID_PUBLIC(207),
    LOGSID_OTHER_AUTHENTICATED_ID(30),
    LOGSID_OTHER_UNAUTHENTICATED_ID(31),
    LOGSID_PARTNER_OR_CUSTOMER_ID(32),
    LOGSID_PUBLISHER_ID(35),
    LOGSID_DASHER_ID(33),
    LOGSID_FOCUS_GROUP_ID(34),
    LOGSID_OTHER_MOBILE_DEVICE_ID(50),
    LOGSID_GSERVICES_ANDROID_ID(51),
    LOGSID_HARDWARE_ID(52),
    LOGSID_MSISDN_ID(53),
    LOGSID_BUILD_SERIAL_ID(54),
    LOGSID_UDID_ID(55),
    LOGSID_ANDROID_LOGGING_ID(56),
    LOGSID_SECURE_SETTINGS_ANDROID_ID(57),
    LOGSID_OTHER_IDENTIFYING_USER_INFO(100),
    LOGSID_USER_INPUT(200),
    LOGSID_DEMOGRAPHIC_INFO(201),
    LOGSID_GENERIC_KEY(202),
    LOGSID_GENERIC_VALUE(203),
    LOGSID_COOKIE(204),
    LOGSID_URL(205),
    LOGSID_HTTPHEADER(206);

    private static final zzaci zzT = new zzaci() { // from class: com.google.android.gms.internal.gtm.zzahe
        @Override // com.google.android.gms.internal.gtm.zzaci
        public final /* synthetic */ zzach zza(int i10) {
            if (i10 == 100) {
                return zzahf.LOGSID_OTHER_IDENTIFYING_USER_INFO;
            }
            switch (i10) {
                case 0:
                    return zzahf.LOGSID_NONE;
                case 1:
                    return zzahf.LOGSID_IP_ADDRESS;
                case 2:
                    return zzahf.LOGSID_IP_ADDRESS_INTERNAL;
                case 3:
                    return zzahf.LOGSID_USER_AGENT;
                case 4:
                    return zzahf.LOGSID_SENSITIVE_TIMESTAMP;
                case 5:
                    return zzahf.LOGSID_SENSITIVE_LOCATION;
                case 6:
                    return zzahf.LOGSID_COARSE_LOCATION;
                case 7:
                    return zzahf.LOGSID_OTHER_VERSION_ID;
                case 8:
                    return zzahf.LOGSID_REFERER;
                case 9:
                    return zzahf.LOGSID_OTHER_LOCATION;
                case 10:
                    return zzahf.LOGSID_OTHER_PSEUDONYMOUS_ID;
                case 11:
                    return zzahf.LOGSID_PREF;
                case 12:
                    return zzahf.LOGSID_ZWIEBACK;
                case 13:
                    return zzahf.LOGSID_BISCOTTI;
                case 14:
                    return zzahf.LOGSID_CUSTOM_SESSION_ID;
                case 15:
                    return zzahf.LOGSID_APPROXIMATE_LOCATION;
                case 16:
                    return zzahf.LOGSID_THIRD_PARTY_PARAMETERS;
                default:
                    switch (i10) {
                        case 20:
                            return zzahf.LOGSID_OTHER_PERSONAL_ID;
                        case 21:
                            return zzahf.LOGSID_GAIA_ID;
                        case 22:
                            return zzahf.LOGSID_EMAIL;
                        case 23:
                            return zzahf.LOGSID_USERNAME;
                        case 24:
                            return zzahf.LOGSID_PHONE_NUMBER;
                        default:
                            switch (i10) {
                                case 30:
                                    return zzahf.LOGSID_OTHER_AUTHENTICATED_ID;
                                case 31:
                                    return zzahf.LOGSID_OTHER_UNAUTHENTICATED_ID;
                                case 32:
                                    return zzahf.LOGSID_PARTNER_OR_CUSTOMER_ID;
                                case 33:
                                    return zzahf.LOGSID_DASHER_ID;
                                case 34:
                                    return zzahf.LOGSID_FOCUS_GROUP_ID;
                                case 35:
                                    return zzahf.LOGSID_PUBLISHER_ID;
                                default:
                                    switch (i10) {
                                        case 50:
                                            return zzahf.LOGSID_OTHER_MOBILE_DEVICE_ID;
                                        case 51:
                                            return zzahf.LOGSID_GSERVICES_ANDROID_ID;
                                        case 52:
                                            return zzahf.LOGSID_HARDWARE_ID;
                                        case 53:
                                            return zzahf.LOGSID_MSISDN_ID;
                                        case 54:
                                            return zzahf.LOGSID_BUILD_SERIAL_ID;
                                        case 55:
                                            return zzahf.LOGSID_UDID_ID;
                                        case 56:
                                            return zzahf.LOGSID_ANDROID_LOGGING_ID;
                                        case 57:
                                            return zzahf.LOGSID_SECURE_SETTINGS_ANDROID_ID;
                                        default:
                                            switch (i10) {
                                                case 200:
                                                    return zzahf.LOGSID_USER_INPUT;
                                                case 201:
                                                    return zzahf.LOGSID_DEMOGRAPHIC_INFO;
                                                case 202:
                                                    return zzahf.LOGSID_GENERIC_KEY;
                                                case 203:
                                                    return zzahf.LOGSID_GENERIC_VALUE;
                                                case 204:
                                                    return zzahf.LOGSID_COOKIE;
                                                case 205:
                                                    return zzahf.LOGSID_URL;
                                                case 206:
                                                    return zzahf.LOGSID_HTTPHEADER;
                                                case 207:
                                                    return zzahf.LOGSID_GAIA_ID_PUBLIC;
                                                default:
                                                    return null;
                                            }
                                    }
                            }
                    }
            }
        }
    };
    private final int zzV;

    zzahf(int i10) {
        this.zzV = i10;
    }

    public static zzaci zzb() {
        return zzT;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzV);
    }

    @Override // com.google.android.gms.internal.gtm.zzach
    public final int zza() {
        return this.zzV;
    }
}
