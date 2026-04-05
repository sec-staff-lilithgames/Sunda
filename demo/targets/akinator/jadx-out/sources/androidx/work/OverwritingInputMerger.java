package androidx.work;

import androidx.work.b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.e0;
import n6.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class OverwritingInputMerger extends q {
    @Override // n6.q
    public b merge(List<b> inputs) {
        e0.checkNotNullParameter(inputs, "inputs");
        b.a aVar = new b.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<b> it = inputs.iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll(it.next().getKeyValueMap());
        }
        aVar.putAll(linkedHashMap);
        return aVar.build();
    }
}
