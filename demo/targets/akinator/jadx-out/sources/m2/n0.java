package m2;

import android.view.inputmethod.BaseInputConnection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n0 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u0 f73954e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(u0 u0Var) {
        super(0);
        this.f73954e = u0Var;
    }

    @Override // kv.a
    public final BaseInputConnection invoke() {
        return new BaseInputConnection(this.f73954e.getView(), false);
    }
}
