package androidx.fragment.app;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x2 f6477b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b3 f6478c;

    public v2(b3 b3Var, x2 x2Var) {
        this.f6478c = b3Var;
        this.f6477b = x2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList = this.f6478c.f6285b;
        x2 x2Var = this.f6477b;
        if (arrayList.contains(x2Var)) {
            x2Var.getFinalState().a(x2Var.getFragment().mView);
        }
    }
}
