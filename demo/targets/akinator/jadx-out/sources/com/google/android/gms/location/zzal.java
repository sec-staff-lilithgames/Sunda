package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzal extends com.google.android.gms.internal.location.zzah {
    final /* synthetic */ TaskCompletionSource zza;

    public zzal(FusedLocationProviderClient fusedLocationProviderClient, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzb(com.google.android.gms.internal.location.zzaa zzaaVar) throws RemoteException {
        Status status = zzaaVar.getStatus();
        if (status == null) {
            this.zza.trySetException(new ApiException(new Status(8, "Got null status from location service")));
        } else if (status.getStatusCode() == 0) {
            this.zza.setResult(Boolean.TRUE);
        } else {
            this.zza.trySetException(ApiExceptionUtil.fromStatus(status));
        }
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzc() {
    }
}
