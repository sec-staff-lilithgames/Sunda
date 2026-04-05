package yw;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class q0 implements h {

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParser f96744a;

    /* renamed from: b, reason: collision with root package name */
    public g f96745b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends e {

        /* renamed from: a, reason: collision with root package name */
        public final XmlPullParser f96746a;

        /* renamed from: b, reason: collision with root package name */
        public final String f96747b;

        /* renamed from: c, reason: collision with root package name */
        public final String f96748c;

        /* renamed from: d, reason: collision with root package name */
        public final String f96749d;

        /* renamed from: e, reason: collision with root package name */
        public final String f96750e;

        public a(XmlPullParser xmlPullParser, int i10) {
            this.f96747b = xmlPullParser.getAttributeNamespace(i10);
            this.f96748c = xmlPullParser.getAttributePrefix(i10);
            this.f96750e = xmlPullParser.getAttributeValue(i10);
            this.f96749d = xmlPullParser.getAttributeName(i10);
            this.f96746a = xmlPullParser;
        }

        @Override // yw.e, yw.a
        public String getName() {
            return this.f96749d;
        }

        @Override // yw.e, yw.a
        public String getPrefix() {
            return this.f96748c;
        }

        @Override // yw.e, yw.a
        public String getReference() {
            return this.f96747b;
        }

        @Override // yw.e, yw.a
        public Object getSource() {
            return this.f96746a;
        }

        @Override // yw.e, yw.a
        public String getValue() {
            return this.f96750e;
        }

        @Override // yw.e, yw.a
        public boolean isReserved() {
            return false;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends f {

        /* renamed from: b, reason: collision with root package name */
        public final XmlPullParser f96751b;

        /* renamed from: c, reason: collision with root package name */
        public final String f96752c;

        /* renamed from: e, reason: collision with root package name */
        public final String f96753e;

        /* renamed from: f, reason: collision with root package name */
        public final String f96754f;

        /* renamed from: g, reason: collision with root package name */
        public final int f96755g;

        public b(XmlPullParser xmlPullParser) {
            this.f96752c = xmlPullParser.getNamespace();
            this.f96755g = xmlPullParser.getLineNumber();
            this.f96753e = xmlPullParser.getPrefix();
            this.f96754f = xmlPullParser.getName();
            this.f96751b = xmlPullParser;
        }

        @Override // yw.f, yw.g
        public int getLine() {
            return this.f96755g;
        }

        @Override // yw.f, yw.g
        public String getName() {
            return this.f96754f;
        }

        @Override // yw.f, yw.g
        public String getPrefix() {
            return this.f96753e;
        }

        @Override // yw.f, yw.g
        public String getReference() {
            return this.f96752c;
        }

        @Override // yw.f, yw.g
        public Object getSource() {
            return this.f96751b;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c extends i {

        /* renamed from: b, reason: collision with root package name */
        public final XmlPullParser f96756b;

        /* renamed from: c, reason: collision with root package name */
        public final String f96757c;

        public c(XmlPullParser xmlPullParser) {
            this.f96757c = xmlPullParser.getText();
            this.f96756b = xmlPullParser;
        }

        @Override // yw.i, yw.g
        public Object getSource() {
            return this.f96756b;
        }

        @Override // yw.i, yw.g
        public String getValue() {
            return this.f96757c;
        }

        @Override // yw.i, yw.g
        public boolean isText() {
            return true;
        }
    }

    public q0(XmlPullParser xmlPullParser) {
        this.f96744a = xmlPullParser;
    }

    public final g a() throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParser = this.f96744a;
        int next = xmlPullParser.next();
        if (next == 1) {
            return null;
        }
        if (next != 2) {
            return next == 4 ? new c(xmlPullParser) : next == 3 ? new p0() : a();
        }
        b bVar = new b(xmlPullParser);
        if (bVar.isEmpty()) {
            int attributeCount = xmlPullParser.getAttributeCount();
            for (int i10 = 0; i10 < attributeCount; i10++) {
                a aVar = new a(xmlPullParser, i10);
                if (!aVar.isReserved()) {
                    bVar.add(aVar);
                }
            }
        }
        return bVar;
    }

    @Override // yw.h
    public g next() throws Exception {
        g gVar = this.f96745b;
        if (gVar == null) {
            return a();
        }
        this.f96745b = null;
        return gVar;
    }

    @Override // yw.h
    public g peek() throws Exception {
        if (this.f96745b == null) {
            this.f96745b = next();
        }
        return this.f96745b;
    }
}
