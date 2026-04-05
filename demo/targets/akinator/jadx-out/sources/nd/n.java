package nd;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n implements pd.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f76001a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f76002b;

    public n(ru.a aVar, ru.a aVar2) {
        this.f76001a = aVar;
        this.f76002b = aVar2;
    }

    public static n create(ru.a aVar, ru.a aVar2) {
        return new n(aVar, aVar2);
    }

    public static m newInstance(Context context, Object obj) {
        return new m(context, (k) obj);
    }

    @Override // pd.b, ru.a
    public m get() {
        return newInstance((Context) this.f76001a.get(), this.f76002b.get());
    }
}
