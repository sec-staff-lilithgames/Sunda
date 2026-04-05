package tv;

import com.applovin.sdk.AppLovinErrorCodes;
import com.sfbx.appconsent.core.BuildConfig;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c0 {

    /* renamed from: h, reason: collision with root package name */
    public static final a f87425h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f87426a;

    /* renamed from: b, reason: collision with root package name */
    public final int f87427b;

    /* renamed from: c, reason: collision with root package name */
    public final int f87428c;

    /* renamed from: d, reason: collision with root package name */
    public final int f87429d;

    /* renamed from: e, reason: collision with root package name */
    public final int f87430e;

    /* renamed from: f, reason: collision with root package name */
    public final int f87431f;

    /* renamed from: g, reason: collision with root package name */
    public final int f87432g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final c0 fromInstant(n instant) {
            long j10;
            long j11;
            e0.checkNotNullParameter(instant, "instant");
            long epochSeconds = instant.getEpochSeconds();
            long j12 = epochSeconds / 86400;
            if ((epochSeconds ^ 86400) < 0 && j12 * 86400 != epochSeconds) {
                j12--;
            }
            long j13 = epochSeconds % 86400;
            int i10 = (int) (j13 + (86400 & (((j13 ^ 86400) & ((-j13) | j13)) >> 63)));
            long j14 = (j12 + 719528) - 60;
            if (j14 < 0) {
                j10 = -1;
                long j15 = 146097;
                long j16 = ((j14 + 1) / j15) - 1;
                j11 = 400 * j16;
                j14 += (-j16) * j15;
            } else {
                j10 = -1;
                j11 = 0;
            }
            long j17 = 400;
            long j18 = ((j17 * j14) + 591) / 146097;
            long j19 = 365;
            long j20 = 4;
            long j21 = 100;
            long j22 = j14 - ((j18 / j17) + (((j18 / j20) + (j19 * j18)) - (j18 / j21)));
            if (j22 < 0) {
                j18 += j10;
                j22 = j14 - ((j18 / j17) + (((j18 / j20) + (j19 * j18)) - (j18 / j21)));
            }
            long j23 = j18 + j11;
            int i11 = (int) j22;
            int iE = e3.g.e(i11, 5, 2, 153);
            int i12 = ((iE + 2) % 12) + 1;
            int i13 = (i11 - (((iE * 306) + 5) / 10)) + 1;
            int i14 = (int) (j23 + (iE / 10));
            int i15 = i10 / BuildConfig.VERSION_CODE;
            int i16 = i10 - (i15 * BuildConfig.VERSION_CODE);
            int i17 = i16 / 60;
            return new c0(i14, i12, i13, i15, i17, i16 - (i17 * 60), instant.getNanosecondsOfSecond());
        }
    }

    public c0(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f87426a = i10;
        this.f87427b = i11;
        this.f87428c = i12;
        this.f87429d = i13;
        this.f87430e = i14;
        this.f87431f = i15;
        this.f87432g = i16;
    }

    public final int getDay() {
        return this.f87428c;
    }

    public final int getHour() {
        return this.f87429d;
    }

    public final int getMinute() {
        return this.f87430e;
    }

    public final int getMonth() {
        return this.f87427b;
    }

    public final int getNanosecond() {
        return this.f87432g;
    }

    public final int getSecond() {
        return this.f87431f;
    }

    public final int getYear() {
        return this.f87426a;
    }

    public final <T> T toInstant(int i10, kv.p buildInstant) {
        e0.checkNotNullParameter(buildInstant, "buildInstant");
        long year = getYear();
        long j10 = 365 * year;
        long month = (year >= 0 ? ((year + 399) / 400) + (((3 + year) / 4) - ((99 + year) / 100)) + j10 : j10 - ((year / AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR) + ((year / (-4)) - (year / (-100))))) + (((getMonth() * 367) - 362) / 12) + (getDay() - 1);
        if (getMonth() > 2) {
            month = !p.isLeapYear(getYear()) ? month - 2 : (-1) + month;
        }
        return (T) buildInstant.invoke(Long.valueOf((((month - 719528) * 86400) + (getSecond() + ((getMinute() * 60) + (getHour() * BuildConfig.VERSION_CODE)))) - i10), Integer.valueOf(getNanosecond()));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UnboundLocalDateTime(");
        sb2.append(this.f87426a);
        sb2.append('-');
        sb2.append(this.f87427b);
        sb2.append('-');
        sb2.append(this.f87428c);
        sb2.append(' ');
        sb2.append(this.f87429d);
        sb2.append(AbstractJsonLexerKt.COLON);
        sb2.append(this.f87430e);
        sb2.append(AbstractJsonLexerKt.COLON);
        sb2.append(this.f87431f);
        sb2.append('.');
        return e3.g.m(sb2, this.f87432g, ')');
    }
}
