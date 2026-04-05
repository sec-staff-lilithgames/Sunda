package ym;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f extends h {

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f94652e;

    public f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        this.f94652e = new ArrayList();
        xmlPullParser.require(2, null, "CompanionAds");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (u.d(xmlPullParser.getName(), "Companion")) {
                    g gVar = new g(xmlPullParser);
                    if (gVar.isValidTag()) {
                        this.f94652e.add(gVar);
                    } else {
                        io.bidmachine.iab.vast.e.d("VastXmlTag", "Creative Companion: is not valid. Skipping it.", new Object[0]);
                    }
                } else {
                    u.h(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "CompanionAds");
    }

    public List<g> getCompanionTagList() {
        return this.f94652e;
    }
}
