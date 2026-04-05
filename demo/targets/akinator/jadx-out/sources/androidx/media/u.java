package androidx.media;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class u extends s {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat f6871f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        super(mediaBrowserServiceCompat);
        this.f6871f = mediaBrowserServiceCompat;
    }

    @Override // androidx.media.q
    public final void b(Bundle bundle, String str) {
        if (bundle != null) {
            this.f6856b.notifyChildrenChanged(str, bundle);
        } else {
            super.b(bundle, str);
        }
    }

    @Override // androidx.media.q, androidx.media.l
    public Bundle getBrowserRootHints() {
        MediaBrowserServiceCompat mediaBrowserServiceCompat = this.f6871f;
        k kVar = mediaBrowserServiceCompat.f6776g;
        if (kVar == null) {
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }
        if (kVar == mediaBrowserServiceCompat.f6773c) {
            return this.f6856b.getBrowserRootHints();
        }
        if (kVar.f6835e == null) {
            return null;
        }
        return new Bundle(mediaBrowserServiceCompat.f6776g.f6835e);
    }

    @Override // androidx.media.s, androidx.media.q, androidx.media.l
    public void onCreate() {
        final MediaBrowserServiceCompat mediaBrowserServiceCompat = this.f6871f;
        MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi23 mediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi23 = new MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi23(mediaBrowserServiceCompat) { // from class: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$MediaBrowserServiceApi26
            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                MediaSessionCompat.ensureClassLoader(bundle);
                u uVar = this.f6781e;
                MediaBrowserServiceCompat mediaBrowserServiceCompat2 = uVar.f6871f;
                mediaBrowserServiceCompat2.f6776g = mediaBrowserServiceCompat2.f6773c;
                uVar.onLoadChildren(str, new x(result), bundle);
                uVar.f6871f.f6776g = null;
            }
        };
        this.f6856b = mediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi23;
        mediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi23.onCreate();
    }

    public void onLoadChildren(String str, x xVar, Bundle bundle) {
        t tVar = new t(this, str, xVar, bundle);
        MediaBrowserServiceCompat mediaBrowserServiceCompat = this.f6871f;
        mediaBrowserServiceCompat.f6776g = mediaBrowserServiceCompat.f6773c;
        mediaBrowserServiceCompat.onLoadChildren(str, tVar, bundle);
        mediaBrowserServiceCompat.f6776g = null;
    }
}
