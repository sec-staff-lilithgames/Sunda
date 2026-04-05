package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.internal.OptionalPendingResultImpl;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class PendingResults {
    private PendingResults() {
    }

    public static PendingResult<Status> canceledPendingResult() {
        StatusPendingResult statusPendingResult = new StatusPendingResult(Looper.getMainLooper());
        statusPendingResult.cancel();
        return statusPendingResult;
    }

    public static <R extends Result> PendingResult<R> immediateFailedResult(R r10, GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(r10, "Result must not be null");
        Preconditions.checkArgument(!r10.getStatus().isSuccess(), "Status code must not be SUCCESS");
        zag zagVar = new zag(googleApiClient, r10);
        zagVar.setResult(r10);
        return zagVar;
    }

    public static <R extends Result> OptionalPendingResult<R> immediatePendingResult(R r10) {
        Preconditions.checkNotNull(r10, "Result must not be null");
        zah zahVar = new zah(null);
        zahVar.setResult(r10);
        return new OptionalPendingResultImpl(zahVar);
    }

    public static <R extends Result> PendingResult<R> canceledPendingResult(R r10) {
        Preconditions.checkNotNull(r10, "Result must not be null");
        Preconditions.checkArgument(r10.getStatus().getStatusCode() == 16, "Status code must be CommonStatusCodes.CANCELED");
        zaf zafVar = new zaf(r10);
        zafVar.cancel();
        return zafVar;
    }

    public static <R extends Result> OptionalPendingResult<R> immediatePendingResult(R r10, GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(r10, "Result must not be null");
        zah zahVar = new zah(googleApiClient);
        zahVar.setResult(r10);
        return new OptionalPendingResultImpl(zahVar);
    }

    public static PendingResult<Status> immediatePendingResult(Status status) {
        Preconditions.checkNotNull(status, "Result must not be null");
        StatusPendingResult statusPendingResult = new StatusPendingResult(Looper.getMainLooper());
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }

    public static PendingResult<Status> immediatePendingResult(Status status, GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(status, "Result must not be null");
        StatusPendingResult statusPendingResult = new StatusPendingResult(googleApiClient);
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }
}
