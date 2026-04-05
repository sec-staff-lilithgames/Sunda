package d0;

import androidx.core.app.NotificationCompat;
import p0.o4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a0 {
    public static final void Canvas(e1.v modifier, kv.l onDraw, p0.w wVar, int i10) {
        int i11;
        kotlin.jvm.internal.e0.checkNotNullParameter(modifier, "modifier");
        kotlin.jvm.internal.e0.checkNotNullParameter(onDraw, "onDraw");
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(-932836462);
        if ((i10 & 14) == 0) {
            i11 = (wVarStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= wVarStartRestartGroup.changed(onDraw) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
        } else {
            g0.l3.Spacer(g1.j.drawBehind(modifier, onDraw), wVarStartRestartGroup, 0);
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup == null) {
            return;
        }
        o4VarEndRestartGroup.updateScope(new x(modifier, onDraw, i10));
    }

    public static final void Canvas(e1.v modifier, String contentDescription, kv.l onDraw, p0.w wVar, int i10) {
        int i11;
        kotlin.jvm.internal.e0.checkNotNullParameter(modifier, "modifier");
        kotlin.jvm.internal.e0.checkNotNullParameter(contentDescription, "contentDescription");
        kotlin.jvm.internal.e0.checkNotNullParameter(onDraw, "onDraw");
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(-1162737955);
        if ((i10 & 14) == 0) {
            i11 = (wVarStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= wVarStartRestartGroup.changed(contentDescription) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= wVarStartRestartGroup.changed(onDraw) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i11 & 731) == 146 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
        } else {
            e1.v vVarDrawBehind = g1.j.drawBehind(modifier, onDraw);
            wVarStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = wVarStartRestartGroup.changed(contentDescription);
            Object objRememberedValue = wVarStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == p0.v.f80515a.getEmpty()) {
                objRememberedValue = new y(contentDescription);
                wVarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            wVarStartRestartGroup.endReplaceableGroup();
            g0.l3.Spacer(e2.v.semantics$default(vVarDrawBehind, false, (kv.l) objRememberedValue, 1, null), wVarStartRestartGroup, 0);
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup == null) {
            return;
        }
        o4VarEndRestartGroup.updateScope(new z(modifier, contentDescription, onDraw, i10));
    }
}
