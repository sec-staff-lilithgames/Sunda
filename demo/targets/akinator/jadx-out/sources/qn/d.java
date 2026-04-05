package qn;

import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import gn.z0;
import go.b0;
import io.bidmachine.media3.common.DrmInitData;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.b1;
import io.bidmachine.media3.common.util.x0;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nh.b5;
import nh.p8;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import qn.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class d extends DefaultHandler implements b0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f83318b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f83319c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f83320d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f83321e = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f83322f = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f83323a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final io.bidmachine.media3.common.b f83324a;

        /* renamed from: b, reason: collision with root package name */
        public final b5 f83325b;

        /* renamed from: c, reason: collision with root package name */
        public final m f83326c;

        /* renamed from: d, reason: collision with root package name */
        public final String f83327d;

        /* renamed from: e, reason: collision with root package name */
        public final ArrayList f83328e;

        /* renamed from: f, reason: collision with root package name */
        public final ArrayList f83329f;

        /* renamed from: g, reason: collision with root package name */
        public final long f83330g;

        /* renamed from: h, reason: collision with root package name */
        public final List f83331h;

        /* renamed from: i, reason: collision with root package name */
        public final List f83332i;

        public a(io.bidmachine.media3.common.b bVar, List<b> list, m mVar, String str, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<e> arrayList2, List<e> list2, List<e> list3, long j10) {
            this.f83324a = bVar;
            this.f83325b = b5.copyOf((Collection) list);
            this.f83326c = mVar;
            this.f83327d = str;
            this.f83328e = arrayList;
            this.f83329f = arrayList2;
            this.f83331h = list2;
            this.f83332i = list3;
            this.f83330g = j10;
        }
    }

    public d() {
        try {
            this.f83323a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static long a(ArrayList arrayList, long j10, long j11, int i10, long j12) {
        int iCeilDivide = i10 >= 0 ? i10 + 1 : (int) a1.ceilDivide(j12 - j10, j11);
        for (int i11 = 0; i11 < iCeilDivide; i11++) {
            arrayList.add(new m.d(j10, j11));
            j10 += j11;
        }
        return j10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093 A[PHI: r13
      0x0093: PHI (r13v30 int) = (r13v5 int), (r13v8 int), (r13v33 int) binds: [B:128:0x01a3, B:120:0x0190, B:47:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(org.xmlpull.v1.XmlPullParser r12, java.lang.String r13) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.d.b(org.xmlpull.v1.XmlPullParser, java.lang.String):int");
    }

    public static long c(XmlPullParser xmlPullParser, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j10;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList d(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z10) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : z10 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i11 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!b1.isEndTag(xmlPullParser, "BaseURL"));
        if (x0.isAbsolute(text)) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return p8.newArrayList(new b(text, attributeValue3, i10, i11));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            b bVar = (b) arrayList.get(i12);
            String strResolve = x0.resolve(bVar.f83301a, text);
            String str = attributeValue3 == null ? strResolve : attributeValue3;
            if (z10) {
                i10 = bVar.f83303c;
                i11 = bVar.f83304d;
                str = bVar.f83302b;
            }
            arrayList2.add(new b(strResolve, str, i10, i11));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0119  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.UUID] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair e(org.xmlpull.v1.XmlPullParser r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.d.e(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public static int f(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public static e g(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!b1.isEndTag(xmlPullParser, str));
        return new e(attributeValue, attributeValue2, str2);
    }

    public static float h(XmlPullParser xmlPullParser, float f10) throws NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = f83318b.matcher(attributeValue);
            if (matcher.matches()) {
                int i10 = Integer.parseInt(matcher.group(1));
                return !TextUtils.isEmpty(matcher.group(2)) ? i10 / Integer.parseInt(r2) : i10;
            }
        }
        return f10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0a51  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0aa4  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0aaf  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0ac5  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0b0a  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0b32  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0b60  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0b6a  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0bda  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0c54  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0c5d  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0c64  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0c6d  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0c78  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0c8b  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0d4f  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0d52  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0d61  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0d64  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0d7f  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0dad A[LOOP:11: B:277:0x0780->B:518:0x0dad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:602:0x10a4 A[LOOP:5: B:187:0x0453->B:602:0x10a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:727:0x1485 A[LOOP:1: B:65:0x0122->B:727:0x1485, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:734:0x144f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:738:0x0f57 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:755:0x0a06 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:771:0x0c26 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static qn.c i(org.xmlpull.v1.XmlPullParser r153, android.net.Uri r154) throws org.xmlpull.v1.XmlPullParserException, java.lang.IllegalStateException, java.io.IOException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 5326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.d.i(org.xmlpull.v1.XmlPullParser, android.net.Uri):qn.c");
    }

    public static i j(XmlPullParser xmlPullParser, String str, String str2) throws NumberFormatException {
        long j10;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        long j11 = -1;
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j10 = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j11 = (Long.parseLong(strArrSplit[1]) - j10) + 1;
            }
        } else {
            j10 = 0;
        }
        return new i(attributeValue, j10, j11);
    }

    public static int k(String str) {
        if (str != null) {
            switch (str) {
                case "subtitle":
                case "forced_subtitle":
                case "forced-subtitle":
                    return 128;
                case "description":
                    return 512;
                case "enhanced-audio-intelligibility":
                    return 2048;
                case "alternate":
                    return 2;
                case "dub":
                    return 16;
                case "main":
                    return 1;
                case "sign":
                    return NotificationCompat.FLAG_LOCAL_ONLY;
                case "caption":
                    return 64;
                case "commentary":
                    return 8;
                case "emergency":
                    return 32;
                case "supplementary":
                    return 4;
            }
        }
        return 0;
    }

    public static int l(ArrayList arrayList) {
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (mh.c.equalsIgnoreCase("http://dashif.org/guidelines/trickmode", ((e) arrayList.get(i11)).f83333a)) {
                i10 = 16384;
            }
        }
        return i10;
    }

    public static m.e m(XmlPullParser xmlPullParser, m.e eVar) throws XmlPullParserException, NumberFormatException, IOException {
        long j10 = eVar != null ? eVar.f83365b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j10 = Long.parseLong(attributeValue);
        }
        long j11 = j10;
        long j12 = eVar != null ? eVar.f83366c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j12 = Long.parseLong(attributeValue2);
        }
        long j13 = j12;
        long j14 = eVar != null ? eVar.f83379d : 0L;
        long j15 = eVar != null ? eVar.f83380e : 0L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] strArrSplit = attributeValue3.split("-");
            j14 = Long.parseLong(strArrSplit[0]);
            j15 = (Long.parseLong(strArrSplit[1]) - j14) + 1;
        }
        long j16 = j15;
        long j17 = j14;
        i iVarJ = eVar != null ? eVar.f83364a : null;
        while (true) {
            xmlPullParser.next();
            if (b1.isStartTag(xmlPullParser, "Initialization")) {
                iVarJ = j(xmlPullParser, "sourceURL", "range");
            } else {
                maybeSkipTag(xmlPullParser);
            }
            i iVar = iVarJ;
            if (b1.isEndTag(xmlPullParser, "SegmentBase")) {
                return new m.e(iVar, j11, j13, j17, j16);
            }
            iVarJ = iVar;
        }
    }

    public static void maybeSkipTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (b1.isStartTag(xmlPullParser)) {
            int i10 = 1;
            while (i10 != 0) {
                xmlPullParser.next();
                if (b1.isStartTag(xmlPullParser)) {
                    i10++;
                } else if (b1.isEndTag(xmlPullParser)) {
                    i10--;
                }
            }
        }
    }

    public static m.b n(XmlPullParser xmlPullParser, m.b bVar, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException, NumberFormatException {
        long j15 = bVar != null ? bVar.f83365b : 1L;
        List arrayList = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j15 = Long.parseLong(attributeValue);
        }
        long j16 = j15;
        long j17 = bVar != null ? bVar.f83366c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j17 = Long.parseLong(attributeValue2);
        }
        long j18 = j17;
        long j19 = bVar != null ? bVar.f83368e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, IronSourceConstants.EVENTS_DURATION);
        if (attributeValue3 != null) {
            j19 = Long.parseLong(attributeValue3);
        }
        long j20 = j19;
        long j21 = bVar != null ? bVar.f83367d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j21 = Long.parseLong(attributeValue4);
        }
        long j22 = j21;
        long j23 = j13 == C.TIME_UNSET ? j12 : j13;
        long j24 = j23 == Long.MAX_VALUE ? -9223372036854775807L : j23;
        i iVarJ = null;
        List listP = null;
        do {
            xmlPullParser.next();
            if (b1.isStartTag(xmlPullParser, "Initialization")) {
                iVarJ = j(xmlPullParser, "sourceURL", "range");
            } else if (b1.isStartTag(xmlPullParser, "SegmentTimeline")) {
                listP = p(xmlPullParser, j16, j11);
            } else if (b1.isStartTag(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(j(xmlPullParser, "media", "mediaRange"));
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!b1.isEndTag(xmlPullParser, "SegmentList"));
        if (bVar != null) {
            if (iVarJ == null) {
                iVarJ = bVar.f83364a;
            }
            if (listP == null) {
                listP = bVar.f83369f;
            }
            if (arrayList == null) {
                arrayList = bVar.f83373j;
            }
        }
        return new m.b(iVarJ, j16, j18, j22, j20, listP, j24, arrayList, a1.msToUs(j14), a1.msToUs(j10));
    }

    public static m.c o(XmlPullParser xmlPullParser, m.c cVar, List list, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, NumberFormatException, IOException {
        long j15;
        long j16 = cVar != null ? cVar.f83365b : 1L;
        i iVarJ = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j16 = Long.parseLong(attributeValue);
        }
        long j17 = j16;
        long j18 = cVar != null ? cVar.f83366c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j18 = Long.parseLong(attributeValue2);
        }
        long j19 = j18;
        long j20 = cVar != null ? cVar.f83368e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, IronSourceConstants.EVENTS_DURATION);
        if (attributeValue3 != null) {
            j20 = Long.parseLong(attributeValue3);
        }
        long j21 = j20;
        long j22 = cVar != null ? cVar.f83367d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j22 = Long.parseLong(attributeValue4);
        }
        long j23 = j22;
        int i10 = 0;
        while (true) {
            if (i10 >= list.size()) {
                j15 = -1;
                break;
            }
            e eVar = (e) list.get(i10);
            if (mh.c.equalsIgnoreCase("http://dashif.org/guidelines/last-segment-number", eVar.f83333a)) {
                j15 = Long.parseLong(eVar.f83334b);
                break;
            }
            i10++;
        }
        long j24 = j15;
        long j25 = j13 == C.TIME_UNSET ? j12 : j13;
        long j26 = j25 == Long.MAX_VALUE ? -9223372036854775807L : j25;
        p pVarCompile = cVar != null ? cVar.f83375k : null;
        String attributeValue5 = xmlPullParser.getAttributeValue(null, "media");
        if (attributeValue5 != null) {
            pVarCompile = p.compile(attributeValue5);
        }
        p pVar = pVarCompile;
        p pVarCompile2 = cVar != null ? cVar.f83374j : null;
        String attributeValue6 = xmlPullParser.getAttributeValue(null, GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION);
        if (attributeValue6 != null) {
            pVarCompile2 = p.compile(attributeValue6);
        }
        p pVar2 = pVarCompile2;
        List listP = null;
        do {
            xmlPullParser.next();
            if (b1.isStartTag(xmlPullParser, "Initialization")) {
                iVarJ = j(xmlPullParser, "sourceURL", "range");
            } else if (b1.isStartTag(xmlPullParser, "SegmentTimeline")) {
                listP = p(xmlPullParser, j17, j11);
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!b1.isEndTag(xmlPullParser, "SegmentTemplate"));
        if (cVar != null) {
            if (iVarJ == null) {
                iVarJ = cVar.f83364a;
            }
            if (listP == null) {
                listP = cVar.f83369f;
            }
        }
        return new m.c(iVarJ, j17, j19, j23, j24, j21, listP, j26, pVar2, pVar, a1.msToUs(j14), a1.msToUs(j10));
    }

    public static ArrayList p(XmlPullParser xmlPullParser, long j10, long j11) throws XmlPullParserException, IOException {
        long j12;
        ArrayList arrayList = new ArrayList();
        long jA = 0;
        long j13 = -9223372036854775807L;
        boolean z10 = false;
        int i10 = 0;
        do {
            xmlPullParser.next();
            if (b1.isStartTag(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP);
                long j14 = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z10) {
                    int i11 = i10;
                    j12 = j14;
                    jA = a(arrayList, jA, j13, i11, j12);
                } else {
                    j12 = j14;
                }
                if (j12 != C.TIME_UNSET) {
                    jA = j12;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D);
                j13 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                i10 = attributeValue3 == null ? 0 : Integer.parseInt(attributeValue3);
                z10 = true;
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!b1.isEndTag(xmlPullParser, "SegmentTimeline"));
        if (!z10) {
            return arrayList;
        }
        a(arrayList, jA, j13, i10, a1.scaleLargeTimestamp(j11, j10, 1000L));
        return arrayList;
    }

    @Override // go.b0
    public c parse(Uri uri, InputStream inputStream) throws XmlPullParserException, IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f83323a.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return i(xmlPullParserNewPullParser, uri);
            }
            throw z0.createForMalformedManifest("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e10) {
            throw z0.createForMalformedManifest(null, e10);
        }
    }
}
