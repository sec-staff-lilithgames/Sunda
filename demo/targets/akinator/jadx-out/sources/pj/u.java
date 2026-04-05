package pj;

import android.app.Application;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class u {
    public rt.a providesAppForegroundEventStream(Application application) {
        nj.s sVar = new nj.s();
        rt.a aVarForegroundFlowable = sVar.foregroundFlowable();
        aVarForegroundFlowable.connect();
        application.registerActivityLifecycleCallbacks(sVar);
        return aVarForegroundFlowable;
    }
}
