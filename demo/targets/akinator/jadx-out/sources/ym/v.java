package ym;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v extends u {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f94692g = {"vendor"};

    /* renamed from: e, reason: collision with root package name */
    public final l f94693e;

    /* renamed from: f, reason: collision with root package name */
    public final String f94694f;

    public v(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.require(2, null, "Verification");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (u.d(name, "JavaScriptResource")) {
                    this.f94693e = new l(xmlPullParser);
                } else if (u.d(name, "VerificationParameters")) {
                    this.f94694f = u.g(xmlPullParser);
                } else {
                    u.h(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "Verification");
    }

    public l getJavaScriptResourceTag() {
        return this.f94693e;
    }

    @Override // ym.u
    public String[] getSupportedAttributes() {
        return f94692g;
    }

    public String getVendor() {
        return a("vendor");
    }

    public String getVerificationParameters() {
        return this.f94694f;
    }
}
