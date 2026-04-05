package io.ktor.http.parsing;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class RangeGrammar extends Grammar {
    private final char from;

    /* renamed from: to, reason: collision with root package name */
    private final char f62174to;

    public RangeGrammar(char c10, char c11) {
        super(null);
        this.from = c10;
        this.f62174to = c11;
    }

    public final char getFrom() {
        return this.from;
    }

    public final char getTo() {
        return this.f62174to;
    }
}
