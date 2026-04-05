package com.google.android.gms.location;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes6.dex */
public final class LocationStatusCodes {
    public static final int ERROR = 1;
    public static final int GEOFENCE_NOT_AVAILABLE = 1000;
    public static final int GEOFENCE_TOO_MANY_GEOFENCES = 1001;
    public static final int GEOFENCE_TOO_MANY_PENDING_INTENTS = 1002;
    public static final int SUCCESS = 0;

    private LocationStatusCodes() {
    }

    public static int zza(int i10) {
        if ((i10 < 0 || i10 > 1) && (i10 < 1000 || i10 >= 1006)) {
            return 1;
        }
        return i10;
    }

    public static Status zzb(int i10) {
        if (i10 == 1) {
            i10 = 13;
        }
        return new Status(i10);
    }
}
