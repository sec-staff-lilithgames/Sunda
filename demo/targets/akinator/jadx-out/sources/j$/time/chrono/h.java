package j$.time.chrono;

import io.ktor.util.date.GMTDateParser;
import j$.time.temporal.ChronoUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class h implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f68481e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* renamed from: a, reason: collision with root package name */
    public final m f68482a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68483b;

    /* renamed from: c, reason: collision with root package name */
    public final int f68484c;

    /* renamed from: d, reason: collision with root package name */
    public final int f68485d;

    static {
        Object[] objArr = {ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS};
        ArrayList arrayList = new ArrayList(3);
        for (int i10 = 0; i10 < 3; i10++) {
            Object obj = objArr[i10];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        Collections.unmodifiableList(arrayList);
    }

    public h(m mVar, int i10, int i11, int i12) {
        this.f68482a = mVar;
        this.f68483b = i10;
        this.f68484c = i11;
        this.f68485d = i12;
    }

    public final String toString() {
        if (this.f68483b == 0 && this.f68484c == 0 && this.f68485d == 0) {
            return this.f68482a.toString() + " P0D";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f68482a.toString());
        sb2.append(" P");
        int i10 = this.f68483b;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append(GMTDateParser.YEAR);
        }
        int i11 = this.f68484c;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append(GMTDateParser.MONTH);
        }
        int i12 = this.f68485d;
        if (i12 != 0) {
            sb2.append(i12);
            sb2.append('D');
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f68483b == hVar.f68483b && this.f68484c == hVar.f68484c && this.f68485d == hVar.f68485d && this.f68482a.equals(hVar.f68482a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Integer.rotateLeft(this.f68485d, 16) + (Integer.rotateLeft(this.f68484c, 8) + this.f68483b)) ^ this.f68482a.hashCode();
    }

    public Object writeReplace() {
        return new f0((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
