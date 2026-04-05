package b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m implements o {

    /* renamed from: b, reason: collision with root package name */
    public IBinder f8321b;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f8321b;
    }

    public String getInterfaceDescriptor() {
        return o.f8322x8;
    }

    @Override // b.o
    public void onGreatestScrollPercentageIncreased(int i10, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(o.f8322x8);
            parcelObtain.writeInt(i10);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f8321b.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // b.o
    public void onSessionEnded(boolean z10, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(o.f8322x8);
            parcelObtain.writeInt(z10 ? 1 : 0);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f8321b.transact(4, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // b.o
    public void onVerticalScrollEvent(boolean z10, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(o.f8322x8);
            parcelObtain.writeInt(z10 ? 1 : 0);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f8321b.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
