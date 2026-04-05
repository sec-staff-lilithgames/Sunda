package e2;

import i2.hQ.aTNDubNmpwAqdU;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final kv.a f53552a;

    /* renamed from: b, reason: collision with root package name */
    public final kv.a f53553b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f53554c;

    public n(kv.a value, kv.a maxValue, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.e0.checkNotNullParameter(maxValue, "maxValue");
        this.f53552a = value;
        this.f53553b = maxValue;
        this.f53554c = z10;
    }

    public final kv.a getMaxValue() {
        return this.f53553b;
    }

    public final boolean getReverseScrolling() {
        return this.f53554c;
    }

    public final kv.a getValue() {
        return this.f53552a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(aTNDubNmpwAqdU.aQwCLjypjtbCnkE);
        sb2.append(((Number) this.f53552a.invoke()).floatValue());
        sb2.append(", maxValue=");
        sb2.append(((Number) this.f53553b.invoke()).floatValue());
        sb2.append(", reverseScrolling=");
        return a.b.p(sb2, this.f53554c, ')');
    }

    public /* synthetic */ n(kv.a aVar, kv.a aVar2, boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this(aVar, aVar2, (i10 & 4) != 0 ? false : z10);
    }
}
