package ov;

import java.io.Serializable;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i extends g implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public int f79862e;

    /* renamed from: f, reason: collision with root package name */
    public int f79863f;

    /* renamed from: g, reason: collision with root package name */
    public int f79864g;

    /* renamed from: h, reason: collision with root package name */
    public int f79865h;

    /* renamed from: i, reason: collision with root package name */
    public int f79866i;

    /* renamed from: j, reason: collision with root package name */
    public int f79867j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }
    }

    static {
        new a(null);
    }

    public i(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f79862e = i10;
        this.f79863f = i11;
        this.f79864g = i12;
        this.f79865h = i13;
        this.f79866i = i14;
        this.f79867j = i15;
        if ((i10 | i11 | i12 | i13 | i14) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
        }
        for (int i16 = 0; i16 < 64; i16++) {
            nextInt();
        }
    }

    @Override // ov.g
    public int nextBits(int i10) {
        return h.takeUpperBits(nextInt(), i10);
    }

    @Override // ov.g
    public int nextInt() {
        int i10 = this.f79862e;
        int i11 = i10 ^ (i10 >>> 2);
        this.f79862e = this.f79863f;
        this.f79863f = this.f79864g;
        this.f79864g = this.f79865h;
        int i12 = this.f79866i;
        this.f79865h = i12;
        int i13 = ((i11 ^ (i11 << 1)) ^ i12) ^ (i12 << 4);
        this.f79866i = i13;
        int i14 = this.f79867j + 362437;
        this.f79867j = i14;
        return i13 + i14;
    }

    public i(int i10, int i11) {
        this(i10, i11, 0, 0, ~i10, (i10 << 10) ^ (i11 >>> 4));
    }
}
