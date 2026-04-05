package mf;

import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.p1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import ef.j;
import ef.l;
import hj.z;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d extends ef.i {

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f74524o = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f74525p = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f74526q = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f74527r = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f74528s = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f74529t = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: u, reason: collision with root package name */
    public static final Pattern f74530u = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: v, reason: collision with root package name */
    public static final j6.d f74531v = new j6.d(30.0f, 1, 1);

    /* renamed from: w, reason: collision with root package name */
    public static final c f74532w = new c(15);

    /* renamed from: n, reason: collision with root package name */
    public final XmlPullParserFactory f74533n;

    public d() throws XmlPullParserException {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f74533n = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static h d(h hVar) {
        return hVar == null ? new h() : hVar;
    }

    public static c f(XmlPullParser xmlPullParser, c cVar) throws l, NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return cVar;
        }
        Matcher matcher = f74530u.matcher(attributeValue);
        if (!matcher.matches()) {
            f0.w("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return cVar;
        }
        try {
            int i10 = Integer.parseInt((String) com.google.android.exoplayer2.util.a.checkNotNull(matcher.group(1)));
            int i11 = Integer.parseInt((String) com.google.android.exoplayer2.util.a.checkNotNull(matcher.group(2)));
            if (i10 != 0 && i11 != 0) {
                return new c(i11);
            }
            throw new l("Invalid cell resolution " + i10 + " " + i11);
        } catch (NumberFormatException unused) {
            f0.w("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return cVar;
        }
    }

    public static void g(String str, h hVar) throws l {
        Matcher matcher;
        String str2;
        String[] strArrSplit = n1.split(str, "\\s+");
        int length = strArrSplit.length;
        Pattern pattern = f74526q;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new l(a.b.f(strArrSplit.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            f0.w("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new l(a.b.l("Invalid expression for fontSize: '", str, "'."));
        }
        str2 = (String) com.google.android.exoplayer2.util.a.checkNotNull(matcher.group(3));
        str2.getClass();
        switch (str2) {
            case "%":
                hVar.setFontSizeUnit(3);
                break;
            case "em":
                hVar.setFontSizeUnit(2);
                break;
            case "px":
                hVar.setFontSizeUnit(1);
                break;
            default:
                throw new l(a.b.l("Invalid unit for fontSize: '", str2, "'."));
        }
        hVar.setFontSize(Float.parseFloat((String) com.google.android.exoplayer2.util.a.checkNotNull(matcher.group(1))));
    }

    public static j6.d h(XmlPullParser xmlPullParser) throws l, NumberFormatException {
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            if (n1.split(attributeValue2, " ").length != 2) {
                throw new l("frameRateMultiplier doesn't have 2 parts");
            }
            f10 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f10 = 1.0f;
        }
        j6.d dVar = f74531v;
        int i11 = dVar.f69137b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = dVar.f69138c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new j6.d(i10 * f10, i11, i12);
    }

    public static e j(XmlPullParser xmlPullParser, e eVar, HashMap map, j6.d dVar) throws l, NumberFormatException {
        String attributeValue;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int attributeCount = xmlPullParser2.getAttributeCount();
        String strSubstring = null;
        h hVarK = k(xmlPullParser2, null);
        long jL = -9223372036854775807L;
        long jL2 = -9223372036854775807L;
        long jL3 = -9223372036854775807L;
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
                    if (!map.containsKey(attributeValue)) {
                        break;
                    } else {
                        str = attributeValue;
                        break;
                    }
                case "dur":
                    jL3 = l(attributeValue, dVar);
                    break;
                case "end":
                    jL2 = l(attributeValue, dVar);
                    break;
                case "begin":
                    jL = l(attributeValue, dVar);
                    break;
                case "style":
                    String strTrim = attributeValue.trim();
                    String[] strArrSplit = strTrim.isEmpty() ? new String[0] : n1.split(strTrim, "\\s+");
                    if (strArrSplit.length > 0) {
                        strArr = strArrSplit;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
            }
            i10++;
            xmlPullParser2 = xmlPullParser;
            attributeCount = i11;
        }
        if (eVar != null) {
            long j10 = eVar.f74537d;
            if (j10 != C.TIME_UNSET) {
                if (jL != C.TIME_UNSET) {
                    jL += j10;
                }
                if (jL2 != C.TIME_UNSET) {
                    jL2 += j10;
                }
            }
        }
        long j11 = jL;
        if (jL2 == C.TIME_UNSET) {
            if (jL3 != C.TIME_UNSET) {
                jL2 = j11 + jL3;
            } else if (eVar != null) {
                long j12 = eVar.f74538e;
                if (j12 != C.TIME_UNSET) {
                    jL2 = j12;
                }
            }
        }
        return e.buildNode(xmlPullParser.getName(), j11, jL2, hVarK, strArr, str, strSubstring, eVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:135:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static mf.h k(org.xmlpull.v1.XmlPullParser r17, mf.h r18) {
        /*
            Method dump skipped, instructions count: 1182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.d.k(org.xmlpull.v1.XmlPullParser, mf.h):mf.h");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long l(java.lang.String r13, j6.d r14) throws ef.l, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.d.l(java.lang.String, j6.d):long");
    }

    public static z m(XmlPullParser xmlPullParser) {
        String attributeValue = p1.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (attributeValue == null) {
            return null;
        }
        Matcher matcher = f74529t.matcher(attributeValue);
        if (!matcher.matches()) {
            f0.w("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(attributeValue));
            return null;
        }
        try {
            return new z(Integer.parseInt((String) com.google.android.exoplayer2.util.a.checkNotNull(matcher.group(1))), Integer.parseInt((String) com.google.android.exoplayer2.util.a.checkNotNull(matcher.group(2))));
        } catch (NumberFormatException unused) {
            f0.w("TtmlDecoder", "Ignoring malformed tts extent: ".concat(attributeValue));
            return null;
        }
    }

    @Override // ef.i
    public final j c(byte[] bArr, int i10, boolean z10) throws XmlPullParserException, l, NumberFormatException, IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f74533n.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new f(""));
            int i11 = 0;
            z zVarM = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            j6.d dVarH = f74531v;
            c cVar = f74532w;
            i iVar = null;
            c cVarF = cVar;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                e eVar = (e) arrayDeque.peek();
                if (i11 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if (TtmlNode.TAG_TT.equals(name)) {
                            dVarH = h(xmlPullParserNewPullParser);
                            cVarF = f(xmlPullParserNewPullParser, cVar);
                            zVarM = m(xmlPullParserNewPullParser);
                        }
                        j6.d dVar = dVarH;
                        z zVar = zVarM;
                        c cVar2 = cVarF;
                        if (e(name)) {
                            if (TtmlNode.TAG_HEAD.equals(name)) {
                                i(xmlPullParserNewPullParser, map, cVar2, zVar, map2, map3);
                            } else {
                                try {
                                    e eVarJ = j(xmlPullParserNewPullParser, eVar, map2, dVar);
                                    arrayDeque.push(eVarJ);
                                    if (eVar != null) {
                                        eVar.addChild(eVarJ);
                                    }
                                } catch (l e10) {
                                    f0.w("TtmlDecoder", "Suppressing parser error", e10);
                                }
                            }
                            cVarF = cVar2;
                            zVarM = zVar;
                            dVarH = dVar;
                        } else {
                            f0.i("TtmlDecoder", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        i11++;
                        cVarF = cVar2;
                        zVarM = zVar;
                        dVarH = dVar;
                    } else if (eventType == 4) {
                        ((e) com.google.android.exoplayer2.util.a.checkNotNull(eVar)).addChild(e.buildTextNode(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals(TtmlNode.TAG_TT)) {
                            iVar = new i((e) com.google.android.exoplayer2.util.a.checkNotNull((e) arrayDeque.peek()), map, map2, map3);
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
            if (iVar != null) {
                return iVar;
            }
            throw new l("No TTML subtitles found");
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new l("Unable to decode source", e12);
        }
    }

    public static boolean e(String str) {
        return str.equals(SUvoXnn.sUTimlt) || str.equals(TtmlNode.TAG_HEAD) || str.equals("body") || str.equals(TtmlNode.TAG_DIV) || str.equals("p") || str.equals(TtmlNode.TAG_SPAN) || str.equals(TtmlNode.TAG_BR) || str.equals(TtmlNode.TAG_STYLE) || str.equals(TtmlNode.TAG_STYLING) || str.equals(TtmlNode.TAG_LAYOUT) || str.equals(TtmlNode.TAG_REGION) || str.equals(TtmlNode.TAG_METADATA) || str.equals("image") || str.equals("data") || str.equals("information");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0234  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i(org.xmlpull.v1.XmlPullParser r18, java.util.HashMap r19, mf.c r20, hj.z r21, java.util.HashMap r22, java.util.HashMap r23) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.d.i(org.xmlpull.v1.XmlPullParser, java.util.HashMap, mf.c, hj.z, java.util.HashMap, java.util.HashMap):void");
    }
}
