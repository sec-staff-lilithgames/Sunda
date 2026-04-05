package com.bytedance.sdk.component.utils;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.View;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {
    private static jpo jpo;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.component.utils.jd$jd, reason: collision with other inner class name */
    public interface InterfaceC0092jd {
        void jpo();

        void jpo(Throwable th2);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        ExecutorService getAsyncStartActivityThreadPool();

        boolean isEnableAsyncStartActivity();

        boolean isStartActivityBySubThread();
    }

    public static void jpo(jpo jpoVar) {
        jpo = jpoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean wqx(Context context, Intent intent, InterfaceC0092jd interfaceC0092jd) {
        if (context != null && intent != null) {
            try {
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                if (interfaceC0092jd == null) {
                    return true;
                }
                interfaceC0092jd.jpo();
                return true;
            } catch (Throwable th2) {
                if (interfaceC0092jd != null) {
                    interfaceC0092jd.jpo(th2);
                }
            }
        }
        return false;
    }

    public static void jpo(final Context context, final Intent intent, final InterfaceC0092jd interfaceC0092jd) {
        ExecutorService asyncStartActivityThreadPool;
        jpo jpoVar = jpo;
        if (jpoVar == null || !jpoVar.isStartActivityBySubThread() || (asyncStartActivityThreadPool = jpo.getAsyncStartActivityThreadPool()) == null) {
            wqx(context, intent, interfaceC0092jd);
        } else {
            asyncStartActivityThreadPool.execute(new com.bytedance.sdk.component.xyk.xyk("startAct") { // from class: com.bytedance.sdk.component.utils.jd.1
                @Override // java.lang.Runnable
                public void run() {
                    jd.wqx(context, intent, interfaceC0092jd);
                }
            });
        }
    }

    public static boolean jpo(final Context context, final Intent intent, final InterfaceC0092jd interfaceC0092jd, boolean z10) {
        jpo jpoVar;
        ExecutorService asyncStartActivityThreadPool;
        if (z10 && (jpoVar = jpo) != null && jpoVar.isEnableAsyncStartActivity() && (asyncStartActivityThreadPool = jpo.getAsyncStartActivityThreadPool()) != null) {
            asyncStartActivityThreadPool.execute(new com.bytedance.sdk.component.xyk.xyk("startAct") { // from class: com.bytedance.sdk.component.utils.jd.2
                @Override // java.lang.Runnable
                public void run() {
                    jd.wqx(context, intent, interfaceC0092jd);
                }
            });
            return true;
        }
        return wqx(context, intent, interfaceC0092jd);
    }

    public static Activity jpo(View view) {
        View viewFindViewById;
        Context context;
        if (view == null) {
            return null;
        }
        Context context2 = view.getContext();
        if (context2 instanceof Activity) {
            return (Activity) context2;
        }
        View rootView = view.getRootView();
        if (rootView == null || (viewFindViewById = rootView.findViewById(R.id.content)) == null || (context = viewFindViewById.getContext()) == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext instanceof Activity) {
                return (Activity) baseContext;
            }
        }
        return null;
    }

    public static boolean jpo(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }
}
