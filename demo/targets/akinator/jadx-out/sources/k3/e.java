package k3;

import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e extends SharedElementCallback {

    /* renamed from: a, reason: collision with root package name */
    public final i1 f70162a;

    public e(i1 i1Var) {
        this.f70162a = i1Var;
    }

    @Override // android.app.SharedElementCallback
    public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
        return this.f70162a.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @Override // android.app.SharedElementCallback
    public View onCreateSnapshotView(Context context, Parcelable parcelable) {
        return this.f70162a.onCreateSnapshotView(context, parcelable);
    }

    @Override // android.app.SharedElementCallback
    public void onMapSharedElements(List<String> list, Map<String, View> map) {
        this.f70162a.onMapSharedElements(list, map);
    }

    @Override // android.app.SharedElementCallback
    public void onRejectSharedElements(List<View> list) {
        this.f70162a.onRejectSharedElements(list);
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
        this.f70162a.onSharedElementEnd(list, list2, list3);
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
        this.f70162a.onSharedElementStart(list, list2, list3);
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
        this.f70162a.onSharedElementsArrived(list, list2, new ha.a(onSharedElementsReadyListener, 14));
    }
}
