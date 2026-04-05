package eg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final float f54381a;

    /* renamed from: b, reason: collision with root package name */
    public final int f54382b;

    /* renamed from: c, reason: collision with root package name */
    public final List f54383c;

    /* renamed from: d, reason: collision with root package name */
    public final int f54384d;

    /* renamed from: e, reason: collision with root package name */
    public final int f54385e;

    /* renamed from: f, reason: collision with root package name */
    public final int f54386f;

    public k(ArrayList arrayList, int i10, int i11, int i12, float f10) {
        this.f54381a = f10;
        this.f54383c = Collections.unmodifiableList(arrayList);
        this.f54384d = i10;
        this.f54385e = i11;
        while (i10 <= i11) {
            if (((j) arrayList.get(i10)).f54378f == 0.0f) {
                this.f54382b++;
            }
            i10++;
        }
        this.f54386f = i12;
    }

    public final j a() {
        return (j) this.f54383c.get(this.f54384d);
    }

    public final j b() {
        return (j) this.f54383c.get(0);
    }

    public final j c() {
        return (j) this.f54383c.get(this.f54385e);
    }

    public final j d() {
        return (j) o2.g(1, this.f54383c);
    }
}
