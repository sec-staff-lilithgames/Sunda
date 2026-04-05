package o9;

import java.util.TimerTask;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h1 extends TimerTask {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1 f78185b;

    public h1(m1 m1Var) {
        this.f78185b = m1Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        m1 m1Var = this.f78185b;
        if (m1Var.getActivity() != null) {
            m1Var.getActivity().runOnUiThread(new g1(this));
        }
    }
}
