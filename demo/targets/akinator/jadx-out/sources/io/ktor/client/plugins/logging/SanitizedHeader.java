package io.ktor.client.plugins.logging;

import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class SanitizedHeader {
    private final String placeholder;
    private final l predicate;

    public SanitizedHeader(String placeholder, l predicate) {
        e0.checkNotNullParameter(placeholder, "placeholder");
        e0.checkNotNullParameter(predicate, "predicate");
        this.placeholder = placeholder;
        this.predicate = predicate;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final l getPredicate() {
        return this.predicate;
    }
}
