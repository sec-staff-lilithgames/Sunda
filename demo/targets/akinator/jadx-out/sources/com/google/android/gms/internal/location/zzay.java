package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.LocationSettingsResult;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzay extends zzan {
    private BaseImplementation.ResultHolder<LocationSettingsResult> zza;

    public zzay(BaseImplementation.ResultHolder<LocationSettingsResult> resultHolder) {
        Preconditions.checkArgument(resultHolder != null, "listener can't be null.");
        this.zza = resultHolder;
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zzb(LocationSettingsResult locationSettingsResult) throws RemoteException {
        this.zza.setResult(locationSettingsResult);
        this.zza = null;
    }
}
