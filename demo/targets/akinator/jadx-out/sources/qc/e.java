package qc;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.spi.FileSystemProvider;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import jc.k;
import oc.c1;
import ub.u;
import ub.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class e extends c1 {

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f82735f;

    static {
        File[] fileArrListRoots = File.listRoots();
        int length = fileArrListRoots.length;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            String path = fileArrListRoots[i10].getPath();
            if (path.length() >= 2 && Character.isLetter(path.charAt(0)) && path.charAt(1) == ':') {
                z10 = true;
                break;
            }
            i10++;
        }
        f82735f = z10;
    }

    public e() {
        super(pe.a.c());
    }

    @Override // jc.q
    public Path deserialize(u uVar, k kVar) throws IOException {
        if (!uVar.hasToken(z.VALUE_STRING)) {
            return cf.a.d(kVar.handleUnexpectedToken(pe.a.c(), uVar));
        }
        String text = uVar.getText();
        if (text.indexOf(58) < 0) {
            return Paths.get(text, new String[0]);
        }
        if (f82735f && text.length() >= 2 && Character.isLetter(text.charAt(0)) && text.charAt(1) == ':') {
            return Paths.get(text, new String[0]);
        }
        try {
            URI uri = new URI(text);
            try {
                return Paths.get(uri);
            } catch (FileSystemNotFoundException e10) {
                try {
                    String scheme = uri.getScheme();
                    Iterator it = ServiceLoader.load(FileSystemProvider.class).iterator();
                    while (it.hasNext()) {
                        FileSystemProvider fileSystemProvider = (FileSystemProvider) it.next();
                        if (fileSystemProvider.getScheme().equalsIgnoreCase(scheme)) {
                            return fileSystemProvider.getPath(uri);
                        }
                    }
                    return cf.a.d(kVar.handleInstantiationProblem(handledType(), text, e10));
                } catch (ServiceConfigurationError e11) {
                    e11.addSuppressed(e10);
                    return cf.a.d(kVar.handleInstantiationProblem(handledType(), text, e11));
                }
            } catch (Exception e12) {
                return cf.a.d(kVar.handleInstantiationProblem(handledType(), text, e12));
            }
        } catch (URISyntaxException e13) {
            return cf.a.d(kVar.handleInstantiationProblem(handledType(), text, e13));
        }
    }
}
