package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.c3;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import p0.j2;
import p0.o4;
import p0.o5;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class i0 {
    public static final x0 a(e1.v vVar, a.c.EnumC0490a enumC0490a, kv.l lVar, kv.q qVar, int i10, int i11, p0.w wVar, int i12) {
        a(vVar, enumC0490a, lVar, qVar, wVar, i10 | 1, i11);
        return x0.f87415a;
    }

    public static final void a(e1.v vVar, a.c.EnumC0490a buttonType, kv.l onButtonRendered, kv.q content, p0.w wVar, int i10, int i11) {
        int i12;
        kotlin.jvm.internal.e0.checkNotNullParameter(buttonType, "buttonType");
        kotlin.jvm.internal.e0.checkNotNullParameter(onButtonRendered, "onButtonRendered");
        kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(-1040306081);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (wVarStartRestartGroup.changed(vVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= wVarStartRestartGroup.changed(buttonType) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= wVarStartRestartGroup.changed(onButtonRendered) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= wVarStartRestartGroup.changed(content) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                vVar = e1.t.f53496b;
            }
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(-1040306081, i12, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.TrackableButton (TrackableButton.kt:22)");
            }
            wVarStartRestartGroup.startReplaceableGroup(-334659178);
            Object objRememberedValue = wVarStartRestartGroup.rememberedValue();
            p0.v vVar2 = p0.v.f80515a;
            if (objRememberedValue == vVar2.getEmpty()) {
                objRememberedValue = o5.mutableStateOf$default(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.b.a(buttonType), null, 2, null);
                wVarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            j2 j2Var = (j2) objRememberedValue;
            wVarStartRestartGroup.endReplaceableGroup();
            a.c cVarA = a(j2Var);
            wVarStartRestartGroup.startReplaceableGroup(-334654626);
            boolean zChanged = wVarStartRestartGroup.changed(j2Var) | wVarStartRestartGroup.changed(onButtonRendered);
            Object objRememberedValue2 = wVarStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == vVar2.getEmpty()) {
                objRememberedValue2 = new c3(onButtonRendered, j2Var);
                wVarStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            wVarStartRestartGroup.endReplaceableGroup();
            content.invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.modifiers.a.a(vVar, cVarA, (kv.l) objRememberedValue2), wVarStartRestartGroup, Integer.valueOf((i12 >> 6) & 112));
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }
        e1.v vVar3 = vVar;
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new c(vVar3, buttonType, onButtonRendered, content, i10, i11));
        }
    }

    public static final x0 a(kv.l lVar, j2 j2Var, a.c it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        a(j2Var, it);
        lVar.invoke(it);
        return x0.f87415a;
    }

    public static final a.c a(j2 j2Var) {
        return (a.c) j2Var.getValue();
    }

    public static final void a(j2 j2Var, a.c cVar) {
        j2Var.setValue(cVar);
    }
}
