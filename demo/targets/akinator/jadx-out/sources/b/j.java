package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class j extends Binder implements l {
    public j() {
        attachInterface(this, l.f8320w8);
    }

    public static l asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(l.f8320w8);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof l)) {
            return (l) iInterfaceQueryLocalInterface;
        }
        i iVar = new i();
        iVar.f8319b = iBinder;
        return iVar;
    }

    public abstract /* synthetic */ Bundle extraCommand(String str, Bundle bundle) throws RemoteException;

    public abstract /* synthetic */ boolean isEngagementSignalsApiAvailable(h hVar, Bundle bundle) throws RemoteException;

    public abstract /* synthetic */ boolean mayLaunchUrl(h hVar, Uri uri, Bundle bundle, List list) throws RemoteException;

    public abstract /* synthetic */ boolean newAuthTabSession(d dVar, Bundle bundle) throws RemoteException;

    public abstract /* synthetic */ boolean newSession(h hVar) throws RemoteException;

    public abstract /* synthetic */ boolean newSessionWithExtras(h hVar, Bundle bundle) throws RemoteException;

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        String str = l.f8320w8;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i10 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        switch (i10) {
            case 2:
                boolean zWarmup = warmup(parcel.readLong());
                parcel2.writeNoException();
                parcel2.writeInt(zWarmup ? 1 : 0);
                return true;
            case 3:
                boolean zNewSession = newSession(f.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(zNewSession ? 1 : 0);
                return true;
            case 4:
                h hVarAsInterface = f.asInterface(parcel.readStrongBinder());
                Uri uri = (Uri) k.a(parcel, Uri.CREATOR);
                Parcelable.Creator creator = Bundle.CREATOR;
                boolean zMayLaunchUrl = mayLaunchUrl(hVarAsInterface, uri, (Bundle) k.a(parcel, creator), parcel.createTypedArrayList(creator));
                parcel2.writeNoException();
                parcel2.writeInt(zMayLaunchUrl ? 1 : 0);
                return true;
            case 5:
                Bundle bundleExtraCommand = extraCommand(parcel.readString(), (Bundle) k.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                k.c(parcel2, bundleExtraCommand, 1);
                return true;
            case 6:
                boolean zUpdateVisuals = updateVisuals(f.asInterface(parcel.readStrongBinder()), (Bundle) k.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zUpdateVisuals ? 1 : 0);
                return true;
            case 7:
                boolean zRequestPostMessageChannel = requestPostMessageChannel(f.asInterface(parcel.readStrongBinder()), (Uri) k.a(parcel, Uri.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zRequestPostMessageChannel ? 1 : 0);
                return true;
            case 8:
                int iPostMessage = postMessage(f.asInterface(parcel.readStrongBinder()), parcel.readString(), (Bundle) k.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(iPostMessage);
                return true;
            case 9:
                boolean zValidateRelationship = validateRelationship(f.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Uri) k.a(parcel, Uri.CREATOR), (Bundle) k.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zValidateRelationship ? 1 : 0);
                return true;
            case 10:
                boolean zNewSessionWithExtras = newSessionWithExtras(f.asInterface(parcel.readStrongBinder()), (Bundle) k.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zNewSessionWithExtras ? 1 : 0);
                return true;
            case 11:
                boolean zRequestPostMessageChannelWithExtras = requestPostMessageChannelWithExtras(f.asInterface(parcel.readStrongBinder()), (Uri) k.a(parcel, Uri.CREATOR), (Bundle) k.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zRequestPostMessageChannelWithExtras ? 1 : 0);
                return true;
            case 12:
                boolean zReceiveFile = receiveFile(f.asInterface(parcel.readStrongBinder()), (Uri) k.a(parcel, Uri.CREATOR), parcel.readInt(), (Bundle) k.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zReceiveFile ? 1 : 0);
                return true;
            case 13:
                boolean zIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable(f.asInterface(parcel.readStrongBinder()), (Bundle) k.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zIsEngagementSignalsApiAvailable ? 1 : 0);
                return true;
            case 14:
                boolean engagementSignalsCallback = setEngagementSignalsCallback(f.asInterface(parcel.readStrongBinder()), parcel.readStrongBinder(), (Bundle) k.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(engagementSignalsCallback ? 1 : 0);
                return true;
            case 15:
                prefetch(f.asInterface(parcel.readStrongBinder()), (Uri) k.a(parcel, Uri.CREATOR), (Bundle) k.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                prefetchWithMultipleUrls(f.asInterface(parcel.readStrongBinder()), parcel.createTypedArrayList(Uri.CREATOR), (Bundle) k.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
            case 18:
                boolean zNewAuthTabSession = newAuthTabSession(b.asInterface(parcel.readStrongBinder()), (Bundle) k.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zNewAuthTabSession ? 1 : 0);
                return true;
        }
    }

    public abstract /* synthetic */ int postMessage(h hVar, String str, Bundle bundle) throws RemoteException;

    public abstract /* synthetic */ void prefetch(h hVar, Uri uri, Bundle bundle) throws RemoteException;

    public abstract /* synthetic */ void prefetchWithMultipleUrls(h hVar, List list, Bundle bundle) throws RemoteException;

    public abstract /* synthetic */ boolean receiveFile(h hVar, Uri uri, int i10, Bundle bundle) throws RemoteException;

    public abstract /* synthetic */ boolean requestPostMessageChannel(h hVar, Uri uri) throws RemoteException;

    public abstract /* synthetic */ boolean requestPostMessageChannelWithExtras(h hVar, Uri uri, Bundle bundle) throws RemoteException;

    public abstract /* synthetic */ boolean setEngagementSignalsCallback(h hVar, IBinder iBinder, Bundle bundle) throws RemoteException;

    public abstract /* synthetic */ boolean updateVisuals(h hVar, Bundle bundle) throws RemoteException;

    public abstract /* synthetic */ boolean validateRelationship(h hVar, int i10, Uri uri, Bundle bundle) throws RemoteException;

    public abstract /* synthetic */ boolean warmup(long j10) throws RemoteException;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
