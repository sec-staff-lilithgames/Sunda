package zl;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f98273a;

    /* renamed from: b, reason: collision with root package name */
    public final float f98274b;

    /* renamed from: c, reason: collision with root package name */
    public final float f98275c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f98276d;

    public s(String str, float f10, float f11, Map<String, String> map) {
        this.f98273a = str;
        this.f98274b = f10;
        this.f98275c = f11;
        this.f98276d = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            s sVar = (s) obj;
            if (this.f98273a.equals(sVar.f98273a) && Float.compare(sVar.f98274b, this.f98274b) == 0 && Float.compare(sVar.f98275c, this.f98275c) == 0) {
                return true;
            }
        }
        return false;
    }

    public String getAdUnitId() {
        return this.f98273a;
    }

    public Map<String, String> getCustomTargeting() {
        return this.f98276d;
    }

    public float getPrice() {
        return this.f98275c;
    }

    public float getScore() {
        return this.f98274b;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f98275c) + ((Float.floatToIntBits(this.f98274b) + (this.f98273a.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "adUnitId - " + this.f98273a + ", score - " + this.f98274b + ", price - " + this.f98275c;
    }
}
