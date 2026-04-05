package dd;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class y extends a0 implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public final a0 f52109c;

    /* renamed from: e, reason: collision with root package name */
    public final a0 f52110e;

    public y(a0 a0Var, a0 a0Var2) {
        this.f52109c = a0Var;
        this.f52110e = a0Var2;
    }

    @Override // dd.a0
    public String reverse(String str) {
        String strReverse = this.f52109c.reverse(str);
        return strReverse != null ? this.f52110e.reverse(strReverse) : strReverse;
    }

    public String toString() {
        return "[ChainedTransformer(" + this.f52109c + ", " + this.f52110e + ")]";
    }

    @Override // dd.a0
    public String transform(String str) {
        return this.f52109c.transform(this.f52110e.transform(str));
    }
}
