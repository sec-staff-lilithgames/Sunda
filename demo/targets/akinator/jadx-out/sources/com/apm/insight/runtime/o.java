package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.device.ads.DTBAdRequest;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private static o f13335a;

    /* renamed from: b, reason: collision with root package name */
    private File f13336b;

    /* renamed from: c, reason: collision with root package name */
    private File f13337c;

    /* renamed from: d, reason: collision with root package name */
    private File f13338d;

    /* renamed from: e, reason: collision with root package name */
    private Context f13339e;

    /* renamed from: f, reason: collision with root package name */
    private a f13340f = null;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private long f13343a;

        /* renamed from: b, reason: collision with root package name */
        private long f13344b;

        /* renamed from: c, reason: collision with root package name */
        private File f13345c;

        /* renamed from: d, reason: collision with root package name */
        private JSONObject f13346d;

        public /* synthetic */ a(File file, byte b10) {
            this(file);
        }

        public static /* synthetic */ void d(a aVar) {
            aVar.f13345c.delete();
        }

        private a(File file) throws NumberFormatException {
            this.f13346d = null;
            this.f13345c = file;
            String[] strArrSplit = file.getName().split("-|\\.");
            if (strArrSplit.length >= 2) {
                this.f13343a = Long.parseLong(strArrSplit[0]);
                this.f13344b = Long.parseLong(strArrSplit[1]);
                return;
            }
            String name = file.getName();
            if (TextUtils.isEmpty(name) || name.length() < 13) {
                return;
            }
            String strSubstring = name.substring(0, 13);
            if (TextUtils.isDigitsOnly(strSubstring)) {
                long j10 = Long.parseLong(strSubstring);
                this.f13343a = j10;
                this.f13344b = j10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public JSONObject a() {
            if (this.f13346d == null) {
                try {
                    this.f13346d = new JSONObject(com.apm.insight.l.f.a(this.f13345c.getAbsolutePath(), "\n"));
                } catch (Throwable unused) {
                }
                if (this.f13346d == null) {
                    this.f13346d = new JSONObject();
                }
            }
            return this.f13346d;
        }

        public static /* synthetic */ boolean a(a aVar, long j10) {
            long j11 = aVar.f13343a;
            if (j11 > j10 && j11 - j10 > DTBAdRequest.WEEK) {
                return true;
            }
            long j12 = aVar.f13344b;
            if (j12 >= j10 || j10 - j12 <= DTBAdRequest.WEEK) {
                return aVar.f13345c.lastModified() < j10 && j10 - aVar.f13345c.lastModified() > DTBAdRequest.WEEK;
            }
            return true;
        }
    }

    private o(Context context) {
        File fileC = com.apm.insight.l.j.c(context);
        if (!fileC.exists() || (!fileC.isDirectory() && fileC.delete())) {
            fileC.mkdirs();
            com.apm.insight.runtime.a.b.a();
        }
        this.f13336b = fileC;
        this.f13337c = new File(fileC, "did");
        this.f13338d = new File(fileC, "device_uuid");
        this.f13339e = context;
    }

    public static o a() {
        if (f13335a == null) {
            f13335a = new o(com.apm.insight.e.g());
        }
        return f13335a;
    }

    public final String b() {
        try {
            return com.apm.insight.l.f.a(this.f13337c.getAbsolutePath(), "\n");
        } catch (Throwable unused) {
            return "0";
        }
    }

    public final String c() {
        try {
            return com.apm.insight.l.f.a(this.f13338d.getAbsolutePath(), "\n");
        } catch (Throwable unused) {
            return null;
        }
    }

    private ArrayList<a> c(final String str) {
        File[] fileArrListFiles = this.f13336b.listFiles(new FilenameFilter() { // from class: com.apm.insight.runtime.o.1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.endsWith(str) && Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str2).matches();
            }
        });
        ArrayList<a> arrayList = new ArrayList<>();
        if (fileArrListFiles != null) {
            com.apm.insight.a.a((Object) ("foundRuntimeContextFiles " + fileArrListFiles.length));
            byte b10 = 0;
            a aVar = null;
            for (File file : fileArrListFiles) {
                try {
                    a aVar2 = new a(file, b10);
                    arrayList.add(aVar2);
                    if (this.f13340f == null && ".ctx".equals(str) && (aVar == null || aVar2.f13344b >= aVar.f13344b)) {
                        aVar = aVar2;
                    }
                } catch (Throwable th2) {
                    com.apm.insight.c.a();
                    j.a(th2, "NPTH_CATCH");
                }
            }
            if (this.f13340f == null && aVar != null) {
                this.f13340f = aVar;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.Map<java.lang.String, java.lang.Object> r9, org.json.JSONArray r10) {
        /*
            r8 = this;
            android.content.Context r0 = r8.f13339e
            com.apm.insight.entity.Header r0 = com.apm.insight.entity.Header.a(r0)
            org.json.JSONObject r6 = r0.a(r9)
            boolean r9 = com.apm.insight.entity.Header.c(r6)
            if (r9 == 0) goto L13
            r1 = r8
            goto L9e
        L13:
            long r2 = java.lang.System.currentTimeMillis()
            com.apm.insight.runtime.o$a r9 = r8.f13340f
            if (r9 != 0) goto L20
            java.lang.String r9 = ".ctx"
            r8.c(r9)
        L20:
            com.apm.insight.runtime.o$a r9 = r8.f13340f
            if (r9 != 0) goto L2b
            r4 = r2
            r1 = r8
            r7 = r10
            r1.a(r2, r4, r6, r7)
            return
        L2b:
            r7 = r10
            org.json.JSONObject r10 = com.apm.insight.runtime.o.a.a(r9)
            boolean r0 = com.apm.insight.entity.Header.c(r10)
            if (r0 != 0) goto L6e
            boolean r0 = com.apm.insight.entity.Header.c(r6)
            if (r0 == 0) goto L3e
            r1 = r8
            goto L73
        L3e:
            java.lang.String r0 = "update_version_code"
            java.lang.Object r1 = r6.opt(r0)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.Object r0 = r10.opt(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6e
            boolean r10 = com.apm.insight.entity.Header.d(r10)
            if (r10 == 0) goto L6e
            r4 = r2
            long r2 = com.apm.insight.runtime.o.a.b(r9)
            r1 = r8
            r1.a(r2, r4, r6, r7)
            r2 = r4
            java.io.File r9 = com.apm.insight.runtime.o.a.c(r9)
            com.apm.insight.l.f.a(r9)
            goto L73
        L6e:
            r4 = r2
            r1 = r8
            r1.a(r2, r4, r6, r7)
        L73:
            java.lang.String r9 = ""
            java.util.ArrayList r9 = r8.c(r9)     // Catch: java.lang.Throwable -> L9b
            int r10 = r9.size()     // Catch: java.lang.Throwable -> L9b
            r0 = 6
            if (r10 > r0) goto L81
            goto L9e
        L81:
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L9b
        L85:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> L9b
            if (r10 == 0) goto L9e
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> L9b
            com.apm.insight.runtime.o$a r10 = (com.apm.insight.runtime.o.a) r10     // Catch: java.lang.Throwable -> L9b
            boolean r0 = com.apm.insight.runtime.o.a.a(r10, r2)     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L85
            com.apm.insight.runtime.o.a.d(r10)     // Catch: java.lang.Throwable -> L9b
            goto L85
        L9b:
            r0 = move-exception
            r9 = r0
            goto L9f
        L9e:
            return
        L9f:
            com.apm.insight.c.a()
            java.lang.String r10 = "NPTH_CATCH"
            com.apm.insight.runtime.j.a(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.runtime.o.a(java.util.Map, org.json.JSONArray):void");
    }

    public final void b(String str) {
        try {
            com.apm.insight.l.f.a(this.f13338d, str, false);
        } catch (Throwable unused) {
        }
    }

    public final JSONArray b(long j10) {
        File file;
        String strA;
        Iterator<a> it = c(".allData").iterator();
        while (true) {
            if (!it.hasNext()) {
                file = null;
                break;
            }
            a next = it.next();
            if (j10 >= next.f13343a && j10 <= next.f13344b) {
                file = next.f13345c;
                break;
            }
        }
        if (file == null) {
            Iterator<a> it2 = c(".allData").iterator();
            a aVar = null;
            while (it2.hasNext()) {
                a next2 = it2.next();
                if (aVar == null || Math.abs(aVar.f13344b - j10) > Math.abs(next2.f13344b - j10)) {
                    aVar = next2;
                }
            }
            file = aVar == null ? null : aVar.f13345c;
        }
        if (file != null) {
            try {
                strA = com.apm.insight.l.f.a(file.getAbsolutePath(), "\n");
                try {
                    return new JSONArray(strA);
                } catch (Throwable th2) {
                    th = th2;
                    com.apm.insight.c.a();
                    j.a(new IOException("content :".concat(String.valueOf(strA)), th), "NPTH_CATCH");
                    return null;
                }
            } catch (Throwable th3) {
                th = th3;
                strA = null;
            }
        }
        return null;
    }

    private void a(long j10, long j11, JSONObject jSONObject, JSONArray jSONArray) {
        File file = new File(this.f13336b, j10 + "-" + j11 + ".ctx");
        File file2 = new File(this.f13336b, j10 + "-" + j11 + ".allData");
        try {
            com.apm.insight.l.f.a(file, jSONObject);
            com.apm.insight.l.f.a(file2, jSONArray);
            this.f13340f = new a(file, (byte) 0);
        } catch (IOException e10) {
            com.apm.insight.c.a();
            j.a(e10, "NPTH_CATCH");
        }
    }

    public final void a(String str) {
        try {
            com.apm.insight.l.f.a(this.f13337c, str, false);
        } catch (Throwable unused) {
        }
    }

    public final JSONObject a(long j10) {
        JSONObject jSONObject;
        File file;
        boolean z10;
        String strA;
        Iterator<a> it = c(".ctx").iterator();
        while (true) {
            jSONObject = null;
            if (!it.hasNext()) {
                file = null;
                break;
            }
            a next = it.next();
            if (j10 >= next.f13343a && j10 <= next.f13344b) {
                file = next.f13345c;
                break;
            }
        }
        if (file == null) {
            Iterator<a> it2 = c(".ctx").iterator();
            a aVar = null;
            while (it2.hasNext()) {
                a next2 = it2.next();
                if (aVar == null || Math.abs(aVar.f13344b - j10) > Math.abs(next2.f13344b - j10)) {
                    aVar = next2;
                }
            }
            file = aVar == null ? null : aVar.f13345c;
            z10 = true;
        } else {
            z10 = false;
        }
        if (file != null) {
            try {
                strA = com.apm.insight.l.f.a(file.getAbsolutePath(), "\n");
                try {
                    jSONObject = new JSONObject(strA);
                } catch (Throwable th2) {
                    th = th2;
                    com.apm.insight.c.a();
                    j.a(new IOException("content :".concat(String.valueOf(strA)), th), "NPTH_CATCH");
                    if (jSONObject != null) {
                        try {
                            jSONObject.put("unauthentic_version", 1);
                        } catch (JSONException e10) {
                            com.apm.insight.c.a();
                            j.a(e10, "NPTH_CATCH");
                        }
                    }
                    return jSONObject;
                }
            } catch (Throwable th3) {
                th = th3;
                strA = null;
            }
        }
        if (jSONObject != null && z10) {
            jSONObject.put("unauthentic_version", 1);
        }
        return jSONObject;
    }
}
