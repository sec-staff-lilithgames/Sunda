package com.apm.insight.runtime;

import android.text.TextUtils;
import com.apm.insight.b.h;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static h.a f13307a;

    public static void a(h.a aVar) {
        f13307a = aVar;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0031: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:50), block:B:10:0x0031 */
    private static JSONArray b(String str) throws Throwable {
        Closeable closeable;
        BufferedReader bufferedReader;
        Closeable closeable2 = null;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                JSONArray jSONArray = new JSONArray();
                bufferedReader = new BufferedReader(new FileReader(str));
                try {
                    File file = new File(str);
                    if (file.length() > 512000) {
                        bufferedReader.skip(file.length() - 512000);
                    }
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            com.apm.insight.a.a((Closeable) bufferedReader);
                            return jSONArray;
                        }
                        jSONArray.put(line);
                    }
                } catch (IOException e10) {
                    e = e10;
                    e.printStackTrace();
                    com.apm.insight.a.a((Closeable) bufferedReader);
                    return null;
                }
            } catch (IOException e11) {
                e = e11;
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
                com.apm.insight.a.a(closeable2);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable2 = closeable;
        }
    }

    public static JSONArray a(String str) {
        if (!com.apm.insight.e.v()) {
            return null;
        }
        if (f13307a != null && com.apm.insight.e.f().equals(str)) {
            try {
                return b(f13307a.b());
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                j.a(th2, "NPTH_CATCH");
            }
        }
        try {
            return b(com.apm.insight.a.a(str, com.apm.insight.e.i().getLogcatDumpCount(), com.apm.insight.e.i().getLogcatLevel()).getAbsolutePath());
        } catch (Throwable th3) {
            com.apm.insight.c.a();
            j.a(th3, "NPTH_CATCH");
            return null;
        }
    }
}
