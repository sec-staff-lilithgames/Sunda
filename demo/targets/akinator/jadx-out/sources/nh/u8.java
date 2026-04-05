package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class u8 implements a9 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f76689a;

    /* renamed from: b, reason: collision with root package name */
    public final int f76690b;

    public u8(Object obj, int i10) {
        this.f76689a = obj;
        this.f76690b = i10;
    }

    @Override // nh.a9
    public final int getHash() {
        return this.f76690b;
    }

    @Override // nh.a9
    public final Object getKey() {
        return this.f76689a;
    }

    @Override // nh.a9
    public a9 getNext() {
        return null;
    }

    @Override // nh.a9
    public abstract /* synthetic */ Object getValue();
}
