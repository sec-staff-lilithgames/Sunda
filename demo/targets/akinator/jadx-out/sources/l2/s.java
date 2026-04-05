package l2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s implements h1 {

    /* renamed from: a, reason: collision with root package name */
    public final v f72368a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f72369b;

    public s(v loader) {
        kotlin.jvm.internal.e0.checkNotNullParameter(loader, "loader");
        this.f72368a = loader;
        this.f72369b = new Object();
    }

    @Override // l2.h1
    public Object awaitLoad(w wVar, zu.d<Object> dVar) {
        return this.f72368a.load(wVar);
    }

    @Override // l2.h1
    public Object getCacheKey() {
        return this.f72369b;
    }

    public final v getLoader$ui_text_release() {
        return this.f72368a;
    }

    @Override // l2.h1
    public Object loadBlocking(w font) {
        kotlin.jvm.internal.e0.checkNotNullParameter(font, "font");
        return this.f72368a.load(font);
    }
}
