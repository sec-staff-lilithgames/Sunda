package c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d implements g {

    /* renamed from: b, reason: collision with root package name */
    public IBinder f11386b;

    @Override // c.g
    public Bundle areNotificationsEnabled(Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(g.B8);
            f.b(parcelObtain, bundle, 0);
            this.f11386b.transact(6, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            Parcelable.Creator creator = Bundle.CREATOR;
            return (Bundle) f.a(parcelObtain2);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f11386b;
    }

    @Override // c.g
    public void cancelNotification(Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(g.B8);
            f.b(parcelObtain, bundle, 0);
            this.f11386b.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // c.g
    public Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(g.B8);
            parcelObtain.writeString(str);
            f.b(parcelObtain, bundle, 0);
            parcelObtain.writeStrongBinder(iBinder);
            this.f11386b.transact(9, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            Parcelable.Creator creator = Bundle.CREATOR;
            return (Bundle) f.a(parcelObtain2);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // c.g
    public Bundle getActiveNotifications() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(g.B8);
            this.f11386b.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            Parcelable.Creator creator = Bundle.CREATOR;
            return (Bundle) f.a(parcelObtain2);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public String getInterfaceDescriptor() {
        return g.B8;
    }

    @Override // c.g
    public Bundle getSmallIconBitmap() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(g.B8);
            this.f11386b.transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            Parcelable.Creator creator = Bundle.CREATOR;
            return (Bundle) f.a(parcelObtain2);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // c.g
    public int getSmallIconId() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(g.B8);
            this.f11386b.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // c.g
    public Bundle notifyNotificationWithChannel(Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(g.B8);
            f.b(parcelObtain, bundle, 0);
            this.f11386b.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            Parcelable.Creator creator = Bundle.CREATOR;
            return (Bundle) f.a(parcelObtain2);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
