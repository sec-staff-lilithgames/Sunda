package hj;

import android.graphics.drawable.Drawable;
import bj.a1;
import bj.b1;
import p8.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class r implements f9.h {

    /* renamed from: b, reason: collision with root package name */
    public final rj.o f58975b;

    /* renamed from: c, reason: collision with root package name */
    public final b1 f58976c;

    public r(rj.o oVar, b1 b1Var) {
        this.f58975b = oVar;
        this.f58976c = b1Var;
    }

    @Override // f9.h
    public boolean onLoadFailed(q0 q0Var, Object obj, g9.n nVar, boolean z10) {
        b1 b1Var;
        t.logd("Image Downloading  Error : " + q0Var.getMessage() + ":" + q0Var.getCause());
        if (this.f58975b == null || (b1Var = this.f58976c) == null) {
            return false;
        }
        if (q0Var.getLocalizedMessage().contains("Failed to decode")) {
            ((nj.q) b1Var).displayErrorEncountered(a1.f9608f);
            return false;
        }
        ((nj.q) b1Var).displayErrorEncountered(a1.f9605b);
        return false;
    }

    @Override // f9.h
    public boolean onResourceReady(Drawable drawable, Object obj, g9.n nVar, n8.a aVar, boolean z10) {
        t.logd("Image Downloading  Success : " + drawable);
        return false;
    }
}
