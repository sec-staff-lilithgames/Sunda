package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserCompat.b f4529b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4530c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f4531e;

    public m(String str, Bundle bundle, MediaBrowserCompat.b bVar) {
        this.f4529b = bVar;
        this.f4530c = str;
        this.f4531e = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4529b.onError(this.f4530c, this.f4531e, null);
    }
}
