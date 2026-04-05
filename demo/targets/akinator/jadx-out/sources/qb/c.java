package qb;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import f.j0;
import java.util.ArrayList;
import lb.e;
import lb.s0;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import sv.p0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c extends z {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f82661o = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(lb.e session, String questionLabel, ArrayList<e.d> answersList) {
        String playerName;
        String signature;
        String session2;
        String channel;
        super(session);
        kotlin.jvm.internal.e0.checkNotNullParameter(session, "session");
        kotlin.jvm.internal.e0.checkNotNullParameter(questionLabel, "questionLabel");
        kotlin.jvm.internal.e0.checkNotNullParameter(answersList, "answersList");
        this.f82730i = "add_question.php";
        addParameter("base", "0");
        lb.e mSession = getMSession();
        String str = "";
        addParameter("channel", (mSession == null || (channel = mSession.getChannel()) == null) ? "" : channel);
        lb.e mSession2 = getMSession();
        addParameter("session", (mSession2 == null || (session2 = mSession2.getSession()) == null) ? "" : session2);
        lb.e mSession3 = getMSession();
        addParameter(InAppPurchaseMetaData.KEY_SIGNATURE, (mSession3 == null || (signature = mSession3.getSignature()) == null) ? "" : signature);
        s0 s0VarSharedInstance = s0.f72971j.sharedInstance();
        if (s0VarSharedInstance != null && (playerName = s0VarSharedInstance.getPlayerName()) != null) {
            str = playerName;
        }
        addParameter("player", str);
        addParameter("question", questionLabel);
        String strJoinToString$default = y0.joinToString$default(answersList, "|", null, null, 0, null, new j0(13), 30, null);
        addParameter("answers", strJoinToString$default.length() > 0 ? p0.dropLast(strJoinToString$default, 1) : strJoinToString$default);
    }

    @Override // qb.z
    public void parseAkWSResponse(Document xmlResponse) throws DOMException {
        kotlin.jvm.internal.e0.checkNotNullParameter(xmlResponse, "xmlResponse");
        NodeList elementsByTagName = xmlResponse.getElementsByTagName("ELEMENT");
        int length = elementsByTagName.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            Node nodeItem = elementsByTagName.item(i10);
            e.h hVar = new e.h();
            NodeList childNodes = nodeItem.getChildNodes();
            int length2 = childNodes.getLength();
            for (int i11 = 0; i11 < length2; i11++) {
                Node nodeItem2 = childNodes.item(i11);
                String nodeName = nodeItem2.getNodeName();
                if (nodeName != null) {
                    int iHashCode = nodeName.hashCode();
                    if (iHashCode != 2331) {
                        if (iHashCode != 2388619) {
                            if (iHashCode == 93701227 && nodeName.equals("NOT_VALIDATED_YET")) {
                                String textContent = nodeItem2.getTextContent();
                                kotlin.jvm.internal.e0.checkNotNullExpressionValue(textContent, "getTextContent(...)");
                                hVar.setValidated(Integer.parseInt(textContent) > 0);
                            }
                        } else if (nodeName.equals("NAME")) {
                            hVar.setQuestion(nodeItem2.getTextContent());
                        }
                    } else if (nodeName.equals("ID")) {
                        String textContent2 = nodeItem2.getTextContent();
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(textContent2, "getTextContent(...)");
                        hVar.setId(Integer.parseInt(textContent2));
                    }
                }
            }
        }
    }

    public final void setQuestionId(int i10) {
        addParameter("num_question", String.valueOf(i10));
    }
}
