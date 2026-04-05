package com.fyber.inneractive.sdk.util;

import android.text.TextUtils;
import java.util.ArrayList;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class w1 {
    public static Integer a(Node node, String str) {
        String strB = b(node, str);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        try {
            return Integer.valueOf(strB);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String b(Node node, String str) {
        Node namedItem;
        if (node == null || (namedItem = node.getAttributes().getNamedItem(str)) == null) {
            return null;
        }
        return namedItem.getNodeValue();
    }

    public static ArrayList c(Node node, String str) {
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = node.getChildNodes();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem.getNodeName().equals(str)) {
                arrayList.add(nodeItem);
            }
        }
        return arrayList;
    }

    public static Node d(Node node, String str) {
        if (node == null) {
            return null;
        }
        NodeList childNodes = node.getChildNodes();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem.getNodeName().equals(str)) {
                return nodeItem;
            }
        }
        return null;
    }

    public static String a(Node node) {
        if (node == null || node.getFirstChild() == null || node.getFirstChild().getNodeValue() == null) {
            return null;
        }
        return node.getFirstChild().getNodeValue().trim();
    }
}
