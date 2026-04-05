package androidx.lifecycle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class k1 {

    /* renamed from: b, reason: collision with root package name */
    public final u1 f6636b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6637c;

    /* renamed from: e, reason: collision with root package name */
    public int f6638e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1 f6639f;

    public k1(l1 l1Var, u1 u1Var) {
        this.f6639f = l1Var;
        this.f6636b = u1Var;
    }

    public final void a(boolean z10) {
        if (z10 == this.f6637c) {
            return;
        }
        this.f6637c = z10;
        int i10 = z10 ? 1 : -1;
        l1 l1Var = this.f6639f;
        int i11 = l1Var.f6651c;
        l1Var.f6651c = i10 + i11;
        if (!l1Var.f6652d) {
            l1Var.f6652d = true;
            while (true) {
                try {
                    int i12 = l1Var.f6651c;
                    if (i11 == i12) {
                        break;
                    }
                    boolean z11 = i11 == 0 && i12 > 0;
                    boolean z12 = i11 > 0 && i12 == 0;
                    if (z11) {
                        l1Var.d();
                    } else if (z12) {
                        l1Var.e();
                    }
                    i11 = i12;
                } catch (Throwable th2) {
                    l1Var.f6652d = false;
                    throw th2;
                }
            }
            l1Var.f6652d = false;
        }
        if (this.f6637c) {
            l1Var.c(this);
        }
    }

    public boolean c(b1 b1Var) {
        return false;
    }

    public abstract boolean d();

    public void b() {
    }
}
