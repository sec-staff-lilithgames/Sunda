package sv;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m0 extends uu.n0 {

    /* renamed from: b, reason: collision with root package name */
    public int f86183b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CharSequence f86184c;

    public m0(CharSequence charSequence) {
        this.f86184c = charSequence;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f86183b < this.f86184c.length();
    }

    @Override // uu.n0
    public char nextChar() {
        int i10 = this.f86183b;
        this.f86183b = i10 + 1;
        return this.f86184c.charAt(i10);
    }
}
