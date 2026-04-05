package com.applovin.array.apphub.aidl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface IAppHubService extends IInterface {
    public static final String DESCRIPTOR = "com.applovin.array.apphub.aidl.IAppHubService";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t10, int i10) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
            }
        }
    }

    void directInstall(String str, Bundle bundle, IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws RemoteException;

    void dismissDirectDownloadAppDetails(String str) throws RemoteException;

    long getAppHubVersionCode() throws RemoteException;

    Bundle getEnabledFeatures() throws RemoteException;

    String getRandomUserToken() throws RemoteException;

    void onAdSdkEvent(String str, Bundle bundle) throws RemoteException;

    void showDirectDownloadAppDetails(String str, IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws RemoteException;

    void showDirectDownloadAppDetailsWithExtra(String str, Bundle bundle, IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws RemoteException;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class Stub extends Binder implements IAppHubService {
        static final int TRANSACTION_directInstall = 7;
        static final int TRANSACTION_dismissDirectDownloadAppDetails = 5;
        static final int TRANSACTION_getAppHubVersionCode = 2;
        static final int TRANSACTION_getEnabledFeatures = 3;
        static final int TRANSACTION_getRandomUserToken = 1;
        static final int TRANSACTION_onAdSdkEvent = 8;
        static final int TRANSACTION_showDirectDownloadAppDetails = 4;
        static final int TRANSACTION_showDirectDownloadAppDetailsWithExtra = 6;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static class Proxy implements IAppHubService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubService
            public void directInstall(String str, Bundle bundle, IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAppHubService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    parcelObtain.writeStrongInterface(iAppHubDirectDownloadServiceCallback);
                    this.mRemote.transact(7, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubService
            public void dismissDirectDownloadAppDetails(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAppHubService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubService
            public long getAppHubVersionCode() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAppHubService.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readLong();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubService
            public Bundle getEnabledFeatures() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAppHubService.DESCRIPTOR);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) _Parcel.readTypedObject(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IAppHubService.DESCRIPTOR;
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubService
            public String getRandomUserToken() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAppHubService.DESCRIPTOR);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubService
            public void onAdSdkEvent(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAppHubService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(8, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubService
            public void showDirectDownloadAppDetails(String str, IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAppHubService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iAppHubDirectDownloadServiceCallback);
                    this.mRemote.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubService
            public void showDirectDownloadAppDetailsWithExtra(String str, Bundle bundle, IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAppHubService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    parcelObtain.writeStrongInterface(iAppHubDirectDownloadServiceCallback);
                    this.mRemote.transact(6, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IAppHubService.DESCRIPTOR);
        }

        public static IAppHubService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IAppHubService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IAppHubService)) ? new Proxy(iBinder) : (IAppHubService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(IAppHubService.DESCRIPTOR);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(IAppHubService.DESCRIPTOR);
                return true;
            }
            switch (i10) {
                case 1:
                    String randomUserToken = getRandomUserToken();
                    parcel2.writeNoException();
                    parcel2.writeString(randomUserToken);
                    return true;
                case 2:
                    long appHubVersionCode = getAppHubVersionCode();
                    parcel2.writeNoException();
                    parcel2.writeLong(appHubVersionCode);
                    return true;
                case 3:
                    Bundle enabledFeatures = getEnabledFeatures();
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, enabledFeatures, 1);
                    return true;
                case 4:
                    showDirectDownloadAppDetails(parcel.readString(), IAppHubDirectDownloadServiceCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 5:
                    dismissDirectDownloadAppDetails(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    showDirectDownloadAppDetailsWithExtra(parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), IAppHubDirectDownloadServiceCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 7:
                    directInstall(parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), IAppHubDirectDownloadServiceCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 8:
                    onAdSdkEvent(parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Default implements IAppHubService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.applovin.array.apphub.aidl.IAppHubService
        public long getAppHubVersionCode() throws RemoteException {
            return 0L;
        }

        @Override // com.applovin.array.apphub.aidl.IAppHubService
        public Bundle getEnabledFeatures() throws RemoteException {
            return null;
        }

        @Override // com.applovin.array.apphub.aidl.IAppHubService
        public String getRandomUserToken() throws RemoteException {
            return null;
        }

        @Override // com.applovin.array.apphub.aidl.IAppHubService
        public void dismissDirectDownloadAppDetails(String str) throws RemoteException {
        }

        @Override // com.applovin.array.apphub.aidl.IAppHubService
        public void onAdSdkEvent(String str, Bundle bundle) throws RemoteException {
        }

        @Override // com.applovin.array.apphub.aidl.IAppHubService
        public void showDirectDownloadAppDetails(String str, IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws RemoteException {
        }

        @Override // com.applovin.array.apphub.aidl.IAppHubService
        public void directInstall(String str, Bundle bundle, IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws RemoteException {
        }

        @Override // com.applovin.array.apphub.aidl.IAppHubService
        public void showDirectDownloadAppDetailsWithExtra(String str, Bundle bundle, IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws RemoteException {
        }
    }
}
