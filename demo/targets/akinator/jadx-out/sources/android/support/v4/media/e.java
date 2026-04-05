package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.support.v4.media.MediaBrowserCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e extends MediaBrowser.ItemCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserCompat.c f4513a;

    public e(MediaBrowserCompat.c cVar) {
        this.f4513a = cVar;
    }

    @Override // android.media.browse.MediaBrowser.ItemCallback
    public void onError(String str) {
        this.f4513a.onError(str);
    }

    @Override // android.media.browse.MediaBrowser.ItemCallback
    public void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
        this.f4513a.onItemLoaded(MediaBrowserCompat.MediaItem.fromMediaItem(mediaItem));
    }
}
