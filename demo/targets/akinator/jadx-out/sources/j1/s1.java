package j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f68967a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68968b;

    /* renamed from: c, reason: collision with root package name */
    public final int f68969c;

    /* renamed from: d, reason: collision with root package name */
    public final int f68970d;

    /* renamed from: e, reason: collision with root package name */
    public final int f68971e;

    public s1(int[] buffer, int i10, int i11, int i12, int i13) {
        kotlin.jvm.internal.e0.checkNotNullParameter(buffer, "buffer");
        this.f68967a = buffer;
        this.f68968b = i10;
        this.f68969c = i11;
        this.f68970d = i12;
        this.f68971e = i13;
    }

    /* renamed from: get-WaAFU9c, reason: not valid java name */
    public final long m4952getWaAFU9c(int i10, int i11) {
        return o0.Color(this.f68967a[o2.B(i11, this.f68971e, this.f68970d, i10)]);
    }

    public final int[] getBuffer() {
        return this.f68967a;
    }

    public final int getBufferOffset() {
        return this.f68970d;
    }

    public final int getHeight() {
        return this.f68969c;
    }

    public final int getStride() {
        return this.f68971e;
    }

    public final int getWidth() {
        return this.f68968b;
    }
}
