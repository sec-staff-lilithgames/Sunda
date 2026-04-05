package retrofit2;

import java.util.concurrent.Executor;
import retrofit2.BuiltInFactories;
import retrofit2.Reflection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class Platform {
    static final BuiltInFactories builtInFactories;
    static final Executor callbackExecutor;
    static final Reflection reflection;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            callbackExecutor = null;
            reflection = new Reflection();
            builtInFactories = new BuiltInFactories();
        } else if (property.equals("Dalvik")) {
            callbackExecutor = new AndroidMainExecutor();
            reflection = new Reflection.Android24();
            builtInFactories = new BuiltInFactories.Java8();
        } else {
            callbackExecutor = null;
            reflection = new Reflection.Java8();
            builtInFactories = new BuiltInFactories.Java8();
        }
    }

    private Platform() {
    }
}
