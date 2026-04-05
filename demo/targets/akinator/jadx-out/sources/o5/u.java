package o5;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class u extends Binder implements v {
    public u() {
        attachInterface(this, v.T8);
    }

    public static v asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(v.T8);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof v)) {
            return (v) iInterfaceQueryLocalInterface;
        }
        t tVar = new t();
        tVar.f77716b = iBinder;
        return tVar;
    }

    public abstract /* synthetic */ void broadcastInvalidation(int i10, String[] strArr) throws RemoteException;

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        String str = v.T8;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i10 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i10 == 1) {
            int iRegisterCallback = registerCallback(r.asInterface(parcel.readStrongBinder()), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(iRegisterCallback);
        } else if (i10 == 2) {
            unregisterCallback(r.asInterface(parcel.readStrongBinder()), parcel.readInt());
            parcel2.writeNoException();
        } else {
            if (i10 != 3) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            broadcastInvalidation(parcel.readInt(), parcel.createStringArray());
        }
        return true;
    }

    public abstract /* synthetic */ int registerCallback(s sVar, String str) throws RemoteException;

    public abstract /* synthetic */ void unregisterCallback(s sVar, int i10) throws RemoteException;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
