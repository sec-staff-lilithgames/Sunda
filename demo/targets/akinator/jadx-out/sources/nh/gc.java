package nh;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class gc extends uc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76299a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f76300b;

    public /* synthetic */ gc(int i10, int i11) {
        this.f76299a = i11;
        this.f76300b = i10;
    }

    @Override // nh.uc
    public final Map a() {
        switch (this.f76299a) {
            case 0:
                return f2.createWithExpectedSize(this.f76300b);
            default:
                return i2.createWithExpectedSize(this.f76300b);
        }
    }
}
