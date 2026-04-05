package b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b extends Binder implements d {
    public b() {
        attachInterface(this, d.f8316u8);
    }

    public static d asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(d.f8316u8);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof d)) {
            return (d) iInterfaceQueryLocalInterface;
        }
        a aVar = new a();
        aVar.f8315b = iBinder;
        return aVar;
    }

    public abstract /* synthetic */ void onExtraCallback(String str, Bundle bundle) throws RemoteException;

    public abstract /* synthetic */ Bundle onExtraCallbackWithResult(String str, Bundle bundle) throws RemoteException;

    public abstract /* synthetic */ void onNavigationEvent(int i10, Bundle bundle) throws RemoteException;

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        String str = d.f8316u8;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i10 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i10 == 2) {
            int i12 = parcel.readInt();
            Parcelable.Creator creator = Bundle.CREATOR;
            onNavigationEvent(i12, (Bundle) c.a(parcel));
            return true;
        }
        if (i10 == 3) {
            String string = parcel.readString();
            Parcelable.Creator creator2 = Bundle.CREATOR;
            onExtraCallback(string, (Bundle) c.a(parcel));
            return true;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            Parcelable.Creator creator3 = Bundle.CREATOR;
            onWarmupCompleted((Bundle) c.a(parcel));
            return true;
        }
        String string2 = parcel.readString();
        Parcelable.Creator creator4 = Bundle.CREATOR;
        Bundle bundleOnExtraCallbackWithResult = onExtraCallbackWithResult(string2, (Bundle) c.a(parcel));
        parcel2.writeNoException();
        c.b(parcel2, bundleOnExtraCallbackWithResult, 1);
        return true;
    }

    public abstract /* synthetic */ void onWarmupCompleted(Bundle bundle) throws RemoteException;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
