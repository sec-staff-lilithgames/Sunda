package sv;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final t f86198a;

    public s(t match) {
        kotlin.jvm.internal.e0.checkNotNullParameter(match, "match");
        this.f86198a = match;
    }

    public final t getMatch() {
        return this.f86198a;
    }

    public final List<String> toList() {
        t tVar = this.f86198a;
        return tVar.getGroupValues().subList(1, tVar.getGroupValues().size());
    }
}
