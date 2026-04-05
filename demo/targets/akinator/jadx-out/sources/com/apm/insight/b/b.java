package com.apm.insight.b;

import android.content.Context;
import android.os.SystemClock;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.Npth;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.l;
import com.apm.insight.runtime.n;
import j1.o2;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: z, reason: collision with root package name */
    private static volatile boolean f12828z = true;

    /* renamed from: a, reason: collision with root package name */
    private c f12829a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f12830b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f12831c;

    /* renamed from: g, reason: collision with root package name */
    private JSONObject f12835g;

    /* renamed from: h, reason: collision with root package name */
    private JSONObject f12836h;

    /* renamed from: m, reason: collision with root package name */
    private JSONArray f12841m;

    /* renamed from: n, reason: collision with root package name */
    private JSONObject f12842n;

    /* renamed from: q, reason: collision with root package name */
    private JSONArray f12845q;

    /* renamed from: r, reason: collision with root package name */
    private JSONArray f12846r;

    /* renamed from: s, reason: collision with root package name */
    private JSONObject f12847s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f12848t;

    /* renamed from: v, reason: collision with root package name */
    private volatile boolean f12850v;

    /* renamed from: d, reason: collision with root package name */
    private long f12832d = -1;

    /* renamed from: e, reason: collision with root package name */
    private File f12833e = null;

    /* renamed from: f, reason: collision with root package name */
    private boolean f12834f = true;

    /* renamed from: i, reason: collision with root package name */
    private String f12837i = "unknown";

    /* renamed from: j, reason: collision with root package name */
    private String f12838j = "unknown";

    /* renamed from: k, reason: collision with root package name */
    private String f12839k = "unknown";

    /* renamed from: l, reason: collision with root package name */
    private String f12840l = "npth_inner_default";

    /* renamed from: o, reason: collision with root package name */
    private int f12843o = 0;

    /* renamed from: p, reason: collision with root package name */
    private long f12844p = -1;

    /* renamed from: u, reason: collision with root package name */
    private final Object f12849u = new Object();

    /* renamed from: w, reason: collision with root package name */
    private long f12851w = -1;

    /* renamed from: x, reason: collision with root package name */
    private long f12852x = 0;

    /* renamed from: y, reason: collision with root package name */
    private final Runnable f12853y = new Runnable() { // from class: com.apm.insight.b.b.1
        @Override // java.lang.Runnable
        public final void run() {
            try {
                b.this.g();
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
            }
        }
    };
    private int A = 0;
    private List<Pattern> B = null;
    private Pattern C = null;
    private File D = null;

    public b(Context context) {
        this.f12830b = context;
    }

    private static boolean h() {
        boolean zA = com.apm.insight.l.a.a();
        boolean z10 = !zA;
        if (zA || com.apm.insight.runtime.a.b.d().e() > 2000) {
            return z10;
        }
        return false;
    }

    private File i() {
        if (this.D == null) {
            this.D = new File(this.f12830b.getFilesDir(), "has_anr_signal_" + com.apm.insight.l.a.b().replaceAll(":", "_"));
        }
        return this.D;
    }

    public final void b() {
        if (this.f12831c) {
            this.f12831c = false;
            c cVar = this.f12829a;
            if (cVar != null) {
                cVar.b();
            }
            this.f12829a = null;
        }
    }

    public final void c() {
        c cVar = this.f12829a;
        if (cVar != null) {
            cVar.a();
        }
    }

    public final void d() {
        synchronized (this.f12849u) {
        }
        this.f12853y.run();
    }

    public final void e() {
        if (NativeImpl.h()) {
            try {
                com.apm.insight.l.f.a(i(), String.valueOf(this.A + 1), false);
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
            }
        }
        this.f12851w = SystemClock.uptimeMillis();
        this.f12850v = true;
    }

    public final void f() {
        File fileI = i();
        try {
            int iIntValue = Integer.decode(com.apm.insight.l.f.a(fileI.getAbsolutePath(), "\n")).intValue();
            this.A = iIntValue;
            if (iIntValue >= 2) {
                NativeImpl.a(false);
            } else {
                NativeImpl.a(true);
            }
        } catch (IOException unused) {
            NativeImpl.a(true);
        } catch (Throwable unused2) {
            com.apm.insight.l.f.a(fileI);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x03d8 A[Catch: all -> 0x03df, TRY_LEAVE, TryCatch #9 {all -> 0x03df, blocks: (B:118:0x03ca, B:120:0x03d8), top: B:154:0x03ca }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0406 A[Catch: all -> 0x0411, TRY_LEAVE, TryCatch #1 {all -> 0x0411, blocks: (B:121:0x03df, B:123:0x0406), top: B:138:0x03df }] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g() {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.b.b.g():boolean");
    }

    public final void a() {
        if (this.f12831c) {
            return;
        }
        this.f12829a = new c(this);
        this.f12832d = com.apm.insight.e.j();
        this.f12831c = true;
    }

    private JSONObject c(JSONArray jSONArray) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArrayB = com.apm.insight.a.b(jSONArray);
        if (jSONArrayB.length() != jSONArray.length()) {
            this.f12843o++;
        }
        try {
            jSONObject.put("thread_number", 1);
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < jSONArrayB.length(); i10++) {
                sb2.append(jSONArrayB.getString(i10));
                sb2.append('\n');
            }
            jSONObject.put("mainStackFromTrace", sb2.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private boolean a(long j10) {
        if (this.f12850v) {
            this.f12850v = false;
            b(j10);
        }
        return false;
    }

    private void b(long j10) {
        if (this.f12852x != this.f12851w) {
            try {
                this.f12844p = System.currentTimeMillis();
                if (com.apm.insight.e.x()) {
                    this.f12846r = f.b().b();
                    this.f12845q = j.a(j10);
                    this.f12836h = f.b().a(j10).a();
                }
                JSONObject jSONObject = new JSONObject();
                this.f12847s = jSONObject;
                com.apm.insight.l.a.a(this.f12830b, jSONObject);
                this.f12848t = h();
                this.f12834f = !Npth.hasCrash();
            } catch (Throwable unused) {
            }
            try {
                this.f12832d = this.f12844p;
                String strB = com.apm.insight.l.j.b();
                File file = new File(new File(com.apm.insight.l.j.f(this.f12830b), strB), "trace_" + com.apm.insight.l.a.b().replace(AbstractJsonLexerKt.COLON, '_') + ".txt");
                file.getParentFile().mkdirs();
                com.apm.insight.l.f.a(file, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + "\n", false);
                n.a("anr_trace", strB);
                NativeImpl.i(file.getAbsolutePath());
                try {
                    JSONArray jSONArrayA = com.apm.insight.l.f.a(file.getAbsolutePath());
                    this.f12841m = jSONArrayA;
                    a(jSONArrayA);
                } catch (IOException unused2) {
                } catch (Throwable th2) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
                }
                if (this.f12835g == null) {
                    this.f12835g = d.a();
                }
            } catch (Throwable th3) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th3, "NPTH_CATCH");
            }
            com.apm.insight.a.d();
        } else {
            try {
                this.f12832d = this.f12844p;
                String strB2 = com.apm.insight.l.j.b();
                File file2 = new File(new File(com.apm.insight.l.j.f(this.f12830b), strB2), "trace" + com.apm.insight.l.a.b().replace(AbstractJsonLexerKt.COLON, '_') + ".txt");
                file2.getParentFile().mkdirs();
                com.apm.insight.l.f.a(file2, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + "\n", false);
                n.a("anr_trace", strB2);
                NativeImpl.i(file2.getAbsolutePath());
                try {
                    JSONArray jSONArrayA2 = com.apm.insight.l.f.a(file2.getAbsolutePath());
                    this.f12841m = jSONArrayA2;
                    a(jSONArrayA2);
                } catch (IOException unused3) {
                } catch (Throwable th4) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th4, "NPTH_CATCH");
                }
                if (this.f12835g == null) {
                    this.f12835g = d.a();
                }
            } catch (Throwable th5) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th5, "NPTH_CATCH");
            }
        }
        long j11 = this.f12851w;
        this.f12852x = j11;
        this.f12851w = -1L;
        if (j11 == -1) {
            this.f12852x = (-1) - 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(org.json.JSONArray r18) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.b.b.a(org.json.JSONArray):void");
    }

    private int[] b(JSONArray jSONArray) throws IllegalArgumentException {
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String strOptString = jSONArray.optString(i10);
            int iIndexOf = (strOptString == null || strOptString.isEmpty()) ? -1 : strOptString.indexOf("utm=");
            if (iIndexOf > 0) {
                if (this.C == null) {
                    this.C = Pattern.compile("[^0-9]+");
                }
                String[] strArrSplit = this.C.split(strOptString.substring(iIndexOf));
                if (strArrSplit == null || strArrSplit.length < 2) {
                    return null;
                }
                int iIntValue = Integer.decode(strArrSplit[1]).intValue();
                int iIntValue2 = Integer.decode(strArrSplit[2]).intValue();
                return new int[]{iIntValue, iIntValue2, iIntValue + iIntValue2};
            }
        }
        return null;
    }

    private static String b(float f10) {
        return a(f10 / 100.0f);
    }

    private static void b(String str, JSONArray jSONArray) {
        for (ICrashCallback iCrashCallback : l.a().e()) {
            try {
                if (iCrashCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iCrashCallback).a(CrashType.ANR, str, (Thread) null, jSONArray);
                } else {
                    iCrashCallback.onCrash(CrashType.ANR, str, null);
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
            }
        }
    }

    private boolean a(String str) {
        if (this.B == null) {
            JSONArray jSONArrayB = com.apm.insight.runtime.a.b();
            if (jSONArrayB != null) {
                this.B = new LinkedList();
                this.f12840l = jSONArrayB.optString(0);
                for (int i10 = 1; i10 < jSONArrayB.length(); i10++) {
                    try {
                        this.B.add(Pattern.compile(jSONArrayB.optString(i10)));
                    } catch (Throwable unused) {
                    }
                }
            }
            if (this.B == null) {
                LinkedList linkedList = new LinkedList();
                this.B = linkedList;
                linkedList.add(Pattern.compile("^main$"));
                this.B.add(Pattern.compile("^default_npth_thread$"));
                this.B.add(Pattern.compile("^RenderThread$"));
                this.B.add(Pattern.compile("^Jit thread pool worker thread.*$"));
            }
        }
        Iterator<Pattern> it = this.B.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    private JSONObject a(String str, JSONArray jSONArray) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArrayB = com.apm.insight.a.b(jSONArray);
        if (jSONArrayB.length() != jSONArray.length()) {
            this.f12843o++;
        }
        try {
            jSONObject.put("thread_name", str);
            jSONObject.put("thread_stack", jSONArrayB);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f1, code lost:
    
        r10 = r24 + 3;
        r24 = r12;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fb, code lost:
    
        r12 = "softirq";
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fd, code lost:
    
        if (r8 != 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ff, code lost:
    
        r28 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0202, code lost:
    
        if (r8 != 1) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0205, code lost:
    
        if (r8 != 2) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0208, code lost:
    
        if (r8 != 3) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x020b, code lost:
    
        if (r8 != 4) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x020d, code lost:
    
        r29 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0210, code lost:
    
        if (r8 != 5) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0214, code lost:
    
        r29 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0217, code lost:
    
        r29 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x021a, code lost:
    
        r29 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x021d, code lost:
    
        r29 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0220, code lost:
    
        r28 = r4;
        r29 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x022c, code lost:
    
        if ("user".equalsIgnoreCase(r28[r10]) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x022e, code lost:
    
        r12 = "user";
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0239, code lost:
    
        if ("kernel".equalsIgnoreCase(r28[r10]) != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x023b, code lost:
    
        r12 = "kernel";
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0246, code lost:
    
        if ("iowait".equalsIgnoreCase(r28[r10]) == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0248, code lost:
    
        r12 = "iowait";
        r8 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0253, code lost:
    
        if ("irq".equalsIgnoreCase(r28[r10]) == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0255, code lost:
    
        r12 = "irq";
        r8 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x025e, code lost:
    
        if ("softirq".equalsIgnoreCase(r28[r10]) == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0260, code lost:
    
        r8 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0268, code lost:
    
        if ("softirq".equalsIgnoreCase(r28[r10]) != false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x026a, code lost:
    
        r8 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x026c, code lost:
    
        r8 = r29;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x026f, code lost:
    
        if (r12 != null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0273, code lost:
    
        r4 = java.lang.Float.valueOf(r28[r10 - 1].replace(r3, "")).floatValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0281, code lost:
    
        r27 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0283, code lost:
    
        r3 = r7 + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0292, code lost:
    
        if (r0 == r5) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0295, code lost:
    
        r4 = r4 / com.apm.insight.l.d.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x029e, code lost:
    
        r0.put(r3, java.lang.Float.valueOf(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02a7, code lost:
    
        r27 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02a9, code lost:
    
        r0.put(r7 + r12, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02bc, code lost:
    
        r27 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02bf, code lost:
    
        if (r8 >= 6) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02c1, code lost:
    
        r10 = r10 + 3;
        r3 = r27;
        r4 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01aa, code lost:
    
        r10 = java.lang.Float.valueOf(r4[r8].replace("%", "")).floatValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b8, code lost:
    
        r24 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ba, code lost:
    
        r8 = r7 + com.ironsource.C3191e4.h.f36493l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c9, code lost:
    
        if (r0 != r5) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01cc, code lost:
    
        r10 = r10 / com.apm.insight.l.d.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d5, code lost:
    
        r0.put(r8, java.lang.Float.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01dd, code lost:
    
        r24 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01df, code lost:
    
        r0.put(r7 + com.ironsource.C3191e4.h.f36493l, r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x024b A[PHI: r28 r29
      0x024b: PHI (r28v3 java.lang.String[]) = (r28v2 java.lang.String[]), (r28v8 java.lang.String[]) binds: [B:127:0x0246, B:117:0x0217] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r29v3 char) = (r29v2 char), (r29v10 char) binds: [B:127:0x0246, B:117:0x0217] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0258 A[PHI: r28 r29
      0x0258: PHI (r28v4 java.lang.String[]) = (r28v3 java.lang.String[]), (r28v8 java.lang.String[]) binds: [B:130:0x0253, B:116:0x0214] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r29v4 char) = (r29v3 char), (r29v11 char) binds: [B:130:0x0253, B:116:0x0214] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0262 A[PHI: r28 r29
      0x0262: PHI (r28v7 java.lang.String[]) = (r28v4 java.lang.String[]), (r28v8 java.lang.String[]) binds: [B:133:0x025e, B:114:0x0210] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r29v7 char) = (r29v4 char), (r29v12 char) binds: [B:133:0x025e, B:114:0x0210] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02c1 A[LOOP:2: B:101:0x01f8->B:153:0x02c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03e1 A[EDGE_INSN: B:233:0x03e1->B:204:0x03e1 BREAK  A[LOOP:0: B:3:0x0047->B:206:0x03f5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02c9 A[EDGE_INSN: B:237:0x02c9->B:154:0x02c9 BREAK  A[LOOP:2: B:101:0x01f8->B:153:0x02c1], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.lang.String r31, org.json.JSONObject r32) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.b.b.a(java.lang.String, org.json.JSONObject):void");
    }

    private static void a(HashMap<String, Float> map, JSONObject jSONObject, String str) throws JSONException {
        String strConcat = "npth_anr_".concat(String.valueOf(str));
        if (map.isEmpty()) {
            jSONObject.put(strConcat + "_total", "not found");
            return;
        }
        float fFloatValue = 0.0f;
        float fFloatValue2 = 0.0f;
        float fFloatValue3 = 0.0f;
        float fFloatValue4 = 0.0f;
        float fFloatValue5 = 0.0f;
        for (Map.Entry<String, Float> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key.endsWith("user")) {
                fFloatValue += entry.getValue().floatValue();
            } else if (key.endsWith("kernel")) {
                fFloatValue2 += entry.getValue().floatValue();
            } else if (key.endsWith("iowait")) {
                fFloatValue3 += entry.getValue().floatValue();
            } else if (key.endsWith("irq")) {
                fFloatValue4 += entry.getValue().floatValue();
            } else if (key.endsWith("softirq")) {
                fFloatValue5 = entry.getValue().floatValue() + fFloatValue5;
            }
        }
        float f10 = fFloatValue + fFloatValue2 + fFloatValue3 + fFloatValue4 + fFloatValue5;
        jSONObject.put(o2.l(strConcat, "_total"), b(f10));
        jSONObject.put(strConcat + "_kernel_user_ratio", a(fFloatValue2, f10));
        jSONObject.put(strConcat + "_iowait_user_ratio", a(fFloatValue3, f10));
    }

    private static String a(float f10, float f11) {
        if (f11 > 0.0f) {
            return a(f10 / f11);
        }
        return f10 > 0.0f ? "100%" : "0%";
    }

    private static String a(float f10) {
        if (f10 <= 0.0f) {
            return "0%";
        }
        if (f10 <= 0.1f) {
            return "0% - 10%";
        }
        if (f10 <= 0.3f) {
            return "10% - 30%";
        }
        if (f10 <= 0.6f) {
            return "30% - 60%";
        }
        if (f10 <= 0.9f) {
            return "60% - 90%";
        }
        return "90% - 100%";
    }
}
