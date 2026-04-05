package hi;

import java.io.File;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class c0 {
    public static c0 create(f2 f2Var, String str, File file) {
        return new b(f2Var, str, file);
    }

    public abstract f2 getReport();

    public abstract File getReportFile();

    public abstract String getSessionId();
}
