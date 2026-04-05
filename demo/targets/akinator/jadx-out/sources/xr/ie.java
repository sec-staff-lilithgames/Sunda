package xr;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class ie {

    /* renamed from: a, reason: collision with root package name */
    public final String f92662a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f92663b;

    public ie(String str, Map<String, ?> map) {
        this.f92662a = (String) mh.p1.checkNotNull(str, "policyName");
        this.f92663b = (Map) mh.p1.checkNotNull(map, "rawConfigValue");
    }

    public boolean equals(Object obj) {
        if (obj instanceof ie) {
            ie ieVar = (ie) obj;
            if (this.f92662a.equals(ieVar.f92662a) && this.f92663b.equals(ieVar.f92663b)) {
                return true;
            }
        }
        return false;
    }

    public String getPolicyName() {
        return this.f92662a;
    }

    public Map<String, ?> getRawConfigValue() {
        return this.f92663b;
    }

    public int hashCode() {
        return mh.h1.hashCode(this.f92662a, this.f92663b);
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("policyName", this.f92662a).add("rawConfigValue", this.f92663b).toString();
    }
}
