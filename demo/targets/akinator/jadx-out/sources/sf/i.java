package sf;

import com.google.android.exoplayer2.util.o1;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static Constructor f85678a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f85679b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f85680c;

    /* renamed from: d, reason: collision with root package name */
    public static Constructor f85681d;

    /* renamed from: e, reason: collision with root package name */
    public static Method f85682e;

    public static void a() throws ClassNotFoundException {
        if (f85678a == null || f85679b == null || f85680c == null) {
            Class<?> cls = Class.forName("com.google.android.exoplayer2.effect.ScaleAndRotateTransformation$Builder");
            f85678a = cls.getConstructor(null);
            f85679b = cls.getMethod("setRotationDegrees", Float.TYPE);
            f85680c = cls.getMethod("build", null);
        }
        if (f85681d == null || f85682e == null) {
            Class<?> cls2 = Class.forName("com.google.android.exoplayer2.effect.DefaultVideoFrameProcessor$Factory$Builder");
            f85681d = cls2.getConstructor(null);
            f85682e = cls2.getMethod("build", null);
        }
    }

    public static com.google.android.exoplayer2.util.l createRotationEffect(float f10) throws Exception {
        a();
        Object objNewInstance = f85678a.newInstance(null);
        f85679b.invoke(objNewInstance, Float.valueOf(f10));
        if (com.google.android.exoplayer2.util.a.checkNotNull(f85680c.invoke(objNewInstance, null)) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    public static o1 getFrameProcessorFactory() throws Exception {
        a();
        if (com.google.android.exoplayer2.util.a.checkNotNull(f85682e.invoke(f85681d.newInstance(null), null)) == null) {
            return null;
        }
        throw new ClassCastException();
    }
}
