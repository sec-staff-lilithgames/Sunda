package s1;

import a2.t3;
import a2.w3;
import e1.v;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final y1.f f85317a = y1.c.modifierLocalOf(h.f85316e);

    public static final y1.f getModifierLocalKeyInput() {
        return f85317a;
    }

    public static final v onKeyEvent(v vVar, l onKeyEvent) {
        e0.checkNotNullParameter(vVar, "<this>");
        e0.checkNotNullParameter(onKeyEvent, "onKeyEvent");
        return t3.inspectableWrapper(vVar, t3.isDebugInspectorInfoEnabled() ? new a(onKeyEvent) : t3.getNoInspectorInfo(), new g(onKeyEvent, null));
    }

    public static final v onPreviewKeyEvent(v vVar, l onPreviewKeyEvent) {
        e0.checkNotNullParameter(vVar, "<this>");
        e0.checkNotNullParameter(onPreviewKeyEvent, "onPreviewKeyEvent");
        return t3.inspectableWrapper(vVar, t3.isDebugInspectorInfoEnabled() ? new b(onPreviewKeyEvent) : t3.getNoInspectorInfo(), new g(null, onPreviewKeyEvent));
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends f0 implements l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l f85318e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l lVar) {
            super(1);
            this.f85318e = lVar;
        }

        public final void invoke(w3 w3Var) {
            a.b.b(w3Var, "$this$null", "onKeyEvent").set("onKeyEvent", this.f85318e);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends f0 implements l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l f85319e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l lVar) {
            super(1);
            this.f85319e = lVar;
        }

        public final void invoke(w3 w3Var) {
            a.b.b(w3Var, "$this$null", "onPreviewKeyEvent").set("onPreviewKeyEvent", this.f85319e);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return x0.f87415a;
        }
    }
}
