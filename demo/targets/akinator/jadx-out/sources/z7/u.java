package z7;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class u implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f97663a;

    /* renamed from: b, reason: collision with root package name */
    public final int f97664b;

    /* renamed from: c, reason: collision with root package name */
    public final y7.h f97665c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f97666d;

    public u(String str, int i10, y7.h hVar, boolean z10) {
        this.f97663a = str;
        this.f97664b = i10;
        this.f97665c = hVar;
        this.f97666d = z10;
    }

    public String getName() {
        return this.f97663a;
    }

    public y7.h getShapePath() {
        return this.f97665c;
    }

    public boolean isHidden() {
        return this.f97666d;
    }

    @Override // z7.c
    public t7.d toContent(r7.a0 a0Var, r7.h hVar, a8.a aVar) {
        return new t7.s(a0Var, aVar, this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ShapePath{name=");
        sb2.append(this.f97663a);
        sb2.append(", index=");
        return e3.g.m(sb2, this.f97664b, AbstractJsonLexerKt.END_OBJ);
    }
}
