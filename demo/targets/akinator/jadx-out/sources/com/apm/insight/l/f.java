package com.apm.insight.l;

import android.text.TextUtils;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.nativecrash.NativeImpl;
import com.applovin.shadow.okio.Segment;
import j1.o2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final int f13170a;

    /* renamed from: b, reason: collision with root package name */
    private String f13171b;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f13172c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f13173d;

    public f(int i10) {
        this.f13170a = i10;
    }

    public static void a(File file, String str, boolean z10) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        file.getParentFile().mkdirs();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, z10);
            try {
                fileOutputStream2.write(str.getBytes());
                fileOutputStream2.flush();
                com.apm.insight.a.a((Closeable) fileOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                com.apm.insight.a.a((Closeable) fileOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static String b(File file, String str) throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        com.apm.insight.a.a((Closeable) bufferedReader2);
                        return sb2.toString();
                    }
                    if (sb2.length() != 0 && str != null) {
                        sb2.append(str);
                    }
                    sb2.append(line);
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    com.apm.insight.a.a((Closeable) bufferedReader);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static Map<String, String> c(File file) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            Properties properties = new Properties();
            fileInputStream = new FileInputStream(file);
            try {
                try {
                    properties.load(fileInputStream);
                    Set<String> setStringPropertyNames = properties.stringPropertyNames();
                    HashMap map = new HashMap();
                    for (String str : setStringPropertyNames) {
                        map.put(str, properties.getProperty(str));
                    }
                    com.apm.insight.a.a((Closeable) fileInputStream);
                    return map;
                } catch (IOException e10) {
                    e = e10;
                    com.apm.insight.a.b((Throwable) e);
                    com.apm.insight.a.a((Closeable) fileInputStream);
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                com.apm.insight.a.a((Closeable) fileInputStream2);
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            com.apm.insight.a.a((Closeable) fileInputStream2);
            throw th;
        }
    }

    public static void d(File file) {
        File file2 = new File(file, "lock");
        try {
            file2.createNewFile();
            NativeImpl.c(file2.getAbsolutePath());
        } catch (Throwable th2) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
        }
    }

    public static boolean e(File file) {
        int iC;
        if (!file.isFile()) {
            file = new File(file, "lock");
        }
        if (!file.exists()) {
            return false;
        }
        try {
            iC = NativeImpl.c(file.getAbsolutePath());
        } catch (Throwable th2) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
        }
        if (iC <= 0) {
            return iC < 0;
        }
        NativeImpl.a(iC);
        return false;
    }

    private static com.apm.insight.entity.a f(File file) {
        com.apm.insight.entity.a aVarA = a(new File(file, "logEventStack"), file.getName().contains("oom"));
        boolean z10 = false;
        for (int i10 = 0; i10 < 6; i10++) {
            File fileA = j.a(file, ".".concat(String.valueOf(i10)));
            if (fileA.exists()) {
                try {
                    aVarA.c(new JSONObject(a(fileA.getAbsolutePath(), "\n")));
                    z10 = true;
                } catch (Throwable unused) {
                }
            }
        }
        aVarA.a("crash_type", z10 ? "step" : "simple");
        JSONObject jSONObjectOptJSONObject = aVarA.c().optJSONObject("header");
        com.apm.insight.e.g();
        JSONObject jSONObjectF = Header.a(aVarA.c().optLong("crash_time", 0L)).f();
        if (jSONObjectOptJSONObject == null) {
            aVarA.a(jSONObjectF);
        } else {
            com.apm.insight.a.a(jSONObjectOptJSONObject, jSONObjectF);
        }
        return aVarA;
    }

    public f(byte[] bArr) {
        this.f13170a = 204;
        this.f13173d = bArr;
    }

    public f(int i10, Throwable th2) {
        this.f13170a = i10;
        this.f13171b = th2.getMessage();
    }

    public static void a(File file, JSONObject jSONObject) throws IOException {
        BufferedWriter bufferedWriter;
        if (jSONObject == null) {
            return;
        }
        file.getParentFile().mkdirs();
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
        } catch (Throwable unused) {
            bufferedWriter = null;
        }
        try {
            h.a(jSONObject, bufferedWriter);
            com.apm.insight.a.a((Closeable) bufferedWriter);
        } catch (Throwable unused2) {
            com.apm.insight.a.a((Closeable) bufferedWriter);
        }
    }

    public f(String str) {
        this.f13170a = 206;
        this.f13171b = str;
    }

    public static boolean b(File file) {
        String[] list = file.list();
        return list == null || list.length == 0;
    }

    public static void a(File file, JSONArray jSONArray) throws IOException {
        BufferedWriter bufferedWriter;
        if (jSONArray == null) {
            return;
        }
        file.getParentFile().mkdirs();
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
        } catch (Throwable unused) {
            bufferedWriter = null;
        }
        try {
            h.a(jSONArray, bufferedWriter);
            com.apm.insight.a.a((Closeable) bufferedWriter);
        } catch (Throwable unused2) {
            com.apm.insight.a.a((Closeable) bufferedWriter);
        }
    }

    public static com.apm.insight.f.b c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(a(str, "\n"));
            com.apm.insight.f.b bVar = new com.apm.insight.f.b();
            bVar.d(jSONObject.optString("aid"));
            bVar.c(jSONObject.optString("did"));
            bVar.e(jSONObject.optString("processName"));
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("alogFiles");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i10));
                }
                bVar.a(arrayList);
            }
            return bVar;
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        } catch (JSONException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public f(JSONObject jSONObject) {
        this.f13170a = 0;
        this.f13172c = jSONObject;
    }

    private static String b(File file, String str, String str2, JSONObject jSONObject, boolean z10) throws JSONException {
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("url", str2);
            jSONObject2.put("body", jSONObject);
            jSONObject2.put("dump_file", "");
            jSONObject2.put("encrypt", z10);
            a(file2, jSONObject2);
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return file2.getAbsolutePath();
    }

    public static boolean a(File file) {
        boolean zA;
        boolean z10 = true;
        if (!file.exists()) {
            return true;
        }
        if (!file.canWrite()) {
            return false;
        }
        if (file.isFile()) {
            return file.delete();
        }
        if (!file.isDirectory()) {
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        for (int i10 = 0; fileArrListFiles != null && i10 < fileArrListFiles.length; i10++) {
            if (fileArrListFiles[i10].isFile()) {
                if (fileArrListFiles[i10].canWrite()) {
                    zA = fileArrListFiles[i10].delete();
                } else {
                    z10 = false;
                }
            } else {
                zA = a(fileArrListFiles[i10]);
            }
            z10 &= zA;
        }
        return file.delete() & z10;
    }

    public static void b(String str, String str2) throws Exception {
        ZipOutputStream zipOutputStream;
        Throwable th2;
        File file = new File(str);
        try {
            new File(str2).getParentFile().mkdirs();
            zipOutputStream = new ZipOutputStream(new FileOutputStream(str2));
            try {
                a(zipOutputStream, file, "");
                com.apm.insight.a.a((Closeable) zipOutputStream);
            } catch (Throwable th3) {
                th2 = th3;
                com.apm.insight.a.a((Closeable) zipOutputStream);
                throw th2;
            }
        } catch (Throwable th4) {
            zipOutputStream = null;
            th2 = th4;
        }
    }

    public static String a(String str, String str2) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return b(new File(str), str2);
    }

    public static com.apm.insight.f.b b(String str) {
        try {
            String strA = a(str, "\n");
            if (strA == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strA);
            com.apm.insight.f.b bVar = new com.apm.insight.f.b();
            bVar.a(jSONObject.optString("url"));
            bVar.a(jSONObject.optJSONObject("body"));
            bVar.b(jSONObject.optString("dump_file"));
            bVar.a(jSONObject.optBoolean("encrypt", false));
            return bVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a(File file, String str) throws IOException {
        return b(file, str);
    }

    public static JSONArray a(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(new File(str), -1L);
    }

    public static JSONArray a(File file, long j10) throws Throwable {
        JSONArray jSONArray = new JSONArray();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            if (j10 > 0) {
                try {
                    bufferedReader2.skip(j10);
                    bufferedReader2.readLine();
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    com.apm.insight.a.a((Closeable) bufferedReader);
                    throw th;
                }
            }
            while (true) {
                String line = bufferedReader2.readLine();
                if (line != null) {
                    jSONArray.put(line);
                } else {
                    com.apm.insight.a.a((Closeable) bufferedReader2);
                    return jSONArray;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final byte[] b() {
        return this.f13173d;
    }

    public static com.apm.insight.f.b a(File file, CrashType crashType) {
        String strC;
        com.apm.insight.entity.a aVarF = f(file);
        String name = file.getName();
        String strSubstring = name.substring(name.lastIndexOf(95) + 1);
        JSONObject jSONObjectOptJSONObject = aVarF.c().optJSONObject("header");
        if (jSONObjectOptJSONObject.optString("unique_key", null) == null) {
            try {
                jSONObjectOptJSONObject.put("unique_key", "android_" + com.apm.insight.e.c().a() + "_" + strSubstring + "_" + CrashType.LAUNCH);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        com.apm.insight.f.b bVar = new com.apm.insight.f.b();
        if (crashType == CrashType.LAUNCH) {
            strC = com.apm.insight.k.e.e();
        } else {
            strC = com.apm.insight.k.e.c();
        }
        bVar.a(strC);
        bVar.a(aVarF.c());
        bVar.a(com.apm.insight.k.e.a());
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.apm.insight.entity.a a(java.io.File r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.l.f.a(java.io.File, boolean):com.apm.insight.entity.a");
    }

    public static void a(File file, Map<String, String> map) throws Throwable {
        Properties properties;
        FileOutputStream fileOutputStream;
        if (map == null || map.isEmpty()) {
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                properties = new Properties();
                fileOutputStream = new FileOutputStream(file);
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                properties.setProperty(entry.getKey(), entry.getValue());
            }
            properties.store(fileOutputStream, "no");
            com.apm.insight.a.a((Closeable) fileOutputStream);
        } catch (IOException e11) {
            e = e11;
            fileOutputStream2 = fileOutputStream;
            com.apm.insight.a.b((Throwable) e);
            com.apm.insight.a.a((Closeable) fileOutputStream2);
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            com.apm.insight.a.a((Closeable) fileOutputStream2);
            throw th;
        }
    }

    public static String a(File file, String str, String str2, JSONObject jSONObject, boolean z10) {
        return b(file, str, str2, jSONObject, z10);
    }

    public static void a(File file, File file2) throws Throwable {
        FileOutputStream fileOutputStream;
        if (file2 == null) {
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            file2.getParentFile().mkdirs();
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (Exception e10) {
                e = e10;
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
            try {
                byte[] bArr = new byte[Segment.SIZE];
                while (true) {
                    int i10 = fileInputStream2.read(bArr);
                    if (i10 <= 0) {
                        break;
                    } else {
                        fileOutputStream.write(bArr, 0, i10);
                    }
                }
                com.apm.insight.a.a((Closeable) fileInputStream2);
            } catch (Exception e11) {
                e = e11;
                fileInputStream = fileInputStream2;
                try {
                    e.printStackTrace();
                    com.apm.insight.a.a((Closeable) fileInputStream);
                    com.apm.insight.a.a((Closeable) fileOutputStream);
                } catch (Throwable th3) {
                    th = th3;
                    com.apm.insight.a.a((Closeable) fileInputStream);
                    com.apm.insight.a.a((Closeable) fileOutputStream);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                fileInputStream = fileInputStream2;
                com.apm.insight.a.a((Closeable) fileInputStream);
                com.apm.insight.a.a((Closeable) fileOutputStream);
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            fileOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
        }
        com.apm.insight.a.a((Closeable) fileOutputStream);
    }

    public static void a(OutputStream outputStream, File... fileArr) throws Throwable {
        ZipOutputStream zipOutputStream;
        ZipOutputStream zipOutputStream2 = null;
        try {
            zipOutputStream = new ZipOutputStream(outputStream);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            zipOutputStream.putNextEntry(new ZipEntry("/"));
            for (File file : fileArr) {
                a(zipOutputStream, file);
            }
            com.apm.insight.a.a((Closeable) zipOutputStream);
        } catch (Throwable th3) {
            th = th3;
            zipOutputStream2 = zipOutputStream;
            com.apm.insight.a.a((Closeable) zipOutputStream2);
            throw th;
        }
    }

    private static void a(ZipOutputStream zipOutputStream, File file) throws Throwable {
        if (file == null || !file.exists()) {
            return;
        }
        File[] fileArrListFiles = file.isDirectory() ? file.listFiles() : new File[]{file};
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            a(zipOutputStream, file2, file2.getName());
        }
    }

    private static void a(ZipOutputStream zipOutputStream, File file, String str) throws Throwable {
        FileInputStream fileInputStream;
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            zipOutputStream.putNextEntry(new ZipEntry(o2.l(str, "/")));
            String strConcat = str.length() == 0 ? "" : str.concat("/");
            for (int i10 = 0; i10 < fileArrListFiles.length; i10++) {
                File file2 = fileArrListFiles[i10];
                StringBuilder sbU = p0.o2.u(strConcat);
                sbU.append(fileArrListFiles[i10].getName());
                a(zipOutputStream, file2, sbU.toString());
            }
            return;
        }
        zipOutputStream.putNextEntry(new ZipEntry(str));
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int i11 = fileInputStream.read(bArr);
                if (-1 != i11) {
                    zipOutputStream.write(bArr, 0, i11);
                } else {
                    com.apm.insight.a.a((Closeable) fileInputStream);
                    return;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            com.apm.insight.a.a((Closeable) fileInputStream2);
            throw th;
        }
    }

    public final boolean a() {
        return this.f13170a != 207;
    }
}
