package com.sfbx.appconsent.core.startup;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.app.backup.BackupAgent;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import sv.n0;
import tu.k;
import tu.v;
import uu.o0;
import uu.p0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ACContext {
    public static final ACContext INSTANCE = new ACContext();
    private static Context internalACContext;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ACApplicationWrapper {
        public static final Companion Companion = new Companion(null);

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final String getApplicationProcessName() {
                String processName = Application.getProcessName();
                e0.checkNotNullExpressionValue(processName, "getProcessName()");
                return processName;
            }

            private Companion() {
            }
        }
    }

    private ACContext() {
    }

    private final boolean canLeakMemory(Context context) {
        if (context instanceof Application) {
            return false;
        }
        if (context instanceof Activity ? true : context instanceof Service ? true : context instanceof BackupAgent) {
            return true;
        }
        if (!(context instanceof ContextWrapper)) {
            return context.getApplicationContext() == null;
        }
        ContextWrapper contextWrapper = (ContextWrapper) context;
        if (contextWrapper.getBaseContext() == context) {
            return true;
        }
        Context baseContext = contextWrapper.getBaseContext();
        e0.checkNotNullExpressionValue(baseContext, "context.baseContext");
        return canLeakMemory(baseContext);
    }

    private final Void internalACContextUninitialized() {
        int i10 = 0;
        v vVar = !n0.contains$default((CharSequence) getProcessName$appconsent_core_prodXchangeRelease(), AbstractJsonLexerKt.COLON, false, 2, (Object) null) ? tu.e0.to("App Startup didn't run", p0.listOf((Object[]) new String[]{"If App Startup has been disabled, enable it back in the AndroidManifest.xml file of the app.", "For other cases, call injectAsACContext() in the app's Application subclass in its initializer or in its onCreate function."})) : tu.e0.to("App Startup is not enabled for non default processes", o0.listOf("Call injectAsACContext() in the app's Application subclass in its initializer or in its onCreate function."));
        String str = (String) vVar.component1();
        List list = (List) vVar.component2();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ACContext has not been initialized!");
        e0.checkNotNullExpressionValue(sb2, "append(value)");
        sb2.append('\n');
        e0.checkNotNullExpressionValue(sb2, "append('\\n')");
        if (list.size() != 1) {
            sb2.append(str + ". Possible solutions:");
            e0.checkNotNullExpressionValue(sb2, "append(value)");
            sb2.append('\n');
            e0.checkNotNullExpressionValue(sb2, "append('\\n')");
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    p0.throwIndexOverflow();
                }
                sb2.append(i11);
                sb2.append(". ");
                sb2.append((String) obj);
                i10 = i11;
            }
        } else {
            sb2.append("Possible solution: " + ((String) y0.single(list)));
            e0.checkNotNullExpressionValue(sb2, "append(value)");
            sb2.append('\n');
            e0.checkNotNullExpressionValue(sb2, "append('\\n')");
        }
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(string.toString());
    }

    public final Context getAcContext() {
        Context context = internalACContext;
        if (context != null) {
            return context;
        }
        internalACContextUninitialized();
        throw new k();
    }

    public final String getProcessName$appconsent_core_prodXchangeRelease() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 28) {
            return ACApplicationWrapper.Companion.getApplicationProcessName();
        }
        try {
            Object objInvoke = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", null).invoke(null, null);
            e0.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.String");
            return (String) objInvoke;
        } catch (Exception unused) {
            return "";
        }
    }

    public final void injectAsACContext(Context context) {
        e0.checkNotNullParameter(context, "context");
        if (!canLeakMemory(context)) {
            internalACContext = context;
            return;
        }
        throw new IllegalArgumentException(("The passed Context(" + this + ") would leak memory!").toString());
    }

    public final boolean isInternalACContextLoaded() {
        return internalACContext != null;
    }

    public final void resetContextForTest() {
        internalACContext = null;
    }
}
