package ln;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f73536a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public Map f73537b;

    public synchronized void clear() {
        this.f73537b = null;
        this.f73536a.clear();
    }

    public synchronized void clearAndSet(Map<String, String> map) {
        this.f73537b = null;
        this.f73536a.clear();
        this.f73536a.putAll(map);
    }

    public synchronized Map<String, String> getSnapshot() {
        try {
            if (this.f73537b == null) {
                this.f73537b = Collections.unmodifiableMap(new HashMap(this.f73536a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f73537b;
    }

    public synchronized void remove(String str) {
        this.f73537b = null;
        this.f73536a.remove(str);
    }

    public synchronized void set(String str, String str2) {
        this.f73537b = null;
        this.f73536a.put(str, str2);
    }

    public synchronized void set(Map<String, String> map) {
        this.f73537b = null;
        this.f73536a.putAll(map);
    }
}
