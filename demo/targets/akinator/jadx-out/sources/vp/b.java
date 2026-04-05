package vp;

import android.graphics.Bitmap;
import android.net.Uri;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b implements wp.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f89510a;

    public b(e eVar) {
        this.f89510a = eVar;
    }

    @Override // wp.c
    public void onFail(wp.d dVar) {
        e.a(this.f89510a, dVar);
    }

    @Override // wp.c
    public void onImageSuccess(wp.d dVar, Bitmap bitmap) {
        e eVar = this.f89510a;
        eVar.f89519e.setImageBitmap(bitmap);
        eVar.f89515a.remove(dVar);
        eVar.c();
    }

    @Override // wp.c
    public void onPathSuccess(wp.d dVar, Uri uri) {
        e eVar = this.f89510a;
        eVar.f89519e.setImageUri(uri);
        eVar.f89515a.remove(dVar);
        eVar.c();
    }
}
