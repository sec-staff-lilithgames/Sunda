package kotlinx.coroutines;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class Empty implements Incomplete {
    private final boolean isActive;

    public Empty(boolean z10) {
        this.isActive = z10;
    }

    @Override // kotlinx.coroutines.Incomplete
    public NodeList getList() {
        return null;
    }

    @Override // kotlinx.coroutines.Incomplete
    public boolean isActive() {
        return this.isActive;
    }

    public String toString() {
        return o2.q(new StringBuilder("Empty{"), isActive() ? "Active" : "New", AbstractJsonLexerKt.END_OBJ);
    }
}
