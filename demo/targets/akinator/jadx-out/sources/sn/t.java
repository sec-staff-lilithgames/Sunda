package sn;

import android.app.ApplicationExitInfo;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.os.SystemClock;
import android.text.PrecomputedText;
import android.util.Base64;
import android.view.ContentInfo;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.digidust.elokence.akinator.activities.rarecharacter.OptionRareCharacterActivity;
import gn.z0;
import io.odeeo.internal.x.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import md.d0;
import v6.b0;
import x3.a2;
import x3.g1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class t implements u, ko.e0, t5.b, AppLovinSdk.SdkInitializationListener, g.a, t.a, z9.b, vd.n, w3.k, we.g, wn.b, x3.p, x3.o, rr.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f86043b;

    public /* synthetic */ t(int i10) {
        this.f86043b = i10;
    }

    public static /* bridge */ /* synthetic */ ApplicationExitInfo b(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* bridge */ /* synthetic */ ImageDecoder.Source c(Object obj) {
        return (ImageDecoder.Source) obj;
    }

    public static /* bridge */ /* synthetic */ ContentInfo d(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* bridge */ /* synthetic */ boolean f(Object obj) {
        return obj instanceof PrecomputedText;
    }

    @Override // t.a, jd.j
    public Object apply(Object obj) {
        ArrayList arrayList = null;
        switch (this.f86043b) {
            case 7:
                List list = (List) obj;
                b0.a aVar = v6.b0.f89052z;
                if (list != null) {
                    List list2 = list;
                    arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((b0.c) it.next()).toWorkInfo());
                    }
                }
                return arrayList;
            case 8:
            default:
                Cursor cursor = (Cursor) obj;
                ArrayList arrayList2 = new ArrayList();
                while (cursor.moveToNext()) {
                    d0.a priority = md.d0.builder().setBackendName(cursor.getString(1)).setPriority(yd.a.valueOf(cursor.getInt(2)));
                    String string = cursor.getString(3);
                    arrayList2.add(priority.setExtras(string == null ? null : Base64.decode(string, 0)).build());
                }
                return arrayList2;
            case 9:
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
        }
    }

    @Override // x3.p
    public void calculateFlingVelocityThresholds(Context context, int[] iArr, MotionEvent motionEvent, int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = a2.getScaledMinimumFlingVelocity(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
        iArr[1] = a2.getScaledMaximumFlingVelocity(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
    }

    @Override // ko.e0
    /* renamed from: createExtractors */
    public ko.z[] mo3833createExtractors() {
        return new ko.z[]{new sp.a()};
    }

    @Override // wn.b
    public Bitmap decode(byte[] bArr, int i10) throws wn.g {
        try {
            return ln.c.decode(bArr, i10, null, -1);
        } catch (z0 e10) {
            throw new wn.g("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i10 + ")", e10);
        } catch (IOException e11) {
            throw new wn.g(e11);
        }
    }

    @Override // io.odeeo.internal.x.g.a
    public boolean evaluate(int i10, int i11, int i12, int i13, int i14) {
        switch (this.f86043b) {
            case 4:
                return io.odeeo.internal.m.d.a(i10, i11, i12, i13, i14);
            default:
                return false;
        }
    }

    @Override // rr.b
    public Object get() {
        switch (this.f86043b) {
            case 25:
                return "BackgroundSource don't found. Can't create Color";
            case 26:
                return "ColorSource don't found. Can't create Gradient";
            case 27:
                return "ColorSource don't found. Set one of: color, gradient";
            case 28:
                return "Failed to parse all colors. Check if colors are specified correctly.";
            default:
                return "Not all colors were parsed, check if the colors are specified correctly";
        }
    }

    @Override // x3.o
    public float getCurrentVelocity(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
        g1.addMovement(velocityTracker, motionEvent);
        g1.computeCurrentVelocity(velocityTracker, 1000);
        return g1.getAxisVelocity(velocityTracker, i10);
    }

    @Override // t5.b
    public long getMillis() {
        int i10 = t5.a.f86327l;
        return SystemClock.uptimeMillis();
    }

    @Override // z9.b
    public void onInappDetailsUpdate(boolean z10) {
        int i10 = OptionRareCharacterActivity.N;
        z9.e.getInstance().requestAllPurchases(null);
    }

    @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
    public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
        ca.k.getInstance().initApplovinAdPlacements();
    }

    @Override // w3.k
    public boolean test(Object obj) {
        return Objects.isNull(obj);
    }

    @Override // sn.u
    public void release() {
    }
}
