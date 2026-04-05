package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class h4 {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReference f14077a = new AtomicReference();

    public static String a() {
        return "iabtechlab-Applovin";
    }

    public static URL b() {
        try {
            return new URL("https://compliance.iabtechnologylab.com/compliance-js/omid-validation-verification-script-v1-APPLOVIN-01102024.js");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String c() {
        return "iabtechlab.com-omid";
    }

    public static String a(com.applovin.impl.sdk.k kVar, Map map) {
        String str = (String) f14077a.get();
        if (StringUtils.isValidString(str)) {
            return str;
        }
        URL urlB = b();
        if (urlB == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            InputStream inputStreamA = kVar.H().a(urlB.toString(), (List) null, false, map);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamA));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb2.append(line);
                        sb2.append("\n");
                    } finally {
                    }
                }
                bufferedReader.close();
                if (inputStreamA != null) {
                    inputStreamA.close();
                }
            } finally {
            }
        } catch (Throwable th2) {
            kVar.O().a("OpenMeasurementTestParameters", th2);
            kVar.E().a("OpenMeasurementTestParameters", "getTestValidationJavaScriptContent", th2);
        }
        String string = sb2.toString();
        f14077a.set(string);
        return string;
    }
}
