package k4;

import kotlinx.coroutines.channels.ChannelResult;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j2 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.l f70380e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l2 f70381f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kv.p f70382g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(kv.l lVar, l2 l2Var, kv.p pVar) {
        super(1);
        this.f70380e = lVar;
        this.f70381f = l2Var;
        this.f70382g = pVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(Throwable th2) {
        tu.x0 x0Var;
        this.f70380e.invoke(th2);
        l2 l2Var = this.f70381f;
        l2Var.f70411c.close(th2);
        do {
            Object objM5158getOrNullimpl = ChannelResult.m5158getOrNullimpl(l2Var.f70411c.mo5146tryReceivePtdJZtk());
            if (objM5158getOrNullimpl != null) {
                this.f70382g.invoke(objM5158getOrNullimpl, th2);
                x0Var = tu.x0.f87415a;
            } else {
                x0Var = null;
            }
        } while (x0Var != null);
    }
}
