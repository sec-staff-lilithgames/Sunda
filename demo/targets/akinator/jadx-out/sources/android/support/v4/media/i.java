package android.support.v4.media;

import android.support.v4.media.MediaBrowserCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserCompat.c f4518b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4519c;

    public i(String str, MediaBrowserCompat.c cVar) {
        this.f4518b = cVar;
        this.f4519c = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4518b.onError(this.f4519c);
    }
}
