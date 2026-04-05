package z0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public int f97237a;

    public w() {
        this(0, 1, null);
    }

    public final int getElement() {
        return this.f97237a;
    }

    public final void setElement(int i10) {
        this.f97237a = i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("IntRef(element = ");
        sb2.append(this.f97237a);
        sb2.append(")@");
        String string = Integer.toString(hashCode(), sv.e.checkRadix(16));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        sb2.append(string);
        return sb2.toString();
    }

    public w(int i10) {
        this.f97237a = i10;
    }

    public /* synthetic */ w(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
