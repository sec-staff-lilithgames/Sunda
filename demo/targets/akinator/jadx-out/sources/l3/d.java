package l3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d implements f {

    /* renamed from: b, reason: collision with root package name */
    public IBinder f72401b;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f72401b;
    }

    public String getInterfaceDescriptor() {
        return f.Q8;
    }

    @Override // l3.f
    public void isPermissionRevocationEnabledForApp(c cVar) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(f.Q8);
            parcelObtain.writeStrongInterface(cVar);
            this.f72401b.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
