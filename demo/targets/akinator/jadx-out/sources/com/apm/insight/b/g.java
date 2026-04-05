package com.apm.insight.b;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.apm.insight.runtime.p;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: r, reason: collision with root package name */
    private static int f12875r = 2;

    /* renamed from: a, reason: collision with root package name */
    private c f12876a;

    /* renamed from: b, reason: collision with root package name */
    private int f12877b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f12878c;

    /* renamed from: d, reason: collision with root package name */
    private int f12879d;

    /* renamed from: e, reason: collision with root package name */
    private int f12880e;

    /* renamed from: f, reason: collision with root package name */
    private f f12881f;

    /* renamed from: g, reason: collision with root package name */
    private long f12882g;

    /* renamed from: h, reason: collision with root package name */
    private long f12883h;

    /* renamed from: i, reason: collision with root package name */
    private int f12884i;

    /* renamed from: j, reason: collision with root package name */
    private long f12885j;

    /* renamed from: k, reason: collision with root package name */
    private String f12886k;

    /* renamed from: l, reason: collision with root package name */
    private String f12887l;

    /* renamed from: m, reason: collision with root package name */
    private com.apm.insight.b.e f12888m;

    /* renamed from: n, reason: collision with root package name */
    private volatile boolean f12889n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f12890o;

    /* renamed from: p, reason: collision with root package name */
    private final p f12891p;

    /* renamed from: q, reason: collision with root package name */
    private volatile boolean f12892q;

    /* renamed from: s, reason: collision with root package name */
    private Runnable f12893s;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        long f12902a;

        /* renamed from: b, reason: collision with root package name */
        long f12903b;

        /* renamed from: c, reason: collision with root package name */
        long f12904c;

        /* renamed from: d, reason: collision with root package name */
        boolean f12905d;

        /* renamed from: e, reason: collision with root package name */
        int f12906e;

        /* renamed from: f, reason: collision with root package name */
        StackTraceElement[] f12907f;

        private a() {
        }

        public /* synthetic */ a(byte b10) {
            this();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        a f12908a;

        /* renamed from: b, reason: collision with root package name */
        private int f12909b;

        public final void a(a aVar) {
            throw null;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface c {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public long f12910a;

        /* renamed from: b, reason: collision with root package name */
        long f12911b;

        /* renamed from: c, reason: collision with root package name */
        long f12912c;

        /* renamed from: d, reason: collision with root package name */
        int f12913d;

        /* renamed from: e, reason: collision with root package name */
        int f12914e;

        /* renamed from: f, reason: collision with root package name */
        long f12915f;

        /* renamed from: g, reason: collision with root package name */
        long f12916g;

        /* renamed from: h, reason: collision with root package name */
        String f12917h;

        /* renamed from: i, reason: collision with root package name */
        public String f12918i;

        /* renamed from: j, reason: collision with root package name */
        private String f12919j;

        /* renamed from: k, reason: collision with root package name */
        private d f12920k;

        public final JSONObject a() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, g.a(this.f12917h));
                jSONObject.put("cpuDuration", this.f12916g);
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, this.f12915f);
                jSONObject.put("type", this.f12913d);
                jSONObject.put("count", this.f12914e);
                jSONObject.put("messageCount", this.f12914e);
                jSONObject.put("lastDuration", this.f12911b - this.f12912c);
                jSONObject.put("start", this.f12910a);
                jSONObject.put(TtmlNode.END, this.f12911b);
                jSONObject.put("block_uuid", (Object) null);
                jSONObject.put("sblock_uuid", (Object) null);
                jSONObject.put("belong_frame", false);
                return jSONObject;
            } catch (JSONException e10) {
                e10.printStackTrace();
                return jSONObject;
            }
        }

        public final void b() {
            this.f12913d = -1;
            this.f12914e = -1;
            this.f12915f = -1L;
            this.f12917h = null;
            this.f12919j = null;
            this.f12920k = null;
            this.f12918i = null;
        }
    }

    public g() {
        this((byte) 0);
    }

    public static /* synthetic */ b c() {
        return null;
    }

    public static /* synthetic */ p e() {
        return null;
    }

    private g(byte b10) {
        this.f12877b = 0;
        this.f12878c = 0;
        this.f12879d = 100;
        this.f12880e = 200;
        this.f12882g = -1L;
        this.f12883h = -1L;
        this.f12884i = -1;
        this.f12885j = -1L;
        this.f12889n = false;
        this.f12890o = false;
        this.f12892q = false;
        this.f12893s = new Runnable() { // from class: com.apm.insight.b.g.2

            /* renamed from: b, reason: collision with root package name */
            private long f12896b;

            /* renamed from: a, reason: collision with root package name */
            private long f12895a = 0;

            /* renamed from: c, reason: collision with root package name */
            private int f12897c = -1;

            /* renamed from: d, reason: collision with root package name */
            private int f12898d = 0;

            /* renamed from: e, reason: collision with root package name */
            private int f12899e = 0;

            @Override // java.lang.Runnable
            public final void run() {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (g.c().f12908a != null) {
                    throw null;
                }
                a aVar = new a((byte) 0);
                if (this.f12897c == g.this.f12878c) {
                    this.f12898d++;
                } else {
                    this.f12898d = 0;
                    this.f12899e = 0;
                    this.f12896b = jUptimeMillis;
                }
                this.f12897c = g.this.f12878c;
                int i10 = this.f12898d;
                if (i10 > 0 && i10 - this.f12899e >= g.f12875r && this.f12895a != 0 && jUptimeMillis - this.f12896b > 700 && g.this.f12892q) {
                    aVar.f12907f = Looper.getMainLooper().getThread().getStackTrace();
                    this.f12899e = this.f12898d;
                }
                aVar.f12905d = g.this.f12892q;
                aVar.f12904c = (jUptimeMillis - this.f12895a) - 300;
                aVar.f12902a = jUptimeMillis;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                this.f12895a = jUptimeMillis2;
                aVar.f12903b = jUptimeMillis2 - jUptimeMillis;
                aVar.f12906e = g.this.f12878c;
                g.e().a(g.this.f12893s, 300L);
                g.c().a(aVar);
            }
        };
        this.f12876a = new c() { // from class: com.apm.insight.b.g.1
        };
        this.f12891p = null;
    }

    public static /* synthetic */ int d(g gVar) {
        int i10 = gVar.f12877b;
        gVar.f12877b = i10 + 1;
        return i10;
    }

    public final JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        try {
            int i10 = 0;
            for (e eVar : this.f12881f.a()) {
                if (eVar != null) {
                    i10++;
                    jSONArray.put(eVar.a().put("id", i10));
                }
            }
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    public final void a() {
        if (this.f12889n) {
            return;
        }
        this.f12889n = true;
        this.f12879d = 100;
        this.f12880e = 300;
        this.f12881f = new f(100);
        this.f12888m = new com.apm.insight.b.e() { // from class: com.apm.insight.b.g.3
            @Override // com.apm.insight.b.e
            public final boolean a() {
                return true;
            }

            @Override // com.apm.insight.b.e
            public final void b(String str) {
                super.b(str);
                g.d(g.this);
                g.a(g.this, false, com.apm.insight.b.e.f12869a);
                g gVar = g.this;
                gVar.f12886k = gVar.f12887l;
                g.this.f12887l = "no message running";
                g.this.f12892q = false;
            }

            @Override // com.apm.insight.b.e
            public final void a(String str) {
                g.this.f12892q = true;
                g.this.f12887l = str;
                super.a(str);
                g.a(g.this, true, com.apm.insight.b.e.f12869a);
            }
        };
        h.a();
        h.a(this.f12888m);
        j.a(j.a());
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        private int f12921a;

        /* renamed from: b, reason: collision with root package name */
        private int f12922b;

        /* renamed from: c, reason: collision with root package name */
        private e f12923c;

        /* renamed from: d, reason: collision with root package name */
        private List<e> f12924d = new ArrayList();

        public f(int i10) {
            this.f12921a = i10;
        }

        public final e a(int i10) {
            e eVar = this.f12923c;
            if (eVar != null) {
                eVar.f12913d = i10;
                this.f12923c = null;
                return eVar;
            }
            e eVar2 = new e();
            eVar2.f12913d = i10;
            return eVar2;
        }

        public final void a(e eVar) {
            int size = this.f12924d.size();
            int i10 = this.f12921a;
            if (size < i10) {
                this.f12924d.add(eVar);
                this.f12922b = this.f12924d.size();
                return;
            }
            int i11 = this.f12922b % i10;
            this.f12922b = i11;
            e eVar2 = this.f12924d.set(i11, eVar);
            eVar2.b();
            this.f12923c = eVar2;
            this.f12922b++;
        }

        public final List<e> a() {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            if (this.f12924d.size() == this.f12921a) {
                for (int i11 = this.f12922b; i11 < this.f12924d.size(); i11++) {
                    arrayList.add(this.f12924d.get(i11));
                }
                while (i10 < this.f12922b - 1) {
                    arrayList.add(this.f12924d.get(i10));
                    i10++;
                }
            } else {
                while (i10 < this.f12924d.size()) {
                    arrayList.add(this.f12924d.get(i10));
                    i10++;
                }
            }
            return arrayList;
        }
    }

    private void a(int i10, long j10, String str) {
        a(i10, j10, str, true);
    }

    private void a(int i10, long j10, String str, boolean z10) {
        this.f12890o = true;
        e eVarA = this.f12881f.a(i10);
        eVarA.f12915f = j10 - this.f12882g;
        if (z10) {
            long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            eVarA.f12916g = jCurrentThreadTimeMillis - this.f12885j;
            this.f12885j = jCurrentThreadTimeMillis;
        } else {
            eVarA.f12916g = -1L;
        }
        eVarA.f12914e = this.f12877b;
        eVarA.f12917h = str;
        eVarA.f12918i = this.f12886k;
        eVarA.f12910a = this.f12882g;
        eVarA.f12911b = j10;
        eVarA.f12912c = this.f12883h;
        this.f12881f.a(eVarA);
        this.f12877b = 0;
        this.f12882g = j10;
    }

    public final e a(long j10) {
        e eVar = new e();
        eVar.f12917h = this.f12887l;
        eVar.f12918i = this.f12886k;
        eVar.f12915f = j10 - this.f12883h;
        eVar.f12916g = 0 - this.f12885j;
        eVar.f12914e = this.f12877b;
        return eVar;
    }

    public static String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "unknown message";
        }
        try {
            String[] strArrSplit = str.split(":");
            String str3 = strArrSplit.length == 2 ? strArrSplit[1] : "";
            if (str.contains("{") && str.contains("}")) {
                str2 = str.split("\\{")[0];
                try {
                    str = str2 + str.split("\\}")[1];
                } catch (Throwable unused) {
                    return str2;
                }
            } else {
                str2 = str;
            }
            if (str.contains("@")) {
                String[] strArrSplit2 = str.split("@");
                if (strArrSplit2.length > 1) {
                    str = strArrSplit2[0];
                }
            }
            if (str.contains("(") && str.contains(")") && !str.endsWith(" null")) {
                String[] strArrSplit3 = str.split("\\(");
                if (strArrSplit3.length > 1) {
                    str = strArrSplit3[1];
                }
                str = str.replace(")", "");
            }
            if (str.startsWith(" ")) {
                str = str.replace(" ", "");
            }
            return str + str3;
        } catch (Throwable unused2) {
            return str;
        }
    }

    public static /* synthetic */ void a(g gVar, boolean z10, long j10) {
        int i10 = gVar.f12878c + 1;
        gVar.f12878c = i10;
        gVar.f12878c = i10 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        gVar.f12890o = false;
        if (gVar.f12882g < 0) {
            gVar.f12882g = j10;
        }
        if (gVar.f12883h < 0) {
            gVar.f12883h = j10;
        }
        if (gVar.f12884i < 0) {
            gVar.f12884i = Process.myTid();
            gVar.f12885j = SystemClock.currentThreadTimeMillis();
        }
        long j11 = j10 - gVar.f12882g;
        int i11 = gVar.f12880e;
        if (j11 > i11) {
            long j12 = gVar.f12883h;
            if (j10 - j12 <= i11) {
                gVar.a(9, j10, gVar.f12887l);
            } else if (z10) {
                if (gVar.f12877b == 0) {
                    gVar.a(1, j10, "no message running");
                } else {
                    gVar.a(9, j12, gVar.f12886k);
                    gVar.a(1, j10, "no message running", false);
                }
            } else if (gVar.f12877b == 0) {
                gVar.a(8, j10, gVar.f12887l, true);
            } else {
                gVar.a(9, j12, gVar.f12886k, false);
                gVar.a(8, j10, gVar.f12887l, true);
            }
        }
        gVar.f12883h = j10;
    }
}
