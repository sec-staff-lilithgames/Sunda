package k1;

import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w extends f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f70097e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(double d10) {
        super(1);
        this.f70097e = d10;
    }

    public final Double invoke(double d10) {
        if (d10 < 0.0d) {
            d10 = 0.0d;
        }
        return Double.valueOf(Math.pow(d10, 1.0d / this.f70097e));
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).doubleValue());
    }
}
