package u3;

import java.util.ArrayList;
import z.t1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k implements w3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f87808a;

    public k(String str) {
        this.f87808a = str;
    }

    @Override // w3.b
    public void accept(l lVar) {
        synchronized (m.f87813c) {
            try {
                t1 t1Var = m.f87814d;
                ArrayList arrayList = (ArrayList) t1Var.get(this.f87808a);
                if (arrayList == null) {
                    return;
                }
                t1Var.remove(this.f87808a);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((w3.b) arrayList.get(i10)).accept(lVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
