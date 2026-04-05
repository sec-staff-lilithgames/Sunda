package vp;

import android.content.Context;
import android.net.Uri;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d implements wp.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f89513a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f89514b;

    public d(e eVar, Context context) {
        this.f89514b = eVar;
        this.f89513a = context;
    }

    @Override // wp.f
    public void onVideoLoaded(wp.g gVar, Uri uri, io.bidmachine.iab.vast.t tVar) {
        e eVar = this.f89514b;
        l lVar = eVar.f89519e;
        lVar.setVideoUri(uri);
        lVar.setVastRequest(tVar);
        e.b(eVar, this.f89513a, uri);
        eVar.f89515a.remove(gVar);
        eVar.c();
    }

    @Override // wp.f
    public void onVideoLoadingError(wp.g gVar) {
        e.a(this.f89514b, gVar);
    }
}
