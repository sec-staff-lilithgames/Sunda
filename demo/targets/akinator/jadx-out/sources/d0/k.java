package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class k {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f51428e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ j1.b0 f51429f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ j1.f2 f51430g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, j1.b0 b0Var, j1.f2 f2Var) {
            super(1);
            this.f51428e = f10;
            this.f51429f = b0Var;
            this.f51430g = f2Var;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            a.b.b(w3Var, "$this$null", "background").set("alpha", Float.valueOf(this.f51428e));
            w3Var.getProperties().set("brush", this.f51429f);
            w3Var.getProperties().set("shape", this.f51430g);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f51431e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ j1.f2 f51432f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, j1.f2 f2Var) {
            super(1);
            this.f51431e = j10;
            this.f51432f = f2Var;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(w3Var, "$this$null");
            w3Var.setName("background");
            long j10 = this.f51431e;
            w3Var.setValue(j1.m0.m4848boximpl(j10));
            w3Var.getProperties().set("color", j1.m0.m4848boximpl(j10));
            w3Var.getProperties().set("shape", this.f51432f);
        }
    }

    public static final e1.v background(e1.v vVar, j1.b0 brush, j1.f2 shape, float f10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(brush, "brush");
        kotlin.jvm.internal.e0.checkNotNullParameter(shape, "shape");
        return vVar.then(new j(null, brush, f10, shape, a2.t3.isDebugInspectorInfoEnabled() ? new a(f10, brush, shape) : a2.t3.getNoInspectorInfo(), 1, null));
    }

    public static /* synthetic */ e1.v background$default(e1.v vVar, j1.b0 b0Var, j1.f2 f2Var, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f2Var = j1.y1.getRectangleShape();
        }
        if ((i10 & 4) != 0) {
            f10 = 1.0f;
        }
        return background(vVar, b0Var, f2Var, f10);
    }

    /* renamed from: background-bw27NRU, reason: not valid java name */
    public static final e1.v m3703backgroundbw27NRU(e1.v background, long j10, j1.f2 shape) {
        kotlin.jvm.internal.e0.checkNotNullParameter(background, "$this$background");
        kotlin.jvm.internal.e0.checkNotNullParameter(shape, "shape");
        return background.then(new j(j1.m0.m4848boximpl(j10), null, 0.0f, shape, a2.t3.isDebugInspectorInfoEnabled() ? new b(j10, shape) : a2.t3.getNoInspectorInfo(), 6, null));
    }

    /* renamed from: background-bw27NRU$default, reason: not valid java name */
    public static /* synthetic */ e1.v m3704backgroundbw27NRU$default(e1.v vVar, long j10, j1.f2 f2Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f2Var = j1.y1.getRectangleShape();
        }
        return m3703backgroundbw27NRU(vVar, j10, f2Var);
    }
}
