package vd;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h implements pd.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f89212a;

    public h(ru.a aVar) {
        this.f89212a = aVar;
    }

    public static h create(ru.a aVar) {
        return new h(aVar);
    }

    public static String packageName(Context context) {
        return (String) pd.d.checkNotNullFromProvides(context.getPackageName());
    }

    @Override // pd.b, ru.a
    public String get() {
        return packageName((Context) this.f89212a.get());
    }
}
