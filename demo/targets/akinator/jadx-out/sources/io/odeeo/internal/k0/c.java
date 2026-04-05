package io.odeeo.internal.k0;

import android.text.Layout;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.h0;
import io.odeeo.internal.q0.p;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c extends io.odeeo.internal.d0.e {

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f64438p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f64439q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f64440r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f64441s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f64442t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: u, reason: collision with root package name */
    public static final Pattern f64443u = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: v, reason: collision with root package name */
    public static final Pattern f64444v = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: w, reason: collision with root package name */
    public static final b f64445w = new b(30.0f, 1, 1);

    /* renamed from: x, reason: collision with root package name */
    public static final a f64446x = new a(32, 15);

    /* renamed from: o, reason: collision with root package name */
    public final XmlPullParserFactory f64447o;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f64448a;

        /* renamed from: b, reason: collision with root package name */
        public final int f64449b;

        public a(int i10, int i11) {
            this.f64448a = i10;
            this.f64449b = i11;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final float f64450a;

        /* renamed from: b, reason: collision with root package name */
        public final int f64451b;

        /* renamed from: c, reason: collision with root package name */
        public final int f64452c;

        public b(float f10, int i10, int i11) {
            this.f64450a = f10;
            this.f64451b = i10;
            this.f64452c = i11;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.k0.c$c, reason: collision with other inner class name */
    public static final class C0618c {

        /* renamed from: a, reason: collision with root package name */
        public final int f64453a;

        /* renamed from: b, reason: collision with root package name */
        public final int f64454b;

        public C0618c(int i10, int i11) {
            this.f64453a = i10;
            this.f64454b = i11;
        }
    }

    public c() throws XmlPullParserException {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f64447o = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static C0618c b(XmlPullParser xmlPullParser) {
        String attributeValue = h0.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (attributeValue == null) {
            return null;
        }
        Matcher matcher = f64443u.matcher(attributeValue);
        if (!matcher.matches()) {
            p.w("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(attributeValue));
            return null;
        }
        try {
            return new C0618c(Integer.parseInt((String) io.odeeo.internal.q0.a.checkNotNull(matcher.group(1))), Integer.parseInt((String) io.odeeo.internal.q0.a.checkNotNull(matcher.group(2))));
        } catch (NumberFormatException unused) {
            p.w("TtmlDecoder", "Ignoring malformed tts extent: ".concat(attributeValue));
            return null;
        }
    }

    public static float c(String str) {
        Matcher matcher = f64441s.matcher(str);
        if (!matcher.matches()) {
            o2.A("Invalid value for shear: ", str, "TtmlDecoder");
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) io.odeeo.internal.q0.a.checkNotNull(matcher.group(1)))));
        } catch (NumberFormatException e10) {
            p.w("TtmlDecoder", "Failed to parse shear: " + str, e10);
            return Float.MAX_VALUE;
        }
    }

    public static String[] d(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : g0.split(strTrim, "\\s+");
    }

    @Override // io.odeeo.internal.d0.e
    public io.odeeo.internal.d0.f a(byte[] bArr, int i10, boolean z10) throws XmlPullParserException, NumberFormatException, io.odeeo.internal.d0.h, IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f64447o.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new e(""));
            int i11 = 0;
            C0618c c0618cB = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVarA = f64445w;
            a aVarA = f64446x;
            h hVar = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                d dVar = (d) arrayDeque.peek();
                if (i11 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if (TtmlNode.TAG_TT.equals(name)) {
                            bVarA = a(xmlPullParserNewPullParser);
                            aVarA = a(xmlPullParserNewPullParser, f64446x);
                            c0618cB = b(xmlPullParserNewPullParser);
                        }
                        b bVar = bVarA;
                        C0618c c0618c = c0618cB;
                        a aVar = aVarA;
                        if (a(name)) {
                            if (TtmlNode.TAG_HEAD.equals(name)) {
                                a(xmlPullParserNewPullParser, map, aVar, c0618c, map2, map3);
                            } else {
                                try {
                                    d dVarA = a(xmlPullParserNewPullParser, dVar, map2, bVar);
                                    arrayDeque.push(dVarA);
                                    if (dVar != null) {
                                        dVar.addChild(dVarA);
                                    }
                                } catch (io.odeeo.internal.d0.h e10) {
                                    p.w("TtmlDecoder", "Suppressing parser error", e10);
                                }
                            }
                            aVarA = aVar;
                            c0618cB = c0618c;
                            bVarA = bVar;
                        } else {
                            p.i("TtmlDecoder", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        aVarA = aVar;
                        c0618cB = c0618c;
                        bVarA = bVar;
                        i11++;
                    } else if (eventType == 4) {
                        ((d) io.odeeo.internal.q0.a.checkNotNull(dVar)).addChild(d.buildTextNode(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals(TtmlNode.TAG_TT)) {
                            hVar = new h((d) io.odeeo.internal.q0.a.checkNotNull((d) arrayDeque.peek()), map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i11++;
                } else if (eventType == 3) {
                    i11--;
                }
                xmlPullParserNewPullParser.next();
            }
            if (hVar != null) {
                return hVar;
            }
            throw new io.odeeo.internal.d0.h("No TTML subtitles found");
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new io.odeeo.internal.d0.h("Unable to decode source", e12);
        }
    }

    public static Layout.Alignment b(String str) {
        String lowerCase = io.odeeo.internal.t0.c.toLowerCase(str);
        lowerCase.getClass();
        switch (lowerCase) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    public static b a(XmlPullParser xmlPullParser) throws NumberFormatException, io.odeeo.internal.d0.h {
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            if (g0.split(attributeValue2, " ").length == 2) {
                f10 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
            } else {
                throw new io.odeeo.internal.d0.h("frameRateMultiplier doesn't have 2 parts");
            }
        } else {
            f10 = 1.0f;
        }
        b bVar = f64445w;
        int i11 = bVar.f64451b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = bVar.f64452c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new b(i10 * f10, i11, i12);
    }

    public static a a(XmlPullParser xmlPullParser, a aVar) throws NumberFormatException, io.odeeo.internal.d0.h {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f64444v.matcher(attributeValue);
        boolean zMatches = matcher.matches();
        String str = wHkgq.IQu;
        if (!zMatches) {
            p.w(str, "Ignoring malformed cell resolution: ".concat(attributeValue));
            return aVar;
        }
        try {
            int i10 = Integer.parseInt((String) io.odeeo.internal.q0.a.checkNotNull(matcher.group(1)));
            int i11 = Integer.parseInt((String) io.odeeo.internal.q0.a.checkNotNull(matcher.group(2)));
            if (i10 == 0 || i11 == 0) {
                throw new io.odeeo.internal.d0.h("Invalid cell resolution " + i10 + " " + i11);
            }
            return new a(i10, i11);
        } catch (NumberFormatException unused) {
            p.w(str, "Ignoring malformed cell resolution: ".concat(attributeValue));
            return aVar;
        }
    }

    public static Map<String, g> a(XmlPullParser xmlPullParser, Map<String, g> map, a aVar, C0618c c0618c, Map<String, e> map2, Map<String, String> map3) throws XmlPullParserException, IOException, NumberFormatException {
        do {
            xmlPullParser.next();
            if (h0.isStartTag(xmlPullParser, TtmlNode.TAG_STYLE)) {
                String attributeValue = h0.getAttributeValue(xmlPullParser, TtmlNode.TAG_STYLE);
                g gVarA = a(xmlPullParser, new g());
                if (attributeValue != null) {
                    for (String str : d(attributeValue)) {
                        gVarA.chain(map.get(str));
                    }
                }
                String id2 = gVarA.getId();
                if (id2 != null) {
                    map.put(id2, gVarA);
                }
            } else if (h0.isStartTag(xmlPullParser, TtmlNode.TAG_REGION)) {
                e eVarA = a(xmlPullParser, aVar, c0618c);
                if (eVarA != null) {
                    map2.put(eVarA.f64468a, eVarA);
                }
            } else if (h0.isStartTag(xmlPullParser, TtmlNode.TAG_METADATA)) {
                a(xmlPullParser, map3);
            }
        } while (!h0.isEndTag(xmlPullParser, TtmlNode.TAG_HEAD));
        return map;
    }

    public static void a(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        String attributeValue;
        do {
            xmlPullParser.next();
            if (h0.isStartTag(xmlPullParser, "image") && (attributeValue = h0.getAttributeValue(xmlPullParser, "id")) != null) {
                map.put(attributeValue, xmlPullParser.nextText());
            }
        } while (!h0.isEndTag(xmlPullParser, TtmlNode.TAG_METADATA));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static io.odeeo.internal.k0.e a(org.xmlpull.v1.XmlPullParser r17, io.odeeo.internal.k0.c.a r18, io.odeeo.internal.k0.c.C0618c r19) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.k0.c.a(org.xmlpull.v1.XmlPullParser, io.odeeo.internal.k0.c$a, io.odeeo.internal.k0.c$c):io.odeeo.internal.k0.e");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static io.odeeo.internal.k0.g a(org.xmlpull.v1.XmlPullParser r12, io.odeeo.internal.k0.g r13) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.k0.c.a(org.xmlpull.v1.XmlPullParser, io.odeeo.internal.k0.g):io.odeeo.internal.k0.g");
    }

    public static g a(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    public static d a(XmlPullParser xmlPullParser, d dVar, Map<String, e> map, b bVar) throws NumberFormatException, io.odeeo.internal.d0.h {
        String attributeValue;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int attributeCount = xmlPullParser2.getAttributeCount();
        String strSubstring = null;
        g gVarA = a(xmlPullParser2, (g) null);
        long jA = -9223372036854775807L;
        long jA2 = -9223372036854775807L;
        long jA3 = -9223372036854775807L;
        String[] strArr = null;
        String str = "";
        int i10 = 0;
        while (i10 < attributeCount) {
            String attributeName = xmlPullParser2.getAttributeName(i10);
            int i11 = attributeCount;
            attributeValue = xmlPullParser2.getAttributeValue(i10);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    i10++;
                    xmlPullParser2 = xmlPullParser;
                    attributeCount = i11;
                case "dur":
                    jA3 = a(attributeValue, bVar);
                    break;
                case "end":
                    jA2 = a(attributeValue, bVar);
                    break;
                case "begin":
                    jA = a(attributeValue, bVar);
                    break;
                case "style":
                    String[] strArrD = d(attributeValue);
                    if (strArrD.length > 0) {
                        strArr = strArrD;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
            i10++;
            xmlPullParser2 = xmlPullParser;
            attributeCount = i11;
        }
        if (dVar != null) {
            long j10 = dVar.f64458d;
            if (j10 != C.TIME_UNSET) {
                if (jA != C.TIME_UNSET) {
                    jA += j10;
                }
                if (jA2 != C.TIME_UNSET) {
                    jA2 += j10;
                }
            }
        }
        long j11 = jA;
        if (jA2 == C.TIME_UNSET) {
            if (jA3 != C.TIME_UNSET) {
                jA2 = j11 + jA3;
            } else if (dVar != null) {
                long j12 = dVar.f64459e;
                if (j12 != C.TIME_UNSET) {
                    jA2 = j12;
                }
            }
        }
        return d.buildNode(xmlPullParser.getName(), j11, jA2, gVarA, strArr, str, strSubstring, dVar);
    }

    public static boolean a(String str) {
        return str.equals(TtmlNode.TAG_TT) || str.equals(TtmlNode.TAG_HEAD) || str.equals("body") || str.equals(TtmlNode.TAG_DIV) || str.equals("p") || str.equals(TtmlNode.TAG_SPAN) || str.equals(TtmlNode.TAG_BR) || str.equals(TtmlNode.TAG_STYLE) || str.equals(TtmlNode.TAG_STYLING) || str.equals(TtmlNode.TAG_LAYOUT) || str.equals(TtmlNode.TAG_REGION) || str.equals(TtmlNode.TAG_METADATA) || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static void a(String str, g gVar) throws io.odeeo.internal.d0.h {
        Matcher matcher;
        String str2;
        String[] strArrSplit = g0.split(str, "\\s+");
        if (strArrSplit.length == 1) {
            matcher = f64440r.matcher(str);
        } else if (strArrSplit.length == 2) {
            matcher = f64440r.matcher(strArrSplit[1]);
            p.w("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new io.odeeo.internal.d0.h(a.b.f(strArrSplit.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
        }
        if (matcher.matches()) {
            str2 = (String) io.odeeo.internal.q0.a.checkNotNull(matcher.group(3));
            str2.getClass();
            switch (str2) {
                case "%":
                    gVar.setFontSizeUnit(3);
                    break;
                case "em":
                    gVar.setFontSizeUnit(2);
                    break;
                case "px":
                    gVar.setFontSizeUnit(1);
                    break;
                default:
                    throw new io.odeeo.internal.d0.h(a.b.l("Invalid unit for fontSize: '", str2, "'."));
            }
            gVar.setFontSize(Float.parseFloat((String) io.odeeo.internal.q0.a.checkNotNull(matcher.group(1))));
            return;
        }
        throw new io.odeeo.internal.d0.h(a.b.l("Invalid expression for fontSize: '", str, "'."));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long a(java.lang.String r13, io.odeeo.internal.k0.c.b r14) throws java.lang.NumberFormatException, io.odeeo.internal.d0.h {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.k0.c.a(java.lang.String, io.odeeo.internal.k0.c$b):long");
    }
}
