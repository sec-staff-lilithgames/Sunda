package hi;

import androidx.core.app.NotificationCompat;
import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58835a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f58835a) {
            case 0:
                return str.startsWith("aqs.");
            case 1:
                return str.startsWith(".ae");
            case 2:
                Charset charset = ni.b.f76837e;
                return str.startsWith(NotificationCompat.CATEGORY_EVENT);
            default:
                Charset charset2 = ni.b.f76837e;
                return str.startsWith(NotificationCompat.CATEGORY_EVENT) && !str.endsWith("_");
        }
    }
}
