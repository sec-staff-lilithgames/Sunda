package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.media.AudioFocusRequest;
import android.media.AudioProfile;
import android.media.MediaDrm;
import android.os.Build;
import android.text.Editable;
import android.view.View;
import bk.h;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.FirebaseCommonRegistrar;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoBidTokenListener;
import com.unity3d.services.ads.token.INativeTokenGeneratorListener;
import com.unity3d.services.ads.token.InMemoryTokenStorage;
import com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker;
import com.unity3d.services.core.webview.bridge.Invocation;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.vungle.ads.internal.ui.AdActivity;
import com.vungle.ads.internal.util.FileUtility;
import de.s;
import dh.e0;
import e6.c0;
import e6.g0;
import e6.i0;
import ei.f;
import io.odeeo.internal.r.m;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.InvocationTargetException;
import jd.j;
import kotlinx.coroutines.DebugKt;
import x3.e3;
import x3.q0;
import yo.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final /* synthetic */ class a implements h, Continuation, j, MolocoBidTokenListener, INativeTokenGeneratorListener, IInvocationCallbackInvoker, q0, FileUtility.ObjectInputStreamProvider, s, e0, OnFailureListener, g, m.g, i0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28837b;

    public /* synthetic */ a(int i10) {
        this.f28837b = i10;
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest a(Object obj) {
        return (AudioFocusRequest) obj;
    }

    public static /* bridge */ /* synthetic */ AudioProfile b(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* bridge */ /* synthetic */ MediaDrm.PlaybackComponent c(Object obj) {
        return (MediaDrm.PlaybackComponent) obj;
    }

    @Override // jd.j
    public Object apply(Object obj) {
        return ((zj.g) obj).toByteArray();
    }

    @Override // dh.e0
    public int countLength(Editable editable) {
        int[][] iArr = TextInputLayout.F0;
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    @Override // yo.g
    public boolean evaluate(int i10, int i11, int i12, int i13, int i14) {
        if (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) {
            return true;
        }
        if (i11 == 77 && i12 == 76 && i13 == 76) {
            return i14 == 84 || i10 == 2;
        }
        return false;
    }

    @Override // bk.h
    public String extract(Object obj) {
        Context context = (Context) obj;
        switch (this.f28837b) {
            case 3:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
            case 4:
                ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                return applicationInfo2 != null ? String.valueOf(applicationInfo2.minSdkVersion) : "";
            case 5:
                return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? DebugKt.DEBUG_PROPERTY_VALUE_AUTO : (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
        }
    }

    @Override // io.odeeo.internal.r.m.g
    public int getScore(Object obj) {
        io.odeeo.internal.r.j jVar = (io.odeeo.internal.r.j) obj;
        switch (this.f28837b) {
            case 24:
                return m.a(jVar);
            default:
                return m.b(jVar);
        }
    }

    @Override // com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker
    public void invokeCallback(Invocation invocation) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        SharedInstances.webViewAppInvocationCallbackInvoker$lambda$0(invocation);
    }

    @Override // e6.i0
    public void notifyListener(g0 g0Var, c0 c0Var, boolean z10) {
        switch (this.f28837b) {
            case 26:
                g0Var.onTransitionStart(c0Var, z10);
                break;
            case 27:
                g0Var.onTransitionEnd(c0Var, z10);
                break;
            case 28:
                g0Var.onTransitionCancel(c0Var);
                break;
            default:
                g0Var.onTransitionPause(c0Var);
                break;
        }
    }

    @Override // x3.q0
    public e3 onApplyWindowInsets(View view, e3 e3Var) {
        return AdActivity.m3653onCreate$lambda9(view, e3Var);
    }

    @Override // com.moloco.sdk.publisher.MolocoBidTokenListener
    public void onBidTokenResult(String str, MolocoAdError.ErrorType errorType) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "bidToken");
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        f.getLogger().e("Error fetching settings.", exc);
    }

    @Override // com.unity3d.services.ads.token.INativeTokenGeneratorListener
    public void onReady(String str) {
        InMemoryTokenStorage._get_nativeGeneratedToken_$lambda$2(str);
    }

    @Override // com.vungle.ads.internal.util.FileUtility.ObjectInputStreamProvider
    public ObjectInputStream provideObjectInputStream(InputStream inputStream) {
        return FileUtility.m3668objectInputStreamProvider$lambda0(inputStream);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        int i10;
        switch (this.f28837b) {
            case 8:
                i10 = 403;
                break;
            default:
                i10 = -1;
                break;
        }
        return Integer.valueOf(i10);
    }

    @Override // de.s
    public void release() {
    }
}
