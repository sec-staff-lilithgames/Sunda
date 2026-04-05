package yc;

import dd.g0;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class o implements Serializable, n {

    /* renamed from: c, reason: collision with root package name */
    public static final o f94329c = new o(false);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f94330b;

    public o(boolean z10) {
        this.f94330b = z10;
    }

    @Deprecated
    public static o withExactBigDecimals(boolean z10) {
        return new o(z10);
    }

    @Override // yc.n
    public a arrayNode() {
        return new a(this);
    }

    public int getMaxElementIndexForInsert() {
        return 9999;
    }

    public jc.t missingNode() {
        return r.getInstance();
    }

    @Override // yc.n
    public v objectNode() {
        return new v(this);
    }

    @Override // yc.n
    public a0 pojoNode(Object obj) {
        return new w(obj);
    }

    @Override // yc.n
    public a0 rawValueNode(g0 g0Var) {
        return new w(g0Var);
    }

    public boolean willStripTrailingBigDecimalZeroes() {
        return !this.f94330b;
    }

    @Override // yc.n
    public a arrayNode(int i10) {
        return new a(this, i10);
    }

    @Override // yc.n
    public e booleanNode(boolean z10) {
        return z10 ? e.getTrue() : e.getFalse();
    }

    @Override // yc.n
    public t nullNode() {
        return t.getInstance();
    }

    @Override // yc.n
    public y textNode(String str) {
        return y.valueOf(str);
    }

    @Override // yc.n
    public d binaryNode(byte[] bArr) {
        return d.valueOf(bArr);
    }

    @Override // yc.n
    public d binaryNode(byte[] bArr, int i10, int i11) {
        return d.valueOf(bArr, i10, i11);
    }

    @Override // yc.n
    public u numberNode(byte b10) {
        return j.valueOf(b10);
    }

    @Override // yc.n
    public a0 numberNode(Byte b10) {
        return b10 == null ? nullNode() : j.valueOf(b10.intValue());
    }

    @Override // yc.n
    public u numberNode(short s10) {
        return x.valueOf(s10);
    }

    @Override // yc.n
    public a0 numberNode(Short sh2) {
        return sh2 == null ? nullNode() : x.valueOf(sh2.shortValue());
    }

    @Override // yc.n
    public u numberNode(int i10) {
        return j.valueOf(i10);
    }

    @Override // yc.n
    public a0 numberNode(Integer num) {
        return num == null ? nullNode() : j.valueOf(num.intValue());
    }

    @Override // yc.n
    public u numberNode(long j10) {
        return q.valueOf(j10);
    }

    @Override // yc.n
    public a0 numberNode(Long l9) {
        if (l9 == null) {
            return nullNode();
        }
        return q.valueOf(l9.longValue());
    }

    @Override // yc.n
    public a0 numberNode(BigInteger bigInteger) {
        if (bigInteger == null) {
            return nullNode();
        }
        return c.valueOf(bigInteger);
    }

    @Override // yc.n
    public u numberNode(float f10) {
        return i.valueOf(f10);
    }

    @Override // yc.n
    public a0 numberNode(Float f10) {
        return f10 == null ? nullNode() : i.valueOf(f10.floatValue());
    }

    @Override // yc.n
    public u numberNode(double d10) {
        return h.valueOf(d10);
    }

    @Override // yc.n
    public a0 numberNode(Double d10) {
        return d10 == null ? nullNode() : h.valueOf(d10.doubleValue());
    }

    @Override // yc.n
    public a0 numberNode(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return nullNode();
        }
        return g.valueOf(bigDecimal);
    }
}
