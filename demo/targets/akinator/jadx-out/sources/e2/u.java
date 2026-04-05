package e2;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u implements t {

    /* renamed from: e, reason: collision with root package name */
    public static final a f53627e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicInteger f53628f = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final int f53629b;

    /* renamed from: c, reason: collision with root package name */
    public final p f53630c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final int generateSemanticsId() {
            return u.f53628f.addAndGet(1);
        }
    }

    public u(int i10, boolean z10, boolean z11, kv.l properties) {
        kotlin.jvm.internal.e0.checkNotNullParameter(properties, "properties");
        this.f53629b = i10;
        p pVar = new p();
        pVar.setMergingSemanticsOfDescendants(z10);
        pVar.setClearingSemantics(z11);
        properties.invoke(pVar);
        this.f53630c = pVar;
    }

    @Override // e2.t, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // e2.t, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return getId() == uVar.getId() && kotlin.jvm.internal.e0.areEqual(getSemanticsConfiguration(), uVar.getSemanticsConfiguration());
    }

    @Override // e2.t, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // e2.t, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    @Override // e2.t
    public int getId() {
        return this.f53629b;
    }

    @Override // e2.t
    public p getSemanticsConfiguration() {
        return this.f53630c;
    }

    public int hashCode() {
        return Integer.hashCode(getId()) + (getSemanticsConfiguration().hashCode() * 31);
    }

    @Override // e2.t, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }
}
