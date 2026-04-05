package jj;

import android.app.Application;
import android.util.DisplayMetrics;
import java.util.Map;
import kj.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class m implements p {

    /* renamed from: a, reason: collision with root package name */
    public final kj.h f69654a;

    /* renamed from: b, reason: collision with root package name */
    public final gj.f f69655b;

    /* renamed from: c, reason: collision with root package name */
    public final gj.f f69656c = gj.b.provider(hj.p.create());

    /* renamed from: d, reason: collision with root package name */
    public final gj.f f69657d;

    /* renamed from: e, reason: collision with root package name */
    public final kj.m f69658e;

    /* renamed from: f, reason: collision with root package name */
    public final q f69659f;

    /* renamed from: g, reason: collision with root package name */
    public final kj.n f69660g;

    /* renamed from: h, reason: collision with root package name */
    public final kj.o f69661h;

    /* renamed from: i, reason: collision with root package name */
    public final kj.p f69662i;

    /* renamed from: j, reason: collision with root package name */
    public final kj.k f69663j;

    /* renamed from: k, reason: collision with root package name */
    public final kj.l f69664k;

    /* renamed from: l, reason: collision with root package name */
    public final kj.j f69665l;

    /* renamed from: m, reason: collision with root package name */
    public final kj.i f69666m;

    public m(kj.a aVar, kj.h hVar) {
        this.f69654a = hVar;
        this.f69655b = gj.b.provider(kj.b.create(aVar));
        this.f69657d = gj.b.provider(hj.b.create(this.f69655b));
        kj.m mVarCreate = kj.m.create(hVar, this.f69655b);
        this.f69658e = mVarCreate;
        this.f69659f = q.create(hVar, mVarCreate);
        this.f69660g = kj.n.create(hVar, this.f69658e);
        this.f69661h = kj.o.create(hVar, this.f69658e);
        this.f69662i = kj.p.create(hVar, this.f69658e);
        this.f69663j = kj.k.create(hVar, this.f69658e);
        this.f69664k = kj.l.create(hVar, this.f69658e);
        this.f69665l = kj.j.create(hVar, this.f69658e);
        this.f69666m = kj.i.create(hVar, this.f69658e);
    }

    @Override // jj.p
    public DisplayMetrics displayMetrics() {
        return kj.m.providesDisplayMetrics(this.f69654a, (Application) this.f69655b.get());
    }

    @Override // jj.p
    public hj.n fiamWindowManager() {
        return (hj.n) this.f69656c.get();
    }

    @Override // jj.p
    public hj.a inflaterClient() {
        return (hj.a) this.f69657d.get();
    }

    @Override // jj.p
    public Map<String, ru.a> myKeyStringMap() {
        return gj.d.newMapBuilder(8).put("IMAGE_ONLY_PORTRAIT", this.f69659f).put("IMAGE_ONLY_LANDSCAPE", this.f69660g).put("MODAL_LANDSCAPE", this.f69661h).put("MODAL_PORTRAIT", this.f69662i).put("CARD_LANDSCAPE", this.f69663j).put("CARD_PORTRAIT", this.f69664k).put("BANNER_PORTRAIT", this.f69665l).put("BANNER_LANDSCAPE", this.f69666m).build();
    }

    @Override // jj.p
    public Application providesApplication() {
        return (Application) this.f69655b.get();
    }
}
