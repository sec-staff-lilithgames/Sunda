package f1;

import i2.hQ.aTNDubNmpwAqdU;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f55293a = new LinkedHashMap();

    public final Map<Integer, h> getChildren() {
        return this.f55293a;
    }

    public final void plusAssign(h autofillNode) {
        e0.checkNotNullParameter(autofillNode, "autofillNode");
        this.f55293a.put(Integer.valueOf(autofillNode.getId()), autofillNode);
    }

    public final x0 performAutofill(int i10, String str) {
        l onFill;
        e0.checkNotNullParameter(str, aTNDubNmpwAqdU.kMhhJOyyRdAyUWq);
        h hVar = (h) this.f55293a.get(Integer.valueOf(i10));
        if (hVar == null || (onFill = hVar.getOnFill()) == null) {
            return null;
        }
        onFill.invoke(str);
        return x0.f87415a;
    }
}
