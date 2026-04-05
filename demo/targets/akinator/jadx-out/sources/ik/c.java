package ik;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class c implements hk.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f59669a;

    public c(ru.a aVar) {
        this.f59669a = aVar;
    }

    public static c create(ru.a aVar) {
        return new c(aVar);
    }

    public static b newInstance(Context context) {
        return new b(context);
    }

    @Override // hk.b, hk.e, ru.a
    public b get() {
        return newInstance((Context) this.f59669a.get());
    }
}
