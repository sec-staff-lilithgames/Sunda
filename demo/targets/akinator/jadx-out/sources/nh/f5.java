package nh;

import com.ironsource.C3191e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f5 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f76248a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f76249b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f76250c;

    public f5(Object obj, Object obj2, Object obj3) {
        this.f76248a = obj;
        this.f76249b = obj2;
        this.f76250c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f76248a;
        sb2.append(obj);
        sb2.append(C3191e4.i.f36525b);
        sb2.append(this.f76249b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append(C3191e4.i.f36525b);
        sb2.append(this.f76250c);
        return new IllegalArgumentException(sb2.toString());
    }
}
