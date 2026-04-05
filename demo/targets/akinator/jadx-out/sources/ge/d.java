package ge;

import com.google.android.exoplayer2.util.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final int f57575a;

    /* renamed from: b, reason: collision with root package name */
    public final int f57576b;

    /* renamed from: c, reason: collision with root package name */
    public final int f57577c;

    public d(int i10, int i11, int i12) {
        this.f57575a = i10;
        this.f57576b = i11;
        this.f57577c = i12;
    }

    public static d parseFrom(v0 v0Var) {
        int littleEndianInt = v0Var.readLittleEndianInt();
        v0Var.skipBytes(8);
        int littleEndianInt2 = v0Var.readLittleEndianInt();
        int littleEndianInt3 = v0Var.readLittleEndianInt();
        v0Var.skipBytes(4);
        v0Var.readLittleEndianInt();
        v0Var.skipBytes(12);
        return new d(littleEndianInt, littleEndianInt2, littleEndianInt3);
    }

    @Override // ge.a
    public int getType() {
        return 1751742049;
    }

    public boolean hasIndex() {
        return (this.f57576b & 16) == 16;
    }
}
