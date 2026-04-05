package br;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final i f9892a;

    /* renamed from: b, reason: collision with root package name */
    public final n f9893b;

    /* renamed from: c, reason: collision with root package name */
    public final k f9894c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9895d;

    /* renamed from: e, reason: collision with root package name */
    public final g f9896e;

    public l(i event, n style, k kVar, long j10, g gVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        this.f9892a = event;
        this.f9893b = style;
        this.f9894c = kVar;
        this.f9895d = j10;
        this.f9896e = gVar;
    }

    public final g getDirection() {
        return this.f9896e;
    }

    public final g getDirectionOrDefault() {
        g gVar = this.f9896e;
        return gVar == null ? g.Left : gVar;
    }

    public final long getDuration() {
        return this.f9895d;
    }

    public final i getEvent() {
        return this.f9892a;
    }

    public final k getFunction() {
        return this.f9894c;
    }

    public final n getStyle() {
        return this.f9893b;
    }
}
