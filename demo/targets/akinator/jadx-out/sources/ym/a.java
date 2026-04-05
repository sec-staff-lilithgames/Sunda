package ym;

import com.applovin.sdk.AppLovinMediationProvider;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class a extends u {

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f94625e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f94626f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f94627g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f94628h;

    public static ArrayList m(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "Creatives");
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (u.d(xmlPullParser.getName(), "Creative")) {
                    arrayList.add(new i(xmlPullParser));
                } else {
                    u.h(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "Creatives");
        return arrayList;
    }

    public static ArrayList n(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        u dVar;
        xmlPullParser.require(2, null, "Extensions");
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (u.d(xmlPullParser.getName(), "Extension")) {
                    xmlPullParser.require(2, null, "Extension");
                    String strA = new j(xmlPullParser).a("type");
                    if (u.d(strA, AppLovinMediationProvider.APPODEAL)) {
                        dVar = new e(xmlPullParser);
                    } else if (u.d(strA, "AdVerifications")) {
                        dVar = null;
                        while (xmlPullParser.next() != 3) {
                            if (xmlPullParser.getEventType() == 2) {
                                if (u.d(xmlPullParser.getName(), "AdVerifications")) {
                                    dVar = new d(xmlPullParser);
                                } else {
                                    u.h(xmlPullParser);
                                }
                            }
                        }
                    } else {
                        u.h(xmlPullParser);
                        dVar = null;
                    }
                    xmlPullParser.require(3, null, "Extension");
                    if (dVar != null) {
                        arrayList.add(dVar);
                    }
                } else {
                    u.h(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "Extensions");
        return arrayList;
    }

    public List<i> getCreativeTagList() {
        return this.f94625e;
    }

    public List<String> getErrorUrlList() {
        return this.f94628h;
    }

    public List<j> getExtensionTagList() {
        return this.f94626f;
    }

    public List<String> getImpressionUrlList() {
        return this.f94627g;
    }
}
