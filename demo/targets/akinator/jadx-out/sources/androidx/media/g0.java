package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.os.ResultReceiver;
import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f6821b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6822c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f6823e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f6824f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h0 f6825g;

    public g0(h0 h0Var, i0 i0Var, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.f6825g = h0Var;
        this.f6821b = i0Var;
        this.f6822c = str;
        this.f6823e = bundle;
        this.f6824f = resultReceiver;
    }

    @Override // java.lang.Runnable
    public void run() {
        IBinder iBinderAsBinder = ((j0) this.f6821b).asBinder();
        MediaBrowserServiceCompat mediaBrowserServiceCompat = this.f6825g.f6827a;
        k kVar = (k) mediaBrowserServiceCompat.f6775f.get(iBinderAsBinder);
        Bundle bundle = this.f6823e;
        String str = this.f6822c;
        if (kVar == null) {
            Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + str + ", extras=" + bundle);
            return;
        }
        i iVar = new i(str, this.f6824f);
        mediaBrowserServiceCompat.f6776g = kVar;
        mediaBrowserServiceCompat.onCustomAction(str, bundle, iVar);
        mediaBrowserServiceCompat.f6776g = null;
        if (iVar.a()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }
}
