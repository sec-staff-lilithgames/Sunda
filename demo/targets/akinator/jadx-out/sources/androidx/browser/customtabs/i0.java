package androidx.browser.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i0 extends b.j {
    @Override // b.j, b.l
    public Bundle extraCommand(String str, Bundle bundle) throws RemoteException {
        return null;
    }

    @Override // b.j, b.l
    public boolean isEngagementSignalsApiAvailable(b.h hVar, Bundle bundle) throws RemoteException {
        return false;
    }

    @Override // b.j, b.l
    public boolean mayLaunchUrl(b.h hVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
        return false;
    }

    @Override // b.j, b.l
    public boolean newAuthTabSession(b.d dVar, Bundle bundle) throws RemoteException {
        return false;
    }

    @Override // b.j, b.l
    public boolean newSession(b.h hVar) throws RemoteException {
        return false;
    }

    @Override // b.j, b.l
    public boolean newSessionWithExtras(b.h hVar, Bundle bundle) throws RemoteException {
        return false;
    }

    @Override // b.j, b.l
    public int postMessage(b.h hVar, String str, Bundle bundle) throws RemoteException {
        return 0;
    }

    @Override // b.j, b.l
    public boolean receiveFile(b.h hVar, Uri uri, int i10, Bundle bundle) throws RemoteException {
        return false;
    }

    @Override // b.j, b.l
    public boolean requestPostMessageChannel(b.h hVar, Uri uri) throws RemoteException {
        return false;
    }

    @Override // b.j, b.l
    public boolean requestPostMessageChannelWithExtras(b.h hVar, Uri uri, Bundle bundle) throws RemoteException {
        return false;
    }

    @Override // b.j, b.l
    public boolean setEngagementSignalsCallback(b.h hVar, IBinder iBinder, Bundle bundle) throws RemoteException {
        return false;
    }

    @Override // b.j, b.l
    public boolean updateVisuals(b.h hVar, Bundle bundle) throws RemoteException {
        return false;
    }

    @Override // b.j, b.l
    public boolean validateRelationship(b.h hVar, int i10, Uri uri, Bundle bundle) throws RemoteException {
        return false;
    }

    @Override // b.j, b.l
    public boolean warmup(long j10) throws RemoteException {
        return false;
    }

    @Override // b.j, b.l
    public void prefetch(b.h hVar, Uri uri, Bundle bundle) throws RemoteException {
    }

    @Override // b.j, b.l
    public void prefetchWithMultipleUrls(b.h hVar, List<Uri> list, Bundle bundle) throws RemoteException {
    }
}
