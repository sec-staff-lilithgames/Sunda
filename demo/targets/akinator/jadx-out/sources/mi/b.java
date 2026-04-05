package mi;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class b {
    public a buildHttpGetRequest(String str) {
        return buildHttpGetRequest(str, Collections.EMPTY_MAP);
    }

    public a buildHttpGetRequest(String str, Map<String, String> map) {
        return new a(str, map);
    }
}
