package gr;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f58407a;

    /* renamed from: b, reason: collision with root package name */
    public long f58408b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f58409c;

    public i() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f58407a = jCurrentTimeMillis;
        this.f58408b = jCurrentTimeMillis;
    }

    public Map<String, Object> getEventParameters() {
        return this.f58409c;
    }

    public long getFinishTimeMs() {
        return this.f58408b;
    }

    public long getStartTimeMs() {
        return this.f58407a;
    }

    public void setFinishTimeMs(long j10) {
        this.f58408b = Math.max(j10, this.f58407a);
    }

    public i withParameter(String str, Object obj) {
        if (this.f58409c == null) {
            this.f58409c = new HashMap();
        }
        this.f58409c.put(str, obj);
        return this;
    }
}
