package x1;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y0 f91431a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f91432b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f91433c;

    public s0(y0 y0Var, r0 r0Var, int i10) {
        this.f91431a = y0Var;
        this.f91432b = r0Var;
        this.f91433c = i10;
    }

    @Override // x1.y0
    public Map<a, Integer> getAlignmentLines() {
        return this.f91431a.getAlignmentLines();
    }

    @Override // x1.y0
    public int getHeight() {
        return this.f91431a.getHeight();
    }

    @Override // x1.y0
    public int getWidth() {
        return this.f91431a.getWidth();
    }

    @Override // x1.y0
    public void placeChildren() {
        int i10 = this.f91433c;
        r0 r0Var = this.f91432b;
        r0Var.f91412c = i10;
        this.f91431a.placeChildren();
        r0Var.disposeOrReuseStartingFromIndex(r0Var.f91412c);
    }
}
