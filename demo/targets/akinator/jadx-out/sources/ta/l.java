package ta;

import java.io.IOException;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilderFactory;
import kotlin.jvm.internal.e0;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import qb.c0;
import qb.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l extends d0 {

    /* renamed from: h, reason: collision with root package name */
    public final int f86680h = 20000;

    /* renamed from: i, reason: collision with root package name */
    public final String f86681i;

    public l(String str) {
        this.f86681i = str;
    }

    @Override // qb.d0
    public int getMTimeout() {
        return this.f86680h;
    }

    @Override // qb.d0
    public String getMUrl() {
        return this.f86681i;
    }

    @Override // qb.d0
    public int parseWSResponse(String response) throws SAXException, IOException {
        e0.checkNotNullParameter(response, "response");
        try {
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(response)));
            document.getDocumentElement().normalize();
            return c0.testNodeCompletion(document);
        } catch (Exception unused) {
            return 400;
        }
    }
}
