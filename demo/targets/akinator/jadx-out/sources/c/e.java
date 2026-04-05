package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e extends Binder implements g {
    public e() {
        attachInterface(this, g.B8);
    }

    public static g asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(g.B8);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof g)) {
            return (g) iInterfaceQueryLocalInterface;
        }
        d dVar = new d();
        dVar.f11386b = iBinder;
        return dVar;
    }

    @Override // c.g
    public abstract /* synthetic */ Bundle areNotificationsEnabled(Bundle bundle) throws RemoteException;

    @Override // c.g
    public abstract /* synthetic */ void cancelNotification(Bundle bundle) throws RemoteException;

    @Override // c.g
    public abstract /* synthetic */ Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) throws RemoteException;

    @Override // c.g
    public abstract /* synthetic */ Bundle getActiveNotifications() throws RemoteException;

    @Override // c.g
    public abstract /* synthetic */ Bundle getSmallIconBitmap() throws RemoteException;

    @Override // c.g
    public abstract /* synthetic */ int getSmallIconId() throws RemoteException;

    @Override // c.g
    public abstract /* synthetic */ Bundle notifyNotificationWithChannel(Bundle bundle) throws RemoteException;

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        String str = g.B8;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i10 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        switch (i10) {
            case 2:
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundleNotifyNotificationWithChannel = notifyNotificationWithChannel((Bundle) f.a(parcel));
                parcel2.writeNoException();
                f.b(parcel2, bundleNotifyNotificationWithChannel, 1);
                return true;
            case 3:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                cancelNotification((Bundle) f.a(parcel));
                parcel2.writeNoException();
                return true;
            case 4:
                int smallIconId = getSmallIconId();
                parcel2.writeNoException();
                parcel2.writeInt(smallIconId);
                return true;
            case 5:
                Bundle activeNotifications = getActiveNotifications();
                parcel2.writeNoException();
                f.b(parcel2, activeNotifications, 1);
                return true;
            case 6:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundleAreNotificationsEnabled = areNotificationsEnabled((Bundle) f.a(parcel));
                parcel2.writeNoException();
                f.b(parcel2, bundleAreNotificationsEnabled, 1);
                return true;
            case 7:
                Bundle smallIconBitmap = getSmallIconBitmap();
                parcel2.writeNoException();
                f.b(parcel2, smallIconBitmap, 1);
                return true;
            case 8:
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
            case 9:
                String string = parcel.readString();
                Parcelable.Creator creator4 = Bundle.CREATOR;
                Bundle bundleExtraCommand = extraCommand(string, (Bundle) f.a(parcel), parcel.readStrongBinder());
                parcel2.writeNoException();
                f.b(parcel2, bundleExtraCommand, 1);
                return true;
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
