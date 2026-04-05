package hj;

import android.app.Application;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Application f58929a;

    public a(Application application) {
        this.f58929a = application;
    }

    public ij.c createBannerBindingWrapper(s sVar, rj.o oVar) {
        return ((jj.j) jj.k.builder().inflaterModule(new kj.r(oVar, sVar, this.f58929a)).build()).bannerBindingWrapper();
    }

    public ij.c createCardBindingWrapper(s sVar, rj.o oVar) {
        return ((jj.j) jj.k.builder().inflaterModule(new kj.r(oVar, sVar, this.f58929a)).build()).cardBindingWrapper();
    }

    public ij.c createImageBindingWrapper(s sVar, rj.o oVar) {
        return ((jj.j) jj.k.builder().inflaterModule(new kj.r(oVar, sVar, this.f58929a)).build()).imageBindingWrapper();
    }

    public ij.c createModalBindingWrapper(s sVar, rj.o oVar) {
        return ((jj.j) jj.k.builder().inflaterModule(new kj.r(oVar, sVar, this.f58929a)).build()).modalBindingWrapper();
    }
}
