package com.applovin.impl;

import android.util.Xml;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class n8 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f14869a;

    /* renamed from: b, reason: collision with root package name */
    private Stack f14870b;

    /* renamed from: c, reason: collision with root package name */
    private StringBuilder f14871c;

    /* renamed from: d, reason: collision with root package name */
    private long f14872d;

    /* renamed from: e, reason: collision with root package name */
    private b f14873e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends m8 {
        public b(String str, Map map, m8 m8Var) {
            super(str, map, m8Var);
        }

        public void a(m8 m8Var) {
            if (m8Var == null) {
                throw new IllegalArgumentException("None specified.");
            }
            this.f14460e.add(m8Var);
        }

        public void d(String str) {
            this.f14459d = str;
        }
    }

    public n8(com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f14869a = kVar.O();
    }

    public static m8 a(String str, com.applovin.impl.sdk.k kVar) {
        return new n8(kVar).a(str);
    }

    public m8 a(String str) throws SAXException {
        if (str != null) {
            this.f14871c = new StringBuilder();
            this.f14870b = new Stack();
            this.f14873e = null;
            Xml.parse(str, new a());
            b bVar = this.f14873e;
            if (bVar != null) {
                return bVar;
            }
            throw new SAXException("Unable to parse XML into node");
        }
        throw new IllegalArgumentException("Unable to parse. No XML specified.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map a(Attributes attributes) {
        if (attributes != null) {
            int length = attributes.getLength();
            HashMap map = new HashMap(length);
            for (int i10 = 0; i10 < length; i10++) {
                map.put(attributes.getQName(i10), attributes.getValue(i10));
            }
            return map;
        }
        return Collections.EMPTY_MAP;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements ContentHandler {
        public a() {
        }

        @Override // org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i10, int i11) {
            String strTrim = new String(Arrays.copyOfRange(cArr, i10, i11)).trim();
            if (StringUtils.isValidString(strTrim)) {
                n8.this.f14871c.append(strTrim);
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endDocument() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - n8.this.f14872d;
            com.applovin.impl.sdk.o unused = n8.this.f14869a;
            if (com.applovin.impl.sdk.o.a()) {
                n8.this.f14869a.a("XmlParser", p0.o2.n(seconds, "Finished parsing in ", " seconds"));
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            n8 n8Var = n8.this;
            n8Var.f14873e = (b) n8Var.f14870b.pop();
            n8.this.f14873e.d(n8.this.f14871c.toString().trim());
            n8.this.f14871c.setLength(0);
        }

        @Override // org.xml.sax.ContentHandler
        public void startDocument() {
            com.applovin.impl.sdk.o unused = n8.this.f14869a;
            if (com.applovin.impl.sdk.o.a()) {
                n8.this.f14869a.a("XmlParser", "Begin parsing...");
            }
            n8.this.f14872d = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        }

        @Override // org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            try {
                b bVar = !n8.this.f14870b.isEmpty() ? (b) n8.this.f14870b.peek() : null;
                b bVar2 = new b(str2, n8.this.a(attributes), bVar);
                if (bVar != null) {
                    bVar.a(bVar2);
                }
                n8.this.f14870b.push(bVar2);
            } catch (Exception e10) {
                com.applovin.impl.sdk.o unused = n8.this.f14869a;
                if (com.applovin.impl.sdk.o.a()) {
                    n8.this.f14869a.a("XmlParser", a.b.l("Unable to process element <", str2, ">"), e10);
                }
                throw new SAXException("Failed to start element", e10);
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endPrefixMapping(String str) {
        }

        @Override // org.xml.sax.ContentHandler
        public void setDocumentLocator(Locator locator) {
        }

        @Override // org.xml.sax.ContentHandler
        public void skippedEntity(String str) {
        }

        @Override // org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) {
        }

        @Override // org.xml.sax.ContentHandler
        public void startPrefixMapping(String str, String str2) {
        }

        @Override // org.xml.sax.ContentHandler
        public void ignorableWhitespace(char[] cArr, int i10, int i11) {
        }
    }
}
