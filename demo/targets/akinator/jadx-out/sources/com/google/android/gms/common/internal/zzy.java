package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzy extends com.google.android.gms.internal.common.zza implements zzaa {
    public zzy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final int zzc() throws RemoteException {
        Parcel parcelZzB = zzB(2, zza());
        int i10 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i10;
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final IObjectWrapper zzd() throws RemoteException {
        return a.j(zzB(1, zza()));
    }
}
