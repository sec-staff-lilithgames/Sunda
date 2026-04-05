package com.unity3d.services.core.device;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.unity3d.services.core.log.DeviceLog;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class AdvertisingId {
    private static final String ADVERTISING_ID_SERVICE_NAME = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
    private static AdvertisingId instance;
    private String advertisingIdentifier = null;
    private boolean limitedAdvertisingTracking = false;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface GoogleAdvertisingInfo extends IInterface {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static abstract class GoogleAdvertisingInfoBinder extends Binder implements GoogleAdvertisingInfo {

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static class GoogleAdvertisingInfoImplementation implements GoogleAdvertisingInfo {
                private final IBinder _binder;

                public GoogleAdvertisingInfoImplementation(IBinder iBinder) {
                    this._binder = iBinder;
                }

                @Override // android.os.IInterface
                public IBinder asBinder() {
                    return this._binder;
                }

                @Override // com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo
                public boolean getEnabled(boolean z10) throws RemoteException {
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken(AdvertisingId.ADVERTISING_ID_SERVICE_NAME);
                        parcelObtain.writeInt(z10 ? 1 : 0);
                        this._binder.transact(2, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        return parcelObtain2.readInt() != 0;
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                }

                @Override // com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo
                public String getId() throws RemoteException {
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken(AdvertisingId.ADVERTISING_ID_SERVICE_NAME);
                        this._binder.transact(1, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        return parcelObtain2.readString();
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                }
            }

            public static GoogleAdvertisingInfo create(IBinder iBinder) {
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(AdvertisingId.ADVERTISING_ID_SERVICE_NAME);
                return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof GoogleAdvertisingInfo)) ? new GoogleAdvertisingInfoImplementation(iBinder) : (GoogleAdvertisingInfo) iInterfaceQueryLocalInterface;
            }

            @Override // android.os.Binder
            public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
                if (i10 == 1) {
                    parcel.enforceInterface(AdvertisingId.ADVERTISING_ID_SERVICE_NAME);
                    String id2 = getId();
                    parcel2.writeNoException();
                    parcel2.writeString(id2);
                    return true;
                }
                if (i10 != 2) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel.enforceInterface(AdvertisingId.ADVERTISING_ID_SERVICE_NAME);
                boolean enabled = getEnabled(parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeInt(enabled ? 1 : 0);
                return true;
            }
        }

        boolean getEnabled(boolean z10) throws RemoteException;

        String getId() throws RemoteException;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void fetchAdvertisingId(android.content.Context r6) {
        /*
            r5 = this;
            com.unity3d.services.core.device.AdvertisingId$GoogleAdvertisingServiceConnection r0 = new com.unity3d.services.core.device.AdvertisingId$GoogleAdvertisingServiceConnection
            r1 = 0
            r0.<init>()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "com.google.android.gms.ads.identifier.service.START"
            r1.<init>(r2)
            java.lang.String r2 = "com.google.android.gms"
            r1.setPackage(r2)
            r2 = 1
            boolean r1 = r6.bindService(r1, r0, r2)     // Catch: java.lang.Exception -> L18
            goto L1f
        L18:
            r1 = move-exception
            java.lang.String r3 = "Couldn't bind to identifier service intent"
            com.unity3d.services.core.log.DeviceLog.exception(r3, r1)
            r1 = 0
        L1f:
            if (r1 == 0) goto L4a
            android.os.IBinder r3 = r0.getBinder()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            com.unity3d.services.core.device.AdvertisingId$GoogleAdvertisingInfo r3 = com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo.GoogleAdvertisingInfoBinder.create(r3)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            java.lang.String r4 = r3.getId()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            r5.advertisingIdentifier = r4     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            boolean r2 = r3.getEnabled(r2)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            r5.limitedAdvertisingTracking = r2     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            goto L4a
        L36:
            r2 = move-exception
            goto L44
        L38:
            r2 = move-exception
            java.lang.String r3 = "Couldn't get advertising info"
            com.unity3d.services.core.log.DeviceLog.exception(r3, r2)     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L4d
        L40:
            r6.unbindService(r0)
            goto L4d
        L44:
            if (r1 == 0) goto L49
            r6.unbindService(r0)
        L49:
            throw r2
        L4a:
            if (r1 == 0) goto L4d
            goto L40
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.AdvertisingId.fetchAdvertisingId(android.content.Context):void");
    }

    public static String getAdvertisingTrackingId() {
        return getInstance().advertisingIdentifier;
    }

    private static AdvertisingId getInstance() {
        if (instance == null) {
            instance = new AdvertisingId();
        }
        return instance;
    }

    public static boolean getLimitedAdTracking() {
        return getInstance().limitedAdvertisingTracking;
    }

    public static void init(Context context) {
        getInstance().fetchAdvertisingId(context);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class GoogleAdvertisingServiceConnection implements ServiceConnection {
        private final BlockingQueue<IBinder> _binderQueue;
        boolean _consumed;

        private GoogleAdvertisingServiceConnection() {
            this._consumed = false;
            this._binderQueue = new LinkedBlockingQueue();
        }

        public IBinder getBinder() throws InterruptedException {
            if (this._consumed) {
                throw new IllegalStateException();
            }
            this._consumed = true;
            return this._binderQueue.take();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) throws IllegalAccessException, InterruptedException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            try {
                this._binderQueue.put(iBinder);
            } catch (InterruptedException unused) {
                DeviceLog.debug("Couldn't put service to binder que");
                Thread.currentThread().interrupt();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
