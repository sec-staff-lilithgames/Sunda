package o9;

import java.util.TimerTask;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l3 extends TimerTask {

    /* renamed from: b, reason: collision with root package name */
    public int f78316b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n3 f78317c;

    public l3(n3 n3Var) {
        this.f78317c = n3Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        this.f78317c.getActivity().runOnUiThread(new ji.t(this, 27));
    }
}
