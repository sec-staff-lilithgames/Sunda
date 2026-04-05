package td;

import android.content.Context;
import ud.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements pd.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f86825a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f86826b;

    /* renamed from: c, reason: collision with root package name */
    public final ru.a f86827c;

    /* renamed from: d, reason: collision with root package name */
    public final ru.a f86828d;

    public e(ru.a aVar, ru.a aVar2, ru.a aVar3, ru.a aVar4) {
        this.f86825a = aVar;
        this.f86826b = aVar2;
        this.f86827c = aVar3;
        this.f86828d = aVar4;
    }

    public static e create(ru.a aVar, ru.a aVar2, ru.a aVar3, ru.a aVar4) {
        return new e(aVar, aVar2, aVar3, aVar4);
    }

    public static l workScheduler(Context context, vd.d dVar, ud.e eVar, xd.a aVar) {
        return (l) pd.d.checkNotNullFromProvides(new ud.d(context, dVar, eVar));
    }

    @Override // pd.b, ru.a
    public l get() {
        return workScheduler((Context) this.f86825a.get(), (vd.d) this.f86826b.get(), (ud.e) this.f86827c.get(), (xd.a) this.f86828d.get());
    }
}
