package g2;

import g2.b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o implements u {

    /* renamed from: a, reason: collision with root package name */
    public final b f56797a;

    /* renamed from: b, reason: collision with root package name */
    public final List f56798b;

    /* renamed from: c, reason: collision with root package name */
    public final tu.o f56799c;

    /* renamed from: d, reason: collision with root package name */
    public final tu.o f56800d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f56801e;

    public o(b bVar, c2 c2Var, List<b.C0570b> placeholders, s2.e eVar, l2.y yVar) {
        b annotatedString = bVar;
        c2 style = c2Var;
        kotlin.jvm.internal.e0.checkNotNullParameter(annotatedString, "annotatedString");
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        kotlin.jvm.internal.e0.checkNotNullParameter(placeholders, "placeholders");
        s2.e density = eVar;
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        l2.y fontFamilyResolver = yVar;
        kotlin.jvm.internal.e0.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        this.f56797a = annotatedString;
        this.f56798b = placeholders;
        tu.s sVar = tu.s.f87405e;
        this.f56799c = tu.q.lazy(sVar, (kv.a) new n(this));
        this.f56800d = tu.q.lazy(sVar, (kv.a) new m(this));
        x paragraphStyle = style.toParagraphStyle();
        List<b.C0570b> listNormalizedParagraphStyles = g.normalizedParagraphStyles(annotatedString, paragraphStyle);
        ArrayList arrayList = new ArrayList(listNormalizedParagraphStyles.size());
        int size = listNormalizedParagraphStyles.size();
        int i10 = 0;
        while (i10 < size) {
            b.C0570b c0570b = listNormalizedParagraphStyles.get(i10);
            b bVarAccess$substringWithoutParagraphStyles = g.access$substringWithoutParagraphStyles(annotatedString, c0570b.getStart(), c0570b.getEnd());
            arrayList.add(new t(v.ParagraphIntrinsics(bVarAccess$substringWithoutParagraphStyles.getText(), style.merge(access$resolveTextDirection(this, (x) c0570b.getItem(), paragraphStyle)), bVarAccess$substringWithoutParagraphStyles.getSpanStyles(), (List<b.C0570b>) p.access$getLocalPlaceholders(getPlaceholders(), c0570b.getStart(), c0570b.getEnd()), density, fontFamilyResolver), c0570b.getStart(), c0570b.getEnd()));
            i10++;
            annotatedString = bVar;
            style = c2Var;
            density = eVar;
            fontFamilyResolver = yVar;
        }
        this.f56801e = arrayList;
    }

    public static final x access$resolveTextDirection(o oVar, x xVar, x xVar2) {
        oVar.getClass();
        r2.p pVarM4039getTextDirectionmmuk1to = xVar.m4039getTextDirectionmmuk1to();
        if (pVarM4039getTextDirectionmmuk1to == null) {
            return x.m4033copyElsmlbk$default(xVar, null, xVar2.m4039getTextDirectionmmuk1to(), 0L, null, 13, null);
        }
        pVarM4039getTextDirectionmmuk1to.m6090unboximpl();
        return xVar;
    }

    public final b getAnnotatedString() {
        return this.f56797a;
    }

    @Override // g2.u
    public boolean getHasStaleResolvedFonts() {
        ArrayList arrayList = this.f56801e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((t) arrayList.get(i10)).getIntrinsics().getHasStaleResolvedFonts()) {
                return true;
            }
        }
        return false;
    }

    public final List<t> getInfoList$ui_text_release() {
        return this.f56801e;
    }

    @Override // g2.u
    public float getMaxIntrinsicWidth() {
        return ((Number) this.f56800d.getValue()).floatValue();
    }

    @Override // g2.u
    public float getMinIntrinsicWidth() {
        return ((Number) this.f56799c.getValue()).floatValue();
    }

    public final List<b.C0570b> getPlaceholders() {
        return this.f56798b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @tu.f
    public o(b annotatedString, c2 style, List<b.C0570b> placeholders, s2.e density, l2.v resourceLoader) {
        this(annotatedString, style, placeholders, density, l2.t.createFontFamilyResolver(resourceLoader));
        kotlin.jvm.internal.e0.checkNotNullParameter(annotatedString, "annotatedString");
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        kotlin.jvm.internal.e0.checkNotNullParameter(placeholders, "placeholders");
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(resourceLoader, "resourceLoader");
    }
}
