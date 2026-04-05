package qa;

import aa.e;
import aa.f;
import b3.h;
import ca.m;
import com.amazon.device.ads.DtbConstants;
import com.digidust.elokence.akinator.db.accountdb.AccountDatabase;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o5.s0;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import qb.d0;
import sv.j0;
import sv.k0;
import sv.n0;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a extends d0 {

    /* renamed from: h, reason: collision with root package name */
    public String f82648h;

    /* renamed from: i, reason: collision with root package name */
    public String f82649i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f82650j = new ArrayList();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: qa.a$a, reason: collision with other inner class name */
    public static final class C0770a {
        public C0770a(u uVar) {
        }
    }

    static {
        new C0770a(null);
    }

    public static String b(Element element, String str) {
        NodeList elementsByTagName = element.getElementsByTagName(str);
        if (elementsByTagName == null || elementsByTagName.getLength() != 1) {
            return null;
        }
        return elementsByTagName.item(0).getTextContent();
    }

    public final void a(Document document) {
        int i10;
        Integer intOrNull;
        int i11;
        Timber.Forest forest = Timber.Forest;
        int i12 = 0;
        forest.tag("AkDefiWS").d("extractDefisFromXMLString()", new Object[0]);
        if (document == null) {
            if (f.sharedInstance().getDefiDuJourInfos() == null) {
                forest.d("pas encore eu de défi du jour pour la 1ere fois...", new Object[0]);
                return;
            } else {
                forest.d("pas de defi du jour sur les serveurs, on sauvegarde l'actuel", new Object[0]);
                f.sharedInstance().updateDefiCourant(null, 0, null);
                return;
            }
        }
        forest.tag("AkDefiWS").d("doc = " + document, new Object[0]);
        document.getDocumentElement().normalize();
        NodeList elementsByTagName = document.getElementsByTagName("DEFI");
        e0.checkNotNullExpressionValue(elementsByTagName, "getElementsByTagName(...)");
        int length = elementsByTagName.getLength();
        ArrayList arrayList = this.f82650j;
        if (length == 1) {
            Node nodeItem = elementsByTagName.item(0);
            e0.checkNotNull(nodeItem, "null cannot be cast to non-null type org.w3c.dom.Element");
            Element element = (Element) nodeItem;
            NodeList elementsByTagName2 = element.getElementsByTagName("ID_DEFI");
            if (elementsByTagName2 != null && elementsByTagName2.getLength() == 1) {
                this.f82648h = elementsByTagName2.item(0).getTextContent();
                forest.tag("AkDefiWS").d(a.b.k("idDefi = ", this.f82648h), new Object[0]);
                AkApplication.a aVar = AkApplication.f21719f;
                AccountDatabase accountDatabase = (AccountDatabase) s0.databaseBuilder(aVar.getAppContext(), AccountDatabase.class, "accountdb").build();
                if (m.sharedInstance().isUserConnected()) {
                    if (!e0.areEqual(this.f82648h, accountDatabase.getDao().getDefiIdSpecificThemeLang(m.sharedInstance().getCurrentSubject() + "_" + m.sharedInstance().getCurrentLanguage()))) {
                        String str = this.f82648h;
                        e0.checkNotNull(str);
                        BuildersKt__Builders_commonKt.launch$default(aVar.getAppScope(), null, null, new c(str, null), 3, null);
                    }
                }
                aa.c defiDuJourInfos = f.sharedInstance().getDefiDuJourInfos();
                if (defiDuJourInfos != null) {
                    String str2 = this.f82648h;
                    e0.checkNotNull(str2);
                    Integer intOrNull2 = j0.toIntOrNull(str2);
                    if ((intOrNull2 != null ? intOrNull2.intValue() : -1) == defiDuJourInfos.getIdDefi()) {
                        forest.tag("AkDefiWS").d("même défi, on update pas", new Object[0]);
                        return;
                    }
                }
            }
            NodeList elementsByTagName3 = element.getElementsByTagName("TITRE");
            if (elementsByTagName3 != null && elementsByTagName3.getLength() == 1) {
                this.f82649i = elementsByTagName3.item(0).getTextContent();
                forest.tag("AkDefiWS").d(a.b.k("titre = ", this.f82649i), new Object[0]);
            }
            NodeList elementsByTagName4 = element.getElementsByTagName("OBJETS");
            if (elementsByTagName4.getLength() == 1) {
                Node nodeItem2 = elementsByTagName4.item(0);
                e0.checkNotNull(nodeItem2, "null cannot be cast to non-null type org.w3c.dom.Element");
                NodeList elementsByTagName5 = ((Element) nodeItem2).getElementsByTagName("OBJET");
                if (elementsByTagName5.getLength() > 0) {
                    int length2 = elementsByTagName5.getLength();
                    int i13 = 0;
                    while (i13 < length2) {
                        Node nodeItem3 = elementsByTagName5.item(i13);
                        e0.checkNotNull(nodeItem3, "null cannot be cast to non-null type org.w3c.dom.Element");
                        Element element2 = (Element) nodeItem3;
                        String strB = b(element2, "BASE_ID");
                        String strB2 = b(element2, "NOM");
                        String strB3 = b(element2, NativeAdContent.ViewTag.AD_DESCRIPTION);
                        String strB4 = b(element2, "PHOTO_PATH");
                        String strB5 = b(element2, "POURCENTAGE");
                        String strB6 = b(element2, "INDICE");
                        Timber.Tree treeTag = Timber.Forest.tag("AkDefiWS");
                        int i14 = length2;
                        StringBuilder sbB = h.b("baseId = ", strB, ", name = ", strB2, ", desc = ");
                        com.google.android.gms.internal.play_billing.a.B(sbB, strB3, ", pc = ", strB5, ", indice = ");
                        sbB.append(strB6);
                        treeTag.d(sbB.toString(), new Object[0]);
                        try {
                            int i15 = strB != null ? Integer.parseInt(strB) : 0;
                            e0.checkNotNull(strB2);
                            if (strB3 == null) {
                                strB3 = "";
                            }
                            arrayList.add(new e(i15, strB2, strB3, strB4, strB5 != null ? Float.parseFloat(strB5) : 0.0f, false, 0, strB6, 0));
                            i11 = 0;
                        } catch (Exception e10) {
                            i11 = 0;
                            Timber.Forest.tag("AkDefiWS").e("AkDefiWS: extractDefisFromXMLString() Exception: " + e10, new Object[0]);
                            e10.printStackTrace();
                        }
                        i13++;
                        length2 = i14;
                        i12 = i11;
                    }
                    i10 = i12;
                } else {
                    i10 = 0;
                    forest.tag("AkDefiWS").e("extractDefisFromXMLString() : objetNodes (au singulier) length = 0", new Object[0]);
                }
            } else {
                i10 = 0;
                forest.tag("AkDefiWS").e("extractDefisFromXMLString() : objetsNodes (au pluriel) length = %s", Integer.valueOf(elementsByTagName4.getLength()));
            }
        } else {
            i10 = 0;
            forest.tag("AkDefiWS").e("extractDefisFromXMLString() : definodes length = %s", Integer.valueOf(elementsByTagName.getLength()));
        }
        f fVarSharedInstance = f.sharedInstance();
        String str3 = this.f82649i;
        String str4 = this.f82648h;
        fVarSharedInstance.updateDefiCourant(str3, (str4 == null || (intOrNull = j0.toIntOrNull(str4)) == null) ? i10 : intOrNull.intValue(), arrayList);
    }

    public final void configureAndCall() {
        try {
            lb.c currentInstance = m.sharedInstance().getCurrentInstance();
            e0.checkNotNull(currentInstance);
            addParameter("base_logique_id", String.valueOf(currentInstance.getBaseLogiqueId()));
            Timber.Forest forest = Timber.Forest;
            forest.tag("AkDefiWS").d("Lancement du call...", new Object[0]);
            int iCall = call();
            if (iCall != 0) {
                forest.tag("AkDefiWS").e("AkDefiWS: Erreur technique. Code=" + iCall, new Object[0]);
                return;
            }
            forest.tag("AkDefiWS").d("AkDefiWS: Requête réussie, check final sur idDefi=" + this.f82648h + ", titre=" + this.f82649i, new Object[0]);
        } catch (Exception e10) {
            Timber.Forest.tag("AkDefiWS").e(a.b.k("AkDefiWS: Erreur dans la construction de l’URL : ", e10.getMessage()), new Object[0]);
        }
    }

    @Override // qb.d0
    public int getMTimeout() {
        return DtbConstants.NETWORK_READ_TIMEOUT;
    }

    @Override // qb.d0
    public String getMUrl() {
        return "https://defi.akinator.com/get_new_defi";
    }

    @Override // qb.d0
    public int parseWSResponse(String response) throws ParserConfigurationException, SAXException, DOMException, IOException {
        Document document;
        e0.checkNotNullParameter(response, "response");
        try {
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            e0.checkNotNullExpressionValue(documentBuilderFactoryNewInstance, "newInstance(...)");
            DocumentBuilder documentBuilderNewDocumentBuilder = documentBuilderFactoryNewInstance.newDocumentBuilder();
            e0.checkNotNullExpressionValue(documentBuilderNewDocumentBuilder, "newDocumentBuilder(...)");
            document = documentBuilderNewDocumentBuilder.parse(new InputSource(new StringReader(response)));
        } catch (Exception e10) {
            Timber.Forest.tag("AkDefiWS").e("AkDefiWS: parseXml() Exception: " + e10, new Object[0]);
            document = null;
        }
        if (document == null) {
            Timber.Forest.tag("AkDefiWS").e("Impossible de parser le XML", new Object[0]);
            return 400;
        }
        Timber.Forest forest = Timber.Forest;
        forest.d(a.b.k("AkDefiWS: Réponse XML = ", response), new Object[0]);
        try {
            if (document.hasChildNodes()) {
                document.getDocumentElement().normalize();
                String textContent = document.getElementsByTagName("COMPLETION").item(0).getTextContent();
                e0.checkNotNull(textContent);
                if (n0.contains$default((CharSequence) textContent, (CharSequence) "OK", false, 2, (Object) null)) {
                    forest.tag("AkDefiWS").d("Défi disponible", new Object[0]);
                    a(document);
                } else if (!k0.startsWith$default(textContent, "KO", false, 2, null) && k0.startsWith$default(textContent, "WARN", false, 2, null)) {
                    if (n0.contains$default((CharSequence) textContent, (CharSequence) "NO CHALLENGE TODAY", false, 2, (Object) null)) {
                        forest.tag("AkDefiWS").d("Pas de défi aujourd'hui", new Object[0]);
                        a(null);
                    } else {
                        forest.tag("TestUrl").e("error in <Completion> : %s", textContent);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return 0;
    }
}
