package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media.MediaBrowserServiceCompat;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$MediaBrowserServiceApi21 extends MediaBrowserService {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f6779b;

    public MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$MediaBrowserServiceApi21(q qVar, Context context) {
        this.f6779b = qVar;
        attachBaseContext(context);
    }

    @Override // android.service.media.MediaBrowserService
    public MediaBrowserService.BrowserRoot onGetRoot(String str, int i10, Bundle bundle) {
        MediaSessionCompat.ensureClassLoader(bundle);
        MediaBrowserServiceCompat.a aVarOnGetRoot = this.f6779b.onGetRoot(str, i10, bundle == null ? null : new Bundle(bundle));
        if (aVarOnGetRoot == null) {
            return null;
        }
        return new MediaBrowserService.BrowserRoot(aVarOnGetRoot.f6782a, aVarOnGetRoot.f6783b);
    }

    @Override // android.service.media.MediaBrowserService
    public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
        this.f6779b.onLoadChildren(str, new x(result));
    }
}
