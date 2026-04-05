package l0;

import a2.a3;
import a2.g5;
import g2.b;
import g2.c2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p0.a6;
import p0.o4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final tu.v f72146a = new tu.v(uu.p0.emptyList(), uu.p0.emptyList());

    public static final void InlineChildren(g2.b text, List<b.C0570b> inlineContents, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.e0.checkNotNullParameter(inlineContents, "inlineContents");
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(-110905764);
        int size = inlineContents.size();
        for (int i11 = 0; i11 < size; i11++) {
            b.C0570b c0570b = inlineContents.get(i11);
            kv.q qVar = (kv.q) c0570b.component1();
            int iComponent2 = c0570b.component2();
            int iComponent3 = c0570b.component3();
            wVarStartRestartGroup.startReplaceableGroup(-1323940314);
            s2.e eVar = (s2.e) wVarStartRestartGroup.consume(a3.getLocalDensity());
            s2.x xVar = (s2.x) wVarStartRestartGroup.consume(a3.getLocalLayoutDirection());
            g5 g5Var = (g5) wVarStartRestartGroup.consume(a3.getLocalViewConfiguration());
            z1.f fVar = z1.g.Z8;
            kv.a constructor = fVar.getConstructor();
            kv.q qVarMaterializerOf = x1.g0.materializerOf(e1.t.f53496b);
            if (wVarStartRestartGroup.getApplier() == null) {
                p0.p.invalidApplier();
            }
            wVarStartRestartGroup.startReusableNode();
            if (wVarStartRestartGroup.getInserting()) {
                wVarStartRestartGroup.createNode(constructor);
            } else {
                wVarStartRestartGroup.useNode();
            }
            wVarStartRestartGroup.disableReusing();
            p0.w wVarM5780constructorimpl = a6.m5780constructorimpl(wVarStartRestartGroup);
            a6.m5787setimpl(wVarM5780constructorimpl, n.f72129a, fVar.getSetMeasurePolicy());
            a6.m5787setimpl(wVarM5780constructorimpl, eVar, fVar.getSetDensity());
            a6.m5787setimpl(wVarM5780constructorimpl, xVar, fVar.getSetLayoutDirection());
            qVarMaterializerOf.invoke(a.b.w(fVar, wVarM5780constructorimpl, g5Var, wVarStartRestartGroup, wVarStartRestartGroup), wVarStartRestartGroup, 0);
            wVarStartRestartGroup.startReplaceableGroup(2058660585);
            wVarStartRestartGroup.startReplaceableGroup(-72427749);
            qVar.invoke(text.subSequence(iComponent2, iComponent3).getText(), wVarStartRestartGroup, 0);
            wVarStartRestartGroup.endReplaceableGroup();
            wVarStartRestartGroup.endReplaceableGroup();
            wVarStartRestartGroup.endNode();
            wVarStartRestartGroup.endReplaceableGroup();
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup == null) {
            return;
        }
        o4VarEndRestartGroup.updateScope(new o(text, inlineContents, i10));
    }

    public static final tu.v resolveInlineContent(g2.b text, Map<String, s> inlineContent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.e0.checkNotNullParameter(inlineContent, "inlineContent");
        if (inlineContent.isEmpty()) {
            return f72146a;
        }
        List<b.C0570b> stringAnnotations = text.getStringAnnotations("androidx.compose.foundation.text.inlineContent", 0, text.length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = stringAnnotations.size();
        for (int i10 = 0; i10 < size; i10++) {
            b.C0570b c0570b = stringAnnotations.get(i10);
            s sVar = inlineContent.get(c0570b.getItem());
            if (sVar != null) {
                arrayList.add(new b.C0570b(sVar.getPlaceholder(), c0570b.getStart(), c0570b.getEnd()));
                arrayList2.add(new b.C0570b(sVar.getChildren(), c0570b.getStart(), c0570b.getEnd()));
            }
        }
        return new tu.v(arrayList, arrayList2);
    }

    /* renamed from: updateTextDelegate-x_uQXYA, reason: not valid java name */
    public static final y0 m5275updateTextDelegatex_uQXYA(y0 current, g2.b text, c2 style, s2.e density, l2.y fontFamilyResolver, boolean z10, int i10, int i11, List<b.C0570b> placeholders) {
        int i12;
        int i13;
        kotlin.jvm.internal.e0.checkNotNullParameter(current, "current");
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        kotlin.jvm.internal.e0.checkNotNullParameter(placeholders, "placeholders");
        if (kotlin.jvm.internal.e0.areEqual(current.getText(), text) && kotlin.jvm.internal.e0.areEqual(current.getStyle(), style) && current.getSoftWrap() == z10) {
            i12 = i10;
            if (r2.a0.m6027equalsimpl0(current.m5290getOverflowgIe3tQ8(), i12)) {
                i13 = i11;
                if (current.getMaxLines() == i13 && kotlin.jvm.internal.e0.areEqual(current.getDensity(), density) && kotlin.jvm.internal.e0.areEqual(current.getPlaceholders(), placeholders) && current.getFontFamilyResolver() == fontFamilyResolver) {
                    return current;
                }
            }
            return new y0(text, style, i13, z10, i12, density, fontFamilyResolver, placeholders, null);
        }
        i12 = i10;
        i13 = i11;
        return new y0(text, style, i13, z10, i12, density, fontFamilyResolver, placeholders, null);
    }

    /* renamed from: updateTextDelegate-y0k-MQk, reason: not valid java name */
    public static final y0 m5277updateTextDelegatey0kMQk(y0 current, String text, c2 style, s2.e density, l2.y fontFamilyResolver, boolean z10, int i10, int i11) {
        int i12;
        kotlin.jvm.internal.e0.checkNotNullParameter(current, "current");
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        if (kotlin.jvm.internal.e0.areEqual(current.getText().getText(), text) && kotlin.jvm.internal.e0.areEqual(current.getStyle(), style)) {
            if (current.getSoftWrap() == z10) {
                if (r2.a0.m6027equalsimpl0(current.m5290getOverflowgIe3tQ8(), i10)) {
                    i12 = i11;
                    if (current.getMaxLines() == i12 && kotlin.jvm.internal.e0.areEqual(current.getDensity(), density) && current.getFontFamilyResolver() == fontFamilyResolver) {
                        return current;
                    }
                }
                return new y0(new g2.b(text, null, null, 6, null), style, i12, z10, i10, density, fontFamilyResolver, null, 128, null);
            }
            i12 = i11;
            return new y0(new g2.b(text, null, null, 6, null), style, i12, z10, i10, density, fontFamilyResolver, null, 128, null);
        }
        i12 = i11;
        return new y0(new g2.b(text, null, null, 6, null), style, i12, z10, i10, density, fontFamilyResolver, null, 128, null);
    }

    /* renamed from: updateTextDelegate-y0k-MQk$default, reason: not valid java name */
    public static /* synthetic */ y0 m5278updateTextDelegatey0kMQk$default(y0 y0Var, String str, c2 c2Var, s2.e eVar, l2.y yVar, boolean z10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            z10 = true;
        }
        return m5277updateTextDelegatey0kMQk(y0Var, str, c2Var, eVar, yVar, z10, (i12 & 64) != 0 ? r2.a0.f83672b.m6099getClipgIe3tQ8() : i10, (i12 & 128) != 0 ? Integer.MAX_VALUE : i11);
    }
}
