package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p extends o {
    @Override // android.support.v4.media.n, android.support.v4.media.f
    public void subscribe(String str, Bundle bundle, MediaBrowserCompat.g gVar) {
        if (this.f4538g != null && this.f4537f >= 2) {
            super.subscribe(str, bundle, gVar);
            return;
        }
        MediaBrowser mediaBrowser = this.f4533b;
        if (bundle == null) {
            mediaBrowser.subscribe(str, gVar.f4481a);
        } else {
            mediaBrowser.subscribe(str, bundle, gVar.f4481a);
        }
    }

    @Override // android.support.v4.media.n, android.support.v4.media.f
    public void unsubscribe(String str, MediaBrowserCompat.g gVar) {
        if (this.f4538g != null && this.f4537f >= 2) {
            super.unsubscribe(str, gVar);
            return;
        }
        MediaBrowser mediaBrowser = this.f4533b;
        if (gVar == null) {
            mediaBrowser.unsubscribe(str);
        } else {
            mediaBrowser.unsubscribe(str, gVar.f4481a);
        }
    }
}
