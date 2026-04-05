package qb;

import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Random;
import javax.xml.parsers.DocumentBuilderFactory;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import sv.k0;
import sv.n0;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class c0 {
    public static final String getXML(String urlToTest, int i10) throws IOException {
        HttpURLConnection httpURLConnection;
        String inputStreamToString;
        kotlin.jvm.internal.e0.checkNotNullParameter(urlToTest, "urlToTest");
        String str = null;
        try {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(urlToTest).openConnection();
                kotlin.jvm.internal.e0.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setDoInput(true);
                httpURLConnection.setConnectTimeout(i10);
                httpURLConnection.setReadTimeout(i10);
                httpURLConnection.connect();
                inputStreamToString = httpURLConnection.getResponseCode() == 200 ? readInputStreamToString(httpURLConnection) : null;
            } catch (Exception e10) {
                e = e10;
            }
        } catch (UnknownHostException unused) {
            return str;
        }
        try {
            httpURLConnection.disconnect();
            return inputStreamToString;
        } catch (Exception e11) {
            e = e11;
            str = inputStreamToString;
            Timber.Forest.tag("TestUrl").e(e, "Error in getXML", new Object[0]);
            return str;
        }
    }

    public static final boolean pingUrl(String urlToTest) throws SAXException, IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(urlToTest, "urlToTest");
        try {
            URLConnection uRLConnectionOpenConnection = new URL(urlToTest + "/ping.php").openConnection();
            kotlin.jvm.internal.e0.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDoInput(true);
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(15000);
            httpURLConnection.connect();
            String inputStreamToString = httpURLConnection.getResponseCode() == 200 ? readInputStreamToString(httpURLConnection) : null;
            httpURLConnection.disconnect();
            if (inputStreamToString != null) {
                Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(inputStreamToString)));
                document.normalize();
                NodeList elementsByTagName = document.getElementsByTagName("COMPLETION");
                if (elementsByTagName != null) {
                    return kotlin.jvm.internal.e0.areEqual(elementsByTagName.item(0).getTextContent(), "OK");
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static final String readInputStreamToString(HttpURLConnection connection) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        try {
            InputStream inputStream = connection.getInputStream();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, sv.g.f86134b), Segment.SIZE);
            try {
                String text = gv.y.readText(bufferedReader);
                gv.d.closeFinally(bufferedReader, null);
                return text;
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static final int testNodeCompletion(JSONObject obj) throws JSONException {
        String string;
        kotlin.jvm.internal.e0.checkNotNullParameter(obj, "obj");
        try {
            string = obj.getString("completion");
            kotlin.jvm.internal.e0.checkNotNull(string);
        } catch (JSONException unused) {
        }
        if (n0.contains$default((CharSequence) string, (CharSequence) "OK", false, 2, (Object) null)) {
            return n0.contains$default((CharSequence) string, (CharSequence) "NO TRAP", false, 2, (Object) null) ? 900 : 0;
        }
        if (!k0.startsWith$default(string, "KO", false, 2, null)) {
            if (k0.startsWith$default(string, "WARN", false, 2, null)) {
                if (n0.contains$default((CharSequence) string, (CharSequence) "NO QUESTION", false, 2, (Object) null)) {
                    return 300;
                }
                return n0.contains$default((CharSequence) string, (CharSequence) "UNABLE TO PLAY", false, 2, (Object) null) ? 800 : 0;
            }
            return 400;
        }
        Timber.Forest.tag("TestUrl").e("KO in completion: " + string, new Object[0]);
        String string2 = obj.getString(PglCryptUtils.KEY_MESSAGE);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string2, "getString(...)");
        if (n0.contains$default((CharSequence) string2, (CharSequence) "BAD FILE EXTENSION", false, 2, (Object) null)) {
            return 110;
        }
        String string3 = obj.getString(PglCryptUtils.KEY_MESSAGE);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string3, "getString(...)");
        if (n0.contains$default((CharSequence) string3, (CharSequence) "BAD MEDIA ID OR FOOTPRINT", false, 2, (Object) null)) {
            return AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL;
        }
        String string4 = obj.getString(PglCryptUtils.KEY_MESSAGE);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string4, "getString(...)");
        if (n0.contains$default((CharSequence) string4, (CharSequence) "TECHNICAL ERROR", false, 2, (Object) null)) {
            return 400;
        }
        String string5 = obj.getString(PglCryptUtils.KEY_MESSAGE);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string5, "getString(...)");
        if (n0.contains$default((CharSequence) string5, (CharSequence) "ENGINE REFUSAL", false, 2, (Object) null)) {
            return 500;
        }
        String string6 = obj.getString(PglCryptUtils.KEY_MESSAGE);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string6, "getString(...)");
        if (n0.contains$default((CharSequence) string6, (CharSequence) "TIMEOUT", false, 2, (Object) null)) {
            return 600;
        }
        String string7 = obj.getString(PglCryptUtils.KEY_MESSAGE);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string7, "getString(...)");
        if (n0.contains$default((CharSequence) string7, (CharSequence) "SERVER DOWN", false, 2, (Object) null)) {
            return IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED;
        }
        String string8 = obj.getString(PglCryptUtils.KEY_MESSAGE);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string8, "getString(...)");
        if (n0.contains$default((CharSequence) string8, (CharSequence) "VALIDATION", false, 2, (Object) null)) {
            return 130;
        }
        String string9 = obj.getString(PglCryptUtils.KEY_MESSAGE);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string9, "getString(...)");
        if (n0.contains$default((CharSequence) string9, (CharSequence) "USER EXISTANT", false, 2, (Object) null)) {
            return -10;
        }
        String string10 = obj.getString(PglCryptUtils.KEY_MESSAGE);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string10, "getString(...)");
        if (n0.contains$default((CharSequence) string10, (CharSequence) PtLatqAYjEFT.BjPoskpVwpU, false, 2, (Object) null)) {
            return -30;
        }
        String string11 = obj.getString(PglCryptUtils.KEY_MESSAGE);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string11, "getString(...)");
        if (n0.contains$default((CharSequence) string11, (CharSequence) "PLEASE LOG IN", false, 2, (Object) null)) {
            return -60;
        }
        String string12 = obj.getString(PglCryptUtils.KEY_MESSAGE);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string12, "getString(...)");
        if (n0.contains$default((CharSequence) string12, (CharSequence) "WRONG PASSWORD", false, 2, (Object) null)) {
            return -50;
        }
        String string13 = obj.getString(PglCryptUtils.KEY_MESSAGE);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string13, "getString(...)");
        if (n0.contains$default((CharSequence) string13, (CharSequence) "INCORRECT PASSWORD", false, 2, (Object) null)) {
            return -20;
        }
        String string14 = obj.getString(PglCryptUtils.KEY_MESSAGE);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string14, "getString(...)");
        if (n0.contains$default((CharSequence) string14, (CharSequence) "ACCOUNT NOT ENABLED", false, 2, (Object) null)) {
            return -70;
        }
        String string15 = obj.getString(PglCryptUtils.KEY_MESSAGE);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string15, "getString(...)");
        if (n0.contains$default((CharSequence) string15, (CharSequence) "ACCOUNT LOCKED", false, 2, (Object) null)) {
            return -80;
        }
        String string16 = obj.getString(PglCryptUtils.KEY_MESSAGE);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string16, "getString(...)");
        return n0.contains$default((CharSequence) string16, (CharSequence) "EMAIL ALREADY USED", false, 2, (Object) null) ? -100 : 400;
    }

    public static final String tryToConnectWithLoadBalancing(String urlToTest, int i10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(urlToTest, "urlToTest");
        int iNextInt = new Random().nextInt(4);
        int i11 = 1;
        String inputStreamToString = null;
        while (true) {
            String str = urlToTest;
            String strReplace$default = k0.replace$default(str, "<variable>", String.valueOf(iNextInt), false, 4, (Object) null);
            Timber.Forest forest = Timber.Forest;
            forest.tag("TestUrl").d(a.b.k("urlToTest: ", strReplace$default), new Object[0]);
            try {
                URLConnection uRLConnectionOpenConnection = new URL(strReplace$default).openConnection();
                kotlin.jvm.internal.e0.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setDoInput(true);
                httpURLConnection.setConnectTimeout(i10);
                httpURLConnection.setReadTimeout(i10);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 200) {
                    inputStreamToString = readInputStreamToString(httpURLConnection);
                    forest.tag("TestUrl").d("XML returned: " + inputStreamToString, new Object[0]);
                }
                httpURLConnection.disconnect();
            } catch (UnknownHostException unused) {
                Timber.Forest.tag("TestUrl").e("Unknown host", new Object[0]);
                return null;
            } catch (Exception e10) {
                Timber.Forest.tag("TestUrl").e(e10, "Error", new Object[0]);
            }
            if (i11 == 4) {
                break;
            }
            iNextInt = (iNextInt + 1) % 4;
            i11++;
            if (inputStreamToString != null || i11 > 4) {
                break;
            }
            urlToTest = str;
        }
        return inputStreamToString;
    }

    public static final int testNodeCompletion(String sCompletionStatus) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sCompletionStatus, "sCompletionStatus");
        if (n0.contains$default((CharSequence) sCompletionStatus, (CharSequence) "OK", false, 2, (Object) null)) {
            return n0.contains$default((CharSequence) sCompletionStatus, (CharSequence) "NO TRAP", false, 2, (Object) null) ? 900 : 0;
        }
        if (k0.startsWith$default(sCompletionStatus, "KO", false, 2, null)) {
            Timber.Forest.tag("TestUrl").e(a.b.k("KO in completion: ", sCompletionStatus), new Object[0]);
            if (n0.contains$default((CharSequence) sCompletionStatus, (CharSequence) "BAD FILE EXTENSION", false, 2, (Object) null)) {
                return 110;
            }
            if (n0.contains$default((CharSequence) sCompletionStatus, (CharSequence) "BAD MEDIA ID OR FOOTPRINT", false, 2, (Object) null)) {
                return AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL;
            }
            if (n0.contains$default((CharSequence) sCompletionStatus, (CharSequence) "TECHNICAL ERROR", false, 2, (Object) null)) {
                return 400;
            }
            if (n0.contains$default((CharSequence) sCompletionStatus, (CharSequence) "ENGINE REFUSAL", false, 2, (Object) null)) {
                return 500;
            }
            if (n0.contains$default((CharSequence) sCompletionStatus, (CharSequence) "TIMEOUT", false, 2, (Object) null)) {
                return 210;
            }
            return n0.contains$default((CharSequence) sCompletionStatus, (CharSequence) "SERVER DOWN", false, 2, (Object) null) ? IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED : n0.contains$default((CharSequence) sCompletionStatus, (CharSequence) "VALIDATION", false, 2, (Object) null) ? 130 : 400;
        }
        if (!k0.startsWith$default(sCompletionStatus, "WARN", false, 2, null)) {
            return 400;
        }
        if (n0.contains$default((CharSequence) sCompletionStatus, (CharSequence) "NO QUESTION", false, 2, (Object) null)) {
            return 300;
        }
        return n0.contains$default((CharSequence) sCompletionStatus, (CharSequence) "UNABLE TO PLAY", false, 2, (Object) null) ? 800 : 0;
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
                Timber.Forest.tag("TestUrl").e("Parsing error", new Object[0]);
            } catch (Exception unused) {
            }
        } else {
            Timber.Forest.tag("TestUrl").e("Parsing error", new Object[0]);
        }
        return 400;
    }
}
