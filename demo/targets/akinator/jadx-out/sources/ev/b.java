package ev;

import java.util.List;
import kotlin.jvm.internal.e0;
import uu.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class b extends dv.b {
    @Override // dv.b
    public void addSuppressed(Throwable cause, Throwable exception) {
        e0.checkNotNullParameter(cause, "cause");
        e0.checkNotNullParameter(exception, "exception");
        Integer num = a.f55153a;
        if (num == null || num.intValue() >= 19) {
            cause.addSuppressed(exception);
        } else {
            super.addSuppressed(cause, exception);
        }
    }

    @Override // dv.b
    public List<Throwable> getSuppressed(Throwable exception) {
        e0.checkNotNullParameter(exception, "exception");
        Integer num = a.f55153a;
        if (num != null && num.intValue() < 19) {
            return super.getSuppressed(exception);
        }
        Throwable[] suppressed = exception.getSuppressed();
        e0.checkNotNullExpressionValue(suppressed, "getSuppressed(...)");
        return f0.asList(suppressed);
    }
}
