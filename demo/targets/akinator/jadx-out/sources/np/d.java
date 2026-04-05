package np;

import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.bytedance.sdk.openadsdk.multipro.xsB.LJjmO;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import hj.z;
import hp.i;
import hp.k;
import hp.r;
import hp.s;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.b0;
import io.bidmachine.media3.common.util.b1;
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
/* loaded from: classes9.dex */
public final class d implements s {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f77133b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f77134c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f77135d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f77136e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f77137f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f77138g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f77139h = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: i, reason: collision with root package name */
    public static final j6.d f77140i = new j6.d(30.0f, 1, 1);

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f77141a;

    public d() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f77141a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static g a(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    public static boolean b(String str) {
        return str.equals(TtmlNode.TAG_TT) || str.equals(TtmlNode.TAG_HEAD) || str.equals("body") || str.equals(TtmlNode.TAG_DIV) || str.equals("p") || str.equals(TtmlNode.TAG_SPAN) || str.equals(TtmlNode.TAG_BR) || str.equals(TtmlNode.TAG_STYLE) || str.equals(TtmlNode.TAG_STYLING) || str.equals(TtmlNode.TAG_LAYOUT) || str.equals(TtmlNode.TAG_REGION) || str.equals(TtmlNode.TAG_METADATA) || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static int c(XmlPullParser xmlPullParser) throws NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f77139h.matcher(attributeValue);
        if (!matcher.matches()) {
            b0.w("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z10 = true;
        try {
            int i10 = Integer.parseInt((String) io.bidmachine.media3.common.util.a.checkNotNull(matcher.group(1)));
            int i11 = Integer.parseInt((String) io.bidmachine.media3.common.util.a.checkNotNull(matcher.group(2)));
            if (i10 == 0 || i11 == 0) {
                z10 = false;
            }
            io.bidmachine.media3.common.util.a.checkArgument(z10, "Invalid cell resolution " + i10 + " " + i11);
            return i11;
        } catch (NumberFormatException unused) {
            b0.w("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void d(String str, g gVar) throws k {
        Matcher matcher;
        String str2;
        String[] strArrSplit = a1.split(str, "\\s+");
        int length = strArrSplit.length;
        Pattern pattern = f77135d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new k(a.b.f(strArrSplit.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            b0.w("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new k(a.b.l("Invalid expression for fontSize: '", str, "'."));
        }
        str2 = (String) io.bidmachine.media3.common.util.a.checkNotNull(matcher.group(3));
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
                throw new k(a.b.l("Invalid unit for fontSize: '", str2, "'."));
        }
        gVar.setFontSize(Float.parseFloat((String) io.bidmachine.media3.common.util.a.checkNotNull(matcher.group(1))));
    }

    public static j6.d e(XmlPullParser xmlPullParser) throws NumberFormatException {
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            io.bidmachine.media3.common.util.a.checkArgument(a1.split(attributeValue2, " ").length == 2, "frameRateMultiplier doesn't have 2 parts");
            f10 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f10 = 1.0f;
        }
        j6.d dVar = f77140i;
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(org.xmlpull.v1.XmlPullParser r18, java.util.HashMap r19, int r20, hj.z r21, java.util.HashMap r22, java.util.HashMap r23) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: np.d.f(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, hj.z, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long i(java.lang.String r13, j6.d r14) throws hp.k, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: np.d.i(java.lang.String, j6.d):long");
    }

    public static z j(XmlPullParser xmlPullParser) {
        String attributeValue = b1.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (attributeValue == null) {
            return null;
        }
        Matcher matcher = f77138g.matcher(attributeValue);
        if (!matcher.matches()) {
            b0.w("TtmlParser", "Ignoring non-pixel tts extent: ".concat(attributeValue));
            return null;
        }
        try {
            return new z(Integer.parseInt((String) io.bidmachine.media3.common.util.a.checkNotNull(matcher.group(1))), Integer.parseInt((String) io.bidmachine.media3.common.util.a.checkNotNull(matcher.group(2))));
        } catch (NumberFormatException unused) {
            b0.w("TtmlParser", "Ignoring malformed tts extent: ".concat(attributeValue));
            return null;
        }
    }

    @Override // hp.s
    public int getCueReplacementBehavior() {
        return 1;
    }

    @Override // hp.s
    public /* bridge */ /* synthetic */ void parse(byte[] bArr, r rVar, io.bidmachine.media3.common.util.k kVar) {
        super.parse(bArr, rVar, kVar);
    }

    @Override // hp.s
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    public static c g(XmlPullParser xmlPullParser, c cVar, HashMap map, j6.d dVar) throws k, NumberFormatException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int attributeCount = xmlPullParser2.getAttributeCount();
        String strSubstring = null;
        g gVarH = h(xmlPullParser2, null);
        long jI = -9223372036854775807L;
        long jI2 = -9223372036854775807L;
        long jI3 = -9223372036854775807L;
        String[] strArr = null;
        String str = "";
        int i10 = 0;
        while (i10 < attributeCount) {
            String attributeName = xmlPullParser2.getAttributeName(i10);
            int i11 = attributeCount;
            String attributeValue = xmlPullParser2.getAttributeValue(i10);
            attributeName.getClass();
            char c10 = 65535;
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals(TtmlNode.TAG_REGION)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (attributeName.equals(PtLatqAYjEFT.nMzRBaojhUF)) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 109780401:
                    if (attributeName.equals(TtmlNode.TAG_STYLE)) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    if (!map.containsKey(attributeValue)) {
                        break;
                    } else {
                        str = attributeValue;
                        break;
                    }
                case 1:
                    jI3 = i(attributeValue, dVar);
                    break;
                case 2:
                    jI2 = i(attributeValue, dVar);
                    break;
                case 3:
                    jI = i(attributeValue, dVar);
                    break;
                case 4:
                    String strTrim = attributeValue.trim();
                    String[] strArrSplit = strTrim.isEmpty() ? new String[0] : a1.split(strTrim, "\\s+");
                    if (strArrSplit.length > 0) {
                        strArr = strArrSplit;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
            }
            i10++;
            xmlPullParser2 = xmlPullParser;
            attributeCount = i11;
        }
        if (cVar != null) {
            long j10 = cVar.f77123d;
            if (j10 != C.TIME_UNSET) {
                if (jI != C.TIME_UNSET) {
                    jI += j10;
                }
                if (jI2 != C.TIME_UNSET) {
                    jI2 += j10;
                }
            }
        }
        long j11 = jI;
        if (jI2 == C.TIME_UNSET) {
            if (jI3 != C.TIME_UNSET) {
                jI2 = j11 + jI3;
            } else if (cVar != null) {
                long j12 = cVar.f77124e;
                if (j12 != C.TIME_UNSET) {
                    jI2 = j12;
                }
            }
        }
        return c.buildNode(xmlPullParser.getName(), j11, jI2, gVarH, strArr, str, strSubstring, cVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:143:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static np.g h(org.xmlpull.v1.XmlPullParser r17, np.g r18) {
        /*
            Method dump skipped, instructions count: 1244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: np.d.h(org.xmlpull.v1.XmlPullParser, np.g):np.g");
    }

    @Override // hp.s
    public void parse(byte[] bArr, int i10, int i11, r rVar, io.bidmachine.media3.common.util.k kVar) {
        hp.f.toCuesWithTiming(parseToLegacySubtitle(bArr, i10, i11), rVar, kVar);
    }

    @Override // hp.s
    public i parseToLegacySubtitle(byte[] bArr, int i10, int i11) throws XmlPullParserException, NumberFormatException, IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f77141a.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new e(""));
            h hVar = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i10, i11), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int i12 = 0;
            int iC = 15;
            j6.d dVarE = f77140i;
            z zVarJ = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i12 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    String str = LJjmO.VDOZRIHcNmyywdH;
                    if (eventType == 2) {
                        if (str.equals(name)) {
                            dVarE = e(xmlPullParserNewPullParser);
                            iC = c(xmlPullParserNewPullParser);
                            zVarJ = j(xmlPullParserNewPullParser);
                        }
                        j6.d dVar = dVarE;
                        z zVar = zVarJ;
                        int i13 = iC;
                        if (b(name)) {
                            if (TtmlNode.TAG_HEAD.equals(name)) {
                                f(xmlPullParserNewPullParser, map, i13, zVar, map2, map3);
                            } else {
                                try {
                                    c cVarG = g(xmlPullParserNewPullParser, cVar, map2, dVar);
                                    arrayDeque.push(cVarG);
                                    if (cVar != null) {
                                        cVar.addChild(cVarG);
                                    }
                                } catch (k e10) {
                                    b0.w("TtmlParser", "Suppressing parser error", e10);
                                }
                            }
                            iC = i13;
                            zVarJ = zVar;
                            dVarE = dVar;
                        } else {
                            b0.i("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        i12++;
                        iC = i13;
                        zVarJ = zVar;
                        dVarE = dVar;
                    } else if (eventType == 4) {
                        ((c) io.bidmachine.media3.common.util.a.checkNotNull(cVar)).addChild(c.buildTextNode(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals(str)) {
                            hVar = new h((c) io.bidmachine.media3.common.util.a.checkNotNull((c) arrayDeque.peek()), map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i12++;
                } else if (eventType == 3) {
                    i12--;
                }
                xmlPullParserNewPullParser.next();
            }
            return (i) io.bidmachine.media3.common.util.a.checkNotNull(hVar);
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new IllegalStateException("Unable to decode source", e12);
        }
    }
}
