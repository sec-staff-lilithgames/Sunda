package nh;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class qe extends be {

    /* renamed from: b, reason: collision with root package name */
    public final Object f76585b;

    /* renamed from: c, reason: collision with root package name */
    public int f76586c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ re f76587e;

    public qe(re reVar, int i10) {
        this.f76587e = reVar;
        this.f76585b = reVar.f76604a[i10];
        this.f76586c = i10;
    }

    @Override // nh.be, nh.td
    public int getCount() {
        int i10 = this.f76586c;
        Object obj = this.f76585b;
        re reVar = this.f76587e;
        if (i10 == -1 || i10 >= reVar.f76606c || !Objects.equals(obj, reVar.f76604a[i10])) {
            this.f76586c = reVar.e(obj);
        }
        int i11 = this.f76586c;
        if (i11 == -1) {
            return 0;
        }
        return reVar.f76605b[i11];
    }

    @Override // nh.be, nh.td
    public Object getElement() {
        return this.f76585b;
    }
}
