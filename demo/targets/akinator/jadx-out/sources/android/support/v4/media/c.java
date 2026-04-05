package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.support.v4.media.MediaBrowserCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends MediaBrowser.ConnectionCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserCompat.a f4512a;

    public c(MediaBrowserCompat.a aVar) {
        this.f4512a = aVar;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public void onConnected() {
        MediaBrowserCompat.a aVar = this.f4512a;
        n nVar = aVar.f4475b;
        if (nVar != null) {
            nVar.onConnected();
        }
        aVar.onConnected();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public void onConnectionFailed() {
        MediaBrowserCompat.a aVar = this.f4512a;
        n nVar = aVar.f4475b;
        if (nVar != null) {
            nVar.onConnectionFailed();
        }
        aVar.onConnectionFailed();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public void onConnectionSuspended() {
        MediaBrowserCompat.a aVar = this.f4512a;
        n nVar = aVar.f4475b;
        if (nVar != null) {
            nVar.onConnectionSuspended();
        }
        aVar.onConnectionSuspended();
    }
}
