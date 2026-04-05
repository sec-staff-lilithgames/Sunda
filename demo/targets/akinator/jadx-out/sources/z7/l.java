package z7;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import r7.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class l implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f97622a;

    /* renamed from: b, reason: collision with root package name */
    public final k f97623b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f97624c;

    public l(String str, k kVar, boolean z10) {
        this.f97622a = str;
        this.f97623b = kVar;
        this.f97624c = z10;
    }

    public k getMode() {
        return this.f97623b;
    }

    public String getName() {
        return this.f97622a;
    }

    public boolean isHidden() {
        return this.f97624c;
    }

    @Override // z7.c
    public t7.d toContent(r7.a0 a0Var, r7.h hVar, a8.a aVar) {
        if (a0Var.isFeatureFlagEnabled(b0.f83871b)) {
            return new t7.m(this);
        }
        e8.e.warning("Animation contains merge paths but they are disabled.");
        return null;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f97623b + AbstractJsonLexerKt.END_OBJ;
    }
}
