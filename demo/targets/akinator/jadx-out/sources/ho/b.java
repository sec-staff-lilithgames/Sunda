package ho;

import io.bidmachine.media3.common.util.k;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface b extends Executor {
    static <T extends Executor> b from(T t10, k kVar) {
        return new a(t10, kVar);
    }

    void release();
}
