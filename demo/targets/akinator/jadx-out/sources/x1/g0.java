package x1;

import a2.a3;
import a2.g5;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;
import p0.a6;
import p0.o4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class g0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kv.a f91351e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kv.a aVar) {
            super(0);
            this.f91351e = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, z1.g] */
        @Override // kv.a
        public final z1.g invoke() {
            return this.f91351e.invoke();
        }
    }

    public static final void Layout(kv.p content, e1.v vVar, x0 measurePolicy, p0.w wVar, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurePolicy, "measurePolicy");
        wVar.startReplaceableGroup(-1323940314);
        if ((i11 & 2) != 0) {
            vVar = e1.t.f53496b;
        }
        s2.e eVar = (s2.e) wVar.consume(a3.getLocalDensity());
        s2.x xVar = (s2.x) wVar.consume(a3.getLocalLayoutDirection());
        g5 g5Var = (g5) wVar.consume(a3.getLocalViewConfiguration());
        z1.f fVar = z1.g.Z8;
        kv.a constructor = fVar.getConstructor();
        kv.q qVarMaterializerOf = materializerOf(vVar);
        int i12 = ((i10 << 9) & 7168) | 6;
        if (wVar.getApplier() == null) {
            p0.p.invalidApplier();
        }
        wVar.startReusableNode();
        if (wVar.getInserting()) {
            wVar.createNode(constructor);
        } else {
            wVar.useNode();
        }
        wVar.disableReusing();
        p0.w wVarM5780constructorimpl = a6.m5780constructorimpl(wVar);
        a6.m5787setimpl(wVarM5780constructorimpl, xVar, a.b.v(fVar, wVarM5780constructorimpl, measurePolicy, wVarM5780constructorimpl, eVar));
        a.b.y(0, qVarMaterializerOf, a.b.w(fVar, wVarM5780constructorimpl, g5Var, wVar, wVar), wVar, 2058660585);
        content.invoke(wVar, Integer.valueOf((i12 >> 9) & 14));
        wVar.endReplaceableGroup();
        wVar.endNode();
        wVar.endReplaceableGroup();
    }

    @tu.f
    public static final z1.e1 MeasuringIntrinsicsMeasureBlocks(kv.q measureBlock) {
        kotlin.jvm.internal.e0.checkNotNullParameter(measureBlock, "measureBlock");
        return new j0(measureBlock);
    }

    @tu.f
    public static final void MultiMeasureLayout(e1.v vVar, kv.p content, x0 measurePolicy, p0.w wVar, int i10, int i11) {
        int i12;
        kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurePolicy, "measurePolicy");
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(1949933075);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (wVarStartRestartGroup.changed(vVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= wVarStartRestartGroup.changed(content) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= wVarStartRestartGroup.changed(measurePolicy) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i12 & 731) == 146 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                vVar = e1.t.f53496b;
            }
            e1.v vVarMaterialize = e1.o.materialize(wVarStartRestartGroup, vVar);
            s2.e eVar = (s2.e) wVarStartRestartGroup.consume(a3.getLocalDensity());
            s2.x xVar = (s2.x) wVarStartRestartGroup.consume(a3.getLocalLayoutDirection());
            g5 g5Var = (g5) wVarStartRestartGroup.consume(a3.getLocalViewConfiguration());
            kv.a constructor$ui_release = z1.b0.V.getConstructor$ui_release();
            int i14 = ((i12 << 3) & 896) | 6;
            wVarStartRestartGroup.startReplaceableGroup(-692256719);
            if (wVarStartRestartGroup.getApplier() == null) {
                p0.p.invalidApplier();
            }
            wVarStartRestartGroup.startReusableNode();
            if (wVarStartRestartGroup.getInserting()) {
                wVarStartRestartGroup.createNode(constructor$ui_release);
            } else {
                wVarStartRestartGroup.useNode();
            }
            wVarStartRestartGroup.disableReusing();
            p0.w wVarM5780constructorimpl = a6.m5780constructorimpl(wVarStartRestartGroup);
            z1.f fVar = z1.g.Z8;
            a6.m5787setimpl(wVarM5780constructorimpl, vVarMaterialize, fVar.getSetModifier());
            a6.m5787setimpl(wVarM5780constructorimpl, measurePolicy, fVar.getSetMeasurePolicy());
            a6.m5787setimpl(wVarM5780constructorimpl, eVar, fVar.getSetDensity());
            a6.m5787setimpl(wVarM5780constructorimpl, xVar, fVar.getSetLayoutDirection());
            a6.m5787setimpl(wVarM5780constructorimpl, g5Var, fVar.getSetViewConfiguration());
            a6.m5784initimpl(wVarM5780constructorimpl, k0.f91376e);
            wVarStartRestartGroup.enableReusing();
            content.invoke(wVarStartRestartGroup, Integer.valueOf((i14 >> 6) & 14));
            wVarStartRestartGroup.endNode();
            wVarStartRestartGroup.endReplaceableGroup();
        }
        e1.v vVar2 = vVar;
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup == null) {
            return;
        }
        o4VarEndRestartGroup.updateScope(new l0(vVar2, content, measurePolicy, i10, i11));
    }

    public static final int access$MeasuringMaxIntrinsicHeight(s2.e eVar, kv.q qVar, List list, int i10, s2.x xVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new t((y) list.get(i11), a0.f91329c, b0.f91333c));
        }
        return ((y0) qVar.invoke(new c0(eVar, xVar), arrayList, s2.c.m6744boximpl(s2.d.Constraints$default(0, i10, 0, 0, 13, null)))).getHeight();
    }

    public static final int access$MeasuringMaxIntrinsicWidth(s2.e eVar, kv.q qVar, List list, int i10, s2.x xVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new t((y) list.get(i11), a0.f91329c, b0.f91332b));
        }
        return ((y0) qVar.invoke(new c0(eVar, xVar), arrayList, s2.c.m6744boximpl(s2.d.Constraints$default(0, 0, 0, i10, 7, null)))).getWidth();
    }

    public static final int access$MeasuringMinIntrinsicHeight(s2.e eVar, kv.q qVar, List list, int i10, s2.x xVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new t((y) list.get(i11), a0.f91328b, b0.f91333c));
        }
        return ((y0) qVar.invoke(new c0(eVar, xVar), arrayList, s2.c.m6744boximpl(s2.d.Constraints$default(0, i10, 0, 0, 13, null)))).getHeight();
    }

    public static final int access$MeasuringMinIntrinsicWidth(s2.e eVar, kv.q qVar, List list, int i10, s2.x xVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new t((y) list.get(i11), a0.f91328b, b0.f91332b));
        }
        return ((y0) qVar.invoke(new c0(eVar, xVar), arrayList, s2.c.m6744boximpl(s2.d.Constraints$default(0, 0, 0, i10, 7, null)))).getWidth();
    }

    public static final kv.q materializerOf(e1.v modifier) {
        kotlin.jvm.internal.e0.checkNotNullParameter(modifier, "modifier");
        return z0.u.composableLambdaInstance(-1586257396, true, new m0(modifier));
    }

    @tu.f
    public static final z1.e1 measureBlocksOf(kv.q minIntrinsicWidthMeasureBlock, kv.q minIntrinsicHeightMeasureBlock, kv.q maxIntrinsicWidthMeasureBlock, kv.q maxIntrinsicHeightMeasureBlock, kv.q measureBlock) {
        kotlin.jvm.internal.e0.checkNotNullParameter(minIntrinsicWidthMeasureBlock, "minIntrinsicWidthMeasureBlock");
        kotlin.jvm.internal.e0.checkNotNullParameter(minIntrinsicHeightMeasureBlock, "minIntrinsicHeightMeasureBlock");
        kotlin.jvm.internal.e0.checkNotNullParameter(maxIntrinsicWidthMeasureBlock, "maxIntrinsicWidthMeasureBlock");
        kotlin.jvm.internal.e0.checkNotNullParameter(maxIntrinsicHeightMeasureBlock, "maxIntrinsicHeightMeasureBlock");
        kotlin.jvm.internal.e0.checkNotNullParameter(measureBlock, "measureBlock");
        return new n0(measureBlock, minIntrinsicWidthMeasureBlock, minIntrinsicHeightMeasureBlock, maxIntrinsicWidthMeasureBlock, maxIntrinsicHeightMeasureBlock);
    }

    public static final void Layout(e1.v vVar, x0 measurePolicy, p0.w wVar, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(measurePolicy, "measurePolicy");
        wVar.startReplaceableGroup(544976794);
        if ((i11 & 1) != 0) {
            vVar = e1.t.f53496b;
        }
        s2.e eVar = (s2.e) wVar.consume(a3.getLocalDensity());
        s2.x xVar = (s2.x) wVar.consume(a3.getLocalLayoutDirection());
        g5 g5Var = (g5) wVar.consume(a3.getLocalViewConfiguration());
        e1.v vVarMaterialize = e1.o.materialize(wVar, vVar);
        z1.f fVar = z1.g.Z8;
        kv.a constructor = fVar.getConstructor();
        wVar.startReplaceableGroup(1405779621);
        if (wVar.getApplier() == null) {
            p0.p.invalidApplier();
        }
        wVar.startReusableNode();
        if (wVar.getInserting()) {
            wVar.createNode(new a(constructor));
        } else {
            wVar.useNode();
        }
        wVar.disableReusing();
        p0.w wVarM5780constructorimpl = a6.m5780constructorimpl(wVar);
        a6.m5787setimpl(wVarM5780constructorimpl, xVar, a.b.v(fVar, wVarM5780constructorimpl, measurePolicy, wVarM5780constructorimpl, eVar));
        a6.m5787setimpl(wVarM5780constructorimpl, g5Var, fVar.getSetViewConfiguration());
        a6.m5787setimpl(wVarM5780constructorimpl, vVarMaterialize, fVar.getSetModifier());
        wVar.enableReusing();
        wVar.endNode();
        wVar.endReplaceableGroup();
        wVar.endReplaceableGroup();
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x018e  */
    @tu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Layout(kv.p r12, kv.q r13, kv.q r14, kv.q r15, kv.q r16, e1.v r17, kv.q r18, p0.w r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.g0.Layout(kv.p, kv.q, kv.q, kv.q, kv.q, e1.v, kv.q, p0.w, int, int):void");
    }
}
