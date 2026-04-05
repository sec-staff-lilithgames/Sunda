package j$.time.chrono;

import j$.time.LocalDateTime;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class t extends a implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final t f68512c = new t();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // j$.time.chrono.m
    public final n u(int i10) {
        if (i10 == 0) {
            return u.BCE;
        }
        if (i10 == 1) {
            return u.CE;
        }
        throw new j$.time.c("Invalid era: " + i10);
    }

    @Override // j$.time.chrono.m
    public final String k() {
        return "ISO";
    }

    @Override // j$.time.chrono.m
    public final String o() {
        return "iso8601";
    }

    @Override // j$.time.chrono.m
    public final b q(int i10) {
        return j$.time.h.M(i10, 1, 1);
    }

    @Override // j$.time.chrono.m
    public final b x(j$.time.temporal.m mVar) {
        return j$.time.h.D(mVar);
    }

    private t() {
    }

    @Override // j$.time.chrono.m
    public final e y(LocalDateTime localDateTime) {
        return LocalDateTime.t(localDateTime);
    }

    @Override // j$.time.chrono.m
    public final boolean H(long j10) {
        if ((3 & j10) == 0) {
            return j10 % 100 != 0 || j10 % 400 == 0;
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new f0((byte) 1, this);
    }
}
