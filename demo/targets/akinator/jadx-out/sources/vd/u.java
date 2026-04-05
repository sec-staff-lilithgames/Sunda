package vd;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u implements pd.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f89234a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f89235b;

    /* renamed from: c, reason: collision with root package name */
    public final ru.a f89236c;

    public u(ru.a aVar, ru.a aVar2, ru.a aVar3) {
        this.f89234a = aVar;
        this.f89235b = aVar2;
        this.f89236c = aVar3;
    }

    public static u create(ru.a aVar, ru.a aVar2, ru.a aVar3) {
        return new u(aVar, aVar2, aVar3);
    }

    public static t newInstance(Context context, String str, int i10) {
        return new t(context, str, i10);
    }

    @Override // pd.b, ru.a
    public t get() {
        return newInstance((Context) this.f89234a.get(), (String) this.f89235b.get(), ((Integer) this.f89236c.get()).intValue());
    }
}
