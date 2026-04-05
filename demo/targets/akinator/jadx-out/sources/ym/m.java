package ym;

import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m extends h {

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f94665k = {"skipoffset"};

    /* renamed from: e, reason: collision with root package name */
    public Float f94666e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f94667f;

    /* renamed from: g, reason: collision with root package name */
    public final w f94668g;

    /* renamed from: h, reason: collision with root package name */
    public String f94669h;

    /* renamed from: i, reason: collision with root package name */
    public final EnumMap f94670i;

    /* renamed from: j, reason: collision with root package name */
    public final int f94671j;

    public m(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, NumberFormatException {
        super(xmlPullParser);
        this.f94671j = -1;
        xmlPullParser.require(2, null, "Linear");
        int i10 = u.i(a("skipoffset"));
        if (i10 > -1) {
            this.f94671j = i10;
        }
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (u.d(name, "Duration")) {
                    float fI = u.i(u.g(xmlPullParser));
                    if (fI > -1.0f) {
                        setDurationSec(Float.valueOf(fI));
                    }
                } else if (u.d(name, "MediaFiles")) {
                    xmlPullParser.require(2, null, "MediaFiles");
                    ArrayList arrayList = new ArrayList();
                    while (xmlPullParser.next() != 3) {
                        if (xmlPullParser.getEventType() == 2) {
                            if (u.d(xmlPullParser.getName(), "MediaFile")) {
                                n nVar = new n(xmlPullParser);
                                if (nVar.isValidTag()) {
                                    arrayList.add(nVar);
                                } else {
                                    io.bidmachine.iab.vast.e.d("VastXmlTag", "MediaFile: is not valid. Skipping it.", new Object[0]);
                                    u.h(xmlPullParser);
                                }
                            } else {
                                u.h(xmlPullParser);
                            }
                        }
                    }
                    xmlPullParser.require(3, null, "MediaFiles");
                    this.f94667f = arrayList;
                } else if (u.d(name, "VideoClicks")) {
                    this.f94668g = new w(xmlPullParser);
                } else if (u.d(name, "AdParameters")) {
                    setAdParameters(u.g(xmlPullParser));
                } else if (u.d(name, "TrackingEvents")) {
                    this.f94670i = new q(xmlPullParser).f94686e;
                } else {
                    u.h(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "Linear");
    }

    public String getAdParameters() {
        return this.f94669h;
    }

    public Float getDurationSec() {
        return this.f94666e;
    }

    public List<n> getMediaFileTagList() {
        return this.f94667f;
    }

    public int getSkipOffsetSec() {
        return this.f94671j;
    }

    @Override // ym.u
    public String[] getSupportedAttributes() {
        return f94665k;
    }

    public Map<io.bidmachine.iab.vast.a, List<String>> getTrackingEventListMap() {
        return this.f94670i;
    }

    public w getVideoClicksTag() {
        return this.f94668g;
    }

    public void setAdParameters(String str) {
        this.f94669h = str;
    }

    public void setDurationSec(Float f10) {
        this.f94666e = f10;
    }
}
