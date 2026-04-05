package ym;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q extends u {

    /* renamed from: e, reason: collision with root package name */
    public final EnumMap f94686e;

    public q(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        io.bidmachine.iab.vast.a aVarValueOf;
        super(xmlPullParser);
        this.f94686e = new EnumMap(io.bidmachine.iab.vast.a.class);
        xmlPullParser.require(2, null, "TrackingEvents");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (u.d(xmlPullParser.getName(), "Tracking")) {
                    String strA = new r(xmlPullParser).a(NotificationCompat.CATEGORY_EVENT);
                    try {
                        aVarValueOf = io.bidmachine.iab.vast.a.valueOf(strA);
                    } catch (Exception unused) {
                        io.bidmachine.iab.vast.e.d("VastXmlTag", "Event: %s is not valid. Skipping it.", strA);
                        aVarValueOf = null;
                    }
                    if (aVarValueOf != null) {
                        String strG = u.g(xmlPullParser);
                        List list = (List) this.f94686e.get(aVarValueOf);
                        if (list != null) {
                            list.add(strG);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(strG);
                            this.f94686e.put((EnumMap) aVarValueOf, (io.bidmachine.iab.vast.a) arrayList);
                        }
                    } else {
                        u.h(xmlPullParser);
                    }
                } else {
                    u.h(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "TrackingEvents");
    }
}
