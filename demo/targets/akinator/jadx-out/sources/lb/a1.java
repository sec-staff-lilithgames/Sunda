package lb;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.xml.parsers.DocumentBuilderFactory;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import timber.log.Timber;
import xv.l0;
import xv.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a1 f72726a = new a1();

    /* renamed from: b, reason: collision with root package name */
    public static final List f72727b = uu.p0.listOf((Object[]) new tu.v[]{tu.e0.to("BAD FILE EXTENSION", 110), tu.e0.to("BAD MEDIA ID OR FOOTPRINT", Integer.valueOf(AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL)), tu.e0.to("TECHNICAL ERROR", 400), tu.e0.to("ENGINE REFUSAL", 500), tu.e0.to("TIMEOUT", 600), tu.e0.to("SERVER DOWN", Integer.valueOf(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED)), tu.e0.to("VALIDATION", 130), tu.e0.to("USER EXISTANT", -10), tu.e0.to("WRONG CREDENTIALS", -30), tu.e0.to("PLEASE LOG IN", -60), tu.e0.to("WRONG PASSWORD", -50), tu.e0.to("INCORRECT PASSWORD", -20), tu.e0.to("ACCOUNT NOT ENABLED", -70), tu.e0.to("ACCOUNT LOCKED", -80), tu.e0.to("EMAIL ALREADY USED", -100)});

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf A[EDGE_INSN: B:45:0x00bf->B:32:0x00bf BREAK  A[LOOP:0: B:3:0x0028->B:31:0x00bc], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String TryToConnectWithLoadBalancing(java.lang.String r12, int r13) {
        /*
            java.lang.String r0 = "urlToTest"
            kotlin.jvm.internal.e0.checkNotNullParameter(r12, r0)
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r1 = 4
            int r0 = r0.nextInt(r1)
            xv.l0$a r2 = new xv.l0$a
            r2.<init>()
            long r3 = (long) r13
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS
            xv.l0$a r2 = r2.connectTimeout(r3, r13)
            xv.l0$a r13 = r2.readTimeout(r3, r13)
            xv.l0 r13 = r13.build()
            r2 = 1
            r3 = 0
            r4 = r2
            r5 = r3
            r2 = r0
        L28:
            java.lang.String r8 = java.lang.String.valueOf(r2)
            r10 = 4
            r11 = 0
            java.lang.String r7 = "<variable>"
            r9 = 0
            r6 = r12
            java.lang.String r12 = sv.k0.replace$default(r6, r7, r8, r9, r10, r11)
            timber.log.Timber$Forest r0 = timber.log.Timber.Forest
            java.lang.String r7 = "TestUrl"
            timber.log.Timber$Tree r8 = r0.tag(r7)
            java.lang.String r9 = "urlToTest : "
            java.lang.String r9 = a.b.k(r9, r12)
            r10 = 0
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r8.d(r9, r11)
            xv.o0$a r8 = new xv.o0$a     // Catch: java.lang.Exception -> L94 java.net.UnknownHostException -> Lc0
            r8.<init>()     // Catch: java.lang.Exception -> L94 java.net.UnknownHostException -> Lc0
            xv.o0$a r12 = r8.url(r12)     // Catch: java.lang.Exception -> L94 java.net.UnknownHostException -> Lc0
            xv.o0$a r12 = r12.get()     // Catch: java.lang.Exception -> L94 java.net.UnknownHostException -> Lc0
            xv.o0 r12 = r12.build()     // Catch: java.lang.Exception -> L94 java.net.UnknownHostException -> Lc0
            xv.j r12 = r13.newCall(r12)     // Catch: java.lang.Exception -> L94 java.net.UnknownHostException -> Lc0
            xv.v0 r12 = r12.execute()     // Catch: java.lang.Exception -> L94 java.net.UnknownHostException -> Lc0
            boolean r8 = r12.isSuccessful()     // Catch: java.lang.Throwable -> L8c
            if (r8 == 0) goto L90
            xv.w0 r8 = r12.body()     // Catch: java.lang.Throwable -> L8c
            java.lang.String r5 = r8.string()     // Catch: java.lang.Throwable -> L8c
            timber.log.Timber$Tree r0 = r0.tag(r7)     // Catch: java.lang.Throwable -> L8c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8c
            r8.<init>()     // Catch: java.lang.Throwable -> L8c
            java.lang.String r9 = "xml retourne : "
            r8.append(r9)     // Catch: java.lang.Throwable -> L8c
            r8.append(r5)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L8c
            java.lang.Object[] r9 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L8c
            r0.d(r8, r9)     // Catch: java.lang.Throwable -> L8c
            goto L90
        L8c:
            r0 = move-exception
            r8 = r5
            r5 = r0
            goto L97
        L90:
            gv.d.closeFinally(r12, r3)     // Catch: java.lang.Exception -> L94 java.net.UnknownHostException -> Lc0
            goto Lad
        L94:
            r0 = move-exception
            r12 = r0
            goto La0
        L97:
            throw r5     // Catch: java.lang.Throwable -> L98
        L98:
            r0 = move-exception
            gv.d.closeFinally(r12, r5)     // Catch: java.lang.Exception -> L9d java.net.UnknownHostException -> Lc0
            throw r0     // Catch: java.lang.Exception -> L9d java.net.UnknownHostException -> Lc0
        L9d:
            r0 = move-exception
            r12 = r0
            r5 = r8
        La0:
            timber.log.Timber$Forest r0 = timber.log.Timber.Forest
            timber.log.Timber$Tree r0 = r0.tag(r7)
            java.lang.String r7 = "Foirure"
            java.lang.Object[] r8 = new java.lang.Object[r10]
            r0.e(r12, r7, r8)
        Lad:
            if (r4 != r1) goto Lb0
            goto Lbf
        Lb0:
            int r2 = r2 + 1
            if (r2 != r1) goto Lb5
            r2 = r10
        Lb5:
            int r4 = r4 + 1
            if (r5 != 0) goto Lbf
            if (r4 <= r1) goto Lbc
            goto Lbf
        Lbc:
            r12 = r6
            goto L28
        Lbf:
            return r5
        Lc0:
            timber.log.Timber$Forest r12 = timber.log.Timber.Forest
            timber.log.Timber$Tree r12 = r12.tag(r7)
            java.lang.String r13 = "Unknown host"
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r12.e(r13, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.a1.TryToConnectWithLoadBalancing(java.lang.String, int):java.lang.String");
    }

    public static int a(String str, String str2) {
        Object obj = null;
        if (sv.n0.contains$default((CharSequence) str, (CharSequence) "OK", false, 2, (Object) null)) {
            return sv.n0.contains$default((CharSequence) str, (CharSequence) "NO TRAP", false, 2, (Object) null) ? 900 : 0;
        }
        if (!sv.k0.startsWith$default(str, "KO", false, 2, null)) {
            if (!sv.k0.startsWith$default(str, "WARN", false, 2, null)) {
                return 400;
            }
            if (sv.n0.contains$default((CharSequence) str, (CharSequence) "NO QUESTION", false, 2, (Object) null)) {
                return 300;
            }
            if (sv.n0.contains$default((CharSequence) str, (CharSequence) "UNABLE TO PLAY", false, 2, (Object) null)) {
                return 800;
            }
            Timber.Forest.tag("TestUrl").e(a.b.k("error in completion : ", str), new Object[0]);
            return 0;
        }
        Timber.Forest.tag("TestUrl").e(a.b.k("KO in completion : ", str), new Object[0]);
        Iterator it = f72727b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (sv.n0.contains$default((CharSequence) str2, (CharSequence) ((tu.v) next).component1(), false, 2, (Object) null)) {
                obj = next;
                break;
            }
        }
        tu.v vVar = (tu.v) obj;
        if (vVar != null) {
            return ((Number) vVar.getSecond()).intValue();
        }
        return 400;
    }

    public final String getXML(String urlToTest, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(urlToTest, "urlToTest");
        l0.a aVar = new l0.a();
        long j10 = i10;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            xv.v0 v0VarExecute = aVar.connectTimeout(j10, timeUnit).readTimeout(j10, timeUnit).build().newCall(new o0.a().url(urlToTest).get().build()).execute();
            try {
                String strString = v0VarExecute.isSuccessful() ? v0VarExecute.body().string() : null;
                gv.d.closeFinally(v0VarExecute, null);
                return strString;
            } finally {
            }
        } catch (UnknownHostException unused) {
            return null;
        } catch (Exception e10) {
            Timber.Forest.tag("TAG").e(e10, "Error in getXML", new Object[0]);
            return null;
        }
    }

    public final boolean pingUrl(String urlToTest) {
        String strString;
        kotlin.jvm.internal.e0.checkNotNullParameter(urlToTest, "urlToTest");
        l0.a aVar = new l0.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        xv.l0 l0VarBuild = aVar.connectTimeout(MBInterstitialActivity.WEB_LOAD_TIME, timeUnit).readTimeout(MBInterstitialActivity.WEB_LOAD_TIME, timeUnit).build();
        try {
            xv.v0 v0VarExecute = l0VarBuild.newCall(new o0.a().url(urlToTest + "/ping.php").get().build()).execute();
            try {
                if (!v0VarExecute.isSuccessful()) {
                    gv.d.closeFinally(v0VarExecute, null);
                    return false;
                }
                xv.w0 w0VarBody = v0VarExecute.body();
                if (w0VarBody != null && (strString = w0VarBody.string()) != null) {
                    Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(strString)));
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(document, "parse(...)");
                    document.getDocumentElement().normalize();
                    NodeList elementsByTagName = document.getElementsByTagName("COMPLETION");
                    boolean zAreEqual = elementsByTagName.getLength() > 0 ? kotlin.jvm.internal.e0.areEqual(elementsByTagName.item(0).getTextContent(), "OK") : false;
                    gv.d.closeFinally(v0VarExecute, null);
                    return zAreEqual;
                }
                gv.d.closeFinally(v0VarExecute, null);
                return false;
            } finally {
            }
        } catch (Exception e10) {
            Timber.Forest.tag("TestUrl").e(e10, "Error in pingUrl", new Object[0]);
            return false;
        }
    }

    public final String readInputStreamToString(HttpURLConnection connection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(connection.getInputStream());
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        String string = sb2.toString();
                        gv.d.closeFinally(bufferedInputStream, null);
                        return string;
                    }
                    sb2.append(line);
                }
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public final int testNodeCompletion(JSONObject obj) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(obj, "obj");
        String strOptString = obj.optString("completion", "");
        String strOptString2 = obj.optString(PglCryptUtils.KEY_MESSAGE, "");
        kotlin.jvm.internal.e0.checkNotNull(strOptString);
        kotlin.jvm.internal.e0.checkNotNull(strOptString2);
        return a(strOptString, strOptString2);
    }

    public static final int testNodeCompletion(String sCompletionStatus) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sCompletionStatus, "sCompletionStatus");
        return a(sCompletionStatus, sCompletionStatus);
    }

    public static final int testNodeCompletion(Document document) throws DOMException {
        if (document != null) {
            try {
                if (document.hasChildNodes()) {
                    document.getDocumentElement().normalize();
                    String textContent = document.getElementsByTagName("COMPLETION").item(0).getTextContent();
                    kotlin.jvm.internal.e0.checkNotNull(textContent);
                    return testNodeCompletion(textContent);
                }
                Timber.Forest.tag("TestUrl").e("parsing error", new Object[0]);
            } catch (Exception unused) {
            }
        } else {
            Timber.Forest.tag("TestUrl").e("parsing error", new Object[0]);
        }
        return 400;
    }
}
