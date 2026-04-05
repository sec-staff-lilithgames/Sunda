package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzcz extends zzbm implements zzda {
    public zzcz() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Bundle bundle = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
            long j10 = parcel.readLong();
            zzbn.zzf(parcel);
            zze(string, string2, bundle, j10);
            parcel2.writeNoException();
        } else {
            if (i10 != 2) {
                return false;
            }
            int iZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeInt(iZzf);
        }
        return true;
    }
}
