package e;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: b, reason: collision with root package name */
    public IBinder f52951b;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f52951b;
    }

    public String getInterfaceDescriptor() {
        return c.E8;
    }

    @Override // e.c
    public void send(int i10, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(c.E8);
            parcelObtain.writeInt(i10);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f52951b.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
