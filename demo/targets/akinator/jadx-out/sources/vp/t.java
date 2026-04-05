package vp;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import io.bidmachine.ImageData;
import io.bidmachine.LabelData;
import io.bidmachine.PrivacySheetData;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class t implements o {

    /* renamed from: b, reason: collision with root package name */
    public String f89546b;

    /* renamed from: c, reason: collision with root package name */
    public String f89547c;

    /* renamed from: e, reason: collision with root package name */
    public String f89548e;

    /* renamed from: g, reason: collision with root package name */
    public ImageData f89550g;

    /* renamed from: h, reason: collision with root package name */
    public ImageData f89551h;

    /* renamed from: i, reason: collision with root package name */
    public String f89552i;

    /* renamed from: j, reason: collision with root package name */
    public String f89553j;

    /* renamed from: k, reason: collision with root package name */
    public String f89554k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f89555l;

    /* renamed from: n, reason: collision with root package name */
    public LabelData f89557n;

    /* renamed from: o, reason: collision with root package name */
    public PrivacySheetData f89558o;

    /* renamed from: f, reason: collision with root package name */
    public float f89549f = -1.0f;

    /* renamed from: m, reason: collision with root package name */
    public boolean f89556m = true;

    public ViewGroup configureContainer(Context context) {
        return null;
    }

    public View createCustomMediaView(Context context) {
        return null;
    }

    public View createProviderView(Context context) {
        if (this.f89557n == null && this.f89558o == null) {
            return null;
        }
        yp.m mVar = new yp.m(context);
        mVar.bindNativeData(this);
        mVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return mVar;
    }

    @Override // vp.o
    public LabelData getAdLabelData() {
        return this.f89557n;
    }

    @Override // vp.o, vp.u
    public String getCallToAction() {
        return this.f89548e;
    }

    @Override // vp.o
    public String getClickUrl() {
        return this.f89552i;
    }

    @Override // vp.o, vp.u
    public String getDescription() {
        return this.f89547c;
    }

    @Override // vp.o, vp.u
    public ImageData getIcon() {
        return this.f89550g;
    }

    @Override // vp.o, vp.u
    public ImageData getMainImage() {
        return this.f89551h;
    }

    @Override // vp.o
    public PrivacySheetData getPrivacySheetData() {
        return this.f89558o;
    }

    @Override // vp.o, vp.u
    public float getRating() {
        return this.f89549f;
    }

    @Override // vp.o, vp.u
    public String getTitle() {
        return this.f89546b;
    }

    @Override // vp.o
    public String getVideoAdm() {
        return this.f89554k;
    }

    @Override // vp.o
    public String getVideoUrl() {
        return this.f89553j;
    }

    @Override // vp.o, vp.u
    public boolean hasVideo() {
        return this.f89555l;
    }

    public boolean isNetworkControlLoadingAssets() {
        return this.f89556m;
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(getTitle()) || TextUtils.isEmpty(getDescription()) || TextUtils.isEmpty(getCallToAction())) ? false : true;
    }

    public t setAdLabelData(LabelData labelData) {
        this.f89557n = labelData;
        return this;
    }

    public t setCallToAction(String str) {
        this.f89548e = str;
        return this;
    }

    public t setClickUrl(String str) {
        this.f89552i = str;
        return this;
    }

    public t setDescription(String str) {
        this.f89547c = str;
        return this;
    }

    public t setHasVideo(boolean z10) {
        this.f89555l = z10;
        return this;
    }

    public t setIcon(ImageData imageData) {
        this.f89550g = imageData;
        return this;
    }

    public t setMainImage(ImageData imageData) {
        this.f89551h = imageData;
        return this;
    }

    public t setNetworkControlLoadingAssets(boolean z10) {
        this.f89556m = z10;
        return this;
    }

    public t setPrivacySheetData(PrivacySheetData privacySheetData) {
        this.f89558o = privacySheetData;
        return this;
    }

    public t setRating(float f10) {
        this.f89549f = f10;
        return this;
    }

    public t setTitle(String str) {
        this.f89546b = str;
        return this;
    }

    public t setVideoAdm(String str) {
        this.f89554k = str;
        return this;
    }

    public t setVideoUrl(String str) {
        this.f89553j = str;
        return this;
    }

    public void destroy() {
    }

    public void unregisterNative() {
    }

    public void registerNative(ViewGroup viewGroup, ImageView imageView, yp.n nVar, Set<View> set) {
    }
}
