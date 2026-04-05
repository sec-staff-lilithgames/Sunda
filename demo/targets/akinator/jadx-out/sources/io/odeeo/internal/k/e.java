package io.odeeo.internal.k;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.odeeo.internal.b.g0;
import io.odeeo.internal.k.b;
import io.odeeo.internal.q0.h0;
import io.odeeo.internal.q0.p;
import io.odeeo.internal.u0.h1;
import j1.o2;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f64427a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f64428b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f64429c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static b a(String str) throws XmlPullParserException, IOException, NumberFormatException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!h0.isStartTag(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw g0.createForMalformedContainer("Couldn't find xmp metadata", null);
        }
        h1<b.a> h1VarOf = h1.of();
        long jC = C.TIME_UNSET;
        do {
            xmlPullParserNewPullParser.next();
            if (h0.isStartTag(xmlPullParserNewPullParser, "rdf:Description")) {
                if (!b(xmlPullParserNewPullParser)) {
                    return null;
                }
                jC = c(xmlPullParserNewPullParser);
                h1VarOf = a(xmlPullParserNewPullParser);
            } else if (h0.isStartTag(xmlPullParserNewPullParser, "Container:Directory")) {
                h1VarOf = a(xmlPullParserNewPullParser, "Container", "Item");
            } else if (h0.isStartTag(xmlPullParserNewPullParser, "GContainer:Directory")) {
                h1VarOf = a(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!h0.isEndTag(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (h1VarOf.isEmpty()) {
            return null;
        }
        return new b(jC, h1VarOf);
    }

    public static boolean b(XmlPullParser xmlPullParser) {
        for (String str : f64427a) {
            String attributeValue = h0.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                return Integer.parseInt(attributeValue) == 1;
            }
        }
        return false;
    }

    public static long c(XmlPullParser xmlPullParser) throws NumberFormatException {
        for (String str : f64428b) {
            String attributeValue = h0.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                long j10 = Long.parseLong(attributeValue);
                return j10 == -1 ? C.TIME_UNSET : j10;
            }
        }
        return C.TIME_UNSET;
    }

    public static b parse(String str) throws IOException {
        try {
            return a(str);
        } catch (g0 | NumberFormatException | XmlPullParserException unused) {
            p.w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    public static h1<b.a> a(XmlPullParser xmlPullParser) throws NumberFormatException {
        for (String str : f64429c) {
            String attributeValue = h0.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                return h1.of(new b.a("image/jpeg", "Primary", 0L, 0L), new b.a(MimeTypes.VIDEO_MP4, "MotionPhoto", Long.parseLong(attributeValue), 0L));
            }
        }
        return h1.of();
    }

    public static h1<b.a> a(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        h1.a aVarBuilder = h1.builder();
        String strL = o2.l(str, ":Item");
        String strL2 = o2.l(str, ":Directory");
        do {
            xmlPullParser.next();
            if (h0.isStartTag(xmlPullParser, strL)) {
                String strL3 = o2.l(str2, ":Mime");
                String strL4 = o2.l(str2, ":Semantic");
                String strL5 = o2.l(str2, ":Length");
                String strL6 = o2.l(str2, ":Padding");
                String attributeValue = h0.getAttributeValue(xmlPullParser, strL3);
                String attributeValue2 = h0.getAttributeValue(xmlPullParser, strL4);
                String attributeValue3 = h0.getAttributeValue(xmlPullParser, strL5);
                String attributeValue4 = h0.getAttributeValue(xmlPullParser, strL6);
                if (attributeValue != null && attributeValue2 != null) {
                    aVarBuilder.add((h1.a) new b.a(attributeValue, attributeValue2, attributeValue3 != null ? Long.parseLong(attributeValue3) : 0L, attributeValue4 != null ? Long.parseLong(attributeValue4) : 0L));
                } else {
                    return h1.of();
                }
            }
        } while (!h0.isEndTag(xmlPullParser, strL2));
        return aVarBuilder.build();
    }
}
