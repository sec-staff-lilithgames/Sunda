package l2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w1 f72382e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u1 f72383f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(w1 w1Var, u1 u1Var) {
        super(1);
        this.f72382e = w1Var;
        this.f72383f = u1Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((z1) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(z1 finalResult) {
        kotlin.jvm.internal.e0.checkNotNullParameter(finalResult, "finalResult");
        o2.o lock$ui_text_release = this.f72382e.getLock$ui_text_release();
        w1 w1Var = this.f72382e;
        u1 u1Var = this.f72383f;
        synchronized (lock$ui_text_release) {
            try {
                if (finalResult.getCacheable()) {
                    w1Var.f72385b.put(u1Var, finalResult);
                } else {
                    w1Var.f72385b.remove(u1Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
