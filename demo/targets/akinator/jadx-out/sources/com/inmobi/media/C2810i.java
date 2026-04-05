package com.inmobi.media;

import io.ktor.client.utils.CacheControl;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2810i {

    /* renamed from: b, reason: collision with root package name */
    public int f32908b;

    /* renamed from: c, reason: collision with root package name */
    public String f32909c;

    /* renamed from: d, reason: collision with root package name */
    public String f32910d;

    /* renamed from: g, reason: collision with root package name */
    public long f32913g;

    /* renamed from: h, reason: collision with root package name */
    public long f32914h;

    /* renamed from: a, reason: collision with root package name */
    public final int f32907a = new Random().nextInt() & Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public final long f32911e = System.currentTimeMillis();

    /* renamed from: f, reason: collision with root package name */
    public final long f32912f = System.currentTimeMillis();

    public final C2810i a(String url, String locationOnDisk, Z9 response, int i10, long j10) {
        long j11;
        long j12;
        List list;
        boolean z10;
        long j13;
        boolean z11;
        long j14;
        long j15;
        long j16;
        long j17;
        int i11;
        String[] strArr;
        long j18;
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(locationOnDisk, "locationOnDisk");
        kotlin.jvm.internal.e0.checkNotNullParameter(response, "response");
        Map map = response.f32604f;
        long jCurrentTimeMillis = System.currentTimeMillis();
        List list2 = map != null ? (List) map.get("Date") : null;
        int i12 = 0;
        long jA = (list2 == null || list2.isEmpty()) ? 0L : a((String) list2.get(0));
        List list3 = map != null ? (List) map.get("Cache-Control") : null;
        if (list3 == null || list3.isEmpty()) {
            j11 = jCurrentTimeMillis;
            j12 = jA;
            list = null;
            z10 = false;
            j13 = 0;
            z11 = false;
            j14 = 0;
        } else {
            String[] strArr2 = (String[]) sv.n0.split$default((CharSequence) list3.get(0), new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
            int length = strArr2.length;
            int i13 = 0;
            z11 = false;
            j13 = 0;
            j14 = 0;
            while (true) {
                int i14 = 1;
                if (i13 >= length) {
                    break;
                }
                String str = strArr2[i13];
                int i15 = i12;
                int length2 = str.length() - 1;
                while (true) {
                    if (i12 > length2) {
                        j17 = jCurrentTimeMillis;
                        i11 = i14;
                        break;
                    }
                    j17 = jCurrentTimeMillis;
                    boolean z12 = kotlin.jvm.internal.e0.compare((int) str.charAt(i15 == 0 ? i12 : length2), 32) <= 0;
                    if (i15 == 0) {
                        if (z12) {
                            i12++;
                        } else {
                            jCurrentTimeMillis = j17;
                            i14 = 1;
                            i15 = 1;
                        }
                    } else {
                        if (!z12) {
                            i11 = 1;
                            break;
                        }
                        length2--;
                    }
                    jCurrentTimeMillis = j17;
                    i14 = 1;
                }
                String strA = S7.a(length2, i11, str, i12);
                if (kotlin.jvm.internal.e0.areEqual(CacheControl.NO_CACHE, strA) || kotlin.jvm.internal.e0.areEqual(CacheControl.NO_STORE, strA)) {
                    strArr = strArr2;
                    j18 = jA;
                } else if (sv.k0.startsWith$default(strA, "max-age=", false, 2, null)) {
                    try {
                        String strSubstring = strA.substring(8);
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                        j13 = Long.parseLong(strSubstring);
                    } catch (Exception unused) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("j", "access$getTAG$cp(...)");
                    }
                    strArr = strArr2;
                    j18 = jA;
                } else {
                    strArr = strArr2;
                    j18 = jA;
                    if (sv.k0.startsWith$default(strA, "stale-while-revalidate=", false, 2, null)) {
                        try {
                            String strSubstring2 = strA.substring(23);
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                            j14 = Long.parseLong(strSubstring2);
                        } catch (Exception unused2) {
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue("j", "access$getTAG$cp(...)");
                        }
                    } else if (kotlin.jvm.internal.e0.areEqual(CacheControl.MUST_REVALIDATE, strA) || kotlin.jvm.internal.e0.areEqual(CacheControl.PROXY_REVALIDATE, strA)) {
                        z11 = true;
                    }
                }
                i13++;
                strArr2 = strArr;
                jCurrentTimeMillis = j17;
                jA = j18;
                i12 = 0;
            }
            j11 = jCurrentTimeMillis;
            j12 = jA;
            list = null;
            z10 = true;
        }
        List list4 = map != null ? (List) map.get("Expires") : list;
        long jA2 = (list4 == null || list4.isEmpty()) ? 0L : a((String) list4.get(0));
        if (z10) {
            long j19 = 1000;
            j16 = (j13 * j19) + j11;
            if (z11) {
                j15 = j16;
            } else {
                j16 = (j14 * j19) + j16;
                j15 = j16;
            }
        } else if (1 > j12 || j12 > jA2) {
            j15 = 0;
            j16 = 0;
        } else {
            j16 = (jA2 - j12) + j11;
            j15 = j16;
        }
        this.f32909c = url;
        this.f32910d = locationOnDisk;
        this.f32908b = i10;
        long j20 = (1000 * j10) + j11;
        this.f32913g = j20;
        this.f32914h = j15;
        this.f32913g = Math.min(j20, j16);
        return this;
    }

    public static long a(String str) throws ParseException {
        try {
            Date date = new SimpleDateFormat("EEE,dd MMM yyyy HH:mm:ss z", Locale.ENGLISH).parse(str);
            if (date != null) {
                return date.getTime();
            }
            return 0L;
        } catch (ParseException e10) {
            Y5 y52 = Y5.f32563a;
            C2796h2 event = new C2796h2(e10);
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            Y5.f32566d.a(event);
            return 0L;
        }
    }
}
