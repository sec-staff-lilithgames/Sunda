package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzat extends zzaq implements zzav {
    public zzat(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzav
    public final void zza(String str, String str2, zzax zzaxVar) throws RemoteException {
        Parcel parcelZzu = zzu();
        parcelZzu.writeString(str);
        parcelZzu.writeString(str2);
        int i10 = zzas.zza;
        parcelZzu.writeStrongBinder(zzaxVar);
        zzx(1, parcelZzu);
    }
}
