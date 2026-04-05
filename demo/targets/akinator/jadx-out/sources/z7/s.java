package z7;

import android.graphics.Path;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class s implements c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f97654a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f97655b;

    /* renamed from: c, reason: collision with root package name */
    public final String f97656c;

    /* renamed from: d, reason: collision with root package name */
    public final y7.a f97657d;

    /* renamed from: e, reason: collision with root package name */
    public final y7.d f97658e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f97659f;

    public s(String str, boolean z10, Path.FillType fillType, y7.a aVar, y7.d dVar, boolean z11) {
        this.f97656c = str;
        this.f97654a = z10;
        this.f97655b = fillType;
        this.f97657d = aVar;
        this.f97658e = dVar;
        this.f97659f = z11;
    }

    public y7.a getColor() {
        return this.f97657d;
    }

    public Path.FillType getFillType() {
        return this.f97655b;
    }

    public String getName() {
        return this.f97656c;
    }

    public y7.d getOpacity() {
        return this.f97658e;
    }

    public boolean isHidden() {
        return this.f97659f;
    }

    @Override // z7.c
    public t7.d toContent(r7.a0 a0Var, r7.h hVar, a8.a aVar) {
        return new t7.h(a0Var, aVar, this);
    }

    public String toString() {
        return a.b.p(new StringBuilder("ShapeFill{color=, fillEnabled="), this.f97654a, AbstractJsonLexerKt.END_OBJ);
    }
}
