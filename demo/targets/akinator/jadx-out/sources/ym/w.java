package ym;

import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class w extends u {

    /* renamed from: e, reason: collision with root package name */
    public final String f94695e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f94696f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f94697g;

    public w(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.require(2, null, "VideoClicks");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (u.d(name, "ClickThrough")) {
                    this.f94695e = u.g(xmlPullParser);
                } else if (u.d(name, "ClickTracking")) {
                    String strG = u.g(xmlPullParser);
                    if (!TextUtils.isEmpty(strG)) {
                        if (this.f94696f == null) {
                            this.f94696f = new ArrayList();
                        }
                        this.f94696f.add(strG);
                    }
                } else if (u.d(name, "CustomClick")) {
                    String strG2 = u.g(xmlPullParser);
                    if (!TextUtils.isEmpty(strG2)) {
                        if (this.f94697g == null) {
                            this.f94697g = new ArrayList();
                        }
                        this.f94697g.add(strG2);
                    }
                } else {
                    u.h(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "VideoClicks");
    }

    public String getClickThroughUrl() {
        return this.f94695e;
    }

    public List<String> getClickTrackingUrlList() {
        return this.f94696f;
    }
}
