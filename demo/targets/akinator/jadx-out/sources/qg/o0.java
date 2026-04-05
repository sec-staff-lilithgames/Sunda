package qg;

import android.view.View;
import x3.e3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class o0 implements x3.q0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f83212b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0 f83213c;

    public o0(r0 r0Var, s0 s0Var) {
        this.f83212b = r0Var;
        this.f83213c = s0Var;
    }

    @Override // x3.q0
    public e3 onApplyWindowInsets(View view, e3 e3Var) {
        return this.f83212b.onApplyWindowInsets(view, e3Var, new s0(this.f83213c));
    }
}
