package w2;

import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class o {
    public static <T> n1 getFuture(l lVar) {
        j jVar = new j();
        jVar.f90355c = s.create();
        n nVar = new n(jVar);
        jVar.f90354b = nVar;
        jVar.f90353a = lVar.getClass();
        try {
            Object objAttachCompleter = lVar.attachCompleter(jVar);
            if (objAttachCompleter == null) {
                return nVar;
            }
            jVar.f90353a = objAttachCompleter;
            return nVar;
        } catch (Exception e10) {
            nVar.f90359c.setException(e10);
            return nVar;
        }
    }
}
