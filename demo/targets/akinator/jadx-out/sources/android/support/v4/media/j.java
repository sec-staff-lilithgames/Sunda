package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserCompat.d f4520b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4521c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f4522e;

    public j(String str, Bundle bundle, MediaBrowserCompat.d dVar) {
        this.f4520b = dVar;
        this.f4521c = str;
        this.f4522e = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4520b.onError(this.f4521c, this.f4522e);
    }
}
