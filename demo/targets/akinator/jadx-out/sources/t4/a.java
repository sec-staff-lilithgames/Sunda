package t4;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public int f86300a;

    /* renamed from: b, reason: collision with root package name */
    public int f86301b;

    /* renamed from: c, reason: collision with root package name */
    public int f86302c;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f86303d;

    public final void a(int i10, int i11, ByteBuffer byteBuffer) {
        this.f86303d = byteBuffer;
        if (byteBuffer != null) {
            this.f86300a = i10;
            this.f86301b = byteBuffer.getInt(i10 - 4);
            this.f86302c = i11;
        } else {
            this.f86300a = 0;
            this.f86301b = 0;
            this.f86302c = 0;
        }
    }

    public int length() {
        return this.f86301b;
    }

    public void reset() {
        a(0, 0, null);
    }
}
