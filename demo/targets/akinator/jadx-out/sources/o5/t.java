package o5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t implements v {

    /* renamed from: b, reason: collision with root package name */
    public IBinder f77716b;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f77716b;
    }

    @Override // o5.v
    public void broadcastInvalidation(int i10, String[] strArr) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(v.T8);
            parcelObtain.writeInt(i10);
            parcelObtain.writeStringArray(strArr);
            this.f77716b.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    public String getInterfaceDescriptor() {
        return v.T8;
    }

    @Override // o5.v
    public int registerCallback(s sVar, String str) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(v.T8);
            parcelObtain.writeStrongInterface(sVar);
            parcelObtain.writeString(str);
            this.f77716b.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // o5.v
    public void unregisterCallback(s sVar, int i10) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(v.T8);
            parcelObtain.writeStrongInterface(sVar);
            parcelObtain.writeInt(i10);
            this.f77716b.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
