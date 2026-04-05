package com.moloco.sdk.acm;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class k {
    public static final String a(e eVar) {
        e0.checkNotNullParameter(eVar, "<this>");
        return eVar.getKey() + AbstractJsonLexerKt.COLON + eVar.getValue();
    }
}
