package e0;

import e0.m;
import kotlinx.coroutines.channels.SendChannel;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v1.f f53155e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m2 f53156f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SendChannel f53157g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f53158h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(v1.f fVar, m2 m2Var, SendChannel sendChannel, boolean z10) {
        super(1);
        this.f53155e = fVar;
        this.f53156f = m2Var;
        this.f53157g = sendChannel;
        this.f53158h = z10;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((u1.c0) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(u1.c0 event) {
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        v1.g.addPointerInputChange(this.f53155e, event);
        float fM3769access$toFloat3MmeM6k = m1.m3769access$toFloat3MmeM6k(u1.n.positionChange(event), this.f53156f);
        event.consume();
        if (this.f53158h) {
            fM3769access$toFloat3MmeM6k *= -1;
        }
        this.f53157g.mo5139trySendJP2dKIU(new m.a(fM3769access$toFloat3MmeM6k, event.m7295getPositionF1C5BW0(), null));
    }
}
