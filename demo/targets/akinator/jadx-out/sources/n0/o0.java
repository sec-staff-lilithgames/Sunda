package n0;

import p0.o4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class o0 {
    public static final void PlatformMaterialTheme(kv.p content, p0.w wVar, int i10) {
        int i11;
        kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(-1322912246);
        if ((i10 & 14) == 0) {
            i11 = (wVarStartRestartGroup.changed(content) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
        } else {
            content.invoke(wVarStartRestartGroup, Integer.valueOf(i11 & 14));
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup == null) {
            return;
        }
        o4VarEndRestartGroup.updateScope(new n0(i10, content));
    }
}
