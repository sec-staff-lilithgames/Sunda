package lb;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Properties;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import p0.o2;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class b1 {

    /* renamed from: d, reason: collision with root package name */
    public static final a f72741d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final String f72742e = "https://traductions.clarinea.fr/languages/list/mobile/<appid>";

    /* renamed from: f, reason: collision with root package name */
    public static final String f72743f = "https://traductions.clarinea.fr/<lang>/<appid>/traduction.php";

    /* renamed from: g, reason: collision with root package name */
    public static b1 f72744g;

    /* renamed from: h, reason: collision with root package name */
    public static String f72745h;

    /* renamed from: i, reason: collision with root package name */
    public static String f72746i;

    /* renamed from: a, reason: collision with root package name */
    public Context f72747a;

    /* renamed from: b, reason: collision with root package name */
    public SharedPreferences f72748b;

    /* renamed from: c, reason: collision with root package name */
    public SharedPreferences.Editor f72749c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final b1 sharedInstance() {
            if (b1.f72744g == null) {
                b1.f72744g = new b1(null);
            }
            b1 b1Var = b1.f72744g;
            kotlin.jvm.internal.e0.checkNotNull(b1Var);
            return b1Var;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f72750a;

        /* renamed from: b, reason: collision with root package name */
        public final String f72751b;

        /* renamed from: c, reason: collision with root package name */
        public final String f72752c;

        /* renamed from: d, reason: collision with root package name */
        public final String f72753d;

        /* renamed from: e, reason: collision with root package name */
        public final String f72754e;

        /* renamed from: f, reason: collision with root package name */
        public final String f72755f;

        /* renamed from: g, reason: collision with root package name */
        public final String f72756g;

        public b(String code, String label, String flagUrl, String str, String lastWsSync, String fontCoeffAndroid, String smartphoneFont) {
            kotlin.jvm.internal.e0.checkNotNullParameter(code, "code");
            kotlin.jvm.internal.e0.checkNotNullParameter(label, "label");
            kotlin.jvm.internal.e0.checkNotNullParameter(flagUrl, "flagUrl");
            kotlin.jvm.internal.e0.checkNotNullParameter(lastWsSync, "lastWsSync");
            kotlin.jvm.internal.e0.checkNotNullParameter(fontCoeffAndroid, "fontCoeffAndroid");
            kotlin.jvm.internal.e0.checkNotNullParameter(smartphoneFont, "smartphoneFont");
            this.f72750a = code;
            this.f72751b = label;
            this.f72752c = flagUrl;
            this.f72753d = str;
            this.f72754e = lastWsSync;
            this.f72755f = fontCoeffAndroid;
            this.f72756g = smartphoneFont;
        }

        public final String getCode() {
            return this.f72750a;
        }

        public final String getFlagUrl() {
            return this.f72752c;
        }

        public final String getFontCoeffAndroid() {
            return this.f72755f;
        }

        public final String getLabel() {
            return this.f72751b;
        }

        public final String getLastTokensSync() {
            return this.f72753d;
        }

        public final String getLastWsSync() {
            return this.f72754e;
        }

        public final String getSmartphoneFont() {
            return this.f72756g;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("AkLanguageModel [mCode=");
            sb2.append(this.f72750a);
            sb2.append(", mLabel=");
            sb2.append(this.f72751b);
            sb2.append(", mFlagUrl=");
            sb2.append(this.f72752c);
            sb2.append(", mLastTokensSync=");
            sb2.append(this.f72753d);
            sb2.append(", mLastWsSync=");
            sb2.append(this.f72754e);
            sb2.append(", mFontCoeffAndroid=");
            sb2.append(this.f72755f);
            sb2.append(", mSmartphoneFont=");
            return o2.q(sb2, this.f72756g, AbstractJsonLexerKt.END_LIST);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public String f72757a;

        /* renamed from: b, reason: collision with root package name */
        public String f72758b;

        /* renamed from: c, reason: collision with root package name */
        public String f72759c;

        /* renamed from: d, reason: collision with root package name */
        public String f72760d;

        public c(String pCodeLang, String pTradsAppId, String pMarker, String pLabel) {
            kotlin.jvm.internal.e0.checkNotNullParameter(pCodeLang, "pCodeLang");
            kotlin.jvm.internal.e0.checkNotNullParameter(pTradsAppId, "pTradsAppId");
            kotlin.jvm.internal.e0.checkNotNullParameter(pMarker, "pMarker");
            kotlin.jvm.internal.e0.checkNotNullParameter(pLabel, "pLabel");
            this.f72757a = pCodeLang;
            this.f72758b = pTradsAppId;
            this.f72759c = pMarker;
            this.f72760d = pLabel;
        }

        public final String getCode() {
            String str = this.f72757a;
            kotlin.jvm.internal.e0.checkNotNull(str);
            return str;
        }

        public final String getLabel() {
            String str = this.f72760d;
            kotlin.jvm.internal.e0.checkNotNull(str);
            return str;
        }

        public final String getMarker() {
            String str = this.f72759c;
            kotlin.jvm.internal.e0.checkNotNull(str);
            return str;
        }

        public final String getTradsAppId() {
            String str = this.f72758b;
            kotlin.jvm.internal.e0.checkNotNull(str);
            return str;
        }

        public final void setCode(String pCodeLang) {
            kotlin.jvm.internal.e0.checkNotNullParameter(pCodeLang, "pCodeLang");
            this.f72757a = pCodeLang;
        }

        public final void setLabel(String label) {
            kotlin.jvm.internal.e0.checkNotNullParameter(label, "label");
            this.f72760d = label;
        }

        public final void setMarker(String marker) {
            kotlin.jvm.internal.e0.checkNotNullParameter(marker, "marker");
            this.f72759c = marker;
        }

        public final void setTradsAppId(String pTradsAppId) {
            kotlin.jvm.internal.e0.checkNotNullParameter(pTradsAppId, "pTradsAppId");
            this.f72758b = pTradsAppId;
        }

        public String toString() {
            return this.f72759c + " = " + this.f72760d;
        }
    }

    public b1(kotlin.jvm.internal.u uVar) {
    }

    public static int a(Document document, ArrayList arrayList) throws DOMException {
        NodeList elementsByTagName;
        try {
            document.getDocumentElement().normalize();
            elementsByTagName = document.getElementsByTagName("LANGUAGE");
        } catch (Exception e10) {
            Timber.Forest.tag("TraductionFactory").e(e10, "extractLanguageListFromXMLString: Exception while parsing XML", new Object[0]);
        }
        if (elementsByTagName == null) {
            Timber.Forest.tag("TraductionFactory").e("LANGUAGE node not present", new Object[0]);
            return 400;
        }
        int length = elementsByTagName.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            Node nodeItem = elementsByTagName.item(i10);
            kotlin.jvm.internal.e0.checkNotNull(nodeItem, "null cannot be cast to non-null type org.w3c.dom.Element");
            Node nodeItem2 = ((Element) nodeItem).getElementsByTagName("LANG_ID").item(0);
            kotlin.jvm.internal.e0.checkNotNull(nodeItem2, "null cannot be cast to non-null type org.w3c.dom.Element");
            String textContent = ((Element) nodeItem2).getTextContent();
            Node nodeItem3 = ((Element) nodeItem).getElementsByTagName("LANG_LABEL").item(0);
            kotlin.jvm.internal.e0.checkNotNull(nodeItem3, "null cannot be cast to non-null type org.w3c.dom.Element");
            String textContent2 = ((Element) nodeItem3).getTextContent();
            Node nodeItem4 = ((Element) nodeItem).getElementsByTagName("LANG_FLAG_URL").item(0);
            kotlin.jvm.internal.e0.checkNotNull(nodeItem4, "null cannot be cast to non-null type org.w3c.dom.Element");
            String textContent3 = ((Element) nodeItem4).getTextContent();
            Node nodeItem5 = ((Element) nodeItem).getElementsByTagName("LANG_LAST_SYNC_DATE").item(0);
            kotlin.jvm.internal.e0.checkNotNull(nodeItem5, "null cannot be cast to non-null type org.w3c.dom.Element");
            String textContent4 = ((Element) nodeItem5).getTextContent();
            Node nodeItem6 = ((Element) nodeItem).getElementsByTagName("LANG_FONT_COEF_ANDROID").item(0);
            kotlin.jvm.internal.e0.checkNotNull(nodeItem6, "null cannot be cast to non-null type org.w3c.dom.Element");
            String textContent5 = ((Element) nodeItem6).getTextContent();
            Node nodeItem7 = ((Element) nodeItem).getElementsByTagName("LANG_SMARTPHONE_FONT").item(0);
            kotlin.jvm.internal.e0.checkNotNull(nodeItem7, "null cannot be cast to non-null type org.w3c.dom.Element");
            String textContent6 = ((Element) nodeItem7).getTextContent();
            kotlin.jvm.internal.e0.checkNotNull(textContent);
            kotlin.jvm.internal.e0.checkNotNull(textContent2);
            kotlin.jvm.internal.e0.checkNotNull(textContent3);
            kotlin.jvm.internal.e0.checkNotNull(textContent4);
            kotlin.jvm.internal.e0.checkNotNull(textContent5);
            kotlin.jvm.internal.e0.checkNotNull(textContent6);
            arrayList.add(new b(textContent, textContent2, textContent3, null, textContent4, textContent5, textContent6));
        }
        try {
            mb.a.sharedInstance().saveOrUpdateAllLanguages(arrayList);
        } catch (Exception e11) {
            Timber.Forest.tag("TraductionFactory").e(e11, "extractLanguageListFromXMLString: Exception while saving languages in DB", new Object[0]);
        }
        Timber.Forest.tag("TraductionFactory").d("Nb languages found : %s", Integer.valueOf(arrayList.size()));
        return 0;
    }

    public static final b1 sharedInstance() {
        return f72741d.sharedInstance();
    }

    public final String b(String str, String str2) throws IOException {
        Properties properties = new Properties();
        try {
            Context context = this.f72747a;
            kotlin.jvm.internal.e0.checkNotNull(context);
            InputStream inputStreamOpen = context.getAssets().open("tokens_" + str2 + ".properties");
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
            properties.load(inputStreamOpen);
            str = properties.getProperty(str, str);
            inputStreamOpen.close();
            return str;
        } catch (IOException e10) {
            Timber.Forest.tag("TraductionFactory").e(e10, "getTraductionFromDefaultFile: Exception while loading default tokens file", new Object[0]);
            return str;
        }
    }

    public final int createTraductionFactory(ArrayList<b> listLanguage, String appId) throws SAXException, IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(listLanguage, "listLanguage");
        kotlin.jvm.internal.e0.checkNotNullParameter(appId, "appId");
        Timber.Forest forest = Timber.Forest;
        forest.tag("TraductionFactory").d("createTraductionFactory appId= %s", appId);
        if (this.f72747a == null) {
            forest.tag("TraductionFactory").e("createTraductionFactory -> mApplicationContext is null", new Object[0]);
            return 100;
        }
        String strTryToConnectWithLoadBalancing = a1.TryToConnectWithLoadBalancing(sv.k0.replace$default(f72742e, "<appid>", appId, false, 4, (Object) null), 30000);
        if (strTryToConnectWithLoadBalancing == null) {
            forest.tag("TraductionFactory").e("createTraductionFactory -> TryToConnectWithLoadBalancing return null XML", new Object[0]);
            ArrayList<b> listOfLanguages = getListOfLanguages();
            if (listOfLanguages.isEmpty()) {
                forest.tag("TraductionFactory").e("listOfLanguageModel vide", new Object[0]);
                return 400;
            }
            forest.tag("TraductionFactory").d("Using languages in DB", new Object[0]);
            listLanguage.addAll(listOfLanguages);
            return 0;
        }
        try {
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(strTryToConnectWithLoadBalancing)));
            if (a1.testNodeCompletion(document) == 0) {
                kotlin.jvm.internal.e0.checkNotNull(document);
                return a(document, listLanguage);
            }
            ArrayList<b> listOfLanguages2 = getListOfLanguages();
            if (listOfLanguages2.isEmpty()) {
                forest.tag("TraductionFactory").e("listOfLanguageModel vide", new Object[0]);
                return 400;
            }
            forest.tag("TraductionFactory").d("Using languages in DB", new Object[0]);
            listLanguage.addAll(listOfLanguages2);
            return 0;
        } catch (IOException e10) {
            Timber.Forest.tag("TraductionFactory").e(e10, "createTraductionFactory: Exception while parsing XML", new Object[0]);
            return 400;
        } catch (ParserConfigurationException e11) {
            Timber.Forest.tag("TraductionFactory").e(e11, "createTraductionFactory: Exception while parsing XML", new Object[0]);
            return 400;
        } catch (DOMException e12) {
            Timber.Forest.tag("TraductionFactory").e(e12, "createTraductionFactory: Exception while parsing XML", new Object[0]);
            return 400;
        } catch (SAXException e13) {
            Timber.Forest.tag("TraductionFactory").e(e13, "createTraductionFactory: Exception while parsing XML", new Object[0]);
            return 400;
        }
    }

    public final String getApplicationLanguage() {
        SharedPreferences sharedPreferences = this.f72748b;
        if (sharedPreferences == null) {
            return null;
        }
        kotlin.jvm.internal.e0.checkNotNull(sharedPreferences);
        return sharedPreferences.getString("kayLang", null);
    }

    public final String getApplicationLanguageLabel() {
        if (getApplicationLanguage() == null) {
            return "";
        }
        mb.a aVarSharedInstance = mb.a.sharedInstance();
        String applicationLanguage = getApplicationLanguage();
        kotlin.jvm.internal.e0.checkNotNull(applicationLanguage);
        b language = aVarSharedInstance.getLanguage(applicationLanguage);
        return language == null ? "" : language.getLabel();
    }

    public final String getApplicationTradsId() {
        SharedPreferences sharedPreferences = this.f72748b;
        kotlin.jvm.internal.e0.checkNotNull(sharedPreferences);
        return sharedPreferences.getString("kayTAID", null);
    }

    public final ArrayList<b> getListOfLanguages() {
        ArrayList<b> allLanguages = mb.a.sharedInstance().getAllLanguages();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(allLanguages, "getAllLanguages(...)");
        return allLanguages;
    }

    public final String getTraductionFromToken(String token) {
        c token2;
        kotlin.jvm.internal.e0.checkNotNullParameter(token, "token");
        if (this.f72747a == null) {
            return token;
        }
        if (f72745h == null) {
            return b(token, "en");
        }
        try {
            mb.a aVarSharedInstance = mb.a.sharedInstance();
            String str = f72745h;
            kotlin.jvm.internal.e0.checkNotNull(str);
            String str2 = f72746i;
            kotlin.jvm.internal.e0.checkNotNull(str2);
            token2 = aVarSharedInstance.getToken(str, str2, token);
        } catch (Exception unused) {
            token2 = null;
        }
        return token2 == null ? b(token, f72745h) : token2.getLabel();
    }

    public final Object getTraductionFromTokenSuspend(String str, zu.d<? super String> dVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new c1(this, str, null), dVar);
    }

    public final void init(Context appContext) {
        kotlin.jvm.internal.e0.checkNotNullParameter(appContext, "appContext");
        this.f72747a = appContext;
        mb.a.sharedInstance().init(appContext);
        if (this.f72748b == null) {
            Context context = this.f72747a;
            if (context == null) {
                Timber.Forest.tag("TraductionFactory").e("restoreLanguage -> mApplicationContext is null", new Object[0]);
                return;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("TraductionSettings", 0);
            this.f72748b = sharedPreferences;
            if (sharedPreferences == null) {
                Timber.Forest.tag("TraductionFactory").e("restoreLanguage -> settings is null", new Object[0]);
                return;
            }
            kotlin.jvm.internal.e0.checkNotNull(sharedPreferences);
            f72745h = sharedPreferences.getString("kayLang", null);
            SharedPreferences sharedPreferences2 = this.f72748b;
            kotlin.jvm.internal.e0.checkNotNull(sharedPreferences2);
            f72746i = sharedPreferences2.getString("kayTAID", null);
            SharedPreferences sharedPreferences3 = this.f72748b;
            kotlin.jvm.internal.e0.checkNotNull(sharedPreferences3);
            this.f72749c = sharedPreferences3.edit();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int setApplicationLanguage(java.lang.String r18, int r19) throws java.io.IOException, java.text.ParseException {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.b1.setApplicationLanguage(java.lang.String, int):int");
    }
}
