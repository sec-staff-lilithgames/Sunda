package j$.time;

import com.ironsource.C3191e4;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class a extends b implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f68465b;
    private static final long serialVersionUID = 6740630888130243051L;

    /* renamed from: a, reason: collision with root package name */
    public final ZoneId f68466a;

    public a(ZoneOffset zoneOffset) {
        this.f68466a = zoneOffset;
    }

    static {
        System.currentTimeMillis();
        f68465b = new a(ZoneOffset.UTC);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f68466a.equals(((a) obj).f68466a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f68466a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f68466a + C3191e4.i.f36531e;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }
}
