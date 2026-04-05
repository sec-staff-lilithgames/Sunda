package k0;

import i1.j;
import i1.m;
import i1.p;
import j1.g1;
import kotlin.jvm.internal.e0;
import s2.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b topStart, b topEnd, b bottomEnd, b bottomStart) {
        super(topStart, topEnd, bottomEnd, bottomStart);
        e0.checkNotNullParameter(topStart, "topStart");
        e0.checkNotNullParameter(topEnd, "topEnd");
        e0.checkNotNullParameter(bottomEnd, "bottomEnd");
        e0.checkNotNullParameter(bottomStart, "bottomStart");
    }

    @Override // k0.a
    /* renamed from: createOutline-LjSzlW0 */
    public g1 mo5088createOutlineLjSzlW0(long j10, float f10, float f11, float f12, float f13, x layoutDirection) {
        e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (f10 + f11 + f12 + f13 == 0.0f) {
            return new g1.b(p.m4269toRectuvyYCjk(j10));
        }
        j jVarM4269toRectuvyYCjk = p.m4269toRectuvyYCjk(j10);
        x xVar = x.f85363b;
        return new g1.c(m.m4231RoundRectZAM2FJo(jVarM4269toRectuvyYCjk, i1.c.CornerRadius$default(layoutDirection == xVar ? f10 : f11, 0.0f, 2, null), i1.c.CornerRadius$default(layoutDirection == xVar ? f11 : f10, 0.0f, 2, null), i1.c.CornerRadius$default(layoutDirection == xVar ? f12 : f13, 0.0f, 2, null), i1.c.CornerRadius$default(layoutDirection == xVar ? f13 : f12, 0.0f, 2, null)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return e0.areEqual(getTopStart(), hVar.getTopStart()) && e0.areEqual(getTopEnd(), hVar.getTopEnd()) && e0.areEqual(getBottomEnd(), hVar.getBottomEnd()) && e0.areEqual(getBottomStart(), hVar.getBottomStart());
    }

    public int hashCode() {
        return getBottomStart().hashCode() + ((getBottomEnd().hashCode() + ((getTopEnd().hashCode() + (getTopStart().hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + getTopStart() + ", topEnd = " + getTopEnd() + ", bottomEnd = " + getBottomEnd() + ", bottomStart = " + getBottomStart() + ')';
    }

    @Override // k0.a
    public h copy(b topStart, b topEnd, b bottomEnd, b bottomStart) {
        e0.checkNotNullParameter(topStart, "topStart");
        e0.checkNotNullParameter(topEnd, "topEnd");
        e0.checkNotNullParameter(bottomEnd, "bottomEnd");
        e0.checkNotNullParameter(bottomStart, "bottomStart");
        return new h(topStart, topEnd, bottomEnd, bottomStart);
    }
}
