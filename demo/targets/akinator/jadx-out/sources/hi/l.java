package hi;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final k f58836d = new k(0);

    /* renamed from: e, reason: collision with root package name */
    public static final af.i f58837e = new af.i(23);

    /* renamed from: a, reason: collision with root package name */
    public final ni.d f58838a;

    /* renamed from: b, reason: collision with root package name */
    public String f58839b = null;

    /* renamed from: c, reason: collision with root package name */
    public String f58840c = null;

    public l(ni.d dVar) {
        this.f58838a = dVar;
    }

    public static void a(ni.d dVar, String str, String str2) throws IOException {
        if (str == null || str2 == null) {
            return;
        }
        try {
            dVar.getSessionFile(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e10) {
            ei.f.getLogger().w("Failed to persist App Quality Sessions session id.", e10);
        }
    }

    public synchronized String getAppQualitySessionId(String str) {
        String strSubstring;
        if (Objects.equals(this.f58839b, str)) {
            return this.f58840c;
        }
        List<File> sessionFiles = this.f58838a.getSessionFiles(str, f58836d);
        if (sessionFiles.isEmpty()) {
            ei.f.getLogger().w("Unable to read App Quality Sessions session id.");
            strSubstring = null;
        } else {
            strSubstring = ((File) Collections.min(sessionFiles, f58837e)).getName().substring(4);
        }
        return strSubstring;
    }

    public synchronized void rotateAppQualitySessionId(String str) {
        if (!Objects.equals(this.f58840c, str)) {
            a(this.f58838a, this.f58839b, str);
            this.f58840c = str;
        }
    }

    public synchronized void rotateSessionId(String str) {
        if (!Objects.equals(this.f58839b, str)) {
            a(this.f58838a, str, this.f58840c);
            this.f58839b = str;
        }
    }
}
