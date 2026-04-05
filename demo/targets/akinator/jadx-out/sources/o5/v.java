package o5;

import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface v extends IInterface {
    public static final String T8 = "androidx$room$IMultiInstanceInvalidationService".replace('$', '.');

    void broadcastInvalidation(int i10, String[] strArr) throws RemoteException;

    int registerCallback(s sVar, String str) throws RemoteException;

    void unregisterCallback(s sVar, int i10) throws RemoteException;
}
