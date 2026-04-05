package nh;

import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class b1 implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76114a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f76115b;

    public /* synthetic */ b1(Object obj, int i10) {
        this.f76114a = i10;
        this.f76115b = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f76114a) {
            case 0:
                return ((nc) this.f76115b).build();
            case 1:
                return ((vc) this.f76115b).build();
            default:
                return new g1((BinaryOperator) this.f76115b);
        }
    }
}
