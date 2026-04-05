package b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class q extends Binder implements r {
    public q() {
        attachInterface(this, r.f8324y8);
    }

    public static r asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(r.f8324y8);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof r)) {
            return (r) iInterfaceQueryLocalInterface;
        }
        p pVar = new p();
        pVar.f8323b = iBinder;
        return pVar;
    }

    public abstract /* synthetic */ void onMessageChannelReady(h hVar, Bundle bundle) throws RemoteException;

    public abstract /* synthetic */ void onPostMessage(h hVar, String str, Bundle bundle) throws RemoteException;

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        String str = r.f8324y8;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i10 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i10 == 2) {
            onMessageChannelReady(f.asInterface(parcel.readStrongBinder()), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            parcel2.writeNoException();
            return true;
        }
        if (i10 != 3) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        onPostMessage(f.asInterface(parcel.readStrongBinder()), parcel.readString(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
