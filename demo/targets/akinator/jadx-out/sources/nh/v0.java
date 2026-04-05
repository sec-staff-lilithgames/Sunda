package nh;

import java.util.LinkedHashMap;
import java.util.function.Supplier;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class v0 implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76703a;

    public /* synthetic */ v0(int i10) {
        this.f76703a = i10;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f76703a) {
            case 0:
                return new q4();
            case 1:
                return l6.builder();
            case 2:
                return j6.builder();
            case 3:
                return b8.create();
            case 4:
                return new g1(new y0(14));
            case 5:
                return new g5();
            case 6:
                return d5.builder();
            case 7:
                return new h1();
            case 8:
                return o6.builder();
            case 9:
                return new LinkedHashMap();
            default:
                return b5.builder();
        }
    }
}
