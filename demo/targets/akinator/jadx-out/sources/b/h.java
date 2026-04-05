package b;

import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface h extends IInterface {

    /* renamed from: v8, reason: collision with root package name */
    public static final String f8318v8 = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

    void extraCallback(String str, Bundle bundle) throws RemoteException;

    Bundle extraCallbackWithResult(String str, Bundle bundle) throws RemoteException;

    void onActivityLayout(int i10, int i11, int i12, int i13, int i14, Bundle bundle) throws RemoteException;

    void onActivityResized(int i10, int i11, Bundle bundle) throws RemoteException;

    void onMessageChannelReady(Bundle bundle) throws RemoteException;

    void onMinimized(Bundle bundle) throws RemoteException;

    void onNavigationEvent(int i10, Bundle bundle) throws RemoteException;

    void onPostMessage(String str, Bundle bundle) throws RemoteException;

    void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) throws RemoteException;

    void onUnminimized(Bundle bundle) throws RemoteException;

    void onWarmupCompleted(Bundle bundle) throws RemoteException;
}
