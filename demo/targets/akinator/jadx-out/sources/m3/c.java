package m3;

import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f74002a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f74003b = new HashMap();

    public c(String str) {
        this.f74002a = str;
    }

    @Override // m3.b
    public File getFileForUri(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int iIndexOf = encodedPath.indexOf(47, 1);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException(o2.p("Unable to find path from root: ", uri));
        }
        String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
        String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
        File file = (File) this.f74003b.get(strDecode);
        if (file == null) {
            throw new IllegalArgumentException(o2.p("Unable to find configured root for ", uri));
        }
        File file2 = new File(file, strDecode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            String path = canonicalFile.getPath();
            String path2 = file.getPath();
            if (FileProvider.removeTrailingSlash(path).startsWith(FileProvider.removeTrailingSlash(path2) + '/')) {
                return canonicalFile;
            }
            throw new SecurityException("Resolved path jumped beyond configured root");
        } catch (IOException unused) {
            throw new IllegalArgumentException(j1.o2.h(file2, "Failed to resolve canonical path for "));
        }
    }

    @Override // m3.b
    public Uri getUriForFile(File file) throws IOException {
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : this.f74003b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (FileProvider.removeTrailingSlash(canonicalPath).startsWith(FileProvider.removeTrailingSlash(path) + '/') && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                throw new IllegalArgumentException(a.b.k("Failed to find configured root that contains ", canonicalPath));
            }
            String path2 = ((File) entry.getValue()).getPath();
            return new Uri.Builder().scheme("content").authority(this.f74002a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
        } catch (IOException unused) {
            throw new IllegalArgumentException(j1.o2.h(file, "Failed to resolve canonical path for "));
        }
    }
}
