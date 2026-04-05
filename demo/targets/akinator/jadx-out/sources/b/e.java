package b;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e implements h {

    /* renamed from: b, reason: collision with root package name */
    public IBinder f8317b;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f8317b;
    }

    @Override // b.h
    public void extraCallback(String str, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(h.f8318v8);
            parcelObtain.writeString(str);
            g.b(parcelObtain, bundle, 0);
            this.f8317b.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // b.h
    public Bundle extraCallbackWithResult(String str, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(h.f8318v8);
            parcelObtain.writeString(str);
            g.b(parcelObtain, bundle, 0);
            this.f8317b.transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (Bundle) g.a(parcelObtain2, Bundle.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public String getInterfaceDescriptor() {
        return h.f8318v8;
    }

    @Override // b.h
    public void onActivityLayout(int i10, int i11, int i12, int i13, int i14, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(h.f8318v8);
            parcelObtain.writeInt(i10);
            parcelObtain.writeInt(i11);
            parcelObtain.writeInt(i12);
            parcelObtain.writeInt(i13);
            parcelObtain.writeInt(i14);
            g.b(parcelObtain, bundle, 0);
            this.f8317b.transact(10, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // b.h
    public void onActivityResized(int i10, int i11, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(h.f8318v8);
            parcelObtain.writeInt(i10);
            parcelObtain.writeInt(i11);
            g.b(parcelObtain, bundle, 0);
            this.f8317b.transact(8, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // b.h
    public void onMessageChannelReady(Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(h.f8318v8);
            g.b(parcelObtain, bundle, 0);
            this.f8317b.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // b.h
    public void onMinimized(Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(h.f8318v8);
            g.b(parcelObtain, bundle, 0);
            this.f8317b.transact(11, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // b.h
    public void onNavigationEvent(int i10, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(h.f8318v8);
            parcelObtain.writeInt(i10);
            g.b(parcelObtain, bundle, 0);
            this.f8317b.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // b.h
    public void onPostMessage(String str, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(h.f8318v8);
            parcelObtain.writeString(str);
            g.b(parcelObtain, bundle, 0);
            this.f8317b.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // b.h
    public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(h.f8318v8);
            parcelObtain.writeInt(i10);
            g.b(parcelObtain, uri, 0);
            parcelObtain.writeInt(z10 ? 1 : 0);
            g.b(parcelObtain, bundle, 0);
            this.f8317b.transact(6, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // b.h
    public void onUnminimized(Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(h.f8318v8);
            g.b(parcelObtain, bundle, 0);
            this.f8317b.transact(12, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // b.h
    public void onWarmupCompleted(Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(h.f8318v8);
            g.b(parcelObtain, bundle, 0);
            this.f8317b.transact(9, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
