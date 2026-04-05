package yv;

import java.text.Normalizer;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class g {
    public static final String normalizeNfc(String string) {
        e0.checkNotNullParameter(string, "string");
        String strNormalize = Normalizer.normalize(string, Normalizer.Form.NFC);
        e0.checkNotNullExpressionValue(strNormalize, "normalize(...)");
        return strNormalize;
    }
}
