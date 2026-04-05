package ym;

import com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class t extends u {

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f94688f = {"version"};

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f94689e;

    public List<c> getAdTagList() {
        return this.f94689e;
    }

    @Override // ym.u
    public String[] getSupportedAttributes() {
        return f94688f;
    }

    public boolean hasAd() {
        return !this.f94689e.isEmpty();
    }

    public t(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        this.f94689e = new ArrayList();
        String str = OcvDtWCQ.IhEDBcLa;
        xmlPullParser.require(2, null, str);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (u.d(xmlPullParser.getName(), "Ad")) {
                    this.f94689e.add(new c(xmlPullParser));
                } else {
                    u.h(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, str);
    }
}
