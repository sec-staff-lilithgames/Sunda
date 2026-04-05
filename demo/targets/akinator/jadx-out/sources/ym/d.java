package ym;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d extends j {

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f94632f;

    public d(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        this.f94632f = new ArrayList();
        xmlPullParser.require(2, null, "AdVerifications");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (u.d(xmlPullParser.getName(), "Verification")) {
                    this.f94632f.add(new v(xmlPullParser));
                } else {
                    u.h(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "AdVerifications");
    }

    public List<v> getVerificationTagList() {
        return this.f94632f;
    }
}
