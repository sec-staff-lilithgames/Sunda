package k6;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public final int f70632a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f70633b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f70634a;

        /* renamed from: b, reason: collision with root package name */
        public Map f70635b = new HashMap();

        public a(int i10) {
            this.f70634a = i10;
        }

        public a addOverrideRule(String str, int i10) {
            this.f70635b.put(str, Integer.valueOf(i10));
            return this;
        }

        public x build() {
            return new x(this);
        }

        public a setOverrideRules(Map<String, Integer> map) {
            this.f70635b = map;
            return this;
        }
    }

    public x(a aVar) {
        this.f70632a = aVar.f70634a;
        this.f70633b = aVar.f70635b;
    }

    public int getDefaultStatus() {
        return this.f70632a;
    }

    public Map<String, Integer> getOverrideRules() {
        return this.f70633b;
    }
}
