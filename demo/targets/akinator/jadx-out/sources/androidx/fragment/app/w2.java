package androidx.fragment.app;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x2 f6481b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b3 f6482c;

    public w2(b3 b3Var, x2 x2Var) {
        this.f6482c = b3Var;
        this.f6481b = x2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        b3 b3Var = this.f6482c;
        ArrayList arrayList = b3Var.f6285b;
        x2 x2Var = this.f6481b;
        arrayList.remove(x2Var);
        b3Var.f6286c.remove(x2Var);
    }
}
