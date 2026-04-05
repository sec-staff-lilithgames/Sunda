package com.vungle.ads.internal.omsdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.applovin.shadow.okio.Segment;
import com.iab.omid.library.vungle.Omid;
import com.unity3d.services.banners.view.a;
import com.vungle.ads.R;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.util.Logger;
import gv.d;
import gv.y;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import sv.g;
import tu.a0;
import tu.x0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class OMInjector {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "OMInjector";
    private AtomicReference<String> cachedOMSDKJS;
    private AtomicReference<String> cachedOMSessionJS;
    private final Context context;
    private final Handler uiHandler;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public OMInjector(Context context) {
        e0.checkNotNullParameter(context, "context");
        this.context = context;
        this.uiHandler = new Handler(Looper.getMainLooper());
        this.cachedOMSDKJS = new AtomicReference<>(null);
        this.cachedOMSessionJS = new AtomicReference<>(null);
    }

    private final String getOMSessionJS() {
        String str = this.cachedOMSessionJS.get();
        if (str != null) {
            return str;
        }
        String strLoadJsFromRaw = loadJsFromRaw(R.raw.omid_session_client_v1_5_3);
        this.cachedOMSessionJS.set(strLoadJsFromRaw);
        return strLoadJsFromRaw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init$lambda-2, reason: not valid java name */
    public static final void m3622init$lambda2(OMInjector this$0) {
        Object objM7131constructorimpl;
        e0.checkNotNullParameter(this$0, "this$0");
        try {
            int i10 = z.f87419c;
            if (!Omid.isActive()) {
                Omid.activate(this$0.context);
            }
            objM7131constructorimpl = z.m7131constructorimpl(x0.f87415a);
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        Throwable thM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(objM7131constructorimpl);
        if (thM7134exceptionOrNullimpl != null) {
            Logger.Companion.e("OMSDK", "error: " + thM7134exceptionOrNullimpl.getLocalizedMessage());
        }
    }

    private final String loadJsFromRaw(int i10) {
        Object objM7131constructorimpl;
        try {
            int i11 = z.f87419c;
            InputStream inputStreamOpenRawResource = this.context.getResources().openRawResource(i10);
            e0.checkNotNullExpressionValue(inputStreamOpenRawResource, "context.resources.openRawResource(resId)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, g.f86134b), Segment.SIZE);
            try {
                String text = y.readText(bufferedReader);
                d.closeFinally(bufferedReader, null);
                objM7131constructorimpl = z.m7131constructorimpl(text);
            } finally {
            }
        } catch (Throwable th2) {
            int i12 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        return (String) (z.m7136isFailureimpl(objM7131constructorimpl) ? null : objM7131constructorimpl);
    }

    private final File writeToFile(String str, File file) throws IOException {
        if (str == null) {
            throw new IOException("omsdk js must not be null");
        }
        FileWriter fileWriter = new FileWriter(file);
        try {
            fileWriter.write(str);
            fileWriter.flush();
            d.closeFinally(fileWriter, null);
            return file;
        } finally {
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getOMSDKJS$vungle_ads_release() {
        String str = this.cachedOMSDKJS.get();
        if (str != null) {
            return str;
        }
        String strLoadJsFromRaw = loadJsFromRaw(R.raw.omsdk_v1_5_3);
        this.cachedOMSDKJS.set(strLoadJsFromRaw);
        return strLoadJsFromRaw;
    }

    public final void init() {
        this.uiHandler.post(new a(this, 3));
    }

    public final List<File> injectJsFiles$vungle_ads_release(File dir) throws IOException {
        e0.checkNotNullParameter(dir, "dir");
        ArrayList arrayList = new ArrayList();
        File file = new File(dir, Constants.OM_SDK_JS);
        if (!file.exists()) {
            Logger.Companion.d(TAG, "injecting omsdk.js to " + file.getAbsolutePath());
            String oMSDKJS$vungle_ads_release = getOMSDKJS$vungle_ads_release();
            if (oMSDKJS$vungle_ads_release != null) {
                writeToFile(oMSDKJS$vungle_ads_release, file);
            }
            arrayList.add(file);
        }
        File file2 = new File(dir, Constants.OM_SESSION_JS);
        if (!file2.exists()) {
            Logger.Companion.d(TAG, "injecting omsdk-session.js to " + file2.getAbsolutePath());
            String oMSessionJS = getOMSessionJS();
            if (oMSessionJS != null) {
                writeToFile(oMSessionJS, file2);
            }
            arrayList.add(file2);
        }
        return arrayList;
    }
}
