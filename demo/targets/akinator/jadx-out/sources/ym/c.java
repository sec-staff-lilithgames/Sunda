package ym;

import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c extends u {

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f94630f = {"id"};

    /* renamed from: e, reason: collision with root package name */
    public final a f94631e;

    public c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.require(2, null, "Ad");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (u.d(name, "InLine")) {
                    k kVar = new k(xmlPullParser);
                    xmlPullParser.require(2, null, "InLine");
                    while (xmlPullParser.next() != 3) {
                        if (xmlPullParser.getEventType() == 2) {
                            String name2 = xmlPullParser.getName();
                            if (u.d(name2, "Creatives")) {
                                kVar.f94625e = a.m(xmlPullParser);
                            } else if (u.d(name2, "Extensions")) {
                                kVar.f94626f = a.n(xmlPullParser);
                            } else if (u.d(name2, "Impression")) {
                                String strG = u.g(xmlPullParser);
                                if (!TextUtils.isEmpty(strG)) {
                                    if (kVar.f94627g == null) {
                                        kVar.f94627g = new ArrayList();
                                    }
                                    kVar.f94627g.add(strG);
                                }
                            } else if (u.d(name2, "Error")) {
                                String strG2 = u.g(xmlPullParser);
                                if (!TextUtils.isEmpty(strG2)) {
                                    if (kVar.f94628h == null) {
                                        kVar.f94628h = new ArrayList();
                                    }
                                    kVar.f94628h.add(strG2);
                                }
                            } else if (u.d(name2, "AdSystem")) {
                                new b(xmlPullParser);
                            } else {
                                u.h(xmlPullParser);
                            }
                        }
                    }
                    xmlPullParser.require(3, null, "InLine");
                    this.f94631e = kVar;
                } else if (u.d(name, "Wrapper")) {
                    this.f94631e = new x(xmlPullParser);
                } else {
                    u.h(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "Ad");
    }

    public a getAdContentTag() {
        return this.f94631e;
    }

    @Override // ym.u
    public String[] getSupportedAttributes() {
        return f94630f;
    }
}
