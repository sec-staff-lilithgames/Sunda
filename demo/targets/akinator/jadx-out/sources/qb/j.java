package qb;

import java.util.Locale;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j extends z {

    /* renamed from: o, reason: collision with root package name */
    public String f82694o;

    /* renamed from: p, reason: collision with root package name */
    public String f82695p;

    /* renamed from: q, reason: collision with root package name */
    public String f82696q;

    /* renamed from: r, reason: collision with root package name */
    public String f82697r;

    /* renamed from: s, reason: collision with root package name */
    public String f82698s;

    /* renamed from: t, reason: collision with root package name */
    public String f82699t;

    /* renamed from: u, reason: collision with root package name */
    public int f82700u;

    /* renamed from: v, reason: collision with root package name */
    public int f82701v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(lb.e session, String objectId) {
        super(session);
        kotlin.jvm.internal.e0.checkNotNullParameter(session, "session");
        kotlin.jvm.internal.e0.checkNotNullParameter(objectId, "objectId");
        this.f82700u = -1;
        this.f82701v = -1;
        this.f82730i = "list_photos_vote.php";
        addParameter("objet_id", objectId);
    }

    public final String getIdPhoto1() {
        return this.f82695p;
    }

    public final String getIdPhoto2() {
        return this.f82698s;
    }

    public final int getNbVotes1() {
        return this.f82700u;
    }

    public final int getNbVotes2() {
        return this.f82701v;
    }

    public final String getPseudoPhoto1() {
        return this.f82696q;
    }

    public final String getPseudoPhoto2() {
        return this.f82699t;
    }

    public final String getUrlPhoto1() {
        return this.f82694o;
    }

    public final String getUrlPhoto2() {
        return this.f82697r;
    }

    @Override // qb.z
    public void parseAkWSResponse(Document xmlResponse) throws DOMException {
        int i10;
        kotlin.jvm.internal.e0.checkNotNullParameter(xmlResponse, "xmlResponse");
        NodeList elementsByTagName = xmlResponse.getElementsByTagName("PHOTO");
        NodeList childNodes = elementsByTagName.item(0).getChildNodes();
        int length = childNodes.getLength();
        int i11 = 0;
        while (true) {
            i10 = -252417954;
            if (i11 >= length) {
                break;
            }
            Node nodeItem = childNodes.item(i11);
            String nodeName = nodeItem.getNodeName();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(nodeName, "getNodeName(...)");
            String upperCase = nodeName.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            int iHashCode = upperCase.hashCode();
            if (iHashCode != -1925843522) {
                if (iHashCode != -252417954) {
                    if (iHashCode != 2331) {
                        if (iHashCode == 84303 && upperCase.equals("URL")) {
                            this.f82694o = nodeItem.getTextContent();
                        }
                    } else if (upperCase.equals("ID")) {
                        this.f82695p = nodeItem.getTextContent();
                    }
                } else if (upperCase.equals("NB_VOTES")) {
                    String textContent = nodeItem.getTextContent();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(textContent, "getTextContent(...)");
                    this.f82700u = Integer.parseInt(textContent);
                }
            } else if (upperCase.equals("PSEUDO")) {
                this.f82696q = nodeItem.getTextContent();
            }
            i11++;
        }
        NodeList childNodes2 = elementsByTagName.item(1).getChildNodes();
        int length2 = childNodes2.getLength();
        int i12 = 0;
        while (i12 < length2) {
            Node nodeItem2 = childNodes2.item(i12);
            String nodeName2 = nodeItem2.getNodeName();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(nodeName2, "getNodeName(...)");
            String upperCase2 = nodeName2.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            int iHashCode2 = upperCase2.hashCode();
            if (iHashCode2 != -1925843522) {
                if (iHashCode2 != i10) {
                    if (iHashCode2 != 2331) {
                        if (iHashCode2 == 84303 && upperCase2.equals("URL")) {
                            this.f82697r = nodeItem2.getTextContent();
                        }
                    } else if (upperCase2.equals("ID")) {
                        this.f82698s = nodeItem2.getTextContent();
                    }
                } else if (upperCase2.equals("NB_VOTES")) {
                    String textContent2 = nodeItem2.getTextContent();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(textContent2, "getTextContent(...)");
                    this.f82701v = Integer.parseInt(textContent2);
                }
            } else if (upperCase2.equals("PSEUDO")) {
                this.f82699t = nodeItem2.getTextContent();
            }
            i12++;
            i10 = -252417954;
        }
    }

    public final void setIdPhoto1(String str) {
        this.f82695p = str;
    }

    public final void setIdPhoto2(String str) {
        this.f82698s = str;
    }

    public final void setNbVotes1(int i10) {
        this.f82700u = i10;
    }

    public final void setNbVotes2(int i10) {
        this.f82701v = i10;
    }

    public final void setPseudoPhoto1(String str) {
        this.f82696q = str;
    }

    public final void setPseudoPhoto2(String str) {
        this.f82699t = str;
    }

    public final void setUrlPhoto1(String str) {
        this.f82694o = str;
    }

    public final void setUrlPhoto2(String str) {
        this.f82697r = str;
    }
}
