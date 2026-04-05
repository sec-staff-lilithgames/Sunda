package androidx.browser.customtabs;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q0 extends b.q {
    @Override // b.q, b.r
    public void onMessageChannelReady(b.h hVar, Bundle bundle) throws RemoteException {
        hVar.onMessageChannelReady(bundle);
    }

    @Override // b.q, b.r
    public void onPostMessage(b.h hVar, String str, Bundle bundle) throws RemoteException {
        hVar.onPostMessage(str, bundle);
    }
}
