package j$.time;

import io.ktor.util.date.GMTDateParser;
import j$.time.temporal.ChronoUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class r implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final r f68626d = new r(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* renamed from: a, reason: collision with root package name */
    public final int f68627a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68628b;

    /* renamed from: c, reason: collision with root package name */
    public final int f68629c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        Object[] objArr = {ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS};
        ArrayList arrayList = new ArrayList(3);
        for (int i10 = 0; i10 < 3; i10++) {
            Object obj = objArr[i10];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        Collections.unmodifiableList(arrayList);
    }

    public r(int i10, int i11, int i12) {
        this.f68627a = i10;
        this.f68628b = i11;
        this.f68629c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f68627a == rVar.f68627a && this.f68628b == rVar.f68628b && this.f68629c == rVar.f68629c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f68629c, 16) + Integer.rotateLeft(this.f68628b, 8) + this.f68627a;
    }

    public final String toString() {
        if (this == f68626d) {
            return "P0D";
        }
        StringBuilder sb2 = new StringBuilder("P");
        int i10 = this.f68627a;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append(GMTDateParser.YEAR);
        }
        int i11 = this.f68628b;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append(GMTDateParser.MONTH);
        }
        int i12 = this.f68629c;
        if (i12 != 0) {
            sb2.append(i12);
            sb2.append('D');
        }
        return sb2.toString();
    }

    private Object writeReplace() {
        return new s((byte) 14, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
