package com.google.android.gms.location;

import com.google.android.gms.common.api.Response;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class LocationSettingsResponse extends Response<LocationSettingsResult> {
    public LocationSettingsResponse() {
    }

    public LocationSettingsStates getLocationSettingsStates() {
        return getResult().getLocationSettingsStates();
    }

    public LocationSettingsResponse(LocationSettingsResult locationSettingsResult) {
        super(locationSettingsResult);
    }
}
