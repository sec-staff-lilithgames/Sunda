package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserCompat.b f4526b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4527c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f4528e;

    public l(String str, Bundle bundle, MediaBrowserCompat.b bVar) {
        this.f4526b = bVar;
        this.f4527c = str;
        this.f4528e = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4526b.onError(this.f4527c, this.f4528e, null);
    }
}
