package nh;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class he extends be implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Object f76332b;

    /* renamed from: c, reason: collision with root package name */
    public final int f76333c;

    public he(Object obj, int i10) {
        this.f76332b = obj;
        this.f76333c = i10;
        jh.i.o(i10, "count");
    }

    @Override // nh.be, nh.td
    public final int getCount() {
        return this.f76333c;
    }

    @Override // nh.be, nh.td
    public final Object getElement() {
        return this.f76332b;
    }

    public he nextInBucket() {
        return null;
    }
}
