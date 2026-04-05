package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.ActivityRecognitionApi;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzg implements ActivityRecognitionApi {
    @Override // com.google.android.gms.location.ActivityRecognitionApi
    public final PendingResult<Status> removeActivityUpdates(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        return googleApiClient.execute(new zze(this, googleApiClient, pendingIntent));
    }

    @Override // com.google.android.gms.location.ActivityRecognitionApi
    public final PendingResult<Status> requestActivityUpdates(GoogleApiClient googleApiClient, long j10, PendingIntent pendingIntent) {
        return googleApiClient.execute(new zzd(this, googleApiClient, j10, pendingIntent));
    }
}
