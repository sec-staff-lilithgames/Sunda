package g;

import f.x;
import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b extends x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v5 f56323d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z10, v5 v5Var) {
        super(z10);
        this.f56323d = v5Var;
    }

    @Override // f.x
    public void handleOnBackPressed() {
        c.access$BackHandler$lambda$0(this.f56323d).invoke();
    }
}
