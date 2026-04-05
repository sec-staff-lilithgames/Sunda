package b;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface l extends IInterface {

    /* renamed from: w8, reason: collision with root package name */
    public static final String f8320w8 = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    Bundle extraCommand(String str, Bundle bundle) throws RemoteException;

    boolean isEngagementSignalsApiAvailable(h hVar, Bundle bundle) throws RemoteException;

    boolean mayLaunchUrl(h hVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;

    boolean newAuthTabSession(d dVar, Bundle bundle) throws RemoteException;

    boolean newSession(h hVar) throws RemoteException;

    boolean newSessionWithExtras(h hVar, Bundle bundle) throws RemoteException;

    int postMessage(h hVar, String str, Bundle bundle) throws RemoteException;

    void prefetch(h hVar, Uri uri, Bundle bundle) throws RemoteException;

    void prefetchWithMultipleUrls(h hVar, List<Uri> list, Bundle bundle) throws RemoteException;

    boolean receiveFile(h hVar, Uri uri, int i10, Bundle bundle) throws RemoteException;

    boolean requestPostMessageChannel(h hVar, Uri uri) throws RemoteException;

    boolean requestPostMessageChannelWithExtras(h hVar, Uri uri, Bundle bundle) throws RemoteException;

    boolean setEngagementSignalsCallback(h hVar, IBinder iBinder, Bundle bundle) throws RemoteException;

    boolean updateVisuals(h hVar, Bundle bundle) throws RemoteException;

    boolean validateRelationship(h hVar, int i10, Uri uri, Bundle bundle) throws RemoteException;

    boolean warmup(long j10) throws RemoteException;
}
