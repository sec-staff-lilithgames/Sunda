package nd;

import android.content.Context;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d extends j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f75983a;

    /* renamed from: b, reason: collision with root package name */
    public final xd.a f75984b;

    /* renamed from: c, reason: collision with root package name */
    public final xd.a f75985c;

    /* renamed from: d, reason: collision with root package name */
    public final String f75986d;

    public d(Context context, xd.a aVar, xd.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f75983a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f75984b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f75985c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f75986d = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f75983a.equals(jVar.getApplicationContext()) && this.f75984b.equals(jVar.getWallClock()) && this.f75985c.equals(jVar.getMonotonicClock()) && this.f75986d.equals(jVar.getBackendName())) {
                return true;
            }
        }
        return false;
    }

    @Override // nd.j
    public Context getApplicationContext() {
        return this.f75983a;
    }

    @Override // nd.j
    public String getBackendName() {
        return this.f75986d;
    }

    @Override // nd.j
    public xd.a getMonotonicClock() {
        return this.f75985c;
    }

    @Override // nd.j
    public xd.a getWallClock() {
        return this.f75984b;
    }

    public int hashCode() {
        return ((((((this.f75983a.hashCode() ^ 1000003) * 1000003) ^ this.f75984b.hashCode()) * 1000003) ^ this.f75985c.hashCode()) * 1000003) ^ this.f75986d.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f75983a);
        sb2.append(", wallClock=");
        sb2.append(this.f75984b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f75985c);
        sb2.append(", backendName=");
        return o2.o(sb2, this.f75986d, "}");
    }
}
