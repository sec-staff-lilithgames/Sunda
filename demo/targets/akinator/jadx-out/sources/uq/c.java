package uq;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import tq.f;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final b f88657a;

    public c(b stateGroupController) {
        e0.checkNotNullParameter(stateGroupController, "stateGroupController");
        this.f88657a = stateGroupController;
    }

    @Override // tq.f
    public boolean a(List<? extends Object> params) {
        e0.checkNotNullParameter(params, "params");
        if (params.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(params, 10));
        Iterator<T> it = params.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toString());
        }
        return !this.f88657a.a(arrayList);
    }
}
