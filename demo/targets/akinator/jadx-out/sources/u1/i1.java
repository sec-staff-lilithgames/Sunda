package u1;

import a2.t3;
import a2.w3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i1 {

    /* renamed from: a, reason: collision with root package name */
    public static final m f87599a = new m(uu.p0.emptyList());

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f87600e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ kv.p f87601f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, kv.p pVar) {
            super(1);
            this.f87600e = obj;
            this.f87601f = pVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(w3 w3Var) {
            a.b.b(w3Var, "$this$null", "pointerInput").set("key1", this.f87600e);
            w3Var.getProperties().set("block", this.f87601f);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f87602e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Object f87603f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ kv.p f87604g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, Object obj2, kv.p pVar) {
            super(1);
            this.f87602e = obj;
            this.f87603f = obj2;
            this.f87604g = pVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(w3 w3Var) {
            a.b.b(w3Var, "$this$null", "pointerInput").set("key1", this.f87602e);
            w3Var.getProperties().set("key2", this.f87603f);
            w3Var.getProperties().set("block", this.f87604g);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object[] f87605e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ kv.p f87606f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object[] objArr, kv.p pVar) {
            super(1);
            this.f87605e = objArr;
            this.f87606f = pVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(w3 w3Var) {
            a.b.b(w3Var, "$this$null", "pointerInput").set("keys", this.f87605e);
            w3Var.getProperties().set("block", this.f87606f);
        }
    }

    @tu.f
    public static final e1.v pointerInput(e1.v vVar, kv.p block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        throw new IllegalStateException("Modifier.pointerInput must provide one or more 'key' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.");
    }

    public static final e1.v pointerInput(e1.v vVar, Object obj, kv.p block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        return e1.o.composed(vVar, t3.isDebugInspectorInfoEnabled() ? new a(obj, block) : t3.getNoInspectorInfo(), new k1(obj, block));
    }

    public static final e1.v pointerInput(e1.v vVar, Object obj, Object obj2, kv.p block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        return e1.o.composed(vVar, t3.isDebugInspectorInfoEnabled() ? new b(obj, obj2, block) : t3.getNoInspectorInfo(), new m1(obj, obj2, block));
    }

    public static final e1.v pointerInput(e1.v vVar, Object[] keys, kv.p block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(keys, "keys");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        return e1.o.composed(vVar, t3.isDebugInspectorInfoEnabled() ? new c(keys, block) : t3.getNoInspectorInfo(), new o1(keys, block));
    }
}
