package l6;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final y0 f72507a;

    static {
        y0 xVar;
        try {
            xVar = new z0((WebViewProviderFactoryBoundaryInterface) rw.a.castToSuppLibClass(WebViewProviderFactoryBoundaryInterface.class, w0.a()));
        } catch (ClassNotFoundException unused) {
            xVar = new x();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
        f72507a = xVar;
    }
}
