package ec;

import ub.o;
import ub.x;
import ub.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g extends y {

    /* renamed from: d, reason: collision with root package name */
    public final g f54045d;

    /* renamed from: e, reason: collision with root package name */
    public b f54046e;

    /* renamed from: f, reason: collision with root package name */
    public g f54047f;

    /* renamed from: g, reason: collision with root package name */
    public String f54048g;

    /* renamed from: h, reason: collision with root package name */
    public Object f54049h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f54050i;

    public g(int i10, g gVar, b bVar) {
        this.f88378a = i10;
        this.f54045d = gVar;
        this.f88380c = gVar == null ? 0 : gVar.f88380c + 1;
        this.f54046e = bVar;
        this.f88379b = -1;
    }

    @Deprecated
    public static g createRootContext() {
        return createRootContext(null);
    }

    public g clearAndGetParent() {
        this.f54049h = null;
        return this.f54045d;
    }

    public g createChildArrayContext() {
        g gVar = this.f54047f;
        if (gVar != null) {
            return gVar.reset(1);
        }
        b bVar = this.f54046e;
        g gVar2 = new g(1, this, bVar == null ? null : bVar.child());
        this.f54047f = gVar2;
        return gVar2;
    }

    public g createChildObjectContext() {
        g gVar = this.f54047f;
        if (gVar != null) {
            return gVar.reset(2);
        }
        b bVar = this.f54046e;
        g gVar2 = new g(2, this, bVar == null ? null : bVar.child());
        this.f54047f = gVar2;
        return gVar2;
    }

    @Override // ub.y
    public final String getCurrentName() {
        return this.f54048g;
    }

    @Override // ub.y
    public Object getCurrentValue() {
        return this.f54049h;
    }

    public b getDupDetector() {
        return this.f54046e;
    }

    @Override // ub.y
    public boolean hasCurrentName() {
        return this.f54048g != null;
    }

    public g reset(int i10) {
        this.f88378a = i10;
        this.f88379b = -1;
        this.f54048g = null;
        this.f54050i = false;
        this.f54049h = null;
        b bVar = this.f54046e;
        if (bVar != null) {
            bVar.reset();
        }
        return this;
    }

    @Override // ub.y
    public void setCurrentValue(Object obj) {
        this.f54049h = obj;
    }

    public g withDupDetector(b bVar) {
        this.f54046e = bVar;
        return this;
    }

    public int writeFieldName(String str) throws x {
        if (this.f88378a != 2 || this.f54050i) {
            return 4;
        }
        this.f54050i = true;
        this.f54048g = str;
        b bVar = this.f54046e;
        if (bVar == null || !bVar.isDup(str)) {
            return this.f88379b < 0 ? 0 : 1;
        }
        Object source = bVar.getSource();
        throw new ub.m(a.b.l("Duplicate field '", str, "'"), source instanceof o ? (o) source : null);
    }

    public int writeValue() {
        int i10 = this.f88378a;
        if (i10 == 2) {
            if (!this.f54050i) {
                return 5;
            }
            this.f54050i = false;
            this.f88379b++;
            return 2;
        }
        if (i10 == 1) {
            int i11 = this.f88379b;
            this.f88379b = i11 + 1;
            if (i11 >= 0) {
                return 1;
            }
        } else {
            int i12 = this.f88379b + 1;
            this.f88379b = i12;
            if (i12 != 0) {
                return 3;
            }
        }
        return 0;
    }

    public static g createRootContext(b bVar) {
        return new g(0, null, bVar);
    }

    @Override // ub.y
    public final g getParent() {
        return this.f54045d;
    }

    public g createChildArrayContext(Object obj) {
        g gVar = this.f54047f;
        if (gVar == null) {
            b bVar = this.f54046e;
            g gVar2 = new g(1, this, bVar == null ? null : bVar.child(), obj);
            this.f54047f = gVar2;
            return gVar2;
        }
        return gVar.reset(1, obj);
    }

    public g createChildObjectContext(Object obj) {
        g gVar = this.f54047f;
        if (gVar == null) {
            b bVar = this.f54046e;
            g gVar2 = new g(2, this, bVar == null ? null : bVar.child(), obj);
            this.f54047f = gVar2;
            return gVar2;
        }
        return gVar.reset(2, obj);
    }

    public g(int i10, g gVar, b bVar, Object obj) {
        this.f88378a = i10;
        this.f54045d = gVar;
        this.f88380c = gVar.f88380c + 1;
        this.f54046e = bVar;
        this.f88379b = -1;
        this.f54049h = obj;
    }

    public g reset(int i10, Object obj) {
        this.f88378a = i10;
        this.f88379b = -1;
        this.f54048g = null;
        this.f54050i = false;
        this.f54049h = obj;
        b bVar = this.f54046e;
        if (bVar != null) {
            bVar.reset();
        }
        return this;
    }
}
