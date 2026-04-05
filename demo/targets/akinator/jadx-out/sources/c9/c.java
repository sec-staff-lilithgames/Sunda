package c9;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import n8.v;
import p8.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final q8.d f11933a;

    /* renamed from: b, reason: collision with root package name */
    public final e f11934b;

    /* renamed from: c, reason: collision with root package name */
    public final e f11935c;

    public c(q8.d dVar, e eVar, e eVar2) {
        this.f11933a = dVar;
        this.f11934b = eVar;
        this.f11935c = eVar2;
    }

    @Override // c9.e
    public v0 transcode(v0 v0Var, v vVar) {
        Drawable drawable = (Drawable) v0Var.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f11934b.transcode(x8.e.obtain(((BitmapDrawable) drawable).getBitmap(), this.f11933a), vVar);
        }
        if (drawable instanceof b9.d) {
            return this.f11935c.transcode(v0Var, vVar);
        }
        return null;
    }
}
