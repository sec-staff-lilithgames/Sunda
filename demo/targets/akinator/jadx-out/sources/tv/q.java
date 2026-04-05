package tv;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q implements s {

    /* renamed from: a, reason: collision with root package name */
    public final String f87458a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f87459b;

    public q(String error, CharSequence input) {
        e0.checkNotNullParameter(error, "error");
        e0.checkNotNullParameter(input, "input");
        this.f87458a = error;
        this.f87459b = input;
    }

    public final String getError() {
        return this.f87458a;
    }

    public final CharSequence getInput() {
        return this.f87459b;
    }

    @Override // tv.s
    public n toInstant() {
        throw new o(this.f87458a + " when parsing an Instant from \"" + p.e(this.f87459b, 64) + AbstractJsonLexerKt.STRING);
    }

    @Override // tv.s
    public n toInstantOrNull() {
        return null;
    }
}
