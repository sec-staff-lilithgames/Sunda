package yw;

import java.util.LinkedList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class y extends LinkedList {
    public y(Document document) {
        Element documentElement = document.getDocumentElement();
        if (documentElement != null) {
            offer(documentElement);
            a(documentElement);
        }
    }

    public final void a(Node node) {
        NodeList childNodes = node.getChildNodes();
        int length = childNodes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem.getNodeType() != 8) {
                offer(nodeItem);
                a(nodeItem);
            }
        }
    }
}
