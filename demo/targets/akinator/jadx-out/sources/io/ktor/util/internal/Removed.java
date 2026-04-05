package io.ktor.util.internal;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class Removed {
    public final LockFreeLinkedListNode ref;

    public Removed(LockFreeLinkedListNode ref) {
        e0.checkNotNullParameter(ref, "ref");
        this.ref = ref;
    }

    public String toString() {
        return "Removed[" + this.ref + AbstractJsonLexerKt.END_LIST;
    }
}
