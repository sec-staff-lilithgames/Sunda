package yw;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final y f96676a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f96677b;

    /* renamed from: c, reason: collision with root package name */
    public g f96678c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends e {

        /* renamed from: a, reason: collision with root package name */
        public final Node f96679a;

        public a(Node node) {
            this.f96679a = node;
        }

        @Override // yw.e, yw.a
        public String getName() {
            return this.f96679a.getLocalName();
        }

        @Override // yw.e, yw.a
        public String getPrefix() {
            return this.f96679a.getPrefix();
        }

        @Override // yw.e, yw.a
        public String getReference() {
            return this.f96679a.getNamespaceURI();
        }

        @Override // yw.e, yw.a
        public Object getSource() {
            return this.f96679a;
        }

        @Override // yw.e, yw.a
        public String getValue() {
            return this.f96679a.getNodeValue();
        }

        @Override // yw.e, yw.a
        public boolean isReserved() {
            String prefix = getPrefix();
            return prefix != null ? prefix.startsWith("xml") : getName().startsWith("xml");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends f {

        /* renamed from: b, reason: collision with root package name */
        public final Element f96680b;

        public b(Node node) {
            this.f96680b = (Element) node;
        }

        public NamedNodeMap getAttributes() {
            return this.f96680b.getAttributes();
        }

        @Override // yw.f, yw.g
        public String getName() {
            return this.f96680b.getLocalName();
        }

        @Override // yw.f, yw.g
        public String getPrefix() {
            return this.f96680b.getPrefix();
        }

        @Override // yw.f, yw.g
        public String getReference() {
            return this.f96680b.getNamespaceURI();
        }

        @Override // yw.f, yw.g
        public Object getSource() {
            return this.f96680b;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c extends i {

        /* renamed from: b, reason: collision with root package name */
        public final Node f96681b;

        public c(Node node) {
            this.f96681b = node;
        }

        @Override // yw.i, yw.g
        public Object getSource() {
            return this.f96681b;
        }

        @Override // yw.i, yw.g
        public String getValue() {
            return this.f96681b.getNodeValue();
        }

        @Override // yw.i, yw.g
        public boolean isText() {
            return true;
        }
    }

    public d(Document document) {
        this.f96676a = new y(document);
        b0 b0Var = new b0();
        this.f96677b = b0Var;
        b0Var.push(document);
    }

    @Override // yw.h
    public g next() throws Exception {
        g gVar = this.f96678c;
        if (gVar != null) {
            this.f96678c = null;
            return gVar;
        }
        y yVar = this.f96676a;
        Node node = (Node) yVar.peek();
        if (node == null) {
            return new yw.c();
        }
        Node parentNode = node.getParentNode();
        b0 b0Var = this.f96677b;
        Node node2 = (Node) b0Var.top();
        if (parentNode != node2) {
            if (node2 != null) {
                b0Var.pop();
            }
            return new yw.c();
        }
        yVar.poll();
        if (node.getNodeType() != 1) {
            return new c(node);
        }
        b0Var.push(node);
        b bVar = new b(node);
        if (bVar.isEmpty()) {
            NamedNodeMap attributes = bVar.getAttributes();
            int length = attributes.getLength();
            for (int i10 = 0; i10 < length; i10++) {
                a aVar = new a(attributes.item(i10));
                if (!aVar.isReserved()) {
                    bVar.add(aVar);
                }
            }
        }
        return bVar;
    }

    @Override // yw.h
    public g peek() throws Exception {
        if (this.f96678c == null) {
            this.f96678c = next();
        }
        return this.f96678c;
    }
}
