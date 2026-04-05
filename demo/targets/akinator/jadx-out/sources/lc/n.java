package lc;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class n {
    public static n getEmpty() {
        return m.getEmpty();
    }

    public abstract Object getAttribute(Object obj);

    public abstract n withPerCallAttribute(Object obj, Object obj2);

    public abstract n withSharedAttribute(Object obj, Object obj2);

    public abstract n withSharedAttributes(Map<?, ?> map);

    public abstract n withoutSharedAttribute(Object obj);
}
