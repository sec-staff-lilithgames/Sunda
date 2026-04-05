package x1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u0 implements b2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f91442a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f91443b;

    public u0(r0 r0Var, Object obj) {
        this.f91442a = r0Var;
        this.f91443b = obj;
    }

    @Override // x1.b2
    public void dispose() {
        r0 r0Var = this.f91442a;
        r0Var.makeSureStateIsConsistent();
        z1.b0 b0Var = (z1.b0) r0Var.f91416g.remove(this.f91443b);
        if (b0Var != null) {
            if (r0Var.f91419j <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            int iIndexOf = r0Var.f91410a.getFoldedChildren$ui_release().indexOf(b0Var);
            if (iIndexOf < r0Var.f91410a.getFoldedChildren$ui_release().size() - r0Var.f91419j) {
                throw new IllegalStateException("Check failed.");
            }
            r0Var.f91418i++;
            r0Var.f91419j--;
            int size = (r0Var.f91410a.getFoldedChildren$ui_release().size() - r0Var.f91419j) - r0Var.f91418i;
            r0Var.a(iIndexOf, size, 1);
            r0Var.disposeOrReuseStartingFromIndex(size);
        }
    }

    @Override // x1.b2
    public int getPlaceablesCount() {
        r0.c cVar;
        z1.b0 b0Var = (z1.b0) this.f91442a.f91416g.get(this.f91443b);
        if (b0Var == null || (cVar = b0Var.get_children$ui_release()) == null) {
            return 0;
        }
        return cVar.getSize();
    }

    @Override // x1.b2
    /* renamed from: premeasure-0kLqBqw */
    public void mo7825premeasure0kLqBqw(int i10, long j10) {
        r0 r0Var = this.f91442a;
        z1.b0 b0Var = (z1.b0) r0Var.f91416g.get(this.f91443b);
        if (b0Var == null || !b0Var.isAttached()) {
            return;
        }
        int size = b0Var.get_children$ui_release().getSize();
        if (i10 < 0 || i10 >= size) {
            throw new IndexOutOfBoundsException("Index (" + i10 + ") is out of bound of [0, " + size + ')');
        }
        if (b0Var.isPlaced()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        z1.b0 b0Var2 = r0Var.f91410a;
        b0Var2.f97265m = true;
        z1.p0.requireOwner(b0Var).mo58measureAndLayout0kLqBqw((z1.b0) b0Var.get_children$ui_release().getContent()[i10], j10);
        b0Var2.f97265m = false;
    }
}
