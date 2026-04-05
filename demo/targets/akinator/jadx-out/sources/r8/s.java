package r8;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f84039a;

    /* renamed from: b, reason: collision with root package name */
    public final int f84040b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f84041c;

    /* renamed from: d, reason: collision with root package name */
    public final int f84042d;

    public s(p pVar) {
        Context context = pVar.f84030a;
        q qVar = pVar.f84032c;
        this.f84041c = context;
        ActivityManager activityManager = pVar.f84031b;
        int i10 = activityManager.isLowRamDevice() ? pVar.f84037h / 2 : pVar.f84037h;
        this.f84042d = i10;
        int iRound = Math.round(activityManager.getMemoryClass() * ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES * (activityManager.isLowRamDevice() ? pVar.f84036g : pVar.f84035f));
        float heightPixels = qVar.getHeightPixels() * qVar.getWidthPixels() * 4;
        int iRound2 = Math.round(pVar.f84034e * heightPixels);
        int iRound3 = Math.round(heightPixels * pVar.f84033d);
        int i11 = iRound - i10;
        int i12 = iRound3 + iRound2;
        if (i12 <= i11) {
            this.f84040b = iRound3;
            this.f84039a = iRound2;
        } else {
            float f10 = i11;
            float f11 = pVar.f84034e;
            float f12 = pVar.f84033d;
            float f13 = f10 / (f11 + f12);
            this.f84040b = Math.round(f12 * f13);
            this.f84039a = Math.round(f13 * pVar.f84034e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb2 = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb2.append(Formatter.formatFileSize(context, this.f84040b));
            sb2.append(", pool size: ");
            sb2.append(Formatter.formatFileSize(context, this.f84039a));
            sb2.append(", byte array size: ");
            sb2.append(Formatter.formatFileSize(context, i10));
            sb2.append(", memory class limited? ");
            sb2.append(i12 > iRound);
            sb2.append(", max size: ");
            sb2.append(Formatter.formatFileSize(context, iRound));
            sb2.append(", memoryClass: ");
            sb2.append(activityManager.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb2.toString());
        }
    }

    public int getArrayPoolSizeInBytes() {
        return this.f84042d;
    }

    public int getBitmapPoolSize() {
        return this.f84039a;
    }

    public int getMemoryCacheSize() {
        return this.f84040b;
    }
}
