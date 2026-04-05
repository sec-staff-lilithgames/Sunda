package ec;

import ub.p;
import ub.q;
import ub.u;
import ub.x;
import ub.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class e extends y {

    /* renamed from: d, reason: collision with root package name */
    public final e f54032d;

    /* renamed from: e, reason: collision with root package name */
    public b f54033e;

    /* renamed from: f, reason: collision with root package name */
    public e f54034f;

    /* renamed from: g, reason: collision with root package name */
    public String f54035g;

    /* renamed from: h, reason: collision with root package name */
    public Object f54036h;

    /* renamed from: i, reason: collision with root package name */
    public int f54037i;

    /* renamed from: j, reason: collision with root package name */
    public int f54038j;

    public e(e eVar, int i10, b bVar, int i11, int i12, int i13) {
        this.f54032d = eVar;
        this.f54033e = bVar;
        this.f88378a = i11;
        this.f54037i = i12;
        this.f54038j = i13;
        this.f88379b = -1;
        this.f88380c = i10;
    }

    public static e createRootContext(int i10, int i11, b bVar) {
        return new e(null, 0, bVar, 0, i10, i11);
    }

    public e clearAndGetParent() {
        this.f54036h = null;
        return this.f54032d;
    }

    public e createChildArrayContext(int i10, int i11) {
        e eVar = this.f54034f;
        if (eVar != null) {
            eVar.reset(1, i10, i11);
            return eVar;
        }
        int i12 = this.f88380c + 1;
        b bVar = this.f54033e;
        e eVar2 = new e(this, i12, bVar == null ? null : bVar.child(), 1, i10, i11);
        this.f54034f = eVar2;
        return eVar2;
    }

    public e createChildObjectContext(int i10, int i11) {
        e eVar = this.f54034f;
        if (eVar != null) {
            eVar.reset(2, i10, i11);
            return eVar;
        }
        int i12 = this.f88380c + 1;
        b bVar = this.f54033e;
        e eVar2 = new e(this, i12, bVar == null ? null : bVar.child(), 2, i10, i11);
        this.f54034f = eVar2;
        return eVar2;
    }

    public boolean expectComma() {
        int i10 = this.f88379b + 1;
        this.f88379b = i10;
        return this.f88378a != 0 && i10 > 0;
    }

    @Override // ub.y
    public String getCurrentName() {
        return this.f54035g;
    }

    @Override // ub.y
    public Object getCurrentValue() {
        return this.f54036h;
    }

    public b getDupDetector() {
        return this.f54033e;
    }

    @Override // ub.y
    @Deprecated
    public p getStartLocation(Object obj) {
        return startLocation(cc.f.rawReference(obj));
    }

    @Override // ub.y
    public boolean hasCurrentName() {
        return this.f54035g != null;
    }

    public void reset(int i10, int i11, int i12) {
        this.f88378a = i10;
        this.f88379b = -1;
        this.f54037i = i11;
        this.f54038j = i12;
        this.f54035g = null;
        this.f54036h = null;
        b bVar = this.f54033e;
        if (bVar != null) {
            bVar.reset();
        }
    }

    public void setCurrentName(String str) throws x {
        this.f54035g = str;
        b bVar = this.f54033e;
        if (bVar == null || !bVar.isDup(str)) {
            return;
        }
        Object source = bVar.getSource();
        throw new q(source instanceof u ? (u) source : null, a.b.l("Duplicate field '", str, "'"));
    }

    @Override // ub.y
    public void setCurrentValue(Object obj) {
        this.f54036h = obj;
    }

    @Override // ub.y
    public p startLocation(cc.f fVar) {
        return new p(fVar, -1L, this.f54037i, this.f54038j);
    }

    public e withDupDetector(b bVar) {
        this.f54033e = bVar;
        return this;
    }

    public static e createRootContext(b bVar) {
        return new e(null, 0, bVar, 0, 1, 0);
    }

    @Override // ub.y
    public e getParent() {
        return this.f54032d;
    }

    @Deprecated
    public e(e eVar, b bVar, int i10, int i11, int i12) {
        this.f54032d = eVar;
        this.f54033e = bVar;
        this.f88378a = i10;
        this.f54037i = i11;
        this.f54038j = i12;
        this.f88379b = -1;
        this.f88380c = eVar == null ? 0 : eVar.f88380c + 1;
    }
}
