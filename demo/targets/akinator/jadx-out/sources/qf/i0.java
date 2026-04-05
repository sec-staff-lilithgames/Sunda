package qf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f82947a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public Map f82948b;

    public synchronized void clear() {
        this.f82948b = null;
        this.f82947a.clear();
    }

    public synchronized void clearAndSet(Map<String, String> map) {
        this.f82948b = null;
        this.f82947a.clear();
        this.f82947a.putAll(map);
    }

    public synchronized Map<String, String> getSnapshot() {
        try {
            if (this.f82948b == null) {
                this.f82948b = Collections.unmodifiableMap(new HashMap(this.f82947a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f82948b;
    }

    public synchronized void remove(String str) {
        this.f82948b = null;
        this.f82947a.remove(str);
    }

    public synchronized void set(String str, String str2) {
        this.f82948b = null;
        this.f82947a.put(str, str2);
    }

    public synchronized void set(Map<String, String> map) {
        this.f82948b = null;
        this.f82947a.putAll(map);
    }
}
