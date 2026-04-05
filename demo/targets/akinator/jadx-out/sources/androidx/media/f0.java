package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.os.ResultReceiver;
import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f6815b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6816c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f6817e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f6818f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h0 f6819g;

    public f0(h0 h0Var, i0 i0Var, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.f6819g = h0Var;
        this.f6815b = i0Var;
        this.f6816c = str;
        this.f6817e = bundle;
        this.f6818f = resultReceiver;
    }

    @Override // java.lang.Runnable
    public void run() {
        IBinder iBinderAsBinder = ((j0) this.f6815b).asBinder();
        MediaBrowserServiceCompat mediaBrowserServiceCompat = this.f6819g.f6827a;
        k kVar = (k) mediaBrowserServiceCompat.f6775f.get(iBinderAsBinder);
        String str = this.f6816c;
        if (kVar == null) {
            Log.w("MBServiceCompat", "search for callback that isn't registered query=" + str);
        } else {
            h hVar = new h(str, this.f6818f);
            mediaBrowserServiceCompat.f6776g = kVar;
            mediaBrowserServiceCompat.onSearch(str, this.f6817e, hVar);
            mediaBrowserServiceCompat.f6776g = null;
            if (!hVar.a()) {
                throw new IllegalStateException(a.b.k("onSearch must call detach() or sendResult() before returning for query=", str));
            }
        }
    }
}
