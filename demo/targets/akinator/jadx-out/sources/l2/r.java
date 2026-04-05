package l2;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r implements h1 {

    /* renamed from: a, reason: collision with root package name */
    public final v f72360a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f72361b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f72362c;

    public r(v loader, Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(loader, "loader");
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f72360a = loader;
        this.f72361b = context;
        this.f72362c = new Object();
    }

    @Override // l2.h1
    public Object awaitLoad(w wVar, zu.d<Object> dVar) {
        if (!(wVar instanceof b)) {
            return this.f72360a.load(wVar);
        }
        ((b) wVar).getTypefaceLoader();
        throw null;
    }

    @Override // l2.h1
    public Object getCacheKey() {
        return this.f72362c;
    }

    public final v getLoader$ui_text_release() {
        return this.f72360a;
    }

    @Override // l2.h1
    public Object loadBlocking(w font) {
        kotlin.jvm.internal.e0.checkNotNullParameter(font, "font");
        if (!(font instanceof b)) {
            return this.f72360a.load(font);
        }
        ((b) font).getTypefaceLoader();
        throw null;
    }
}
