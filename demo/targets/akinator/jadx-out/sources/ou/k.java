package ou;

import com.ironsource.C3191e4;
import java.util.concurrent.TimeUnit;
import ut.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f79853a;

    /* renamed from: b, reason: collision with root package name */
    public final long f79854b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f79855c;

    public k(Object obj, long j10, TimeUnit timeUnit) {
        this.f79853a = obj;
        this.f79854b = j10;
        this.f79855c = (TimeUnit) o0.requireNonNull(timeUnit, "unit is null");
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (o0.equals(this.f79853a, kVar.f79853a) && this.f79854b == kVar.f79854b && o0.equals(this.f79855c, kVar.f79855c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f79853a;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        long j10 = this.f79854b;
        return this.f79855c.hashCode() + (((iHashCode * 31) + ((int) (j10 ^ (j10 >>> 31)))) * 31);
    }

    public long time() {
        return this.f79854b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Timed[time=");
        sb2.append(this.f79854b);
        sb2.append(", unit=");
        sb2.append(this.f79855c);
        sb2.append(", value=");
        return w0.i.e(sb2, this.f79853a, C3191e4.i.f36531e);
    }

    public TimeUnit unit() {
        return this.f79855c;
    }

    public Object value() {
        return this.f79853a;
    }

    public long time(TimeUnit timeUnit) {
        return timeUnit.convert(this.f79854b, this.f79855c);
    }
}
