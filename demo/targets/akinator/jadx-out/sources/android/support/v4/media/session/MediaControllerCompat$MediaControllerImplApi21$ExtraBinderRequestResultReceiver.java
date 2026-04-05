package android.support.v4.media.session;

import android.os.Bundle;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f4543b;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        m mVar = (m) this.f4543b.get();
        if (mVar == null || bundle == null) {
            return;
        }
        synchronized (mVar.f4609b) {
            mVar.f4613f.setExtraBinder(e.asInterface(k3.p.getBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
            mVar.f4613f.setSession2Token(g6.b.getVersionedParcelable(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
            mVar.a();
        }
    }
}
