package bf;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class q0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9379b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0 f9380c;

    public /* synthetic */ q0(r0 r0Var, int i10) {
        this.f9379b = i10;
        this.f9380c = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f9379b;
        r0 r0Var = this.f9380c;
        switch (i10) {
            case 0:
                Map map = r0.O;
                r0Var.e();
                break;
            case 1:
                if (!r0Var.N) {
                    ((z) com.google.android.exoplayer2.util.a.checkNotNull(r0Var.f9397s)).onContinueLoadingRequested(r0Var);
                    break;
                }
                break;
            default:
                r0Var.H = true;
                break;
        }
    }
}
