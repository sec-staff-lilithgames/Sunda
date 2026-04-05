package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public enum zzin implements zzmj {
    CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN(0),
    CLIENT_UPLOAD_ELIGIBLE(1),
    MEASUREMENT_SERVICE_NOT_ENABLED(2),
    ANDROID_TOO_OLD(3),
    NON_PLAY_MODE(4),
    SDK_TOO_OLD(5),
    MISSING_JOB_SCHEDULER(6),
    NOT_ENABLED_IN_MANIFEST(7),
    CLIENT_FLAG_OFF(8),
    SERVICE_FLAG_OFF(20),
    PINNED_TO_SERVICE_UPLOAD(21),
    MISSING_SGTM_SERVER_URL(22);

    private final int zzm;

    zzin(int i10) {
        this.zzm = i10;
    }

    public static zzin zzb(int i10) {
        switch (i10) {
            case 0:
                return CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN;
            case 1:
                return CLIENT_UPLOAD_ELIGIBLE;
            case 2:
                return MEASUREMENT_SERVICE_NOT_ENABLED;
            case 3:
                return ANDROID_TOO_OLD;
            case 4:
                return NON_PLAY_MODE;
            case 5:
                return SDK_TOO_OLD;
            case 6:
                return MISSING_JOB_SCHEDULER;
            case 7:
                return NOT_ENABLED_IN_MANIFEST;
            case 8:
                return CLIENT_FLAG_OFF;
            default:
                switch (i10) {
                    case 20:
                        return SERVICE_FLAG_OFF;
                    case 21:
                        return PINNED_TO_SERVICE_UPLOAD;
                    case 22:
                        return MISSING_SGTM_SERVER_URL;
                    default:
                        return null;
                }
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzm);
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final int zza() {
        return this.zzm;
    }
}
