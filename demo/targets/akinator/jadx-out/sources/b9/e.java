package b9;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import n8.v;
import n8.y;
import p8.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class e implements y {
    @Override // n8.y
    public n8.c getEncodeStrategy(v vVar) {
        return n8.c.f75833b;
    }

    @Override // n8.y, n8.d
    public boolean encode(v0 v0Var, File file, v vVar) throws Throwable {
        try {
            j9.b.toFile(((d) v0Var.get()).getBuffer(), file);
            return true;
        } catch (IOException e10) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e10);
            return false;
        }
    }
}
