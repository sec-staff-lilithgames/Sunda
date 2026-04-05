package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbam;
import com.google.android.gms.internal.ads.zzban;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzef extends zzbam implements zzeg {
    public zzef() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final boolean zzdi(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zze();
        } else if (i10 == 2) {
            zzf();
        } else if (i10 == 3) {
            zzg();
        } else if (i10 == 4) {
            zzh();
        } else {
            if (i10 != 5) {
                return false;
            }
            boolean zZza = zzban.zza(parcel);
            zzban.zzh(parcel);
            zzi(zZza);
        }
        parcel2.writeNoException();
        return true;
    }
}
