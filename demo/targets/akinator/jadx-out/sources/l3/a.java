package l3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: b, reason: collision with root package name */
    public IBinder f72400b;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f72400b;
    }

    public String getInterfaceDescriptor() {
        return c.P8;
    }

    @Override // l3.c
    public void onIsPermissionRevocationEnabledForAppResult(boolean z10, boolean z11) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(c.P8);
            parcelObtain.writeInt(z10 ? 1 : 0);
            parcelObtain.writeInt(z11 ? 1 : 0);
            this.f72400b.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
