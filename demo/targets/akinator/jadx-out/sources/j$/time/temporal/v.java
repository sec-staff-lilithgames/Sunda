package j$.time.temporal;

import com.ironsource.C3191e4;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public final class v implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final ConcurrentMap f68676g = new ConcurrentHashMap(4, 0.75f, 2);

    /* renamed from: h, reason: collision with root package name */
    public static final h f68677h;
    private static final long serialVersionUID = -1177360819670808121L;

    /* renamed from: a, reason: collision with root package name */
    public final j$.time.e f68678a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68679b;

    /* renamed from: c, reason: collision with root package name */
    public final transient u f68680c;

    /* renamed from: d, reason: collision with root package name */
    public final transient u f68681d;

    /* renamed from: e, reason: collision with root package name */
    public final transient u f68682e;

    /* renamed from: f, reason: collision with root package name */
    public final transient u f68683f;

    static {
        new v(j$.time.e.MONDAY, 4);
        a(j$.time.e.SUNDAY, 1);
        f68677h = i.f68648d;
    }

    public static v a(j$.time.e eVar, int i10) {
        String str = eVar.toString() + i10;
        ConcurrentMap concurrentMap = f68676g;
        v vVar = (v) concurrentMap.get(str);
        if (vVar != null) {
            return vVar;
        }
        concurrentMap.putIfAbsent(str, new v(eVar, i10));
        return (v) concurrentMap.get(str);
    }

    public v(j$.time.e eVar, int i10) {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.WEEKS;
        this.f68680c = new u("DayOfWeek", this, chronoUnit, chronoUnit2, u.f68667f);
        this.f68681d = new u("WeekOfMonth", this, chronoUnit2, ChronoUnit.MONTHS, u.f68668g);
        h hVar = i.f68648d;
        this.f68682e = new u("WeekOfWeekBasedYear", this, chronoUnit2, hVar, u.f68670i);
        this.f68683f = new u("WeekBasedYear", this, hVar, ChronoUnit.FOREVER, a.YEAR.f68639b);
        Objects.requireNonNull(eVar, "firstDayOfWeek");
        if (i10 < 1 || i10 > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.f68678a = eVar;
        this.f68679b = i10;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.f68678a == null) {
            throw new InvalidObjectException("firstDayOfWeek is null");
        }
        int i10 = this.f68679b;
        if (i10 < 1 || i10 > 7) {
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return a(this.f68678a, this.f68679b);
        } catch (IllegalArgumentException e10) {
            throw new InvalidObjectException("Invalid serialized WeekFields: " + e10.getMessage());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && hashCode() == obj.hashCode();
    }

    public final int hashCode() {
        return (this.f68678a.ordinal() * 7) + this.f68679b;
    }

    public final String toString() {
        return "WeekFields[" + this.f68678a + "," + this.f68679b + C3191e4.i.f36531e;
    }
}
