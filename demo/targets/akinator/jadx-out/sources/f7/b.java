package f7;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f55452a;

    /* renamed from: b, reason: collision with root package name */
    public final l7.o f55453b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements h {
        @Override // f7.h
        public i create(Bitmap bitmap, l7.o oVar, a7.m mVar) {
            return new b(bitmap, oVar);
        }
    }

    public b(Bitmap bitmap, l7.o oVar) {
        this.f55452a = bitmap;
        this.f55453b = oVar;
    }

    @Override // f7.i
    public Object fetch(zu.d<? super g> dVar) {
        return new f(new BitmapDrawable(this.f55453b.getContext().getResources(), this.f55452a), false, c7.f.f11834c);
    }
}
