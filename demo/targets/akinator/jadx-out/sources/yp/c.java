package yp;

import android.net.Uri;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c implements wp.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f94754a;

    public c(k kVar) {
        this.f94754a = kVar;
    }

    @Override // wp.i
    public void onVideoLoaded(wp.j jVar, Uri uri) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        nm.a.d("MediaView video is loaded");
        k kVar = this.f94754a;
        ((vp.l) kVar.f94763c).setVideoUri(uri);
        kVar.g();
    }

    @Override // wp.i
    public void onVideoLoadingError(wp.j jVar) {
        nm.a.d("MediaView video is not loaded");
        k kVar = k.D;
        k kVar2 = this.f94754a;
        kVar2.l(1);
        kVar2.f94780u = false;
    }
}
