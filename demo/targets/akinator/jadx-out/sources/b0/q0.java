package b0;

import p0.o4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class q0 {
    public static final <T> void Crossfade(T t10, e1.v vVar, c0.j0 j0Var, kv.q content, p0.w wVar, int i10, int i11) {
        int i12;
        kv.q qVar;
        e1.v vVar2;
        c0.j0 j0Var2;
        kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(523603005);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (wVarStartRestartGroup.changed(t10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= wVarStartRestartGroup.changed(vVar) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= wVarStartRestartGroup.changed(content) ? 2048 : 1024;
        }
        if (i14 == 4 && (i12 & 5851) == 1170 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
            qVar = content;
            j0Var2 = j0Var;
            vVar2 = vVar;
        } else {
            if (i13 != 0) {
                vVar = e1.t.f53496b;
            }
            e1.v vVar3 = vVar;
            if (i14 != 0) {
                j0Var = c0.o.tween$default(0, 0, null, 7, null);
            }
            c0.j0 j0Var3 = j0Var;
            Crossfade(c0.g2.updateTransition(t10, (String) null, wVarStartRestartGroup, i12 & 14, 2), vVar3, j0Var3, null, content, wVarStartRestartGroup, (i12 & 112) | 512 | ((i12 << 3) & 57344), 4);
            qVar = content;
            vVar2 = vVar3;
            j0Var2 = j0Var3;
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup == null) {
            return;
        }
        o4VarEndRestartGroup.updateScope(new j0(t10, vVar2, j0Var2, qVar, i10, i11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x027e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void Crossfade(c0.z1 r16, e1.v r17, c0.j0 r18, kv.l r19, kv.q r20, p0.w r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.q0.Crossfade(c0.z1, e1.v, c0.j0, kv.l, kv.q, p0.w, int, int):void");
    }
}
