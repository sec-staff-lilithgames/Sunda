package yc;

import dd.g0;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.function.Predicate;
import java.util.stream.Stream;
import oc.z0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class f extends b implements n {

    /* renamed from: b, reason: collision with root package name */
    public final o f94310b;

    public f(o oVar) {
        this.f94310b = oVar;
    }

    @Override // yc.n
    public final a arrayNode() {
        return this.f94310b.arrayNode();
    }

    @Override // jc.t
    public String asText() {
        return "";
    }

    @Override // yc.b, jc.t, ub.o0
    public abstract ub.z asToken();

    @Override // jc.t, ub.o0
    public abstract jc.t get(int i10);

    @Override // jc.t, ub.o0
    public abstract jc.t get(String str);

    public jc.t missingNode() {
        return this.f94310b.missingNode();
    }

    @Override // yc.n
    public final v objectNode() {
        return this.f94310b.objectNode();
    }

    @Override // yc.n
    public final a0 pojoNode(Object obj) {
        return this.f94310b.pojoNode(obj);
    }

    @Override // yc.n
    public final a0 rawValueNode(g0 g0Var) {
        return this.f94310b.rawValueNode(g0Var);
    }

    public abstract f removeAll();

    public abstract f removeIf(Predicate<? super jc.t> predicate);

    public f removeNulls() {
        return removeIf(new z0(1));
    }

    @Override // jc.t, ub.o0
    public abstract int size();

    @Override // jc.t
    public abstract Stream<jc.t> valueStream();

    @Override // yc.n
    public final a arrayNode(int i10) {
        return this.f94310b.arrayNode(i10);
    }

    @Override // yc.n
    public final e booleanNode(boolean z10) {
        return this.f94310b.booleanNode(z10);
    }

    @Override // yc.n
    public final t nullNode() {
        return this.f94310b.nullNode();
    }

    @Override // yc.n
    public final y textNode(String str) {
        return this.f94310b.textNode(str);
    }

    @Override // yc.n
    public final d binaryNode(byte[] bArr) {
        return this.f94310b.binaryNode(bArr);
    }

    @Override // yc.n
    public final d binaryNode(byte[] bArr, int i10, int i11) {
        return this.f94310b.binaryNode(bArr, i10, i11);
    }

    @Override // yc.n
    public final u numberNode(byte b10) {
        return this.f94310b.numberNode(b10);
    }

    @Override // yc.n
    public final u numberNode(short s10) {
        return this.f94310b.numberNode(s10);
    }

    @Override // yc.n
    public final u numberNode(int i10) {
        return this.f94310b.numberNode(i10);
    }

    @Override // yc.n
    public final u numberNode(long j10) {
        return this.f94310b.numberNode(j10);
    }

    @Override // yc.n
    public final u numberNode(float f10) {
        return this.f94310b.numberNode(f10);
    }

    @Override // yc.n
    public final u numberNode(double d10) {
        return this.f94310b.numberNode(d10);
    }

    @Override // yc.n
    public final a0 numberNode(BigInteger bigInteger) {
        return this.f94310b.numberNode(bigInteger);
    }

    @Override // yc.n
    public final a0 numberNode(BigDecimal bigDecimal) {
        return this.f94310b.numberNode(bigDecimal);
    }

    @Override // yc.n
    public final a0 numberNode(Byte b10) {
        return this.f94310b.numberNode(b10);
    }

    @Override // yc.n
    public final a0 numberNode(Short sh2) {
        return this.f94310b.numberNode(sh2);
    }

    @Override // yc.n
    public final a0 numberNode(Integer num) {
        return this.f94310b.numberNode(num);
    }

    @Override // yc.n
    public final a0 numberNode(Long l9) {
        return this.f94310b.numberNode(l9);
    }

    @Override // yc.n
    public final a0 numberNode(Float f10) {
        return this.f94310b.numberNode(f10);
    }

    @Override // yc.n
    public final a0 numberNode(Double d10) {
        return this.f94310b.numberNode(d10);
    }
}
