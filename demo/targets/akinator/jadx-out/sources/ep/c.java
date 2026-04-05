package ep;

import gn.z0;
import io.bidmachine.media3.common.util.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f54808a;

    /* renamed from: b, reason: collision with root package name */
    public int f54809b;

    /* renamed from: c, reason: collision with root package name */
    public int f54810c;

    /* renamed from: d, reason: collision with root package name */
    public long f54811d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f54812e;

    /* renamed from: f, reason: collision with root package name */
    public final m0 f54813f;

    /* renamed from: g, reason: collision with root package name */
    public final m0 f54814g;

    /* renamed from: h, reason: collision with root package name */
    public int f54815h;

    /* renamed from: i, reason: collision with root package name */
    public int f54816i;

    public c(m0 m0Var, m0 m0Var2, boolean z10) throws z0 {
        this.f54814g = m0Var;
        this.f54813f = m0Var2;
        this.f54812e = z10;
        m0Var2.setPosition(12);
        this.f54808a = m0Var2.readUnsignedIntToInt();
        m0Var.setPosition(12);
        this.f54816i = m0Var.readUnsignedIntToInt();
        ko.d0.checkContainerInput(m0Var.readInt() == 1, "first_chunk must be 1");
        this.f54809b = -1;
    }

    public boolean moveNext() {
        int i10 = this.f54809b + 1;
        this.f54809b = i10;
        if (i10 == this.f54808a) {
            return false;
        }
        boolean z10 = this.f54812e;
        m0 m0Var = this.f54813f;
        this.f54811d = z10 ? m0Var.readUnsignedLongToLong() : m0Var.readUnsignedInt();
        if (this.f54809b == this.f54815h) {
            m0 m0Var2 = this.f54814g;
            this.f54810c = m0Var2.readUnsignedIntToInt();
            m0Var2.skipBytes(4);
            int i11 = this.f54816i - 1;
            this.f54816i = i11;
            this.f54815h = i11 > 0 ? m0Var2.readUnsignedIntToInt() - 1 : -1;
        }
        return true;
    }
}
