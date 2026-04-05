package com.ironsource.sdk.controller;

import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.C3422r4;
import com.ironsource.Jb;
import com.ironsource.mediationsdk.logger.IronLog;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
final class s {

    /* renamed from: b, reason: collision with root package name */
    private static final String f38677b = "MD5";

    /* renamed from: a, reason: collision with root package name */
    private String f38678a;

    public s(String str) {
        this.f38678a = str;
    }

    public static String a() {
        return UUID.randomUUID().toString();
    }

    private String b(String str) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return a(messageDigest.digest());
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return "";
        }
    }

    private String a(String str) {
        try {
            return Jb.a(str);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return b(str);
        }
    }

    private String a(byte[] bArr) throws Exception {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            if (hexString.length() < 2) {
                hexString = "0".concat(hexString);
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }

    public String b() {
        return this.f38678a;
    }

    public boolean a(String str, String str2, String str3) {
        try {
            return str3.equalsIgnoreCase(a(str + str2 + this.f38678a));
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }
}
