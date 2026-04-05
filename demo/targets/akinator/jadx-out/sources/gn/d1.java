package gn;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d1 {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f57855b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};

    /* renamed from: a, reason: collision with root package name */
    public final u f57856a;

    public d1() {
        this.f57856a = new u();
    }

    public d1 add(int i10) {
        this.f57856a.add(i10);
        return this;
    }

    public d1 addAll(int... iArr) {
        this.f57856a.addAll(iArr);
        return this;
    }

    public d1 addAllCommands() {
        this.f57856a.addAll(f57855b);
        return this;
    }

    public d1 addIf(int i10, boolean z10) {
        this.f57856a.addIf(i10, z10);
        return this;
    }

    public e1 build() {
        return new e1(this.f57856a.build());
    }

    public d1 remove(int i10) {
        this.f57856a.remove(i10);
        return this;
    }

    public d1 removeAll(int... iArr) {
        this.f57856a.removeAll(iArr);
        return this;
    }

    public d1 removeIf(int i10, boolean z10) {
        this.f57856a.removeIf(i10, z10);
        return this;
    }

    public d1 addAll(e1 e1Var) {
        this.f57856a.addAll(e1Var.f57874a);
        return this;
    }

    public d1(e1 e1Var) {
        u uVar = new u();
        this.f57856a = uVar;
        uVar.addAll(e1Var.f57874a);
    }
}
