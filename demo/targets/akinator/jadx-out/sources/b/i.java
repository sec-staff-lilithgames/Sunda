package b;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i implements l {

    /* renamed from: b, reason: collision with root package name */
    public IBinder f8319b;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f8319b;
    }

    @Override // b.l
    public Bundle extraCommand(String str, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(l.f8320w8);
            parcelObtain.writeString(str);
            k.c(parcelObtain, bundle, 0);
            this.f8319b.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (Bundle) k.a(parcelObtain2, Bundle.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public String getInterfaceDescriptor() {
        return l.f8320w8;
    }

    @Override // b.l
    public boolean isEngagementSignalsApiAvailable(h hVar, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(l.f8320w8);
            parcelObtain.writeStrongInterface(hVar);
            k.c(parcelObtain, bundle, 0);
            this.f8319b.transact(13, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // b.l
    public boolean mayLaunchUrl(h hVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(l.f8320w8);
            parcelObtain.writeStrongInterface(hVar);
            k.c(parcelObtain, uri, 0);
            k.c(parcelObtain, bundle, 0);
            k.b(parcelObtain, list);
            this.f8319b.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // b.l
    public boolean newAuthTabSession(d dVar, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(l.f8320w8);
            parcelObtain.writeStrongInterface(dVar);
            k.c(parcelObtain, bundle, 0);
            this.f8319b.transact(18, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // b.l
    public boolean newSession(h hVar) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(l.f8320w8);
            parcelObtain.writeStrongInterface(hVar);
            this.f8319b.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // b.l
    public boolean newSessionWithExtras(h hVar, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(l.f8320w8);
            parcelObtain.writeStrongInterface(hVar);
            k.c(parcelObtain, bundle, 0);
            this.f8319b.transact(10, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // b.l
    public int postMessage(h hVar, String str, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(l.f8320w8);
            parcelObtain.writeStrongInterface(hVar);
            parcelObtain.writeString(str);
            k.c(parcelObtain, bundle, 0);
            this.f8319b.transact(8, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // b.l
    public void prefetch(h hVar, Uri uri, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(l.f8320w8);
            parcelObtain.writeStrongInterface(hVar);
            k.c(parcelObtain, uri, 0);
            k.c(parcelObtain, bundle, 0);
            this.f8319b.transact(15, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // b.l
    public void prefetchWithMultipleUrls(h hVar, List<Uri> list, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(l.f8320w8);
            parcelObtain.writeStrongInterface(hVar);
            k.b(parcelObtain, list);
            k.c(parcelObtain, bundle, 0);
            this.f8319b.transact(16, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // b.l
    public boolean receiveFile(h hVar, Uri uri, int i10, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(l.f8320w8);
            parcelObtain.writeStrongInterface(hVar);
            k.c(parcelObtain, uri, 0);
            parcelObtain.writeInt(i10);
            k.c(parcelObtain, bundle, 0);
            this.f8319b.transact(12, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // b.l
    public boolean requestPostMessageChannel(h hVar, Uri uri) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(l.f8320w8);
            parcelObtain.writeStrongInterface(hVar);
            k.c(parcelObtain, uri, 0);
            this.f8319b.transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // b.l
    public boolean requestPostMessageChannelWithExtras(h hVar, Uri uri, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(l.f8320w8);
            parcelObtain.writeStrongInterface(hVar);
            k.c(parcelObtain, uri, 0);
            k.c(parcelObtain, bundle, 0);
            this.f8319b.transact(11, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // b.l
    public boolean setEngagementSignalsCallback(h hVar, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(l.f8320w8);
            parcelObtain.writeStrongInterface(hVar);
            parcelObtain.writeStrongBinder(iBinder);
            k.c(parcelObtain, bundle, 0);
            this.f8319b.transact(14, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // b.l
    public boolean updateVisuals(h hVar, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(l.f8320w8);
            parcelObtain.writeStrongInterface(hVar);
            k.c(parcelObtain, bundle, 0);
            this.f8319b.transact(6, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // b.l
    public boolean validateRelationship(h hVar, int i10, Uri uri, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(l.f8320w8);
            parcelObtain.writeStrongInterface(hVar);
            parcelObtain.writeInt(i10);
            k.c(parcelObtain, uri, 0);
            k.c(parcelObtain, bundle, 0);
            this.f8319b.transact(9, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // b.l
    public boolean warmup(long j10) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(l.f8320w8);
            parcelObtain.writeLong(j10);
            this.f8319b.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
