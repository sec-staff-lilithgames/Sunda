package b;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface d extends IInterface {

    /* renamed from: u8, reason: collision with root package name */
    public static final String f8316u8 = "android$support$customtabs$IAuthTabCallback".replace('$', '.');

    void onExtraCallback(String str, Bundle bundle) throws RemoteException;

    Bundle onExtraCallbackWithResult(String str, Bundle bundle) throws RemoteException;

    void onNavigationEvent(int i10, Bundle bundle) throws RemoteException;

    void onWarmupCompleted(Bundle bundle) throws RemoteException;
}
