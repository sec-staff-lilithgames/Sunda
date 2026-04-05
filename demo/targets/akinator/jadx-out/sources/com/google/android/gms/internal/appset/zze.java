package com.google.android.gms.internal.appset;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zze extends zzb implements zzf {
    public zze() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // com.google.android.gms.internal.appset.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        zzb((Status) zzc.zza(parcel, Status.CREATOR), (com.google.android.gms.appset.zzc) zzc.zza(parcel, com.google.android.gms.appset.zzc.CREATOR));
        return true;
    }
}
