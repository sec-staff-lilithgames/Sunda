package yp;

import android.net.Uri;
import io.bidmachine.iab.vast.t;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d implements wp.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f94755a;

    public d(k kVar) {
        this.f94755a = kVar;
    }

    @Override // wp.f
    public void onVideoLoaded(wp.g gVar, Uri uri, t tVar) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        nm.a.d("MediaView video is loaded");
        k kVar = this.f94755a;
        ((vp.l) kVar.f94763c).setVideoUri(uri);
        ((vp.l) kVar.f94763c).setVastRequest(tVar);
        kVar.g();
    }

    @Override // wp.f
    public void onVideoLoadingError(wp.g gVar) {
        nm.a.d("MediaView video is not loaded");
        k kVar = k.D;
        k kVar2 = this.f94755a;
        kVar2.l(1);
        kVar2.f94780u = false;
    }
}
