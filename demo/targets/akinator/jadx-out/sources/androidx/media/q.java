package androidx.media;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media.MediaBrowserServiceCompat;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class q implements l {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6855a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public MediaBrowserService f6856b;

    /* renamed from: c, reason: collision with root package name */
    public Messenger f6857c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat f6858d;

    public q(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        this.f6858d = mediaBrowserServiceCompat;
    }

    public final void a(k kVar, String str, Bundle bundle) {
        List<w3.e> list = (List) kVar.f6837g.get(str);
        if (list != null) {
            for (w3.e eVar : list) {
                if (e.hasDuplicatedItems(bundle, (Bundle) eVar.f90369b)) {
                    this.f6858d.b(str, kVar, (Bundle) eVar.f90369b, bundle);
                }
            }
        }
    }

    public void b(Bundle bundle, String str) {
        this.f6856b.notifyChildrenChanged(str);
    }

    @Override // androidx.media.l
    public Bundle getBrowserRootHints() {
        if (this.f6857c == null) {
            return null;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = this.f6858d;
        k kVar = mediaBrowserServiceCompat.f6776g;
        if (kVar == null) {
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }
        if (kVar.f6835e == null) {
            return null;
        }
        return new Bundle(mediaBrowserServiceCompat.f6776g.f6835e);
    }

    @Override // androidx.media.l
    public l0 getCurrentBrowserInfo() {
        k kVar = this.f6858d.f6776g;
        if (kVar != null) {
            return kVar.f6834d;
        }
        throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
    }

    @Override // androidx.media.l
    public void notifyChildrenChanged(String str, Bundle bundle) {
        b(bundle, str);
        this.f6858d.f6777h.post(new o(this, str, bundle));
    }

    @Override // androidx.media.l
    public IBinder onBind(Intent intent) {
        return this.f6856b.onBind(intent);
    }

    @Override // androidx.media.l
    public void onCreate() {
        MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$MediaBrowserServiceApi21 mediaBrowserServiceCompat$MediaBrowserServiceImplApi21$MediaBrowserServiceApi21 = new MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$MediaBrowserServiceApi21(this, this.f6858d);
        this.f6856b = mediaBrowserServiceCompat$MediaBrowserServiceImplApi21$MediaBrowserServiceApi21;
        mediaBrowserServiceCompat$MediaBrowserServiceImplApi21$MediaBrowserServiceApi21.onCreate();
    }

    public MediaBrowserServiceCompat.a onGetRoot(String str, int i10, Bundle bundle) {
        Bundle extras;
        MediaBrowserServiceCompat mediaBrowserServiceCompat = this.f6858d;
        int i11 = -1;
        if (bundle == null || bundle.getInt("extra_client_version", 0) == 0) {
            extras = null;
        } else {
            bundle.remove("extra_client_version");
            this.f6857c = new Messenger(mediaBrowserServiceCompat.f6777h);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("extra_service_version", 2);
            k3.p.putBinder(bundle2, "extra_messenger", this.f6857c.getBinder());
            MediaSessionCompat.Token token = mediaBrowserServiceCompat.f6778i;
            if (token != null) {
                android.support.v4.media.session.f extraBinder = token.getExtraBinder();
                k3.p.putBinder(bundle2, "extra_session_binder", extraBinder == null ? null : extraBinder.asBinder());
            } else {
                this.f6855a.add(bundle2);
            }
            i11 = bundle.getInt("extra_calling_pid", -1);
            bundle.remove("extra_calling_pid");
            extras = bundle2;
        }
        k kVar = new k(mediaBrowserServiceCompat, str, i11, i10, bundle, null);
        mediaBrowserServiceCompat.f6776g = kVar;
        MediaBrowserServiceCompat.a aVarOnGetRoot = mediaBrowserServiceCompat.onGetRoot(str, i10, bundle);
        mediaBrowserServiceCompat.f6776g = null;
        if (aVarOnGetRoot == null) {
            return null;
        }
        if (this.f6857c != null) {
            mediaBrowserServiceCompat.f6774e.add(kVar);
        }
        if (extras == null) {
            extras = aVarOnGetRoot.getExtras();
        } else if (aVarOnGetRoot.getExtras() != null) {
            extras.putAll(aVarOnGetRoot.getExtras());
        }
        return new MediaBrowserServiceCompat.a(aVarOnGetRoot.getRootId(), extras);
    }

    public void onLoadChildren(String str, x xVar) {
        n nVar = new n(str, xVar);
        MediaBrowserServiceCompat mediaBrowserServiceCompat = this.f6858d;
        mediaBrowserServiceCompat.f6776g = mediaBrowserServiceCompat.f6773c;
        mediaBrowserServiceCompat.onLoadChildren(str, nVar);
        mediaBrowserServiceCompat.f6776g = null;
    }

    @Override // androidx.media.l
    public void setSessionToken(MediaSessionCompat.Token token) {
        this.f6858d.f6777h.postOrRun(new m(this, token));
    }

    @Override // androidx.media.l
    public void notifyChildrenChanged(l0 l0Var, String str, Bundle bundle) {
        this.f6858d.f6777h.post(new p(this, l0Var, str, bundle));
    }
}
