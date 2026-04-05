package l6;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public final Context f72478a;

    public t(Context context) {
        this.f72478a = context;
    }

    public static String getCanonicalDirPath(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? canonicalPath.concat("/") : canonicalPath;
    }

    public static File getCanonicalFileIfChild(File file, String str) throws IOException {
        String canonicalDirPath = getCanonicalDirPath(file);
        String canonicalPath = new File(file, str).getCanonicalPath();
        if (canonicalPath.startsWith(canonicalDirPath)) {
            return new File(canonicalPath);
        }
        return null;
    }

    public static File getDataDir(Context context) {
        return o.getDataDir(context);
    }

    public static String guessMimeType(String str) {
        String mimeFromFileName = z.getMimeFromFileName(str);
        return mimeFromFileName == null ? "text/plain" : mimeFromFileName;
    }

    public static InputStream openFile(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        return file.getPath().endsWith(".svgz") ? new GZIPInputStream(fileInputStream) : fileInputStream;
    }

    public InputStream openAsset(String str) throws IOException {
        if (str.length() > 1 && str.charAt(0) == '/') {
            str = str.substring(1);
        }
        InputStream inputStreamOpen = this.f72478a.getAssets().open(str, 2);
        return str.endsWith(".svgz") ? new GZIPInputStream(inputStreamOpen) : inputStreamOpen;
    }

    public InputStream openResource(String str) throws Resources.NotFoundException, IOException {
        if (str.length() > 1 && str.charAt(0) == '/') {
            str = str.substring(1);
        }
        String[] strArrSplit = str.split("/", -1);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Incorrect resource path: ".concat(str));
        }
        String str2 = strArrSplit[0];
        String strSubstring = strArrSplit[1];
        int iLastIndexOf = strSubstring.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            strSubstring = strSubstring.substring(0, iLastIndexOf);
        }
        Context context = this.f72478a;
        int identifier = context.getResources().getIdentifier(strSubstring, str2, context.getPackageName());
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(identifier, typedValue, true);
        int i10 = typedValue.type;
        if (i10 != 3) {
            throw new IOException(String.format("Expected %s resource to be of TYPE_STRING but was %d", str, Integer.valueOf(i10)));
        }
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(identifier);
        return str.endsWith(".svgz") ? new GZIPInputStream(inputStreamOpenRawResource) : inputStreamOpenRawResource;
    }
}
