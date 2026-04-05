package androidx.media;

import android.os.IBinder;
import android.support.v4.os.ResultReceiver;
import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f6794b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6795c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f6796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h0 f6797f;

    public c0(h0 h0Var, i0 i0Var, String str, ResultReceiver resultReceiver) {
        this.f6797f = h0Var;
        this.f6794b = i0Var;
        this.f6795c = str;
        this.f6796e = resultReceiver;
    }

    @Override // java.lang.Runnable
    public void run() {
        IBinder iBinderAsBinder = ((j0) this.f6794b).asBinder();
        MediaBrowserServiceCompat mediaBrowserServiceCompat = this.f6797f.f6827a;
        k kVar = (k) mediaBrowserServiceCompat.f6775f.get(iBinderAsBinder);
        String str = this.f6795c;
        if (kVar == null) {
            Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + str);
        } else {
            g gVar = new g(str, this.f6796e);
            mediaBrowserServiceCompat.f6776g = kVar;
            mediaBrowserServiceCompat.onLoadItem(str, gVar);
            mediaBrowserServiceCompat.f6776g = null;
            if (!gVar.a()) {
                throw new IllegalStateException(a.b.k("onLoadItem must call detach() or sendResult() before returning for id=", str));
            }
        }
    }
}
