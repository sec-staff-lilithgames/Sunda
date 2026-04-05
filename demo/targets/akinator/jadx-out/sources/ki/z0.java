package ki;

import j1.o2;
import java.util.List;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class z0 extends f2.e.d.a.b.AbstractC0721b {

    /* renamed from: a, reason: collision with root package name */
    public List f71539a;

    /* renamed from: b, reason: collision with root package name */
    public f2.e.d.a.b.c f71540b;

    /* renamed from: c, reason: collision with root package name */
    public f2.a f71541c;

    /* renamed from: d, reason: collision with root package name */
    public f2.e.d.a.b.AbstractC0723d f71542d;

    /* renamed from: e, reason: collision with root package name */
    public List f71543e;

    @Override // ki.f2.e.d.a.b.AbstractC0721b
    public f2.e.d.a.b build() {
        List list;
        f2.e.d.a.b.AbstractC0723d abstractC0723d = this.f71542d;
        if (abstractC0723d != null && (list = this.f71543e) != null) {
            return new a1(this.f71539a, this.f71540b, this.f71541c, abstractC0723d, list);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f71542d == null) {
            sb2.append(" signal");
        }
        if (this.f71543e == null) {
            sb2.append(" binaries");
        }
        throw new IllegalStateException(o2.m("Missing required properties:", sb2));
    }

    @Override // ki.f2.e.d.a.b.AbstractC0721b
    public f2.e.d.a.b.AbstractC0721b setAppExitInfo(f2.a aVar) {
        this.f71541c = aVar;
        return this;
    }

    @Override // ki.f2.e.d.a.b.AbstractC0721b
    public f2.e.d.a.b.AbstractC0721b setBinaries(List<f2.e.d.a.b.AbstractC0719a> list) {
        if (list == null) {
            throw new NullPointerException("Null binaries");
        }
        this.f71543e = list;
        return this;
    }

    @Override // ki.f2.e.d.a.b.AbstractC0721b
    public f2.e.d.a.b.AbstractC0721b setException(f2.e.d.a.b.c cVar) {
        this.f71540b = cVar;
        return this;
    }

    @Override // ki.f2.e.d.a.b.AbstractC0721b
    public f2.e.d.a.b.AbstractC0721b setSignal(f2.e.d.a.b.AbstractC0723d abstractC0723d) {
        if (abstractC0723d == null) {
            throw new NullPointerException("Null signal");
        }
        this.f71542d = abstractC0723d;
        return this;
    }

    @Override // ki.f2.e.d.a.b.AbstractC0721b
    public f2.e.d.a.b.AbstractC0721b setThreads(List<f2.e.d.a.b.AbstractC0725e> list) {
        this.f71539a = list;
        return this;
    }
}
