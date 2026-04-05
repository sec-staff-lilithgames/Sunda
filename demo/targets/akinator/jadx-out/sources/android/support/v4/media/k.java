package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserCompat.d f4523b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4524c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f4525e;

    public k(String str, Bundle bundle, MediaBrowserCompat.d dVar) {
        this.f4523b = dVar;
        this.f4524c = str;
        this.f4525e = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4523b.onError(this.f4524c, this.f4525e);
    }
}
