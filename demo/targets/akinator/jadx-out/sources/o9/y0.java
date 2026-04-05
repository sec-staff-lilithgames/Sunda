package o9;

import java.util.TimerTask;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class y0 extends TimerTask {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f78683b;

    public y0(a1 a1Var) {
        this.f78683b = a1Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        a1 a1Var = this.f78683b;
        if (a1Var.f78025k) {
            a1Var.getActivity().runOnUiThread(new ji.t(this, 24));
        }
    }
}
