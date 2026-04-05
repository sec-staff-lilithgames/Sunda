package b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: b, reason: collision with root package name */
    public IBinder f8315b;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f8315b;
    }

    public String getInterfaceDescriptor() {
        return d.f8316u8;
    }

    @Override // b.d
    public void onExtraCallback(String str, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(d.f8316u8);
            parcelObtain.writeString(str);
            c.b(parcelObtain, bundle, 0);
            this.f8315b.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // b.d
    public Bundle onExtraCallbackWithResult(String str, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(d.f8316u8);
            parcelObtain.writeString(str);
            c.b(parcelObtain, bundle, 0);
            this.f8315b.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            Parcelable.Creator creator = Bundle.CREATOR;
            return (Bundle) c.a(parcelObtain2);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // b.d
    public void onNavigationEvent(int i10, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(d.f8316u8);
            parcelObtain.writeInt(i10);
            c.b(parcelObtain, bundle, 0);
            this.f8315b.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // b.d
    public void onWarmupCompleted(Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(d.f8316u8);
            c.b(parcelObtain, bundle, 0);
            this.f8315b.transact(5, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
