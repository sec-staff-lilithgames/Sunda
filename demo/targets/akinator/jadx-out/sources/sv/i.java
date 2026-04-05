package sv;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i implements rv.t {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f86147a;

    /* renamed from: b, reason: collision with root package name */
    public final int f86148b;

    /* renamed from: c, reason: collision with root package name */
    public final int f86149c;

    /* renamed from: d, reason: collision with root package name */
    public final kv.p f86150d;

    public i(CharSequence input, int i10, int i11, kv.p getNextMatch) {
        kotlin.jvm.internal.e0.checkNotNullParameter(input, "input");
        kotlin.jvm.internal.e0.checkNotNullParameter(getNextMatch, "getNextMatch");
        this.f86147a = input;
        this.f86148b = i10;
        this.f86149c = i11;
        this.f86150d = getNextMatch;
    }

    @Override // rv.t
    public Iterator<qv.m> iterator() {
        return new h(this);
    }
}
