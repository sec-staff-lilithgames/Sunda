package z7;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class o implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f97639a;

    /* renamed from: b, reason: collision with root package name */
    public final y7.o f97640b;

    /* renamed from: c, reason: collision with root package name */
    public final y7.o f97641c;

    /* renamed from: d, reason: collision with root package name */
    public final y7.b f97642d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f97643e;

    public o(String str, y7.o oVar, y7.o oVar2, y7.b bVar, boolean z10) {
        this.f97639a = str;
        this.f97640b = oVar;
        this.f97641c = oVar2;
        this.f97642d = bVar;
        this.f97643e = z10;
    }

    public y7.b getCornerRadius() {
        return this.f97642d;
    }

    public String getName() {
        return this.f97639a;
    }

    public y7.o getPosition() {
        return this.f97640b;
    }

    public y7.o getSize() {
        return this.f97641c;
    }

    public boolean isHidden() {
        return this.f97643e;
    }

    @Override // z7.c
    public t7.d toContent(r7.a0 a0Var, r7.h hVar, a8.a aVar) {
        return new t7.p(a0Var, aVar, this);
    }

    public String toString() {
        return "RectangleShape{position=" + this.f97640b + ", size=" + this.f97641c + AbstractJsonLexerKt.END_OBJ;
    }
}
