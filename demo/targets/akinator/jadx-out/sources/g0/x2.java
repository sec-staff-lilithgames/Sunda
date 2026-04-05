package g0;

import g0.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class x2 extends a2.x3 implements x1.p1 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends x2 {

        /* renamed from: e, reason: collision with root package name */
        public final x1.a f56626e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x1.a alignmentLine, kv.l inspectorInfo) {
            super(inspectorInfo, null);
            kotlin.jvm.internal.e0.checkNotNullParameter(alignmentLine, "alignmentLine");
            kotlin.jvm.internal.e0.checkNotNullParameter(inspectorInfo, "inspectorInfo");
            this.f56626e = alignmentLine;
        }

        @Override // g0.x2, x1.p1, e1.u, e1.v
        public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
            return super.all(lVar);
        }

        @Override // g0.x2, x1.p1, e1.u, e1.v
        public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
            return super.any(lVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            a aVar = obj instanceof a ? (a) obj : null;
            if (aVar == null) {
                return false;
            }
            return kotlin.jvm.internal.e0.areEqual(this.f56626e, aVar.f56626e);
        }

        @Override // g0.x2, x1.p1, e1.u, e1.v
        public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
            return super.foldIn(obj, pVar);
        }

        @Override // g0.x2, x1.p1, e1.u, e1.v
        public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
            return super.foldOut(obj, pVar);
        }

        public final x1.a getAlignmentLine() {
            return this.f56626e;
        }

        public int hashCode() {
            return this.f56626e.hashCode();
        }

        @Override // g0.x2, x1.p1
        public Object modifyParentData(s2.e eVar, Object obj) {
            kotlin.jvm.internal.e0.checkNotNullParameter(eVar, "<this>");
            r2 r2Var = obj instanceof r2 ? (r2) obj : null;
            if (r2Var == null) {
                r2Var = new r2(0.0f, false, null, 7, null);
            }
            r2Var.setCrossAxisAlignment(l0.f56514a.Relative$foundation_layout_release(new b.C0568b(this.f56626e)));
            return r2Var;
        }

        @Override // g0.x2, x1.p1, e1.u, e1.v
        public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
            return super.then(vVar);
        }

        public String toString() {
            return "WithAlignmentLine(line=" + this.f56626e + ')';
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends x2 {

        /* renamed from: e, reason: collision with root package name */
        public final kv.l f56627e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kv.l block, kv.l inspectorInfo) {
            super(inspectorInfo, null);
            kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.e0.checkNotNullParameter(inspectorInfo, "inspectorInfo");
            this.f56627e = block;
        }

        @Override // g0.x2, x1.p1, e1.u, e1.v
        public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
            return super.all(lVar);
        }

        @Override // g0.x2, x1.p1, e1.u, e1.v
        public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
            return super.any(lVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            b bVar = obj instanceof b ? (b) obj : null;
            if (bVar == null) {
                return false;
            }
            return kotlin.jvm.internal.e0.areEqual(this.f56627e, bVar.f56627e);
        }

        @Override // g0.x2, x1.p1, e1.u, e1.v
        public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
            return super.foldIn(obj, pVar);
        }

        @Override // g0.x2, x1.p1, e1.u, e1.v
        public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
            return super.foldOut(obj, pVar);
        }

        public final kv.l getBlock() {
            return this.f56627e;
        }

        public int hashCode() {
            return this.f56627e.hashCode();
        }

        @Override // g0.x2, x1.p1
        public Object modifyParentData(s2.e eVar, Object obj) {
            kotlin.jvm.internal.e0.checkNotNullParameter(eVar, "<this>");
            r2 r2Var = obj instanceof r2 ? (r2) obj : null;
            if (r2Var == null) {
                r2Var = new r2(0.0f, false, null, 7, null);
            }
            r2Var.setCrossAxisAlignment(l0.f56514a.Relative$foundation_layout_release(new b.a(this.f56627e)));
            return r2Var;
        }

        @Override // g0.x2, x1.p1, e1.u, e1.v
        public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
            return super.then(vVar);
        }

        public String toString() {
            return "WithAlignmentLineBlock(block=" + this.f56627e + ')';
        }
    }

    public x2(kv.l lVar, kotlin.jvm.internal.u uVar) {
        super(lVar);
    }

    @Override // x1.p1, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // x1.p1, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    @Override // x1.p1, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // x1.p1, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    @Override // x1.p1
    public abstract Object modifyParentData(s2.e eVar, Object obj);

    @Override // x1.p1, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }
}
