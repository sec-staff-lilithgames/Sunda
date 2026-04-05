package x8;

import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class p0 implements n8.x {

    /* renamed from: a, reason: collision with root package name */
    public final z8.h f91861a;

    /* renamed from: b, reason: collision with root package name */
    public final q8.d f91862b;

    public p0(z8.h hVar, q8.d dVar) {
        this.f91861a = hVar;
        this.f91862b = dVar;
    }

    @Override // n8.x
    public p8.v0 decode(Uri uri, int i10, int i11, n8.v vVar) throws PackageManager.NameNotFoundException, NumberFormatException {
        p8.v0 v0VarDecode = this.f91861a.decode(uri, i10, i11, vVar);
        if (v0VarDecode == null) {
            return null;
        }
        return c0.a(this.f91862b, (Drawable) v0VarDecode.get(), i10, i11);
    }

    @Override // n8.x
    public boolean handles(Uri uri, n8.v vVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
