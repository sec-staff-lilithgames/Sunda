package d;

import android.app.Notification;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: b, reason: collision with root package name */
    public IBinder f51282b;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f51282b;
    }

    @Override // d.c
    public void cancel(String str, int i10, String str2) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(c.C8);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i10);
            parcelObtain.writeString(str2);
            this.f51282b.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // d.c
    public void cancelAll(String str) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(c.C8);
            parcelObtain.writeString(str);
            this.f51282b.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    public String getInterfaceDescriptor() {
        return c.C8;
    }

    @Override // d.c
    public void notify(String str, int i10, String str2, Notification notification) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(c.C8);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i10);
            parcelObtain.writeString(str2);
            if (notification != null) {
                parcelObtain.writeInt(1);
                notification.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f51282b.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
