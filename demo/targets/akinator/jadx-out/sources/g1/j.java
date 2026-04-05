package g1;

import a2.t3;
import a2.w3;
import e1.v;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class j {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kv.l f56672e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kv.l lVar) {
            super(1);
            this.f56672e = lVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return x0.f87415a;
        }

        public final void invoke(w3 w3Var) {
            a.b.b(w3Var, "$this$null", "drawBehind").set("onDraw", this.f56672e);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kv.l f56673e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kv.l lVar) {
            super(1);
            this.f56673e = lVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return x0.f87415a;
        }

        public final void invoke(w3 w3Var) {
            a.b.b(w3Var, "$this$null", "drawWithCache").set("onBuildDrawCache", this.f56673e);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kv.l f56674e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kv.l lVar) {
            super(1);
            this.f56674e = lVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return x0.f87415a;
        }

        public final void invoke(w3 w3Var) {
            a.b.b(w3Var, "$this$null", "drawWithContent").set("onDraw", this.f56674e);
        }
    }

    public static final v drawBehind(v vVar, kv.l onDraw) {
        e0.checkNotNullParameter(vVar, "<this>");
        e0.checkNotNullParameter(onDraw, "onDraw");
        return vVar.then(new f(onDraw, t3.isDebugInspectorInfoEnabled() ? new a(onDraw) : t3.getNoInspectorInfo()));
    }

    public static final v drawWithCache(v vVar, kv.l onBuildDrawCache) {
        e0.checkNotNullParameter(vVar, "<this>");
        e0.checkNotNullParameter(onBuildDrawCache, "onBuildDrawCache");
        return e1.o.composed(vVar, t3.isDebugInspectorInfoEnabled() ? new b(onBuildDrawCache) : t3.getNoInspectorInfo(), new k(onBuildDrawCache));
    }

    public static final v drawWithContent(v vVar, kv.l onDraw) {
        e0.checkNotNullParameter(vVar, "<this>");
        e0.checkNotNullParameter(onDraw, "onDraw");
        return vVar.then(new m(onDraw, t3.isDebugInspectorInfoEnabled() ? new c(onDraw) : t3.getNoInspectorInfo()));
    }
}
