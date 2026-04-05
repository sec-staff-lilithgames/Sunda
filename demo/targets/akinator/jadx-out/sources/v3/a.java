package v3;

import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f88940a;

    /* renamed from: b, reason: collision with root package name */
    public int f88941b;

    /* renamed from: c, reason: collision with root package name */
    public j f88942c;

    public a() {
        Locale locale = Locale.getDefault();
        n nVar = c.f88948d;
        this.f88940a = p.getLayoutDirectionFromLocale(locale) == 1;
        this.f88942c = c.f88948d;
        this.f88941b = 2;
    }

    public c build() {
        if (this.f88941b == 2 && this.f88942c == c.f88948d) {
            return this.f88940a ? c.f88952h : c.f88951g;
        }
        return new c(this.f88940a, this.f88941b, this.f88942c);
    }

    public a setTextDirectionHeuristic(j jVar) {
        this.f88942c = jVar;
        return this;
    }

    public a stereoReset(boolean z10) {
        if (z10) {
            this.f88941b |= 2;
            return this;
        }
        this.f88941b &= -3;
        return this;
    }

    public a(boolean z10) {
        this.f88940a = z10;
        this.f88942c = c.f88948d;
        this.f88941b = 2;
    }

    public a(Locale locale) {
        n nVar = c.f88948d;
        this.f88940a = p.getLayoutDirectionFromLocale(locale) == 1;
        this.f88942c = c.f88948d;
        this.f88941b = 2;
    }
}
