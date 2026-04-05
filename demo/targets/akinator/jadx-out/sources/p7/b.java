package p7;

import l7.k;
import l7.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final f f80721a;

    /* renamed from: b, reason: collision with root package name */
    public final k f80722b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements c {
        @Override // p7.c
        public d create(f fVar, k kVar) {
            return new b(fVar, kVar);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return a.class.hashCode();
        }
    }

    public b(f fVar, k kVar) {
        this.f80721a = fVar;
        this.f80722b = kVar;
    }

    @Override // p7.d
    public void transition() {
        k kVar = this.f80722b;
        boolean z10 = kVar instanceof s;
        f fVar = this.f80721a;
        if (z10) {
            fVar.onSuccess(((s) kVar).getDrawable());
        } else if (kVar instanceof l7.f) {
            fVar.onError(kVar.getDrawable());
        }
    }
}
