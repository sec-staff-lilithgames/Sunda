package so;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gn.z0;
import io.bidmachine.media3.common.util.b0;
import io.bidmachine.media3.common.util.b1;
import java.io.IOException;
import java.io.StringReader;
import nh.b5;
import nh.x4;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import so.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f86066a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f86067b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f86068c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static c a(String str) throws XmlPullParserException, IOException, NumberFormatException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!b1.isStartTag(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw z0.createForMalformedContainer("Couldn't find xmp metadata", null);
        }
        b5 b5VarOf = b5.of();
        long j10 = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (b1.isStartTag(xmlPullParserNewPullParser, "rdf:Description")) {
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 >= 4) {
                        break loop0;
                    }
                    String attributeValue = b1.getAttributeValue(xmlPullParserNewPullParser, f86066a[i11]);
                    if (attributeValue == null) {
                        i11++;
                    } else if (Integer.parseInt(attributeValue) == 1) {
                        int i12 = 0;
                        while (true) {
                            if (i12 >= 4) {
                                break;
                            }
                            String attributeValue2 = b1.getAttributeValue(xmlPullParserNewPullParser, f86067b[i12]);
                            if (attributeValue2 != null) {
                                j10 = Long.parseLong(attributeValue2);
                                if (j10 == -1) {
                                    break;
                                }
                            } else {
                                i12++;
                            }
                        }
                        j10 = -9223372036854775807L;
                        while (true) {
                            if (i10 >= 2) {
                                b5VarOf = b5.of();
                                break;
                            }
                            String attributeValue3 = b1.getAttributeValue(xmlPullParserNewPullParser, f86068c[i10]);
                            if (attributeValue3 != null) {
                                b5VarOf = b5.of(new c.a("image/jpeg", "Primary", 0L, 0L), new c.a(MimeTypes.VIDEO_MP4, "MotionPhoto", Long.parseLong(attributeValue3), 0L));
                                break;
                            }
                            i10++;
                        }
                    }
                }
                return null;
            }
            if (b1.isStartTag(xmlPullParserNewPullParser, "Container:Directory")) {
                b5VarOf = b(xmlPullParserNewPullParser, "Container", "Item");
            } else if (b1.isStartTag(xmlPullParserNewPullParser, "GContainer:Directory")) {
                b5VarOf = b(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!b1.isEndTag(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (b5VarOf.isEmpty()) {
            return null;
        }
        return new c(j10, b5VarOf);
    }

    public static b5 b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        x4 x4VarBuilder = b5.builder();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (b1.isStartTag(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String attributeValue = b1.getAttributeValue(xmlPullParser, strConcat3);
                String attributeValue2 = b1.getAttributeValue(xmlPullParser, strConcat4);
                String attributeValue3 = b1.getAttributeValue(xmlPullParser, strConcat5);
                String attributeValue4 = b1.getAttributeValue(xmlPullParser, strConcat6);
                if (attributeValue == null || attributeValue2 == null) {
                    return b5.of();
                }
                x4VarBuilder.add((Object) new c.a(attributeValue, attributeValue2, attributeValue3 != null ? Long.parseLong(attributeValue3) : 0L, attributeValue4 != null ? Long.parseLong(attributeValue4) : 0L));
            }
        } while (!b1.isEndTag(xmlPullParser, strConcat2));
        return x4VarBuilder.build();
    }

    public static c parse(String str) throws IOException {
        try {
            return a(str);
        } catch (z0 | NumberFormatException | XmlPullParserException unused) {
            b0.w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }
}
