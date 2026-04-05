package o2;

import g2.b;
import g2.c2;
import g2.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.e0;
import l2.y;
import uu.o0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g implements u {

    /* renamed from: a, reason: collision with root package name */
    public final String f77404a;

    /* renamed from: b, reason: collision with root package name */
    public final c2 f77405b;

    /* renamed from: c, reason: collision with root package name */
    public final List f77406c;

    /* renamed from: d, reason: collision with root package name */
    public final List f77407d;

    /* renamed from: e, reason: collision with root package name */
    public final y f77408e;

    /* renamed from: f, reason: collision with root package name */
    public final s2.e f77409f;

    /* renamed from: g, reason: collision with root package name */
    public final l f77410g;

    /* renamed from: h, reason: collision with root package name */
    public final CharSequence f77411h;

    /* renamed from: i, reason: collision with root package name */
    public final h2.j f77412i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f77413j;

    /* renamed from: k, reason: collision with root package name */
    public final int f77414k;

    public g(String text, c2 style, List<b.C0570b> spanStyles, List<b.C0570b> placeholders, y fontFamilyResolver, s2.e density) {
        e0.checkNotNullParameter(text, "text");
        e0.checkNotNullParameter(style, "style");
        e0.checkNotNullParameter(spanStyles, "spanStyles");
        e0.checkNotNullParameter(placeholders, "placeholders");
        e0.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        e0.checkNotNullParameter(density, "density");
        this.f77404a = text;
        this.f77405b = style;
        this.f77406c = spanStyles;
        this.f77407d = placeholders;
        this.f77408e = fontFamilyResolver;
        this.f77409f = density;
        l lVar = new l(1, density.getDensity());
        this.f77410g = lVar;
        this.f77413j = new ArrayList();
        int iM5769resolveTextDirectionHeuristics9GRLPo0 = h.m5769resolveTextDirectionHeuristics9GRLPo0(style.m3990getTextDirectionmmuk1to(), style.getLocaleList());
        this.f77414k = iM5769resolveTextDirectionHeuristics9GRLPo0;
        f fVar = new f(this);
        CharSequence charSequenceCreateCharSequence = e.createCharSequence(text, lVar.getTextSize(), style, y0.plus((Collection) o0.listOf(new b.C0570b(p2.g.applySpanStyle(lVar, style.toSpanStyle(), fVar, density), 0, text.length())), (Iterable) spanStyles), placeholders, density, fVar);
        this.f77411h = charSequenceCreateCharSequence;
        this.f77412i = new h2.j(charSequenceCreateCharSequence, lVar, iM5769resolveTextDirectionHeuristics9GRLPo0);
    }

    public final CharSequence getCharSequence$ui_text_release() {
        return this.f77411h;
    }

    public final s2.e getDensity() {
        return this.f77409f;
    }

    public final y getFontFamilyResolver() {
        return this.f77408e;
    }

    @Override // g2.u
    public boolean getHasStaleResolvedFonts() {
        ArrayList arrayList = this.f77413j;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((p) arrayList.get(i10)).isStaleResolvedFont()) {
                return true;
            }
        }
        return false;
    }

    public final h2.j getLayoutIntrinsics$ui_text_release() {
        return this.f77412i;
    }

    @Override // g2.u
    public float getMaxIntrinsicWidth() {
        return this.f77412i.getMaxIntrinsicWidth();
    }

    @Override // g2.u
    public float getMinIntrinsicWidth() {
        return this.f77412i.getMinIntrinsicWidth();
    }

    public final List<b.C0570b> getPlaceholders() {
        return this.f77407d;
    }

    public final List<b.C0570b> getSpanStyles() {
        return this.f77406c;
    }

    public final c2 getStyle() {
        return this.f77405b;
    }

    public final String getText() {
        return this.f77404a;
    }

    public final int getTextDirectionHeuristic$ui_text_release() {
        return this.f77414k;
    }

    public final l getTextPaint$ui_text_release() {
        return this.f77410g;
    }
}
