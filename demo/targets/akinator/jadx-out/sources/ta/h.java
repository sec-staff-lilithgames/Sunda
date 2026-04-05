package ta;

import android.util.Pair;
import com.amazon.device.ads.DtbConstants;
import java.io.StringReader;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.ListIterator;
import javax.xml.parsers.DocumentBuilderFactory;
import kotlin.jvm.internal.e0;
import lb.a1;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import sv.x;
import uu.p0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f86658a = new h();

    public static int a(Element element, String str) throws DOMException {
        NodeList elementsByTagName = element.getElementsByTagName(str);
        if (elementsByTagName == null || elementsByTagName.getLength() != 1) {
            return 0;
        }
        String textContent = elementsByTagName.item(0).getTextContent();
        e0.checkNotNullExpressionValue(textContent, "getTextContent(...)");
        return Integer.parseInt(textContent);
    }

    public static ArrayList b(Document document) throws DOMException, NumberFormatException {
        NodeList elementsByTagName;
        String str;
        List listEmptyList;
        document.getDocumentElement().normalize();
        if (a1.testNodeCompletion(document) == 0 && (elementsByTagName = document.getElementsByTagName("PODIUMS")) != null && elementsByTagName.getLength() == 1) {
            Node nodeItem = elementsByTagName.item(0);
            e0.checkNotNull(nodeItem, "null cannot be cast to non-null type org.w3c.dom.Element");
            NodeList elementsByTagName2 = ((Element) nodeItem).getElementsByTagName("PODIUM");
            if (elementsByTagName2 != null && elementsByTagName2.getLength() > 0) {
                ArrayList arrayList = new ArrayList();
                int length = elementsByTagName2.getLength();
                for (int i10 = 0; i10 < length; i10++) {
                    Node nodeItem2 = elementsByTagName2.item(i10);
                    e0.checkNotNull(nodeItem2, "null cannot be cast to non-null type org.w3c.dom.Element");
                    Element element = (Element) nodeItem2;
                    NodeList elementsByTagName3 = element.getElementsByTagName("DATE");
                    if (elementsByTagName3 == null || elementsByTagName3.getLength() != 1) {
                        str = null;
                    } else {
                        String textContent = elementsByTagName3.item(0).getTextContent();
                        e0.checkNotNull(textContent);
                        List<String> listSplit = new x("/").split(textContent, 0);
                        if (listSplit.isEmpty()) {
                            listEmptyList = p0.emptyList();
                            String[] strArr = (String[]) listEmptyList.toArray(new String[0]);
                            int i11 = Integer.parseInt(strArr[2]);
                            int i12 = Integer.parseInt(strArr[1]);
                            int i13 = Integer.parseInt(strArr[0]);
                            Calendar calendar = Calendar.getInstance();
                            calendar.set(1, i11);
                            calendar.set(2, i12 - 1);
                            calendar.set(5, i13);
                            DateFormat dateInstance = DateFormat.getDateInstance(2);
                            dateInstance.setTimeZone(calendar.getTimeZone());
                            str = dateInstance.format(calendar.getTime());
                        } else {
                            ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                            while (listIterator.hasPrevious()) {
                                if (listIterator.previous().length() != 0) {
                                    listEmptyList = y0.take(listSplit, listIterator.nextIndex() + 1);
                                    break;
                                }
                            }
                            listEmptyList = p0.emptyList();
                            String[] strArr2 = (String[]) listEmptyList.toArray(new String[0]);
                            int i112 = Integer.parseInt(strArr2[2]);
                            int i122 = Integer.parseInt(strArr2[1]);
                            int i132 = Integer.parseInt(strArr2[0]);
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.set(1, i112);
                            calendar2.set(2, i122 - 1);
                            calendar2.set(5, i132);
                            DateFormat dateInstance2 = DateFormat.getDateInstance(2);
                            dateInstance2.setTimeZone(calendar2.getTimeZone());
                            str = dateInstance2.format(calendar2.getTime());
                        }
                    }
                    NodeList elementsByTagName4 = element.getElementsByTagName("JOUEUR");
                    if (elementsByTagName4 != null && elementsByTagName4.getLength() > 0) {
                        ArrayList arrayList2 = new ArrayList();
                        int length2 = elementsByTagName4.getLength();
                        for (int i14 = 0; i14 < length2; i14++) {
                            Node nodeItem3 = elementsByTagName4.item(i14);
                            e0.checkNotNull(nodeItem3, "null cannot be cast to non-null type org.w3c.dom.Element");
                            Element element2 = (Element) nodeItem3;
                            NodeList elementsByTagName5 = element2.getElementsByTagName("PSEUDO");
                            arrayList2.add(new f(a(element2, "POSITION"), (elementsByTagName5 == null || elementsByTagName5.getLength() != 1) ? "" : elementsByTagName5.item(0).getTextContent(), a(element2, "SCORE"), a(element2, "ACTIF"), a(element2, "NB_BLACK"), a(element2, "NB_PLATINUM"), a(element2, "NB_GOLD"), a(element2, "NB_SILVER"), a(element2, "NB_BRONZE"), new ArrayList(), a(element2, "NB_DEFI"), -1, 0));
                        }
                        while (arrayList2.size() < 3) {
                            arrayList2.add(new f(0, "unknown", 0, 0, 0, 0, 0, 0, 0, new ArrayList(), 0, -1, 0));
                        }
                        if (str != null) {
                            arrayList.add(new Pair(str, arrayList2));
                        }
                    }
                }
                return arrayList;
            }
        }
        return null;
    }

    public final ArrayList<Pair<String, ArrayList<f>>> call(int i10, int i11, int i12) {
        lb.c currentInstance = ca.m.sharedInstance().getCurrentInstance();
        e0.checkNotNull(currentInstance);
        if (currentInstance.getBaseLogiqueId() <= 0) {
            return null;
        }
        String adresse_classement = g.f86657a.getADRESSE_CLASSEMENT();
        lb.c currentInstance2 = ca.m.sharedInstance().getCurrentInstance();
        e0.checkNotNull(currentInstance2);
        int baseLogiqueId = currentInstance2.getBaseLogiqueId();
        Object objE = i10 < 10 ? a.b.e(i10, "0") : Integer.valueOf(i10);
        StringBuilder sbR = a.b.r(baseLogiqueId, DtbConstants.HTTP, adresse_classement, ":18666/get_podiums.php?basel_id=", "&mois=");
        sbR.append(objE);
        sbR.append("&annee=");
        sbR.append(i11);
        sbR.append("&type_podium=");
        sbR.append(i12);
        String xml = a1.f72726a.getXML(sbR.toString(), 10000);
        if (xml == null) {
            return null;
        }
        try {
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(xml)));
            e0.checkNotNull(document);
            return b(document);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
