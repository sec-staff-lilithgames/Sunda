package uu;

import com.ironsource.G5;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h {
    public h(kotlin.jvm.internal.u uVar) {
    }

    public final boolean entryEquals$kotlin_stdlib(Map.Entry<?, ?> e10, Object obj) {
        kotlin.jvm.internal.e0.checkNotNullParameter(e10, "e");
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return kotlin.jvm.internal.e0.areEqual(e10.getKey(), entry.getKey()) && kotlin.jvm.internal.e0.areEqual(e10.getValue(), entry.getValue());
    }

    public final int entryHashCode$kotlin_stdlib(Map.Entry<?, ?> e10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(e10, "e");
        Object key = e10.getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = e10.getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    public final String entryToString$kotlin_stdlib(Map.Entry<?, ?> e10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(e10, "e");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e10.getKey());
        sb2.append(G5.T);
        sb2.append(e10.getValue());
        return sb2.toString();
    }
}
