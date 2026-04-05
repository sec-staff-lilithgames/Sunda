package c4;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements g, rr.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11796b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f11797c;

    public /* synthetic */ d(View view, int i10) {
        this.f11796b = i10;
        this.f11797c = view;
    }

    @Override // rr.b
    public Object get() {
        switch (this.f11796b) {
            case 1:
                return String.format("Start tracking - %s", this.f11797c);
            default:
                return String.format("Stop tracking - %s", this.f11797c);
        }
    }

    @Override // c4.g
    public boolean onCommitContent(l lVar, int i10, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                lVar.requestPermission();
                Parcelable parcelable = (Parcelable) lVar.unwrap();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        return z1.performReceiveContent(this.f11797c, new x3.g(new ClipData(lVar.getDescription(), new ClipData.Item(lVar.getContentUri())), 2).setLinkUri(lVar.getLinkUri()).setExtras(bundle).build()) == null;
    }
}
