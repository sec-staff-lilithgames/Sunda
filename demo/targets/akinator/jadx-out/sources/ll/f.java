package ll;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f73390a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public String f73391b = null;

    public void addToSignalsMap(String str, String str2) {
        this.f73390a.put(str, str2);
    }

    public String getErrorMessage() {
        return this.f73391b;
    }

    public Map<String, String> getSignalsMap() {
        return this.f73390a;
    }

    public void setErrorMessage(String str) {
        this.f73391b = str;
    }
}
