package d1;

import p0.e0;
import p0.k0;
import p0.n3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class m {
    public static final l observe(n3 n3Var, n nVar) {
        return n3Var.addCompositionRegistrationObserver$runtime(nVar);
    }

    public static final l setObserver(e0 e0Var, k kVar) {
        s sVar = (s) k0.getCompositionService(e0Var, k0.getObservableCompositionServiceKey());
        if (sVar != null) {
            return sVar.setObserver(kVar);
        }
        return null;
    }
}
