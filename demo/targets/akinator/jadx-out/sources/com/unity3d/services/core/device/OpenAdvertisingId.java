package com.unity3d.services.core.device;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Build;
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
public class OpenAdvertisingId {
    private static final String HW_DEVICE_NAME = "HUAWEI";
    private static final String HW_OPEN_ADVERTISING_ID_SERVICE_NAME = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";
    private static OpenAdvertisingId instance;
    private String openAdvertisingIdentifier = null;
    private boolean limitedOpenAdTracking = false;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface HWAdvertisingInfo extends IInterface {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static abstract class HWAdvertisingInfoBinder extends Binder implements HWAdvertisingInfo {

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static class HWAdvertisingInfoImplementation implements HWAdvertisingInfo {
                private final IBinder _binder;

                public HWAdvertisingInfoImplementation(IBinder iBinder) {
                    this._binder = iBinder;
                }

                @Override // android.os.IInterface
                public IBinder asBinder() {
                    return this._binder;
                }

                @Override // com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo
                public boolean getEnabled(boolean z10) throws RemoteException {
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken(OpenAdvertisingId.HW_OPEN_ADVERTISING_ID_SERVICE_NAME);
                        parcelObtain.writeInt(z10 ? 1 : 0);
                        this._binder.transact(2, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        return parcelObtain2.readInt() != 0;
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                }

                @Override // com.unity3d.services.core.device.OpenAdvertisingId.HWAdvertisingInfo
                public String getId() throws RemoteException {
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken(OpenAdvertisingId.HW_OPEN_ADVERTISING_ID_SERVICE_NAME);
                        this._binder.transact(1, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        return parcelObtain2.readString();
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                }
            }

            public static HWAdvertisingInfo create(IBinder iBinder) {
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(OpenAdvertisingId.HW_OPEN_ADVERTISING_ID_SERVICE_NAME);
                return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof HWAdvertisingInfo)) ? new HWAdvertisingInfoImplementation(iBinder) : (HWAdvertisingInfo) iInterfaceQueryLocalInterface;
            }

            @Override // android.os.Binder
            public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
                if (i10 == 1) {
                    parcel.enforceInterface(OpenAdvertisingId.HW_OPEN_ADVERTISING_ID_SERVICE_NAME);
                    String id2 = getId();
                    parcel2.writeNoException();
                    parcel2.writeString(id2);
                    return true;
                }
                if (i10 != 2) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel.enforceInterface(OpenAdvertisingId.HW_OPEN_ADVERTISING_ID_SERVICE_NAME);
                boolean enabled = getEnabled(parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeInt(enabled ? 1 : 0);
                return true;
            }
        }

        boolean getEnabled(boolean z10) throws RemoteException;

        String getId() throws RemoteException;
    }

    private void fetchOAId(Context context) {
        HWAdvertisingServiceConnection hWAdvertisingServiceConnection = new HWAdvertisingServiceConnection();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        try {
            try {
                if (context.bindService(intent, hWAdvertisingServiceConnection, 1)) {
                    HWAdvertisingInfo hWAdvertisingInfoCreate = HWAdvertisingInfo.HWAdvertisingInfoBinder.create(hWAdvertisingServiceConnection.getBinder());
                    this.openAdvertisingIdentifier = hWAdvertisingInfoCreate.getId();
                    this.limitedOpenAdTracking = hWAdvertisingInfoCreate.getEnabled(true);
                }
            } catch (Exception e10) {
                DeviceLog.exception("Couldn't get openAdvertising info", e10);
            } finally {
                context.unbindService(hWAdvertisingServiceConnection);
            }
        } catch (Exception e11) {
            DeviceLog.exception("Couldn't bind to identifier service intent", e11);
        }
    }

    private static OpenAdvertisingId getInstance() {
        if (instance == null) {
            instance = new OpenAdvertisingId();
        }
        return instance;
    }

    public static boolean getLimitedOpenAdTracking() {
        return getInstance().limitedOpenAdTracking;
    }

    public static String getOpenAdvertisingTrackingId() {
        return getInstance().openAdvertisingIdentifier;
    }

    public static void init(Context context) {
        if (Build.MANUFACTURER.toUpperCase().equals(HW_DEVICE_NAME)) {
            getInstance().fetchOAId(context);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class HWAdvertisingServiceConnection implements ServiceConnection {
        private final BlockingQueue<IBinder> _binderQueue;
        boolean _consumed;

        private HWAdvertisingServiceConnection() {
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
