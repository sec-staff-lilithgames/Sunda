package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.task.Ri.TJzY;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class n0 extends v {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.m().b());
                if (gVarD == null) {
                    gVarD = com.mbridge.msdk.setting.h.b().a();
                }
                n0.b(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_RES_MANAGER_DIR), gVarD.N());
                n0.a(System.currentTimeMillis() - (gVarD.e() * 1000));
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (com.mbridge.msdk.foundation.controller.c.m().d() != null) {
                    n0.b(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_VC));
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.isHidden() || file.isDirectory();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements Comparator<File> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            long jLastModified = file.lastModified() - file2.lastModified();
            if (jLastModified > 0) {
                return 1;
            }
            return jLastModified == 0 ? 0 : -1;
        }

        @Override // java.util.Comparator
        public boolean equals(Object obj) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, int i10) {
        try {
            if (d(new File(str)) > i10 * ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) {
                f(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        } catch (Throwable unused) {
            p0.b("SameFileTool", "clean memory failed");
        }
    }

    public static File[] c(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return file.listFiles();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String d(String str) {
        return !TextUtils.isEmpty(str) ? SameMD5.getMD5(b1.b(str.trim())) : "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String e(java.io.File r4) throws java.lang.Throwable {
        /*
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            java.lang.StringBuffer r4 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L36
            r4.<init>()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L36
        L13:
            java.lang.String r2 = r1.readLine()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            if (r2 == 0) goto L32
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            r3.<init>()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            r3.append(r2)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            java.lang.String r2 = "\n"
            r3.append(r2)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            r4.append(r2)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            goto L13
        L2e:
            r4 = move-exception
            goto L53
        L30:
            r2 = move-exception
            goto L40
        L32:
            r1.close()     // Catch: java.io.IOException -> L48
            goto L48
        L36:
            r4 = move-exception
            r2 = r4
            r4 = r0
            goto L40
        L3a:
            r4 = move-exception
            goto L52
        L3c:
            r4 = move-exception
            r2 = r4
            r4 = r0
            r1 = r4
        L40:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L48
            r1.close()     // Catch: java.io.IOException -> L48
        L48:
            if (r4 == 0) goto L4f
            java.lang.String r4 = r4.toString()
            return r4
        L4f:
            return r0
        L50:
            r4 = move-exception
            r0 = r1
        L52:
            r1 = r0
        L53:
            if (r1 == 0) goto L58
            r1.close()     // Catch: java.io.IOException -> L58
        L58:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.n0.e(java.io.File):java.lang.String");
    }

    public static void f(String str) {
        try {
            ArrayList<File> arrayListB = b(new File(str));
            Collections.sort(arrayListB, new d());
            int size = (arrayListB.size() - 1) / 2;
            for (int i10 = 0; i10 < size; i10++) {
                File file = arrayListB.get(i10);
                if (file.exists() && file.isFile()) {
                    file.delete();
                }
            }
        } catch (Exception unused) {
            p0.b("SameFileTool", "del memory failed");
        }
    }

    public static void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.m().b());
            if (gVarD == null) {
                gVarD = com.mbridge.msdk.setting.h.b().a();
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - (gVarD.e() * 1000);
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        if (file2.lastModified() + jCurrentTimeMillis < jCurrentTimeMillis2) {
                            a(file2);
                            try {
                                File file3 = new File(str + ".zip");
                                if (file3.exists() && file3.isFile()) {
                                    a(file3);
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }

    private static long c(File file) throws Exception {
        FileInputStream fileInputStream;
        long jAvailable = 0;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                try {
                    if (file.exists()) {
                        fileInputStream = new FileInputStream(file);
                        try {
                            jAvailable = fileInputStream.available();
                            fileInputStream2 = fileInputStream;
                        } catch (Exception e10) {
                            e = e10;
                            fileInputStream2 = fileInputStream;
                            e.printStackTrace();
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            return 0L;
                        } catch (Throwable th2) {
                            th = th2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } else {
                        file.createNewFile();
                        p0.b("获取文件大小", "文件不存在!");
                    }
                    if (fileInputStream2 == null) {
                        return jAvailable;
                    }
                    fileInputStream2.close();
                    return jAvailable;
                } catch (Exception e12) {
                    e12.printStackTrace();
                    return 0L;
                }
            } catch (Exception e13) {
                e = e13;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    private static long d(File file) throws Exception {
        long jC;
        File[] fileArrListFiles = file.listFiles();
        long j10 = 0;
        if (fileArrListFiles != null) {
            for (int i10 = 0; i10 < fileArrListFiles.length; i10++) {
                if (fileArrListFiles[i10].isDirectory()) {
                    jC = d(fileArrListFiles[i10]);
                } else {
                    jC = c(fileArrListFiles[i10]);
                }
                j10 += jC;
            }
        }
        return j10;
    }

    public static void b() {
        new Thread(new b()).start();
    }

    public static void b(String str) {
        try {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                for (File file2 : c(str)) {
                    if (file2.exists() && file2.isFile()) {
                        file2.delete();
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static boolean e(String str) {
        if (com.mbridge.msdk.foundation.same.image.e.a(str)) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.isFile();
    }

    private static ArrayList<File> b(File file) {
        ArrayList<File> arrayList = new ArrayList<>();
        for (File file2 : file.listFiles(new c())) {
            if (!file2.isDirectory()) {
                arrayList.add(file2);
            } else {
                arrayList.addAll(b(file2));
            }
        }
        return arrayList;
    }

    public static void a() {
        a aVar = new a();
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
        } else {
            aVar.run();
        }
    }

    public static void a(long j10) {
        try {
            Iterator<File> it = b(new File(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_RES_MANAGER_DIR))).iterator();
            while (it.hasNext()) {
                File next = it.next();
                if (next.lastModified() < j10 && next.exists() && next.isFile()) {
                    next.delete();
                }
            }
        } catch (Throwable th2) {
            p0.b("SameFileTool", th2.getMessage(), th2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0128, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x012c, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x012d, code lost:
    
        com.mbridge.msdk.foundation.tools.p0.b("SameFileTool", "unzip error", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x010e, code lost:
    
        if (r12 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0110, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0114, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0115, code lost:
    
        com.mbridge.msdk.foundation.tools.p0.b("SameFileTool", "unzip error", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0123, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0126, code lost:
    
        if (r12 == null) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0149 A[Catch: all -> 0x014d, TryCatch #6 {all -> 0x014d, blocks: (B:115:0x0145, B:117:0x0149, B:120:0x0152), top: B:157:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0170 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0162 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x017a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0158 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.io.FileOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(java.lang.String r12, java.lang.String r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.n0.b(java.lang.String, java.lang.String):java.lang.String");
    }

    public static String a(File file) {
        try {
            if (file.isFile()) {
                file.delete();
                return "";
            }
            if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                    for (File file2 : fileArrListFiles) {
                        a(file2);
                    }
                    file.delete();
                    return "";
                }
                file.delete();
            }
            return "";
        } catch (Exception e10) {
            return e10.getMessage();
        }
    }

    public static List<String> a(String str, String str2) throws Throwable {
        ArrayList arrayList = new ArrayList();
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                File file = new File(str + File.separator + "template_config.json");
                if (file.isFile() && file.exists()) {
                    String strE = e(file);
                    if (!TextUtils.isEmpty(strE)) {
                        try {
                            JSONArray jSONArray = new JSONArray(strE);
                            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                                if (jSONObject != null && str2.equals(jSONObject.optString("xml_type"))) {
                                    arrayList.add(str + File.separator + jSONObject.optString(TJzY.sIwO));
                                    if (jSONObject.has("ext_template")) {
                                        jSONObject.put("folder_dir", str);
                                        arrayList.add(jSONObject.toString());
                                    }
                                }
                            }
                        } catch (JSONException e10) {
                            p0.b("SameFileTool", e10.getMessage());
                        }
                    }
                } else {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (Exception e11) {
            p0.b("SameFileTool", e11.getMessage());
            return arrayList;
        }
    }

    public static boolean a(byte[] bArr, File file) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                if (file.getParentFile() != null && !file.exists()) {
                    file.getParentFile().mkdirs();
                }
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            fileOutputStream.write(bArr);
            try {
                fileOutputStream.close();
                return true;
            } catch (IOException e11) {
                e11.printStackTrace();
                return true;
            }
        } catch (Exception e12) {
            e = e12;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            if (fileOutputStream2 == null) {
                return false;
            }
            try {
                fileOutputStream2.close();
                return false;
            } catch (IOException e13) {
                e13.printStackTrace();
                return false;
            }
        } catch (Throwable th3) {
            th = th3;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e14) {
                    e14.printStackTrace();
                }
            }
            throw th;
        }
    }
}
