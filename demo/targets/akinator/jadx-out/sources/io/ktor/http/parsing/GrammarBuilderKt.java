package io.ktor.http.parsing;

import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class GrammarBuilderKt {
    public static final Grammar grammar(l block) {
        e0.checkNotNullParameter(block, "block");
        GrammarBuilder grammarBuilder = new GrammarBuilder();
        block.invoke(grammarBuilder);
        return grammarBuilder.build();
    }
}
