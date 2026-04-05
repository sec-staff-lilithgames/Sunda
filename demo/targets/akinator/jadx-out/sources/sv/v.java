package sv;

import java.util.Iterator;
import java.util.regex.MatchResult;
import p0.g2;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v extends uu.a implements q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f86200b;

    public v(w wVar) {
        this.f86200b = wVar;
    }

    @Override // uu.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof o) {
            return contains((o) obj);
        }
        return false;
    }

    @Override // sv.q, sv.p
    public o get(int i10) {
        w wVar = this.f86200b;
        MatchResult matchResult = wVar.f86201a;
        qv.m mVarUntil = qv.v.until(matchResult.start(i10), matchResult.end(i10));
        if (mVarUntil.getStart().intValue() < 0) {
            return null;
        }
        String strGroup = wVar.f86201a.group(i10);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strGroup, "group(...)");
        return new o(strGroup, mVarUntil);
    }

    @Override // uu.a
    public int getSize() {
        return this.f86200b.f86201a.groupCount() + 1;
    }

    @Override // uu.a, java.util.Collection
    public boolean isEmpty() {
        return false;
    }

    @Override // uu.a, java.util.Collection, java.lang.Iterable
    public Iterator<o> iterator() {
        return rv.f0.map(y0.asSequence(uu.p0.getIndices(this)), new g2(this, 11)).iterator();
    }

    public /* bridge */ boolean contains(o oVar) {
        return super.contains((Object) oVar);
    }

    @Override // sv.q
    public o get(String name) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        return dv.c.f52904a.getMatchResultNamedGroup(this.f86200b.f86201a, name);
    }
}
