package ym;

import android.text.TextUtils;
import j1.o2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import tm.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g extends u {

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f94653l = {"width", "height", "id", "assetWidth", "assetHeight", "expandedWidth", "expandedHeight", "apiFramework", "adSlotID", "required"};

    /* renamed from: e, reason: collision with root package name */
    public final p f94654e;

    /* renamed from: f, reason: collision with root package name */
    public final String f94655f;

    /* renamed from: g, reason: collision with root package name */
    public String f94656g;

    /* renamed from: h, reason: collision with root package name */
    public final String f94657h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f94658i;

    /* renamed from: j, reason: collision with root package name */
    public final EnumMap f94659j;

    /* renamed from: k, reason: collision with root package name */
    public String f94660k;

    public g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.require(2, null, "Companion");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (u.d(name, "StaticResource")) {
                    p pVar = new p(xmlPullParser);
                    if (pVar.isValidTag()) {
                        this.f94654e = pVar;
                    }
                } else if (u.d(name, "IFrameResource")) {
                    this.f94655f = u.g(xmlPullParser);
                } else if (u.d(name, "HTMLResource")) {
                    setHtmlResource(u.g(xmlPullParser));
                } else if (u.d(name, "CompanionClickThrough")) {
                    this.f94657h = u.g(xmlPullParser);
                } else if (u.d(name, "CompanionClickTracking")) {
                    String strG = u.g(xmlPullParser);
                    if (!TextUtils.isEmpty(strG)) {
                        if (this.f94658i == null) {
                            this.f94658i = new ArrayList();
                        }
                        this.f94658i.add(strG);
                    }
                } else if (u.d(name, "TrackingEvents")) {
                    this.f94659j = new q(xmlPullParser).f94686e;
                } else if (u.d(name, "AdParameters")) {
                    setAdParameters(u.g(xmlPullParser));
                } else {
                    u.h(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "Companion");
    }

    public String getAdParameters() {
        return this.f94660k;
    }

    public String getCompanionClickThrough() {
        return this.f94657h;
    }

    public List<String> getCompanionClickTrackingList() {
        return this.f94658i;
    }

    public int getHeight() {
        return e("height");
    }

    public String getHtml() {
        String htmlForMraid = getHtmlForMraid();
        if (htmlForMraid != null) {
            return d0.processRawHtml(htmlForMraid);
        }
        return null;
    }

    public String getHtmlForMraid() {
        String str = this.f94656g;
        if (str != null) {
            return str;
        }
        p pVar = this.f94654e;
        if (pVar != null) {
            return e3.g.l("<script type='text/javascript'>document.write('<a style=\"display: flex; width: 100%; height: 100%; justify-content: center; align-items: center\" href=\"", this.f94657h, "\" target=\"_blank\"><img style=\"border-style: none; height: 100%; width: 100%; object-fit: contain;\" src=\"", pVar.getText(), "\"/></a>');</script>");
        }
        if (this.f94655f != null) {
            return o2.o(w0.i.f(getWidth(), getHeight(), "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"", "\" height=\"", "\" src=\""), this.f94655f, "\"></iframe>");
        }
        return null;
    }

    public String getHtmlResource() {
        return this.f94656g;
    }

    public String getIFrameResource() {
        return this.f94655f;
    }

    public p getStaticResourceTag() {
        return this.f94654e;
    }

    @Override // ym.u
    public String[] getSupportedAttributes() {
        return f94653l;
    }

    public Map<io.bidmachine.iab.vast.a, List<String>> getTrackingEventListMap() {
        return this.f94659j;
    }

    public int getWidth() {
        return e("width");
    }

    public boolean hasCreative() {
        return (this.f94656g == null && this.f94654e == null && this.f94655f == null) ? false : true;
    }

    @Override // ym.u
    public boolean isValidTag() {
        return (TextUtils.isEmpty(a("width")) || TextUtils.isEmpty(a("height"))) ? false : true;
    }

    public void setAdParameters(String str) {
        this.f94660k = str;
    }

    public void setHtmlResource(String str) {
        this.f94656g = str;
    }
}
