package n0;

import g2.c2;
import p0.g3;
import p0.h3;
import p0.o4;
import p0.z4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static final g3 f75153a = p0.o0.compositionLocalOf(z4.structuralEqualityPolicy(), h1.f75076e);

    public static final void ProvideTextStyle(c2 value, kv.p content, p0.w wVar, int i10) {
        int i11;
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(1772272796);
        if ((i10 & 14) == 0) {
            i11 = (wVarStartRestartGroup.changed(value) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= wVarStartRestartGroup.changed(content) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
        } else {
            g3 g3Var = f75153a;
            p0.o0.CompositionLocalProvider(new h3[]{g3Var.provides(((c2) wVarStartRestartGroup.consume(g3Var)).merge(value))}, content, wVarStartRestartGroup, (i11 & 112) | 8);
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup == null) {
            return;
        }
        o4VarEndRestartGroup.updateScope(new i1(value, content, i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0406 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0139  */
    /* renamed from: Text--4IGK_g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5700Text4IGK_g(g2.b r61, e1.v r62, long r63, long r65, l2.y0 r67, l2.c1 r68, l2.x r69, long r70, r2.n r72, r2.m r73, long r74, int r76, boolean r77, int r78, java.util.Map<java.lang.String, l0.s> r79, kv.l r80, g2.c2 r81, p0.w r82, int r83, int r84, int r85) {
        /*
            Method dump skipped, instructions count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.n1.m5700Text4IGK_g(g2.b, e1.v, long, long, l2.y0, l2.c1, l2.x, long, r2.n, r2.m, long, int, boolean, int, java.util.Map, kv.l, g2.c2, p0.w, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0139  */
    /* renamed from: Text-fLXpl1I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5701TextfLXpl1I(java.lang.String r59, e1.v r60, long r61, long r63, l2.y0 r65, l2.c1 r66, l2.x r67, long r68, r2.n r70, r2.m r71, long r72, int r74, boolean r75, int r76, kv.l r77, g2.c2 r78, p0.w r79, int r80, int r81, int r82) {
        /*
            Method dump skipped, instructions count: 1013
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.n1.m5701TextfLXpl1I(java.lang.String, e1.v, long, long, l2.y0, l2.c1, l2.x, long, r2.n, r2.m, long, int, boolean, int, kv.l, g2.c2, p0.w, int, int, int):void");
    }

    public static final g3 getLocalTextStyle() {
        return f75153a;
    }
}
