package yw;

import java.io.InputStream;
import java.io.Reader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class o0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f96742a;

    public o0() throws Exception {
        XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
        this.f96742a = xmlPullParserFactoryNewInstance;
        xmlPullParserFactoryNewInstance.setNamespaceAware(true);
    }

    @Override // yw.m0
    public h provide(InputStream inputStream) throws Exception {
        XmlPullParser xmlPullParserNewPullParser = this.f96742a.newPullParser();
        if (inputStream != null) {
            xmlPullParserNewPullParser.setInput(inputStream, null);
        }
        return new q0(xmlPullParserNewPullParser);
    }

    @Override // yw.m0
    public h provide(Reader reader) throws Exception {
        XmlPullParser xmlPullParserNewPullParser = this.f96742a.newPullParser();
        if (reader != null) {
            xmlPullParserNewPullParser.setInput(reader);
        }
        return new q0(xmlPullParserNewPullParser);
    }
}
