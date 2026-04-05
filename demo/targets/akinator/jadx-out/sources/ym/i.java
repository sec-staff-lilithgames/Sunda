package ym;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i extends u {

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f94661f = {"id", "adID"};

    /* renamed from: e, reason: collision with root package name */
    public final h f94662e;

    public i(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.require(2, null, "Creative");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (u.d(name, "Linear")) {
                    this.f94662e = new m(xmlPullParser);
                } else if (u.d(name, "CompanionAds")) {
                    this.f94662e = new f(xmlPullParser);
                } else {
                    u.h(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "Creative");
    }

    public h getCreativeContentTag() {
        return this.f94662e;
    }

    @Override // ym.u
    public String[] getSupportedAttributes() {
        return f94661f;
    }
}
