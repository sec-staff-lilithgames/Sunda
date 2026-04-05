package b;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface r extends IInterface {

    /* renamed from: y8, reason: collision with root package name */
    public static final String f8324y8 = "android$support$customtabs$IPostMessageService".replace('$', '.');

    void onMessageChannelReady(h hVar, Bundle bundle) throws RemoteException;

    void onPostMessage(h hVar, String str, Bundle bundle) throws RemoteException;
}
