package androidx.fragment.app;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6291b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a3 f6292c;

    public d(q qVar, ArrayList arrayList, a3 a3Var) {
        this.f6291b = arrayList;
        this.f6292c = a3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList = this.f6291b;
        a3 a3Var = this.f6292c;
        if (arrayList.contains(a3Var)) {
            arrayList.remove(a3Var);
            a3Var.getFinalState().a(a3Var.getFragment().mView);
        }
    }
}
