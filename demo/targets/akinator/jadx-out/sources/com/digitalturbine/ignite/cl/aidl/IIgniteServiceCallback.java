package com.digitalturbine.ignite.cl.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface IIgniteServiceCallback extends IInterface {
    void onError(String str) throws RemoteException;

    void onProgress(String str) throws RemoteException;

    void onScheduled(String str) throws RemoteException;

    void onStart(String str) throws RemoteException;

    void onSuccess(String str) throws RemoteException;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class Stub extends Binder implements IIgniteServiceCallback {
        public Stub() {
            attachInterface(this, "com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback");
        }

        @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
        public abstract /* synthetic */ void onError(String str) throws RemoteException;

        @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
        public abstract /* synthetic */ void onProgress(String str) throws RemoteException;

        @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
        public abstract /* synthetic */ void onScheduled(String str) throws RemoteException;

        @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
        public abstract /* synthetic */ void onStart(String str) throws RemoteException;

        @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
        public abstract /* synthetic */ void onSuccess(String str) throws RemoteException;

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback");
            }
            if (i10 == 1598968902) {
                parcel2.writeString("com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback");
                return true;
            }
            if (i10 == 1) {
                onScheduled(parcel.readString());
                parcel2.writeNoException();
            } else if (i10 == 2) {
                onStart(parcel.readString());
                parcel2.writeNoException();
            } else if (i10 == 3) {
                onProgress(parcel.readString());
                parcel2.writeNoException();
            } else if (i10 == 4) {
                onSuccess(parcel.readString());
                parcel2.writeNoException();
            } else {
                if (i10 != 5) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                onError(parcel.readString());
                parcel2.writeNoException();
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
