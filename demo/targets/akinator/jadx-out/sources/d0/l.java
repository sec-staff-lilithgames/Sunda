package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public j1.y0 f51473a;

    /* renamed from: b, reason: collision with root package name */
    public j1.e0 f51474b;

    /* renamed from: c, reason: collision with root package name */
    public l1.a f51475c;

    /* renamed from: d, reason: collision with root package name */
    public j1.l1 f51476d;

    public l() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ l copy$default(l lVar, j1.y0 y0Var, j1.e0 e0Var, l1.a aVar, j1.l1 l1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            y0Var = lVar.f51473a;
        }
        if ((i10 & 2) != 0) {
            e0Var = lVar.f51474b;
        }
        if ((i10 & 4) != 0) {
            aVar = lVar.f51475c;
        }
        if ((i10 & 8) != 0) {
            l1Var = lVar.f51476d;
        }
        return lVar.copy(y0Var, e0Var, aVar, l1Var);
    }

    public final l copy(j1.y0 y0Var, j1.e0 e0Var, l1.a aVar, j1.l1 l1Var) {
        return new l(y0Var, e0Var, aVar, l1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* renamed from: drawBorderCache-EMwLDEs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j1.y0 m3719drawBorderCacheEMwLDEs(g1.d r25, long r26, int r28, kv.l r29) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.l.m3719drawBorderCacheEMwLDEs(g1.d, long, int, kv.l):j1.y0");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f51473a, lVar.f51473a) && kotlin.jvm.internal.e0.areEqual(this.f51474b, lVar.f51474b) && kotlin.jvm.internal.e0.areEqual(this.f51475c, lVar.f51475c) && kotlin.jvm.internal.e0.areEqual(this.f51476d, lVar.f51476d);
    }

    public int hashCode() {
        j1.y0 y0Var = this.f51473a;
        int iHashCode = (y0Var == null ? 0 : y0Var.hashCode()) * 31;
        j1.e0 e0Var = this.f51474b;
        int iHashCode2 = (iHashCode + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        l1.a aVar = this.f51475c;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        j1.l1 l1Var = this.f51476d;
        return iHashCode3 + (l1Var != null ? l1Var.hashCode() : 0);
    }

    public final j1.l1 obtainPath() {
        j1.l1 l1Var = this.f51476d;
        if (l1Var != null) {
            return l1Var;
        }
        j1.l1 l1VarPath = j1.p.Path();
        this.f51476d = l1VarPath;
        return l1VarPath;
    }

    public String toString() {
        return "BorderCache(imageBitmap=" + this.f51473a + ", canvas=" + this.f51474b + ", canvasDrawScope=" + this.f51475c + ", borderPath=" + this.f51476d + ')';
    }

    public l(j1.y0 y0Var, j1.e0 e0Var, l1.a aVar, j1.l1 l1Var) {
        this.f51473a = y0Var;
        this.f51474b = e0Var;
        this.f51475c = aVar;
        this.f51476d = l1Var;
    }

    public /* synthetic */ l(j1.y0 y0Var, j1.e0 e0Var, l1.a aVar, j1.l1 l1Var, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : y0Var, (i10 & 2) != 0 ? null : e0Var, (i10 & 4) != 0 ? null : aVar, (i10 & 8) != 0 ? null : l1Var);
    }
}
