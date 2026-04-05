package ho;

import android.os.SystemClock;
import go.x;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e implements x {
    @Override // go.x
    public void load() throws IOException {
        synchronized (f.f59091a) {
            Object obj = f.f59092b;
            synchronized (obj) {
                if (f.f59093c) {
                    return;
                }
                long jA = f.a();
                synchronized (obj) {
                    f.f59098h = SystemClock.elapsedRealtime();
                    f.f59094d = jA;
                    f.f59093c = true;
                }
            }
        }
    }

    @Override // go.x
    public void cancelLoad() {
    }
}
