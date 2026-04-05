package ki;

import j1.o2;
import java.util.List;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class x0 extends f2.e.d.a.AbstractC0718a {

    /* renamed from: a, reason: collision with root package name */
    public f2.e.d.a.b f71508a;

    /* renamed from: b, reason: collision with root package name */
    public List f71509b;

    /* renamed from: c, reason: collision with root package name */
    public List f71510c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f71511d;

    /* renamed from: e, reason: collision with root package name */
    public f2.e.d.a.c f71512e;

    /* renamed from: f, reason: collision with root package name */
    public List f71513f;

    /* renamed from: g, reason: collision with root package name */
    public int f71514g;

    /* renamed from: h, reason: collision with root package name */
    public byte f71515h;

    @Override // ki.f2.e.d.a.AbstractC0718a
    public f2.e.d.a build() {
        f2.e.d.a.b bVar;
        if (this.f71515h == 1 && (bVar = this.f71508a) != null) {
            return new y0(bVar, this.f71509b, this.f71510c, this.f71511d, this.f71512e, this.f71513f, this.f71514g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f71508a == null) {
            sb2.append(" execution");
        }
        if ((1 & this.f71515h) == 0) {
            sb2.append(" uiOrientation");
        }
        throw new IllegalStateException(o2.m("Missing required properties:", sb2));
    }

    @Override // ki.f2.e.d.a.AbstractC0718a
    public f2.e.d.a.AbstractC0718a setAppProcessDetails(List<f2.e.d.a.c> list) {
        this.f71513f = list;
        return this;
    }

    @Override // ki.f2.e.d.a.AbstractC0718a
    public f2.e.d.a.AbstractC0718a setBackground(Boolean bool) {
        this.f71511d = bool;
        return this;
    }

    @Override // ki.f2.e.d.a.AbstractC0718a
    public f2.e.d.a.AbstractC0718a setCurrentProcessDetails(f2.e.d.a.c cVar) {
        this.f71512e = cVar;
        return this;
    }

    @Override // ki.f2.e.d.a.AbstractC0718a
    public f2.e.d.a.AbstractC0718a setCustomAttributes(List<f2.c> list) {
        this.f71509b = list;
        return this;
    }

    @Override // ki.f2.e.d.a.AbstractC0718a
    public f2.e.d.a.AbstractC0718a setExecution(f2.e.d.a.b bVar) {
        if (bVar == null) {
            throw new NullPointerException("Null execution");
        }
        this.f71508a = bVar;
        return this;
    }

    @Override // ki.f2.e.d.a.AbstractC0718a
    public f2.e.d.a.AbstractC0718a setInternalKeys(List<f2.c> list) {
        this.f71510c = list;
        return this;
    }

    @Override // ki.f2.e.d.a.AbstractC0718a
    public f2.e.d.a.AbstractC0718a setUiOrientation(int i10) {
        this.f71514g = i10;
        this.f71515h = (byte) (this.f71515h | 1);
        return this;
    }
}
