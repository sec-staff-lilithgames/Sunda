package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class f extends Binder implements h {
    public f() {
        attachInterface(this, h.f8318v8);
    }

    public static h asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(h.f8318v8);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof h)) {
            return (h) iInterfaceQueryLocalInterface;
        }
        e eVar = new e();
        eVar.f8317b = iBinder;
        return eVar;
    }

    public abstract /* synthetic */ void extraCallback(String str, Bundle bundle) throws RemoteException;

    public abstract /* synthetic */ Bundle extraCallbackWithResult(String str, Bundle bundle) throws RemoteException;

    public abstract /* synthetic */ void onActivityLayout(int i10, int i11, int i12, int i13, int i14, Bundle bundle) throws RemoteException;

    public abstract /* synthetic */ void onActivityResized(int i10, int i11, Bundle bundle) throws RemoteException;

    public abstract /* synthetic */ void onMessageChannelReady(Bundle bundle) throws RemoteException;

    public abstract /* synthetic */ void onMinimized(Bundle bundle) throws RemoteException;

    public abstract /* synthetic */ void onNavigationEvent(int i10, Bundle bundle) throws RemoteException;

    public abstract /* synthetic */ void onPostMessage(String str, Bundle bundle) throws RemoteException;

    public abstract /* synthetic */ void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) throws RemoteException;

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        String str = h.f8318v8;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i10 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        switch (i10) {
            case 2:
                onNavigationEvent(parcel.readInt(), (Bundle) g.a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                extraCallback(parcel.readString(), (Bundle) g.a(parcel, Bundle.CREATOR));
                return true;
            case 4:
                onMessageChannelReady((Bundle) g.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                onPostMessage(parcel.readString(), (Bundle) g.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 6:
                onRelationshipValidationResult(parcel.readInt(), (Uri) g.a(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) g.a(parcel, Bundle.CREATOR));
                return true;
            case 7:
                Bundle bundleExtraCallbackWithResult = extraCallbackWithResult(parcel.readString(), (Bundle) g.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                g.b(parcel2, bundleExtraCallbackWithResult, 1);
                return true;
            case 8:
                onActivityResized(parcel.readInt(), parcel.readInt(), (Bundle) g.a(parcel, Bundle.CREATOR));
                return true;
            case 9:
                onWarmupCompleted((Bundle) g.a(parcel, Bundle.CREATOR));
                return true;
            case 10:
                onActivityLayout(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) g.a(parcel, Bundle.CREATOR));
                return true;
            case 11:
                onMinimized((Bundle) g.a(parcel, Bundle.CREATOR));
                return true;
            case 12:
                onUnminimized((Bundle) g.a(parcel, Bundle.CREATOR));
                return true;
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
        }
    }

    public abstract /* synthetic */ void onUnminimized(Bundle bundle) throws RemoteException;

    public abstract /* synthetic */ void onWarmupCompleted(Bundle bundle) throws RemoteException;

    public IBinder asBinder() {
        return this;
    }
}
