package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import b0.e2;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.C3161ca;
import com.ironsource.C3271ic;
import com.ironsource.C3352n2;
import com.ironsource.C3387p2;
import com.ironsource.C3390p5;
import com.ironsource.C3422r4;
import com.ironsource.L9;
import com.ironsource.Me;
import com.ironsource.S1;
import com.ironsource.Y1;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f37492a = "1";

    /* renamed from: b, reason: collision with root package name */
    private final String f37493b = "102";

    /* renamed from: c, reason: collision with root package name */
    private final String f37494c = "102";

    /* renamed from: d, reason: collision with root package name */
    private final String f37495d = "GenericNotifications";

    /* renamed from: e, reason: collision with root package name */
    private f f37496e;

    /* renamed from: f, reason: collision with root package name */
    private IronSource.a f37497f;

    /* renamed from: g, reason: collision with root package name */
    private C3387p2 f37498g;

    /* renamed from: h, reason: collision with root package name */
    private S1 f37499h;

    /* renamed from: i, reason: collision with root package name */
    private ISBannerSize f37500i;

    public e(f fVar) {
        this.f37496e = fVar;
    }

    @Deprecated
    public void a(Context context, Map<String, Object> map, List<String> list, h hVar, int i10, C3161ca c3161ca, ISBannerSize iSBannerSize) {
        this.f37500i = iSBannerSize;
        a(context, map, list, hVar, i10, c3161ca);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        protected S1 f37501a;

        /* renamed from: b, reason: collision with root package name */
        protected d.a f37502b;

        /* renamed from: c, reason: collision with root package name */
        protected int f37503c;

        /* renamed from: d, reason: collision with root package name */
        protected String f37504d;

        /* renamed from: e, reason: collision with root package name */
        protected long f37505e;

        /* renamed from: f, reason: collision with root package name */
        protected int f37506f;

        /* renamed from: h, reason: collision with root package name */
        private int f37508h;

        /* renamed from: k, reason: collision with root package name */
        private final URL f37511k;

        /* renamed from: l, reason: collision with root package name */
        private final JSONObject f37512l;

        /* renamed from: m, reason: collision with root package name */
        private final boolean f37513m;

        /* renamed from: n, reason: collision with root package name */
        private final int f37514n;

        /* renamed from: o, reason: collision with root package name */
        private final long f37515o;

        /* renamed from: p, reason: collision with root package name */
        private final boolean f37516p;

        /* renamed from: q, reason: collision with root package name */
        private final boolean f37517q;

        /* renamed from: r, reason: collision with root package name */
        private final boolean f37518r;

        /* renamed from: i, reason: collision with root package name */
        protected String f37509i = "";

        /* renamed from: j, reason: collision with root package name */
        protected int f37510j = 0;

        /* renamed from: g, reason: collision with root package name */
        protected String f37507g = a((Integer) null);

        public a(S1 s12, URL url, JSONObject jSONObject, boolean z10, C3387p2 c3387p2) {
            this.f37501a = s12;
            this.f37511k = url;
            this.f37512l = jSONObject;
            this.f37513m = z10;
            this.f37514n = c3387p2.g();
            this.f37515o = c3387p2.m();
            this.f37516p = c3387p2.o();
            this.f37517q = c3387p2.p();
            this.f37508h = c3387p2.d();
            this.f37518r = c3387p2.n();
        }

        private void a(long j10, long j11) {
            long time = j10 - (new Date().getTime() - j11);
            if (time > 0) {
                SystemClock.sleep(time);
            }
        }

        public boolean b() {
            long time;
            int responseCode;
            this.f37505e = e2.c();
            try {
                this.f37508h = this.f37510j == 1015 ? 1 : this.f37508h;
                this.f37506f = 0;
                HttpURLConnection httpURLConnectionA = null;
                while (true) {
                    int i10 = this.f37506f;
                    int i11 = this.f37514n;
                    if (i10 >= i11) {
                        this.f37506f = i11 - 1;
                        this.f37507g = a(Integer.valueOf(this.f37503c));
                        return false;
                    }
                    try {
                        time = new Date().getTime();
                        String str = "Auction Handler: auction trial " + (this.f37506f + 1) + " out of " + this.f37514n + " max trials";
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, str, 0);
                        IronSourceUtils.i(str);
                        httpURLConnectionA = a(this.f37511k, this.f37515o);
                        a(httpURLConnectionA, this.f37512l, this.f37516p);
                        responseCode = httpURLConnectionA.getResponseCode();
                    } catch (SocketTimeoutException e10) {
                        C3422r4.d().a(e10);
                        if (httpURLConnectionA != null) {
                            httpURLConnectionA.disconnect();
                        }
                        this.f37503c = 1006;
                        this.f37504d = "Connection timed out";
                        IronLog.INTERNAL.error("Auction socket timeout exception " + e10.getMessage());
                    } catch (Throwable th2) {
                        C3422r4.d().a(th2);
                        IronLog.INTERNAL.error("getting exception " + th2);
                        if (httpURLConnectionA != null) {
                            httpURLConnectionA.disconnect();
                        }
                        this.f37503c = 1000;
                        this.f37504d = th2.getMessage();
                        this.f37507g = a(Integer.valueOf(this.f37503c));
                        return false;
                    }
                    if (responseCode == 200 || responseCode == 204) {
                        break;
                    }
                    this.f37503c = 1001;
                    String str2 = "Auction response code not valid, error code response from server - " + responseCode;
                    this.f37504d = str2;
                    IronLog.INTERNAL.error(str2);
                    httpURLConnectionA.disconnect();
                    if (this.f37506f < this.f37514n - 1) {
                        a(this.f37515o, time);
                    }
                    this.f37506f++;
                }
                try {
                    a(a(httpURLConnectionA), this.f37513m, this.f37517q);
                    httpURLConnectionA.disconnect();
                    return true;
                } catch (JSONException e11) {
                    C3422r4.d().a(e11);
                    if (e11.getMessage() != null && e11.getMessage().equalsIgnoreCase("decryption error")) {
                        this.f37503c = IronSourceError.AUCTION_ERROR_DECRYPTION;
                        this.f37504d = "Auction decryption error";
                    } else if (e11.getMessage() == null || !e11.getMessage().equalsIgnoreCase("decompression error")) {
                        this.f37503c = 1002;
                        this.f37504d = "Auction parsing error";
                    } else {
                        this.f37503c = 1008;
                        this.f37504d = "Auction decompression error";
                    }
                    this.f37507g = a(Integer.valueOf(this.f37503c));
                    IronLog.INTERNAL.error("Auction handle response exception " + e11.getMessage());
                    httpURLConnectionA.disconnect();
                    return false;
                }
            } catch (Exception e12) {
                C3422r4.d().a(e12);
                this.f37503c = 1007;
                this.f37504d = e12.getMessage();
                this.f37506f = 0;
                this.f37507g = a(Integer.valueOf(this.f37503c));
                IronLog.INTERNAL.error("Auction request exception " + e12.getMessage());
                return false;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zB = b();
            S1 s12 = this.f37501a;
            if (s12 == null) {
                return;
            }
            a(zB, s12, e2.c() - this.f37505e);
        }

        private String a() {
            if (this.f37508h == 2) {
                return C3390p5.b().d();
            }
            return C3390p5.b().c();
        }

        private void a(HttpURLConnection httpURLConnection, JSONObject jSONObject, boolean z10) throws Exception {
            String strA;
            String strE;
            String str;
            OutputStream outputStream = httpURLConnection.getOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, C.UTF8_NAME);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            if (this.f37508h == 2) {
                try {
                    strA = C3390p5.b().a();
                } catch (JSONException e10) {
                    C3422r4.d().a(e10);
                    this.f37509i = e10.getLocalizedMessage();
                    this.f37510j = 1015;
                    this.f37508h = 1;
                    IronLog.INTERNAL.error("get encrypted session key exception " + e10.getMessage());
                }
            } else {
                strA = "";
            }
            String string = jSONObject.toString();
            String strA2 = a();
            if (z10) {
                IronLog.INTERNAL.verbose("compressing and encrypting auction request");
                strE = L9.a(strA2, string);
            } else {
                strE = L9.e(strA2, string);
            }
            if (this.f37508h == 2) {
                str = String.format(KGUkpTlXZlJLy.MMjH, strA, strE);
            } else {
                str = String.format("{\"request\" : \"%1$s\"}", strE);
            }
            bufferedWriter.write(str);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStreamWriter.close();
            outputStream.close();
        }

        private HttpURLConnection a(URL url, long j10) throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod(C3271ic.f36944b);
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setReadTimeout((int) j10);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            return httpURLConnection;
        }

        public JSONObject a(JSONObject jSONObject, boolean z10) throws JSONException {
            String str;
            String strA = a();
            if (this.f37508h == 2) {
                str = ApsMetricsDataMap.APSMETRICS_FIELD_CONNECTIONTYPE;
            } else {
                str = Me.f34938n;
            }
            String string = jSONObject.getString(str);
            if (z10) {
                return b(strA, string);
            }
            return a(strA, string);
        }

        public void a(String str, boolean z10, boolean z11) throws JSONException {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (z10) {
                    jSONObject = a(jSONObject, z11);
                }
                d.a aVarA = d.b().a(jSONObject);
                this.f37502b = aVarA;
                this.f37503c = aVarA.c();
                this.f37504d = this.f37502b.d();
                return;
            }
            throw new JSONException("empty response");
        }

        private JSONObject a(String str, String str2) throws JSONException {
            String strB = L9.b(str, str2);
            if (!TextUtils.isEmpty(strB)) {
                return new JSONObject(strB);
            }
            throw new JSONException("decryption error");
        }

        private String a(HttpURLConnection httpURLConnection) throws IOException {
            InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb2.append(line);
                } else {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb2.toString();
                }
            }
        }

        private JSONObject b(String str, String str2) throws JSONException {
            IronLog.INTERNAL.verbose("decrypting and decompressing auction response");
            String strD = L9.d(str, str2);
            if (strD != null) {
                return new JSONObject(strD);
            }
            throw new JSONException("decompression error");
        }

        public void a(boolean z10, S1 s12, long j10) {
            if (z10) {
                s12.a(this.f37502b.h(), this.f37502b.a(), this.f37502b.e(), this.f37502b.f(), this.f37502b.b(), this.f37506f + 1, j10, this.f37510j, this.f37509i);
            } else {
                s12.a(this.f37503c, this.f37504d, this.f37506f + 1, this.f37507g, j10);
            }
        }

        private String a(Integer num) {
            return Y1.f35721a.a(this.f37518r, num);
        }
    }

    public void a(Context context, i iVar, S1 s12) {
        try {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f37496e.a(context, iVar, s12));
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error("execute auction exception " + e10.getMessage());
            if (s12 != null) {
                s12.a(1000, e10.getMessage(), 0, Y1.f35721a.a(this.f37496e.a(), 1000), 0L);
            }
        }
    }

    @Deprecated
    public e(IronSource.a aVar, C3387p2 c3387p2, S1 s12) {
        this.f37497f = aVar;
        this.f37498g = c3387p2;
        this.f37499h = s12;
    }

    @Deprecated
    public void a(Context context, Map<String, Object> map, List<String> list, h hVar, int i10, C3161ca c3161ca) {
        e eVar;
        boolean zG;
        try {
            zG = IronSourceUtils.g();
            eVar = this;
        } catch (Exception e10) {
            e = e10;
            eVar = this;
        }
        try {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(eVar.f37499h, new URL(eVar.f37498g.a(false)), eVar.a(map, list, hVar, i10, zG, c3161ca), zG, eVar.f37498g));
        } catch (Exception e11) {
            e = e11;
            Exception exc = e;
            C3422r4.d().a(exc);
            IronLog.INTERNAL.error("execute auction exception " + exc.getMessage());
            eVar.f37499h.a(1000, exc.getMessage(), 0, Y1.f35721a.a(eVar.f37498g.n(), 1000), 0L);
        }
    }

    public void a(C3352n2 c3352n2, int i10, C3352n2 c3352n22, String str) {
        Iterator<String> it = c3352n2.b().iterator();
        while (it.hasNext()) {
            C3352n2 c3352n23 = c3352n2;
            int i11 = i10;
            String str2 = str;
            d.b().a("reportImpression", c3352n23.c(), d.b().a(it.next(), i11, c3352n23, "", "", str2));
            i10 = i11;
            c3352n2 = c3352n23;
            str = str2;
        }
        C3352n2 c3352n24 = c3352n2;
        int i12 = i10;
        String str3 = str;
        if (c3352n22 != null) {
            Iterator<String> it2 = c3352n22.b().iterator();
            while (it2.hasNext()) {
                d.b().a("reportImpression", "GenericNotifications", d.b().a(it2.next(), i12, c3352n24, "", "102", str3));
            }
        }
    }

    public void a(C3352n2 c3352n2, int i10, C3352n2 c3352n22) {
        Iterator<String> it = c3352n2.h().iterator();
        while (it.hasNext()) {
            C3352n2 c3352n23 = c3352n2;
            int i11 = i10;
            d.b().a("reportLoadSuccess", c3352n23.c(), d.b().a(it.next(), i11, c3352n23, "", "", ""));
            i10 = i11;
            c3352n2 = c3352n23;
        }
        C3352n2 c3352n24 = c3352n2;
        int i12 = i10;
        if (c3352n22 != null) {
            Iterator<String> it2 = c3352n22.h().iterator();
            while (it2.hasNext()) {
                d.b().a("reportLoadSuccess", "GenericNotifications", d.b().a(it2.next(), i12, c3352n24, "", "102", ""));
            }
        }
    }

    public void a(CopyOnWriteArrayList<A> copyOnWriteArrayList, ConcurrentHashMap<String, C3352n2> concurrentHashMap, int i10, C3352n2 c3352n2, C3352n2 c3352n22) {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<A> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        a(arrayList, concurrentHashMap, i10, c3352n2, c3352n22);
    }

    public void a(ArrayList<String> arrayList, ConcurrentHashMap<String, C3352n2> concurrentHashMap, int i10, C3352n2 c3352n2, C3352n2 c3352n22) {
        int iJ = c3352n22.j();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!next.equals(c3352n22.c())) {
                C3352n2 c3352n23 = concurrentHashMap.get(next);
                int iJ2 = c3352n23.j();
                String strI = c3352n23.i();
                String str = iJ2 < iJ ? "1" : "102";
                IronLog.INTERNAL.verbose("instance=" + c3352n23.c() + ", instancePriceOrder= " + iJ2 + ", loseReasonCode=" + str + ", winnerInstance=" + c3352n22.c() + ", winnerInstancePriceOrder=" + iJ);
                Iterator<String> it2 = c3352n23.g().iterator();
                while (it2.hasNext()) {
                    d.b().a("reportAuctionLose", c3352n23.c(), d.b().a(it2.next(), i10, c3352n22, strI, str, ""));
                }
            }
        }
        if (c3352n2 != null) {
            Iterator<String> it3 = c3352n2.g().iterator();
            while (it3.hasNext()) {
                d.b().a("reportAuctionLose", "GenericNotifications", d.b().a(it3.next(), i10, c3352n22, "", "102", ""));
            }
        }
    }

    private JSONObject a(Map<String, Object> map, List<String> list, h hVar, int i10, boolean z10, C3161ca c3161ca) throws JSONException {
        i iVar = new i(this.f37497f);
        iVar.a(map);
        iVar.a(list);
        iVar.a(hVar);
        iVar.a(i10);
        iVar.a(this.f37500i);
        iVar.a(c3161ca);
        iVar.b(z10);
        return d.b().a(iVar);
    }

    public boolean a() {
        return this.f37496e.b();
    }
}
