package o5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q implements s {

    /* renamed from: b, reason: collision with root package name */
    public IBinder f77693b;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f77693b;
    }

    public String getInterfaceDescriptor() {
        return s.S8;
    }

    @Override // o5.s
    public void onInvalidation(String[] strArr) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(s.S8);
            parcelObtain.writeStringArray(strArr);
            this.f77693b.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
