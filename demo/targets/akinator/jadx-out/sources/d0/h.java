package d0;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final c f51382a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final e1.v f51383b;

    static {
        int i10 = Build.VERSION.SDK_INT;
        e1.v vVarLayout = e1.t.f53496b;
        if (i10 >= 31) {
            vVarLayout = x1.q0.layout(x1.q0.layout(vVarLayout, e.f51357e), g.f51371e);
        }
        f51383b = vVarLayout;
    }

    public static final u3 rememberOverscrollEffect(p0.w wVar, int i10) {
        wVar.startReplaceableGroup(-81138291);
        Context context = (Context) wVar.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        r3 r3Var = (r3) wVar.consume(t3.getLocalOverscrollConfiguration());
        wVar.startReplaceableGroup(511388516);
        boolean zChanged = wVar.changed(context) | wVar.changed(r3Var);
        Object objRememberedValue = wVar.rememberedValue();
        if (zChanged || objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = r3Var != null ? new b(context, r3Var) : f51382a;
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        u3 u3Var = (u3) objRememberedValue;
        wVar.endReplaceableGroup();
        return u3Var;
    }
}
