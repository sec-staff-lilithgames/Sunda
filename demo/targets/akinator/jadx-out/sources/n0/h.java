package n0;

import androidx.core.app.NotificationCompat;
import g0.i2;
import j1.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class h {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Button(kv.a r37, e1.v r38, boolean r39, f0.q r40, n0.c r41, j1.f2 r42, d0.v r43, n0.a r44, g0.i2 r45, kv.q r46, p0.w r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 755
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.h.Button(kv.a, e1.v, boolean, f0.q, n0.c, j1.f2, d0.v, n0.a, g0.i2, kv.q, p0.w, int, int):void");
    }

    public static final void OutlinedButton(kv.a onClick, e1.v vVar, boolean z10, f0.q qVar, c cVar, f2 f2Var, d0.v vVar2, a aVar, i2 i2Var, kv.q content, p0.w wVar, int i10, int i11) {
        f0.q qVar2;
        kotlin.jvm.internal.e0.checkNotNullParameter(onClick, "onClick");
        kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
        wVar.startReplaceableGroup(-1776134358);
        e1.v vVar3 = (i11 & 2) != 0 ? e1.t.f53496b : vVar;
        boolean z11 = (i11 & 4) != 0 ? true : z10;
        if ((i11 & 8) != 0) {
            wVar.startReplaceableGroup(-492369756);
            Object objRememberedValue = wVar.rememberedValue();
            if (objRememberedValue == p0.v.f80515a.getEmpty()) {
                objRememberedValue = f0.p.MutableInteractionSource();
                wVar.updateRememberedValue(objRememberedValue);
            }
            wVar.endReplaceableGroup();
            qVar2 = (f0.q) objRememberedValue;
        } else {
            qVar2 = qVar;
        }
        Button(onClick, vVar3, z11, qVar2, (i11 & 16) != 0 ? null : cVar, (i11 & 32) != 0 ? i0.f75090a.getShapes(wVar, 6).getSmall() : f2Var, (i11 & 64) != 0 ? b.f74975a.getOutlinedBorder(wVar, 6) : vVar2, (i11 & 128) != 0 ? b.f74975a.m5651outlinedButtonColorsRGew2ao(0L, 0L, 0L, wVar, 3072, 7) : aVar, (i11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? b.f74975a.getContentPadding() : i2Var, content, wVar, i10 & 2147483646, 0);
        wVar.endReplaceableGroup();
    }

    public static final void TextButton(kv.a onClick, e1.v vVar, boolean z10, f0.q qVar, c cVar, f2 f2Var, d0.v vVar2, a aVar, i2 i2Var, kv.q content, p0.w wVar, int i10, int i11) {
        f0.q qVar2;
        kotlin.jvm.internal.e0.checkNotNullParameter(onClick, "onClick");
        kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
        wVar.startReplaceableGroup(288797557);
        e1.v vVar3 = (i11 & 2) != 0 ? e1.t.f53496b : vVar;
        boolean z11 = (i11 & 4) != 0 ? true : z10;
        if ((i11 & 8) != 0) {
            wVar.startReplaceableGroup(-492369756);
            Object objRememberedValue = wVar.rememberedValue();
            if (objRememberedValue == p0.v.f80515a.getEmpty()) {
                objRememberedValue = f0.p.MutableInteractionSource();
                wVar.updateRememberedValue(objRememberedValue);
            }
            wVar.endReplaceableGroup();
            qVar2 = (f0.q) objRememberedValue;
        } else {
            qVar2 = qVar;
        }
        Button(onClick, vVar3, z11, qVar2, (i11 & 16) != 0 ? null : cVar, (i11 & 32) != 0 ? i0.f75090a.getShapes(wVar, 6).getSmall() : f2Var, (i11 & 64) != 0 ? null : vVar2, (i11 & 128) != 0 ? b.f74975a.m5652textButtonColorsRGew2ao(0L, 0L, 0L, wVar, 3072, 7) : aVar, (i11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? b.f74975a.getTextButtonContentPadding() : i2Var, content, wVar, i10 & 2147483646, 0);
        wVar.endReplaceableGroup();
    }
}
