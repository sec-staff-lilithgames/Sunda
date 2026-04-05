package z7;

import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class t implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f97660a;

    /* renamed from: b, reason: collision with root package name */
    public final List f97661b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f97662c;

    public t(String str, List<c> list, boolean z10) {
        this.f97660a = str;
        this.f97661b = list;
        this.f97662c = z10;
    }

    public List<c> getItems() {
        return this.f97661b;
    }

    public String getName() {
        return this.f97660a;
    }

    public boolean isHidden() {
        return this.f97662c;
    }

    @Override // z7.c
    public t7.d toContent(r7.a0 a0Var, r7.h hVar, a8.a aVar) {
        return new t7.e(a0Var, aVar, this, hVar);
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f97660a + "' Shapes: " + Arrays.toString(this.f97661b.toArray()) + AbstractJsonLexerKt.END_OBJ;
    }
}
