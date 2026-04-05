package fu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s0 implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f56099b;

    /* renamed from: c, reason: collision with root package name */
    public final long f56100c;

    /* renamed from: e, reason: collision with root package name */
    public final int f56101e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f56102f;

    public s0(Runnable runnable, Long l9, int i10) {
        this.f56099b = runnable;
        this.f56100c = l9.longValue();
        this.f56101e = i10;
    }

    @Override // java.lang.Comparable
    public int compareTo(s0 s0Var) {
        int iCompare = ut.o0.compare(this.f56100c, s0Var.f56100c);
        return iCompare == 0 ? ut.o0.compare(this.f56101e, s0Var.f56101e) : iCompare;
    }
}
