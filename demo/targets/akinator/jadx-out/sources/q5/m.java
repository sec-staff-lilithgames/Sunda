package q5;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class m {
    public static final f newConnectionPool(x5.c driver, String fileName, int i10, int i11) {
        e0.checkNotNullParameter(driver, "driver");
        e0.checkNotNullParameter(fileName, "fileName");
        return new l(driver, fileName, i10, i11);
    }

    public static final f newSingleConnectionPool(x5.c driver, String fileName) {
        e0.checkNotNullParameter(driver, "driver");
        e0.checkNotNullParameter(fileName, "fileName");
        return new l(driver, fileName);
    }
}
