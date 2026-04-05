package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Random;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.p5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3390p5 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f38124d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f38125e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final String f38126f = "C38FB23A402222A0C17D34A92F971D1F";

    /* renamed from: g, reason: collision with root package name */
    public static final String f38127g = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDaUZaiASqhU4+s3JiQaIzVYtC+rZiPX2K+ZRg4C21kBZDNQM5+SEkp5GT5a9W/IR2oz6Q/ucifXcc7QEo5Xl5GX1BAhFI+8KaxPmn5Km5zFdH0aCvrrpDYQpH239Q+2uuUC79G5MpfSIw0zixU4VkF0WbVdHDpgQDds39cPl6cTwIDAQAB";

    /* renamed from: h, reason: collision with root package name */
    public static final String f38128h = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";

    /* renamed from: i, reason: collision with root package name */
    public static final int f38129i = 32;

    /* renamed from: j, reason: collision with root package name */
    private static final C3390p5 f38130j = new C3390p5();

    /* renamed from: a, reason: collision with root package name */
    private String f38131a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f38132b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f38133c = "";

    private String a(String str, int i10) {
        StringBuilder sb2 = new StringBuilder();
        Random random = new Random();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append(str.charAt(random.nextInt(str.length())));
        }
        return sb2.toString();
    }

    public static C3390p5 b() {
        return f38130j;
    }

    public String c() {
        if (TextUtils.isEmpty(this.f38131a)) {
            this.f38131a = f38126f;
        }
        return this.f38131a;
    }

    public synchronized String d() {
        try {
            if (TextUtils.isEmpty(this.f38132b)) {
                this.f38132b = a(f38128h, 32);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f38132b;
    }

    public String a() throws JSONException {
        if (TextUtils.isEmpty(this.f38133c)) {
            try {
                this.f38133c = C3143ba.a(d(), f38127g);
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                String str = "Session key encryption exception: " + e10.getLocalizedMessage();
                IronLog.INTERNAL.error(str);
                throw new JSONException(str);
            }
        }
        return this.f38133c;
    }
}
