package nd;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l implements pd.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f75995a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f75996b;

    /* renamed from: c, reason: collision with root package name */
    public final ru.a f75997c;

    public l(ru.a aVar, ru.a aVar2, ru.a aVar3) {
        this.f75995a = aVar;
        this.f75996b = aVar2;
        this.f75997c = aVar3;
    }

    public static l create(ru.a aVar, ru.a aVar2, ru.a aVar3) {
        return new l(aVar, aVar2, aVar3);
    }

    public static k newInstance(Context context, xd.a aVar, xd.a aVar2) {
        return new k(context, aVar, aVar2);
    }

    @Override // pd.b, ru.a
    public k get() {
        return newInstance((Context) this.f75995a.get(), (xd.a) this.f75996b.get(), (xd.a) this.f75997c.get());
    }
}
