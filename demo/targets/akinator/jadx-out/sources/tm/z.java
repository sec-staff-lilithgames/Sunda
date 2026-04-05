package tm;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final int f87154a;

    /* renamed from: b, reason: collision with root package name */
    public final int f87155b;

    /* renamed from: c, reason: collision with root package name */
    public final int f87156c;

    /* renamed from: d, reason: collision with root package name */
    public final int f87157d;

    /* renamed from: e, reason: collision with root package name */
    public final a1 f87158e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f87159f;

    public z() {
        this(0, 0, 0, 0, a1.TopRight, true);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MRAIDResizeProperties{width=");
        sb2.append(this.f87154a);
        sb2.append(", height=");
        sb2.append(this.f87155b);
        sb2.append(", offsetX=");
        sb2.append(this.f87156c);
        sb2.append(", offsetY=");
        sb2.append(this.f87157d);
        sb2.append(", customClosePosition=");
        sb2.append(this.f87158e);
        sb2.append(", allowOffscreen=");
        return a.b.p(sb2, this.f87159f, AbstractJsonLexerKt.END_OBJ);
    }

    public z(int i10, int i11, int i12, int i13, a1 a1Var, boolean z10) {
        this.f87154a = i10;
        this.f87155b = i11;
        this.f87156c = i12;
        this.f87157d = i13;
        this.f87158e = a1Var;
        this.f87159f = z10;
    }
}
