package ym;

import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class x extends a {

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f94698j = {"followAdditionalWrappers", "allowMultipleAds", "fallbackOnNoAd"};

    /* renamed from: i, reason: collision with root package name */
    public final String f94699i;

    public x(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.require(2, null, "Wrapper");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (u.d(name, "Creatives")) {
                    this.f94625e = a.m(xmlPullParser);
                } else if (u.d(name, "Extensions")) {
                    this.f94626f = a.n(xmlPullParser);
                } else if (u.d(name, "Impression")) {
                    String strG = u.g(xmlPullParser);
                    if (!TextUtils.isEmpty(strG)) {
                        if (this.f94627g == null) {
                            this.f94627g = new ArrayList();
                        }
                        this.f94627g.add(strG);
                    }
                } else if (u.d(name, "Error")) {
                    String strG2 = u.g(xmlPullParser);
                    if (!TextUtils.isEmpty(strG2)) {
                        if (this.f94628h == null) {
                            this.f94628h = new ArrayList();
                        }
                        this.f94628h.add(strG2);
                    }
                } else if (u.d(name, "AdSystem")) {
                    new b(xmlPullParser);
                } else if (u.d(name, "VASTAdTagURI")) {
                    this.f94699i = u.g(xmlPullParser);
                } else {
                    u.h(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "Wrapper");
    }

    @Override // ym.u
    public String[] getSupportedAttributes() {
        return f94698j;
    }

    public String getVastAdTagUri() {
        return this.f94699i;
    }
}
