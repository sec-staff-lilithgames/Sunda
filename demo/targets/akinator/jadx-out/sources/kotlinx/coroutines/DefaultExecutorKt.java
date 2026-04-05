package kotlinx.coroutines;

import kotlinx.coroutines.internal.MainDispatchersKt;
import kotlinx.coroutines.internal.SystemPropsKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class DefaultExecutorKt {
    private static final boolean defaultMainDelayOptIn = SystemPropsKt.systemProp("kotlinx.coroutines.main.delay", false);
    private static final Delay DefaultDelay = initializeDefaultDelay();

    public static final Delay getDefaultDelay() {
        return DefaultDelay;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Delay initializeDefaultDelay() {
        if (!defaultMainDelayOptIn) {
            return DefaultExecutor.INSTANCE;
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        return (MainDispatchersKt.isMissing(main) || !(main instanceof Delay)) ? DefaultExecutor.INSTANCE : (Delay) main;
    }

    public static /* synthetic */ void getDefaultDelay$annotations() {
    }
}
