package io.ktor.util.date;

import kotlin.jvm.internal.e0;
import tv.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class DateKt {
    public static final GMTDate minus(GMTDate gMTDate, long j10) {
        e0.checkNotNullParameter(gMTDate, "<this>");
        return DateJvmKt.GMTDate(Long.valueOf(gMTDate.getTimestamp() - j10));
    }

    /* renamed from: minus-HG0u8IE, reason: not valid java name */
    public static final GMTDate m4298minusHG0u8IE(GMTDate minus, long j10) {
        e0.checkNotNullParameter(minus, "$this$minus");
        return DateJvmKt.GMTDate(Long.valueOf(minus.getTimestamp() - f.m7195getInWholeMillisecondsimpl(j10)));
    }

    public static final GMTDate plus(GMTDate gMTDate, long j10) {
        e0.checkNotNullParameter(gMTDate, "<this>");
        return DateJvmKt.GMTDate(Long.valueOf(gMTDate.getTimestamp() + j10));
    }

    /* renamed from: plus-HG0u8IE, reason: not valid java name */
    public static final GMTDate m4299plusHG0u8IE(GMTDate plus, long j10) {
        e0.checkNotNullParameter(plus, "$this$plus");
        return DateJvmKt.GMTDate(Long.valueOf(f.m7195getInWholeMillisecondsimpl(j10) + plus.getTimestamp()));
    }

    public static final GMTDate truncateToSeconds(GMTDate gMTDate) {
        e0.checkNotNullParameter(gMTDate, "<this>");
        return DateJvmKt.GMTDate(gMTDate.getSeconds(), gMTDate.getMinutes(), gMTDate.getHours(), gMTDate.getDayOfMonth(), gMTDate.getMonth(), gMTDate.getYear());
    }
}
