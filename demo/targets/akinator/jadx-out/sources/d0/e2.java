package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e2 {

    /* renamed from: a, reason: collision with root package name */
    public static final y1.f f51359a = y1.c.modifierLocalOf(d2.f51355e);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kv.l f51360e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kv.l lVar) {
            super(1);
            this.f51360e = lVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            a.b.b(w3Var, "$this$null", "onFocusedBoundsChanged").set("onPositioned", this.f51360e);
        }
    }

    public static final y1.f getModifierLocalFocusedBoundsObserver() {
        return f51359a;
    }

    public static final e1.v onFocusedBoundsChanged(e1.v vVar, kv.l onPositioned) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(onPositioned, "onPositioned");
        return e1.o.composed(vVar, a2.t3.isDebugInspectorInfoEnabled() ? new a(onPositioned) : a2.t3.getNoInspectorInfo(), new f2(onPositioned));
    }

    public static /* synthetic */ void getModifierLocalFocusedBoundsObserver$annotations() {
    }
}
