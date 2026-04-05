package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t extends s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserCompat.g f4639b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(MediaBrowserCompat.g gVar) {
        super(gVar);
        this.f4639b = gVar;
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
        MediaSessionCompat.ensureClassLoader(bundle);
        this.f4639b.onChildrenLoaded(str, MediaBrowserCompat.MediaItem.fromMediaItemList(list), bundle);
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public void onError(String str, Bundle bundle) {
        MediaSessionCompat.ensureClassLoader(bundle);
        this.f4639b.onError(str, bundle);
    }
}
