package ud;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    public final xd.a f88407a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f88408b;

    public a(xd.a aVar, HashMap map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f88407a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f88408b = map;
    }

    @Override // ud.e
    public final xd.a a() {
        return this.f88407a;
    }

    @Override // ud.e
    public final Map b() {
        return this.f88408b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f88407a.equals(eVar.a()) && this.f88408b.equals(eVar.b());
    }

    public int hashCode() {
        return ((this.f88407a.hashCode() ^ 1000003) * 1000003) ^ this.f88408b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f88407a + ", values=" + this.f88408b + "}";
    }
}
