package b;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface o extends IInterface {

    /* renamed from: x8, reason: collision with root package name */
    public static final String f8322x8 = "android$support$customtabs$IEngagementSignalsCallback".replace('$', '.');

    void onGreatestScrollPercentageIncreased(int i10, Bundle bundle) throws RemoteException;

    void onSessionEnded(boolean z10, Bundle bundle) throws RemoteException;

    void onVerticalScrollEvent(boolean z10, Bundle bundle) throws RemoteException;
}
