package qa;

import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import b3.h;
import ca.m;
import ca.o;
import com.digidust.elokence.akinator.factories.AkApplication;
import java.io.StringReader;
import java.util.Locale;
import javax.xml.parsers.DocumentBuilderFactory;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import lb.b1;
import lb.s0;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import qb.c0;
import qb.d0;
import sv.n0;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d extends d0 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f82654j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    public static d f82655k;

    /* renamed from: h, reason: collision with root package name */
    public int f82656h;

    /* renamed from: i, reason: collision with root package name */
    public String f82657i = "";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final d sharedInstance() {
            if (d.f82655k == null) {
                d.f82655k = new d(null);
            }
            d dVar = d.f82655k;
            e0.checkNotNull(dVar);
            return dVar;
        }
    }

    public d(u uVar) {
    }

    public static int a(Document document) throws DOMException {
        document.getDocumentElement().normalize();
        NodeList elementsByTagName = document.getElementsByTagName("PUB");
        e0.checkNotNullExpressionValue(elementsByTagName, "getElementsByTagName(...)");
        if (elementsByTagName.getLength() <= 0) {
            return 0;
        }
        Node nodeItem = elementsByTagName.item(0);
        e0.checkNotNullExpressionValue(nodeItem, "item(...)");
        Element element = (Element) nodeItem;
        Node nodeItem2 = element.getElementsByTagName("STATE").item(0);
        e0.checkNotNull(nodeItem2, "null cannot be cast to non-null type org.w3c.dom.Element");
        if (!e0.areEqual(((Element) nodeItem2).getTextContent(), "OK")) {
            m.sharedInstance().setHomeBannerAvailable(false);
            o.sharedInstance().setHomeBannerDate("");
            o.sharedInstance().setHomeBannerText("");
            o.sharedInstance().setHomeBannerUrl("");
            o.sharedInstance().setBase64Image(null);
            return 400;
        }
        Node nodeItem3 = element.getElementsByTagName("CONTENT").item(0);
        e0.checkNotNull(nodeItem3, "null cannot be cast to non-null type org.w3c.dom.Element");
        String textContent = ((Element) nodeItem3).getTextContent();
        Node nodeItem4 = element.getElementsByTagName("LINK").item(0);
        e0.checkNotNull(nodeItem4, "null cannot be cast to non-null type org.w3c.dom.Element");
        String textContent2 = ((Element) nodeItem4).getTextContent();
        Node nodeItem5 = element.getElementsByTagName("IMG").item(0);
        Element element2 = nodeItem5 instanceof Element ? (Element) nodeItem5 : null;
        if (element2 != null) {
            String textContent3 = element2.getTextContent();
            if (textContent3 == null || textContent3.length() == 0) {
                o.sharedInstance().setBase64Image(null);
            } else {
                o.sharedInstance().setBase64Image(textContent3);
            }
        }
        o.sharedInstance().setHomeBannerText(textContent);
        o.sharedInstance().setHomeBannerUrl(textContent2);
        m.sharedInstance().setHomeBannerOpened(true);
        m.sharedInstance().setHomeBannerAvailable(true);
        return 0;
    }

    public static final d sharedInstance() {
        return f82654j.sharedInstance();
    }

    public final int callWebservice() {
        Timber.Forest forest = Timber.Forest;
        forest.tag("Banerinou").d("AkHomeBannerWS - callWebservice %s", this.f82657i);
        if (!n0.isBlank(this.f82657i)) {
            return super.call();
        }
        forest.e("URL is empty, call init(...) first.", new Object[0]);
        return 400;
    }

    @Override // qb.d0
    public int getMTimeout() {
        return 20000;
    }

    @Override // qb.d0
    public String getMUrl() {
        return this.f82657i;
    }

    public final void init(int i10) {
        this.f82656h = i10;
        String applicationLanguage = b1.f72741d.sharedInstance().getApplicationLanguage();
        String country = Locale.getDefault().getCountry();
        int partnerId = s0.f72971j.sharedInstance().getPartnerId();
        int i11 = this.f82656h;
        StringBuilder sbB = h.b("https://traductions.clarinea.fr/pub/akinator/", applicationLanguage, "/", country, "?partner_id=");
        sbB.append(partnerId);
        sbB.append("&img_width=");
        sbB.append(i11);
        this.f82657i = sbB.toString();
    }

    @Override // qb.d0
    public int parseWSResponse(String response) {
        Intent intent;
        e0.checkNotNullParameter(response, "response");
        Timber.Forest forest = Timber.Forest;
        forest.tag("Banerinou").d("AkHomeBannerWS - parseWSResponse", new Object[0]);
        int iA = 400;
        try {
            try {
                Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(response)));
                e0.checkNotNullExpressionValue(document, "parse(...)");
                if (c0.testNodeCompletion(document) == 0) {
                    iA = a(document);
                } else {
                    forest.e("nodecompletion KO", new Object[0]);
                    m.sharedInstance().setHomeBannerAvailable(false);
                }
                forest.tag("Banerinou").d("AkHomeBannerWS - parseWSResponse - finally", new Object[0]);
                intent = new Intent("com.example.NEW_COMMUNICATION");
            } catch (Exception e10) {
                e10.printStackTrace();
                m.sharedInstance().setHomeBannerAvailable(false);
                Timber.Forest.tag("Banerinou").d("AkHomeBannerWS - parseWSResponse - finally", new Object[0]);
                intent = new Intent("com.example.NEW_COMMUNICATION");
            }
            LocalBroadcastManager.getInstance(AkApplication.f21719f.getAppContext()).sendBroadcast(intent);
            return iA;
        } catch (Throwable th2) {
            Timber.Forest.tag("Banerinou").d("AkHomeBannerWS - parseWSResponse - finally", new Object[0]);
            LocalBroadcastManager.getInstance(AkApplication.f21719f.getAppContext()).sendBroadcast(new Intent("com.example.NEW_COMMUNICATION"));
            throw th2;
        }
    }
}
