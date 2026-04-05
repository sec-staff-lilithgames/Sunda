package o2;

import g2.b;
import g2.c2;
import g2.u;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.e0;
import l2.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class h {
    public static final u ActualParagraphIntrinsics(String text, c2 style, List<b.C0570b> spanStyles, List<b.C0570b> placeholders, s2.e density, y fontFamilyResolver) {
        e0.checkNotNullParameter(text, "text");
        e0.checkNotNullParameter(style, "style");
        e0.checkNotNullParameter(spanStyles, "spanStyles");
        e0.checkNotNullParameter(placeholders, "placeholders");
        e0.checkNotNullParameter(density, "density");
        e0.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        return new g(text, style, spanStyles, placeholders, fontFamilyResolver, density);
    }

    /* renamed from: resolveTextDirectionHeuristics-9GRLPo0, reason: not valid java name */
    public static final int m5769resolveTextDirectionHeuristics9GRLPo0(r2.p pVar, n2.e eVar) {
        Locale javaLocale;
        int iM6090unboximpl = pVar != null ? pVar.m6090unboximpl() : r2.p.f83714b.m6079getContents_7Xco();
        r2.o oVar = r2.p.f83714b;
        if (r2.p.m6087equalsimpl0(iM6090unboximpl, oVar.m6080getContentOrLtrs_7Xco())) {
            return 2;
        }
        if (r2.p.m6087equalsimpl0(iM6090unboximpl, oVar.m6081getContentOrRtls_7Xco())) {
            return 3;
        }
        if (r2.p.m6087equalsimpl0(iM6090unboximpl, oVar.m6082getLtrs_7Xco())) {
            return 0;
        }
        if (r2.p.m6087equalsimpl0(iM6090unboximpl, oVar.m6083getRtls_7Xco())) {
            return 1;
        }
        if (!r2.p.m6087equalsimpl0(iM6090unboximpl, oVar.m6079getContents_7Xco())) {
            throw new IllegalStateException("Invalid TextDirection.");
        }
        if (eVar == null || (javaLocale = ((n2.a) eVar.get(0).getPlatformLocale$ui_text_release()).getJavaLocale()) == null) {
            javaLocale = Locale.getDefault();
        }
        int layoutDirectionFromLocale = v3.p.getLayoutDirectionFromLocale(javaLocale);
        return (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) ? 2 : 3;
    }

    /* renamed from: resolveTextDirectionHeuristics-9GRLPo0$default, reason: not valid java name */
    public static /* synthetic */ int m5770resolveTextDirectionHeuristics9GRLPo0$default(r2.p pVar, n2.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pVar = null;
        }
        if ((i10 & 2) != 0) {
            eVar = null;
        }
        return m5769resolveTextDirectionHeuristics9GRLPo0(pVar, eVar);
    }
}
