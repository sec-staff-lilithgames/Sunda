package f7;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import q7.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f55458a;

    /* renamed from: b, reason: collision with root package name */
    public final l7.o f55459b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements h {
        @Override // f7.h
        public i create(Drawable drawable, l7.o oVar, a7.m mVar) {
            return new e(drawable, oVar);
        }
    }

    public e(Drawable drawable, l7.o oVar) {
        this.f55458a = drawable;
        this.f55459b = oVar;
    }

    @Override // f7.i
    public Object fetch(zu.d<? super g> dVar) {
        Drawable bitmapDrawable = this.f55458a;
        boolean zIsVector = q7.n.isVector(bitmapDrawable);
        if (zIsVector) {
            l7.o oVar = this.f55459b;
            bitmapDrawable = new BitmapDrawable(oVar.getContext().getResources(), p.f82549a.convertToBitmap(this.f55458a, oVar.getConfig(), oVar.getSize(), oVar.getScale(), oVar.getAllowInexactSize()));
        }
        return new f(bitmapDrawable, zIsVector, c7.f.f11834c);
    }
}
