package io.bidmachine.iab.vast.processor;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import io.bidmachine.iab.vast.a;
import io.bidmachine.iab.vast.t;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import um.h0;
import wm.c;
import ym.d;
import ym.e;
import ym.g;
import ym.m;
import ym.n;
import ym.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class VastAd implements Parcelable {
    public static final Parcelable.Creator<VastAd> CREATOR = new c();

    /* renamed from: b, reason: collision with root package name */
    public final m f60512b;

    /* renamed from: c, reason: collision with root package name */
    public final n f60513c;

    /* renamed from: e, reason: collision with root package name */
    public t f60514e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f60515f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f60516g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f60517h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f60518i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f60519j;

    /* renamed from: k, reason: collision with root package name */
    public EnumMap f60520k;

    /* renamed from: l, reason: collision with root package name */
    public e f60521l;

    /* renamed from: m, reason: collision with root package name */
    public List f60522m = new ArrayList();

    public VastAd(m mVar, n nVar) {
        this.f60512b = mVar;
        this.f60513c = nVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdParameters() {
        return this.f60512b.getAdParameters();
    }

    public List<d> getAdVerificationsExtensionList() {
        return this.f60522m;
    }

    public e getAppodealExtension() {
        return this.f60521l;
    }

    public g getBanner(Context context) {
        ArrayList arrayList = this.f60515f;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = this.f60515f.iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                int width = gVar.getWidth();
                int height = gVar.getHeight();
                if (width > -1 && height > -1 && ((h0.isTablet(context) && width == 728 && height == 90) || (!h0.isTablet(context) && width == 320 && height == 50))) {
                    return gVar;
                }
            }
        }
        return null;
    }

    public String getClickThroughUrl() {
        w videoClicksTag = this.f60512b.getVideoClicksTag();
        if (videoClicksTag != null) {
            return videoClicksTag.getClickThroughUrl();
        }
        return null;
    }

    public List<String> getClickTrackingUrlList() {
        return this.f60518i;
    }

    public g getCompanion(int i10, int i11) {
        ArrayList arrayList = this.f60515f;
        if (arrayList != null && !arrayList.isEmpty()) {
            HashMap map = new HashMap();
            Iterator it = this.f60515f.iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                int width = gVar.getWidth();
                int height = gVar.getHeight();
                if (width > -1 && height > -1) {
                    float fMax = Math.max(width, height) / Math.min(width, height);
                    if (Math.min(width, height) >= 250 && fMax <= 2.5d && gVar.hasCreative()) {
                        map.put(Float.valueOf(width / height), gVar);
                    }
                }
            }
            if (!map.isEmpty()) {
                float f10 = i10 / i11;
                Set setKeySet = map.keySet();
                float fFloatValue = ((Float) setKeySet.iterator().next()).floatValue();
                Iterator it2 = setKeySet.iterator();
                while (it2.hasNext()) {
                    float fFloatValue2 = ((Float) it2.next()).floatValue();
                    if (Math.abs(fFloatValue - f10) > Math.abs(fFloatValue2 - f10)) {
                        fFloatValue = fFloatValue2;
                    }
                }
                return (g) map.get(Float.valueOf(fFloatValue));
            }
            t tVar = this.f60514e;
            if (tVar != null) {
                tVar.sendVastSpecError(io.bidmachine.iab.vast.w.f60563k);
            }
        }
        return null;
    }

    public Float getDurationSec() {
        return this.f60512b.getDurationSec();
    }

    public List<String> getErrorUrlList() {
        return this.f60517h;
    }

    public List<String> getImpressionUrlList() {
        return this.f60516g;
    }

    public n getPickedMediaFileTag() {
        return this.f60513c;
    }

    public int getSkipOffsetSec() {
        return this.f60512b.getSkipOffsetSec();
    }

    public Map<a, List<String>> getTrackingEventListMap() {
        return this.f60520k;
    }

    public ArrayList<String> getWrapperCompanionClickTrackingUrlList() {
        return this.f60519j;
    }

    public void setAdVerificationsExtensionList(List<d> list) {
        this.f60522m = list;
    }

    public void setVastRequest(t tVar) {
        this.f60514e = tVar;
    }

    public void setWrapperCompanionClickTrackingUrlList(ArrayList<String> arrayList) {
        this.f60519j = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeSerializable(this.f60512b);
        parcel.writeSerializable(this.f60513c);
        parcel.writeSerializable(this.f60515f);
        parcel.writeStringList(this.f60516g);
        parcel.writeStringList(this.f60517h);
        parcel.writeStringList(this.f60518i);
        parcel.writeStringList(this.f60519j);
        parcel.writeSerializable(this.f60520k);
        parcel.writeSerializable(this.f60521l);
        parcel.writeList(this.f60522m);
    }

    public VastAd(Parcel parcel) {
        this.f60512b = (m) parcel.readSerializable();
        this.f60513c = (n) parcel.readSerializable();
        this.f60515f = (ArrayList) parcel.readSerializable();
        this.f60516g = parcel.createStringArrayList();
        this.f60517h = parcel.createStringArrayList();
        this.f60518i = parcel.createStringArrayList();
        this.f60519j = parcel.createStringArrayList();
        this.f60520k = (EnumMap) parcel.readSerializable();
        this.f60521l = (e) parcel.readSerializable();
        parcel.readList(this.f60522m, d.class.getClassLoader());
    }
}
