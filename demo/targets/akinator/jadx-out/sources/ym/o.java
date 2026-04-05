package ym;

import android.text.TextUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class o extends u {

    /* renamed from: i, reason: collision with root package name */
    public String f94677i;

    /* renamed from: e, reason: collision with root package name */
    public final um.p f94673e = new um.p();

    /* renamed from: f, reason: collision with root package name */
    public final um.p f94674f = new um.p();

    /* renamed from: g, reason: collision with root package name */
    public final um.p f94675g = new um.p();

    /* renamed from: h, reason: collision with root package name */
    public final um.p f94676h = new um.p();

    /* renamed from: j, reason: collision with root package name */
    public float f94678j = 0.0f;

    /* renamed from: k, reason: collision with root package name */
    public float f94679k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    public boolean f94680l = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f94681m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f94682n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f94683o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f94684p = false;

    @Override // ym.u
    public final void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "Postbanner");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                try {
                    String name = xmlPullParser.getName();
                    if (u.d(name, "CloseTime")) {
                        String strG = u.g(xmlPullParser);
                        if (!TextUtils.isEmpty(strG)) {
                            this.f94678j = Float.parseFloat(strG);
                        }
                    } else if (u.d(name, "Duration")) {
                        String strG2 = u.g(xmlPullParser);
                        if (!TextUtils.isEmpty(strG2)) {
                            this.f94679k = Float.parseFloat(strG2);
                        }
                    } else if (u.d(name, "ClosableView")) {
                        u.c(xmlPullParser, this.f94673e);
                    } else if (u.d(name, "Countdown")) {
                        u.c(xmlPullParser, this.f94674f);
                    } else if (u.d(name, "LoadingView")) {
                        u.c(xmlPullParser, this.f94675g);
                    } else if (u.d(name, "Progress")) {
                        u.c(xmlPullParser, this.f94676h);
                    } else if (u.d(name, "UseNativeClose")) {
                        this.f94682n = u.l(u.g(xmlPullParser));
                    } else if (u.d(name, "IgnoresSafeAreaLayoutGuide")) {
                        this.f94681m = u.l(u.g(xmlPullParser));
                    } else if (u.d(name, "ProductLink")) {
                        this.f94677i = u.g(xmlPullParser);
                    } else if (u.d(name, "R1")) {
                        this.f94683o = u.l(u.g(xmlPullParser));
                    } else if (u.d(name, "R2")) {
                        this.f94684p = u.l(u.g(xmlPullParser));
                    } else {
                        u.h(xmlPullParser);
                    }
                } catch (Throwable th2) {
                    io.bidmachine.iab.vast.e.e("VastXmlTag", th2);
                }
            }
        }
        xmlPullParser.require(3, null, "Postbanner");
    }

    public um.p getCloseStyle() {
        return this.f94673e;
    }

    public float getCloseTimeSec() {
        return this.f94678j;
    }

    public um.p getCountDownStyle() {
        return this.f94674f;
    }

    public float getDurationSec() {
        return this.f94679k;
    }

    public um.p getLoadingStyle() {
        return this.f94675g;
    }

    public String getProductLink() {
        return this.f94677i;
    }

    public um.p getProgressStyle() {
        return this.f94676h;
    }

    public boolean isForceUseNativeClose() {
        return this.f94682n;
    }

    public boolean isIgnoreSafeArea() {
        return this.f94681m;
    }

    public boolean isR1() {
        return this.f94683o;
    }

    public boolean isR2() {
        return this.f94684p;
    }

    public boolean isVisible() {
        return this.f94680l;
    }

    public void setCloseTimeSec(int i10) {
        this.f94678j = i10;
    }

    public void setVisible(boolean z10) {
        this.f94680l = z10;
    }
}
