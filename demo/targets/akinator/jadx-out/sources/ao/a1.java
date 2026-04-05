package ao;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class a1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7543b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1 f7544c;

    public /* synthetic */ a1(c1 c1Var, int i10) {
        this.f7543b = i10;
        this.f7544c = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7543b;
        c1 c1Var = this.f7544c;
        switch (i10) {
            case 0:
                Map map = c1.T;
                c1Var.e();
                break;
            case 1:
                if (!c1Var.S) {
                    ((h0) io.bidmachine.media3.common.util.a.checkNotNull(c1Var.f7575v)).onContinueLoadingRequested(c1Var);
                    break;
                }
                break;
            default:
                c1Var.M = true;
                break;
        }
    }
}
