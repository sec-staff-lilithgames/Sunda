package j$.util;

import j$.time.Instant;
import java.util.Date;

/* loaded from: classes3.dex */
public final /* synthetic */ class DesugarDate {
    public static Date from(Instant instant) {
        try {
            return new Date(instant.toEpochMilli());
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
