package j$.time.chrono;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class a implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f68467a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f68468b = new ConcurrentHashMap();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return k().compareTo(((m) obj).k());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    public static m r(m mVar, String str) {
        String strO;
        m mVar2 = (m) f68467a.putIfAbsent(str, mVar);
        if (mVar2 == null && (strO = mVar.o()) != null) {
            f68468b.putIfAbsent(strO, mVar);
        }
        return mVar2;
    }

    @Override // j$.time.chrono.m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && k().compareTo(((a) obj).k()) == 0;
    }

    @Override // j$.time.chrono.m
    public final int hashCode() {
        return getClass().hashCode() ^ k().hashCode();
    }

    @Override // j$.time.chrono.m
    public final String toString() {
        return k();
    }
}
