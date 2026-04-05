package com.google.android.gms.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes6.dex */
public interface FusedLocationProviderApi {

    @Deprecated
    public static final String KEY_LOCATION_CHANGED = "com.google.android.location.LOCATION";
    public static final String KEY_MOCK_LOCATION = "mockLocation";

    PendingResult<Status> flushLocations(GoogleApiClient googleApiClient);

    Location getLastLocation(GoogleApiClient googleApiClient);

    LocationAvailability getLocationAvailability(GoogleApiClient googleApiClient);

    PendingResult<Status> removeLocationUpdates(GoogleApiClient googleApiClient, PendingIntent pendingIntent);

    PendingResult<Status> removeLocationUpdates(GoogleApiClient googleApiClient, LocationCallback locationCallback);

    PendingResult<Status> removeLocationUpdates(GoogleApiClient googleApiClient, LocationListener locationListener);

    PendingResult<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, PendingIntent pendingIntent);

    PendingResult<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationCallback locationCallback, Looper looper);

    PendingResult<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener);

    PendingResult<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener, Looper looper);

    PendingResult<Status> setMockLocation(GoogleApiClient googleApiClient, Location location);

    PendingResult<Status> setMockMode(GoogleApiClient googleApiClient, boolean z10);
}
