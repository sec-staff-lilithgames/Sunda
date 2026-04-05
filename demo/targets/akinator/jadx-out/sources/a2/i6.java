package a2;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import com.digidust.elokence.akinator.freemium.R;
import java.util.LinkedHashMap;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i6 {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f3657a = new LinkedHashMap();

    public static final StateFlow access$getAnimationScaleFlowFor(Context context) {
        StateFlow stateFlow;
        LinkedHashMap linkedHashMap = f3657a;
        synchronized (linkedHashMap) {
            try {
                Object objStateIn = linkedHashMap.get(context);
                if (objStateIn == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    Channel channelChannel$default = ChannelKt.Channel$default(-1, null, null, 6, null);
                    objStateIn = FlowKt.stateIn(FlowKt.flow(new g6(contentResolver, uriFor, new h6(channelChannel$default, t3.n.createAsync(Looper.getMainLooper())), channelChannel$default, context, null)), CoroutineScopeKt.MainScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, objStateIn);
                }
                stateFlow = (StateFlow) objStateIn;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return stateFlow;
    }

    public static final p0.n3 createLifecycleAwareWindowRecomposer(View view, zu.m coroutineContext, androidx.lifecycle.k0 k0Var) {
        p0.s2 s2Var;
        p0.c2 c2Var = p0.c2.f80168b;
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(coroutineContext, "coroutineContext");
        if (coroutineContext.get(zu.f.f98853b) == null || coroutineContext.get(c2Var) == null) {
            coroutineContext = p1.f3753o.getCurrentThread().plus(coroutineContext);
        }
        p0.d2 d2Var = (p0.d2) coroutineContext.get(c2Var);
        if (d2Var != null) {
            p0.s2 s2Var2 = new p0.s2(d2Var);
            s2Var2.pause();
            s2Var = s2Var2;
        } else {
            s2Var = null;
        }
        kotlin.jvm.internal.b1 b1Var = new kotlin.jvm.internal.b1();
        zu.m b4Var = (e1.y) coroutineContext.get(e1.x.f53497b);
        if (b4Var == null) {
            b4Var = new b4();
            b1Var.f71816b = b4Var;
        }
        zu.m mVarPlus = coroutineContext.plus(s2Var != null ? s2Var : zu.n.f98854b).plus(b4Var);
        p0.n3 n3Var = new p0.n3(mVarPlus);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(mVarPlus);
        if (k0Var == null) {
            androidx.lifecycle.b1 b1Var2 = androidx.lifecycle.o3.get(view);
            k0Var = b1Var2 != null ? b1Var2.getLifecycle() : null;
        }
        if (k0Var != null) {
            view.addOnAttachStateChangeListener(new a6(view, n3Var));
            k0Var.addObserver(new f6(CoroutineScope, s2Var, n3Var, b1Var, view));
            return n3Var;
        }
        throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
    }

    public static /* synthetic */ p0.n3 createLifecycleAwareWindowRecomposer$default(View view, zu.m mVar, androidx.lifecycle.k0 k0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = zu.n.f98854b;
        }
        if ((i10 & 2) != 0) {
            k0Var = null;
        }
        return createLifecycleAwareWindowRecomposer(view, mVar, k0Var);
    }

    public static final p0.f0 findViewTreeCompositionContext(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "<this>");
        p0.f0 compositionContext = getCompositionContext(view);
        if (compositionContext != null) {
            return compositionContext;
        }
        for (ViewParent parent = view.getParent(); compositionContext == null && (parent instanceof View); parent = parent.getParent()) {
            compositionContext = getCompositionContext((View) parent);
        }
        return compositionContext;
    }

    public static final p0.f0 getCompositionContext(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof p0.f0) {
            return (p0.f0) tag;
        }
        return null;
    }

    public static final p0.n3 getWindowRecomposer(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "<this>");
        if (!view.isAttachedToWindow()) {
            throw new IllegalStateException(("Cannot locate windowRecomposer; View " + view + " is not attached to a window").toString());
        }
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                break;
            }
            parent = view2.getParent();
            view = view2;
        }
        p0.f0 compositionContext = getCompositionContext(view);
        if (compositionContext == null) {
            return z5.f3904a.createAndInstallWindowRecomposer$ui_release(view);
        }
        if (compositionContext instanceof p0.n3) {
            return (p0.n3) compositionContext;
        }
        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
    }

    public static final void setCompositionContext(View view, p0.f0 f0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.androidx_compose_ui_view_composition_context, f0Var);
    }

    public static /* synthetic */ void getWindowRecomposer$annotations(View view) {
    }
}
