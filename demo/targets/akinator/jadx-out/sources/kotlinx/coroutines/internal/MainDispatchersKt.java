package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.MainCoroutineDispatcher;
import tu.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class MainDispatchersKt {
    private static final String FAST_SERVICE_LOADER_PROPERTY_NAME = "kotlinx.coroutines.fast.service.loader";
    private static final boolean SUPPORT_MISSING = false;

    private static final MissingMainCoroutineDispatcher createMissingDispatcher(Throwable th2, String str) throws Throwable {
        if (th2 != null) {
            throw th2;
        }
        throwMissingMainDispatcherException();
        throw new k();
    }

    public static /* synthetic */ MissingMainCoroutineDispatcher createMissingDispatcher$default(Throwable th2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return createMissingDispatcher(th2, str);
    }

    public static final boolean isMissing(MainCoroutineDispatcher mainCoroutineDispatcher) {
        return mainCoroutineDispatcher.getImmediate() instanceof MissingMainCoroutineDispatcher;
    }

    public static final Void throwMissingMainDispatcherException() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final MainCoroutineDispatcher tryCreateDispatcher(MainDispatcherFactory mainDispatcherFactory, List<? extends MainDispatcherFactory> list) {
        try {
            return mainDispatcherFactory.createDispatcher(list);
        } catch (Throwable th2) {
            return createMissingDispatcher(th2, mainDispatcherFactory.hintOnError());
        }
    }

    private static /* synthetic */ void getSUPPORT_MISSING$annotations() {
    }
}
