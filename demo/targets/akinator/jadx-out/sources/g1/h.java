package g1;

import e1.v;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: b, reason: collision with root package name */
    public final d f56670b;

    /* renamed from: c, reason: collision with root package name */
    public final kv.l f56671c;

    public h(d cacheDrawScope, kv.l onBuildDrawCache) {
        e0.checkNotNullParameter(cacheDrawScope, "cacheDrawScope");
        e0.checkNotNullParameter(onBuildDrawCache, "onBuildDrawCache");
        this.f56670b = cacheDrawScope;
        this.f56671c = onBuildDrawCache;
    }

    public static /* synthetic */ h copy$default(h hVar, d dVar, kv.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar = hVar.f56670b;
        }
        if ((i10 & 2) != 0) {
            lVar = hVar.f56671c;
        }
        return hVar.copy(dVar, lVar);
    }

    @Override // g1.g, g1.i, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // g1.g, g1.i, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    public final d component1() {
        return this.f56670b;
    }

    public final kv.l component2() {
        return this.f56671c;
    }

    public final h copy(d cacheDrawScope, kv.l onBuildDrawCache) {
        e0.checkNotNullParameter(cacheDrawScope, "cacheDrawScope");
        e0.checkNotNullParameter(onBuildDrawCache, "onBuildDrawCache");
        return new h(cacheDrawScope, onBuildDrawCache);
    }

    @Override // g1.g, g1.i
    public void draw(l1.e eVar) {
        e0.checkNotNullParameter(eVar, "<this>");
        l drawResult$ui_release = this.f56670b.getDrawResult$ui_release();
        e0.checkNotNull(drawResult$ui_release);
        drawResult$ui_release.getBlock$ui_release().invoke(eVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return e0.areEqual(this.f56670b, hVar.f56670b) && e0.areEqual(this.f56671c, hVar.f56671c);
    }

    @Override // g1.g, g1.i, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // g1.g, g1.i, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    public final d getCacheDrawScope() {
        return this.f56670b;
    }

    public final kv.l getOnBuildDrawCache() {
        return this.f56671c;
    }

    public int hashCode() {
        return this.f56671c.hashCode() + (this.f56670b.hashCode() * 31);
    }

    @Override // g1.g
    public void onBuildCache(b params) {
        e0.checkNotNullParameter(params, "params");
        d dVar = this.f56670b;
        dVar.setCacheParams$ui_release(params);
        dVar.setDrawResult$ui_release(null);
        this.f56671c.invoke(dVar);
        if (dVar.getDrawResult$ui_release() == null) {
            throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?");
        }
    }

    @Override // g1.g, g1.i, e1.u, e1.v
    public /* bridge */ /* synthetic */ v then(v vVar) {
        return super.then(vVar);
    }

    public String toString() {
        return "DrawContentCacheModifier(cacheDrawScope=" + this.f56670b + ", onBuildDrawCache=" + this.f56671c + ')';
    }
}
