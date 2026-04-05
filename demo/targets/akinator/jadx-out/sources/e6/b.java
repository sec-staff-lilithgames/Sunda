package e6;

import android.graphics.PointF;
import android.util.Property;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b extends Property {
    @Override // android.util.Property
    public PointF get(j jVar) {
        return null;
    }

    @Override // android.util.Property
    public void set(j jVar, PointF pointF) {
        jVar.getClass();
        jVar.f53822a = Math.round(pointF.x);
        int iRound = Math.round(pointF.y);
        jVar.f53823b = iRound;
        int i10 = jVar.f53827f + 1;
        jVar.f53827f = i10;
        if (i10 == jVar.f53828g) {
            b1.a(jVar.f53826e, jVar.f53822a, iRound, jVar.f53824c, jVar.f53825d);
            jVar.f53827f = 0;
            jVar.f53828g = 0;
        }
    }
}
