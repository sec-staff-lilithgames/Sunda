package io.ktor.websocket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import sv.n0;
import uu.q0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class WebSocketExtensionHeaderKt {
    public static final List<WebSocketExtensionHeader> parseWebSocketExtensions(String value) {
        e0.checkNotNullParameter(value, "value");
        List listSplit$default = n0.split$default((CharSequence) value, new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            List listSplit$default2 = n0.split$default((CharSequence) it.next(), new String[]{";"}, false, 0, 6, (Object) null);
            String string = n0.trim((String) y0.first(listSplit$default2)).toString();
            List listDrop = y0.drop(listSplit$default2, 1);
            ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(listDrop, 10));
            Iterator it2 = listDrop.iterator();
            while (it2.hasNext()) {
                arrayList2.add(n0.trim((String) it2.next()).toString());
            }
            arrayList.add(new WebSocketExtensionHeader(string, arrayList2));
        }
        return arrayList;
    }
}
