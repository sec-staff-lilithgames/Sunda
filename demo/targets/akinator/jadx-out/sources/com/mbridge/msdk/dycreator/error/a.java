package com.mbridge.msdk.dycreator.error;

import e3.g;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private int f40248a;

    /* renamed from: b, reason: collision with root package name */
    private String f40249b;

    public a(b bVar) {
        if (bVar != null) {
            this.f40248a = bVar.a();
            this.f40249b = bVar.b();
        }
    }

    public String toString() {
        return g.m(new StringBuilder("DyError{errorCode="), this.f40248a, AbstractJsonLexerKt.END_OBJ);
    }

    public a(int i10, String str) {
        this.f40248a = i10;
        this.f40249b = str;
    }
}
