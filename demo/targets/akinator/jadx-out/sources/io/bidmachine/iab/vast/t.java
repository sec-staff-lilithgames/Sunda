package io.bidmachine.iab.vast;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.C3227g4;
import io.bidmachine.iab.vast.activity.VastActivity;
import io.bidmachine.iab.vast.activity.VastView;
import io.bidmachine.iab.vast.processor.VastAd;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import um.h0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class t {
    public static int A = 5;

    /* renamed from: z, reason: collision with root package name */
    public static final r f60527z = new r();

    /* renamed from: c, reason: collision with root package name */
    public Uri f60530c;

    /* renamed from: d, reason: collision with root package name */
    public VastAd f60531d;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f60533f;

    /* renamed from: g, reason: collision with root package name */
    public wm.d f60534g;

    /* renamed from: h, reason: collision with root package name */
    public z f60535h;

    /* renamed from: i, reason: collision with root package name */
    public sm.c f60536i;

    /* renamed from: k, reason: collision with root package name */
    public Float f60538k;

    /* renamed from: l, reason: collision with root package name */
    public float f60539l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f60540m;

    /* renamed from: n, reason: collision with root package name */
    public int f60541n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f60543p;

    /* renamed from: b, reason: collision with root package name */
    public qm.a f60529b = qm.a.f83288b;

    /* renamed from: e, reason: collision with root package name */
    public b0 f60532e = b0.f60481b;

    /* renamed from: j, reason: collision with root package name */
    public float f60537j = 3.0f;

    /* renamed from: o, reason: collision with root package name */
    public int f60542o = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f60544q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f60545r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f60546s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f60547t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f60548u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f60549v = -1;

    /* renamed from: w, reason: collision with root package name */
    public float f60550w = 5.0f;

    /* renamed from: x, reason: collision with root package name */
    public final AtomicBoolean f60551x = new AtomicBoolean(false);

    /* renamed from: y, reason: collision with root package name */
    public final AtomicBoolean f60552y = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final String f60528a = UUID.randomUUID().toString();

    public static Uri a(Context context, String str) throws IOException {
        String str2 = null;
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            str2 = externalFilesDir.getPath() + "/vast_rtb_cache/";
        }
        if (str2 == null) {
            throw new FileNotFoundException("No dir for caching file");
        }
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        int length = 230 - file.getPath().length();
        String str3 = C3227g4.D + System.currentTimeMillis();
        String strReplace = str.substring(0, Math.min(length, str.length())).replace("/", "").replace(":", "");
        File file2 = new File(file, strReplace);
        if (file2.exists()) {
            return Uri.fromFile(file2);
        }
        File file3 = new File(file, str3);
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        InputStream inputStream = httpURLConnection.getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream(file3);
        long contentLength = httpURLConnection.getContentLength();
        byte[] bArr = new byte[1024];
        long j10 = 0;
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 <= 0) {
                break;
            }
            fileOutputStream.write(bArr, 0, i10);
            j10 += i10;
        }
        fileOutputStream.close();
        if (contentLength != j10) {
            throw new IllegalStateException("The downloaded file size does not match the stated size");
        }
        file3.renameTo(new File(file, strReplace));
        return Uri.fromFile(new File(file, strReplace));
    }

    public static g newBuilder() {
        return new g(new t());
    }

    public static void setCacheSize(int i10) {
        if (i10 > 0) {
            A = i10;
        }
    }

    public void addExtra(String str, String str2) {
        if (this.f60533f == null) {
            this.f60533f = new Bundle();
        }
        this.f60533f.putString(str, str2);
    }

    public final void b(Context context) {
        File[] fileArrListFiles;
        try {
            File externalFilesDir = context.getExternalFilesDir(null);
            String str = externalFilesDir != null ? externalFilesDir.getPath() + "/vast_rtb_cache/" : null;
            if (str == null || (fileArrListFiles = new File(str).listFiles()) == null || fileArrListFiles.length <= A) {
                return;
            }
            s[] sVarArr = new s[fileArrListFiles.length];
            for (int i10 = 0; i10 < fileArrListFiles.length; i10++) {
                sVarArr[i10] = new s(fileArrListFiles[i10]);
            }
            Arrays.sort(sVarArr);
            for (int i11 = 0; i11 < fileArrListFiles.length; i11++) {
                fileArrListFiles[i11] = sVarArr[i11].f60526c;
            }
            for (int i12 = A; i12 < fileArrListFiles.length; i12++) {
                if (!Uri.fromFile(fileArrListFiles[i12]).equals(this.f60530c)) {
                    fileArrListFiles[i12].delete();
                }
            }
        } catch (Exception e10) {
            e.e("VastRequest", e10);
        }
    }

    public final void c(Context context, VastAd vastAd, u uVar) throws SecurityException, IllegalArgumentException {
        try {
            Uri uriA = a(context, vastAd.getPickedMediaFileTag().getText());
            if (uriA != null && !TextUtils.isEmpty(uriA.getPath()) && new File(uriA.getPath()).exists()) {
                Bitmap bitmapCreateVideoThumbnail = ThumbnailUtils.createVideoThumbnail(uriA.getPath(), 1);
                if (bitmapCreateVideoThumbnail == null) {
                    e.d("VastRequest", "Video file not supported", new Object[0]);
                    sendVastSpecError(w.f60561i);
                    e(qm.b.badContent("Failed to get thumbnail by file URI"), uVar);
                } else if (bitmapCreateVideoThumbnail.equals(Bitmap.createBitmap(bitmapCreateVideoThumbnail.getWidth(), bitmapCreateVideoThumbnail.getHeight(), bitmapCreateVideoThumbnail.getConfig()))) {
                    e.d("VastRequest", "Empty thumbnail", new Object[0]);
                    sendVastSpecError(w.f60561i);
                    e(qm.b.badContent("Thumbnail is empty"), uVar);
                } else {
                    try {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        mediaMetadataRetriever.setDataSource(context, uriA);
                        long j10 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
                        int i10 = this.f60541n;
                        if (i10 == 0 || j10 <= i10) {
                            this.f60530c = uriA;
                            synchronized (this) {
                                if (this.f60535h != null) {
                                    h0.onUiThread(new p(this, vastAd));
                                }
                            }
                            d(uVar);
                        } else {
                            sendVastSpecError(w.f60556d);
                            e(qm.b.badContent("Estimated duration does not match actual duration"), uVar);
                        }
                    } catch (Exception e10) {
                        e.e("VastRequest", e10);
                        sendVastSpecError(w.f60561i);
                        e(qm.b.throwable("Exception during metadata retrieval", e10), uVar);
                    }
                }
                b(context);
                return;
            }
            e.d("VastRequest", "fileUri is null", new Object[0]);
            sendVastSpecError(w.f60558f);
            e(qm.b.badContent("Can't find video by local URI"), uVar);
        } catch (Exception e11) {
            e.e("VastRequest", e11);
            sendVastSpecError(w.f60558f);
            e(qm.b.throwable("Exception during caching media file", e11), uVar);
        }
    }

    public boolean canDisplay() {
        if (this.f60551x.get()) {
            return this.f60529b != qm.a.f83288b || checkFile();
        }
        return false;
    }

    public boolean checkFile() {
        try {
            Uri uri = this.f60530c;
            if (uri == null || TextUtils.isEmpty(uri.getPath())) {
                return false;
            }
            return new File(this.f60530c.getPath()).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    public final void d(u uVar) {
        if (this.f60551x.getAndSet(true)) {
            return;
        }
        e.d("VastRequest", "sendLoaded", new Object[0]);
        if (uVar != null) {
            h0.onUiThread(new l(this, uVar));
        }
    }

    public void destroy() {
        this.f60535h = null;
        WeakHashMap weakHashMap = v.f60553a;
        synchronized (v.class) {
            v.f60553a.remove(this);
        }
    }

    public void display(Context context, b0 b0Var, b bVar) {
        display(context, b0Var, bVar, null, null, null);
    }

    public final void e(qm.b bVar, u uVar) {
        e.d("VastRequest", "sendLoadFailed - %s", bVar);
        synchronized (this) {
            if (this.f60535h != null) {
                h0.onUiThread(new q(this, bVar));
            }
        }
        h0.onUiThread(new m(this, bVar, uVar));
    }

    public void fireErrorUrls(List<String> list, Bundle bundle) {
        fireUrls(list, bundle);
    }

    public void fireUrls(List<String> list, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f60533f;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        if (list != null) {
            y.processUrls(list, bundle2, f60527z);
        } else {
            e.d("VastRequest", "Url list is null", new Object[0]);
        }
    }

    public qm.a getCacheControl() {
        return this.f60529b;
    }

    public float getCompanionCloseTime() {
        return this.f60539l;
    }

    public Uri getFileUri() {
        return this.f60530c;
    }

    public int getForceOrientation() {
        return this.f60549v;
    }

    public float getFusedVideoCloseTimeSec() {
        return this.f60550w;
    }

    public String getId() {
        return this.f60528a;
    }

    public int getMaxDurationMillis() {
        return this.f60541n;
    }

    public float getPlaceholderTimeoutSec() {
        return this.f60537j;
    }

    public int getPreferredVideoOrientation() {
        if (!shouldUseScreenSizeForVideoOrientation()) {
            return 0;
        }
        VastAd vastAd = this.f60531d;
        if (vastAd == null) {
            return 2;
        }
        ym.n pickedMediaFileTag = vastAd.getPickedMediaFileTag();
        return h0.orientationBySize(pickedMediaFileTag.getWidth(), pickedMediaFileTag.getHeight());
    }

    public int getRequestedOrientation() {
        return this.f60542o;
    }

    public VastAd getVastAd() {
        return this.f60531d;
    }

    public Float getVideoCloseTime() {
        return this.f60538k;
    }

    public b0 getVideoType() {
        return this.f60532e;
    }

    public boolean isAutoClose() {
        return this.f60543p;
    }

    public boolean isForceUseNativeCloseTime() {
        return this.f60540m;
    }

    public boolean isR1() {
        return this.f60547t;
    }

    public boolean isR2() {
        return this.f60548u;
    }

    public void loadVideoWithData(Context context, String str, u uVar) {
        e.d("VastRequest", "loadVideoWithData\n%s", str);
        this.f60531d = null;
        if (!h0.isNetworkAvailable(context)) {
            e(qm.b.f83292c, uVar);
            return;
        }
        try {
            new j(context, this, uVar, str).start();
        } catch (Exception e10) {
            e.e("VastRequest", e10);
            e(qm.b.throwable("Exception during creating background thread", e10), uVar);
        }
    }

    public void loadVideoWithDataSync(Context context, String str, u uVar) throws SecurityException, IllegalArgumentException {
        String strE;
        wm.d bVar = this.f60534g;
        if (bVar == null) {
            bVar = new wm.b(context);
        }
        wm.f fVarProcess = new wm.e(this, bVar).process(str);
        VastAd vastAd = fVarProcess.getVastAd();
        this.f60531d = vastAd;
        if (vastAd == null) {
            w vastSpecError = fVarProcess.getVastSpecError();
            if (vastSpecError != null) {
                sendVastSpecError(vastSpecError);
                strE = a.b.e(vastSpecError.getCode(), "VastAd is null during loadVideoWithDataSync with VastSpecCode - ");
            } else {
                strE = "VastAd is null during loadVideoWithDataSync without VastSpecCode";
            }
            e(qm.b.badContent(strE), uVar);
            return;
        }
        vastAd.setVastRequest(this);
        ym.e appodealExtension = this.f60531d.getAppodealExtension();
        if (appodealExtension != null) {
            Boolean boolIsAutoRotate = appodealExtension.isAutoRotate();
            if (boolIsAutoRotate != null) {
                if (boolIsAutoRotate.booleanValue()) {
                    this.f60544q = false;
                    this.f60545r = false;
                } else {
                    this.f60544q = true;
                    this.f60545r = true;
                }
            }
            if (appodealExtension.getPostBannerTag().getCloseTimeSec() > 0.0f) {
                this.f60539l = appodealExtension.getPostBannerTag().getCloseTimeSec();
            }
            this.f60547t = appodealExtension.isR1();
            this.f60548u = appodealExtension.isR2();
            Integer forceOrientation = appodealExtension.getForceOrientation();
            if (forceOrientation != null) {
                this.f60549v = forceOrientation.intValue();
            }
        }
        VastAd vastAd2 = this.f60531d;
        Float closeTimeSec = appodealExtension != null ? appodealExtension.getCloseTimeSec() : null;
        if (isForceUseNativeCloseTime()) {
            closeTimeSec = h0.max(closeTimeSec, getVideoCloseTime());
        }
        Float fMin = h0.min(closeTimeSec, vastAd2.getDurationSec());
        if (fMin == null) {
            fMin = Float.valueOf(5.0f);
        }
        this.f60550w = fMin.floatValue();
        sm.c cVar = this.f60536i;
        if (cVar != null) {
            cVar.onVastModelLoaded(this);
        }
        int i10 = h.f60486a[this.f60529b.ordinal()];
        if (i10 == 1) {
            c(context, this.f60531d, uVar);
            return;
        }
        if (i10 == 2) {
            d(uVar);
        } else {
            if (i10 != 3) {
                return;
            }
            d(uVar);
            c(context, this.f60531d, uVar);
        }
    }

    public void loadVideoWithUrl(Context context, String str, u uVar) {
        e.d("VastRequest", "loadVideoWithUrl - %s", str);
        this.f60531d = null;
        if (!h0.isNetworkAvailable(context)) {
            e(qm.b.f83292c, uVar);
            return;
        }
        try {
            new i(context, this, uVar, str).start();
        } catch (Exception e10) {
            e.e("VastRequest", e10);
            e(qm.b.throwable("Exception during creating background thread", e10), uVar);
        }
    }

    public void performCache(Context context, u uVar) {
        if (this.f60531d == null) {
            e(qm.b.internal("VastAd is null during performCache"), uVar);
            return;
        }
        try {
            new k(this, context, uVar).start();
        } catch (Exception e10) {
            e.e("VastRequest", e10);
            e(qm.b.throwable("Exception during creating background thread", e10), uVar);
        }
    }

    public void sendVastSpecError(w wVar) {
        e.d("VastRequest", "sendVastSpecError - %s", wVar);
        try {
            if (this.f60531d != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("params_error_code", wVar.getCode());
                fireErrorUrls(this.f60531d.getErrorUrlList(), bundle);
            }
        } catch (Exception e10) {
            e.e("VastRequest", e10);
        }
    }

    public synchronized void setVastVideoLoadedListener(z zVar) {
        this.f60535h = zVar;
    }

    public boolean shouldPreloadCompanion() {
        return this.f60546s;
    }

    public boolean shouldUseScreenSizeForCompanionOrientation() {
        return this.f60545r;
    }

    public boolean shouldUseScreenSizeForVideoOrientation() {
        return this.f60544q;
    }

    public void display(Context context, b0 b0Var, b bVar, VastView vastView, f fVar, sm.b bVar2) {
        e.d("VastRequest", "display", new Object[0]);
        this.f60552y.set(true);
        if (this.f60531d == null) {
            qm.b bVarInternal = qm.b.internal("VastAd is null during display VastActivity");
            e.d("VastRequest", "sendShowFailed - %s", bVarInternal);
            h0.onUiThread(new n(this, bVar, bVarInternal));
            return;
        }
        this.f60532e = b0Var;
        this.f60542o = context.getResources().getConfiguration().orientation;
        qm.b bVarDisplay = new VastActivity.a().setRequest(this).setListener(bVar).setVastView(vastView).setPlaybackListener(fVar).setAdMeasurer(this.f60536i).setPostBannerAdMeasurer(bVar2).display(context);
        if (bVarDisplay != null) {
            e.d("VastRequest", "sendShowFailed - %s", bVarDisplay);
            h0.onUiThread(new n(this, bVar, bVarDisplay));
        }
    }

    public void display(VastView vastView) {
        this.f60552y.set(true);
        if (this.f60531d == null) {
            qm.b bVarInternal = qm.b.internal("VastAd is null during display VastView");
            a0 listener = vastView.getListener();
            e.d("VastRequest", "sendShowFailed - %s", bVarInternal);
            h0.onUiThread(new o(this, listener, vastView, bVarInternal));
            return;
        }
        this.f60532e = b0.f60481b;
        v.store(this);
        vastView.display(this, Boolean.FALSE);
    }
}
