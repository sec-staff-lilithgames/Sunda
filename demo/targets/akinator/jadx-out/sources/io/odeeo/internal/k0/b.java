package io.odeeo.internal.k0;

import android.text.TextUtils;
import io.odeeo.internal.u0.q1;
import java.util.regex.Pattern;
import kotlinx.coroutines.DebugKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f64430d = Pattern.compile("\\s+");

    /* renamed from: e, reason: collision with root package name */
    public static final q1<String> f64431e = q1.of(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "none");

    /* renamed from: f, reason: collision with root package name */
    public static final q1<String> f64432f = q1.of("dot", "sesame", "circle");

    /* renamed from: g, reason: collision with root package name */
    public static final q1<String> f64433g = q1.of("filled", "open");

    /* renamed from: h, reason: collision with root package name */
    public static final q1<String> f64434h = q1.of("after", "before", "outside");

    /* renamed from: a, reason: collision with root package name */
    public final int f64435a;

    /* renamed from: b, reason: collision with root package name */
    public final int f64436b;

    /* renamed from: c, reason: collision with root package name */
    public final int f64437c;

    public b(int i10, int i11, int i12) {
        this.f64435a = i10;
        this.f64436b = i11;
        this.f64437c = i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static io.odeeo.internal.k0.b a(io.odeeo.internal.u0.q1<java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.k0.b.a(io.odeeo.internal.u0.q1):io.odeeo.internal.k0.b");
    }

    public static b parse(String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = io.odeeo.internal.t0.c.toLowerCase(str.trim());
        if (lowerCase.isEmpty()) {
            return null;
        }
        return a(q1.copyOf(TextUtils.split(lowerCase, f64430d)));
    }
}
