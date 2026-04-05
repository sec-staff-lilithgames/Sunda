package a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class t3 {

    /* renamed from: a, reason: collision with root package name */
    public static final s3 f3848a = s3.f3796e;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f3849b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kv.l f3850e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kv.l lVar) {
            super(1);
            this.f3850e = lVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(w3 w3Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(w3Var, "$this$null");
            this.f3850e.invoke(w3Var);
        }
    }

    public static final kv.l debugInspectorInfo(kv.l definitions) {
        kotlin.jvm.internal.e0.checkNotNullParameter(definitions, "definitions");
        return isDebugInspectorInfoEnabled() ? new a(definitions) : getNoInspectorInfo();
    }

    public static final kv.l getNoInspectorInfo() {
        return f3848a;
    }

    public static final e1.v inspectable(e1.v vVar, kv.l inspectorInfo, kv.l factory) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        kotlin.jvm.internal.e0.checkNotNullParameter(factory, "factory");
        return inspectableWrapper(vVar, inspectorInfo, (e1.v) factory.invoke(e1.t.f53496b));
    }

    public static final e1.v inspectableWrapper(e1.v vVar, kv.l inspectorInfo, e1.v wrapped) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        kotlin.jvm.internal.e0.checkNotNullParameter(wrapped, "wrapped");
        q3 q3Var = new q3(inspectorInfo);
        return vVar.then(q3Var).then(wrapped).then(q3Var.getEnd());
    }

    public static final boolean isDebugInspectorInfoEnabled() {
        return f3849b;
    }

    public static final void setDebugInspectorInfoEnabled(boolean z10) {
        f3849b = z10;
    }
}
