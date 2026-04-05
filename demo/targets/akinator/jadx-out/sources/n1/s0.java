package n1;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import j1.l2;
import j1.n2;
import java.util.List;
import p0.a6;
import p0.o4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class s0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kv.a f75512e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kv.a aVar) {
            super(0);
            this.f75512e = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, n1.f] */
        @Override // kv.a
        public final f invoke() {
            return this.f75512e.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0242 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Group(java.lang.String r21, float r22, float r23, float r24, float r25, float r26, float r27, float r28, java.util.List<? extends n1.g> r29, kv.p r30, p0.w r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.s0.Group(java.lang.String, float, float, float, float, float, float, float, java.util.List, kv.p, p0.w, int, int):void");
    }

    /* renamed from: Path-9cdaXJ4, reason: not valid java name */
    public static final void m5745Path9cdaXJ4(List<? extends g> pathData, int i10, String str, j1.b0 b0Var, float f10, j1.b0 b0Var2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16, p0.w wVar, int i13, int i14, int i15) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pathData, "pathData");
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(-1478270750);
        int defaultFillType = (i15 & 2) != 0 ? w0.getDefaultFillType() : i10;
        String str2 = (i15 & 4) != 0 ? "" : str;
        j1.b0 b0Var3 = (i15 & 8) != 0 ? null : b0Var;
        float f17 = (i15 & 16) != 0 ? 1.0f : f10;
        j1.b0 b0Var4 = (i15 & 32) == 0 ? b0Var2 : null;
        float f18 = (i15 & 64) != 0 ? 1.0f : f11;
        float f19 = (i15 & 128) != 0 ? 0.0f : f12;
        int defaultStrokeLineCap = (i15 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? w0.getDefaultStrokeLineCap() : i11;
        int defaultStrokeLineJoin = (i15 & 512) != 0 ? w0.getDefaultStrokeLineJoin() : i12;
        float f20 = (i15 & 1024) != 0 ? 4.0f : f13;
        float f21 = (i15 & 2048) != 0 ? 0.0f : f14;
        float f22 = (i15 & 4096) != 0 ? 1.0f : f15;
        float f23 = (i15 & Segment.SIZE) != 0 ? 0.0f : f16;
        c0 c0Var = c0.f75334e;
        int i16 = defaultFillType;
        wVarStartRestartGroup.startReplaceableGroup(1886828752);
        if (!(wVarStartRestartGroup.getApplier() instanceof m)) {
            p0.p.invalidApplier();
        }
        wVarStartRestartGroup.startNode();
        if (wVarStartRestartGroup.getInserting()) {
            wVarStartRestartGroup.createNode(new a(c0Var));
        } else {
            wVarStartRestartGroup.useNode();
        }
        p0.w wVarM5780constructorimpl = a6.m5780constructorimpl(wVarStartRestartGroup);
        a6.m5787setimpl(wVarM5780constructorimpl, str2, i0.f75439e);
        a6.m5787setimpl(wVarM5780constructorimpl, pathData, j0.f75449e);
        a6.m5787setimpl(wVarM5780constructorimpl, j1.o1.m4895boximpl(i16), k0.f75465e);
        a6.m5787setimpl(wVarM5780constructorimpl, b0Var3, l0.f75468e);
        a6.m5787setimpl(wVarM5780constructorimpl, Float.valueOf(f17), m0.f75470e);
        a6.m5787setimpl(wVarM5780constructorimpl, b0Var4, n0.f75473e);
        a6.m5787setimpl(wVarM5780constructorimpl, Float.valueOf(f18), o0.f75476e);
        a6.m5787setimpl(wVarM5780constructorimpl, Float.valueOf(f19), p0.f75479e);
        a6.m5787setimpl(wVarM5780constructorimpl, n2.m4878boximpl(defaultStrokeLineJoin), q0.f75490e);
        a6.m5787setimpl(wVarM5780constructorimpl, l2.m4841boximpl(defaultStrokeLineCap), d0.f75343e);
        a6.m5787setimpl(wVarM5780constructorimpl, Float.valueOf(f20), e0.f75347e);
        a6.m5787setimpl(wVarM5780constructorimpl, Float.valueOf(f21), f0.f75374e);
        a6.m5787setimpl(wVarM5780constructorimpl, Float.valueOf(f22), g0.f75435e);
        a6.m5787setimpl(wVarM5780constructorimpl, Float.valueOf(f23), h0.f75437e);
        wVarStartRestartGroup.endNode();
        wVarStartRestartGroup.endReplaceableGroup();
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup == null) {
            return;
        }
        o4VarEndRestartGroup.updateScope(new r0(pathData, i16, str2, b0Var3, f17, b0Var4, f18, f19, defaultStrokeLineCap, defaultStrokeLineJoin, f20, f21, f22, f23, i13, i14, i15));
    }
}
