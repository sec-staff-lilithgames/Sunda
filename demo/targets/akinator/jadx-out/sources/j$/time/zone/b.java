package j$.time.zone;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class b implements Comparable, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f68700e = 0;
    private static final long serialVersionUID = -6946044323557704546L;

    /* renamed from: a, reason: collision with root package name */
    public final long f68701a;

    /* renamed from: b, reason: collision with root package name */
    public final LocalDateTime f68702b;

    /* renamed from: c, reason: collision with root package name */
    public final ZoneOffset f68703c;

    /* renamed from: d, reason: collision with root package name */
    public final ZoneOffset f68704d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f68701a, ((b) obj).f68701a);
    }

    public b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f68701a = localDateTime.p(zoneOffset);
        this.f68702b = localDateTime;
        this.f68703c = zoneOffset;
        this.f68704d = zoneOffset2;
    }

    public b(long j10, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f68701a = j10;
        this.f68702b = LocalDateTime.I(j10, 0, zoneOffset);
        this.f68703c = zoneOffset;
        this.f68704d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    public final boolean r() {
        return this.f68704d.f68463b > this.f68703c.f68463b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f68701a == bVar.f68701a && this.f68703c.equals(bVar.f68703c) && this.f68704d.equals(bVar.f68704d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f68702b.hashCode() ^ this.f68703c.f68463b) ^ Integer.rotateLeft(this.f68704d.f68463b, 16);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Transition[");
        sb2.append(r() ? "Gap" : "Overlap");
        sb2.append(" at ");
        sb2.append(this.f68702b);
        sb2.append(this.f68703c);
        sb2.append(" to ");
        sb2.append(this.f68704d);
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }
}
