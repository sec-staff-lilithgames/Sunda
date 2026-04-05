package xi;

import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h implements vi.b {

    /* renamed from: d, reason: collision with root package name */
    public static final wi.a f92014d = new wi.a(2);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f92015a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f92016b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public ui.f f92017c = f92014d;

    public i build() {
        return new i(new HashMap(this.f92015a), new HashMap(this.f92016b), this.f92017c);
    }

    public h configureWith(vi.a aVar) {
        aVar.configure(this);
        return this;
    }

    public h registerFallbackEncoder(ui.f fVar) {
        this.f92017c = fVar;
        return this;
    }

    @Override // vi.b
    public <U> h registerEncoder(Class<U> cls, ui.f fVar) {
        this.f92015a.put(cls, fVar);
        this.f92016b.remove(cls);
        return this;
    }

    @Override // vi.b
    public <U> h registerEncoder(Class<U> cls, ui.h hVar) {
        this.f92016b.put(cls, hVar);
        this.f92015a.remove(cls);
        return this;
    }
}
