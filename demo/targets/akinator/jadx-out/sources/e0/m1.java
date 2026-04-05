package e0;

import e0.m;
import kotlinx.coroutines.channels.SendChannel;
import p0.v5;
import p0.z4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class m1 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kv.l f53174e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ m2 f53175f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f53176g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f53177h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ f0.q f53178i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ kv.a f53179j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ kv.q f53180k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kv.q f53181l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ kv.p f53182m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kv.l lVar, m2 m2Var, boolean z10, boolean z11, f0.q qVar, kv.a aVar, kv.q qVar2, kv.q qVar3, kv.p pVar) {
            super(1);
            this.f53174e = lVar;
            this.f53175f = m2Var;
            this.f53176g = z10;
            this.f53177h = z11;
            this.f53178i = qVar;
            this.f53179j = aVar;
            this.f53180k = qVar2;
            this.f53181l = qVar3;
            this.f53182m = pVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            a.b.b(w3Var, "$this$null", "draggable").set("canDrag", this.f53174e);
            w3Var.getProperties().set("orientation", this.f53175f);
            com.google.android.gms.internal.play_billing.a.d(this.f53177h, com.google.android.gms.internal.play_billing.a.d(this.f53176g, w3Var.getProperties(), "enabled", w3Var), "reverseDirection", w3Var).set("interactionSource", this.f53178i);
            w3Var.getProperties().set("startDragImmediately", this.f53179j);
            w3Var.getProperties().set("onDragStarted", this.f53180k);
            w3Var.getProperties().set("onDragStopped", this.f53181l);
            w3Var.getProperties().set("stateFactory", this.f53182m);
        }
    }

    public static final c2 DraggableState(kv.l onDelta) {
        kotlin.jvm.internal.e0.checkNotNullParameter(onDelta, "onDelta");
        return new h(onDelta);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$awaitDownAndSlop(u1.c r9, p0.v5 r10, p0.v5 r11, v1.f r12, e0.m2 r13, zu.d r14) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.m1.access$awaitDownAndSlop(u1.c, p0.v5, p0.v5, v1.f, e0.m2, zu.d):java.lang.Object");
    }

    public static final Object access$awaitDrag(u1.c cVar, tu.v vVar, v1.f fVar, SendChannel sendChannel, boolean z10, m2 m2Var, zu.d dVar) {
        float fFloatValue = ((Number) vVar.getSecond()).floatValue();
        u1.c0 c0Var = (u1.c0) vVar.getFirst();
        m2 m2Var2 = m2.f53183b;
        long jOffset = m2Var == m2Var2 ? i1.i.Offset(0.0f, fFloatValue) : i1.i.Offset(fFloatValue, 0.0f);
        long jM7295getPositionF1C5BW0 = c0Var.m7295getPositionF1C5BW0();
        long jM7295getPositionF1C5BW02 = c0Var.m7295getPositionF1C5BW0();
        long jM4189minusMKHz9U = i1.h.m4189minusMKHz9U(jM7295getPositionF1C5BW0, i1.h.m4192timestuRUvjQ(jOffset, Math.signum(m2Var == m2Var2 ? i1.h.m4186getYimpl(jM7295getPositionF1C5BW02) : i1.h.m4185getXimpl(jM7295getPositionF1C5BW02))));
        sendChannel.mo5139trySendJP2dKIU(new m.b(jM4189minusMKHz9U, null));
        if (z10) {
            fFloatValue *= -1;
        }
        sendChannel.mo5139trySendJP2dKIU(new m.a(fFloatValue, jM4189minusMKHz9U, null));
        l1 l1Var = new l1(fVar, m2Var, sendChannel, z10);
        return m2Var == m2Var2 ? d1.m3760verticalDragjO51t88(cVar, c0Var.m7294getIdJ3iCeTQ(), l1Var, dVar) : d1.m3758horizontalDragjO51t88(cVar, c0Var.m7294getIdJ3iCeTQ(), l1Var, dVar);
    }

    /* renamed from: access$toFloat-3MmeM6k, reason: not valid java name */
    public static final float m3769access$toFloat3MmeM6k(long j10, m2 m2Var) {
        return m2Var == m2.f53183b ? i1.h.m4186getYimpl(j10) : i1.h.m4185getXimpl(j10);
    }

    /* renamed from: access$toFloat-sF-c-tU, reason: not valid java name */
    public static final float m3770access$toFloatsFctU(long j10, m2 m2Var) {
        return m2Var == m2.f53183b ? s2.e0.m6800getYimpl(j10) : s2.e0.m6799getXimpl(j10);
    }

    public static final e1.v draggable(e1.v vVar, c2 state, m2 orientation, boolean z10, f0.q qVar, boolean z11, kv.q onDragStarted, kv.q onDragStopped, boolean z12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        kotlin.jvm.internal.e0.checkNotNullParameter(orientation, "orientation");
        kotlin.jvm.internal.e0.checkNotNullParameter(onDragStarted, "onDragStarted");
        kotlin.jvm.internal.e0.checkNotNullParameter(onDragStopped, "onDragStopped");
        return draggable(vVar, new p1(state), q1.f53260e, orientation, z10, qVar, new r1(z11), onDragStarted, onDragStopped, z12);
    }

    public static e1.v draggable$default(e1.v vVar, c2 c2Var, m2 m2Var, boolean z10, f0.q qVar, boolean z11, kv.q qVar2, kv.q qVar3, boolean z12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return draggable(vVar, c2Var, m2Var, z10, (i10 & 8) != 0 ? null : qVar, (i10 & 16) != 0 ? false : z11, (i10 & 32) != 0 ? new n1(3, null) : qVar2, (i10 & 64) != 0 ? new o1(3, null) : qVar3, (i10 & 128) != 0 ? false : z12);
    }

    public static final c2 rememberDraggableState(kv.l onDelta, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(onDelta, "onDelta");
        wVar.startReplaceableGroup(-183245213);
        v5 v5VarRememberUpdatedState = z4.rememberUpdatedState(onDelta, wVar, i10 & 14);
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue = wVar.rememberedValue();
        if (objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = DraggableState(new b2(v5VarRememberUpdatedState));
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        c2 c2Var = (c2) objRememberedValue;
        wVar.endReplaceableGroup();
        return c2Var;
    }

    public static final e1.v draggable(e1.v vVar, kv.p stateFactory, kv.l canDrag, m2 orientation, boolean z10, f0.q qVar, kv.a startDragImmediately, kv.q onDragStarted, kv.q onDragStopped, boolean z11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(stateFactory, "stateFactory");
        kotlin.jvm.internal.e0.checkNotNullParameter(canDrag, "canDrag");
        kotlin.jvm.internal.e0.checkNotNullParameter(orientation, "orientation");
        kotlin.jvm.internal.e0.checkNotNullParameter(startDragImmediately, "startDragImmediately");
        kotlin.jvm.internal.e0.checkNotNullParameter(onDragStarted, "onDragStarted");
        kotlin.jvm.internal.e0.checkNotNullParameter(onDragStopped, "onDragStopped");
        return e1.o.composed(vVar, a2.t3.isDebugInspectorInfoEnabled() ? new a(canDrag, orientation, z10, z11, qVar, startDragImmediately, onDragStarted, onDragStopped, stateFactory) : a2.t3.getNoInspectorInfo(), new a2(canDrag, orientation, z10, z11, qVar, startDragImmediately, onDragStarted, onDragStopped, stateFactory));
    }
}
