package vd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q implements pd.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f89223a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f89224b;

    /* renamed from: c, reason: collision with root package name */
    public final ru.a f89225c;

    /* renamed from: d, reason: collision with root package name */
    public final ru.a f89226d;

    /* renamed from: e, reason: collision with root package name */
    public final ru.a f89227e;

    public q(ru.a aVar, ru.a aVar2, ru.a aVar3, ru.a aVar4, ru.a aVar5) {
        this.f89223a = aVar;
        this.f89224b = aVar2;
        this.f89225c = aVar3;
        this.f89226d = aVar4;
        this.f89227e = aVar5;
    }

    public static q create(ru.a aVar, ru.a aVar2, ru.a aVar3, ru.a aVar4, ru.a aVar5) {
        return new q(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static p newInstance(xd.a aVar, xd.a aVar2, Object obj, Object obj2, ru.a aVar3) {
        return new p(aVar, aVar2, (e) obj, (t) obj2, aVar3);
    }

    @Override // pd.b, ru.a
    public p get() {
        return newInstance((xd.a) this.f89223a.get(), (xd.a) this.f89224b.get(), this.f89225c.get(), this.f89226d.get(), this.f89227e);
    }
}
