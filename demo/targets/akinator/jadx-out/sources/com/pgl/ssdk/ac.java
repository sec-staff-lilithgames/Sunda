package com.pgl.ssdk;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class ac {

    /* renamed from: a, reason: collision with root package name */
    private static final FileFilter f50366a = new a();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return Pattern.matches("cpu[0-9]", file.getName());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|2|(4:28|3|26|4)|(3:30|5|(2:34|6))|24|14|(1:16)(2:18|19)) */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0024 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(java.lang.String r2) {
        /*
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L15
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L15
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L13
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Throwable -> L17
            r2.close()     // Catch: java.lang.Throwable -> L1f
            goto L1f
        L13:
            r2 = r0
            goto L17
        L15:
            r2 = r0
            r1 = r2
        L17:
            if (r2 == 0) goto L1c
            r2.close()     // Catch: java.lang.Throwable -> L1c
        L1c:
            if (r1 != 0) goto L1f
            goto L22
        L1f:
            r1.close()     // Catch: java.lang.Throwable -> L22
        L22:
            if (r0 != 0) goto L27
            java.lang.String r2 = "0"
            return r2
        L27:
            java.lang.String r2 = r0.trim()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.ac.a(java.lang.String):java.lang.String");
    }

    private static HashMap<String, String> b() {
        FileReader fileReader;
        HashMap<String, String> map = new HashMap<>();
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("/proc/cpuinfo");
            try {
                BufferedReader bufferedReader2 = new BufferedReader(fileReader);
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            try {
                                break;
                            } catch (Throwable unused) {
                            }
                        } else {
                            String[] strArrSplit = line.split(":", 2);
                            if (strArrSplit.length >= 2) {
                                String strTrim = strArrSplit[0].trim();
                                String strTrim2 = strArrSplit[1].trim();
                                if (map.get(strTrim) == null) {
                                    map.put(strTrim, strTrim2);
                                }
                            }
                        }
                    } catch (Throwable unused2) {
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable unused3) {
                            }
                        }
                        if (fileReader != null) {
                            fileReader.close();
                        }
                        return map;
                    }
                }
                bufferedReader2.close();
            } catch (Throwable unused4) {
            }
        } catch (Throwable unused5) {
            fileReader = null;
        }
        try {
            fileReader.close();
        } catch (Throwable unused6) {
        }
        return map;
    }

    public static String c() {
        JSONObject jSONObject = new JSONObject();
        try {
            HashMap<String, String> mapB = b();
            jSONObject.put("core", a());
            jSONObject.put("hw", a(mapB, "Hardware"));
            jSONObject.put("max", a("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"));
            jSONObject.put("min", a("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq"));
            jSONObject.put("ft", a(mapB, "Features"));
        } catch (Throwable unused) {
        }
        String string = jSONObject.toString();
        return string == null ? "{}" : string.trim();
    }

    private static String a(HashMap<String, String> map, String str) {
        String str2;
        try {
            str2 = map.get(str);
        } catch (Throwable unused) {
            str2 = null;
        }
        return str2 == null ? "" : str2.trim();
    }

    private static int a() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles(f50366a).length;
        } catch (Throwable unused) {
            return -1;
        }
    }
}
