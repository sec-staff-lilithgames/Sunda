package yw;

import java.io.InputStream;
import java.io.Reader;
import javax.xml.parsers.DocumentBuilderFactory;
import org.xml.sax.InputSource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class b implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final DocumentBuilderFactory f96672a;

    public b() {
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        this.f96672a = documentBuilderFactoryNewInstance;
        documentBuilderFactoryNewInstance.setNamespaceAware(true);
    }

    @Override // yw.m0
    public h provide(InputStream inputStream) throws Exception {
        return new d(this.f96672a.newDocumentBuilder().parse(new InputSource(inputStream)));
    }

    @Override // yw.m0
    public h provide(Reader reader) throws Exception {
        return new d(this.f96672a.newDocumentBuilder().parse(new InputSource(reader)));
    }
}
