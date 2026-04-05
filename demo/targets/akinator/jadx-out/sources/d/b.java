package d;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b extends Binder implements c {
    public b() {
        attachInterface(this, c.C8);
    }

    public static c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(c.C8);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof c)) {
            return (c) iInterfaceQueryLocalInterface;
        }
        a aVar = new a();
        aVar.f51282b = iBinder;
        return aVar;
    }

    @Override // d.c
    public abstract /* synthetic */ void cancel(String str, int i10, String str2) throws RemoteException;

    @Override // d.c
    public abstract /* synthetic */ void cancelAll(String str) throws RemoteException;

    @Override // d.c
    public abstract /* synthetic */ void notify(String str, int i10, String str2, Notification notification) throws RemoteException;

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        String str = c.C8;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i10 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i10 == 1) {
            notify(parcel.readString(), parcel.readInt(), parcel.readString(), (Notification) (parcel.readInt() != 0 ? Notification.CREATOR.createFromParcel(parcel) : null));
        } else if (i10 == 2) {
            cancel(parcel.readString(), parcel.readInt(), parcel.readString());
        } else {
            if (i10 != 3) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            cancelAll(parcel.readString());
        }
        return true;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
