package dh;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import yg.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class f extends j.a {

    /* renamed from: w, reason: collision with root package name */
    public final RectF f52229w;

    public f(yg.p pVar, RectF rectF) {
        super(pVar, null);
        this.f52229w = rectF;
    }

    @Override // yg.j.a, android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.J = this;
        gVar.invalidateSelf();
        return gVar;
    }

    public f(f fVar) {
        super(fVar);
        this.f52229w = fVar.f52229w;
    }
}
