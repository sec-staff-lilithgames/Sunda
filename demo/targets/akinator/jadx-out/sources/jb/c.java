package jb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ironsource.C3191e4;
import com.ironsource.C3271ic;
import com.ironsource.G5;
import com.ironsource.Q6;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import gv.y;
import im.k;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import javax.xml.parsers.DocumentBuilderFactory;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import sv.n0;
import timber.log.Timber;
import tu.v;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: m, reason: collision with root package name */
    public static final a f69226m = new a(null);

    /* renamed from: n, reason: collision with root package name */
    public static c f69227n;

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f69228a;

    /* renamed from: b, reason: collision with root package name */
    public SharedPreferences.Editor f69229b;

    /* renamed from: c, reason: collision with root package name */
    public String f69230c;

    /* renamed from: d, reason: collision with root package name */
    public String f69231d;

    /* renamed from: e, reason: collision with root package name */
    public String f69232e;

    /* renamed from: f, reason: collision with root package name */
    public String f69233f;

    /* renamed from: g, reason: collision with root package name */
    public String f69234g;

    /* renamed from: h, reason: collision with root package name */
    public int f69235h;

    /* renamed from: i, reason: collision with root package name */
    public String f69236i;

    /* renamed from: j, reason: collision with root package name */
    public final HashSet f69237j = new HashSet();

    /* renamed from: k, reason: collision with root package name */
    public String f69238k = "0";

    /* renamed from: l, reason: collision with root package name */
    public String f69239l = "";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static final class a {
        public a(u uVar) {
        }

        public final c sharedInstance() {
            if (c.f69227n == null) {
                c.f69227n = new c(null);
            }
            c cVar = c.f69227n;
            e0.checkNotNull(cVar);
            return cVar;
        }
    }

    public c(u uVar) {
    }

    public static /* synthetic */ void boot$default(c cVar, Context context, String str, String str2, String str3, String str4, int i10, String str5, jb.a aVar, ExecutorService executorService, int i11, Object obj) {
        cVar.boot(context, str, str2, str3, str4, i10, str5, aVar, (i11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : executorService);
    }

    public static /* synthetic */ void push$default(c cVar, b bVar, ExecutorService executorService, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            executorService = null;
        }
        cVar.push(bVar, executorService);
    }

    public static final c sharedInstance() {
        return f69226m.sharedInstance();
    }

    public final boolean a(Context context) throws SAXException, DOMException, IOException {
        SharedPreferences.Editor editor;
        try {
            c();
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            e0.checkNotNullExpressionValue(advertisingIdInfo, "getAdvertisingIdInfo(...)");
            StringBuilder sb2 = new StringBuilder("application=" + this.f69230c);
            sb2.append("&uid=");
            sb2.append(this.f69233f);
            sb2.append("&sec_id=");
            sb2.append(this.f69233f);
            sb2.append("&ad_id=");
            sb2.append(advertisingIdInfo);
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            sb2.append("&app_version=");
            sb2.append(str);
            String str2 = this.f69234g;
            if (str2 != null) {
                sb2.append("&token=");
                sb2.append(str2);
            }
            sb2.append("&lang=");
            sb2.append(this.f69231d);
            sb2.append("&code_pays=");
            sb2.append(this.f69232e);
            sb2.append("&os_version=");
            sb2.append(Build.VERSION.RELEASE);
            sb2.append("&famille_device=");
            sb2.append(URLEncoder.encode(Build.BRAND + " - " + Build.MODEL, C.UTF8_NAME));
            sb2.append("&from=");
            sb2.append(this.f69236i);
            synchronized (this.f69237j) {
                Iterator it = this.f69237j.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    sb2.append("&abcampaign_identifiers[]=");
                    sb2.append(str3);
                }
            }
            String string = sb2.toString();
            e0.checkNotNullExpressionValue(string, "toString(...)");
            Charset UTF_8 = StandardCharsets.UTF_8;
            e0.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = string.getBytes(UTF_8);
            e0.checkNotNullExpressionValue(bytes, "getBytes(...)");
            URLConnection uRLConnectionOpenConnection = new URL("https://push.akinator.com/new_boot").openConnection();
            e0.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestMethod(C3271ic.f36944b);
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("charset", G5.N);
            httpURLConnection.setRequestProperty("Content-Length", String.valueOf(bytes.length));
            httpURLConnection.setUseCaches(false);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            try {
                dataOutputStream.write(bytes);
                gv.d.closeFinally(dataOutputStream, null);
                InputStream inputStream = httpURLConnection.getInputStream();
                e0.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, sv.g.f86134b), Segment.SIZE);
                try {
                    String text = y.readText(bufferedReader);
                    gv.d.closeFinally(bufferedReader, null);
                    Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(text)));
                    document.getDocumentElement().normalize();
                    String textContent = document.getElementsByTagName("COMPLETION").item(0).getTextContent();
                    e0.checkNotNull(textContent);
                    if (!n0.contains$default((CharSequence) textContent, (CharSequence) "OK", false, 2, (Object) null)) {
                        throw new IllegalArgumentException(("Boot completion status " + textContent).toString());
                    }
                    NodeList elementsByTagName = document.getElementsByTagName("NUM_VERSION");
                    if (elementsByTagName.getLength() == 1) {
                        Node nodeItem = elementsByTagName.item(0);
                        if (!e0.areEqual(this.f69239l, nodeItem.getTextContent())) {
                            setHasAlreadyAnswerMessageVersion(false);
                        }
                        this.f69239l = nodeItem.getTextContent();
                    }
                    NodeList elementsByTagName2 = document.getElementsByTagName("ABCAMPAIGN");
                    int length = elementsByTagName2.getLength();
                    for (int i10 = 0; i10 < length; i10++) {
                        Node nodeItem2 = elementsByTagName2.item(i10);
                        e0.checkNotNull(nodeItem2, "null cannot be cast to non-null type org.w3c.dom.Element");
                        Element element = (Element) nodeItem2;
                        Node nodeItem3 = element.getElementsByTagName("IDENTIFIER").item(0);
                        String textContent2 = nodeItem3 != null ? nodeItem3.getTextContent() : null;
                        Node nodeItem4 = element.getElementsByTagName("VALUE").item(0);
                        String textContent3 = nodeItem4 != null ? nodeItem4.getTextContent() : null;
                        if (textContent2 != null && textContent3 != null && (editor = this.f69229b) != null) {
                            editor.putString(textContent2, textContent3);
                        }
                    }
                    SharedPreferences.Editor editor2 = this.f69229b;
                    if (editor2 != null) {
                        editor2.commit();
                    }
                    NodeList elementsByTagName3 = document.getElementsByTagName("CREATED_DEVICE_RECORD");
                    if (elementsByTagName3.getLength() == 1) {
                        this.f69238k = elementsByTagName3.item(0).getTextContent();
                    }
                    return true;
                } finally {
                }
            } finally {
            }
        } catch (Exception e10) {
            Timber.Forest.tag("ElokenceAnalytics").e(e10, "Boot error", new Object[0]);
            return false;
        }
    }

    public final void addCampaign(String name, String defaultValue) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(defaultValue, "defaultValue");
        synchronized (this.f69237j) {
            this.f69237j.add(name);
        }
        Timber.Forest.tag("ElokenceAnalytics").d(a.b.m("addCampaign: ", name, "  - def: ", defaultValue), new Object[0]);
        SharedPreferences.Editor editor = this.f69229b;
        e0.checkNotNull(editor);
        editor.putString(name, defaultValue);
        SharedPreferences.Editor editor2 = this.f69229b;
        e0.checkNotNull(editor2);
        editor2.commit();
    }

    public final boolean b() throws IOException {
        try {
            List<v> allMetrics = h.f69257d.sharedInstance().getAllMetrics();
            StringBuilder sb2 = new StringBuilder("application=" + this.f69230c);
            sb2.append("&uid=");
            sb2.append(this.f69233f);
            sb2.append("&code_pays=");
            sb2.append(this.f69232e);
            sb2.append("&from=");
            sb2.append(this.f69236i);
            String str = this.f69234g;
            if (str != null) {
                sb2.append("&token=");
                sb2.append(str);
            }
            for (v vVar : allMetrics) {
                sb2.append(C3191e4.i.f36527c);
                sb2.append((String) vVar.getFirst());
                sb2.append(C3191e4.i.f36525b);
                sb2.append((String) vVar.getSecond());
            }
            String string = sb2.toString();
            e0.checkNotNullExpressionValue(string, "toString(...)");
            Charset UTF_8 = StandardCharsets.UTF_8;
            e0.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = string.getBytes(UTF_8);
            e0.checkNotNullExpressionValue(bytes, "getBytes(...)");
            URLConnection uRLConnectionOpenConnection = new URL("https://push.akinator.com/analytics").openConnection();
            e0.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestMethod(C3271ic.f36944b);
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("charset", G5.N);
            httpURLConnection.setRequestProperty("Content-Length", String.valueOf(bytes.length));
            httpURLConnection.setUseCaches(false);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            try {
                dataOutputStream.write(bytes);
                gv.d.closeFinally(dataOutputStream, null);
                InputStream inputStream = httpURLConnection.getInputStream();
                e0.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, sv.g.f86134b), Segment.SIZE);
                try {
                    y.readText(bufferedReader);
                    gv.d.closeFinally(bufferedReader, null);
                    return true;
                } finally {
                }
            } finally {
            }
        } catch (Exception e10) {
            Timber.Forest.tag("ElokenceAnalytics").e(e10, "Push error", new Object[0]);
            return false;
        }
    }

    public final void boot(Context context, String deviceUid, String str, String str2, String str3, int i10, String nomApp, jb.a pCallback) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(deviceUid, "deviceUid");
        e0.checkNotNullParameter(nomApp, "nomApp");
        e0.checkNotNullParameter(pCallback, "pCallback");
        boot$default(this, context, deviceUid, str, str2, str3, i10, nomApp, pCallback, null, NotificationCompat.FLAG_LOCAL_ONLY, null);
    }

    public final Object bootSuspend(Context context, String str, String str2, String str3, String str4, int i10, String str5, zu.d<? super Boolean> dVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new d(this, str2, str, str3, context, str4, i10, str5, null), dVar);
    }

    public final void c() {
        SharedPreferences.Editor editor = this.f69229b;
        if (editor != null) {
            e0.checkNotNull(editor);
            editor.putString("mApplication", this.f69230c);
            SharedPreferences.Editor editor2 = this.f69229b;
            e0.checkNotNull(editor2);
            editor2.putString("uid", this.f69233f);
            SharedPreferences.Editor editor3 = this.f69229b;
            e0.checkNotNull(editor3);
            editor3.putString(Q6.f35290q, this.f69231d);
            SharedPreferences.Editor editor4 = this.f69229b;
            e0.checkNotNull(editor4);
            editor4.putString("locale", this.f69232e);
            SharedPreferences.Editor editor5 = this.f69229b;
            e0.checkNotNull(editor5);
            editor5.putString("gcmToken", this.f69234g);
            SharedPreferences.Editor editor6 = this.f69229b;
            e0.checkNotNull(editor6);
            editor6.putInt("paid", this.f69235h);
            SharedPreferences.Editor editor7 = this.f69229b;
            e0.checkNotNull(editor7);
            editor7.putString("mNomApp", this.f69236i);
            SharedPreferences.Editor editor8 = this.f69229b;
            e0.checkNotNull(editor8);
            editor8.commit();
        }
    }

    public final String getCampaign(String name) {
        e0.checkNotNullParameter(name, "name");
        SharedPreferences sharedPreferences = this.f69228a;
        if (sharedPreferences == null) {
            return null;
        }
        e0.checkNotNull(sharedPreferences);
        return sharedPreferences.getString(name, null);
    }

    public final String getCreatedDeviceRecord() {
        return this.f69238k;
    }

    public final String getDeviceId() {
        String str = this.f69233f;
        if (str != null) {
            e0.checkNotNull(str);
            return str;
        }
        SharedPreferences sharedPreferences = this.f69228a;
        e0.checkNotNull(sharedPreferences);
        String string = sharedPreferences.getString("uid", "");
        e0.checkNotNull(string);
        return string;
    }

    public final String getNumVersion() {
        return this.f69239l;
    }

    public final boolean hasAlreadyAnswerMessageVersion() {
        SharedPreferences sharedPreferences = this.f69228a;
        e0.checkNotNull(sharedPreferences);
        return sharedPreferences.getBoolean("has_answered_message_version", false);
    }

    public final void push(b bVar) {
        push$default(this, bVar, null, 2, null);
    }

    public final Object pushSuspend(zu.d<? super x0> dVar) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new e(this, null), dVar);
        return objWithContext == av.e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }

    public final void setHasAlreadyAnswerMessageVersion(boolean z10) {
        SharedPreferences.Editor editor = this.f69229b;
        e0.checkNotNull(editor);
        editor.putBoolean("has_answered_message_version", z10);
        SharedPreferences.Editor editor2 = this.f69229b;
        e0.checkNotNull(editor2);
        editor2.commit();
    }

    public final void setUid(String uid) {
        e0.checkNotNullParameter(uid, "uid");
        this.f69233f = uid;
        SharedPreferences.Editor editor = this.f69229b;
        if (editor != null) {
            e0.checkNotNull(editor);
            editor.putString("uid", uid);
            SharedPreferences.Editor editor2 = this.f69229b;
            e0.checkNotNull(editor2);
            editor2.commit();
        }
    }

    public final void boot(Context context, String deviceUid, String str, String str2, String str3, int i10, String nomApp, jb.a pCallback, ExecutorService executorService) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(deviceUid, "deviceUid");
        e0.checkNotNullParameter(nomApp, "nomApp");
        e0.checkNotNullParameter(pCallback, "pCallback");
        this.f69230c = str;
        setUid(deviceUid);
        this.f69231d = str2;
        String country = context.getResources().getConfiguration().getLocales().get(0).getCountry();
        if (country.length() > 3) {
            country = null;
        }
        if (country == null) {
            country = "";
        }
        this.f69232e = country;
        this.f69234g = str3;
        this.f69235h = i10;
        this.f69236i = nomApp;
        k kVar = new k(16, this, context);
        if (executorService != null) {
            executorService.execute(kVar);
        } else {
            new Thread(kVar).start();
        }
    }

    public final void init(Context applicationContext) {
        e0.checkNotNullParameter(applicationContext, "applicationContext");
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("AnalyticsCenterSettings", 0);
        this.f69228a = sharedPreferences;
        e0.checkNotNull(sharedPreferences);
        this.f69229b = sharedPreferences.edit();
        SharedPreferences sharedPreferences2 = this.f69228a;
        if (sharedPreferences2 != null) {
            e0.checkNotNull(sharedPreferences2);
            this.f69230c = sharedPreferences2.getString("mApplication", "");
            SharedPreferences sharedPreferences3 = this.f69228a;
            e0.checkNotNull(sharedPreferences3);
            this.f69233f = sharedPreferences3.getString("uid", "");
            SharedPreferences sharedPreferences4 = this.f69228a;
            e0.checkNotNull(sharedPreferences4);
            this.f69231d = sharedPreferences4.getString(Q6.f35290q, "");
            SharedPreferences sharedPreferences5 = this.f69228a;
            e0.checkNotNull(sharedPreferences5);
            this.f69232e = sharedPreferences5.getString(SUvoXnn.xfbR, "");
            SharedPreferences sharedPreferences6 = this.f69228a;
            e0.checkNotNull(sharedPreferences6);
            this.f69234g = sharedPreferences6.getString("gcmToken", "");
            SharedPreferences sharedPreferences7 = this.f69228a;
            e0.checkNotNull(sharedPreferences7);
            this.f69235h = sharedPreferences7.getInt("paid", 0);
            SharedPreferences sharedPreferences8 = this.f69228a;
            e0.checkNotNull(sharedPreferences8);
            this.f69236i = sharedPreferences8.getString("mNomApp", "");
        }
    }

    public final void push(b bVar, ExecutorService executorService) {
        k kVar = new k(15, this, bVar);
        if (executorService != null) {
            executorService.execute(kVar);
        } else {
            new Thread(kVar).start();
        }
    }
}
