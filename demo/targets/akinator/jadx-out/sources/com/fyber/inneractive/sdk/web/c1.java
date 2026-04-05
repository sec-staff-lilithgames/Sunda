package com.fyber.inneractive.sdk.web;

import android.text.TextUtils;
import io.ktor.client.utils.CacheControl;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c1 {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f26842g = Pattern.compile("max-age=(\\d+)");

    /* renamed from: h, reason: collision with root package name */
    public static final SimpleDateFormat f26843h = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.ENGLISH);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f26844a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f26845b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26846c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26847d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26848e;

    /* renamed from: f, reason: collision with root package name */
    public final String f26849f;

    public c1(byte[] bArr, HashMap map, String str, String str2, int i10, String str3) {
        this.f26844a = bArr;
        this.f26845b = map;
        this.f26846c = str;
        this.f26847d = str2;
        this.f26848e = i10;
        this.f26849f = str3;
    }

    public final boolean a() throws ParseException {
        boolean z10;
        String str;
        if (TextUtils.isEmpty(this.f26849f)) {
            return false;
        }
        loop0: while (true) {
            z10 = true;
            for (String str2 : this.f26845b.keySet()) {
                if (!z10) {
                    break loop0;
                }
                if (str2 == null || !str2.equalsIgnoreCase("Cache-Control")) {
                    if (str2 == null || !str2.equalsIgnoreCase("Vary")) {
                        if (str2 != null && str2.equalsIgnoreCase("Pragma")) {
                            String str3 = (String) this.f26845b.get(str2);
                            if (str3 != null) {
                                z10 = !str3.equalsIgnoreCase(CacheControl.NO_CACHE);
                            }
                        } else if (str2 != null && str2.equalsIgnoreCase("Expires") && (str = (String) this.f26845b.get(str2)) != null) {
                            try {
                                Date date = f26843h.parse(str);
                                if (date != null && date.getTime() + TimeUnit.MILLISECONDS.convert(1L, TimeUnit.HOURS) > System.currentTimeMillis()) {
                                    break;
                                }
                            } catch (ParseException unused) {
                                continue;
                            }
                        }
                    }
                    z10 = false;
                } else {
                    String str4 = (String) this.f26845b.get(str2);
                    if (str4 != null) {
                        Pattern pattern = f26842g;
                        Locale locale = Locale.ENGLISH;
                        Matcher matcher = pattern.matcher(str4.toLowerCase(locale));
                        int iA = (matcher.find() && matcher.groupCount() == 1) ? com.fyber.inneractive.sdk.util.v.a(matcher.group(1), 0) : 0;
                        if ((str4.toLowerCase(locale).contains(CacheControl.PUBLIC) || str4.toLowerCase(locale).contains(CacheControl.PRIVATE) || iA > TimeUnit.SECONDS.convert(1L, TimeUnit.HOURS)) && !str4.toLowerCase(locale).contains("no-") && !str4.toLowerCase(locale).contains("must-")) {
                            break;
                        }
                        z10 = false;
                    } else {
                        continue;
                    }
                }
            }
        }
        return z10;
    }
}
