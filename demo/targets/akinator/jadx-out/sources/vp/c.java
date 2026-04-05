package vp;

import android.content.Context;
import android.net.Uri;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c implements wp.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f89511a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f89512b;

    public c(e eVar, Context context) {
        this.f89512b = eVar;
        this.f89511a = context;
    }

    @Override // wp.i
    public void onVideoLoaded(wp.j jVar, Uri uri) {
        e eVar = this.f89512b;
        eVar.f89519e.setVideoUri(uri);
        e.b(eVar, this.f89511a, uri);
        eVar.f89515a.remove(jVar);
        eVar.c();
    }

    @Override // wp.i
    public void onVideoLoadingError(wp.j jVar) {
        e.a(this.f89512b, jVar);
    }
}
