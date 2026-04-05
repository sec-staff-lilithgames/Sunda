package b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class n extends Binder implements o {
    public n() {
        attachInterface(this, o.f8322x8);
    }

    public static o asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(o.f8322x8);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof o)) {
            return (o) iInterfaceQueryLocalInterface;
        }
        m mVar = new m();
        mVar.f8321b = iBinder;
        return mVar;
    }

    public abstract /* synthetic */ void onGreatestScrollPercentageIncreased(int i10, Bundle bundle) throws RemoteException;

    public abstract /* synthetic */ void onSessionEnded(boolean z10, Bundle bundle) throws RemoteException;

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        String str = o.f8322x8;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i10 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i10 == 2) {
            onVerticalScrollEvent(parcel.readInt() != 0, (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            return true;
        }
        if (i10 == 3) {
            onGreatestScrollPercentageIncreased(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            return true;
        }
        if (i10 != 4) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        onSessionEnded(parcel.readInt() != 0, (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }

    public abstract /* synthetic */ void onVerticalScrollEvent(boolean z10, Bundle bundle) throws RemoteException;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
