package androidx.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class MediaBrowserServiceCompat extends Service {

    /* renamed from: j, reason: collision with root package name */
    public static final boolean f6771j = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: b, reason: collision with root package name */
    public s f6772b;

    /* renamed from: g, reason: collision with root package name */
    public k f6776g;

    /* renamed from: i, reason: collision with root package name */
    public MediaSessionCompat.Token f6778i;

    /* renamed from: c, reason: collision with root package name */
    public final k f6773c = new k(this, "android.media.session.MediaController", -1, -1, null, null);

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f6774e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final z.f f6775f = new z.f();

    /* renamed from: h, reason: collision with root package name */
    public final k0 f6777h = new k0(this);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f6782a;

        /* renamed from: b, reason: collision with root package name */
        public final Bundle f6783b;

        public a(String str, Bundle bundle) {
            if (str == null) {
                throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
            }
            this.f6782a = str;
            this.f6783b = bundle;
        }

        public Bundle getExtras() {
            return this.f6783b;
        }

        public String getRootId() {
            return this.f6782a;
        }
    }

    public static List a(List list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i10 = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i11 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i10 == -1 && i11 == -1) {
            return list;
        }
        int i12 = i11 * i10;
        int size = i12 + i11;
        if (i10 < 0 || i11 < 1 || i12 >= list.size()) {
            return Collections.EMPTY_LIST;
        }
        if (size > list.size()) {
            size = list.size();
        }
        return list.subList(i12, size);
    }

    public void attachToBaseContext(Context context) {
        attachBaseContext(context);
    }

    public final void b(String str, k kVar, Bundle bundle, Bundle bundle2) {
        f fVar = new f(this, str, kVar, str, bundle, bundle2);
        this.f6776g = kVar;
        if (bundle == null) {
            onLoadChildren(str, fVar);
        } else {
            onLoadChildren(str, fVar, bundle);
        }
        this.f6776g = null;
        if (!fVar.a()) {
            throw new IllegalStateException(a.b.o(new StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package="), kVar.f6831a, " id=", str));
        }
    }

    public final Bundle getBrowserRootHints() {
        return this.f6772b.getBrowserRootHints();
    }

    public final l0 getCurrentBrowserInfo() {
        return this.f6772b.getCurrentBrowserInfo();
    }

    public MediaSessionCompat.Token getSessionToken() {
        return this.f6778i;
    }

    public void notifyChildrenChanged(String str) {
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        this.f6772b.notifyChildrenChanged(str, null);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f6772b.onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            this.f6772b = new v(this);
        } else if (i10 >= 26) {
            this.f6772b = new u(this);
        } else {
            this.f6772b = new s(this);
        }
        this.f6772b.onCreate();
    }

    public void onCustomAction(String str, Bundle bundle, w wVar) {
        wVar.sendError(null);
    }

    public abstract a onGetRoot(String str, int i10, Bundle bundle);

    public abstract void onLoadChildren(String str, w wVar);

    public void onLoadChildren(String str, w wVar, Bundle bundle) {
        wVar.f6877e = 1;
        onLoadChildren(str, wVar);
    }

    public void onLoadItem(String str, w wVar) {
        wVar.f6877e = 2;
        wVar.sendResult(null);
    }

    public void onSearch(String str, Bundle bundle, w wVar) {
        wVar.f6877e = 4;
        wVar.sendResult(null);
    }

    public void setSessionToken(MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (this.f6778i != null) {
            throw new IllegalStateException("The session token has already been set");
        }
        this.f6778i = token;
        this.f6772b.setSessionToken(token);
    }

    public void notifyChildrenChanged(String str, Bundle bundle) {
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (bundle != null) {
            this.f6772b.notifyChildrenChanged(str, bundle);
            return;
        }
        throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
    }

    public void notifyChildrenChanged(l0 l0Var, String str, Bundle bundle) {
        if (l0Var == null) {
            throw new IllegalArgumentException("remoteUserInfo cannot be null in notifyChildrenChanged");
        }
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (bundle != null) {
            this.f6772b.notifyChildrenChanged(l0Var, str, bundle);
            return;
        }
        throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
    }

    public void onUnsubscribe(String str) {
    }

    public void onSubscribe(String str, Bundle bundle) {
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
