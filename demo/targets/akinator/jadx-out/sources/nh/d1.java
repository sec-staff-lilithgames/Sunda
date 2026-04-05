package nh;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.function.Supplier;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class d1 implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76167a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f76168b;

    public /* synthetic */ d1(Comparator comparator, int i10) {
        this.f76167a = i10;
        this.f76168b = comparator;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f76167a) {
            case 0:
                return new t6(this.f76168b);
            case 1:
                return new r6(this.f76168b);
            default:
                return new TreeMap(this.f76168b);
        }
    }
}
